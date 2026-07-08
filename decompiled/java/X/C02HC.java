package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02HC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02HC extends Message<C02HC, C02OL> {
    public static final ProtoAdapter<C02HC> ADAPTER = new ProtoAdapter<C02HC>() { // from class: X.02Bz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02HC decode(ProtoReader protoReader) {
            C02HC c02hc = new C02HC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02hc.dark_icon_url = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02hc.light_icon_url = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02hc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02HC c02hc) {
            C02HC c02hc2 = c02hc;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02hc2.light_icon_url) + protoAdapter.encodedSizeWithTag(2, c02hc2.dark_icon_url) + c02hc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02HC c02hc) {
        }
    };
    public String dark_icon_url;
    public String light_icon_url;

    public C02HC() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02OL newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FR, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FR extends Message<C02FR, C02J6> {
    public static final ProtoAdapter<C02FR> ADAPTER = new ProtoAdapter<C02FR>() { // from class: X.028I
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FR decode(ProtoReader protoReader) {
            C02FR c02fr = new C02FR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02fr.user_avatar = C673002jw.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02fr.uid = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FR c02fr) {
            C02FR c02fr2 = c02fr;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c02fr2.uid) + C673002jw.ADAPTER.encodedSizeWithTag(2, c02fr2.user_avatar) + c02fr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02FR c02fr) {
            C02FR c02fr2 = c02fr;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c02fr2.uid);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 2, c02fr2.user_avatar);
            protoWriter.writeBytes(c02fr2.unknownFields());
        }
    };
    public Long uid;
    public C673002jw user_avatar;

    public C02FR() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02J6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02HD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02HD extends Message<C02HD, C586802Qo> {
    public static final ProtoAdapter<C02HD> ADAPTER = new ProtoAdapter<C02HD>() { // from class: X.02C0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02HD decode(ProtoReader protoReader) {
            C02HD c02hd = new C02HD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02hd.property_value = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02hd.property_name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02hd;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02HD c02hd) {
            C02HD c02hd2 = c02hd;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02hd2.property_name) + protoAdapter.encodedSizeWithTag(2, c02hd2.property_value) + c02hd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02HD c02hd) {
        }
    };
    public String property_name;
    public String property_value;

    public C02HD() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C586802Qo newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

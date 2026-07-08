package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02HB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02HB extends Message<C02HB, C02O8> {
    public static final ProtoAdapter<C02HB> ADAPTER = new ProtoAdapter<C02HB>() { // from class: X.02By
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02HB decode(ProtoReader protoReader) {
            C02HB c02hb = new C02HB();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02hb.prop_value = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02hb.prop_value_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02hb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02HB c02hb) {
            C02HB c02hb2 = c02hb;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02hb2.prop_value_id) + protoAdapter.encodedSizeWithTag(2, c02hb2.prop_value) + c02hb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02HB c02hb) {
        }
    };
    public String prop_value;
    public String prop_value_id;

    public C02HB() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02O8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

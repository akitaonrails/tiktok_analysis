package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02V6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02V6 extends Message<C02V6, C02V7> {
    public static final ProtoAdapter<C02V6> ADAPTER = new ProtoAdapter<C02V6>() { // from class: X.02V5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02V6 decode(ProtoReader protoReader) {
            C02V6 c02v6 = new C02V6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02v6.interaction_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02v6.disable_toast = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02v6.status = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02v6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02V6 c02v6) {
            C02V6 c02v62 = c02v6;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02v62.status);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02v62.disable_toast) + protoAdapter.encodedSizeWithTag(3, c02v62.interaction_text) + c02v62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02V6 c02v6) {
            C02V6 c02v62 = c02v6;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02v62.status);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c02v62.disable_toast);
            protoAdapter.encodeWithTag(protoWriter, 3, c02v62.interaction_text);
            protoWriter.writeBytes(c02v62.unknownFields());
        }
    };
    public String disable_toast;
    public String interaction_text;
    public Integer status;

    public C02V6() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02V7 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

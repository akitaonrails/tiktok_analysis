package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CB7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CB7 extends Message<C1CB7, C1CB8> {
    public static final ProtoAdapter<C1CB7> ADAPTER = new ProtoAdapter<C1CB7>() { // from class: X.1CB6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CB7 decode(ProtoReader protoReader) {
            C1CB7 c1cb7 = new C1CB7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c1cb7.instance_key = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1cb7.basic_voucher_id = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1cb7.basic_voucher_type_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1cb7.voucher_type_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cb7;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CB7 c1cb7) {
            C1CB7 c1cb72 = c1cb7;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1cb72.voucher_type_id) + protoAdapter.encodedSizeWithTag(2, c1cb72.basic_voucher_type_id) + protoAdapter.encodedSizeWithTag(3, c1cb72.basic_voucher_id) + protoAdapter.encodedSizeWithTag(4, c1cb72.instance_key) + c1cb72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1CB7 c1cb7) {
        }
    };
    public String basic_voucher_id;
    public String basic_voucher_type_id;
    public String instance_key;
    public String voucher_type_id;

    public C1CB7() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CB8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

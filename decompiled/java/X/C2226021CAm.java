package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CAm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226021CAm extends Message<C2226021CAm, C2226031CAn> {
    public static final ProtoAdapter<C2226021CAm> ADAPTER = new ProtoAdapter<C2226021CAm>() { // from class: X.1CAl
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226021CAm decode(ProtoReader protoReader) {
            C2226021CAm c2226021CAm = new C2226021CAm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c2226021CAm.schema = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2226021CAm.cache_key = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2226021CAm.purchase_rewards = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226021CAm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226021CAm c2226021CAm) {
            C2226021CAm c2226021CAm2 = c2226021CAm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2226021CAm2.purchase_rewards) + protoAdapter.encodedSizeWithTag(2, c2226021CAm2.cache_key) + protoAdapter.encodedSizeWithTag(3, c2226021CAm2.schema) + c2226021CAm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2226021CAm c2226021CAm) {
        }
    };
    public String cache_key;
    public String purchase_rewards;
    public String schema;

    public C2226021CAm() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2226031CAn newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

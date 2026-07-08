package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02WT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02WT extends Message<C02WT, C02WU> {
    public static final ProtoAdapter<C02WT> ADAPTER = new ProtoAdapter<C02WT>() { // from class: X.02WS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02WT decode(ProtoReader protoReader) {
            C02WT c02wt = new C02WT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02wt.da_info = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02wt.schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02wt.jump_action = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02wt;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02WT c02wt) {
            C02WT c02wt2 = c02wt;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02wt2.jump_action);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02wt2.schema) + protoAdapter.encodedSizeWithTag(3, c02wt2.da_info) + c02wt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02WT c02wt) {
        }
    };
    public String da_info;
    public Integer jump_action;
    public String schema;

    public C02WT() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02WU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

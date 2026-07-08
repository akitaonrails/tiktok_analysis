package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02eG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C637802eG extends Message<C637802eG, C637902eH> {
    public static final ProtoAdapter<C637802eG> ADAPTER = new ProtoAdapter<C637802eG>() { // from class: X.02eF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C637802eG decode(ProtoReader protoReader) {
            C637802eG c637802eG = new C637802eG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c637802eG.business_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c637802eG.component_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c637802eG;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C637802eG c637802eG) {
            C637802eG c637802eG2 = c637802eG;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c637802eG2.component_key) + protoAdapter.encodedSizeWithTag(2, c637802eG2.business_id) + c637802eG2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C637802eG c637802eG) {
            C637802eG c637802eG2 = c637802eG;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c637802eG2.component_key);
            protoAdapter.encodeWithTag(protoWriter, 2, c637802eG2.business_id);
            protoWriter.writeBytes(c637802eG2.unknownFields());
        }
    };
    public String business_id;
    public String component_key;

    public C637802eG() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C637902eH newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

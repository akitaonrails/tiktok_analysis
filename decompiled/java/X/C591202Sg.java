package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Sg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C591202Sg extends Message<C591202Sg, C591302Sh> {
    public static final ProtoAdapter<C591202Sg> ADAPTER = new ProtoAdapter<C591202Sg>() { // from class: X.02Sf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C591202Sg decode(ProtoReader protoReader) {
            C591202Sg c591202Sg = new C591202Sg();
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
                                    c591202Sg.change_type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c591202Sg.event_name = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c591202Sg.server_issued_params = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c591202Sg.fetch_api_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c591202Sg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C591202Sg c591202Sg) {
            C591202Sg c591202Sg2 = c591202Sg;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c591202Sg2.fetch_api_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c591202Sg2.server_issued_params) + protoAdapter2.encodedSizeWithTag(3, c591202Sg2.event_name) + protoAdapter.encodedSizeWithTag(4, c591202Sg2.change_type) + c591202Sg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C591202Sg c591202Sg) {
        }
    };
    public Integer change_type;
    public String event_name;
    public Integer fetch_api_type;
    public String server_issued_params;

    public C591202Sg() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C591302Sh newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

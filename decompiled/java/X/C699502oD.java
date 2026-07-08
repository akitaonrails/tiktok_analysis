package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02oD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C699502oD extends Message<C699502oD, C699602oE> {
    public static final ProtoAdapter<C699502oD> ADAPTER = new ProtoAdapter<C699502oD>() { // from class: X.02oC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C699502oD decode(ProtoReader protoReader) {
            C699502oD c699502oD = new C699502oD();
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
                                    c699502oD.end_timestamp = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c699502oD.server_timestamp = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c699502oD.end_time = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c699502oD.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c699502oD;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C699502oD c699502oD) {
            C699502oD c699502oD2 = c699502oD;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c699502oD2.text) + ProtoAdapter.INT64.encodedSizeWithTag(2, c699502oD2.end_time) + protoAdapter.encodedSizeWithTag(3, c699502oD2.server_timestamp) + protoAdapter.encodedSizeWithTag(4, c699502oD2.end_timestamp) + c699502oD2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C699502oD c699502oD) {
        }
    };
    public Long end_time;
    public String end_timestamp;
    public String server_timestamp;
    public String text;

    public C699502oD() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C699602oE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251551DAr extends Message<C2251551DAr, C2251561DAs> {
    public static final ProtoAdapter<C2251551DAr> ADAPTER = new ProtoAdapter<C2251551DAr>() { // from class: X.1DAq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251551DAr decode(ProtoReader protoReader) {
            C2251551DAr c2251551DAr = new C2251551DAr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2251551DAr.user_task_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2251551DAr.parent_task_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2251551DAr.user_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2251551DAr.room_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2251551DAr.task_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c2251551DAr.start_time = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2251551DAr.end_time = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c2251551DAr.task_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2251551DAr.task_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251551DAr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251551DAr c2251551DAr) {
            C2251551DAr c2251551DAr2 = c2251551DAr;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2251551DAr2.user_task_id) + protoAdapter.encodedSizeWithTag(2, c2251551DAr2.parent_task_id) + protoAdapter.encodedSizeWithTag(3, c2251551DAr2.user_id) + protoAdapter.encodedSizeWithTag(4, c2251551DAr2.room_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, c2251551DAr2.task_status) + protoAdapter.encodedSizeWithTag(6, c2251551DAr2.start_time) + protoAdapter.encodedSizeWithTag(7, c2251551DAr2.end_time) + protoAdapter.encodedSizeWithTag(8, c2251551DAr2.task_desc) + protoAdapter2.encodedSizeWithTag(9, c2251551DAr2.task_type) + c2251551DAr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2251551DAr c2251551DAr) {
        }
    };
    public String end_time;
    public String parent_task_id;
    public String room_id;
    public String start_time;
    public String task_desc;
    public Integer task_status;
    public Integer task_type;
    public String user_id;
    public String user_task_id;

    public C2251551DAr() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2251561DAs newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

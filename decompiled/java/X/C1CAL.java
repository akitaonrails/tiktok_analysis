package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CAL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CAL extends Message<C1CAL, C1CAM> {
    public static final ProtoAdapter<C1CAL> ADAPTER = new ProtoAdapter<C1CAL>() { // from class: X.1CAK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CAL decode(ProtoReader protoReader) {
            C1CAL c1cal = new C1CAL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1cal.reinstall_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c1cal.forced_login_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c1cal.installation_info = C1C2Q.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c1cal.login_history_info = C1517880pbO.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c1cal.nuj_event_tracking = C755002xA.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c1cal.impr_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c1cal.impr_count_per_session = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cal;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CAL c1cal) {
            C1CAL c1cal2 = c1cal;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c1cal2.reinstall_status) + protoAdapter.encodedSizeWithTag(2, c1cal2.forced_login_status) + C1C2Q.ADAPTER.encodedSizeWithTag(3, c1cal2.installation_info) + C1517880pbO.ADAPTER.encodedSizeWithTag(4, c1cal2.login_history_info) + C755002xA.ADAPTER.encodedSizeWithTag(5, c1cal2.nuj_event_tracking) + protoAdapter.encodedSizeWithTag(6, c1cal2.impr_count) + protoAdapter.encodedSizeWithTag(7, c1cal2.impr_count_per_session) + c1cal2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CAL c1cal) {
            C1CAL c1cal2 = c1cal;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cal2.reinstall_status);
            protoAdapter.encodeWithTag(protoWriter, 2, c1cal2.forced_login_status);
            C1C2Q.ADAPTER.encodeWithTag(protoWriter, 3, c1cal2.installation_info);
            C1517880pbO.ADAPTER.encodeWithTag(protoWriter, 4, c1cal2.login_history_info);
            C755002xA.ADAPTER.encodeWithTag(protoWriter, 5, c1cal2.nuj_event_tracking);
            protoAdapter.encodeWithTag(protoWriter, 6, c1cal2.impr_count);
            protoAdapter.encodeWithTag(protoWriter, 7, c1cal2.impr_count_per_session);
            protoWriter.writeBytes(c1cal2.unknownFields());
        }
    };
    public Integer forced_login_status;
    public Integer impr_count;
    public Integer impr_count_per_session;
    public C1C2Q installation_info;
    public C1517880pbO login_history_info;
    public C755002xA nuj_event_tracking;
    public Integer reinstall_status;

    @Override // com.squareup.wire.Message
    public C1CAM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C1CAL(Integer num, Integer num2, C1C2Q c1c2q, C1517880pbO c1517880pbO, C755002xA c755002xA, Integer num3, Integer num4) {
        this(num, num2, c1c2q, c1517880pbO, c755002xA, num3, num4, ByteString.EMPTY);
    }

    public C1CAL(Integer num, Integer num2, C1C2Q c1c2q, C1517880pbO c1517880pbO, C755002xA c755002xA, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.reinstall_status = num;
        this.forced_login_status = num2;
        this.installation_info = c1c2q;
        this.login_history_info = c1517880pbO;
        this.nuj_event_tracking = c755002xA;
        this.impr_count = num3;
        this.impr_count_per_session = num4;
    }
}

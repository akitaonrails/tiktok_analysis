package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DC8, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DC8 extends Message<C1DC8, C1DC6> {
    public static final ProtoAdapter<C1DC8> ADAPTER = new ProtoAdapter<C1DC8>() { // from class: X.1DC7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DC8 decode(ProtoReader protoReader) {
            C1DC6 c1dc6 = new C1DC6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1dc6.LIZLLL = C1DCI.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c1dc6.LJ = C1DCB.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c1dc6.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1dc6.LJI = C1D9U.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c1dc6.LJII = C1517400pac.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c1dc6.LJIIIIZZ.add(C2224141C3g.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c1dc6.LJIIIZ = C1517730pb9.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1dc6.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dc6.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DC8 c1dc8) {
            C1DC8 c1dc82 = c1dc8;
            return C1DCI.ADAPTER.encodedSizeWithTag(1, c1dc82.device_info) + C1DCB.ADAPTER.encodedSizeWithTag(2, c1dc82.consumption_data) + ProtoAdapter.STRING.encodedSizeWithTag(3, c1dc82.pitaya_info) + C1D9U.ADAPTER.encodedSizeWithTag(4, c1dc82.query_info) + C1517400pac.ADAPTER.encodedSizeWithTag(5, c1dc82.search_signal) + C2224141C3g.ADAPTER.asRepeated().encodedSizeWithTag(6, c1dc82.rec_sys_signals) + C1517730pb9.ADAPTER.encodedSizeWithTag(7, c1dc82.publish_signal) + c1dc82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1DC8 c1dc8) {
            C1DC8 c1dc82 = c1dc8;
            C1DCI.ADAPTER.encodeWithTag(protoWriter, 1, c1dc82.device_info);
            C1DCB.ADAPTER.encodeWithTag(protoWriter, 2, c1dc82.consumption_data);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c1dc82.pitaya_info);
            C1D9U.ADAPTER.encodeWithTag(protoWriter, 4, c1dc82.query_info);
            C1517400pac.ADAPTER.encodeWithTag(protoWriter, 5, c1dc82.search_signal);
            C2224141C3g.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, c1dc82.rec_sys_signals);
            C1517730pb9.ADAPTER.encodeWithTag(protoWriter, 7, c1dc82.publish_signal);
            protoWriter.writeBytes(c1dc82.unknownFields());
        }
    };
    public C1DCB consumption_data;
    public C1DCI device_info;
    public String pitaya_info;
    public C1517730pb9 publish_signal;
    public C1D9U query_info;
    public List<C2224141C3g> rec_sys_signals;
    public C1517400pac search_signal;

    @Override // com.squareup.wire.Message
    public C1DC6 newBuilder() {
        return null;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C1DCI c1dci = this.device_info;
        int iHashCode2 = (iHashCode + (c1dci != null ? c1dci.hashCode() : 0)) * 37;
        C1DCB c1dcb = this.consumption_data;
        int iHashCode3 = (iHashCode2 + (c1dcb != null ? c1dcb.hashCode() : 0)) * 37;
        String str = this.pitaya_info;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        C1D9U c1d9u = this.query_info;
        int iHashCode5 = (iHashCode4 + (c1d9u != null ? c1d9u.hashCode() : 0)) * 37;
        C1517400pac c1517400pac = this.search_signal;
        int iHashCode6 = (((iHashCode5 + (c1517400pac != null ? c1517400pac.hashCode() : 0)) * 37) + this.rec_sys_signals.hashCode()) * 37;
        C1517730pb9 c1517730pb9 = this.publish_signal;
        int iHashCode7 = iHashCode6 + (c1517730pb9 != null ? c1517730pb9.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    public C1DC8(C1DCI c1dci, C1DCB c1dcb, String str, C1D9U c1d9u, C1517400pac c1517400pac, List<C2224141C3g> list, C1517730pb9 c1517730pb9) {
        this(c1dci, c1dcb, str, c1d9u, c1517400pac, list, c1517730pb9, ByteString.EMPTY);
    }

    public C1DC8(C1DCI c1dci, C1DCB c1dcb, String str, C1D9U c1d9u, C1517400pac c1517400pac, List<C2224141C3g> list, C1517730pb9 c1517730pb9, ByteString byteString) {
        super(ADAPTER, byteString);
        this.device_info = c1dci;
        this.consumption_data = c1dcb;
        this.pitaya_info = str;
        this.query_info = c1d9u;
        this.search_signal = c1517400pac;
        this.rec_sys_signals = C1516540pZE.LJFF("rec_sys_signals", list);
        this.publish_signal = c1517730pb9;
    }
}

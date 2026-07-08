package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02TX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02TX extends Message<C02TX, C02TZ> {
    public static final ProtoAdapter<C02TX> ADAPTER = new ProtoAdapter<C02TX>() { // from class: X.02TW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02TX decode(ProtoReader protoReader) {
            C02TX c02tx = new C02TX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02tx.selling_point_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c02tx.selling_points.add(C02TV.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c02tx.start_to_show_time = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c02tx.stay_time = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c02tx.show_num = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c02tx.anim_duration = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c02tx.view_height = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02tx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02TX c02tx) {
            C02TX c02tx2 = c02tx;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c02tx2.selling_point_style) + C02TV.ADAPTER.asRepeated().encodedSizeWithTag(2, c02tx2.selling_points) + protoAdapter.encodedSizeWithTag(3, c02tx2.start_to_show_time) + protoAdapter.encodedSizeWithTag(4, c02tx2.stay_time) + protoAdapter.encodedSizeWithTag(5, c02tx2.show_num) + protoAdapter.encodedSizeWithTag(6, c02tx2.anim_duration) + protoAdapter.encodedSizeWithTag(7, c02tx2.view_height) + c02tx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02TX c02tx) {
        }
    };
    public Integer anim_duration;
    public Integer selling_point_style;
    public List<C02TV> selling_points;
    public Integer show_num;
    public Integer start_to_show_time;
    public Integer stay_time;
    public Integer view_height;

    public C02TX() {
        super(ADAPTER, ByteString.EMPTY);
        this.selling_points = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02TZ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

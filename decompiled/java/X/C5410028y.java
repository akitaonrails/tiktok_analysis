package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.028y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5410028y extends Message<C5410028y, C02LN> {
    public static final ProtoAdapter<C5410028y> ADAPTER = new ProtoAdapter<C5410028y>() { // from class: X.023f
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5410028y decode(ProtoReader protoReader) {
            C5410028y c5410028y = new C5410028y();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5410028y.share_rate = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case 2:
                            c5410028y.recall_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c5410028y.enable_show = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c5410028y.share_rec_extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5410028y.candidate_list.add(C02E7.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c5410028y.show_by_candidate_score = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5410028y;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5410028y c5410028y) {
            C5410028y c5410028y2 = c5410028y;
            int iEncodedSizeWithTag = ProtoAdapter.FLOAT.encodedSizeWithTag(1, c5410028y2.share_rate) + ProtoAdapter.INT32.encodedSizeWithTag(2, c5410028y2.recall_type) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c5410028y2.enable_show);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c5410028y2.share_rec_extra) + C02E7.ADAPTER.asRepeated().encodedSizeWithTag(5, c5410028y2.candidate_list) + protoAdapter.encodedSizeWithTag(6, c5410028y2.show_by_candidate_score) + c5410028y2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5410028y c5410028y) {
            C5410028y c5410028y2 = c5410028y;
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, c5410028y2.share_rate);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c5410028y2.recall_type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c5410028y2.enable_show);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 4, c5410028y2.share_rec_extra);
            C02E7.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, c5410028y2.candidate_list);
            protoAdapter.encodeWithTag(protoWriter, 6, c5410028y2.show_by_candidate_score);
            protoWriter.writeBytes(c5410028y2.unknownFields());
        }
    };
    public List<C02E7> candidate_list;
    public Boolean enable_show;
    public Integer recall_type;
    public Float share_rate;
    public String share_rec_extra;
    public String show_by_candidate_score;

    public C5410028y() {
        super(ADAPTER, ByteString.EMPTY);
        this.candidate_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02LN newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

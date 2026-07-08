package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.026f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5339026f extends Message<C5339026f, C02LA> {
    public static final ProtoAdapter<C5339026f> ADAPTER = new ProtoAdapter<C5339026f>() { // from class: X.023W
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5339026f decode(ProtoReader protoReader) {
            C5339026f c5339026f = new C5339026f();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5339026f.consistency_groups = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5339026f.final_gid_list.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            c5339026f.sort_gid_list.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            c5339026f.sati_gid_list.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            c5339026f.fyp_gid_list.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
                            c5339026f.client_gid_list.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 7:
                            c5339026f.consistency_user_extra_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c5339026f.consistency_req_extra_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5339026f.consistency_extra_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5339026f.c_rsp_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5339026f.rerank_reason_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5339026f;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5339026f c5339026f) {
            C5339026f c5339026f2 = c5339026f;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5339026f2.consistency_groups);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.asRepeated().encodedSizeWithTag(2, c5339026f2.final_gid_list) + protoAdapter2.asRepeated().encodedSizeWithTag(3, c5339026f2.sort_gid_list) + protoAdapter2.asRepeated().encodedSizeWithTag(4, c5339026f2.sati_gid_list) + protoAdapter2.asRepeated().encodedSizeWithTag(5, c5339026f2.fyp_gid_list) + protoAdapter2.asRepeated().encodedSizeWithTag(6, c5339026f2.client_gid_list) + protoAdapter.encodedSizeWithTag(7, c5339026f2.consistency_user_extra_info) + protoAdapter.encodedSizeWithTag(8, c5339026f2.consistency_req_extra_info) + protoAdapter.encodedSizeWithTag(9, c5339026f2.consistency_extra_info) + ProtoAdapter.INT32.encodedSizeWithTag(10, c5339026f2.c_rsp_type) + protoAdapter.asRepeated().encodedSizeWithTag(11, c5339026f2.rerank_reason_list) + c5339026f2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5339026f c5339026f) {
            C5339026f c5339026f2 = c5339026f;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c5339026f2.consistency_groups);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 2, c5339026f2.final_gid_list);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 3, c5339026f2.sort_gid_list);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, c5339026f2.sati_gid_list);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, c5339026f2.fyp_gid_list);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 6, c5339026f2.client_gid_list);
            protoAdapter.encodeWithTag(protoWriter, 7, c5339026f2.consistency_user_extra_info);
            protoAdapter.encodeWithTag(protoWriter, 8, c5339026f2.consistency_req_extra_info);
            protoAdapter.encodeWithTag(protoWriter, 9, c5339026f2.consistency_extra_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, c5339026f2.c_rsp_type);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 11, c5339026f2.rerank_reason_list);
            protoWriter.writeBytes(c5339026f2.unknownFields());
        }
    };
    public Integer c_rsp_type;
    public List<Long> client_gid_list;
    public String consistency_extra_info;
    public String consistency_groups;
    public String consistency_req_extra_info;
    public String consistency_user_extra_info;
    public List<Long> final_gid_list;
    public List<Long> fyp_gid_list;
    public List<String> rerank_reason_list;
    public List<Long> sati_gid_list;
    public List<Long> sort_gid_list;

    public C5339026f() {
        super(ADAPTER, ByteString.EMPTY);
        this.final_gid_list = C1516540pZE.LJIIIIZZ();
        this.sort_gid_list = C1516540pZE.LJIIIIZZ();
        this.sati_gid_list = C1516540pZE.LJIIIIZZ();
        this.fyp_gid_list = C1516540pZE.LJIIIIZZ();
        this.client_gid_list = C1516540pZE.LJIIIIZZ();
        this.rerank_reason_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02LA newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

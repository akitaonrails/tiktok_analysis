package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251131D9b extends Message<C2251131D9b, C760502y3> {
    public static final ProtoAdapter<C2251131D9b> ADAPTER = new ProtoAdapter<C2251131D9b>() { // from class: X.1D9a
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251131D9b decode(ProtoReader protoReader) {
            C2251131D9b c2251131D9b = new C2251131D9b();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2251131D9b.enable_client_adgap_adjust = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c2251131D9b.enable_fast_browse = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c2251131D9b.enable_showtime_gap = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c2251131D9b.downstream_range_end = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c2251131D9b.adgap_delta_by_time = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2251131D9b.use_fast_browse_model = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c2251131D9b.viewed_vid_num = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c2251131D9b.single_vid_view_time = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2251131D9b.fast_browse_time_threshold = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2251131D9b.min_gap = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251131D9b;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251131D9b c2251131D9b) {
            C2251131D9b c2251131D9b2 = c2251131D9b;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2251131D9b2.enable_client_adgap_adjust) + protoAdapter.encodedSizeWithTag(2, c2251131D9b2.enable_fast_browse) + protoAdapter.encodedSizeWithTag(3, c2251131D9b2.enable_showtime_gap);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c2251131D9b2.downstream_range_end) + ProtoAdapter.STRING.encodedSizeWithTag(5, c2251131D9b2.adgap_delta_by_time) + protoAdapter.encodedSizeWithTag(6, c2251131D9b2.use_fast_browse_model) + protoAdapter2.encodedSizeWithTag(7, c2251131D9b2.viewed_vid_num) + protoAdapter2.encodedSizeWithTag(8, c2251131D9b2.single_vid_view_time) + protoAdapter2.encodedSizeWithTag(9, c2251131D9b2.fast_browse_time_threshold) + protoAdapter2.encodedSizeWithTag(10, c2251131D9b2.min_gap) + c2251131D9b2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2251131D9b c2251131D9b) {
            C2251131D9b c2251131D9b2 = c2251131D9b;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c2251131D9b2.enable_client_adgap_adjust);
            protoAdapter.encodeWithTag(protoWriter, 2, c2251131D9b2.enable_fast_browse);
            protoAdapter.encodeWithTag(protoWriter, 3, c2251131D9b2.enable_showtime_gap);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 4, c2251131D9b2.downstream_range_end);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, c2251131D9b2.adgap_delta_by_time);
            protoAdapter.encodeWithTag(protoWriter, 6, c2251131D9b2.use_fast_browse_model);
            protoAdapter2.encodeWithTag(protoWriter, 7, c2251131D9b2.viewed_vid_num);
            protoAdapter2.encodeWithTag(protoWriter, 8, c2251131D9b2.single_vid_view_time);
            protoAdapter2.encodeWithTag(protoWriter, 9, c2251131D9b2.fast_browse_time_threshold);
            protoAdapter2.encodeWithTag(protoWriter, 10, c2251131D9b2.min_gap);
            protoWriter.writeBytes(c2251131D9b2.unknownFields());
        }
    };
    public String adgap_delta_by_time;
    public Integer downstream_range_end;
    public Boolean enable_client_adgap_adjust;
    public Boolean enable_fast_browse;
    public Boolean enable_showtime_gap;
    public Integer fast_browse_time_threshold;
    public Integer min_gap;
    public Integer single_vid_view_time;
    public Boolean use_fast_browse_model;
    public Integer viewed_vid_num;

    public C2251131D9b() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C760502y3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

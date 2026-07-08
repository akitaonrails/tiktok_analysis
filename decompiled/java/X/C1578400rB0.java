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

/* JADX INFO: renamed from: X.0rB0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578400rB0 extends Message<C1578400rB0, C1578430rB3> {
    public static final ProtoAdapter<C1578400rB0> ADAPTER = new ProtoAdapter<C1578400rB0>() { // from class: X.0rAy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1578400rB0 decode(ProtoReader protoReader) {
            C1578400rB0 c1578400rB0 = new C1578400rB0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1578400rB0.status_code = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c1578400rB0.status_msg = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c1578400rB0.has_more = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c1578400rB0.awemes.add(C5186020i.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c1578400rB0.log_pb = C1578530rBD.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c1578400rB0.skylight_model = C1578240rAk.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c1578400rB0.should_show_limited_free_pop = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c1578400rB0.limited_free_pop_up_config = C1577130r8x.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1578400rB0.drama_tab_block_reason = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1578400rB0.drama_tab_block_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c1578400rB0.feedback_link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1578400rB0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1578400rB0 c1578400rB0) {
            C1578400rB0 c1578400rB02 = c1578400rB0;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1578400rB02.status_code);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c1578400rB02.status_msg) + protoAdapter.encodedSizeWithTag(3, c1578400rB02.has_more) + C5186020i.ADAPTER.asRepeated().encodedSizeWithTag(4, c1578400rB02.awemes) + C1578530rBD.ADAPTER.encodedSizeWithTag(5, c1578400rB02.log_pb) + C1578240rAk.ADAPTER.encodedSizeWithTag(6, c1578400rB02.skylight_model) + ProtoAdapter.BOOL.encodedSizeWithTag(7, c1578400rB02.should_show_limited_free_pop) + C1577130r8x.ADAPTER.encodedSizeWithTag(8, c1578400rB02.limited_free_pop_up_config) + protoAdapter.encodedSizeWithTag(9, c1578400rB02.drama_tab_block_reason) + protoAdapter2.encodedSizeWithTag(10, c1578400rB02.drama_tab_block_text) + protoAdapter2.encodedSizeWithTag(11, c1578400rB02.feedback_link) + c1578400rB02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1578400rB0 c1578400rB0) {
            C1578400rB0 c1578400rB02 = c1578400rB0;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c1578400rB02.status_code);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c1578400rB02.status_msg);
            protoAdapter.encodeWithTag(protoWriter, 3, c1578400rB02.has_more);
            C5186020i.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c1578400rB02.awemes);
            C1578530rBD.ADAPTER.encodeWithTag(protoWriter, 5, c1578400rB02.log_pb);
            C1578240rAk.ADAPTER.encodeWithTag(protoWriter, 6, c1578400rB02.skylight_model);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, c1578400rB02.should_show_limited_free_pop);
            C1577130r8x.ADAPTER.encodeWithTag(protoWriter, 8, c1578400rB02.limited_free_pop_up_config);
            protoAdapter.encodeWithTag(protoWriter, 9, c1578400rB02.drama_tab_block_reason);
            protoAdapter2.encodeWithTag(protoWriter, 10, c1578400rB02.drama_tab_block_text);
            protoAdapter2.encodeWithTag(protoWriter, 11, c1578400rB02.feedback_link);
            protoWriter.writeBytes(c1578400rB02.unknownFields());
        }
    };
    public List<C5186020i> awemes;
    public Integer drama_tab_block_reason;
    public String drama_tab_block_text;
    public String feedback_link;
    public Integer has_more;
    public C1577130r8x limited_free_pop_up_config;
    public C1578530rBD log_pb;
    public Boolean should_show_limited_free_pop;
    public C1578240rAk skylight_model;
    public Integer status_code;
    public String status_msg;

    public C1578400rB0() {
        super(ADAPTER, ByteString.EMPTY);
        this.awemes = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1578430rB3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

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

/* JADX INFO: renamed from: X.0rB1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578410rB1 extends Message<C1578410rB1, C1578420rB2> {
    public static final ProtoAdapter<C1578410rB1> ADAPTER = new ProtoAdapter<C1578410rB1>() { // from class: X.0rAz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1578410rB1 decode(ProtoReader protoReader) {
            C1578410rB1 c1578410rB1 = new C1578410rB1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1578410rB1.status_code = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c1578410rB1.status_msg = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c1578410rB1.has_more = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c1578410rB1.awemes.add(C5186020i.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c1578410rB1.log_pb = C1578530rBD.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c1578410rB1.skylight_model = C1578240rAk.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c1578410rB1.should_show_limited_free_pop = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c1578410rB1.limited_free_pop_up_config = C1577130r8x.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1578410rB1.drama_tab_block_reason = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1578410rB1.skylight_model_v2 = C1578240rAk.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1578410rB1;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1578410rB1 c1578410rB1) {
            C1578410rB1 c1578410rB12 = c1578410rB1;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1578410rB12.status_code) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1578410rB12.status_msg) + protoAdapter.encodedSizeWithTag(3, c1578410rB12.has_more) + C5186020i.ADAPTER.asRepeated().encodedSizeWithTag(4, c1578410rB12.awemes) + C1578530rBD.ADAPTER.encodedSizeWithTag(5, c1578410rB12.log_pb);
            ProtoAdapter<C1578240rAk> protoAdapter2 = C1578240rAk.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(6, c1578410rB12.skylight_model) + ProtoAdapter.BOOL.encodedSizeWithTag(7, c1578410rB12.should_show_limited_free_pop) + C1577130r8x.ADAPTER.encodedSizeWithTag(8, c1578410rB12.limited_free_pop_up_config) + protoAdapter.encodedSizeWithTag(9, c1578410rB12.drama_tab_block_reason) + protoAdapter2.encodedSizeWithTag(10, c1578410rB12.skylight_model_v2) + c1578410rB12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1578410rB1 c1578410rB1) {
            C1578410rB1 c1578410rB12 = c1578410rB1;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c1578410rB12.status_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1578410rB12.status_msg);
            protoAdapter.encodeWithTag(protoWriter, 3, c1578410rB12.has_more);
            C5186020i.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c1578410rB12.awemes);
            C1578530rBD.ADAPTER.encodeWithTag(protoWriter, 5, c1578410rB12.log_pb);
            ProtoAdapter<C1578240rAk> protoAdapter2 = C1578240rAk.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 6, c1578410rB12.skylight_model);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, c1578410rB12.should_show_limited_free_pop);
            C1577130r8x.ADAPTER.encodeWithTag(protoWriter, 8, c1578410rB12.limited_free_pop_up_config);
            protoAdapter.encodeWithTag(protoWriter, 9, c1578410rB12.drama_tab_block_reason);
            protoAdapter2.encodeWithTag(protoWriter, 10, c1578410rB12.skylight_model_v2);
            protoWriter.writeBytes(c1578410rB12.unknownFields());
        }
    };
    public List<C5186020i> awemes;
    public Integer drama_tab_block_reason;
    public Integer has_more;
    public C1577130r8x limited_free_pop_up_config;
    public C1578530rBD log_pb;
    public Boolean should_show_limited_free_pop;
    public C1578240rAk skylight_model;
    public C1578240rAk skylight_model_v2;
    public Integer status_code;
    public String status_msg;

    public C1578410rB1() {
        super(ADAPTER, ByteString.EMPTY);
        this.awemes = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1578420rB2 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

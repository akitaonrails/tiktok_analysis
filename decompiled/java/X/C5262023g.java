package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.023g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5262023g extends Message<C5262023g, C573302Lj> {
    public static final ProtoAdapter<C5262023g> ADAPTER = new ProtoAdapter<C5262023g>() { // from class: X.0221
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5262023g decode(ProtoReader protoReader) {
            C5262023g c5262023g = new C5262023g();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5262023g.template_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c5262023g.biz_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c5262023g.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5262023g.icon = C545602As.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c5262023g.title = C553602Du.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c5262023g.desc_prefix = C553602Du.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c5262023g.separator = C553602Du.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5262023g.desc_suffix = C553602Du.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5262023g.tail_icon = C545602As.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5262023g.action = C02VI.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5262023g.display_strategy = C02EY.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5262023g.extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5262023g.tracer_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c5262023g.biz_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c5262023g.container = C555102Ej.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            c5262023g.desc_tail = C553602Du.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5262023g.title_prefix = C553602Du.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5262023g.title_separator = C553602Du.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5262023g;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5262023g c5262023g) {
            C5262023g c5262023g2 = c5262023g;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5262023g2.template_type) + protoAdapter.encodedSizeWithTag(2, c5262023g2.biz_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c5262023g2.name);
            ProtoAdapter<C545602As> protoAdapter3 = C545602As.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, c5262023g2.icon);
            ProtoAdapter<C553602Du> protoAdapter4 = C553602Du.ADAPTER;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(5, c5262023g2.title) + protoAdapter4.encodedSizeWithTag(6, c5262023g2.desc_prefix) + protoAdapter4.encodedSizeWithTag(7, c5262023g2.separator) + protoAdapter4.encodedSizeWithTag(8, c5262023g2.desc_suffix) + protoAdapter3.encodedSizeWithTag(9, c5262023g2.tail_icon) + C02VI.ADAPTER.encodedSizeWithTag(10, c5262023g2.action) + C02EY.ADAPTER.encodedSizeWithTag(11, c5262023g2.display_strategy) + protoAdapter2.encodedSizeWithTag(12, c5262023g2.extra) + protoAdapter2.encodedSizeWithTag(13, c5262023g2.tracer_info) + protoAdapter2.encodedSizeWithTag(14, c5262023g2.biz_id) + C555102Ej.ADAPTER.encodedSizeWithTag(15, c5262023g2.container) + protoAdapter4.encodedSizeWithTag(16, c5262023g2.desc_tail) + protoAdapter4.encodedSizeWithTag(17, c5262023g2.title_prefix) + protoAdapter4.encodedSizeWithTag(18, c5262023g2.title_separator) + c5262023g2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5262023g c5262023g) {
            C5262023g c5262023g2 = c5262023g;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c5262023g2.template_type);
            protoAdapter.encodeWithTag(protoWriter, 2, c5262023g2.biz_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, c5262023g2.name);
            ProtoAdapter<C545602As> protoAdapter3 = C545602As.ADAPTER;
            protoAdapter3.encodeWithTag(protoWriter, 4, c5262023g2.icon);
            ProtoAdapter<C553602Du> protoAdapter4 = C553602Du.ADAPTER;
            protoAdapter4.encodeWithTag(protoWriter, 5, c5262023g2.title);
            protoAdapter4.encodeWithTag(protoWriter, 6, c5262023g2.desc_prefix);
            protoAdapter4.encodeWithTag(protoWriter, 7, c5262023g2.separator);
            protoAdapter4.encodeWithTag(protoWriter, 8, c5262023g2.desc_suffix);
            protoAdapter3.encodeWithTag(protoWriter, 9, c5262023g2.tail_icon);
            C02VI.ADAPTER.encodeWithTag(protoWriter, 10, c5262023g2.action);
            C02EY.ADAPTER.encodeWithTag(protoWriter, 11, c5262023g2.display_strategy);
            protoAdapter2.encodeWithTag(protoWriter, 12, c5262023g2.extra);
            protoAdapter2.encodeWithTag(protoWriter, 13, c5262023g2.tracer_info);
            protoAdapter2.encodeWithTag(protoWriter, 14, c5262023g2.biz_id);
            C555102Ej.ADAPTER.encodeWithTag(protoWriter, 15, c5262023g2.container);
            protoAdapter4.encodeWithTag(protoWriter, 16, c5262023g2.desc_tail);
            protoAdapter4.encodeWithTag(protoWriter, 17, c5262023g2.title_prefix);
            protoAdapter4.encodeWithTag(protoWriter, 18, c5262023g2.title_separator);
            protoWriter.writeBytes(c5262023g2.unknownFields());
        }
    };
    public C02VI action;
    public String biz_id;
    public Integer biz_type;
    public C555102Ej container;
    public C553602Du desc_prefix;
    public C553602Du desc_suffix;
    public C553602Du desc_tail;
    public C02EY display_strategy;
    public String extra;
    public C545602As icon;
    public String name;
    public C553602Du separator;
    public C545602As tail_icon;
    public Integer template_type;
    public C553602Du title;
    public C553602Du title_prefix;
    public C553602Du title_separator;
    public String tracer_info;

    public C5262023g() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C573302Lj newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

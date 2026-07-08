package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.022F, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C022F extends Message<C022F, C02IU> {
    public static final ProtoAdapter<C022F> ADAPTER = new ProtoAdapter<C022F>() { // from class: X.021d
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C022F decode(ProtoReader protoReader) {
            C022F c022f = new C022F();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c022f.suffix = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c022f.sub_tags.add(C557802Fk.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c022f.sub_tag_exp_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c022f.sub_tag_exp_time = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c022f.has_sub_arrow = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c022f.track_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c022f.hide_list.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 8:
                            c022f.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c022f.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c022f.style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c022f.poi_anchor_button = C598102Ux.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c022f.anchor_exp_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c022f.anchor_exp_time = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            c022f.extra.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 15:
                            c022f.transaction_suffix = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c022f.biz_thumbnail = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c022f;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C022F c022f) {
            C022F c022f2 = c022f;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c022f2.suffix) + C557802Fk.ADAPTER.asRepeated().encodedSizeWithTag(2, c022f2.sub_tags);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c022f2.sub_tag_exp_type) + protoAdapter2.encodedSizeWithTag(4, c022f2.sub_tag_exp_time) + ProtoAdapter.BOOL.encodedSizeWithTag(5, c022f2.has_sub_arrow) + protoAdapter.encodedSizeWithTag(6, c022f2.track_info) + protoAdapter2.asRepeated().encodedSizeWithTag(7, c022f2.hide_list) + protoAdapter.encodedSizeWithTag(8, c022f2.schema) + protoAdapter.encodedSizeWithTag(9, c022f2.title) + protoAdapter2.encodedSizeWithTag(10, c022f2.style) + C598102Ux.ADAPTER.encodedSizeWithTag(11, c022f2.poi_anchor_button) + protoAdapter2.encodedSizeWithTag(12, c022f2.anchor_exp_type) + protoAdapter2.encodedSizeWithTag(13, c022f2.anchor_exp_time) + this.LIZ.encodedSizeWithTag(14, c022f2.extra) + protoAdapter.encodedSizeWithTag(15, c022f2.transaction_suffix) + C673002jw.ADAPTER.encodedSizeWithTag(16, c022f2.biz_thumbnail) + c022f2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C022F c022f) {
            C022F c022f2 = c022f;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c022f2.suffix);
            C557802Fk.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c022f2.sub_tags);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, c022f2.sub_tag_exp_type);
            protoAdapter2.encodeWithTag(protoWriter, 4, c022f2.sub_tag_exp_time);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, c022f2.has_sub_arrow);
            protoAdapter.encodeWithTag(protoWriter, 6, c022f2.track_info);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 7, c022f2.hide_list);
            protoAdapter.encodeWithTag(protoWriter, 8, c022f2.schema);
            protoAdapter.encodeWithTag(protoWriter, 9, c022f2.title);
            protoAdapter2.encodeWithTag(protoWriter, 10, c022f2.style);
            C598102Ux.ADAPTER.encodeWithTag(protoWriter, 11, c022f2.poi_anchor_button);
            protoAdapter2.encodeWithTag(protoWriter, 12, c022f2.anchor_exp_type);
            protoAdapter2.encodeWithTag(protoWriter, 13, c022f2.anchor_exp_time);
            this.LIZ.encodeWithTag(protoWriter, 14, c022f2.extra);
            protoAdapter.encodeWithTag(protoWriter, 15, c022f2.transaction_suffix);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 16, c022f2.biz_thumbnail);
            protoWriter.writeBytes(c022f2.unknownFields());
        }
    };
    public Integer anchor_exp_time;
    public Integer anchor_exp_type;
    public C673002jw biz_thumbnail;
    public Map<String, String> extra;
    public Boolean has_sub_arrow;
    public List<Integer> hide_list;
    public C598102Ux poi_anchor_button;
    public String schema;
    public Integer style;
    public Integer sub_tag_exp_time;
    public Integer sub_tag_exp_type;
    public List<C557802Fk> sub_tags;
    public String suffix;
    public String title;
    public String track_info;
    public String transaction_suffix;

    @Override // com.squareup.wire.Message
    public C02IU newBuilder() {
        return null;
    }

    public C022F() {
        super(ADAPTER, ByteString.EMPTY);
        this.sub_tags = C1516540pZE.LJIIIIZZ();
        this.hide_list = C1516540pZE.LJIIIIZZ();
        this.extra = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

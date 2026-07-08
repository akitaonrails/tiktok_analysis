package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DxY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2272741DxY extends Message<C2272741DxY, C2272761Dxa> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = BdTuring.TYPE_EMAIL)
    public final Long active_before;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 14)
    public final Long active_start;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 101)
    public final String conversation_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 100)
    public final Integer conversation_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, tag = BdTuring.TYPE_SMS_VOICE)
    public final List<Long> day_begin_list;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final Long end_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 204)
    public final Long last_grow_action_tm;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 203)
    public final Long last_incr_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer remain_restore_cnt;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 15)
    public final Long remind_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long restorable_before;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 201)
    public final Long restore_refresh_day_cnt;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 200)
    public final Long restore_refresh_window_start_ts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer streak_counter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer streak_level;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long streak_start;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
    public final Long streak_start_original;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String streak_timezone;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = BdTuring.TYPE_ECAF)
    public final Integer streak_timezone_offset;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final Integer total_restore_cnt_this_window;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakUser#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C1CJB> users;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 202)
    public final Integer v_geo_tag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)
    public final String version_source;
    public static final ProtoAdapter<C2272741DxY> ADAPTER = new ProtoAdapter<C2272741DxY>() { // from class: X.1DxZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2272741DxY decode(ProtoReader protoReader) {
            C2272761Dxa c2272761Dxa = new C2272761Dxa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 100) {
                        if (iNextTag != 101) {
                            if (iNextTag != 300) {
                                switch (iNextTag) {
                                    case 1:
                                        c2272761Dxa.LIZLLL.add(C1CJB.ADAPTER.decode(protoReader));
                                        break;
                                    case 2:
                                        c2272761Dxa.LJ = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    case 3:
                                        c2272761Dxa.LJFF = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    case 4:
                                        c2272761Dxa.LJI = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 5:
                                        c2272761Dxa.LJII = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    case 6:
                                        c2272761Dxa.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    case 7:
                                        c2272761Dxa.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    case 8:
                                        c2272761Dxa.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    case BdTuring.TYPE_ECAF /* 9 */:
                                        c2272761Dxa.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                        c2272761Dxa.LJIIL = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    case BdTuring.TYPE_EMAIL /* 11 */:
                                        c2272761Dxa.LJIILIIL = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                        c2272761Dxa.LJIILJJIL = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                        c2272761Dxa.LJIILL.add(ProtoAdapter.INT64.decode(protoReader));
                                        break;
                                    case 14:
                                        c2272761Dxa.LJIILLIIL = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    case 15:
                                        c2272761Dxa.LJIIZILJ = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    default:
                                        switch (iNextTag) {
                                            case 200:
                                                c2272761Dxa.LJIJJ = ProtoAdapter.INT64.decode(protoReader);
                                                break;
                                            case 201:
                                                c2272761Dxa.LJIJJLI = ProtoAdapter.INT64.decode(protoReader);
                                                break;
                                            case 202:
                                                c2272761Dxa.LJIL = ProtoAdapter.INT32.decode(protoReader);
                                                break;
                                            case 203:
                                                c2272761Dxa.LJJ = ProtoAdapter.INT64.decode(protoReader);
                                                break;
                                            case 204:
                                                c2272761Dxa.LJJI = ProtoAdapter.INT64.decode(protoReader);
                                                break;
                                            default:
                                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                                c2272761Dxa.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                c2272761Dxa.LJJIFFI = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2272761Dxa.LJIJI = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2272761Dxa.LJIJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2272761Dxa.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2272741DxY c2272741DxY) {
            C2272741DxY c2272741DxY2 = c2272741DxY;
            int iEncodedSizeWithTag = C1CJB.ADAPTER.asRepeated().encodedSizeWithTag(1, c2272741DxY2.users);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2272741DxY2.streak_start);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, c2272741DxY2.streak_counter);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(4, c2272741DxY2.streak_timezone) + protoAdapter.encodedSizeWithTag(5, c2272741DxY2.restorable_before) + protoAdapter2.encodedSizeWithTag(6, c2272741DxY2.remain_restore_cnt) + protoAdapter2.encodedSizeWithTag(7, c2272741DxY2.streak_level) + protoAdapter.encodedSizeWithTag(8, c2272741DxY2.streak_start_original) + protoAdapter2.encodedSizeWithTag(9, c2272741DxY2.streak_timezone_offset) + protoAdapter2.encodedSizeWithTag(10, c2272741DxY2.total_restore_cnt_this_window) + protoAdapter.encodedSizeWithTag(11, c2272741DxY2.active_before) + protoAdapter.encodedSizeWithTag(12, c2272741DxY2.end_at) + protoAdapter.asRepeated().encodedSizeWithTag(13, c2272741DxY2.day_begin_list) + protoAdapter.encodedSizeWithTag(14, c2272741DxY2.active_start) + protoAdapter.encodedSizeWithTag(15, c2272741DxY2.remind_at) + protoAdapter2.encodedSizeWithTag(100, c2272741DxY2.conversation_type) + protoAdapter3.encodedSizeWithTag(101, c2272741DxY2.conversation_id) + protoAdapter.encodedSizeWithTag(200, c2272741DxY2.restore_refresh_window_start_ts) + protoAdapter.encodedSizeWithTag(201, c2272741DxY2.restore_refresh_day_cnt) + protoAdapter2.encodedSizeWithTag(202, c2272741DxY2.v_geo_tag) + protoAdapter.encodedSizeWithTag(203, c2272741DxY2.last_incr_at) + protoAdapter.encodedSizeWithTag(204, c2272741DxY2.last_grow_action_tm) + protoAdapter3.encodedSizeWithTag(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, c2272741DxY2.version_source) + c2272741DxY2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2272741DxY redact(C2272741DxY c2272741DxY) {
            C2272761Dxa c2272761DxaNewBuilder = c2272741DxY.newBuilder();
            C1516540pZE.LJIIIZ(c2272761DxaNewBuilder.LIZLLL, C1CJB.ADAPTER);
            c2272761DxaNewBuilder.clearUnknownFields();
            return c2272761DxaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2272741DxY c2272741DxY) {
            C2272741DxY c2272741DxY2 = c2272741DxY;
            C1CJB.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c2272741DxY2.users);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c2272741DxY2.streak_start);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, c2272741DxY2.streak_counter);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 4, c2272741DxY2.streak_timezone);
            protoAdapter.encodeWithTag(protoWriter, 5, c2272741DxY2.restorable_before);
            protoAdapter2.encodeWithTag(protoWriter, 6, c2272741DxY2.remain_restore_cnt);
            protoAdapter2.encodeWithTag(protoWriter, 7, c2272741DxY2.streak_level);
            protoAdapter.encodeWithTag(protoWriter, 8, c2272741DxY2.streak_start_original);
            protoAdapter2.encodeWithTag(protoWriter, 9, c2272741DxY2.streak_timezone_offset);
            protoAdapter2.encodeWithTag(protoWriter, 10, c2272741DxY2.total_restore_cnt_this_window);
            protoAdapter.encodeWithTag(protoWriter, 11, c2272741DxY2.active_before);
            protoAdapter.encodeWithTag(protoWriter, 12, c2272741DxY2.end_at);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 13, c2272741DxY2.day_begin_list);
            protoAdapter.encodeWithTag(protoWriter, 14, c2272741DxY2.active_start);
            protoAdapter.encodeWithTag(protoWriter, 15, c2272741DxY2.remind_at);
            protoAdapter2.encodeWithTag(protoWriter, 100, c2272741DxY2.conversation_type);
            protoAdapter3.encodeWithTag(protoWriter, 101, c2272741DxY2.conversation_id);
            protoAdapter.encodeWithTag(protoWriter, 200, c2272741DxY2.restore_refresh_window_start_ts);
            protoAdapter.encodeWithTag(protoWriter, 201, c2272741DxY2.restore_refresh_day_cnt);
            protoAdapter2.encodeWithTag(protoWriter, 202, c2272741DxY2.v_geo_tag);
            protoAdapter.encodeWithTag(protoWriter, 203, c2272741DxY2.last_incr_at);
            protoAdapter.encodeWithTag(protoWriter, 204, c2272741DxY2.last_grow_action_tm);
            protoAdapter3.encodeWithTag(protoWriter, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, c2272741DxY2.version_source);
            protoWriter.writeBytes(c2272741DxY2.unknownFields());
        }
    };
    public static final Long DEFAULT_STREAK_START = 0L;
    public static final Integer DEFAULT_STREAK_COUNTER = 0;
    public static final Long DEFAULT_RESTORABLE_BEFORE = 0L;
    public static final Integer DEFAULT_REMAIN_RESTORE_CNT = 0;
    public static final Integer DEFAULT_STREAK_LEVEL = 0;
    public static final Long DEFAULT_STREAK_START_ORIGINAL = 0L;
    public static final Integer DEFAULT_STREAK_TIMEZONE_OFFSET = 0;
    public static final Integer DEFAULT_TOTAL_RESTORE_CNT_THIS_WINDOW = 0;
    public static final Long DEFAULT_ACTIVE_BEFORE = 0L;
    public static final Long DEFAULT_END_AT = 0L;
    public static final Long DEFAULT_ACTIVE_START = 0L;
    public static final Long DEFAULT_REMIND_AT = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_RESTORE_REFRESH_WINDOW_START_TS = 0L;
    public static final Long DEFAULT_RESTORE_REFRESH_DAY_CNT = 0L;
    public static final Integer DEFAULT_V_GEO_TAG = 0;
    public static final Long DEFAULT_LAST_INCR_AT = 0L;
    public static final Long DEFAULT_LAST_GROW_ACTION_TM = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.users.hashCode()) * 37;
        Long l = this.streak_start;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Integer num = this.streak_counter;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.streak_timezone;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        Long l2 = this.restorable_before;
        int iHashCode5 = (iHashCode4 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Integer num2 = this.remain_restore_cnt;
        int iHashCode6 = (iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.streak_level;
        int iHashCode7 = (iHashCode6 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Long l3 = this.streak_start_original;
        int iHashCode8 = (iHashCode7 + (l3 != null ? l3.hashCode() : 0)) * 37;
        Integer num4 = this.streak_timezone_offset;
        int iHashCode9 = (iHashCode8 + (num4 != null ? num4.hashCode() : 0)) * 37;
        Integer num5 = this.total_restore_cnt_this_window;
        int iHashCode10 = (iHashCode9 + (num5 != null ? num5.hashCode() : 0)) * 37;
        Long l4 = this.active_before;
        int iHashCode11 = (iHashCode10 + (l4 != null ? l4.hashCode() : 0)) * 37;
        Long l5 = this.end_at;
        int iHashCode12 = (((iHashCode11 + (l5 != null ? l5.hashCode() : 0)) * 37) + this.day_begin_list.hashCode()) * 37;
        Long l6 = this.active_start;
        int iHashCode13 = (iHashCode12 + (l6 != null ? l6.hashCode() : 0)) * 37;
        Long l7 = this.remind_at;
        int iHashCode14 = (iHashCode13 + (l7 != null ? l7.hashCode() : 0)) * 37;
        Integer num6 = this.conversation_type;
        int iHashCode15 = (iHashCode14 + (num6 != null ? num6.hashCode() : 0)) * 37;
        String str2 = this.conversation_id;
        int iHashCode16 = (iHashCode15 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l8 = this.restore_refresh_window_start_ts;
        int iHashCode17 = (iHashCode16 + (l8 != null ? l8.hashCode() : 0)) * 37;
        Long l9 = this.restore_refresh_day_cnt;
        int iHashCode18 = (iHashCode17 + (l9 != null ? l9.hashCode() : 0)) * 37;
        Integer num7 = this.v_geo_tag;
        int iHashCode19 = (iHashCode18 + (num7 != null ? num7.hashCode() : 0)) * 37;
        Long l10 = this.last_incr_at;
        int iHashCode20 = (iHashCode19 + (l10 != null ? l10.hashCode() : 0)) * 37;
        Long l11 = this.last_grow_action_tm;
        int iHashCode21 = (iHashCode20 + (l11 != null ? l11.hashCode() : 0)) * 37;
        String str3 = this.version_source;
        int iHashCode22 = iHashCode21 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode22;
        return iHashCode22;
    }

    @Override // com.squareup.wire.Message
    public C2272761Dxa newBuilder() {
        C2272761Dxa c2272761Dxa = new C2272761Dxa();
        c2272761Dxa.LIZLLL = C1516540pZE.LIZJ("users", this.users);
        c2272761Dxa.LJ = this.streak_start;
        c2272761Dxa.LJFF = this.streak_counter;
        c2272761Dxa.LJI = this.streak_timezone;
        c2272761Dxa.LJII = this.restorable_before;
        c2272761Dxa.LJIIIIZZ = this.remain_restore_cnt;
        c2272761Dxa.LJIIIZ = this.streak_level;
        c2272761Dxa.LJIIJ = this.streak_start_original;
        c2272761Dxa.LJIIJJI = this.streak_timezone_offset;
        c2272761Dxa.LJIIL = this.total_restore_cnt_this_window;
        c2272761Dxa.LJIILIIL = this.active_before;
        c2272761Dxa.LJIILJJIL = this.end_at;
        c2272761Dxa.LJIILL = C1516540pZE.LIZJ("day_begin_list", this.day_begin_list);
        c2272761Dxa.LJIILLIIL = this.active_start;
        c2272761Dxa.LJIIZILJ = this.remind_at;
        c2272761Dxa.LJIJ = this.conversation_type;
        c2272761Dxa.LJIJI = this.conversation_id;
        c2272761Dxa.LJIJJ = this.restore_refresh_window_start_ts;
        c2272761Dxa.LJIJJLI = this.restore_refresh_day_cnt;
        c2272761Dxa.LJIL = this.v_geo_tag;
        c2272761Dxa.LJJ = this.last_incr_at;
        c2272761Dxa.LJJI = this.last_grow_action_tm;
        c2272761Dxa.LJJIFFI = this.version_source;
        c2272761Dxa.addUnknownFields(unknownFields());
        return c2272761Dxa;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        if (this.streak_start != null) {
            sb.append(", streak_start=");
            sb.append(this.streak_start);
        }
        if (this.streak_counter != null) {
            sb.append(", streak_counter=");
            sb.append(this.streak_counter);
        }
        if (this.streak_timezone != null) {
            sb.append(", streak_timezone=");
            sb.append(this.streak_timezone);
        }
        if (this.restorable_before != null) {
            sb.append(", restorable_before=");
            sb.append(this.restorable_before);
        }
        if (this.remain_restore_cnt != null) {
            sb.append(", remain_restore_cnt=");
            sb.append(this.remain_restore_cnt);
        }
        if (this.streak_level != null) {
            sb.append(", streak_level=");
            sb.append(this.streak_level);
        }
        if (this.streak_start_original != null) {
            sb.append(", streak_start_original=");
            sb.append(this.streak_start_original);
        }
        if (this.streak_timezone_offset != null) {
            sb.append(", streak_timezone_offset=");
            sb.append(this.streak_timezone_offset);
        }
        if (this.total_restore_cnt_this_window != null) {
            sb.append(", total_restore_cnt_this_window=");
            sb.append(this.total_restore_cnt_this_window);
        }
        if (this.active_before != null) {
            sb.append(", active_before=");
            sb.append(this.active_before);
        }
        if (this.end_at != null) {
            sb.append(", end_at=");
            sb.append(this.end_at);
        }
        if (!this.day_begin_list.isEmpty()) {
            sb.append(", day_begin_list=");
            sb.append(this.day_begin_list);
        }
        if (this.active_start != null) {
            sb.append(", active_start=");
            sb.append(this.active_start);
        }
        if (this.remind_at != null) {
            sb.append(", remind_at=");
            sb.append(this.remind_at);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.restore_refresh_window_start_ts != null) {
            sb.append(", restore_refresh_window_start_ts=");
            sb.append(this.restore_refresh_window_start_ts);
        }
        if (this.restore_refresh_day_cnt != null) {
            sb.append(", restore_refresh_day_cnt=");
            sb.append(this.restore_refresh_day_cnt);
        }
        if (this.v_geo_tag != null) {
            sb.append(", v_geo_tag=");
            sb.append(this.v_geo_tag);
        }
        if (this.last_incr_at != null) {
            sb.append(", last_incr_at=");
            sb.append(this.last_incr_at);
        }
        if (this.last_grow_action_tm != null) {
            sb.append(", last_grow_action_tm=");
            sb.append(this.last_grow_action_tm);
        }
        if (this.version_source != null) {
            sb.append(", version_source=");
            sb.append(this.version_source);
        }
        sb.replace(0, 2, "StreakValue{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2272741DxY)) {
            return false;
        }
        C2272741DxY c2272741DxY = (C2272741DxY) obj;
        if (unknownFields().equals(c2272741DxY.unknownFields()) && this.users.equals(c2272741DxY.users) && C1516540pZE.LJ(this.streak_start, c2272741DxY.streak_start) && C1516540pZE.LJ(this.streak_counter, c2272741DxY.streak_counter) && C1516540pZE.LJ(this.streak_timezone, c2272741DxY.streak_timezone) && C1516540pZE.LJ(this.restorable_before, c2272741DxY.restorable_before) && C1516540pZE.LJ(this.remain_restore_cnt, c2272741DxY.remain_restore_cnt) && C1516540pZE.LJ(this.streak_level, c2272741DxY.streak_level) && C1516540pZE.LJ(this.streak_start_original, c2272741DxY.streak_start_original) && C1516540pZE.LJ(this.streak_timezone_offset, c2272741DxY.streak_timezone_offset) && C1516540pZE.LJ(this.total_restore_cnt_this_window, c2272741DxY.total_restore_cnt_this_window) && C1516540pZE.LJ(this.active_before, c2272741DxY.active_before) && C1516540pZE.LJ(this.end_at, c2272741DxY.end_at) && this.day_begin_list.equals(c2272741DxY.day_begin_list) && C1516540pZE.LJ(this.active_start, c2272741DxY.active_start) && C1516540pZE.LJ(this.remind_at, c2272741DxY.remind_at) && C1516540pZE.LJ(this.conversation_type, c2272741DxY.conversation_type) && C1516540pZE.LJ(this.conversation_id, c2272741DxY.conversation_id) && C1516540pZE.LJ(this.restore_refresh_window_start_ts, c2272741DxY.restore_refresh_window_start_ts) && C1516540pZE.LJ(this.restore_refresh_day_cnt, c2272741DxY.restore_refresh_day_cnt) && C1516540pZE.LJ(this.v_geo_tag, c2272741DxY.v_geo_tag) && C1516540pZE.LJ(this.last_incr_at, c2272741DxY.last_incr_at) && C1516540pZE.LJ(this.last_grow_action_tm, c2272741DxY.last_grow_action_tm) && C1516540pZE.LJ(this.version_source, c2272741DxY.version_source)) {
            return true;
        }
        return false;
    }

    public C2272741DxY(List<C1CJB> list, Long l, Integer num, String str, Long l2, Integer num2, Integer num3, Long l3, Integer num4, Integer num5, Long l4, Long l5, List<Long> list2, Long l6, Long l7, Integer num6, String str2, Long l8, Long l9, Integer num7, Long l10, Long l11, String str3) {
        this(list, l, num, str, l2, num2, num3, l3, num4, num5, l4, l5, list2, l6, l7, num6, str2, l8, l9, num7, l10, l11, str3, ByteString.EMPTY);
    }

    public C2272741DxY(List<C1CJB> list, Long l, Integer num, String str, Long l2, Integer num2, Integer num3, Long l3, Integer num4, Integer num5, Long l4, Long l5, List<Long> list2, Long l6, Long l7, Integer num6, String str2, Long l8, Long l9, Integer num7, Long l10, Long l11, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.users = C1516540pZE.LJFF("users", list);
        this.streak_start = l;
        this.streak_counter = num;
        this.streak_timezone = str;
        this.restorable_before = l2;
        this.remain_restore_cnt = num2;
        this.streak_level = num3;
        this.streak_start_original = l3;
        this.streak_timezone_offset = num4;
        this.total_restore_cnt_this_window = num5;
        this.active_before = l4;
        this.end_at = l5;
        this.day_begin_list = C1516540pZE.LJFF("day_begin_list", list2);
        this.active_start = l6;
        this.remind_at = l7;
        this.conversation_type = num6;
        this.conversation_id = str2;
        this.restore_refresh_window_start_ts = l8;
        this.restore_refresh_day_cnt = l9;
        this.v_geo_tag = num7;
        this.last_incr_at = l10;
        this.last_grow_action_tm = l11;
        this.version_source = str3;
    }
}

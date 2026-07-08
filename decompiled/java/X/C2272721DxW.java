package X;

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

/* JADX INFO: renamed from: X.1DxW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2272721DxW extends Message<C2272721DxW, C2272771Dxb> {
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

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer streak_counter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer streak_level;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long streak_start;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
    public final Long streak_start_original;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String streak_timezone;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = BdTuring.TYPE_ECAF)
    public final Integer streak_timezone_offset;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final Integer total_restore_cnt_this_window;

    @WireField(adapter = "com.ss.android.ugc.aweme.im.streak.impl.api.idl.StreakUser#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C1CJ8> users;
    public static final ProtoAdapter<C2272721DxW> ADAPTER = new ProtoAdapter<C2272721DxW>() { // from class: X.1DxX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2272721DxW decode(ProtoReader protoReader) {
            C2272771Dxb c2272771Dxb = new C2272771Dxb();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 100) {
                        if (iNextTag != 101) {
                            if (iNextTag != 200) {
                                if (iNextTag != 201) {
                                    switch (iNextTag) {
                                        case 1:
                                            c2272771Dxb.LIZLLL.add(C1CJ8.ADAPTER.decode(protoReader));
                                            break;
                                        case 2:
                                            c2272771Dxb.LJ = ProtoAdapter.INT64.decode(protoReader);
                                            break;
                                        case 3:
                                            c2272771Dxb.LJFF = ProtoAdapter.INT32.decode(protoReader);
                                            break;
                                        case 4:
                                            c2272771Dxb.LJI = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 5:
                                            c2272771Dxb.LJII = ProtoAdapter.INT64.decode(protoReader);
                                            break;
                                        case 6:
                                            c2272771Dxb.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                                            break;
                                        case 7:
                                            c2272771Dxb.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                                            break;
                                        case 8:
                                            c2272771Dxb.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                                            break;
                                        case BdTuring.TYPE_ECAF /* 9 */:
                                            c2272771Dxb.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                                            break;
                                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                            c2272771Dxb.LJIIL = ProtoAdapter.INT32.decode(protoReader);
                                            break;
                                        case BdTuring.TYPE_EMAIL /* 11 */:
                                            c2272771Dxb.LJIILIIL = ProtoAdapter.INT64.decode(protoReader);
                                            break;
                                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                            c2272771Dxb.LJIILJJIL = ProtoAdapter.INT64.decode(protoReader);
                                            break;
                                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                            c2272771Dxb.LJIILL.add(ProtoAdapter.INT64.decode(protoReader));
                                            break;
                                        case 14:
                                            c2272771Dxb.LJIILLIIL = ProtoAdapter.INT64.decode(protoReader);
                                            break;
                                        case 15:
                                            c2272771Dxb.LJIIZILJ = ProtoAdapter.INT64.decode(protoReader);
                                            break;
                                        default:
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c2272771Dxb.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            break;
                                    }
                                } else {
                                    c2272771Dxb.LJIJJLI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c2272771Dxb.LJIJJ = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2272771Dxb.LJIJI = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2272771Dxb.LJIJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2272771Dxb.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2272721DxW c2272721DxW) {
            C2272721DxW c2272721DxW2 = c2272721DxW;
            int iEncodedSizeWithTag = C1CJ8.ADAPTER.asRepeated().encodedSizeWithTag(1, c2272721DxW2.users);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2272721DxW2.streak_start);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, c2272721DxW2.streak_counter);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(4, c2272721DxW2.streak_timezone) + protoAdapter.encodedSizeWithTag(5, c2272721DxW2.restorable_before) + protoAdapter2.encodedSizeWithTag(6, c2272721DxW2.remain_restore_cnt) + protoAdapter2.encodedSizeWithTag(7, c2272721DxW2.streak_level) + protoAdapter.encodedSizeWithTag(8, c2272721DxW2.streak_start_original) + protoAdapter2.encodedSizeWithTag(9, c2272721DxW2.streak_timezone_offset) + protoAdapter2.encodedSizeWithTag(10, c2272721DxW2.total_restore_cnt_this_window) + protoAdapter.encodedSizeWithTag(11, c2272721DxW2.active_before) + protoAdapter.encodedSizeWithTag(12, c2272721DxW2.end_at) + protoAdapter.asRepeated().encodedSizeWithTag(13, c2272721DxW2.day_begin_list) + protoAdapter.encodedSizeWithTag(14, c2272721DxW2.active_start) + protoAdapter.encodedSizeWithTag(15, c2272721DxW2.remind_at) + protoAdapter2.encodedSizeWithTag(100, c2272721DxW2.conversation_type) + protoAdapter3.encodedSizeWithTag(101, c2272721DxW2.conversation_id) + protoAdapter.encodedSizeWithTag(200, c2272721DxW2.restore_refresh_window_start_ts) + protoAdapter.encodedSizeWithTag(201, c2272721DxW2.restore_refresh_day_cnt) + c2272721DxW2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2272721DxW redact(C2272721DxW c2272721DxW) {
            C2272771Dxb c2272771DxbNewBuilder = c2272721DxW.newBuilder();
            C1516540pZE.LJIIIZ(c2272771DxbNewBuilder.LIZLLL, C1CJ8.ADAPTER);
            c2272771DxbNewBuilder.clearUnknownFields();
            return c2272771DxbNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2272721DxW c2272721DxW) {
            C2272721DxW c2272721DxW2 = c2272721DxW;
            C1CJ8.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c2272721DxW2.users);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c2272721DxW2.streak_start);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, c2272721DxW2.streak_counter);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 4, c2272721DxW2.streak_timezone);
            protoAdapter.encodeWithTag(protoWriter, 5, c2272721DxW2.restorable_before);
            protoAdapter2.encodeWithTag(protoWriter, 6, c2272721DxW2.remain_restore_cnt);
            protoAdapter2.encodeWithTag(protoWriter, 7, c2272721DxW2.streak_level);
            protoAdapter.encodeWithTag(protoWriter, 8, c2272721DxW2.streak_start_original);
            protoAdapter2.encodeWithTag(protoWriter, 9, c2272721DxW2.streak_timezone_offset);
            protoAdapter2.encodeWithTag(protoWriter, 10, c2272721DxW2.total_restore_cnt_this_window);
            protoAdapter.encodeWithTag(protoWriter, 11, c2272721DxW2.active_before);
            protoAdapter.encodeWithTag(protoWriter, 12, c2272721DxW2.end_at);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 13, c2272721DxW2.day_begin_list);
            protoAdapter.encodeWithTag(protoWriter, 14, c2272721DxW2.active_start);
            protoAdapter.encodeWithTag(protoWriter, 15, c2272721DxW2.remind_at);
            protoAdapter2.encodeWithTag(protoWriter, 100, c2272721DxW2.conversation_type);
            protoAdapter3.encodeWithTag(protoWriter, 101, c2272721DxW2.conversation_id);
            protoAdapter.encodeWithTag(protoWriter, 200, c2272721DxW2.restore_refresh_window_start_ts);
            protoAdapter.encodeWithTag(protoWriter, 201, c2272721DxW2.restore_refresh_day_cnt);
            protoWriter.writeBytes(c2272721DxW2.unknownFields());
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

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.users.hashCode()) * 37) + this.streak_start.hashCode()) * 37) + this.streak_counter.hashCode()) * 37;
        String str = this.streak_timezone;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.restorable_before;
        int iHashCode3 = (iHashCode2 + (l != null ? l.hashCode() : 0)) * 37;
        Integer num = this.remain_restore_cnt;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.streak_level;
        int iHashCode5 = (iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Long l2 = this.streak_start_original;
        int iHashCode6 = (iHashCode5 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Integer num3 = this.streak_timezone_offset;
        int iHashCode7 = (iHashCode6 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Integer num4 = this.total_restore_cnt_this_window;
        int iHashCode8 = (iHashCode7 + (num4 != null ? num4.hashCode() : 0)) * 37;
        Long l3 = this.active_before;
        int iHashCode9 = (iHashCode8 + (l3 != null ? l3.hashCode() : 0)) * 37;
        Long l4 = this.end_at;
        int iHashCode10 = (((iHashCode9 + (l4 != null ? l4.hashCode() : 0)) * 37) + this.day_begin_list.hashCode()) * 37;
        Long l5 = this.active_start;
        int iHashCode11 = (iHashCode10 + (l5 != null ? l5.hashCode() : 0)) * 37;
        Long l6 = this.remind_at;
        int iHashCode12 = (iHashCode11 + (l6 != null ? l6.hashCode() : 0)) * 37;
        Integer num5 = this.conversation_type;
        int iHashCode13 = (iHashCode12 + (num5 != null ? num5.hashCode() : 0)) * 37;
        String str2 = this.conversation_id;
        int iHashCode14 = (iHashCode13 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l7 = this.restore_refresh_window_start_ts;
        int iHashCode15 = (iHashCode14 + (l7 != null ? l7.hashCode() : 0)) * 37;
        Long l8 = this.restore_refresh_day_cnt;
        int iHashCode16 = iHashCode15 + (l8 != null ? l8.hashCode() : 0);
        this.hashCode = iHashCode16;
        return iHashCode16;
    }

    @Override // com.squareup.wire.Message
    public C2272771Dxb newBuilder() {
        C2272771Dxb c2272771Dxb = new C2272771Dxb();
        c2272771Dxb.LIZLLL = C1516540pZE.LIZJ("users", this.users);
        c2272771Dxb.LJ = this.streak_start;
        c2272771Dxb.LJFF = this.streak_counter;
        c2272771Dxb.LJI = this.streak_timezone;
        c2272771Dxb.LJII = this.restorable_before;
        c2272771Dxb.LJIIIIZZ = this.remain_restore_cnt;
        c2272771Dxb.LJIIIZ = this.streak_level;
        c2272771Dxb.LJIIJ = this.streak_start_original;
        c2272771Dxb.LJIIJJI = this.streak_timezone_offset;
        c2272771Dxb.LJIIL = this.total_restore_cnt_this_window;
        c2272771Dxb.LJIILIIL = this.active_before;
        c2272771Dxb.LJIILJJIL = this.end_at;
        c2272771Dxb.LJIILL = C1516540pZE.LIZJ("day_begin_list", this.day_begin_list);
        c2272771Dxb.LJIILLIIL = this.active_start;
        c2272771Dxb.LJIIZILJ = this.remind_at;
        c2272771Dxb.LJIJ = this.conversation_type;
        c2272771Dxb.LJIJI = this.conversation_id;
        c2272771Dxb.LJIJJ = this.restore_refresh_window_start_ts;
        c2272771Dxb.LJIJJLI = this.restore_refresh_day_cnt;
        c2272771Dxb.addUnknownFields(unknownFields());
        return c2272771Dxb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        sb.append(", streak_start=");
        sb.append(this.streak_start);
        sb.append(", streak_counter=");
        sb.append(this.streak_counter);
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
        sb.replace(0, 2, "StreakValue{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2272721DxW)) {
            return false;
        }
        C2272721DxW c2272721DxW = (C2272721DxW) obj;
        if (unknownFields().equals(c2272721DxW.unknownFields()) && this.users.equals(c2272721DxW.users) && this.streak_start.equals(c2272721DxW.streak_start) && this.streak_counter.equals(c2272721DxW.streak_counter) && C1516540pZE.LJ(this.streak_timezone, c2272721DxW.streak_timezone) && C1516540pZE.LJ(this.restorable_before, c2272721DxW.restorable_before) && C1516540pZE.LJ(this.remain_restore_cnt, c2272721DxW.remain_restore_cnt) && C1516540pZE.LJ(this.streak_level, c2272721DxW.streak_level) && C1516540pZE.LJ(this.streak_start_original, c2272721DxW.streak_start_original) && C1516540pZE.LJ(this.streak_timezone_offset, c2272721DxW.streak_timezone_offset) && C1516540pZE.LJ(this.total_restore_cnt_this_window, c2272721DxW.total_restore_cnt_this_window) && C1516540pZE.LJ(this.active_before, c2272721DxW.active_before) && C1516540pZE.LJ(this.end_at, c2272721DxW.end_at) && this.day_begin_list.equals(c2272721DxW.day_begin_list) && C1516540pZE.LJ(this.active_start, c2272721DxW.active_start) && C1516540pZE.LJ(this.remind_at, c2272721DxW.remind_at) && C1516540pZE.LJ(this.conversation_type, c2272721DxW.conversation_type) && C1516540pZE.LJ(this.conversation_id, c2272721DxW.conversation_id) && C1516540pZE.LJ(this.restore_refresh_window_start_ts, c2272721DxW.restore_refresh_window_start_ts) && C1516540pZE.LJ(this.restore_refresh_day_cnt, c2272721DxW.restore_refresh_day_cnt)) {
            return true;
        }
        return false;
    }

    public C2272721DxW(List<C1CJ8> list, Long l, Integer num, String str, Long l2, Integer num2, Integer num3, Long l3, Integer num4, Integer num5, Long l4, Long l5, List<Long> list2, Long l6, Long l7, Integer num6, String str2, Long l8, Long l9) {
        this(list, l, num, str, l2, num2, num3, l3, num4, num5, l4, l5, list2, l6, l7, num6, str2, l8, l9, ByteString.EMPTY);
    }

    public C2272721DxW(List<C1CJ8> list, Long l, Integer num, String str, Long l2, Integer num2, Integer num3, Long l3, Integer num4, Integer num5, Long l4, Long l5, List<Long> list2, Long l6, Long l7, Integer num6, String str2, Long l8, Long l9, ByteString byteString) {
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
    }
}

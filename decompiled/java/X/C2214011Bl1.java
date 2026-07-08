package X;

import X.C2214001Bl0;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS148S1100000_34;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bl1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214011Bl1 {
    public static final C2214011Bl1 LIZ = new C2214011Bl1();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(220));
    public static final List<String> LIZJ = C1697810uHb.LJIILJJIL("event_on_prepare_play", "event_on_play_time");
    public static final List<String> LIZLLL = C1697810uHb.LJIILJJIL("video_play_finish", "dislike", "image_play_end", "like", "like_cancel", "click_comment_button", "favourite_video", "cancel_favourite_video", "share_video", "enter_personal_detail", "post_comment_finish", "multi_photo_slide");
    public static final List<String> LJ = C1697810uHb.LJIILJJIL("graphic_detail_playtime");
    public static final Map<String, ? extends Object> LJFF = C2097608Jq.LJIIJ(new Pair(FollowStatusChangeMethod.PARAM_UID, ""), new Pair("playtime", 0L), new Pair("image_count", 0L), new Pair("is_finished", 0), new Pair("is_disliked", 0), new Pair("read_count", 1), new Pair("is_skipped", 1), new Pair("is_liked", 0), new Pair("click_comment", 0), new Pair("is_favorited", 0), new Pair("photo_gap_duration", 0), new Pair("post_comment", 0), new Pair("click_head", 0), new Pair("is_shared_in", 0), new Pair("is_shared_out", 0), new Pair("graphic_detail_playtime", 0), new Pair("slide_count", 0));
    public static long LJI;

    public static C2214001Bl0 LIZ() {
        return (C2214001Bl0) LIZIZ.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void LIZIZ(C08KW c08kw) {
        Object objOpt;
        String aid;
        C2214001Bl0<K, T>.a aVar;
        C2214001Bl0<K, T>.a aVar2;
        Object objOpt2;
        C08KT c08kt;
        Object objOpt3;
        C08KT c08kt2;
        Object objOpt4;
        String aid2;
        Object objOpt5;
        Object objOpt6;
        C08KT c08kt3;
        Object objOpt7;
        C08KT c08kt4;
        Object objOpt8;
        Object objOpt9;
        Object objOpt10;
        C08KT c08kt5;
        Object objOpt11;
        C08KT c08kt6;
        Object objOpt12;
        C08KT c08kt7;
        Number numberLIZ;
        Object objOpt13;
        C08KT c08kt8;
        Object objOpt14;
        C08KT c08kt9;
        Object objOpt15;
        C08KT c08kt10;
        Object objOpt16;
        C08KT c08kt11;
        Object objOpt17;
        Object objOpt18;
        C08KT c08kt12;
        Object objOpt19;
        C08KT c08kt13;
        String str = c08kw.LIZ;
        long jLongValue = 0;
        Long l = 0L;
        int i = 0;
        Integer num = 0;
        Object obj = null;
        switch (str.hashCode()) {
            case -1491225049:
                if (!str.equals("event_on_prepare_play")) {
                    return;
                }
                JSONObject jSONObject = c08kw.LIZIZ;
                if (jSONObject == null) {
                    objOpt = c08kw.LIZIZ().get("aweme");
                } else {
                    objOpt = jSONObject.opt("aweme");
                }
                if (!(objOpt instanceof Aweme)) {
                    objOpt = null;
                }
                Aweme aweme = (Aweme) objOpt;
                if (aweme == null || (aid = aweme.getAid()) == null || !AwemeExtKt.isPhotoMode(aweme)) {
                    return;
                }
                C2214001Bl0 c2214001Bl0LIZ = LIZ();
                AwS148S1100000_34 awS148S1100000_34 = new AwS148S1100000_34(aid, aweme, c08kw, 13);
                Object objLIZ = c2214001Bl0LIZ.LIZ(aid);
                if (objLIZ == null) {
                    Object objInvoke = awS148S1100000_34.invoke(null);
                    c2214001Bl0LIZ.LIZJ.writeLock().lock();
                    try {
                        if (c2214001Bl0LIZ.LIZIZ.containsKey(aid) && (aVar2 = c2214001Bl0LIZ.LIZIZ.get(aid)) != null) {
                            C2214001Bl0<K, T>.a aVar3 = aVar2.LIZJ;
                            C2214001Bl0<K, T>.a aVar4 = aVar2.LIZLLL;
                            if (aVar3 != null && aVar4 != null) {
                                aVar4.LIZJ = aVar3;
                                aVar3.LIZLLL = aVar4;
                            }
                        }
                        C2214001Bl0<K, T>.a aVar5 = new C2214001Bl0.a(aid, objInvoke);
                        C2214001Bl0<K, T>.a aVar6 = c2214001Bl0LIZ.LJ;
                        C2214001Bl0<K, T>.a aVar7 = aVar6.LIZLLL;
                        if (aVar7 != null) {
                            aVar7.LIZJ = aVar5;
                            aVar5.LIZLLL = aVar7;
                            aVar5.LIZJ = aVar6;
                            aVar6.LIZLLL = aVar5;
                        }
                        c2214001Bl0LIZ.LIZIZ.put((K) aid, aVar5);
                        if (c2214001Bl0LIZ.LIZIZ.size() > c2214001Bl0LIZ.LIZ && (aVar = c2214001Bl0LIZ.LIZLLL.LIZJ) != null) {
                            C2214001Bl0<K, T>.a aVar8 = aVar.LIZJ;
                            C2214001Bl0<K, T>.a aVar9 = aVar.LIZLLL;
                            if (aVar8 != null && aVar9 != null) {
                                aVar9.LIZJ = aVar8;
                                aVar8.LIZLLL = aVar9;
                            }
                            C19719512Dh.LIZJ(c2214001Bl0LIZ.LIZIZ).remove(aVar.LIZ);
                            break;
                        }
                        c2214001Bl0LIZ.LIZJ.writeLock().unlock();
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c2214001Bl0LIZ.LIZJ.writeLock().unlock();
                        throw th;
                    }
                }
                awS148S1100000_34.invoke(objLIZ);
                return;
            case -1330248535:
                if (!str.equals("click_comment_button")) {
                    return;
                }
                JSONObject jSONObject2 = c08kw.LIZIZ;
                if (jSONObject2 == null) {
                    objOpt2 = c08kw.LIZIZ().get("group_id");
                } else {
                    objOpt2 = jSONObject2.opt("group_id");
                }
                if (!(objOpt2 instanceof String) || objOpt2 == null || (c08kt = (C08KT) LIZ().LIZ(objOpt2)) == null) {
                    return;
                }
                c08kt.LIZ(1, "click_comment");
                return;
            case -1245178018:
                if (!str.equals("multi_photo_slide")) {
                    return;
                }
                JSONObject jSONObject3 = c08kw.LIZIZ;
                if (jSONObject3 == null) {
                    objOpt3 = c08kw.LIZIZ().get("group_id");
                } else {
                    objOpt3 = jSONObject3.opt("group_id");
                }
                if (!(objOpt3 instanceof String) || objOpt3 == null || (c08kt2 = (C08KT) LIZ().LIZ(objOpt3)) == null) {
                    return;
                }
                Object obj2 = c08kt2.LIZ.get("slide_count");
                if (obj2 instanceof Number) {
                    obj = obj2;
                }
                Number number = (Number) obj;
                if (number != null) {
                    Number numberLIZ2 = C163100jt.LIZ(number, num);
                    if (numberLIZ2 != null) {
                        num = (Integer) numberLIZ2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                }
                c08kt2.LIZ.put("slide_count", Integer.valueOf(num.intValue() + 1));
                return;
            case -1183752163:
                if (!str.equals("event_on_play_time")) {
                    return;
                }
                JSONObject jSONObject4 = c08kw.LIZIZ;
                if (jSONObject4 == null) {
                    objOpt4 = c08kw.LIZIZ().get("aweme");
                } else {
                    objOpt4 = jSONObject4.opt("aweme");
                }
                if (!(objOpt4 instanceof Aweme)) {
                    objOpt4 = null;
                }
                Aweme aweme2 = (Aweme) objOpt4;
                if (aweme2 == null || (aid2 = aweme2.getAid()) == null) {
                    return;
                }
                JSONObject jSONObject5 = c08kw.LIZIZ;
                if (jSONObject5 == null) {
                    objOpt5 = c08kw.LIZIZ().get("play_duration");
                } else {
                    objOpt5 = jSONObject5.opt("play_duration");
                }
                if (!(objOpt5 instanceof Number)) {
                    objOpt5 = null;
                }
                Number number2 = (Number) objOpt5;
                if (number2 != null) {
                    jLongValue = number2.longValue();
                }
                C08KT c08kt14 = (C08KT) LIZ().LIZ(aid2);
                if (c08kt14 == null) {
                    return;
                }
                Object obj3 = c08kt14.LIZ.get("playtime");
                if (obj3 instanceof Number) {
                    obj = obj3;
                }
                Number number3 = (Number) obj;
                if (number3 != null) {
                    Number numberLIZ3 = C163100jt.LIZ(number3, l);
                    if (numberLIZ3 != null) {
                        l = (Long) numberLIZ3;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                    }
                }
                c08kt14.LIZ.put("playtime", Long.valueOf(l.longValue() + jLongValue));
                return;
            case -1136574248:
                if (!str.equals("graphic_detail_playtime")) {
                    return;
                }
                JSONObject jSONObject6 = c08kw.LIZIZ;
                if (jSONObject6 == null) {
                    objOpt6 = c08kw.LIZIZ().get("group_id");
                } else {
                    objOpt6 = jSONObject6.opt("group_id");
                }
                if (!(objOpt6 instanceof String) || objOpt6 == null || (c08kt3 = (C08KT) LIZ().LIZ(objOpt6)) == null) {
                    return;
                }
                Number numberLIZ4 = c08kw.LIZ("duration");
                if (numberLIZ4 != null) {
                    jLongValue = numberLIZ4.longValue();
                }
                Object obj4 = c08kt3.LIZ.get("graphic_detail_playtime");
                if (obj4 instanceof Number) {
                    obj = obj4;
                }
                Number number4 = (Number) obj;
                if (number4 != null) {
                    Number numberLIZ5 = C163100jt.LIZ(number4, l);
                    if (numberLIZ5 != null) {
                        l = (Long) numberLIZ5;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                    }
                }
                c08kt3.LIZ.put("graphic_detail_playtime", Long.valueOf(l.longValue() + jLongValue));
                return;
            case -795864119:
                if (!str.equals("enter_personal_detail")) {
                    return;
                }
                JSONObject jSONObject7 = c08kw.LIZIZ;
                if (jSONObject7 == null) {
                    objOpt7 = c08kw.LIZIZ().get("group_id");
                } else {
                    objOpt7 = jSONObject7.opt("group_id");
                }
                if (!(objOpt7 instanceof String) || objOpt7 == null || (c08kt4 = (C08KT) LIZ().LIZ(objOpt7)) == null) {
                    return;
                }
                JSONObject jSONObject8 = c08kw.LIZIZ;
                if (jSONObject8 == null) {
                    objOpt8 = c08kw.LIZIZ().get("author_id");
                } else {
                    objOpt8 = jSONObject8.opt("author_id");
                }
                if (!(objOpt8 instanceof String)) {
                    objOpt8 = null;
                }
                String str2 = (String) objOpt8;
                JSONObject jSONObject9 = c08kw.LIZIZ;
                if (jSONObject9 == null) {
                    objOpt9 = c08kw.LIZIZ().get("to_user_id");
                } else {
                    objOpt9 = jSONObject9.opt("to_user_id");
                }
                if (objOpt9 instanceof String) {
                    obj = objOpt9;
                }
                if (!C123100dR.LIZ(str2) || !Intrinsics.LJFF(str2, obj)) {
                    return;
                }
                c08kt4.LIZ(1, "click_head");
                return;
            case -629905484:
                if (!str.equals("image_play_end")) {
                    return;
                }
                JSONObject jSONObject10 = c08kw.LIZIZ;
                if (jSONObject10 == null) {
                    objOpt10 = c08kw.LIZIZ().get("group_id");
                } else {
                    objOpt10 = jSONObject10.opt("group_id");
                }
                if (!(objOpt10 instanceof String) || objOpt10 == null || (c08kt5 = (C08KT) LIZ().LIZ(objOpt10)) == null) {
                    return;
                }
                Number numberLIZ6 = c08kw.LIZ("slides_cnt");
                if (numberLIZ6 != null) {
                    c08kt5.LIZ(Integer.valueOf(numberLIZ6.intValue()), "read_count");
                }
                Number numberLIZ7 = c08kw.LIZ("play_dur_sum");
                if (numberLIZ7 == null) {
                    return;
                }
                if (numberLIZ7.longValue() < 2000) {
                    i = 1;
                }
                c08kt5.LIZ(Integer.valueOf(i), "is_skipped");
                return;
            case -405326491:
                if (!str.equals("favourite_video")) {
                    return;
                }
                JSONObject jSONObject11 = c08kw.LIZIZ;
                if (jSONObject11 == null) {
                    objOpt11 = c08kw.LIZIZ().get("group_id");
                } else {
                    objOpt11 = jSONObject11.opt("group_id");
                }
                if (!(objOpt11 instanceof String) || objOpt11 == null || (c08kt6 = (C08KT) LIZ().LIZ(objOpt11)) == null) {
                    return;
                }
                c08kt6.LIZ(1, "is_favorited");
                return;
            case -300219406:
                if (!str.equals("post_comment_finish")) {
                    return;
                }
                JSONObject jSONObject12 = c08kw.LIZIZ;
                if (jSONObject12 == null) {
                    objOpt12 = c08kw.LIZIZ().get("group_id");
                } else {
                    objOpt12 = jSONObject12.opt("group_id");
                }
                if (!(objOpt12 instanceof String) || objOpt12 == null || (c08kt7 = (C08KT) LIZ().LIZ(objOpt12)) == null || (numberLIZ = c08kw.LIZ("is_success")) == null || numberLIZ.intValue() != 1) {
                    return;
                }
                c08kt7.LIZ(1, "post_comment");
                return;
            case -17674694:
                if (!str.equals("video_play_finish")) {
                    return;
                }
                JSONObject jSONObject13 = c08kw.LIZIZ;
                if (jSONObject13 == null) {
                    objOpt13 = c08kw.LIZIZ().get("group_id");
                } else {
                    objOpt13 = jSONObject13.opt("group_id");
                }
                if (!(objOpt13 instanceof String) || objOpt13 == null || (c08kt8 = (C08KT) LIZ().LIZ(objOpt13)) == null) {
                    return;
                }
                c08kt8.LIZ(1, "is_finished");
                return;
            case 3321751:
                if (!str.equals("like")) {
                    return;
                }
                JSONObject jSONObject14 = c08kw.LIZIZ;
                if (jSONObject14 == null) {
                    objOpt14 = c08kw.LIZIZ().get("group_id");
                } else {
                    objOpt14 = jSONObject14.opt("group_id");
                }
                if (!(objOpt14 instanceof String) || objOpt14 == null || (c08kt9 = (C08KT) LIZ().LIZ(objOpt14)) == null) {
                    return;
                }
                c08kt9.LIZ(1, "is_liked");
                return;
            case 239764896:
                if (!str.equals("cancel_favourite_video")) {
                    return;
                }
                JSONObject jSONObject15 = c08kw.LIZIZ;
                if (jSONObject15 == null) {
                    objOpt15 = c08kw.LIZIZ().get("group_id");
                } else {
                    objOpt15 = jSONObject15.opt("group_id");
                }
                if (!(objOpt15 instanceof String) || objOpt15 == null || (c08kt10 = (C08KT) LIZ().LIZ(objOpt15)) == null) {
                    return;
                }
                c08kt10.LIZ(num, "is_favorited");
                return;
            case 409478171:
                if (!str.equals("share_video")) {
                    return;
                }
                JSONObject jSONObject16 = c08kw.LIZIZ;
                if (jSONObject16 == null) {
                    objOpt16 = c08kw.LIZIZ().get("group_id");
                } else {
                    objOpt16 = jSONObject16.opt("group_id");
                }
                if (!(objOpt16 instanceof String) || objOpt16 == null || (c08kt11 = (C08KT) LIZ().LIZ(objOpt16)) == null) {
                    return;
                }
                JSONObject jSONObject17 = c08kw.LIZIZ;
                if (jSONObject17 == null) {
                    objOpt17 = c08kw.LIZIZ().get("platform");
                } else {
                    objOpt17 = jSONObject17.opt("platform");
                }
                if (objOpt17 instanceof String) {
                    obj = objOpt17;
                }
                String str3 = (String) obj;
                if (str3 == null) {
                    return;
                }
                if (u.LJJIIJZLJL(str3, "chat", false)) {
                    c08kt11.LIZ(1, "is_shared_in");
                    return;
                } else {
                    c08kt11.LIZ(1, "is_shared_out");
                    return;
                }
            case 1190532130:
                if (!str.equals("like_cancel")) {
                    return;
                }
                JSONObject jSONObject18 = c08kw.LIZIZ;
                if (jSONObject18 == null) {
                    objOpt18 = c08kw.LIZIZ().get("group_id");
                } else {
                    objOpt18 = jSONObject18.opt("group_id");
                }
                if (!(objOpt18 instanceof String) || objOpt18 == null || (c08kt12 = (C08KT) LIZ().LIZ(objOpt18)) == null) {
                    return;
                }
                c08kt12.LIZ(num, "is_liked");
                return;
            case 1671642405:
                if (!str.equals("dislike")) {
                    return;
                }
                JSONObject jSONObject19 = c08kw.LIZIZ;
                if (jSONObject19 == null) {
                    objOpt19 = c08kw.LIZIZ().get("group_id");
                } else {
                    objOpt19 = jSONObject19.opt("group_id");
                }
                if (!(objOpt19 instanceof String) || objOpt19 == null || (c08kt13 = (C08KT) LIZ().LIZ(objOpt19)) == null) {
                    return;
                }
                c08kt13.LIZ(1, "is_disliked");
                return;
            default:
                return;
        }
    }
}

package X;

import Y.ACallableS19S2100000_9;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AwS27S0100001_35;

/* JADX INFO: renamed from: X.0mAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386110mAr {
    public static final C1386110mAr LIZ = new C1386110mAr();
    public static String LIZIZ;

    public static String LIZ(float f) {
        return new DecimalFormat("0.#", DecimalFormatSymbols.getInstance(Locale.US)).format(Float.valueOf(f));
    }

    public static void LIZLLL(Aweme aweme, String str, String str2) {
        C589960NBy.LIZ.getClass();
        if (C589960NBy.LIZ(aweme) && aweme != null && !TextUtils.isEmpty(aweme.getAid()) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C15O7.LIZIZ(new ACallableS19S2100000_9(aweme, str, str2, 0), C20684815ws.LJFF(), null);
            if (aweme.isAd()) {
                C2176151AEr c2176151AEr = new C2176151AEr(aweme);
                C2249251D1v.LIZ.getClass();
                c2176151AEr.logAd(C2249251D1v.LJFF);
            }
        }
    }

    public static void LJFF(Aweme aweme, String str, String str2) {
        C589960NBy.LIZ.getClass();
        if (C589960NBy.LIZ(aweme) && aweme != null && !TextUtils.isEmpty(aweme.getAid()) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C15O7.LIZIZ(new ACallableS19S2100000_9(aweme, str, str2, 1), C20684815ws.LJFF(), null);
            if (aweme.isAd()) {
                C2176151AEr c2176151AEr = new C2176151AEr(aweme);
                C2249251D1v.LIZ.getClass();
                c2176151AEr.logAd(C2249251D1v.LJ);
            }
        }
    }

    public static void LIZIZ(final float f, final Aweme aweme, final Float f2, final String str, final String str2, final HashMap map) {
        C589960NBy.LIZ.getClass();
        if (C589960NBy.LIZ(aweme) && aweme != null && !TextUtils.isEmpty(aweme.getAid()) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C15O7.LIZIZ(new Callable() { // from class: X.0MzD
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("FeedSpeedMobUtils@fb5d.mobSpeedChangeEvent$1");
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
                    c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
                    c2344009Gk.LJIIIIZZ("enter_from", str);
                    c2344009Gk.LJIIIIZZ("enter_method", str2);
                    C1386110mAr c1386110mAr = C1386110mAr.LIZ;
                    float f3 = f;
                    c1386110mAr.getClass();
                    c2344009Gk.LJIIIIZZ("speed_mode", C1386110mAr.LIZ(f3));
                    c2344009Gk.LJIIIIZZ("pad_interface_orientation", C1389340mG4.LIZIZ().LJFF ? "3" : "1");
                    c2344009Gk.LIZJ(0, "is_landscape_screen");
                    C01GW<C0RGG> c01gw = C0RGG.LJ;
                    c2344009Gk.LJIIIIZZ("is_clear_screen", C586380MzE.LIZ().LIZJ(str) ? "1" : CardStruct.IStatusCode.DEFAULT);
                    c2344009Gk.LJIIIIZZ("is_collection_item", aweme.isPaidContent ? "1" : CardStruct.IStatusCode.DEFAULT);
                    Float f4 = f2;
                    if (f4 != null) {
                        f4.floatValue();
                        c2344009Gk.LJFF("prev_speed_mode", C1386110mAr.LIZ(f4.floatValue()));
                    }
                    Iterator<T> it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        c2344009Gk.LJ(entry.getValue(), (String) entry.getKey());
                    }
                    C1612650s4F.LIZIZ(c2344009Gk, aweme);
                    C20684815ws.LJIILLIIL("change_video_speed", c2344009Gk.LIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FeedSpeedMobUtils@fb5d.mobSpeedChangeEvent$1");
                    return unit;
                }
            }, C20684815ws.LJFF(), null);
            if (aweme.isAd() && C13LQ.LJJIJIIJI(str2, new String[]{"long_press", "click_share_button"}) >= 0) {
                C2176151AEr c2176151AEr = new C2176151AEr(aweme);
                C2249251D1v.LIZ.getClass();
                c2176151AEr.logAd(C2249251D1v.LJI, new AwS27S0100001_35(c2176151AEr, f, 0));
            }
        }
    }

    public static void LJ(final long j, final long j2, final Aweme aweme, final String str, final String str2, final String str3) {
        C589960NBy.LIZ.getClass();
        if (C589960NBy.LIZ(aweme) && aweme != null && !TextUtils.isEmpty(aweme.getAid()) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C15O7.LIZIZ(new Callable() { // from class: X.0Mwn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("FeedSpeedMobUtils@fb5d.mobSpeedPlayTimeEvent$1");
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    Aweme aweme2 = aweme;
                    String str4 = str;
                    String str5 = str3;
                    String str6 = str2;
                    long j3 = j;
                    long j4 = j2;
                    c2344009Gk.LJFF("group_id", aweme2.getAid());
                    c2344009Gk.LJFF("author_id", AwemeExtKt.getAuthorUid(aweme2));
                    c2344009Gk.LJFF("enter_from", str4);
                    if (str5 != null && str5.length() != 0) {
                        c2344009Gk.LJFF("enter_method", str5);
                    }
                    c2344009Gk.LJFF("speed_mode", str6);
                    c2344009Gk.LJFF("pad_interface_orientation", C1389340mG4.LIZIZ().LJFF ? "3" : "1");
                    c2344009Gk.LIZLLL(j3, "duration");
                    if (C300710BqX.LIZ() && j4 > 0) {
                        c2344009Gk.LIZLLL(j4, "lock_duration");
                    }
                    InterfaceC1616480sAQ interfaceC1616480sAQLJIJI = C19252910Tv.LIZIZ.LIZLLL().LJIJI();
                    C589960NBy.LIZ.getClass();
                    c2344009Gk.LIZJ(interfaceC1616480sAQLJIJI.LJIILIIL(C589960NBy.LJI), "pad_lock_status");
                    C20684815ws.LJIILLIIL("video_speed_play_time", c2344009Gk.LIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FeedSpeedMobUtils@fb5d.mobSpeedPlayTimeEvent$1");
                    return unit;
                }
            }, C20684815ws.LJFF(), null);
        }
    }
}

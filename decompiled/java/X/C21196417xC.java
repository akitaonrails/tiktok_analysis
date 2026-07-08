package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17xC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21196417xC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(Long l, boolean z, boolean z2) {
        String string;
        String str;
        EnumC21192817wc enumC21192817wc = EnumC21192817wc.ON_DATA_READY;
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        LIZ(enumC21192817wc, string, null, Boolean.valueOf(z2), Boolean.valueOf(z), false, null, null, 196);
        C21196317xB.LIZ.getClass();
        if (!C21196317xB.LJ) {
            String str2 = "im";
            if (C21196317xB.LIZ(l)) {
                C21196317xB.LJ = true;
                if (z) {
                    str = "im";
                } else {
                    str = "api";
                }
                C21196317xB.LJII = str;
                C21196317xB.LJIIIZ = System.currentTimeMillis();
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - C21194817ww.LJIIIZ;
            Pair[] pairArr = new Pair[9];
            pairArr[0] = new Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
            pairArr[1] = new Pair("anchor_show_type", "live_cart_tag");
            pairArr[2] = new Pair("entrance_form", "live_cart");
            pairArr[3] = new Pair("page_name", "live");
            pairArr[4] = new Pair(Scene.SCENE_SERVICE, "bag");
            pairArr[5] = new Pair("duration", Long.valueOf(jCurrentTimeMillis));
            pairArr[6] = new Pair("user_type", C21196317xB.LJIIIIZZ);
            if (!z) {
                str2 = "api";
            }
            pairArr[7] = new Pair("source", str2);
            pairArr[8] = new Pair("has_ec_perm", Integer.valueOf(z2 ? 1 : 0));
            C1421105hJ.LIZLLL("rd_tiktokec_entrance_get", pairArr);
        }
    }

    public static void LIZ(EnumC21192817wc enumC21192817wc, String str, Boolean bool, Boolean bool2, Boolean bool3, boolean z, Integer num, Integer num2, int i) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3 = null;
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            bool3 = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            num = -1;
        }
        if ((i & 128) != 0) {
            num2 = -1;
        }
        try {
            if (!Intrinsics.LJFF(C1865520ye6.LIZ("rd_tiktokec_shopping_bag_step_event"), Boolean.FALSE)) {
                Pair[] pairArr = new Pair[10];
                pairArr[0] = new Pair("step", enumC21192817wc.name().toLowerCase(Locale.ROOT));
                pairArr[1] = new Pair("room_id", str);
                pairArr[2] = new Pair("is_banned", Boolean.valueOf(z));
                C21196317xB.LIZ.getClass();
                pairArr[3] = new Pair("is_moderator", Boolean.valueOf(Intrinsics.LJFF(C21196317xB.LJIIIIZZ, EnumC21196517xD.MODERATOR.getRoleStr())));
                if (bool != null) {
                    numValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
                } else {
                    numValueOf = null;
                }
                pairArr[4] = new Pair("is_page_visible", numValueOf);
                if (bool2 != null) {
                    numValueOf2 = Integer.valueOf(bool2.booleanValue() ? 1 : 0);
                } else {
                    numValueOf2 = null;
                }
                pairArr[5] = new Pair("has_ec_perm", numValueOf2);
                if (bool3 != null) {
                    numValueOf3 = Integer.valueOf(bool3.booleanValue() ? 1 : 0);
                }
                pairArr[6] = new Pair("is_from_message", numValueOf3);
                pairArr[7] = new Pair("is_preload", Integer.valueOf(C1542210qEd.LIZ(num) ? 1 : 0));
                pairArr[8] = new Pair("is_reuse", Integer.valueOf(C1542210qEd.LIZIZ(num) ? 1 : 0));
                pairArr[9] = new Pair("is_first_click", num2);
                C1421105hJ.LIZLLL("rd_tiktokec_shopping_bag_step_event", pairArr);
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}

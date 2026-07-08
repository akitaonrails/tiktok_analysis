package X;

import com.bytedance.keva.Keva;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Og0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625420Og0 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C603670Nm1());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C625800Ogc());
    public static volatile int LIZJ = C624670Oen.LIZ();
    public static volatile boolean LIZLLL;

    public static EnumC624770Oex LJFF() {
        C624890Of9 c624890Of9 = EnumC624770Oex.Companion;
        int i = LJIIIIZZ().getInt("key_download_state", EnumC624770Oex.UNINITIALIZED.getValue());
        c624890Of9.getClass();
        return C624890Of9.LIZ(i);
    }

    public static InterfaceC625970Ogt LJIIIIZZ() {
        return (InterfaceC625970Ogt) LIZ.getValue();
    }

    public static int LIZ() {
        int iIntValue;
        int i = LJIIIIZZ().getInt("keva_cache_count", C624670Oen.LIZ());
        if (LJ() == 1) {
            if (i != LIZJ) {
                LIZJ = i;
            }
            return LIZJ;
        }
        if (C624670Oen.LJ().contains(Integer.valueOf(i))) {
            iIntValue = i;
        } else {
            Integer numValueOf = C624670Oen.LJI.get(Integer.valueOf(i));
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(C624670Oen.LIZ());
            }
            iIntValue = numValueOf.intValue();
        }
        if (i != iIntValue) {
            LJIIIIZZ().LIZJ("keva_cache_count", iIntValue);
        }
        if (iIntValue != LIZJ) {
            LIZJ = iIntValue;
        }
        return LIZJ;
    }

    public static double LIZIZ() {
        return LJIIIIZZ().getDouble("key_cached_size", 0.0d);
    }

    public static int LIZJ() {
        return LJIIIIZZ().getInt("key_cached_video_count", 0);
    }

    public static int LIZLLL() {
        return LJIIIIZZ().getInt("default_enable_consumed_count", 0);
    }

    public static int LJ() {
        return LJIIIIZZ().getInt("default_enable_state", 0);
    }

    public static long LJI() {
        return Math.max(C625720OgU.LIZIZ().getLong("last_clear_cache_timestamp", 0L), ((Keva) LIZIZ.getValue()).getLong("key_last_clear_cache_timestamp", 0L));
    }

    public static String LJII() {
        String string = LJIIIIZZ().getString("last_open_date", "");
        return string != null ? string : "";
    }

    public static boolean LJIIIZ() {
        return LJIIIIZZ().getBoolean("key_is_wifi_only", true);
    }

    public static void LJIIJ(int i) {
        int i2;
        LJIIIIZZ().LIZJ("keva_cache_count", i);
        if (i < 0) {
            i2 = 0;
        } else {
            i2 = i;
        }
        LIZJ = i2;
        C625470Og5.LL.getClass();
        Iterator<InterfaceC625450Og3> it2 = C625470Og5.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().Wz1(i);
        }
    }

    public static void LJIIJJI(double d) {
        LJIIIIZZ().LJFF("key_cached_size", d);
        C625470Og5.LL.getClass();
        Iterator<InterfaceC625450Og3> it2 = C625470Og5.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().n11(d);
        }
    }

    public static void LJIIL(int i) {
        LJIIIIZZ().LIZJ("key_cached_video_count", i);
        C625470Og5.LL.getClass();
        Iterator<InterfaceC625450Og3> it2 = C625470Og5.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().dL1(i);
        }
    }

    public static void LJIILIIL(EnumC624770Oex enumC624770Oex) {
        C624890Of9 c624890Of9 = EnumC624770Oex.Companion;
        InterfaceC625970Ogt interfaceC625970OgtLJIIIIZZ = LJIIIIZZ();
        EnumC624770Oex enumC624770Oex2 = EnumC624770Oex.UNINITIALIZED;
        int i = interfaceC625970OgtLJIIIIZZ.getInt("key_download_state", enumC624770Oex2.getValue());
        c624890Of9.getClass();
        EnumC624770Oex enumC624770OexLIZ = C624890Of9.LIZ(i);
        LJIIIIZZ().LIZJ("key_download_state", enumC624770Oex.getValue());
        if (enumC624770OexLIZ == enumC624770Oex2 && enumC624770Oex != enumC624770Oex2) {
            LJIIIIZZ().LIZIZ("last_open_date", String.valueOf(System.currentTimeMillis()));
        }
        C625470Og5.LL.getClass();
        Iterator<InterfaceC625450Og3> it2 = C625470Og5.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().SL2(enumC624770Oex);
        }
    }

    public static void LJIILJJIL(boolean z) {
        LJIIIIZZ().LIZLLL("key_is_wifi_only", z);
        C625470Og5.LL.getClass();
        Iterator<InterfaceC625450Og3> it2 = C625470Og5.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().tF(z);
        }
    }
}

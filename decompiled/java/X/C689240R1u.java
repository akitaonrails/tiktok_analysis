package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.larus.business.markdown.api.model.CustomSpaceScene;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.AFwS328S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R1u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689240R1u {
    public static final C689240R1u LIZ = new C689240R1u();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(731));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(730));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(729));
    public static final AFwS231S0000000_3 LJ = AFwS231S0000000_3.get$arr$(280);
    public static final AFwS293S0000000_10 LJFF = AFwS293S0000000_10.get$arr$(60);
    public static final AFwS231S0000000_3 LJI = AFwS231S0000000_3.get$arr$(277);
    public static final LruCache<C2027007wq, Bitmap> LJII = new LruCache<>(32);
    public static final Object LJIIIIZZ = new Object();
    public static final AFwS328S0000000_3 LJIIIZ = AFwS328S0000000_3.get$arr$(5);
    public static final AFwS189S0000000_3 LJIIJ = AFwS189S0000000_3.get$arr$(1726);
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1725));
    public static final C01GW LJIIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1724));
    public static final AFwS241S0000000_10 LJIILIIL = AFwS241S0000000_10.get$arr$(598);
    public static final AFwS241S0000000_10 LJIILJJIL = AFwS241S0000000_10.get$arr$(597);
    public static final AFwS231S0000000_3 LJIILL = AFwS231S0000000_3.get$arr$(279);
    public static final AFwS231S0000000_3 LJIILLIIL = AFwS231S0000000_3.get$arr$(278);
    public static final AFwS231S0000000_3 LJIIZILJ = AFwS231S0000000_3.get$arr$(276);
    public static final AFwS241S0000000_10 LJIJ = AFwS241S0000000_10.get$arr$(600);
    public static final AFwS189S0000000_3 LJIJI = AFwS189S0000000_3.get$arr$(1733);
    public static final AFwS241S0000000_10 LJIJJ = AFwS241S0000000_10.get$arr$(599);
    public static final AFwS189S0000000_3 LJIJJLI = AFwS189S0000000_3.get$arr$(1729);
    public static final C01GW LJIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1732));
    public static final C01GW LJJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1731));
    public static final C01GW LJJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1728));
    public static final C01GW LJJIFFI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1727));
    public static final C01GW LJJII = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1730));
    public static final int LJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d)));
    public static final Typeface LJJIIJ;
    public static final Typeface LJJIIJZLJL;
    public static final Typeface LJJIIZ;
    public static final C01GW LJJIIZI;
    public static final C01GW LJJIJ;

    static {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(61);
        LJJIIJ = c444890HcV.getTypeface();
        C444890HcV c444890HcV2 = new C444890HcV();
        c444890HcV2.LIZ(63);
        LJJIIJZLJL = c444890HcV2.getTypeface();
        C444890HcV c444890HcV3 = new C444890HcV();
        c444890HcV3.LIZ(62);
        LJJIIZ = c444890HcV3.getTypeface();
        LJJIIZI = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(344));
        LJJIJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(345));
    }

    public static int LJI() {
        return ((Number) LJJII.getValue()).intValue();
    }

    public static C21419418s4 LIZIZ(Context context, C689180R1o c689180R1o) {
        C689190R1p c689190R1p;
        AFwS293S0000000_10 aFwS293S0000000_10 = LJFF;
        if (c689180R1o != null) {
            c689190R1p = c689180R1o.LIZIZ;
        } else {
            c689190R1p = null;
        }
        return new C21419418s4(0, C418440Gaw.LIZIZ(16), false, 1.5f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.6d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), new C14S0(((Number) LJIIZILJ.invoke(context)).intValue(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), (C21408418qI) aFwS293S0000000_10.invoke(context, c689190R1p), C1697810uHb.LJIIJJI(32, 20, 17, 17, 17, 17), null, null, LJJIIJZLJL, (C21380418lm) LJ.invoke(context), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 0, false, null, null, null, null, null, null, null, null, null, null, null, -155646017, 16777215);
    }

    public static C21419418s4 LJ(Context context, C689180R1o c689180R1o) {
        C21419418s4 c21419418s4;
        Object objPutIfAbsent;
        if (c689180R1o != null) {
            LIZ.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZLLL.getValue();
            Object objLIZIZ = concurrentHashMap.get(c689180R1o);
            if (objLIZIZ == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(c689180R1o, (objLIZIZ = LIZIZ(context, c689180R1o)))) != null) {
                objLIZIZ = objPutIfAbsent;
            }
            return (C21419418s4) objLIZIZ;
        }
        if (C467860IWi.LIZ(context)) {
            c21419418s4 = (C21419418s4) LIZJ.getValue();
        } else {
            c21419418s4 = (C21419418s4) LIZIZ.getValue();
        }
        if (c21419418s4 != null) {
            return c21419418s4;
        }
        return LIZIZ(context, null);
    }

    public static Bitmap LIZJ(Context context, int i, int i2, int i3) {
        if (context == null) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        Integer num = 180;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        c419910GdJ.LIZIZ = i2;
        c419910GdJ.LIZJ = i3;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        tuxIconDrawableLIZ.setBounds(0, 0, i2, i3);
        tuxIconDrawableLIZ.draw(canvas);
        if (num != null) {
            int iIntValue = num.intValue();
            Matrix matrix = new Matrix();
            matrix.postRotate(iIntValue);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
            bitmapCreateBitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
            return bitmapCreateBitmap2;
        }
        return bitmapCreateBitmap;
    }

    public static C21419418s4 LIZ(C689240R1u c689240R1u, C21419418s4 c21419418s4, boolean z, Context context, boolean z2, EnumC682700QqC enumC682700QqC, int i) {
        final boolean z3;
        List listLJIIJJI;
        List listLJIIJJI2;
        Map map;
        boolean z4;
        int iIntValue;
        boolean z5;
        Integer numLIZJ;
        EnumC682700QqC enumC682700QqC2 = enumC682700QqC;
        Context contextLIZIZ = context;
        CustomSpaceScene customSpaceScene = null;
        if ((i & 2) != 0) {
            AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
            if (abstractC1387200mCcLJFF != null) {
                contextLIZIZ = abstractC1387200mCcLJFF.LIZIZ();
            } else {
                contextLIZIZ = null;
            }
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        int i2 = 8;
        if ((i & 8) != 0) {
            enumC682700QqC2 = null;
        }
        c689240R1u.getClass();
        boolean zLJFF = Intrinsics.LJFF(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchMarkdownSpaceHighlightSwitch(), Boolean.TRUE);
        if (z && enumC682700QqC2 != EnumC682700QqC.PAGE_MIDDLE) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (((Number) AnonymousClass0781.LIZ.getValue()).intValue() != 1) {
            return c21419418s4;
        }
        int i3 = 5;
        if (z2) {
            if (z3) {
                listLJIIJJI = C1697810uHb.LJIIJJI(24, 20, 17, 15, 15, 15);
            } else {
                listLJIIJJI = C1697810uHb.LJIIJJI(15, 15, 15, 15, 15, 15);
            }
        } else if (z3) {
            listLJIIJJI = C1697810uHb.LJIIJJI(24, 20, 17, 17, 17, 17);
        } else {
            listLJIIJJI = C1697810uHb.LJIIJJI(15, 15, 15, 15, 15, 15);
        }
        float f = 1.3f;
        if (z3) {
            listLJIIJJI2 = C1697810uHb.LJIIJJI(Float.valueOf(1.2f), Float.valueOf(1.25f), Float.valueOf(1.3f), Float.valueOf(1.3f), Float.valueOf(1.3f), Float.valueOf(1.3f));
        } else {
            listLJIIJJI2 = null;
        }
        if (z3) {
            map = (Map) LJJIJ.getValue();
        } else {
            map = (Map) LJJIIZI.getValue();
        }
        C689290R1z c689290R1z = new C689290R1z(customSpaceScene, map, i3);
        boolean z6 = !z3;
        if (z3) {
            f = 1.5f;
            i2 = 12;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        boolean zLIZ = C1839007Ie.LIZ();
        boolean zLIZ2 = C301280BrS.LIZ();
        if (C301280BrS.LIZ() && !C07GM.LIZ() && C426750GoL.LJFF()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (contextLIZIZ != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zz, contextLIZIZ)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C14S0 c14s0 = new C14S0(iIntValue, 0, 0, true, true);
        if (C301280BrS.LIZ() && !C07GM.LIZ() && C426750GoL.LJFF()) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean zBooleanValue = ((Boolean) C0BCK.LIZ.getValue()).booleanValue();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("is_page", Boolean.valueOf(z)));
        ArrayList arrayList = new ArrayList();
        if (C0BQI.LIZ()) {
            arrayList.add(new AbstractC21434518uV(z3) { // from class: X.18rl
                public static final /* synthetic */ int LIZIZ = 0;
                public final boolean LIZ;

                @Override // X.AbstractC21434218uS
                public final Collection<String> LIZJ() {
                    return C1697810uHb.LJIILJJIL("short-answer");
                }

                public final int hashCode() {
                    return C786410Ut5.Z2(this.LIZ);
                }

                {
                    this.LIZ = z3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof C21417518rl) && this.LIZ == ((C21417518rl) obj).LIZ) {
                        return true;
                    }
                    return false;
                }

                @Override // X.AbstractC21434518uV
                public final Object LJ(C21432118u7 c21432118u7, C14S7 c14s7, InterfaceC21435018ua interfaceC21435018ua) {
                    return new C21418618rw(c21432118u7);
                }
            });
        }
        return C21419418s4.LIZ(c21419418s4, arrayList, 0, false, f, 0, 0, 0, c14s0, null, listLJIIJJI, listLJIIJJI2, null, null, z6, null, iLIZIZ, zLJFF, false, 0, false, null, null, zLIZ, c689290R1z, null, null, zLIZ2, false, z4, null, null, null, null, null, zBooleanValue, z5, null, mapLJIIJ, false, false, false, false, null, -411863045, 16416103);
    }
}

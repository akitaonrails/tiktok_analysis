package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.StreakResDebugInfo;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.06Hz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1583706Hz implements C06GZ {
    public static final C1583706Hz LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C01GW LIZLLL;
    public static final C054G LJ;
    public static C099G LJFF;
    public static volatile String LJI;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1583706Hz.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C1583706Hz c1583706Hz = new C1583706Hz();
        LIZIZ = c1583706Hz;
        LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1287));
        C1598406Nq c1598406Nq = c1583706Hz.LIZ;
        if (c1598406Nq == null) {
            synchronized (c1583706Hz) {
                c1598406Nq = c1583706Hz.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c1583706Hz.LIZ = c1598406Nq;
                }
            }
        }
        LJ = C2296808zG.LIZ(c1598406Nq.LIZ);
        LJI = "";
    }

    @Override // X.C06GZ
    public final void LIZIZ() {
    }

    @Override // X.C06GZ
    public final String LJII() {
        return "share_panel";
    }

    public final void LJIIL() {
        synchronized (this) {
            try {
                C099G c099g = LJFF;
                if (c099g == null || c099g.isCompleted()) {
                    LJFF = C23250099c.LIZIZ(LJ, null, null, new AnonymousClass0661(null), 3);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static Pair LJIIJJI() {
        String str = LJI;
        return (str.length() > 0 || 0 != 0) ? new Pair(0, str) : new Pair(1, null);
    }

    @Override // X.C06GZ
    public final void LJIIJ() {
        C1590906Kt.LIZ("StreakSharePanelResProvider, onLogin");
        LJIIL();
    }

    @Override // X.C06GZ
    public final int isAvailable() {
        return (LJI.length() == 0 ? 1 : 0) ^ 1;
    }

    @Override // X.C06GZ
    public final void onColdStartFinish() {
        C1590906Kt.LIZ("StreakSharePanelResProvider, onColdStartFinish");
        LJIIL();
    }

    @Override // X.C06GZ
    public final StreakResDebugInfo LIZ() {
        return new StreakResDebugInfo("share_panel", C06FV.LIZ().streakEggAnimationChannel, LJI.length() > 0, false);
    }

    @Override // X.C06GZ
    public final Pair<Integer, String> LIZLLL(int i, boolean z) {
        return new Pair<>(3, null);
    }

    @Override // X.C06GZ
    public final Pair<Integer, Uri> LJ(int i, EnumC1578706Gb enumC1578706Gb) {
        return new Pair<>(3, null);
    }

    @Override // X.C06GZ
    public final Object LJFF(int i, C1578806Gc c1578806Gc) {
        return new Pair(C2286608xc.LJ(3), null);
    }

    @Override // X.C06GZ
    public final Pair<Integer, Drawable> LJI(int i, EnumC1578706Gb enumC1578706Gb) {
        return new Pair<>(3, null);
    }

    /* JADX WARN: Path cross not found for [B:39:0x00af, B:42:0x00b5], limit reached: 81 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a4 -> B:37:0x00ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:66:0x0148
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(int r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1583706Hz.LJIIIIZZ(int, X.05Vn):java.lang.Object");
    }

    public static Object LJIIIZ(String str, RequestParams requestParams, C06I2 c06i2) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c06i2));
        LIZIZ.getClass();
        Forest forest = (Forest) LIZLLL.getValue();
        if (forest == null || forest.fetchResourceAsync(str, requestParams, new AwS581S0100000_2(c23260099m, 641)) == null) {
            C189200o6.m2constructorimpl(null);
            c23260099m.resumeWith(null);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c06i2);
        }
        return objLIZ;
    }

    @Override // X.C06GZ
    public final Pair<Integer, Integer> LIZJ(int i, EnumC1578706Gb enumC1578706Gb, Context context) {
        return new Pair<>(3, 0);
    }
}

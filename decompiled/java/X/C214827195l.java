package X;

import Y.ARunnableS0S2413100_32;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.195l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214827195l implements InterfaceC214832195q {
    public final DataChannel LIZ;
    public final C214831195p LIZIZ;
    public ViewGroup LIZJ;
    public EnumC214828195m LIZLLL;
    public boolean LJ;
    public List<C955080axe> LJFF;
    public View LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public ViewGroup LJIIJ;
    public int LJIIL;
    public final C19LV LJIIJJI = new C19LV(this, 9);
    public final C19LV LJIILIIL = new C19LV(this, 10);

    /* JADX WARN: Removed duplicated region for block: B:102:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x035d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.util.List<X.C955080axe> r23) {
        /*
            Method dump skipped, instruction units count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214827195l.LIZ(java.util.List):void");
    }

    public final void LIZIZ(List<C955080axe> list) {
        EnumC214828195m enumC214828195m;
        if (list.size() <= 2) {
            enumC214828195m = EnumC214828195m.LARGE;
        } else {
            enumC214828195m = EnumC214828195m.COMPACT;
        }
        if (enumC214828195m == this.LIZLLL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchTileSizeIfChanged size=");
        sbLIZ.append(list.size());
        sbLIZ.append(" category=");
        sbLIZ.append(enumC214828195m);
        sbLIZ.append(" (was=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(") → onTileSizeChanged");
        C20441214yg.LJIIIZ("LayoutGeometryComponent", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZLLL = enumC214828195m;
        C214831195p c214831195p = this.LIZIZ;
        c214831195p.getClass();
        c214831195p.LIZ(new C1158080gF4(enumC214828195m));
    }

    @Override // X.InterfaceC214832195q
    public void onEvent(AbstractC214838195w abstractC214838195w) {
        if (abstractC214838195w instanceof C960230b5x) {
            this.LJ = false;
        }
    }

    public C214827195l(DataChannel dataChannel, C214831195p c214831195p) {
        this.LIZ = dataChannel;
        this.LIZIZ = c214831195p;
    }

    public static final void LIZJ(int i, C214827195l c214827195l, Function1<? super EnumC21158817r8, Unit> function1, ViewGroup viewGroup, C118300cf c118300cf, long j, String str, String str2, boolean z, int i2, int i3) {
        if (i != c214827195l.LJIIL) {
            function1.invoke(EnumC21158817r8.LLILLJJLI);
            return;
        }
        if (viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
            C786410Ut5.Ed(i2, viewGroup);
            C786410Ut5.Kd(i3, viewGroup);
            C786410Ut5.LJLZ(0, viewGroup);
            if (!c214827195l.LJ && C1152520g66.LIZIZ()) {
                c214827195l.LJ = true;
                C20441214yg.LJIIIZ("LayoutGeometryComponent", "dispatchOverlayShownIfNeeded → onOverlayShown (hint timer anchor)");
                C214831195p c214831195p = c214827195l.LIZIZ;
                c214831195p.getClass();
                c214831195p.LIZ(C214841195z.LIZ);
            }
            function1.invoke(EnumC21158817r8.LL);
            return;
        }
        c118300cf.element++;
        long jUptimeMillis = SystemClock.uptimeMillis() - j;
        if (jUptimeMillis < 400) {
            HandlerHook.viewPostDelay(viewGroup, new ARunnableS0S2413100_32(i, c214827195l, function1, viewGroup, c118300cf, j, str, str2, z, i2, i3, 0), 16L);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("commitDeferredZeroSize phase=");
        sbLIZ.append(str);
        sbLIZ.append(" strategy=");
        sbLIZ.append(str2);
        sbLIZ.append(" warm=");
        sbLIZ.append(z);
        sbLIZ.append(" container still 0x0 after ");
        sbLIZ.append(c118300cf.element);
        sbLIZ.append(" attempts elapsedMs=");
        sbLIZ.append(jUptimeMillis);
        sbLIZ.append(" (epoch=");
        sbLIZ.append(i);
        sbLIZ.append("), scheduling recovery");
        C20441214yg.LJIIL("LayoutGeometryComponent", C2188811AlT.LIZIZ(sbLIZ));
        function1.invoke(EnumC21158817r8.LLILLL);
    }
}

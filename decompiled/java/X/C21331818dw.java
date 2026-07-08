package X;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18dw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21331818dw {
    public final C21325918cz LIZ;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public final CopyOnWriteArrayList<AbstractC21333318eB<?>> LIZIZ = new CopyOnWriteArrayList<>();
    public final ConcurrentHashMap<String, C21331918dx> LIZJ = new ConcurrentHashMap<>();
    public final Rect LIZLLL = new Rect();
    public final C01GW LJIIIIZZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new AwS576S0100000_32(this, 523));
    public final C21331718dv LJIIIZ = new InterfaceC21331618du() { // from class: X.18dv
        @Override // X.InterfaceC21331618du
        public final void LIZIZ() {
            this.LIZ.LJ();
        }
    };
    public final C19LX LJIIJ = new C19LX(this, 1);
    public final StringBuilder LJIIJJI = new StringBuilder();

    public final void LJ() {
        List<? extends InterfaceC1547330qMt> list;
        String strLIZ;
        C21331918dx c21331918dxPutIfAbsent;
        String str = this.LIZ.LJIILJJIL;
        if (str == null || a0.LJJJIL(str) || this.LJII) {
            return;
        }
        this.LJII = true;
        try {
            for (AbstractC21333318eB<?> abstractC21333318eB : this.LIZIZ) {
                if (abstractC21333318eB.getView().isAttachedToWindow() && (list = abstractC21333318eB.LLZLL) != null && (strLIZ = LIZ(abstractC21333318eB)) != null) {
                    float fLIZIZ = LIZIZ(abstractC21333318eB);
                    ConcurrentHashMap<String, C21331918dx> concurrentHashMap = this.LIZJ;
                    C21331918dx c21331918dx = concurrentHashMap.get(strLIZ);
                    if (c21331918dx == null && (c21331918dxPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZ, (c21331918dx = new C21331918dx()))) != null) {
                        c21331918dx = c21331918dxPutIfAbsent;
                    }
                    C21331918dx c21331918dx2 = c21331918dx;
                    for (InterfaceC1547330qMt interfaceC1547330qMt : list) {
                        if (!interfaceC1547330qMt.getDisable()) {
                            if (fLIZIZ <= 0.0f || fLIZIZ < interfaceC1547330qMt.getExposureThreshold()) {
                                LJII(fLIZIZ, strLIZ, abstractC21333318eB, c21331918dx2, interfaceC1547330qMt);
                            } else {
                                LJI(fLIZIZ, strLIZ, abstractC21333318eB, c21331918dx2, interfaceC1547330qMt);
                            }
                        }
                    }
                }
            }
            this.LJII = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJII = false;
            throw th;
        }
    }

    public final void LJFF() {
        if (!this.LJ || this.LJI || this.LIZIZ.isEmpty()) {
            return;
        }
        this.LJI = true;
        ((C21331518dt) this.LJIIIIZZ.getValue()).LIZIZ(this.LJIIIZ);
        LJ();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.18dv] */
    public C21331818dw(C21325918cz c21325918cz) {
        this.LIZ = c21325918cz;
    }

    public static void LIZJ(AbstractC21333318eB abstractC21333318eB) {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        Object tag = abstractC21333318eB.getView().getTag();
        if ((tag instanceof View.OnAttachStateChangeListener) && (onAttachStateChangeListener = (View.OnAttachStateChangeListener) tag) != null) {
            abstractC21333318eB.getView().removeOnAttachStateChangeListener(onAttachStateChangeListener);
            abstractC21333318eB.getView().setTag(null);
        }
    }

    public final String LIZ(AbstractC21333318eB<?> abstractC21333318eB) {
        String str = this.LIZ.LJIILJJIL;
        String str2 = null;
        if (str == null || !(!a0.LJJJIL(str))) {
            return null;
        }
        String elementId = abstractC21333318eB.getElementId();
        if (elementId != null && (!a0.LJJJIL(elementId))) {
            str2 = elementId;
        }
        this.LJIIJJI.setLength(0);
        this.LJIIJJI.append(str);
        if (str2 != null) {
            StringBuilder sb = this.LJIIJJI;
            sb.append(':');
            sb.append(str2);
        }
        return this.LJIIJJI.toString();
    }

    public final float LIZIZ(AbstractC21333318eB<?> abstractC21333318eB) {
        View view = abstractC21333318eB.getView();
        if (!view.isAttachedToWindow() || !view.isShown() || view.getVisibility() != 0 || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.getGlobalVisibleRect(this.LIZLLL)) {
            return 0.0f;
        }
        return Math.min(1.0f, (this.LIZLLL.width() * this.LIZLLL.height()) / (view.getWidth() * view.getHeight()));
    }

    public final void LJI(float f, String str, AbstractC21333318eB<?> abstractC21333318eB, C21331918dx c21331918dx, InterfaceC1547330qMt interfaceC1547330qMt) {
        String type = interfaceC1547330qMt.getType();
        c21331918dx.LIZJ(type, false);
        if (interfaceC1547330qMt.getExposureDeduplicate()) {
            if (!c21331918dx.LIZLLL.contains(type) && c21331918dx.LIZLLL(type, true)) {
                LIZLLL(interfaceC1547330qMt, abstractC21333318eB, str, f, false, 1);
                c21331918dx.LIZLLL.add(type);
                return;
            }
            return;
        }
        if (interfaceC1547330qMt.getExposureLost()) {
            if (!Intrinsics.LJFF(((LinkedHashMap) c21331918dx.LIZ).get(type), "exposure")) {
                Object obj = ((LinkedHashMap) c21331918dx.LIZ).get(type);
                if ((obj == null || Intrinsics.LJFF(obj, "lost")) && c21331918dx.LIZLLL(type, true)) {
                    LIZLLL(interfaceC1547330qMt, abstractC21333318eB, str, f, false, c21331918dx.LIZ(type));
                    c21331918dx.LIZ.put(type, "exposure");
                    return;
                }
                return;
            }
            return;
        }
        if (!c21331918dx.LJFF.contains(type) && c21331918dx.LIZLLL(type, true)) {
            LIZLLL(interfaceC1547330qMt, abstractC21333318eB, str, f, false, c21331918dx.LIZ(type));
            c21331918dx.LJFF.add(type);
        }
    }

    public final void LJII(float f, String str, AbstractC21333318eB<?> abstractC21333318eB, C21331918dx c21331918dx, InterfaceC1547330qMt interfaceC1547330qMt) {
        String type = interfaceC1547330qMt.getType();
        c21331918dx.LIZLLL(type, false);
        if (interfaceC1547330qMt.getExposureDeduplicate()) {
            if (interfaceC1547330qMt.getExposureLost() && c21331918dx.LIZLLL.contains(type) && !c21331918dx.LJ.contains(type) && c21331918dx.LIZJ(type, true)) {
                LIZLLL(interfaceC1547330qMt, abstractC21333318eB, str, f, true, 1);
                c21331918dx.LJ.add(type);
                return;
            }
            return;
        }
        if (interfaceC1547330qMt.getExposureLost()) {
            if (!Intrinsics.LJFF(((LinkedHashMap) c21331918dx.LIZ).get(type), "lost") && Intrinsics.LJFF(((LinkedHashMap) c21331918dx.LIZ).get(type), "exposure") && c21331918dx.LIZJ(type, true)) {
                LIZLLL(interfaceC1547330qMt, abstractC21333318eB, str, f, true, c21331918dx.LIZIZ(type));
                c21331918dx.LIZ.put(type, "lost");
                return;
            }
            return;
        }
        c21331918dx.LJFF.remove(type);
        c21331918dx.LIZJ(type, false);
    }

    public final void LIZLLL(InterfaceC1547330qMt interfaceC1547330qMt, AbstractC21333318eB<?> abstractC21333318eB, String str, float f, boolean z, int i) {
        if (i < 1) {
            return;
        }
        this.LIZ.LJ(interfaceC1547330qMt, abstractC21333318eB.getView(), abstractC21333318eB.LIZJ(), C2097608Jq.LJIIIIZZ(new Pair("exposure_id", str), new Pair("exposure_ratio", Float.valueOf(f)), new Pair("is_exposure_lost", Boolean.valueOf(z)), new Pair("exposure_count", Integer.valueOf(i))));
    }
}

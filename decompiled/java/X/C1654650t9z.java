package X;

import Y.AObserverS206S0100000_2;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t9z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654650t9z extends AbstractC2255721DQs<InterfaceC1465730oFH> implements InterfaceC1465730oFH, InterfaceC379610EuV {
    public static final C1654670tA1 LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final InterfaceC1465730oFH LLILLJJLI = this;
    public final List<EnumC1654620t9w> LLILLL = Collections.singletonList(EnumC1654620t9w.ANCHOR_FILTER);
    public final ConcurrentHashMap<EnumC1654620t9w, InterfaceC1654640t9y> LLILZ = new ConcurrentHashMap<>();
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
    public final Observer<Boolean> LLILZLL = new AObserverS206S0100000_2(this, 7);

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0tA1] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1654650t9z.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZ = new Object() { // from class: X.0tA1
        };
        LLJ = 8;
    }

    private final InterfaceC1460000o62 Z1() {
        return (InterfaceC1460000o62) this.LLILZIL.getValue(this, LLIZLLLIL[0]);
    }

    private final void W1() {
        LiveData<Boolean> liveDataPy1;
        LiveData<Boolean> liveDataPy12;
        InterfaceC1460000o62 interfaceC1460000o62Z1 = Z1();
        if (interfaceC1460000o62Z1 != null && (liveDataPy12 = interfaceC1460000o62Z1.Py1()) != null && Intrinsics.LJFF(liveDataPy12.getValue(), Boolean.TRUE)) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1441205kY(this, null), 3);
            return;
        }
        InterfaceC1460000o62 interfaceC1460000o62Z12 = Z1();
        if (interfaceC1460000o62Z12 == null || (liveDataPy1 = interfaceC1460000o62Z12.Py1()) == null) {
            return;
        }
        liveDataPy1.observe(this, this.LLILZLL);
    }

    public final void H() {
        LiveData<Boolean> liveDataPy1;
        LiveData<Boolean> liveDataPy12;
        InterfaceC1460000o62 interfaceC1460000o62Z1 = Z1();
        if (interfaceC1460000o62Z1 == null || (liveDataPy1 = interfaceC1460000o62Z1.Py1()) == null || !Intrinsics.LJFF(liveDataPy1.getValue(), Boolean.TRUE)) {
            return;
        }
        InterfaceC1460000o62 interfaceC1460000o62Z12 = Z1();
        if (interfaceC1460000o62Z12 != null && (liveDataPy12 = interfaceC1460000o62Z12.Py1()) != null) {
            liveDataPy12.removeObserver(this.LLILZLL);
        }
        Iterator<EnumC1654620t9w> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            InterfaceC1654640t9y interfaceC1654640t9y = this.LLILZ.get(it2.next());
            if (interfaceC1654640t9y != null) {
                C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("check ");
                sbLIZ.append(interfaceC1654640t9y.LJJI());
                C201955140j.LIZLLL(c1662160tM6, "EditTooltipLogicComponent", C2188811AlT.LIZIZ(sbLIZ));
                if (interfaceC1654640t9y.LJJLIL()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("show ");
                    sbLIZ2.append(interfaceC1654640t9y.LJJI());
                    C201955140j.LIZLLL(c1662160tM6, "EditTooltipLogicComponent", C2188811AlT.LIZIZ(sbLIZ2));
                    interfaceC1654640t9y.H();
                    interfaceC1654640t9y.z0();
                    return;
                }
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        W1();
    }

    public InterfaceC1465730oFH X1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1654650t9z(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1465730oFH
    public void ig(InterfaceC1654640t9y interfaceC1654640t9y) {
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register ");
        sbLIZ.append(interfaceC1654640t9y.LJJI());
        C201955140j.LIZLLL(c1662160tM6, "EditTooltipLogicComponent", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZ.put(interfaceC1654640t9y.LJJI(), interfaceC1654640t9y);
    }
}

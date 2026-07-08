package X;

import Y.AObserverS225S0100000_22;
import androidx.lifecycle.LiveData;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0o9F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461990o9F extends AbstractC2255721DQs<InterfaceC372160EiU> implements InterfaceC372160EiU, InterfaceC1462000o9G, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final int LLILZIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final ArrayList<InterfaceC1462000o9G> LLILLL = new ArrayList<>();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1461990o9F.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZIL = 8;
    }

    public InterfaceC372160EiU W1() {
        return this;
    }

    private final InterfaceC1455860nzM X1() {
        return (InterfaceC1455860nzM) this.LLILLJJLI.getValue(this, LLILZ[0]);
    }

    @Override // X.InterfaceC1462000o9G
    public boolean LLIIIJ() {
        ArrayList<InterfaceC1462000o9G> arrayList = this.LLILLL;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<InterfaceC1462000o9G> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().LLIIIJ()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC1462000o9G
    public boolean b0() {
        ArrayList<InterfaceC1462000o9G> arrayList = this.LLILLL;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<InterfaceC1462000o9G> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().b0()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC1462000o9G
    public boolean x0() {
        ArrayList<InterfaceC1462000o9G> arrayList = this.LLILLL;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<InterfaceC1462000o9G> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().x0()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveData<VEEditorAutoStartStopArbiter> liveDataB10;
        super.onCreate();
        InterfaceC1455860nzM interfaceC1455860nzMX1 = X1();
        if (interfaceC1455860nzMX1 == null || (liveDataB10 = interfaceC1455860nzMX1.b10()) == null) {
            return;
        }
        liveDataB10.observe(this, new AObserverS225S0100000_22(this, 77));
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1461990o9F(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC372160EiU
    public void FS1(InterfaceC1462000o9G interfaceC1462000o9G) {
        if (this.LLILLL.contains(interfaceC1462000o9G)) {
            return;
        }
        this.LLILLL.add(interfaceC1462000o9G);
    }

    @Override // X.InterfaceC1462000o9G
    public boolean LJL(boolean z) {
        ArrayList<InterfaceC1462000o9G> arrayList = this.LLILLL;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<InterfaceC1462000o9G> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().LJL(z)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC372160EiU
    public void cg1(InterfaceC1462000o9G interfaceC1462000o9G) {
        this.LLILLL.remove(interfaceC1462000o9G);
    }
}

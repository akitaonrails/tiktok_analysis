package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS145S0201000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS72S1000000_22;

/* JADX INFO: renamed from: X.0nEU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426800nEU extends i<InterfaceC1426280nDe, C1426750nEP, C1426770nER, C1340770kzj> implements InterfaceC379610EuV, InterfaceC1426280nDe {
    public final C1DRG LLJILJILJ;
    public final VideoPublishEditModel LLJILLL;
    public final InterfaceC1426280nDe LLJJ;
    public final Function0<C1426770nER> LLJJI;
    public final Function0<C1340770kzj> LLJJIII;
    public final C1426110nDN LLJJIJI;
    public final C1426250nDb LLJJIJIIJIL;
    public InterfaceC1426650nEF LLJJIJIL;
    public final List<Function2<Boolean, Integer, Unit>> LLJJJ;
    public final List<Function0<Unit>> LLJJJIL;
    public final List<Function0<Boolean>> LLJJJJ;

    @Override // X.InterfaceC1426280nDe
    public void LIZ() {
        i3(AFwS261S0000000_22.get$arr$(308));
        ir().LIZLLL(3);
        show();
        Vb1(true, 0);
        C1413450msx c1413450msx = C1413450msx.LIZ;
        String str = bb().LIZIZ;
        String strValueOf = String.valueOf(bb().LIZ);
        VideoPublishEditModel videoPublishEditModel = this.LLJILLL;
        c1413450msx.getClass();
        C1413450msx.LJIJ(videoPublishEditModel, str, "enter", strValueOf);
    }

    @Override // X.InterfaceC1426280nDe
    public void LIZLLL() {
        i3(AFwS261S0000000_22.get$arr$(306));
        Vb1(false, 0);
        ir().LIZLLL(0);
        bn().LIZ("", 2);
    }

    @Override // X.InterfaceC1426280nDe
    public C385670FAf<Boolean> LLL() {
        return Z1(new C2217381BqS() { // from class: X.0nET
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1426770nER) obj).LIZIZ);
            }
        });
    }

    @Override // X.InterfaceC1426280nDe
    public void UR() {
        i3(AFwS261S0000000_22.get$arr$(307));
    }

    @Override // X.InterfaceC1426280nDe
    public void VF() {
        i3(AFwS261S0000000_22.get$arr$(309));
    }

    @Override // X.InterfaceC1426280nDe
    public C1426590nE9 bb() {
        return (C1426590nE9) Z1(new C2217381BqS() { // from class: X.0nEW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1426770nER) obj).LIZ;
            }
        }).LIZJ();
    }

    @Override // X.InterfaceC1426280nDe
    public boolean onBackPressed() {
        C13EO c13eo = new C13EO(this.LLJJJJ);
        if (!c13eo.isEmpty()) {
            Iterator it2 = c13eo.iterator();
            while (it2.hasNext()) {
                if (((Boolean) ((Function0) it2.next()).invoke()).booleanValue()) {
                    return true;
                }
            }
        }
        if (!T2().LIZIZ) {
            return false;
        }
        hm1();
        return true;
    }

    @Override // X.InterfaceC1426280nDe
    public boolean V5() {
        return T2().LIZIZ;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        Iterator<Function0<Unit>> it2 = this.LLJJJIL.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().invoke();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public InterfaceC1426280nDe F4() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1426280nDe
    public C1426250nDb bn() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1426280nDe
    public void hm1() {
        LIZLLL();
    }

    @Override // X.InterfaceC1426280nDe
    public C1426110nDN ir() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1426770nER> o2() {
        return this.LLJJI;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1340770kzj> w2() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1426280nDe
    public void Eb(InterfaceC1426650nEF interfaceC1426650nEF) {
        this.LLJJIJIL = interfaceC1426650nEF;
    }

    @Override // X.InterfaceC1426280nDe
    public void IH(String str) {
        i3(new AwS72S1000000_22(str, 13));
    }

    @Override // X.InterfaceC1426280nDe
    public void Jt1(EnumC1426270nDd enumC1426270nDd) {
        i3(new AwS388S0200000_22(this, enumC1426270nDd, 259));
    }

    @Override // X.InterfaceC1426280nDe
    public void VB(Function2<? super Boolean, ? super Integer, Unit> function2) {
        this.LLJJJ.add(function2);
    }

    @Override // X.InterfaceC1426280nDe
    public void XH0(C1426830nEX c1426830nEX) {
        m3(new AwS601S0100000_22(c1426830nEX, 747));
    }

    @Override // X.InterfaceC1426280nDe
    public void gR0(Function0<Boolean> function0) {
        this.LLJJJJ.add(function0);
    }

    @Override // X.InterfaceC1426280nDe
    public void lB0(Function0<Unit> function0) {
        this.LLJJJIL.add(function0);
    }

    @Override // X.InterfaceC1426280nDe
    public void pt(Function0<Boolean> function0) {
        this.LLJJJJ.remove(function0);
    }

    @Override // X.InterfaceC1426280nDe
    public void Vb1(boolean z, int i) {
        Iterator<Function2<Boolean, Integer, Unit>> it2 = this.LLJJJ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().invoke(Boolean.valueOf(z), Integer.valueOf(i));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public C1426800nEU(C19A3 c19a3, C1DRG c1drg, int i, C113G c113g, VideoPublishEditModel videoPublishEditModel) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = videoPublishEditModel;
        this.LLJJ = this;
        this.LLJJI = new AwS145S0201000_22(c113g, i, this, 7);
        this.LLJJIII = new AwS566S0100000_22(this, 988);
        this.LLJJIJI = new C1426110nDN();
        this.LLJJIJIIJIL = new C1426250nDb() { // from class: X.0nEV
        };
        this.LLJJJ = new ArrayList();
        this.LLJJJIL = new ArrayList();
        this.LLJJJJ = new ArrayList();
    }
}

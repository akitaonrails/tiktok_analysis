package X;

import android.content.Context;
import com.bytedance.als.h0;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Evy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380520Evy extends C0ETZ<InterfaceC379280Ety, C380500Evw, C380490Evv, C380510Evx> implements InterfaceC379280Ety {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public final C19A3 LLJJI;
    public final C1DRG LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final Function0<C380500Evw> LLJJIJIIJIL;
    public final Function0<C380490Evv> LLJJIJIL;
    public final Function0<C380510Evx> LLJJJ;
    public final h0<C379430EuD> LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C380520Evy.class, "editingTextApi", "getEditingTextApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/edittext/EPAIGCEditTextApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJJIL = 8;
    }

    public final void LIZLLL() {
        cF(false);
    }

    public final InterfaceC379090Etf H4() {
        return (InterfaceC379090Etf) this.LLJJIJI.getValue(this, LLJJJJ[0]);
    }

    @Override // X.InterfaceC379280Ety
    public C379430EuD H92() {
        return this.LLJJJIL.LIZJ();
    }

    @Override // X.InterfaceC379280Ety
    public boolean D3() {
        if (!isShowing()) {
            return false;
        }
        LIZLLL();
        return true;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        EnumC379360Eu6 enumC379360Eu6;
        Object next;
        super.onCreate();
        List listLIZ = C379350Eu5.LIZ(this.LLJJI.getSceneContext());
        i3(new AwS584S0100000_5(listLIZ, (List<Pair<Long, Float>>) 278));
        if (this.LLJJJIL.LIZJ() != null || (enumC379360Eu6 = T2().LIZJ) == null) {
            return;
        }
        Iterator it2 = listLIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((C379430EuD) next).LIZ == enumC379360Eu6) {
                    break;
                }
            }
        }
        C379430EuD c379430EuD = (C379430EuD) next;
        if (c379430EuD != null) {
            cX0(c379430EuD);
        }
    }

    @Override // ge.i
    public Function0<C380500Evw> E3() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC379280Ety
    public C385670FAf<C379430EuD> YX() {
        return this.LLJJJIL;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    public final C19A3 getParentScene() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C380490Evv> o2() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C380510Evx> w2() {
        return this.LLJJJ;
    }

    public final void K4(C379430EuD c379430EuD) {
        i3(new AwS584S0100000_5(c379430EuD, 279));
        this.LLJJJIL.LJII(c379430EuD);
        Context sceneContext = this.LLJJI.getSceneContext();
        if (sceneContext != null) {
            new C0ZDN(sceneContext).LIZ(0);
        }
        LIZLLL();
    }

    @Override // X.InterfaceC379280Ety
    public void cF(boolean z) {
        if (z) {
            show();
        } else {
            H4().Tw2();
            hide();
        }
    }

    @Override // X.InterfaceC379280Ety
    public void cX0(C379430EuD c379430EuD) {
        i3(new AwS584S0100000_5(c379430EuD, 280));
        this.LLJJJIL.LJII(c379430EuD);
    }

    public C380520Evy(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c19a3;
        this.LLJJIII = c1drg;
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379090Etf.class, null);
        this.LLJJIJIIJIL = AFwS191S0000000_5.get$arr$(97);
        this.LLJJIJIL = AFwS191S0000000_5.get$arr$(96);
        this.LLJJJ = new AwS549S0100000_5(this, 276);
        this.LLJJJIL = new h0<>(null);
    }
}

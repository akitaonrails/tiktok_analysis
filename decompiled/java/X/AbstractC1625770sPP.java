package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sPP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1625770sPP implements InterfaceC1623190sLF {
    public final LifecycleOwner LL;
    public final InterfaceC1624480sNK LLILLJJLI;
    public final MutableLiveData<Integer> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<IStickerService.FaceSticker> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<StickerTagChangeData> LLILZIL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZLL = new MutableLiveData<>();
    public final List<InterfaceC1159800gHq> LLIZ = new ArrayList();
    public final List<InterfaceC1625520sP0> LLIZLLLIL = new ArrayList();
    public final C1625780sPQ LLJ = new InterfaceC1625520sP0() { // from class: X.0sPQ
        @Override // X.InterfaceC1625520sP0
        public final void LIZ(C1627360sRy c1627360sRy) {
            Iterator it2 = ((ArrayList) this.LL.LLIZLLLIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1625520sP0) it2.next()).LIZ(c1627360sRy);
            }
            this.LL.LLILZ.setValue(null);
        }

        @Override // X.InterfaceC1625520sP0
        public final void LIZIZ(C1627370sRz c1627370sRz) {
            Iterator it2 = ((ArrayList) this.LL.LLIZLLLIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1625520sP0) it2.next()).LIZIZ(c1627370sRz);
            }
            this.LL.LLILZ.setValue(C202008142k.LIZIZ(c1627370sRz.LIZ));
        }
    };
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1106));
    public final C1625950sPh LLJIJIL = new C1625950sPh();

    public final InterfaceC1625760sPO LJFF() {
        return (InterfaceC1625760sPO) this.LLJI.getValue();
    }

    @Override // X.InterfaceC1625800sPS
    public final C11NZ<Integer> Cm() {
        return LJFF().Cm();
    }

    @Override // X.InterfaceC1625760sPO
    public final View FG() {
        return LJFF().FG();
    }

    @Override // X.InterfaceC1625760sPO
    public final InterfaceC1635930sfn Fq() {
        return LJFF().Fq();
    }

    @Override // X.InterfaceC1625760sPO
    public final void QE() {
        LJFF().QE();
    }

    @Override // X.InterfaceC1625760sPO
    public final ViewGroup RN() {
        return LJFF().RN();
    }

    @Override // X.InterfaceC1625760sPO
    public final void V0() {
        LJFF().V0();
    }

    @Override // X.InterfaceC1625760sPO
    public final void hide() {
        LJFF().hide();
    }

    @Override // X.InterfaceC1625760sPO
    public final boolean isShowing() {
        return LJFF().isShowing();
    }

    @Override // X.InterfaceC1625760sPO
    public final C11NZ<AbstractC1557360qd4> k2() {
        return LJFF().k2();
    }

    @Override // X.InterfaceC1625760sPO
    public final C11NZ<EnumC1159860gHw> li() {
        return LJFF().li();
    }

    @Override // X.InterfaceC1625760sPO
    public final void prepare() {
        LJFF().prepare();
    }

    @Override // X.InterfaceC1625760sPO
    public final void show() {
        LJFF().show();
    }

    @Override // X.InterfaceC1625760sPO
    public final void zp() {
        LJFF().zp();
    }

    @Override // X.InterfaceC1623190sLF
    public final /* bridge */ /* synthetic */ MutableLiveData AG() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1623190sLF
    public final /* bridge */ /* synthetic */ MutableLiveData nu() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1623190sLF
    public final C1625950sPh sF() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1623190sLF
    public final void Bo(InterfaceC1159800gHq interfaceC1159800gHq) {
        if (!((ArrayList) this.LLIZ).contains(interfaceC1159800gHq)) {
            ((ArrayList) this.LLIZ).add(interfaceC1159800gHq);
        }
    }

    @Override // X.InterfaceC1623400sLa
    public final void LIZ(C579040MnO c579040MnO) {
        LJFF().LIZ(c579040MnO);
    }

    @Override // X.InterfaceC1623400sLa
    public final void LIZIZ(C579040MnO c579040MnO) {
        LJFF().LIZIZ(c579040MnO);
    }

    @Override // X.InterfaceC1625810sPT
    public final void LIZJ(List<? extends EffectCategoryModel> list) {
        LJFF().LIZJ(list);
    }

    @Override // X.InterfaceC1623400sLa
    public final void LIZLLL(InterfaceC1635880sfi interfaceC1635880sfi) {
        LJFF().LIZLLL(interfaceC1635880sfi);
    }

    public final void LJ(C1625790sPR c1625790sPR) {
        if (!((ArrayList) this.LLIZLLLIL).contains(c1625790sPR)) {
            ((ArrayList) this.LLIZLLLIL).add(c1625790sPR);
        }
    }

    @Override // X.InterfaceC1625760sPO
    public final void Zf(boolean z) {
        LJFF().Zf(z);
    }

    @Override // X.InterfaceC1625800sPS
    public final void in(boolean z) {
        LJFF().in(z);
    }

    @Override // X.InterfaceC1625800sPS
    public final void qB(Effect effect) {
        LJFF().qB(effect);
    }

    @Override // X.InterfaceC1625820sPU
    public final void qM(int i) {
        LJFF().qM(i);
    }

    @Override // X.InterfaceC1623190sLF
    public final void wk(Observer<StickerTagChangeData> observer) {
        this.LLILZIL.observe(this.LL, observer);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0sPQ] */
    public AbstractC1625770sPP(LifecycleOwner lifecycleOwner, InterfaceC1624480sNK interfaceC1624480sNK) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = interfaceC1624480sNK;
    }

    @Override // X.InterfaceC1625820sPU
    public final void YL(String str, boolean z) {
        LJFF().YL(str, z);
    }
}

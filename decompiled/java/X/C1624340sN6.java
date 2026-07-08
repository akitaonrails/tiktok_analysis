package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.sticker.bean.TemplateStickerState;
import com.ss.android.ugc.aweme.utils.UniqueLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS147S0201000_25;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS426S0200000_25;

/* JADX INFO: renamed from: X.0sN6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624340sN6 implements InterfaceC1625470sOv {
    public final MutableLiveData<Effect> LIZ = new MutableLiveData<>();
    public final MutableLiveData<C1624330sN5> LIZIZ = new MutableLiveData<>();
    public final MutableLiveData<C1624110sMj> LIZJ = new MutableLiveData<>();
    public final MutableLiveData<C1624320sN4> LIZLLL = new MutableLiveData<>();
    public final MutableLiveData<C1449000noI> LJ = new MutableLiveData<>();
    public final C2252321DDq LJFF = C1BNE.LIZ(C460401qk.LIZ);
    public final MutableLiveData<Effect> LJI = new MutableLiveData<>();
    public final MutableLiveData<Pair<Effect, Integer>> LJII;
    public final MutableLiveData<Map<String, Effect>> LJIIIIZZ;
    public final MutableLiveData<Effect> LJIIIZ;
    public Effect LJIIJ;
    public final UniqueLiveData<C1448480nnS> LJIIJJI;
    public final MutableLiveData<C1627370sRz> LJIIL;
    public final MutableLiveData LJIILIIL;

    @Override // X.InterfaceC1625470sOv
    public final Effect LJI() {
        C460701qn c460701qn;
        Object value = this.LJFF.getValue();
        if (!(value instanceof C460701qn) || (c460701qn = (C460701qn) value) == null) {
            return null;
        }
        return c460701qn.LIZ;
    }

    @Override // X.InterfaceC1625470sOv
    public final boolean LJIIIIZZ() {
        C1624110sMj value = this.LIZJ.getValue();
        return (value == null || value.LIZ == null || value.LIZIZ != null) ? false : true;
    }

    @Override // X.InterfaceC1625470sOv
    public final C095D LJJ() {
        return new C095D(new C460101qh(this.LJFF, null));
    }

    public C1624340sN6() {
        new MutableLiveData();
        MutableLiveData<Pair<Effect, Integer>> mutableLiveData = new MutableLiveData<>();
        this.LJII = mutableLiveData;
        this.LJIIIIZZ = new MutableLiveData<>();
        new MutableLiveData();
        this.LJIIIZ = new MutableLiveData<>();
        this.LJIIJJI = new UniqueLiveData<>();
        this.LJIIL = new MutableLiveData<>();
        this.LJIILIIL = mutableLiveData;
        new TemplateStickerState(new MutableLiveData(), new MutableLiveData());
    }

    @Override // X.InterfaceC1625470sOv
    public final MutableLiveData LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1625470sOv
    public final MutableLiveData LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1625470sOv
    public final MutableLiveData LJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1625470sOv
    public final MutableLiveData LJIIJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1625470sOv
    public final MutableLiveData LJIILIIL() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1625470sOv
    public final /* bridge */ /* synthetic */ MutableLiveData LJIILJJIL() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1625470sOv
    public final /* bridge */ /* synthetic */ UniqueLiveData LJIILL() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1625470sOv
    public final Effect LJIILLIIL() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1625470sOv
    public final MutableLiveData LJIIZILJ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1625470sOv
    public final MutableLiveData LJIJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1625470sOv
    public final MutableLiveData LJIJI() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1625470sOv
    public final MutableLiveData LJIJJLI() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1625470sOv
    public final void LIZIZ(int i) {
        if (i < 0) {
            return;
        }
        C421570Gfz.LIZ(new AwS413S0200000_12((MutableLiveData) this.LJIIJJI, (MutableLiveData<Object>) new C1448480nnS(i), (Object) 32));
    }

    @Override // X.InterfaceC1625470sOv
    public final void LIZJ(Effect effect) {
        this.LJIIIZ.setValue(effect);
    }

    @Override // X.InterfaceC1625470sOv
    public final void LJFF(Effect effect) {
        C421570Gfz.LIZ(new C020Y(this, effect, 29));
    }

    @Override // X.InterfaceC1625470sOv
    public final void LJIIIZ(C1449000noI c1449000noI) {
        C421570Gfz.LIZ(new AwS426S0200000_25(this, c1449000noI, 112));
    }

    @Override // X.InterfaceC1625470sOv
    public final void LJIIJJI(C1627370sRz c1627370sRz) {
        C421570Gfz.LIZ(new AwS413S0200000_12((MutableLiveData) this.LJIIL, (MutableLiveData<Object>) c1627370sRz, (Object) 32));
    }

    @Override // X.InterfaceC1625470sOv
    public final boolean LJIIL(Effect effect) {
        List<String> children;
        Boolean boolValueOf;
        Effect effect2 = this.LJIIJ;
        if (effect2 != null && (children = effect2.getChildren()) != null && effect != null && (boolValueOf = Boolean.valueOf(children.contains(effect.getEffectId()))) != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC1625470sOv
    public final void LJIJJ(Effect effect) {
        C421570Gfz.LIZ(new AwS426S0200000_25(this, effect, 113));
    }

    @Override // X.InterfaceC1625470sOv
    public final void LJII(int i, Effect effect) {
        this.LJII.setValue(new Pair<>(effect, Integer.valueOf(i)));
    }

    @Override // X.InterfaceC1625470sOv
    public final void LJIL(int i, Effect effect) {
        C421570Gfz.LIZ(new AwS147S0201000_25(this, i, effect, 10));
    }
}

package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.download.EffectDownloadController;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS636S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nFA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427220nFA implements C113J {
    public final /* synthetic */ C1427210nF9 LIZ;

    @Override // X.C113J
    public final int LIZ(int i) {
        return i;
    }

    @Override // X.C113J
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.C113J
    public final boolean LIZLLL() {
        this.LIZ.getClass();
        return !Intrinsics.LJFF(null, Boolean.FALSE);
    }

    @Override // X.C113J
    public final String LJI() {
        return this.LIZ.LLJILJILJ;
    }

    public C1427220nFA(C1427210nF9 c1427210nF9) {
        this.LIZ = c1427210nF9;
    }

    @Override // X.C113J
    public final Effect LJ(int i) {
        return ((C1427080nEw) ListProtector.get(this.LIZ.LLJILJIL, i)).LIZJ;
    }

    @Override // X.C113J
    public final boolean LJFF(String str) {
        C1427210nF9 c1427210nF9 = this.LIZ;
        if (c1427210nF9.LLILZ.LJJIJLIJ && c1427210nF9.LLILZIL.invoke(str).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // X.C113J
    public final void LIZIZ(int i, EffectModel effectModel) {
        AwS636S0100000_22 awS636S0100000_22 = this.LIZ.LLIZ;
        if (awS636S0100000_22 != null) {
            awS636S0100000_22.invoke(effectModel, Integer.valueOf(i));
        }
    }

    @Override // X.C113J
    public final boolean LJII(int i, int i2, EffectModel effectModel) {
        C1427070nEv c1427070nEv;
        int i3 = 0;
        if (i2 >= this.LIZ.LLJILJIL.size()) {
            return false;
        }
        Effect effect = ((C1427080nEw) ListProtector.get(this.LIZ.LLJILJIL, i2)).LIZJ;
        C1427210nF9 c1427210nF9 = this.LIZ;
        if (5 == i) {
            c1427210nF9.LLJJ = true;
            c1427210nF9.LLIZLLLIL.getValue().getClass();
            if (!EffectDownloadController.LJ(effect)) {
                C1427210nF9 c1427210nF92 = this.LIZ;
                AwS423S0200000_22 awS423S0200000_22 = new AwS423S0200000_22(c1427210nF92, effect, 10);
                c1427210nF92.getClass();
                if (!C20510015Ni.LIZ.LJIIIIZZ()) {
                    c1427210nF92.LLJ = awS423S0200000_22;
                    ((C1629670sVh) c1427210nF92.LLJI.getValue()).LIZ();
                    C1627000sRO.LIZIZ(c1427210nF92.LLILLJJLI, true);
                } else {
                    awS423S0200000_22.invoke();
                }
                C1427070nEv c1427070nEv2 = this.LIZ.LLILZLL;
                if (c1427070nEv2 != null) {
                    c1427070nEv2.LJIIJJI(effectModel.key);
                }
                return true;
            }
            this.LIZ.getClass();
            C1638230sjV.LIZ.LJI(effect, "editEffect_icon");
            this.LIZ.LLLFZ(i2, 16);
            this.LIZ.notifyItemChanged(i2);
        } else {
            if (5 != i) {
                if (i != 0 && 1 == i) {
                    C1427210nF9 c1427210nF93 = this.LIZ;
                    if (c1427210nF93.LLJJ) {
                        c1427210nF93.LLJJ = false;
                        return true;
                    }
                }
            }
            return true;
        }
        Boolean boolValueOf = null;
        if (Intrinsics.LJFF(effectModel.key, this.LIZ.LLJILJILJ) && (c1427070nEv = this.LIZ.LLILZLL) != null && c1427070nEv.LIZJ(effectModel)) {
            C1427210nF9 c1427210nF94 = this.LIZ;
            c1427210nF94.LLJILJILJ = null;
            c1427210nF94.notifyItemChanged(i2);
        } else {
            C1427070nEv c1427070nEv3 = this.LIZ.LLILZLL;
            if (c1427070nEv3 != null) {
                boolValueOf = Boolean.valueOf(c1427070nEv3.LIZLLL(effectModel, i2, false));
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                C1427210nF9 c1427210nF95 = this.LIZ;
                Iterator<C1427080nEw> it2 = c1427210nF95.LLJILJIL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().LIZ.key, c1427210nF95.LLJILJILJ)) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                C1427210nF9 c1427210nF96 = this.LIZ;
                c1427210nF96.LLJILJILJ = effectModel.key;
                c1427210nF96.notifyItemChanged(i3);
                this.LIZ.notifyItemChanged(i2);
            }
        }
        this.LIZ.LLIZLLLIL.getValue().getClass();
        InterfaceC1635410sex interfaceC1635410sexLIZ = C1427230nFB.LIZ();
        if (interfaceC1635410sexLIZ != null) {
            interfaceC1635410sexLIZ.LJJ(effect);
        }
        return true;
    }
}

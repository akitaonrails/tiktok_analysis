package X;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.FilterEffectTabFragment;
import com.ss.android.ugc.aweme.effect.download.EffectDownloadController;
import com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.112b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194355112b {
    public final /* synthetic */ FilterEffectTabFragment LIZ;

    public C194355112b(FilterEffectTabFragment filterEffectTabFragment) {
        this.LIZ = filterEffectTabFragment;
    }

    public final boolean LIZ(int i, int i2, EffectModel effectModel) {
        EditEffectVideoModel editEffectVideoModel;
        InterfaceC1635410sex interfaceC1635410sexLIZ;
        InterfaceC1635410sex interfaceC1635410sexLIZ2;
        C194356112c c194356112c = null;
        EditEffectVideoModel editEffectVideoModel2 = null;
        if (effectModel.isGoToCapCutEffect) {
            EditEffectVideoModel editEffectVideoModel3 = this.LIZ.LLJJIJI;
            if (editEffectVideoModel3 != null) {
                editEffectVideoModel2 = editEffectVideoModel3;
            }
            AnonymousClass0880.LIZ((MutableLiveData) editEffectVideoModel2.LLJJIJIL.getValue(), effectModel);
            return false;
        }
        FilterEffectTabFragment filterEffectTabFragment = this.LIZ;
        EditEffectVideoModel editEffectVideoModel4 = filterEffectTabFragment.LLJJIJI;
        if (editEffectVideoModel4 == null) {
            editEffectVideoModel = null;
        } else {
            editEffectVideoModel = editEffectVideoModel4;
        }
        if (editEffectVideoModel.LLJJJ && !filterEffectTabFragment.LLJJJJLIIL) {
            return false;
        }
        if (editEffectVideoModel4 == null) {
            editEffectVideoModel4 = null;
        }
        if (Intrinsics.LJFF(((LiveData) editEffectVideoModel4.LLJJIJIIJIL.getValue()).getValue(), Boolean.TRUE) && (5 == i || i == 0)) {
            return false;
        }
        FilterEffectTabFragment filterEffectTabFragment2 = this.LIZ;
        EditEffectVideoModel editEffectVideoModel5 = filterEffectTabFragment2.LLJJIJI;
        if (editEffectVideoModel5 == null) {
            editEffectVideoModel5 = null;
        }
        ArrayList<EffectPointModel> arrayListDt = editEffectVideoModel5.vQ2().dt();
        Effect effect = (Effect) ListProtector.get(filterEffectTabFragment2.NR(), i2);
        if (5 == i) {
            filterEffectTabFragment2.LLJJJJLIIL = true;
            filterEffectTabFragment2.SR(i2);
            if (filterEffectTabFragment2.LLJI != null && EffectDownloadController.LJ(effect)) {
                editEffectVideoModel5.xQ2().setValue(VEEffectSelectOp.selectTrans(effectModel));
                if (filterEffectTabFragment2.LLJI != null && (interfaceC1635410sexLIZ2 = C1427230nFB.LIZ()) != null) {
                    interfaceC1635410sexLIZ2.LJJ(effect);
                }
                if (!arrayListDt.isEmpty()) {
                    filterEffectTabFragment2.LLJILLL.add((EffectPointModel) ListProtector.get(arrayListDt, arrayListDt.size() - 1));
                    ArrayList<EffectPointModel> arrayList = filterEffectTabFragment2.LLJILLL;
                    if (((EffectPointModel) ListProtector.get(arrayList, arrayList.size() - 1)).getDuration() < 100) {
                        filterEffectTabFragment2.WR().performClick();
                    } else {
                        C786410Ut5.d1(filterEffectTabFragment2.WR(), 0);
                        if (filterEffectTabFragment2.ZR()) {
                            ((LiveData) filterEffectTabFragment2.LLJJJJJIL.getValue()).setValue(Boolean.FALSE);
                        }
                    }
                } else {
                    C201955140j.LJII(C20012313Rx.LIZIZ, "add effect fail");
                }
                C112W c112w = filterEffectTabFragment2.LLJJIII;
                if (c112w == null) {
                    c112w = null;
                }
                c112w.LLLFZ(i2, 16);
            } else {
                filterEffectTabFragment2.RR(new AwS430S0200000_29(filterEffectTabFragment2, effect, 13));
            }
        } else if (i == 0) {
            filterEffectTabFragment2.LLJJJJLIIL = true;
            if (filterEffectTabFragment2.LLIZLLLIL) {
                C194358112e c194358112e = filterEffectTabFragment2.LLJJIJIIJIL;
                if (c194358112e == null) {
                    c194358112e = null;
                }
                c194358112e.LIZ(i2);
            }
            filterEffectTabFragment2.SR(i2);
            if (filterEffectTabFragment2.LLJI != null && EffectDownloadController.LJ(effect)) {
                if (TextUtils.isEmpty(effectModel.resDir)) {
                    InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("applyFilter_resdir_null:");
                    String str = effectModel.key;
                    if (str == null) {
                        str = "";
                    }
                    sbLIZ.append(str);
                    interfaceC1637880siwLIZJ.LJI(C2188811AlT.LIZIZ(sbLIZ));
                }
                filterEffectTabFragment2.UR(Integer.valueOf(i), effectModel);
                if (filterEffectTabFragment2.LLJI != null && (interfaceC1635410sexLIZ = C1427230nFB.LIZ()) != null) {
                    interfaceC1635410sexLIZ.LJJ(effect);
                }
                C112W c112w2 = filterEffectTabFragment2.LLJJIII;
                if (c112w2 == null) {
                    c112w2 = null;
                }
                c112w2.LLLFZ(i2, 16);
            } else {
                filterEffectTabFragment2.RR(new AwS430S0200000_29(filterEffectTabFragment2, effect, 14));
            }
        } else if (1 == i && filterEffectTabFragment2.LLJJJJLIIL) {
            filterEffectTabFragment2.LLJJJJLIIL = false;
            if (filterEffectTabFragment2.LLIZLLLIL) {
                C194358112e c194358112e2 = filterEffectTabFragment2.LLJJIJIIJIL;
                if (c194358112e2 == null) {
                    c194358112e2 = null;
                }
                c194358112e2.LIZIZ(i2);
            }
            if (filterEffectTabFragment2.LLJI != null && EffectDownloadController.LJ(effect)) {
                C786410Ut5.d1(filterEffectTabFragment2.WR(), 0);
                editEffectVideoModel5.xQ2().setValue(VEEffectSelectOp.selectFilter(i, effectModel));
                if (filterEffectTabFragment2.ZR()) {
                    ((LiveData) filterEffectTabFragment2.LLJJJJJIL.getValue()).setValue(Boolean.FALSE);
                }
            }
        }
        C194356112c c194356112c2 = filterEffectTabFragment2.LLJJJIL;
        if (c194356112c2 != null) {
            c194356112c = c194356112c2;
        }
        c194356112c.LIZ = i;
        c194356112c.LIZIZ = i2;
        c194356112c.LIZJ = effectModel;
        return true;
    }
}

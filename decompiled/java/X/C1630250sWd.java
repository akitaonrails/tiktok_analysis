package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sWd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630250sWd implements Observer<Boolean> {
    public final LifecycleOwner LL;
    public final InterfaceC1624480sNK LLILLJJLI;
    public final InterfaceC1630220sWa LLILLL;
    public C19YA LLILZ;

    public final void LIZ(C19YA c19ya) {
        if (this.LLILZ != null) {
            return;
        }
        this.LLILZ = c19ya;
        this.LLILLJJLI.getStickerRepository().LJIILJJIL().LJJ().LJIILJJIL.observe(this.LL, this);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        int i;
        boolean zBooleanValue = bool.booleanValue();
        C19YA c19ya = this.LLILZ;
        if (c19ya != null && zBooleanValue) {
            InterfaceC1624480sNK interfaceC1624480sNK = this.LLILLJJLI;
            if (interfaceC1624480sNK.LJJLIIIJJIZ().LIZIZ) {
                i = 0;
                for (EffectCategoryModel effectCategoryModel : C23117093z.LJFF(interfaceC1624480sNK.getStickerRepository().LJFF())) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        if (Intrinsics.LJFF(effectCategoryModel.getKey(), "sticker_category:favorite")) {
                            break;
                        } else {
                            i = i2;
                        }
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                i = -1;
            } else {
                i = -1;
            }
            C12H3 tabAt = c19ya.getTabAt(i);
            if (tabAt != null && tabAt != c19ya.getCurSelectedTab() && this.LLILLL.LJFF()) {
                View view = tabAt.LJ;
                if (view != null && (view instanceof C1642680sqg)) {
                    ((C1642680sqg) view).LIZ(true);
                }
                this.LLILLL.LJ();
            }
        }
    }

    public C1630250sWd(LifecycleOwner lifecycleOwner, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1630220sWa interfaceC1630220sWa) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = interfaceC1624480sNK;
        this.LLILLL = interfaceC1630220sWa;
    }
}

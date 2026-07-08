package com.bytedance.android.live.effect.bgeffect;

import X.C0PEM;
import X.C0U6F;
import X.C0UMA;
import X.C0VSJ;
import X.C20441214yg;
import X.C207209166l;
import X.C207232167i;
import X.C2188811AlT;
import X.C23250099c;
import X.C500260Jjc;
import X.C760980TtA;
import X.EnumC771350UNp;
import X.InterfaceC761010TtD;
import Y.AObjectS312S0200000_12;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.p;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class BgEffectViewModel extends StickerEffectViewModel {
    public static final /* synthetic */ int LLJJIJIL = 0;
    public final C0UMA LLJJIJIIJIL;

    public BgEffectViewModel(C0UMA c0uma, C0U6F c0u6f) {
        super(c0uma, c0u6f);
        this.LLJJIJIIJIL = c0uma;
    }

    public final void ZQ2(String str, InterfaceC761010TtD interfaceC761010TtD) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C760980TtA(this, str, interfaceC761010TtD, null), 2);
    }

    public static void YQ2(String str, String str2, LiveEffect liveEffect) {
        if (str2 == null) {
            return;
        }
        C207209166l c207209166l = new C207209166l(str, EnumC771350UNp.SHARE_EFFECT, null, null, str2, null, false, 1, true, 236);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BgEffectViewModel downloadImage url:");
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("shared_bg", C2188811AlT.LIZIZ(sbLIZ));
        C207232167i.LIZIZ(c207209166l, new AObjectS312S0200000_12(liveEffect, c207209166l, 5));
    }

    public static void aR2(String str, List list, boolean z, boolean z2) {
        String strLJIL;
        boolean z3;
        int iHashCode = str.hashCode();
        if (iHashCode != 3536095) {
            if (iHashCode != 104256825) {
                if (iHashCode != 1485784640 || !str.equals("solo_new")) {
                    return;
                }
            } else {
                if (!str.equals("multi")) {
                    return;
                }
                try {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        LiveEffect liveEffect = (LiveEffect) it2.next();
                        new p();
                        k kVarLJJIIZ = p.LIZJ(liveEffect.getExtra()).LJIILIIL().LJJIIZ("multi_image");
                        if (kVarLJJIIZ != null) {
                            strLJIL = kVarLJJIIZ.LJIL();
                        } else {
                            strLJIL = null;
                        }
                        liveEffect.LLF(strLJIL);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(liveEffect.LJI());
                        sbLIZ.append(liveEffect.LJJLIIIJLLLLLLLZ());
                        liveEffect.LLJJJJJIL(C2188811AlT.LIZIZ(sbLIZ));
                        if (liveEffect.LJJLIIIJLLLLLLLZ() != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        liveEffect.LJJJJZ(z3);
                        if (C500260Jjc.LJJIIZ(liveEffect.LJJLIIIJLLLLLLLZ())) {
                            String fullPath = EnumC771350UNp.SHARE_EFFECT.getFullPath();
                            String strLJJLIIIJLLLLLLLZ = liveEffect.LJJLIIIJLLLLLLLZ();
                            if (strLJJLIIIJLLLLLLLZ != null) {
                                if (new C0VSJ(fullPath, strLJJLIIIJLLLLLLLZ).exists()) {
                                    if (z) {
                                        YQ2(strLJJLIIIJLLLLLLLZ, liveEffect.LLJLLIL(), liveEffect);
                                    } else {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append(fullPath);
                                        sbLIZ2.append(strLJJLIIIJLLLLLLLZ);
                                        liveEffect.LJJJJL(C2188811AlT.LIZIZ(sbLIZ2));
                                    }
                                } else if (z2) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("BgEffectViewModel processEffectList download shareImageId:");
                                    sbLIZ3.append(liveEffect.LJJLIIIJLLLLLLLZ());
                                    C20441214yg.LIZIZ("shared_bg", C2188811AlT.LIZIZ(sbLIZ3));
                                    YQ2(strLJJLIIIJLLLLLLLZ, liveEffect.LLJLLIL(), liveEffect);
                                }
                            }
                        }
                    }
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
            }
        } else if (!str.equals("solo")) {
            return;
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((LiveEffect) it3.next()).LJJLIIIIJ();
        }
    }
}

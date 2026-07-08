package X;

import Y.ACallableS32S0301000_29;
import Y.ACallableS99S0101000_29;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: renamed from: X.119L, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C119L implements InterfaceC19351710nL {
    public final /* synthetic */ C119K LL;

    public C119L(C119K c119k) {
        this.LL = c119k;
    }

    @Override // X.InterfaceC19351710nL
    public final void LIZ(final int i, View view) {
        CategoryPageModel categoryPageModel;
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        final Effect effect;
        String creationId;
        if (-1 == i) {
            return;
        }
        final C119K c119k = this.LL;
        c119k.LLILZLL = true;
        if (i == 0) {
            c119k.LLLII(i);
            c119k.LLILZIL.tH1(C364410EQl.LIZIZ());
            return;
        }
        if (i <= 0 || (categoryPageModel = c119k.LLIZLLLIL) == null || (categoryEffects = categoryPageModel.getCategoryEffects()) == null || (effects = categoryEffects.getEffects()) == null || (effect = (Effect) ListProtector.get(effects, i - 1)) == null) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("effect_name", effect.getName());
        c0lab.LJ("effect_id", effect.getEffectId());
        VideoPublishEditModel videoPublishEditModel = c119k.LLILLL;
        String str = "";
        if (videoPublishEditModel == null || (creationId = videoPublishEditModel.getCreationId()) == null) {
            creationId = "";
        }
        c0lab.LJ("creation_id", creationId);
        C20684815ws.LJIILLIIL("select_voice_effect", c0lab.LIZ);
        String unzipPath = effect.getUnzipPath();
        if (unzipPath == null) {
            unzipPath = "";
        }
        C119R.LIZ().getClass();
        if (C119S.LIZ(effect)) {
            String effectId = effect.getEffectId();
            if (effectId != null) {
                str = effectId;
            }
            c119k.LLLFZ(str, C19346310mT.LIZ(effect), unzipPath);
            c119k.LLLII(i);
            C119X c119x = c119k.LLJILJIL;
            if (c119x == null) {
                return;
            }
            c119x.LLLIIIIL(effect);
            return;
        }
        c119k.LLLI(i, 2);
        C119S c119sLIZ = C119R.LIZ();
        C119T c119t = new C119T() { // from class: X.119P
            @Override // X.C119T
            public final void LIZ(Effect effect2) {
                String effectId2;
                if (effect2 != null) {
                    effectId2 = effect2.getEffectId();
                } else {
                    effectId2 = null;
                }
                if (TextUtils.equals(effectId2, effect.getEffectId())) {
                    C15O7.LIZIZ(new ACallableS99S0101000_29(c119k, i, 1), C15O7.LJIIIIZZ, null);
                }
            }

            @Override // X.C119T
            public final void onSuccess(Effect effect2) {
                String effectId2;
                String strLIZ;
                String unzipPath2 = null;
                if (effect2 != null) {
                    effectId2 = effect2.getEffectId();
                } else {
                    effectId2 = null;
                }
                if (TextUtils.equals(effectId2, effect.getEffectId())) {
                    C15O7.LIZIZ(new ACallableS32S0301000_29(effect2, c119k, i, effect, 0), C15O7.LJIIIIZZ, null);
                    C119K c119k2 = c119k;
                    c119k2.getClass();
                    String str2 = "";
                    if (effect2 == null) {
                        strLIZ = null;
                    } else {
                        String effectId3 = effect2.getEffectId();
                        if (effectId3 != null) {
                            str2 = effectId3;
                        }
                        strLIZ = C19346310mT.LIZ(effect2);
                        unzipPath2 = effect2.getUnzipPath();
                    }
                    c119k2.LLLFZ(str2, strLIZ, unzipPath2);
                }
            }
        };
        c119sLIZ.getClass();
        InterfaceC1635410sex interfaceC1635410sexLIZIZ = C119R.LIZIZ();
        if (interfaceC1635410sexLIZIZ == null) {
            return;
        }
        interfaceC1635410sexLIZIZ.LIZJ(effect, new C1634530sdX(new C1634550sdZ("effect", new C19773712Yd(c119t, 0), false, null)));
    }
}

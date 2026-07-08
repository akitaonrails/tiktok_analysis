package X;

import com.ss.android.ugc.aweme.ad.feed.translation.ability.IAdPlayFunTranslationAbility;
import com.ss.android.ugc.aweme.api.component.translation.CommerceTranslationAssem;
import com.ss.android.ugc.aweme.feed.model.IAdTranslatableData;
import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0c34, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C996880c34 implements C0S7A {
    public final AbstractC738140SxQ LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 720));

    public C996880c34(CommerceTranslationAssem commerceTranslationAssem) {
        this.LIZ = commerceTranslationAssem;
    }

    @Override // X.C0S7A
    public final void LJJLJ(IAdTranslationData iAdTranslationData) {
        C996810c2x c996810c2x;
        IAdPlayFunTranslationAbility iAdPlayFunTranslationAbility;
        if (iAdTranslationData instanceof C996810c2x) {
            c996810c2x = (C996810c2x) iAdTranslationData;
        } else if (!(iAdTranslationData instanceof C997710c4P)) {
            return;
        } else {
            c996810c2x = (C996810c2x) ((C997710c4P) iAdTranslationData).LIZIZ.getValue();
        }
        if (c996810c2x != null && (iAdPlayFunTranslationAbility = (IAdPlayFunTranslationAbility) this.LIZIZ.getValue()) != null) {
            iAdPlayFunTranslationAbility.cv2(c996810c2x);
        }
    }

    @Override // X.C0S7A
    public final void LJZ(IAdTranslatableData iAdTranslatableData) {
        C996860c32 c996860c32;
        IAdPlayFunTranslationAbility iAdPlayFunTranslationAbility;
        if (iAdTranslatableData instanceof C996860c32) {
            c996860c32 = (C996860c32) iAdTranslatableData;
        } else if (!(iAdTranslatableData instanceof C997740c4S)) {
            return;
        } else {
            c996860c32 = (C996860c32) ((C997740c4S) iAdTranslatableData).LIZIZ.getValue();
        }
        if (c996860c32 != null && (iAdPlayFunTranslationAbility = (IAdPlayFunTranslationAbility) this.LIZIZ.getValue()) != null) {
            iAdPlayFunTranslationAbility.Sm2(c996860c32);
        }
    }
}

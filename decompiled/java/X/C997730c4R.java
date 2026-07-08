package X;

import com.ss.android.ugc.aweme.ad.feed.translation.ability.IAnoleComponentTranslationAbility;
import com.ss.android.ugc.aweme.api.component.translation.CommerceTranslationAssem;
import com.ss.android.ugc.aweme.feed.model.IAdTranslatableData;
import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0c4R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997730c4R implements C0S7A {
    public final AbstractC738140SxQ LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 721));

    public C997730c4R(CommerceTranslationAssem commerceTranslationAssem) {
        this.LIZ = commerceTranslationAssem;
    }

    @Override // X.C0S7A
    public final void LJJLJ(IAdTranslationData iAdTranslationData) {
        IAnoleComponentTranslationAbility iAnoleComponentTranslationAbility;
        C1002680cCQ c1002680cCQLIZ = C997720c4Q.LIZ(iAdTranslationData);
        if (c1002680cCQLIZ != null && ((Boolean) c1002680cCQLIZ.LIZJ.getValue()).booleanValue() && (iAnoleComponentTranslationAbility = (IAnoleComponentTranslationAbility) this.LIZIZ.getValue()) != null) {
            iAnoleComponentTranslationAbility.LJJLJ(c1002680cCQLIZ);
        }
    }

    @Override // X.C0S7A
    public final void LJZ(IAdTranslatableData iAdTranslatableData) {
        C1002620cCK c1002620cCK;
        IAnoleComponentTranslationAbility iAnoleComponentTranslationAbility;
        if (iAdTranslatableData instanceof C1002620cCK) {
            c1002620cCK = (C1002620cCK) iAdTranslatableData;
        } else if (!(iAdTranslatableData instanceof C997740c4S)) {
            return;
        } else {
            c1002620cCK = (C1002620cCK) ((C997740c4S) iAdTranslatableData).LIZLLL.getValue();
        }
        if (c1002620cCK != null && ((Boolean) c1002620cCK.LIZJ.getValue()).booleanValue() && (iAnoleComponentTranslationAbility = (IAnoleComponentTranslationAbility) this.LIZIZ.getValue()) != null) {
            iAnoleComponentTranslationAbility.LJZ(c1002620cCK);
        }
    }
}

package X;

import com.ss.android.ugc.aweme.ad.feed.translation.ability.ILynxComponentTranslationAbility;
import com.ss.android.ugc.aweme.api.component.translation.CommerceTranslationAssem;
import com.ss.android.ugc.aweme.feed.model.IAdTranslatableData;
import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0c35, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C996890c35 implements C0S7A {
    public final AbstractC738140SxQ LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 722));

    public C996890c35(CommerceTranslationAssem commerceTranslationAssem) {
        this.LIZ = commerceTranslationAssem;
    }

    @Override // X.C0S7A
    public final void LJJLJ(IAdTranslationData iAdTranslationData) {
        ILynxComponentTranslationAbility iLynxComponentTranslationAbility;
        C997570c4B c997570c4BLIZIZ = C997720c4Q.LIZIZ(iAdTranslationData);
        if (c997570c4BLIZIZ != null && c997570c4BLIZIZ.LIZ() != null && (iLynxComponentTranslationAbility = (ILynxComponentTranslationAbility) this.LIZIZ.getValue()) != null) {
            iLynxComponentTranslationAbility.zz1(c997570c4BLIZIZ);
        }
    }

    @Override // X.C0S7A
    public final void LJZ(IAdTranslatableData iAdTranslatableData) {
        C997620c4G c997620c4G;
        ILynxComponentTranslationAbility iLynxComponentTranslationAbility;
        if (iAdTranslatableData instanceof C997620c4G) {
            c997620c4G = (C997620c4G) iAdTranslatableData;
        } else if (!(iAdTranslatableData instanceof C997740c4S)) {
            return;
        } else {
            c997620c4G = (C997620c4G) ((C997740c4S) iAdTranslatableData).LIZJ.getValue();
        }
        if (c997620c4G != null && c997620c4G.LIZ() != null && (iLynxComponentTranslationAbility = (ILynxComponentTranslationAbility) this.LIZIZ.getValue()) != null) {
            iLynxComponentTranslationAbility.HY1(c997620c4G);
        }
    }
}

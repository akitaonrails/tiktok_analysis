package X;

import com.bytedance.android.live.effect.playcondition.EffectsFinishSettingCondition;

/* JADX INFO: renamed from: X.14kS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20353014kS implements C0UUD {
    public C20361214lm LIZ;
    public final /* synthetic */ EffectsFinishSettingCondition LIZIZ;

    @Override // X.C0UUD
    public final void LIZIZ(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd) {
    }

    public C20353014kS(EffectsFinishSettingCondition effectsFinishSettingCondition) {
        this.LIZIZ = effectsFinishSettingCondition;
    }

    @Override // X.C0UUD
    public final void LIZ(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd) {
        C20361214lm c20361214lm;
        if (enumC773040UUc == EnumC773040UUc.EFFECTS && (c20361214lm = this.LIZ) != null) {
            this.LIZIZ.LJIIJJI(C20352914kR.LIZ(c20361214lm), false);
        }
    }
}

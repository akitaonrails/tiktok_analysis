package X;

import com.ss.android.ugc.aweme.effect.EffectModel;

/* JADX INFO: renamed from: X.0nEc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1426880nEc extends C2217421BqW implements InterfaceC1685420txc<EffectModel, Integer, Boolean, String, Boolean, Boolean> {
    public C1426880nEc(C1426520nE2 c1426520nE2) {
        super(5, c1426520nE2, C1426520nE2.class, "handleEffectClick", "handleEffectClick(Lcom/ss/android/ugc/aweme/effect/EffectModel;IZLjava/lang/String;Z)Z", 0);
    }

    @Override // X.InterfaceC1685420txc
    public final Boolean invoke(EffectModel effectModel, Integer num, Boolean bool, String str, Boolean bool2) {
        boolean zBooleanValue = bool2.booleanValue();
        return Boolean.valueOf(((C1426520nE2) this.receiver).T4(effectModel, num.intValue(), bool.booleanValue(), str, zBooleanValue));
    }
}

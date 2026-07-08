package X;

import com.ss.android.ugc.aweme.effect.EffectModel;

/* JADX INFO: renamed from: X.0nEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1426890nEd extends C2217421BqW implements InterfaceC1631630sYr<EffectModel, Integer, String, Boolean, Boolean> {
    public C1426890nEd(C1426520nE2 c1426520nE2) {
        super(4, c1426520nE2, C1426520nE2.class, "handleEffectReClick", "handleEffectReClick(Lcom/ss/android/ugc/aweme/effect/EffectModel;ILjava/lang/String;Z)Z", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Boolean invoke(EffectModel effectModel, Integer num, String str, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        return Boolean.valueOf(((C1426520nE2) this.receiver).k5(effectModel, num.intValue(), str, zBooleanValue));
    }
}

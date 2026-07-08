package X;

import com.ss.android.ugc.aweme.effect.EffectModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0nEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1426930nEh extends C2217421BqW implements InterfaceC1631630sYr<EffectModel, Integer, String, Boolean, Unit> {
    public C1426930nEh(C1426520nE2 c1426520nE2) {
        super(4, c1426520nE2, C1426520nE2.class, "handleUnDownloadEffectClick", "handleUnDownloadEffectClick(Lcom/ss/android/ugc/aweme/effect/EffectModel;ILjava/lang/String;Z)V", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(EffectModel effectModel, Integer num, String str, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ((C1426520nE2) this.receiver).v5(effectModel, num.intValue(), str, zBooleanValue);
        return Unit.LIZ;
    }
}

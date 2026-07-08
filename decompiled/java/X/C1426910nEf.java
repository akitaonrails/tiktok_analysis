package X;

import com.ss.android.ugc.aweme.effect.EffectModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0nEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1426910nEf extends C2217421BqW implements InterfaceC1631630sYr<EffectModel, Integer, String, Boolean, Unit> {
    public C1426910nEf(C1426520nE2 c1426520nE2) {
        super(4, c1426520nE2, C1426520nE2.class, "handleEffectShow", "handleEffectShow(Lcom/ss/android/ugc/aweme/effect/EffectModel;ILjava/lang/String;Z)V", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(EffectModel effectModel, Integer num, String str, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ((C1426520nE2) this.receiver).n5(effectModel, num.intValue(), str, zBooleanValue);
        return Unit.LIZ;
    }
}

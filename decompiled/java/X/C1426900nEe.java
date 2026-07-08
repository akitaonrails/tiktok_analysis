package X;

import com.ss.android.ugc.aweme.effect.EffectModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0nEe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1426900nEe extends C2217421BqW implements InterfaceC1685420txc<EffectModel, Integer, String, Boolean, Function0<? extends Unit>, Unit> {
    public C1426900nEe(C1426520nE2 c1426520nE2) {
        super(5, c1426520nE2, C1426520nE2.class, "handleEffectLongClick", "handleEffectLongClick(Lcom/ss/android/ugc/aweme/effect/EffectModel;ILjava/lang/String;ZLkotlin/jvm/functions/Function0;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1685420txc
    public final Unit invoke(EffectModel effectModel, Integer num, String str, Boolean bool, Function0<? extends Unit> function0) {
        ((C1426520nE2) this.receiver).d5(effectModel, num.intValue(), str, bool.booleanValue(), function0);
        return Unit.LIZ;
    }
}

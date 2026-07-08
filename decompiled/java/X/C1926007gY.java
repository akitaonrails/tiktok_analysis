package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C1926007gY extends C2217421BqW implements Function1<Effect, C07TS> {
    public C1926007gY(C07TT c07tt) {
        super(1, c07tt, C07TT.class, "create", "create(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;)Lcom/ss/android/ugc/tiktok/eventtracking/group/PropIdParamGroup;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C07TS invoke(Effect effect) {
        Effect effect2 = effect;
        this.receiver.getClass();
        return new C07TS(effect2.getEffectId(), effect2.getResourceId());
    }
}

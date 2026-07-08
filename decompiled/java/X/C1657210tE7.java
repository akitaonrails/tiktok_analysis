package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tE7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1657210tE7 extends C2217421BqW implements Function1<Effect, Unit> {
    public C1657210tE7(C1656880tDa c1656880tDa) {
        super(1, c1656880tDa, C1656880tDa.class, "chooseEffect", "chooseEffect(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Effect effect) {
        ((C1656880tDa) this.receiver).O4(effect);
        return Unit.LIZ;
    }
}

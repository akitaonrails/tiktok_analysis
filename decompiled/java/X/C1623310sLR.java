package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sLR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1623310sLR extends C2217421BqW implements Function1<Effect, Unit> {
    public C1623310sLR(l0 l0Var) {
        super(1, l0Var, l0.class, "onEffectAutoDownload", "onEffectAutoDownload(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Effect effect) {
        ((l0) this.receiver).Be(effect);
        return Unit.LIZ;
    }
}

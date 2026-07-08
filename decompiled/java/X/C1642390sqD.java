package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sqD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1642390sqD extends C2217421BqW implements Function1<Effect, Unit> {
    public static final C1642390sqD LL = new C1642390sqD();

    public C1642390sqD() {
        super(1, C1642410sqF.class, "openUrl", "openUrl(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Effect effect) {
        Effect effect2 = effect;
        if (effect2 != null && effect2.getEffectType() == 2) {
            String schema = effect2.getSchema();
            C0CHQ.LIZ().getApplicationService().getClass();
            C19724912Fj.LIZLLL().LJII(schema);
        }
        return Unit.LIZ;
    }
}

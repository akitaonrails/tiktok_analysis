package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08wS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2279408wS {
    public static final Pair<Float, Float> LIZ = new Pair<>(Float.valueOf(0.25f), Float.valueOf(0.35f));
    public static final Pair<Float, Float> LIZIZ = new Pair<>(Float.valueOf(0.75f), Float.valueOf(0.65f));

    public static Object LIZ(final InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C1634250sd5.LIZ().LJJJJI("profilephoto", false, false, new IFetchEffectChannelListener() { // from class: X.08wR
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                InterfaceC1364105Vn<List<? extends Pair<C348460DlM, ? extends Effect>>> interfaceC1364105Vn2 = c23260099m;
                C13BV c13bv = C13BV.INSTANCE;
                C189200o6.m2constructorimpl(c13bv);
                interfaceC1364105Vn2.resumeWith(c13bv);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C2279108wP(effectChannelResponse, c23260099m, null), 3);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}

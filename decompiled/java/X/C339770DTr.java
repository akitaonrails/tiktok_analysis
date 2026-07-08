package X;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.effectcreator.protocol.IAIEffectEntranceService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0DTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.router.AVRouterIntentParse$openAMEEditor$1", f = "AVRouterIntentParse.kt", l = {530}, m = "invokeSuspend")
public final class C339770DTr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Uri LLILLJJLI;
    public final /* synthetic */ C1737170vJ5 LLILLL;
    public final /* synthetic */ Activity LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C339770DTr(Uri uri, C1737170vJ5 c1737170vJ5, Activity activity, InterfaceC1364105Vn<? super C339770DTr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = uri;
        this.LLILLL = c1737170vJ5;
        this.LLILZ = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C339770DTr(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IAIEffectEntranceService iAIEffectEntranceServiceLJFF;
        C1C7U.LIZ("AVRouterIntentParse@c36b.openAMEEditor$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IEffectCreatorService iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null);
            if (iEffectCreatorService != null && (iAIEffectEntranceServiceLJFF = iEffectCreatorService.LJFF()) != null) {
                boolean zLJFF = Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LLILLJJLI, "ame_enter_from"), "creator_center");
                this.LL = 1;
                obj = iAIEffectEntranceServiceLJFF.LIZIZ(zLJFF, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AVRouterIntentParse@c36b.openAMEEditor$1");
                    return objLJFF;
                }
            }
            C339780DTs.LIZJ(this.LLILLL, AFwS232S0000000_4.get$arr$(172));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AVRouterIntentParse@c36b.openAMEEditor$1");
            return unit;
        }
        if (((Boolean) obj).booleanValue()) {
            C120W c120w = C120W.LIZ;
            C1737170vJ5 c1737170vJ5 = this.LLILLL;
            Uri uri = this.LLILLJJLI;
            Activity activity = this.LLILZ;
            c120w.getClass();
            C120W.LIZIZ(c1737170vJ5, uri, activity);
        } else {
            C339780DTs.LIZJ(this.LLILLL, AFwS232S0000000_4.get$arr$(172));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AVRouterIntentParse@c36b.openAMEEditor$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

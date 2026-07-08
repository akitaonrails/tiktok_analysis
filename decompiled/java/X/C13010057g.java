package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.ecommerce.core.ecaction.ECActionApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.057g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.ecaction.ShowInboxEntranceCache$refreshCartItemCount$1", f = "ShowInboxEntranceCache.kt", l = {LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT}, m = "invokeSuspend")
public final class C13010057g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1124104aV LL;
    public int LLILLJJLI;

    public C13010057g(InterfaceC1364105Vn<? super C13010057g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13010057g(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1124104aV c1124104aV;
        C1C7U.LIZ("ShowInboxEntranceCache@6dd0.refreshCartItemCount$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                c1124104aV = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c1124104aV = C1124104aV.LIZ;
            C1321105Ez c1321105Ez = ECActionApi.LIZ;
            this.LL = c1124104aV;
            this.LLILLJJLI = 1;
            obj = c1321105Ez.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShowInboxEntranceCache@6dd0.refreshCartItemCount$1");
                return objLJFF;
            }
        }
        if (((Number) obj).intValue() <= 0) {
            z = false;
        }
        c1124104aV.getClass();
        C1124104aV.LIZJ = z;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShowInboxEntranceCache@6dd0.refreshCartItemCount$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C13010057g(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

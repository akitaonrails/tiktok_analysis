package X;

import com.bytedance.android.livesdk.model.PreviewEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Dk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.linkroom.MatchPlaybookUpdateObserver$onFunnyEffectChange$1", f = "MatchPlaybookUpdateObserver.kt", l = {304}, m = "invokeSuspend")
public final class C1317005Dk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PreviewEffect LLILLJJLI;
    public final /* synthetic */ C0UEA LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1317005Dk(PreviewEffect previewEffect, C0UEA c0uea, InterfaceC1364105Vn<? super C1317005Dk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = previewEffect;
        this.LLILLL = c0uea;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1317005Dk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MatchPlaybookUpdateObserver@fe95.onFunnyEffectChange$1");
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
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFunnyEffectChange, Changing effect to resId: ");
            sbLIZ.append(this.LLILLJJLI.resourceId);
            C20441214yg.LIZIZ("MatchPlaybookUpdateObserver", C2188811AlT.LIZIZ(sbLIZ));
            C0UEA c0uea = this.LLILLL;
            String str = this.LLILLJJLI.resourceId;
            this.LL = 1;
            if (c0uea.LIZ(str, this) == objLJFF) {
                C1C7U.LIZIZ("MatchPlaybookUpdateObserver@fe95.onFunnyEffectChange$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MatchPlaybookUpdateObserver@fe95.onFunnyEffectChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

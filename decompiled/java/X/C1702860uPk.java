package X;

import com.bytedance.android.livesdk.unityanimation.widget.EventAreaUnityAnimationWidget;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.android.livesdk.unityanimation.widget.EventAreaUnityAnimationWidget$checkQueue$job$1", f = "EventAreaUnityAnimationWidget.kt", l = {165}, m = "invokeSuspend")
public final class C1702860uPk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1749570vd5 LLILLJJLI;
    public final /* synthetic */ EventAreaUnityAnimationWidget LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702860uPk(AbstractC1749570vd5 abstractC1749570vd5, EventAreaUnityAnimationWidget eventAreaUnityAnimationWidget, InterfaceC1364105Vn<? super C1702860uPk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1749570vd5;
        this.LLILLL = eventAreaUnityAnimationWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702860uPk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EventAreaUnityAnimationWidget@4493.checkQueue$job$1");
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
            sbLIZ.append("start delay timeout job:");
            sbLIZ.append(this.LLILLJJLI.LL);
            sbLIZ.append("  delay time :");
            sbLIZ.append(((Number) this.LLILLJJLI.LLILZIL.getValue()).intValue());
            sbLIZ.append('s');
            C20441214yg.LIZIZ("EventAreaUnityAnimationWidget", C2188811AlT.LIZIZ(sbLIZ));
            long jIntValue = ((long) ((Number) this.LLILLJJLI.LLILZIL.getValue()).intValue()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jIntValue, this) == objLJFF) {
                C1C7U.LIZIZ("EventAreaUnityAnimationWidget@4493.checkQueue$job$1");
                return objLJFF;
            }
        }
        this.LLILLL.y1().remove(this.LLILLJJLI);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("timeout remove: ");
        sbLIZ2.append(this.LLILLJJLI.LL);
        C20441214yg.LIZIZ("EventAreaUnityAnimationWidget", C2188811AlT.LIZIZ(sbLIZ2));
        this.LLILLL.x1();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EventAreaUnityAnimationWidget@4493.checkQueue$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

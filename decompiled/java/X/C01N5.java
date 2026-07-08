package X;

import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01N5, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.bgbroadcast.GameUiStrategy$onPerceptionMessage$autoDismissJob$1", f = "GameUiStrategy.kt", l = {1368}, m = "invokeSuspend")
public final class C01N5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C776870Udh LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ PerceptionMessage LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01N5(C776870Udh c776870Udh, C118300cf c118300cf, PerceptionMessage perceptionMessage, InterfaceC1364105Vn<? super C01N5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c776870Udh;
        this.LLILLL = c118300cf;
        this.LLILZ = perceptionMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01N5(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameUiStrategy@3ab.onPerceptionMessage$autoDismissJob$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(180000L, this) == objLJFF) {
                C1C7U.LIZIZ("GameUiStrategy@3ab.onPerceptionMessage$autoDismissJob$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LJIIIZ(this.LLILLL.element, this.LLILZ.publicEventInfo, "", null, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameUiStrategy@3ab.onPerceptionMessage$autoDismissJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

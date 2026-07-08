package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionWidget;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionWidget$showSubscriptionPanel$1", f = "PreviewSubscriptionWidget.kt", l = {514}, m = "invokeSuspend")
public final class C493700JXs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PreviewSubscriptionWidget LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493700JXs(PreviewSubscriptionWidget previewSubscriptionWidget, boolean z, InterfaceC1364105Vn<? super C493700JXs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = previewSubscriptionWidget;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C493700JXs(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreviewSubscriptionWidget@bd0.showSubscriptionPanel$1");
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
            PreviewSubscriptionWidget previewSubscriptionWidget = this.LLILLJJLI;
            this.LL = 1;
            previewSubscriptionWidget.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            InterfaceC493650JXn interfaceC493650JXn = previewSubscriptionWidget.LLIZ;
            if (interfaceC493650JXn != null) {
                interfaceC493650JXn.LIZJ(new InterfaceC492450JSx() { // from class: X.0JXt
                    @Override // X.InterfaceC492450JSx
                    public final void LIZ(Throwable th) {
                        InterfaceC1364105Vn<GetSubInfoResponse> interfaceC1364105Vn = c23260099m;
                        C098200Yq c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                        interfaceC1364105Vn.resumeWith(c098200Yq);
                    }

                    @Override // X.InterfaceC492450JSx
                    public final void LIZIZ(GetSubInfoResponse getSubInfoResponse) {
                        InterfaceC1364105Vn<GetSubInfoResponse> interfaceC1364105Vn = c23260099m;
                        C189200o6.m2constructorimpl(getSubInfoResponse);
                        interfaceC1364105Vn.resumeWith(getSubInfoResponse);
                    }
                });
            }
            Object objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("PreviewSubscriptionWidget@bd0.showSubscriptionPanel$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.Y1();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreviewSubscriptionWidget@bd0.showSubscriptionPanel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

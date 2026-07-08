package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0eov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.toolbar.PcsToolbarAudienceServicePlusBehavior$observeAudienceEntranceVisibilityFromService$1", f = "PcsToolbarAudienceServicePlusBehavior.kt", l = {368}, m = "invokeSuspend")
public final class C1103430eov extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1103440eow LLILLJJLI;
    public final /* synthetic */ C1103320eok LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1103430eov(InterfaceC1103440eow interfaceC1103440eow, C1103320eok c1103320eok, InterfaceC1364105Vn<? super C1103430eov> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1103440eow;
        this.LLILLL = c1103320eok;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1103430eov(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsToolbarAudienceServicePlusBehavior@acda.observeAudienceEntranceVisibilityFromService$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951 = this.LLILLJJLI.LJ().LIZ;
            final C1103320eok c1103320eok = this.LLILLL;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0eou
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    int i2;
                    Boolean bool = (Boolean) obj2;
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        InterfaceC785120Ur0 interfaceC785120Ur0 = c1103320eok.LLJI;
                        if (interfaceC785120Ur0 != null) {
                            if (zBooleanValue) {
                                i2 = 0;
                            } else {
                                i2 = 8;
                            }
                            interfaceC785120Ur0.setVisibility(i2);
                        }
                        if (zBooleanValue && !c1103320eok.LLJILJILJ) {
                            C20441214yg.LIZIZ("ServiceIconConflictsResolution", "PcsToolbarAudienceServicePlusBehavior.observeAudienceEntranceVisibilityFromService -> logServicePlusIconShow first visible only");
                            c1103320eok.LJIIIZ();
                            C1103320eok c1103320eok2 = c1103320eok;
                            c1103320eok2.LLJILJILJ = true;
                            C1107120eus c1107120eus = c1103320eok2.LLJJ;
                            if (c1107120eus != null) {
                                c1107120eus.LIZ();
                            }
                        }
                        return Unit.LIZ;
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (anonymousClass0951.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("PcsToolbarAudienceServicePlusBehavior@acda.observeAudienceEntranceVisibilityFromService$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

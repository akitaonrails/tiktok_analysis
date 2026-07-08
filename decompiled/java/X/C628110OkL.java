package X;

import com.ss.android.ugc.aweme.template.datamodel.TemplateDetailModel;
import com.ss.android.ugc.aweme.template.datamodel.TemplateStructModel;
import com.ss.android.ugc.aweme.template.viewmodel.TemplateDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0OkL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.template.viewmodel.TemplateDetailViewModel$fetchTemplateDetail$2", f = "TemplateDetailViewModel.kt", l = {49}, m = "invokeSuspend")
public final class C628110OkL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TemplateDetailViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C628110OkL(TemplateDetailViewModel templateDetailViewModel, long j, InterfaceC1364105Vn<? super C628110OkL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = templateDetailViewModel;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C628110OkL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateDetailViewModel@ac67.fetchTemplateDetail$2");
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
            C628100OkK c628100OkK = InterfaceC628140OkO.LIZ;
            TemplateDetailViewModel templateDetailViewModel = this.LLILLJJLI;
            String str = templateDetailViewModel.LL;
            if (str != null) {
                Integer numLJ = C2286608xc.LJ(templateDetailViewModel.LLILLJJLI);
                Integer num = this.LLILLJJLI.LLILLL;
                C1429050nI7.LIZ.getClass();
                String str2 = (String) C1429050nI7.LIZ().getFirst();
                c628100OkK.getClass();
                C0CHQ.LIZ().getApplicationService();
                C613960O6g c613960O6gLIZIZ = C613940O6e.LIZ().LIZIZ(new C628120OkM(str, numLJ, num, C19221910Hx.LIZIZ(), str2));
                if (C627500OjM.LIZ()) {
                    C0O4P<TemplateDetailModel> value = C628100OkK.LIZJ.getValue();
                    AFwS292S0000000_9 aFwS292S0000000_9 = AFwS292S0000000_9.get$arr$(45);
                    AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(799);
                    Intrinsics.LJFF(TemplateDetailModel.class, C628170OkR.class);
                    c613960O6gLIZIZ.LIZ(new C0O8D(new C0O70(value, aFwS292S0000000_9, aFwS240S0000000_9, C628170OkR.class, TemplateDetailModel.class)));
                    C0O7F.LIZIZ(c613960O6gLIZIZ, C0O3P.CacheFirst);
                } else {
                    C0O7F.LIZIZ(c613960O6gLIZIZ, C0O3P.NetworkOnly);
                }
                InterfaceC346201Wa interfaceC346201WaLIZIZ = c613960O6gLIZIZ.LIZIZ();
                final long j = this.LLILLL;
                final TemplateDetailViewModel templateDetailViewModel2 = this.LLILLJJLI;
                InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0OkN
                    @Override // X.InterfaceC346701Wf
                    public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                        TemplateStructModel templateInfo;
                        boolean zIsCollected;
                        TemplateStructModel templateInfo2;
                        C0O7A c0o7a = (C0O7A) obj2;
                        if (c0o7a instanceof C0O79) {
                            boolean zLIZ = C0O7E.LIZ(c0o7a);
                            long jCurrentTimeMillis = System.currentTimeMillis() - j;
                            TemplateDetailViewModel templateDetailViewModel3 = templateDetailViewModel2;
                            C628290Okd.LIZIZ(jCurrentTimeMillis, templateDetailViewModel3.LL, templateDetailViewModel3.LLILLJJLI, "detail", true, Boolean.valueOf(zLIZ), null);
                            TemplateDetailModel templateDetailModel = ((C628170OkR) ((C0O79) c0o7a).LJ).LIZ;
                            if (templateDetailModel != null) {
                                TemplateDetailViewModel templateDetailViewModel4 = templateDetailViewModel2;
                                templateDetailModel.setFromCache(zLIZ);
                                if (zLIZ && templateDetailViewModel4.LLILZ != null && (templateInfo = templateDetailModel.getTemplateInfo()) != null) {
                                    TemplateDetailModel templateDetailModel2 = templateDetailViewModel4.LLILZ;
                                    if (templateDetailModel2 == null || (templateInfo2 = templateDetailModel2.getTemplateInfo()) == null || (zIsCollected = templateInfo2.isCollected()) == null) {
                                        zIsCollected = false;
                                    }
                                    templateInfo.setCollected(zIsCollected);
                                }
                                templateDetailViewModel4.LLILZ = templateDetailModel;
                                templateDetailViewModel4.setState(new AwS588S0100000_9(templateDetailModel, 554));
                            }
                        } else if (c0o7a instanceof C0O78) {
                            templateDetailViewModel2.setState(new AwS588S0100000_9(c0o7a, (C0O7A<C615690OCx>) 555));
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                            TemplateDetailViewModel templateDetailViewModel5 = templateDetailViewModel2;
                            C628290Okd.LIZIZ(jCurrentTimeMillis2, templateDetailViewModel5.LL, templateDetailViewModel5.LLILLJJLI, "detail", false, null, ((C0O78) c0o7a).LJFF.getMessage());
                        }
                        return Unit.LIZ;
                    }
                };
                this.LL = 1;
                if (interfaceC346201WaLIZIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                    C1C7U.LIZIZ("TemplateDetailViewModel@ac67.fetchTemplateDetail$2");
                    return objLJFF;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateDetailViewModel@ac67.fetchTemplateDetail$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

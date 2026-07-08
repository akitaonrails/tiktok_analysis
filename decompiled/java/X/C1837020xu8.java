package X;

import android.content.Context;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.viewmodel.PcsCourseDetailVM;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.smb.GetSMBCourseDetailResponse;

/* JADX INFO: renamed from: X.0xu8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.coursedetailpage.viewmodel.PcsCourseDetailVM$fetchCourseDetailInternal$1", f = "PcsCourseDetailVM.kt", l = {}, m = "invokeSuspend")
public final class C1837020xu8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ PcsCourseDetailVM LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function1<C0KUB, Unit> LLILZIL;
    public final /* synthetic */ Function1<C1791770wj9, Unit> LLILZLL;
    public final /* synthetic */ Function1<GetSMBCourseDetailResponse.Data, Unit> LLIZ;
    public final /* synthetic */ Function1<C518160KTu, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1837020xu8(Context context, PcsCourseDetailVM pcsCourseDetailVM, int i, Function0<Unit> function0, Function1<? super C0KUB, Unit> function1, Function1<? super C1791770wj9, Unit> function12, Function1<? super GetSMBCourseDetailResponse.Data, Unit> function13, Function1<? super C518160KTu, Unit> function14, InterfaceC1364105Vn<? super C1837020xu8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = pcsCourseDetailVM;
        this.LLILLL = i;
        this.LLILZ = function0;
        this.LLILZIL = function1;
        this.LLILZLL = function12;
        this.LLIZ = function13;
        this.LLIZLLLIL = function14;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1837020xu8(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [CALLBACK, X.0xuT] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        WeakReference weakReference;
        long j;
        long j2;
        long jLongValue;
        String str;
        Long l;
        C19EG c19egLIZ;
        C1C7U.LIZ("PcsCourseDetailVM@bb7.fetchCourseDetailInternal$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LL;
        if (context != null && (c19egLIZ = C1124140fMK.LIZ(context)) != null) {
            weakReference = new WeakReference(c19egLIZ);
        } else {
            weakReference = null;
        }
        C1836920xty c1836920xtyYQ2 = this.LLILLJJLI.yQ2();
        long j3 = -1;
        if (c1836920xtyYQ2 != null) {
            j = c1836920xtyYQ2.LLILLJJLI;
        } else {
            j = -1;
        }
        this.LLILLJJLI.yQ2();
        C1836920xty c1836920xtyYQ22 = this.LLILLJJLI.yQ2();
        if (c1836920xtyYQ22 != null) {
            j2 = c1836920xtyYQ22.LLILLL;
        } else {
            j2 = -1;
        }
        C1836920xty c1836920xtyYQ23 = this.LLILLJJLI.yQ2();
        if (c1836920xtyYQ23 != null && (l = c1836920xtyYQ23.LLILZ) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C1836920xty c1836920xtyYQ24 = this.LLILLJJLI.yQ2();
        if (c1836920xtyYQ24 != null) {
            j3 = c1836920xtyYQ24.LL;
        }
        C1836920xty c1836920xtyYQ25 = this.LLILLJJLI.yQ2();
        if (c1836920xtyYQ25 == null || (str = c1836920xtyYQ25.LLILZLL) == null) {
            str = "";
        }
        C1837760xvK c1837760xvKLIZ = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).Ae().LIZ(new C1837690xvD(j3, this.LLILLL, weakReference, j, j2, jLongValue, str));
        final PcsCourseDetailVM pcsCourseDetailVM = this.LLILLJJLI;
        final Function0<Unit> function0 = this.LLILZ;
        final Function1<C0KUB, Unit> function1 = this.LLILZIL;
        final Function1<C1791770wj9, Unit> function12 = this.LLILZLL;
        final Function1<GetSMBCourseDetailResponse.Data, Unit> function13 = this.LLIZ;
        final Function1<C518160KTu, Unit> function14 = this.LLIZLLLIL;
        ?? r5 = new InterfaceC1837970xvf() { // from class: X.0xuT
            @Override // X.InterfaceC1837970xvf
            public final void onStart() {
            }

            @Override // X.InterfaceC1837970xvf
            public final void LIZ(C1837250xuV c1837250xuV) {
                C518160KTu c518160KTu;
                if (c1837250xuV != null && (c518160KTu = c1837250xuV.LL) != null) {
                    function14.invoke(c518160KTu);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
            @Override // X.InterfaceC1837970xvf
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(X.AbstractC1837220xuS r10) {
                /*
                    Method dump skipped, instruction units count: 252
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1837230xuT.LIZIZ(X.0xuS):void");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC1837970xvf
            public final void LIZJ(C1837290xuZ c1837290xuZ) {
                Object obj2;
                BaseResponse baseResponse;
                Object obj3 = null;
                if (c1837290xuZ != null) {
                    obj2 = c1837290xuZ.LIZ;
                } else {
                    obj2 = null;
                }
                if ((obj2 instanceof C470590Icr) && (baseResponse = (BaseResponse) obj2) != null) {
                    obj3 = baseResponse.data;
                }
                if ((obj3 instanceof GetSMBCourseDetailResponse.Data) && obj3 != null) {
                    function13.invoke(obj3);
                } else {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("pcs_payment", "onBizFetchSuccess data is null");
                    function0.invoke();
                }
            }

            @Override // X.InterfaceC1837970xvf
            public final void LIZLLL(C1837280xuY c1837280xuY) {
                C1791770wj9 c1791770wj9;
                if (c1837280xuY != null && (c1791770wj9 = c1837280xuY.LIZ) != null) {
                    function12.invoke(c1791770wj9);
                }
            }
        };
        if (c1837760xvKLIZ != null) {
            c1837760xvKLIZ.LIZJ = r5;
            ((ConcurrentHashMap) c1837760xvKLIZ.LIZ.LIZJ().LIZIZ.getValue()).put("source", c1837760xvKLIZ.LIZ().getTag());
            c1837760xvKLIZ.LIZIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsCourseDetailVM@bb7.fetchCourseDetailInternal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

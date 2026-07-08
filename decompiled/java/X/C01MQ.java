package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import tikcast.api.anchor.AnchorLiveFragmentListResponse;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: renamed from: X.01MQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general.GeneralHighlightPopupHelper$getFragmentDetail$1", f = "GeneralHighlightPopupHelper.kt", l = {177}, m = "invokeSuspend")
public final class C01MQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function2<Boolean, LiveFragmentDetail, Unit> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01MQ(String str, InterfaceC1364105Vn interfaceC1364105Vn, Function2 function2) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01MQ(this.LLILLL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        LiveFragmentDetail liveFragmentDetail;
        AnchorLiveFragmentListResponse.ResponseData responseData;
        List<LiveFragmentDetail> list;
        LiveFragmentDetail next;
        C1C7U.LIZ("GeneralHighlightPopupHelper@9bd1.getFragmentDetail$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1DFB c1dfb = C0PEM.LIZJ;
                C01MR c01mr = new C01MR(this.LLILLL, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c01mr);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GeneralHighlightPopupHelper@9bd1.getFragmentDetail$1");
                    return objLJFF;
                }
            }
            C470590Icr c470590Icr = (C470590Icr) obj;
            if (c470590Icr != null && (responseData = (AnchorLiveFragmentListResponse.ResponseData) c470590Icr.data) != null && (list = responseData.fragmentList) != null) {
                String str = this.LLILLL;
                Iterator<LiveFragmentDetail> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.fragmentIdStr, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                liveFragmentDetail = next;
            } else {
                liveFragmentDetail = null;
            }
            if (liveFragmentDetail != null) {
                this.LLILLJJLI.invoke(true, liveFragmentDetail);
            } else {
                this.LLILLJJLI.invoke(false, null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (e instanceof CancellationException) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("GeneralHighlightPopupHelper@9bd1.getFragmentDetail$1");
                return unit;
            }
            this.LLILLJJLI.invoke(false, null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GeneralHighlightPopupHelper@9bd1.getFragmentDetail$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

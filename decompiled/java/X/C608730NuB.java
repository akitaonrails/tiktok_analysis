package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NuB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareProductSensor$tryToShowQSBForSelfAwemeShare$1", f = "QuickExternalShareProductSensor.kt", l = {427}, m = "invokeSuspend")
public final class C608730NuB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VideoItemParams LLILLJJLI;
    public final /* synthetic */ C608530Ntr LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C608730NuB(C608530Ntr c608530Ntr, VideoItemParams videoItemParams, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = videoItemParams;
        this.LLILLL = c608530Ntr;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C608730NuB(this.LLILLL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String aid;
        Aweme aweme;
        Map<String, Object> map;
        Function0<C690870R8b> function0;
        C690870R8b c690870R8bInvoke;
        C19EG c19egLIZ;
        C1C7U.LIZ("QuickExternalShareProductSensor@3aa2.tryToShowQSBForSelfAwemeShare$1");
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
            VideoItemParams videoItemParams = this.LLILLJJLI;
            if (videoItemParams == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("QuickExternalShareProductSensor@3aa2.tryToShowQSBForSelfAwemeShare$1");
                return unit;
            }
            C608590Ntx c608590Ntx = C608530Ntr.LLJJI;
            C704830Rkn c704830Rkn = this.LLILLL.LLILLL;
            c608590Ntx.getClass();
            if (c704830Rkn != null && (map = c704830Rkn.LJFF) != null) {
                map.put("video_item_params", videoItemParams);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryToShowQSBForSelfAwemeShare awemeid: ");
            VideoItemParams videoItemParams2 = this.LLILLJJLI;
            if (videoItemParams2 == null || (aweme = videoItemParams2.getAweme()) == null || (aid = aweme.getAid()) == null) {
                aid = null;
            }
            sbLIZ.append(aid);
            C2188811AlT.LIZIZ(sbLIZ);
            C1DFB c1dfb = C0PEM.LIZJ;
            C608720NuA c608720NuA = new C608720NuA(this.LLILLJJLI, this.LLILZ, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c608720NuA);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("QuickExternalShareProductSensor@3aa2.tryToShowQSBForSelfAwemeShare$1");
                return objLJFF;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("QuickExternalShareProductSensor@3aa2.tryToShowQSBForSelfAwemeShare$1");
            return unit2;
        }
        C704830Rkn c704830Rkn2 = this.LLILLL.LLILLL;
        if (c704830Rkn2 != null && (function0 = c704830Rkn2.LIZ) != null && (c690870R8bInvoke = function0.invoke()) != null && (c19egLIZ = C0O0B.LIZ(c690870R8bInvoke)) != null) {
            VideoItemParams videoItemParams3 = this.LLILLJJLI;
            C621180OYa.LIZIZ.LJJLIL(videoItemParams3.getAweme(), c19egLIZ, videoItemParams3.mEventType, new AwS588S0100000_9(this.LLILLL, 91));
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("QuickExternalShareProductSensor@3aa2.tryToShowQSBForSelfAwemeShare$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

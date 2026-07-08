package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NuC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareProductSensor$tryToUpdatePendingState$1", f = "QuickExternalShareProductSensor.kt", l = {323}, m = "invokeSuspend")
public final class C608740NuC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C608530Ntr LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ VideoItemParams LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C608740NuC(C608530Ntr c608530Ntr, VideoItemParams videoItemParams, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c608530Ntr;
        this.LLILLL = str;
        this.LLILZ = videoItemParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C608740NuC(this.LLILLJJLI, this.LLILZ, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map<String, Object> map;
        Function0<C690870R8b> function0;
        C690870R8b c690870R8bInvoke;
        C19EG c19egLIZ;
        C1C7U.LIZ("QuickExternalShareProductSensor@3aa2.tryToUpdatePendingState$1");
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
            this.LLILLJJLI.LJI().LLILLL = true;
            C608590Ntx c608590Ntx = C608530Ntr.LLJJI;
            C608530Ntr c608530Ntr = this.LLILLJJLI;
            C704830Rkn c704830Rkn = c608530Ntr.LLILLL;
            VideoItemParams videoItemParams = c608530Ntr.LLJJ;
            c608590Ntx.getClass();
            if (c704830Rkn != null && (map = c704830Rkn.LJFF) != null) {
                map.put("video_item_params", videoItemParams);
            }
            C259800zU c259800zU = new C259800zU();
            C1DFB c1dfb = C0PEM.LIZJ;
            C609060Nui c609060Nui = new C609060Nui(this.LLILLL, this.LLILZ, c259800zU, this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c609060Nui);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("QuickExternalShareProductSensor@3aa2.tryToUpdatePendingState$1");
                return objLJFF;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("QuickExternalShareProductSensor@3aa2.tryToUpdatePendingState$1");
            return unit;
        }
        C704830Rkn c704830Rkn2 = this.LLILLJJLI.LLILLL;
        if (c704830Rkn2 != null && (function0 = c704830Rkn2.LIZ) != null && (c690870R8bInvoke = function0.invoke()) != null && (c19egLIZ = C0O0B.LIZ(c690870R8bInvoke)) != null) {
            VideoItemParams videoItemParams2 = this.LLILZ;
            C621180OYa.LIZIZ.LJJLIL(videoItemParams2.getAweme(), c19egLIZ, videoItemParams2.mEventType, new AwS588S0100000_9(this.LLILLJJLI, 90));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("QuickExternalShareProductSensor@3aa2.tryToUpdatePendingState$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

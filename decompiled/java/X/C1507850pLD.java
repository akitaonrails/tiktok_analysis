package X;

import com.bytedance.scene.Scene;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pLD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatMonitor$send$1", f = "EcomLoadRetreatMonitor.kt", l = {37}, m = "invokeSuspend")
public final class C1507850pLD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1507860pLE LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1507850pLD(C1507860pLE c1507860pLE, InterfaceC1364105Vn<? super C1507850pLD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1507860pLE;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1507850pLD(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcomLoadRetreatMonitor@a014.send$1");
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
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("EcomLoadRetreatMonitor@a014.send$1");
                return objLJFF;
            }
        }
        Pair[] pairArr = new Pair[15];
        pairArr[0] = new Pair(Scene.SCENE_SERVICE, this.LLILLJJLI.LIZ);
        pairArr[1] = new Pair("enter", this.LLILLJJLI.LIZIZ);
        pairArr[2] = new Pair("exit", this.LLILLJJLI.LIZJ);
        pairArr[3] = new Pair("exit_page", C13LP.LJJLIIIJ(this.LLILLJJLI.LIZLLL, ",", null, null, 0, null, null, 62));
        String str = this.LLILLJJLI.LJ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        pairArr[4] = new Pair("exit_from", str);
        pairArr[5] = new Pair("preload_enter_task_count", C2286608xc.LJ(this.LLILLJJLI.LJFF));
        pairArr[6] = new Pair("preload_exit_priority_task_count", C2286608xc.LJ(this.LLILLJJLI.LJI));
        pairArr[7] = new Pair("preload_exit_default_task_count", C2286608xc.LJ(this.LLILLJJLI.LJII));
        pairArr[8] = new Pair("image_detach_count", C2286608xc.LJ(this.LLILLJJLI.LJIIIIZZ));
        pairArr[9] = new Pair("image_update_retreat_count", C2286608xc.LJ(this.LLILLJJLI.LJIIIZ));
        pairArr[10] = new Pair("image_update_real_count", C2286608xc.LJ(this.LLILLJJLI.LJIIJ));
        pairArr[11] = new Pair("ui_task_cnt", C2286608xc.LJ(this.LLILLJJLI.LJIIJJI));
        pairArr[12] = new Pair("discard_ui_task_cnt", C2286608xc.LJ(this.LLILLJJLI.LJIIL));
        pairArr[13] = new Pair("last_page_create_to_start", C2286608xc.LJFF(this.LLILLJJLI.LJIILIIL));
        String str3 = this.LLILLJJLI.LJIILJJIL;
        if (str3 != null) {
            str2 = str3;
        }
        pairArr[14] = new Pair("last_page_create_btm", str2);
        C1018703yb.LIZIZ("rd_tiktokec_load_retreat_monitor", C2097608Jq.LJIIIIZZ(pairArr));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcomLoadRetreatMonitor@a014.send$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import Y.AfS137S0200000_1;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.03Ld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel$queryRequestByChunk$1", f = "MiniOspViewModel.kt", l = {854}, m = "invokeSuspend")
public final class C827503Ld extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public MiniOspViewModel LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ MiniOspViewModel LLILZ;
    public final /* synthetic */ BillInfoRequest LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ ChangeInfo LLIZLLLIL;
    public final /* synthetic */ C05XL<Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C827503Ld(MiniOspViewModel miniOspViewModel, BillInfoRequest billInfoRequest, boolean z, boolean z2, ChangeInfo changeInfo, C05XL<Unit> c05xl, InterfaceC1364105Vn<? super C827503Ld> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = miniOspViewModel;
        this.LLILZIL = billInfoRequest;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = changeInfo;
        this.LLJ = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C827503Ld(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final C259800zU c259800zU;
        MiniOspViewModel miniOspViewModel;
        InterfaceC420801kM interfaceC420801kMLJJLL;
        C1C7U.LIZ("MiniOspViewModel@8f4.queryRequestByChunk$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                miniOspViewModel = this.LLILLJJLI;
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C11JF c11jf = this.LLILZ.LLLL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            c259800zU = new C259800zU();
            miniOspViewModel = this.LLILZ;
            C03WX c03wx = miniOspViewModel.LLJJL;
            if (c03wx != null) {
                BillInfoRequest billInfoRequest = this.LLILZIL;
                boolean z = !miniOspViewModel.LLJJIII;
                HashMap<String, Object> map = miniOspViewModel.LLJJJJ;
                if (map == null) {
                    map = new HashMap<>();
                }
                boolean z2 = this.LLILZLL;
                this.LL = c259800zU;
                this.LLILLJJLI = miniOspViewModel;
                this.LLILLL = 1;
                obj = c03wx.LJJJZ(billInfoRequest, z, map, z2, true, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MiniOspViewModel@8f4.queryRequestByChunk$1");
                    return objLJFF;
                }
            }
            interfaceC420801kMLJJLL = null;
            miniOspViewModel.LLLL = (C11JF) interfaceC420801kMLJJLL;
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MiniOspViewModel@8f4.queryRequestByChunk$1");
            return unit;
        }
        C11NZ c11nz = (C11NZ) obj;
        if (c11nz != null) {
            C11O8 c11o8LJJJLZIJ = c11nz.LJJJLZIJ(C1701940uOG.LIZIZ());
            final MiniOspViewModel miniOspViewModel2 = this.LLILZ;
            final BillInfoRequest billInfoRequest2 = this.LLILZIL;
            final boolean z3 = this.LLIZ;
            final ChangeInfo changeInfo = this.LLIZLLLIL;
            final C05XL<Unit> c05xl = this.LLJ;
            interfaceC420801kMLJJLL = c11o8LJJJLZIJ.LJJLL(new C09JN(c259800zU, billInfoRequest2, z3, changeInfo, c05xl) { // from class: X.0367
                public final /* synthetic */ C259800zU<BillInfoData> LLILLJJLI;
                public final /* synthetic */ BillInfoRequest LLILLL;
                public final /* synthetic */ ChangeInfo LLILZ;
                public final /* synthetic */ C05XL<Unit> LLILZIL;

                {
                    this.LLILZ = changeInfo;
                    this.LLILZIL = c05xl;
                }

                @Override // X.C09JN
                public final void accept(Object obj2) {
                    String string;
                    T t;
                    T t2;
                    IECommerceHostService iECommerceHostService;
                    C928103jz top;
                    Context context;
                    Activity activityLIZ;
                    C1C7U.LIZ("MiniOspViewModel@8f4.queryRequestByChunk$1$1");
                    Response response = (Response) obj2;
                    MiniOspViewModel miniOspViewModel3 = this.LL;
                    String name = null;
                    if (response != null) {
                        string = Integer.valueOf(response.code).toString();
                    } else {
                        string = null;
                    }
                    miniOspViewModel3.LLJ = string;
                    if (response != null) {
                        t = response.data;
                    } else {
                        t = null;
                    }
                    boolean z4 = false;
                    if (t == null) {
                        C1AF0.LIZJ("query by chunk data interrupt data null");
                        C1120604Zw c1120604Zw = C1120604Zw.LIZ;
                        String string2 = C7879035x.LIZ().getResources().getString(2131848101);
                        if (C034S.LIZ()) {
                            c1120604Zw.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                            if (iECommerceHostService != null) {
                                z4 = true;
                            }
                            String name2 = IApplicationDependencyService.class.getName();
                            if (iECommerceHostService != null) {
                                name = iECommerceHostService.getClass().getName();
                            }
                            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z4);
                        } else {
                            c1120604Zw.LIZ();
                            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                        }
                        InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
                        if (rootPageMonitor != null && (top = rootPageMonitor.getTop()) != null && (context = top.LIZ) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                            c1389890mGx.LJIIJ(string2);
                            c1389890mGx.LJIIJJI();
                        }
                        this.LL.setState(AFwS228S0000000_1.get$arr$(441));
                    } else {
                        C259800zU<BillInfoData> c259800zU2 = this.LLILLJJLI;
                        BillInfoData billInfoData = c259800zU2.element;
                        if (billInfoData == null) {
                            t2 = response.data;
                        } else {
                            t2 = (T) billInfoData.LJIILLIIL((BillInfoData) response.data);
                        }
                        c259800zU2.element = t2;
                        BillInfoData billInfoData2 = (BillInfoData) response.data;
                        if (billInfoData2 != null && Intrinsics.LJFF(billInfoData2.lastChunk, Boolean.TRUE)) {
                            this.LL.zQ2(this.LLILLJJLI.element, this.LLILLL, false, response.chunkIndex, this.LLILZ);
                            this.LL.setState(AFwS228S0000000_1.get$arr$(449));
                            this.LLILZIL.LJIIZILJ(Unit.LIZ);
                        }
                    }
                    C1C7U.LIZIZ("MiniOspViewModel@8f4.queryRequestByChunk$1$1");
                }
            }, new AfS137S0200000_1(c05xl, miniOspViewModel2, 8));
        } else {
            interfaceC420801kMLJJLL = null;
        }
        miniOspViewModel.LLLL = (C11JF) interfaceC420801kMLJJLL;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MiniOspViewModel@8f4.queryRequestByChunk$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

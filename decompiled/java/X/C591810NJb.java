package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeCacheVideoManager$cacheVideos$1$1", f = "OfflineModeCacheVideoManager.kt", l = {229}, m = "invokeSuspend")
public final class C591810NJb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591810NJb(String str, String str2, InterfaceC1364105Vn<? super C591810NJb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591810NJb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iLJIL;
        C1C7U.LIZ("OfflineModeCacheVideoManager@1e1d.cacheVideos$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                String str = this.LLILLJJLI;
                if (str != null) {
                    C625530OgB c625530OgB = C625530OgB.LIZ;
                    String str2 = this.LLILLL;
                    this.LL = 1;
                    c625530OgB.getClass();
                    InterfaceC625570OgF interfaceC625570OgFLIZLLL = C625530OgB.LIZLLL();
                    String curSecUserId = C625530OgB.LIZLLL.getCurSecUserId();
                    if (curSecUserId == null) {
                        iLJIL = 0;
                    } else {
                        iLJIL = interfaceC625570OgFLIZLLL.LJIL(curSecUserId, str2, str);
                    }
                    if (C2286608xc.LJ(iLJIL) == objLJFF) {
                        C1C7U.LIZIZ("OfflineModeCacheVideoManager@1e1d.cacheVideos$1$1");
                        return objLJFF;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C625460Og4.LIZLLL.LJ(String.valueOf(e));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeCacheVideoManager@1e1d.cacheVideos$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.services.external.RefreshQuotaScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LXW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.aigc.quota.AIGCQuotaManager$refreshQuotaCache$job$1", f = "AIGCQuotaManager.kt", l = {149}, m = "invokeSuspend")
public final class C0LXW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ RefreshQuotaScene LLILLL;
    public final /* synthetic */ C554380Loi LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LXW(String str, RefreshQuotaScene refreshQuotaScene, C554380Loi c554380Loi, InterfaceC1364105Vn<? super C0LXW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = refreshQuotaScene;
        this.LLILZ = c554380Loi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LXW(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCQuotaManager@347.refreshQuotaCache$job$1");
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
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", start refreshQuotaCache, ");
            sbLIZ.append(this.LLILLL);
            C201955140j.LIZIZ("AIGCQuotaManager", C2188811AlT.LIZIZ(sbLIZ));
            C554380Loi c554380Loi = this.LLILZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            if (c554380Loi.LIZJ(str, this) == objLJFF) {
                C1C7U.LIZIZ("AIGCQuotaManager@347.refreshQuotaCache$job$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCQuotaManager@347.refreshQuotaCache$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

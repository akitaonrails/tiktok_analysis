package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.entrance.SmartReplyIntroBannerUtil$onBannerAction$1", f = "SmartReplyIntroBannerUtil.kt", l = {158}, m = "invokeSuspend")
public final class C1309205Ak extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1309205Ak(int i, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = i;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1309205Ak c1309205Ak = new C1309205Ak(this.LLILZIL, this.LLILLL, this.LLILZ, this.LLILZLL, interfaceC1364105Vn);
        c1309205Ak.LLILLJJLI = obj;
        return c1309205Ak;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartReplyIntroBannerUtil@62a5.onBannerAction$1");
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
                String str = this.LLILLL;
                String str2 = this.LLILZ;
                int i2 = this.LLILZIL;
                String str3 = this.LLILZLL;
                TikTokImApi tikTokImApiLIZJ = C1477105qL.LIZJ();
                this.LL = 1;
                obj = tikTokImApiLIZJ.acknowledgeNoticeRead(str, str2, i2, str3, null, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SmartReplyIntroBannerUtil@62a5.onBannerAction$1");
                    return objLJFF;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("acknowledgeNoticeRead result:");
            sbLIZ.append((BaseResponse) obj);
            C2188811AlT.LIZIZ(sbLIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartReplyIntroBannerUtil@62a5.onBannerAction$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

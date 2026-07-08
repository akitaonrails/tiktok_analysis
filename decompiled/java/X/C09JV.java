package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09JV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerView$bindOrgIconForCompile$1", f = "DonationStickerView.kt", l = {364}, m = "invokeSuspend")
public final class C09JV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Boolean>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C424630Gkv LLILLL;
    public final /* synthetic */ UrlModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09JV(C424630Gkv c424630Gkv, UrlModel urlModel, InterfaceC1364105Vn<? super C09JV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c424630Gkv;
        this.LLILZ = urlModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C09JV c09jv = new C09JV(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c09jv.LLILLJJLI = obj;
        return c09jv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("DonationStickerView@8eb3.bindOrgIconForCompile$1");
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
                C424630Gkv c424630Gkv = this.LLILLL;
                UrlModel urlModel = this.LLILZ;
                float fLIZJ = C1919207fS.LIZJ();
                C19591311kt.LIZ.getClass();
                C099F c099fLJII = C19591311kt.LJII(c424630Gkv, urlModel, fLIZJ, fLIZJ, fLIZJ, fLIZJ);
                this.LL = 1;
                obj = c099fLJII.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DonationStickerView@8eb3.bindOrgIconForCompile$1");
                    return objLJFF;
                }
            }
            c098200Yq = Boolean.valueOf(((Boolean) obj).booleanValue());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("DonationStickerView@8eb3.bindOrgIconForCompile$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

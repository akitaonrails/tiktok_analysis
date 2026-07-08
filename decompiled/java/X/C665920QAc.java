package X;

import android.animation.Animator;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QAc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.general.live.TopLiveProductViewNew$setCoverWithAnim$1", f = "TopLiveProductViewNew.kt", l = {477}, m = "invokeSuspend")
public final class C665920QAc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Animator LLILLL;
    public final /* synthetic */ C0QAZ LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C665920QAc(String str, Animator animator, C0QAZ c0qaz, InterfaceC1364105Vn<? super C665920QAc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = animator;
        this.LLILZ = c0qaz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C665920QAc(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TopLiveProductViewNew@8093.setCoverWithAnim$1");
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
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("TopLiveProductViewNew@8093.setCoverWithAnim$1");
                return objLJFF;
            }
        }
        String str = this.LLILLJJLI;
        if (str != null) {
            this.LLILZ.setPreloadCover(str);
        }
        this.LLILLL.start();
        C0QAZ c0qaz = this.LLILZ;
        SmartImageView smartImageView = c0qaz.LLJJIJIIJIL;
        c0qaz.LLJJIJIIJIL = c0qaz.LLJJIJI;
        c0qaz.LLJJIJI = smartImageView;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TopLiveProductViewNew@8093.setCoverWithAnim$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

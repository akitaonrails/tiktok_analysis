package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabIconViewConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hometab.base.tabicon.exts.TabIconExtsKt$download$2$downloadAll$2$results$1$1", f = "TabIconExts.kt", l = {LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT}, m = "invokeSuspend")
public final class C592070NKb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C592100NKe>, Object> {
    public int LL;
    public final /* synthetic */ TabIconViewConfig LLILLJJLI;
    public final /* synthetic */ C0NKZ LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592070NKb(TabIconViewConfig tabIconViewConfig, C0NKZ c0nkz, boolean z, InterfaceC1364105Vn<? super C592070NKb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tabIconViewConfig;
        this.LLILLL = c0nkz;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592070NKb(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabIconExtsKt@747f.download$2$downloadAll$2$results$1$1");
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
            TabIconViewConfig tabIconViewConfig = this.LLILLJJLI;
            C0NKZ c0nkz = this.LLILLL;
            boolean z = this.LLILZ;
            this.LL = 1;
            obj = C2296808zG.LJ(new C592060NKa(tabIconViewConfig, c0nkz, z, null), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TabIconExtsKt@747f.download$2$downloadAll$2$results$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TabIconExtsKt@747f.download$2$downloadAll$2$results$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C592100NKe> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

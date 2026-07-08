package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.chatnotice.banner.ShareGroupForAIGroupShotPopup;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.064d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.banner.ShareGroupForAIGroupShotPopup$onViewCreated$1$1", f = "ShareGroupForAIGroupShotPopup.kt", l = {}, m = "invokeSuspend")
public final class C15477064d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ShareGroupForAIGroupShotPopup LL;
    public final /* synthetic */ C1371590lnR LLILLJJLI;
    public final /* synthetic */ SharePackage LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15477064d(ShareGroupForAIGroupShotPopup shareGroupForAIGroupShotPopup, C1371590lnR c1371590lnR, SharePackage sharePackage, Context context, InterfaceC1364105Vn<? super C15477064d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = shareGroupForAIGroupShotPopup;
        this.LLILLJJLI = c1371590lnR;
        this.LLILLL = sharePackage;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15477064d(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareGroupForAIGroupShotPopup@b877.onViewCreated$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1369580lkC c1369580lkC = this.LL.LLIZLLLIL;
        if (c1369580lkC != null) {
            c1369580lkC.LJIIZILJ(this.LLILLJJLI.LIZ, false);
        }
        C1369580lkC c1369580lkC2 = this.LL.LLIZLLLIL;
        if (c1369580lkC2 != null) {
            final SharePackage sharePackage = this.LLILLL;
            final Context context = this.LLILZ;
            c1369580lkC2.LLJJ = new InterfaceC1368050lhj() { // from class: X.064c
                @Override // X.InterfaceC1368050lhj
                public final void LJIIIIZZ(InterfaceC1369790lkX interfaceC1369790lkX, View view) {
                    IMGroupChatDetailAnalytics iMGroupChatDetailAnalytics = IMGroupChatDetailAnalytics.LIZ;
                    IMGroupChatDetailAnalytics.LIZLLL = "chat";
                    IMGroupChatDetailAnalytics.LIZJ = "group_shot_main_card";
                    iMGroupChatDetailAnalytics.LIZLLL(interfaceC1369790lkX.key(), null, C20642515q3.LJI(2131845896), C20642515q3.LJI(2131847874), null, C0I0B.LJFF.LIZIZ());
                    interfaceC1369790lkX.LJJIIJ(sharePackage.LJIILLIIL(interfaceC1369790lkX), context, null);
                }
            };
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareGroupForAIGroupShotPopup@b877.onViewCreated$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

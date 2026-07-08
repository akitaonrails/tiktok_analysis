package X;

import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.aigc.invite.IMServiceImpl;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18h3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.invite.IMServiceImpl$showSheet$1$3$1$1$1", f = "IMServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C21351118h3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C197039127h LL;
    public final /* synthetic */ BaseTemplate LLILLJJLI;
    public final /* synthetic */ IMServiceImpl LLILLL;
    public final /* synthetic */ AIGCSocialModel LLILZ;
    public final /* synthetic */ C21350518gx LLILZIL;
    public final /* synthetic */ TuxSheet LLILZLL;
    public final /* synthetic */ View LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21351118h3(C197039127h c197039127h, BaseTemplate baseTemplate, IMServiceImpl iMServiceImpl, AIGCSocialModel aIGCSocialModel, C21350518gx c21350518gx, TuxSheet tuxSheet, View view, InterfaceC1364105Vn<? super C21351118h3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c197039127h;
        this.LLILLJJLI = baseTemplate;
        this.LLILLL = iMServiceImpl;
        this.LLILZ = aIGCSocialModel;
        this.LLILZIL = c21350518gx;
        this.LLILZLL = tuxSheet;
        this.LLIZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21351118h3(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMServiceImpl@7354.showSheet$1$3$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setLoading(false);
        BaseTemplate baseTemplate = this.LLILLJJLI;
        if (baseTemplate != null) {
            this.LLILLL.LJIIIIZZ(this.LLILZ, this.LLILZIL, baseTemplate);
            this.LLILZLL.dismiss();
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLIZ);
            c1389890mGx.LJIIJ(this.LLILZIL.LJIIJ);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMServiceImpl@7354.showSheet$1$3$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.toolbar.TextToImageTitleBarComponent$clickNext$2$genImageJob$1$3$3", f = "TextToImageTitleBarComponent.kt", l = {}, m = "invokeSuspend")
public final class C571980Mc0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DialogC1390150mHN LL;
    public final /* synthetic */ C571990Mc1 LLILLJJLI;
    public final /* synthetic */ Intent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C571980Mc0(DialogC1390150mHN dialogC1390150mHN, C571990Mc1 c571990Mc1, Intent intent, InterfaceC1364105Vn<? super C571980Mc0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dialogC1390150mHN;
        this.LLILLJJLI = c571990Mc1;
        this.LLILLL = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C571980Mc0(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bundle argumentsSafely;
        C1C7U.LIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJLL(100.0f, false);
        VideoPublishEditModel videoPublishEditModelH2 = this.LLILLJJLI.H2();
        AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(this.LLILLJJLI.LLILLJJLI);
        Bundle bundle = null;
        if (abstractC214814194yLIZ != null) {
            argumentsSafely = abstractC214814194yLIZ.getArgumentsSafely();
        } else {
            argumentsSafely = null;
        }
        C572240McQ.LJI(videoPublishEditModelH2, argumentsSafely, "click_next");
        C19EG activity = this.LLILLJJLI.getActivity();
        try {
            bundle = this.LLILLL.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Integer numLJ = C2286608xc.LJ(12345);
        if (bundle == null) {
            bundle = new Bundle();
        }
        C0MWH.LJIIL(activity, bundle, "TextToImageChooseScene", null, numLJ, null, false, 104);
        this.LLILLJJLI.LLJIJIL = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

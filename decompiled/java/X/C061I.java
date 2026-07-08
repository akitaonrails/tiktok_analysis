package X;

import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackReason;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.FeedbackPanelConfig;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.FeedbackPanelFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.061I, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.FeedbackPanelOpenHelper$open$2$2", f = "FeedbackPanelOpenHelper.kt", l = {}, m = "invokeSuspend")
public final class C061I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DialogC1389620mGW LL;
    public final /* synthetic */ AnonymousClass0604 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ List<BotFeedbackReason> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C19EG LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C061I(DialogC1389620mGW dialogC1389620mGW, AnonymousClass0604 anonymousClass0604, String str, String str2, List<BotFeedbackReason> list, String str3, C19EG c19eg, InterfaceC1364105Vn<? super C061I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dialogC1389620mGW;
        this.LLILLJJLI = anonymousClass0604;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = list;
        this.LLILZLL = str3;
        this.LLIZ = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C061I(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedbackPanelOpenHelper@f331.open$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0FNV.LIZ(this.LL);
        FeedbackPanelConfig feedbackPanelConfig = new FeedbackPanelConfig(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        FeedbackPanelFragment feedbackPanelFragment = new FeedbackPanelFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "im_feedback_panel_config", feedbackPanelConfig);
        feedbackPanelFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = feedbackPanelFragment;
        c1390920mIc.LJIIIIZZ(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, this.LLIZ);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJI = numLIZJ;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJLL = false;
        c1390920mIc.LJI(16);
        c1390920mIc.LIZ.show(this.LLIZ.getSupportFragmentManager(), (String) null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedbackPanelOpenHelper@f331.open$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

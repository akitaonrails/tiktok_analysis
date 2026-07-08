package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.ShareKitPanel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS7S1500000_28;

/* JADX INFO: renamed from: X.0Mpb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580410Mpb extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ C580380MpY LLILLJJLI;
    public final /* synthetic */ ShareKitPanel LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1402840mbq LLILZLL;
    public final /* synthetic */ Activity LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C580410Mpb(Activity activity, C580380MpY c580380MpY, ShareKitPanel shareKitPanel, Function0<Unit> function0, String str, C1402840mbq c1402840mbq, Activity activity2) {
        super(1);
        this.LL = activity;
        this.LLILLJJLI = c580380MpY;
        this.LLILLL = shareKitPanel;
        this.LLILZ = function0;
        this.LLILZIL = str;
        this.LLILZLL = c1402840mbq;
        this.LLIZ = activity2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LIZJ(0, this.LL.getString(2131835179), new AwS217S0300000_8(this.LLILLJJLI, (C580380MpY) this.LLILLL, (ShareKitPanel) this.LLILZ, (Function0<Unit>) 0));
        c1397620mTQ2.LIZJ(1, this.LL.getString(2131835178), new AwS7S1500000_28(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLILLJJLI, this.LLILLL, this.LL, 0));
        return Unit.LIZ;
    }
}

package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.SubSpaceFeedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jpm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504080Jpm extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ SubSpaceFeedAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504080Jpm(SubSpaceFeedAssem subSpaceFeedAssem) {
        super(1);
        this.LL = subSpaceFeedAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Boolean boolValueOf;
        C501540Jlg.LIZJ(this.LL.getContext(), th);
        C481090Itn c481090Itn = this.LL.LLJJIJIIJIL;
        if (c481090Itn != null) {
            c481090Itn.setRefreshing(false);
        }
        this.LL.LJIIL();
        SubSpaceFeedAssem subSpaceFeedAssem = this.LL;
        if (!subSpaceFeedAssem.LLJJJ) {
            C491870JQr c491870JQr = (C491870JQr) subSpaceFeedAssem.LLJJJIL.getValue();
            C504510JqT c504510JqTIp = this.LL.ip();
            if (c504510JqTIp != null) {
                boolValueOf = Boolean.valueOf(c504510JqTIp.LLILZIL);
            } else {
                boolValueOf = null;
            }
            c491870JQr.LIZJ(C500260Jjc.LJJIJIIJIL(boolValueOf));
            this.LL.kp().setState(new C504270Jq5());
        }
        return Unit.LIZ;
    }
}

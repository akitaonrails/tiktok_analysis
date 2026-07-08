package X;

import Y.ACListenerS66S1200000_34;
import android.content.Context;
import com.ss.android.ugc.aweme.im.reminduser.impl.RemindUsersAnalytics;
import com.ss.android.ugc.aweme.im.reminduser.impl.RemindUsersViewHelper;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.1B14, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B14 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1B14(Context context, C19EG c19eg, String str, AwS595S0100000_16 awS595S0100000_16, boolean z) {
        super(0);
        this.LL = awS595S0100000_16;
        this.LLILLJJLI = c19eg;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RemindUsersViewHelper.LJ = this.LL;
        C1389910mGz c1389910mGz = new C1389910mGz(this.LLILLJJLI);
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LJIIIZ(2131831931);
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZIZ = 1;
        c1360890lWB.LIZLLL = 2;
        c1389910mGz.LJFF(2131831932);
        c1389910mGz.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL ? 51 : 14))));
        c1389910mGz.LIZ.LJIIIIZZ = new ACListenerS66S1200000_34(this.LLILZIL, this.LLILLJJLI, this.LLILZ, 0);
        c1389910mGz.LIZLLL(AFwS225S0000000_34.get$arr$(189));
        RemindUsersViewHelper.LIZLLL = c1389910mGz;
        c1389910mGz.LJIIJJI();
        RemindUsersAnalytics remindUsersAnalytics = RemindUsersAnalytics.LIZIZ;
        String str = this.LLILZ;
        EnumC1672106gh enumC1672106gh = EnumC1672106gh.DM_SETTINGS_POPUP;
        C0I0B c0i0b = C0I0B.LJFF;
        remindUsersAnalytics.LJIIIZ(str, enumC1672106gh, c0i0b.LIZIZ());
        remindUsersAnalytics.LJIIIIZZ(true, c0i0b.LIZIZ());
        return Unit.LIZ;
    }
}

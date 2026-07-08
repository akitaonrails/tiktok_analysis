package X;

import Y.ARunnableS119S0100000_19;
import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0if5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251090if5 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ I18nMyProfileFragment LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ ProfileUser LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1251090if5(I18nMyProfileFragment i18nMyProfileFragment, View view, long j, ProfileUser profileUser) {
        super(1);
        this.LL = i18nMyProfileFragment;
        this.LLILLJJLI = view;
        this.LLILLL = j;
        this.LLILZ = profileUser;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        I18nMyProfileFragment i18nMyProfileFragment = this.LL;
        assembler2.DQ2(i18nMyProfileFragment, new AwS385S0200000_19(this.LLILZ, i18nMyProfileFragment, 53));
        I18nMyProfileFragment i18nMyProfileFragment2 = this.LL;
        assembler2.QQ2(i18nMyProfileFragment2, new AwS598S0100000_19(i18nMyProfileFragment2, 336));
        assembler2.QQ2(this.LL, new AwS598S0100000_19(this.LLILLJJLI, 337));
        I18nMyProfileFragment i18nMyProfileFragment3 = this.LL;
        View view = this.LLILLJJLI;
        i18nMyProfileFragment3.getClass();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        View viewFindViewById = view.findViewById(R.id.t4z);
        C0GUC c0guc = (C0GUC) view.findViewById(R.id.user_info_layout);
        View viewFindViewById2 = view.findViewById(R.id.aix);
        if (viewFindViewById != null) {
            C426750GoL.LJIIIZ(viewFindViewById, null, Integer.valueOf(iLIZIZ), null, null, false, 29);
        }
        if (c0guc != null) {
            C426750GoL.LJIIL(c0guc, null, Integer.valueOf(iLIZIZ2), null, null, 29);
            c0guc.setExpectedEmptyHeightPx(iLIZIZ);
        }
        if (viewFindViewById2 != null) {
            C426750GoL.LJIIL(viewFindViewById2, Integer.valueOf(iLIZIZ3), null, Integer.valueOf(iLIZIZ3), null, 26);
        }
        C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
        c1250680ieQ.getClass();
        C20684815ws.LJFF().execute(new ARunnableS119S0100000_19((Function0) new C1248290iaZ(jCurrentTimeMillis, true), 222));
        TabSwitchMetricService.LIZ.getClass();
        TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
        if (tabSwitchMetricServiceLIZ != null) {
            tabSwitchMetricServiceLIZ.LIZIZ("USER", EnumC1593290rZ1.VIEW, false);
        }
        return Unit.LIZ;
    }
}

package X;

import Y.ARunnableS119S0100000_19;
import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0ibs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1249100ibs extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ I18nUserProfileFragment LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ ProfileUser LLILZ;
    public final /* synthetic */ C1252230igv LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1249100ibs(I18nUserProfileFragment i18nUserProfileFragment, View view, long j, ProfileUser profileUser, C1252230igv c1252230igv) {
        super(1);
        this.LL = i18nUserProfileFragment;
        this.LLILLJJLI = view;
        this.LLILLL = j;
        this.LLILZ = profileUser;
        this.LLILZIL = c1252230igv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.DQ2(this.LL, new AwS385S0200000_19(this.LLILZ, this.LLILZIL, 54));
        I18nUserProfileFragment i18nUserProfileFragment = this.LL;
        assembler2.QQ2(i18nUserProfileFragment, new AwS598S0100000_19(i18nUserProfileFragment, 338));
        assembler2.QQ2(this.LL, new AwS598S0100000_19(this.LLILLJJLI, 339));
        this.LL.nS(this.LLILLJJLI);
        C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
        c1250680ieQ.getClass();
        C20684815ws.LJFF().execute(new ARunnableS119S0100000_19((Function0) new C1248290iaZ(jCurrentTimeMillis, false), 222));
        return Unit.LIZ;
    }
}

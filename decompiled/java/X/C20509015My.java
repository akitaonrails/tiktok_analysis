package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import lth.o;

/* JADX INFO: renamed from: X.15My, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20509015My extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ CommerceToolsTcmModel LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20509015My(Context context, boolean z, CommerceToolsTcmModel commerceToolsTcmModel, boolean z2, int i) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = z;
        this.LLILLL = commerceToolsTcmModel;
        this.LLILZ = z2;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        C0LAB c0lab = new C0LAB();
        C20508815Mw.LIZ.getClass();
        c0lab.LIZ(C20508815Mw.LIZIZ() ? 1 : 0, "is_tcm_creator");
        c0lab.LJ("user_id", o.LJIIZILJ.getCurrentUserID());
        C20684815ws.LJIILLIIL("ttcm_turnon_disclosure_setting_click_turnon", c0lab.LIZ);
        C20508915Mx.LIZ(C1388190mED.LIZ(this.LL), this.LLILLJJLI, this.LLILLL, this.LLILZ, "post", this.LLILZIL);
        return Unit.LIZ;
    }
}

package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import kotlin.Unit;
import kotlin.jvm.internal.AwS415S0200000_14;

/* JADX INFO: renamed from: X.0XiN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856210XiN extends AbstractC857240Xk2<Unit> {
    public final Integer LLILZ;
    public final C19EG LLILZIL;
    public final String LLILZLL;
    public final boolean LLIZ;

    @Override // X.AbstractC857240Xk2
    public final String LIZJ() {
        return EnumC856470Xin.PRIVACY_CONFIRMATION_CHECK.getValue().getSecond();
    }

    @Override // X.AbstractC857240Xk2
    public final void LIZ(C857220Xk0 c857220Xk0) {
        Integer num;
        C856220XiO.LIZ.getClass();
        C856220XiO.LIZIZ = null;
        Integer num2 = this.LLILZ;
        if (num2 != null && num2.intValue() != 1 && (((num = this.LLILZ) == null || num.intValue() != 4) && ComplianceServiceProvider.LJIJJLI().LIZLLL() && !this.LLIZ)) {
            C856220XiO.LIZIZ = EnumC1998107sB.PRIVACY_DIALOG;
            c857220Xk0.LIZIZ(this);
            ComplianceServiceProvider.LJIJJLI().LJI(this.LLILZIL, null, this.LLILZLL, new AwS415S0200000_14(c857220Xk0, this, 57), new AwS415S0200000_14(c857220Xk0, this, 58));
            return;
        }
        c857220Xk0.LIZ(this);
    }

    public C856210XiN(Integer num, C19EG c19eg, String str, boolean z) {
        this.LLILZ = num;
        this.LLILZIL = c19eg;
        this.LLILZLL = str;
        this.LLIZ = z;
    }
}

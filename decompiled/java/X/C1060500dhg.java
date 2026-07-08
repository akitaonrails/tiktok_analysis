package X;

import com.ss.android.ugc.aweme.fe.method.commerce.RefreshNavTitleMethod;

/* JADX INFO: renamed from: X.0dhg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1060500dhg extends AbstractC1060870diH {
    public String LLJ;

    @Override // X.AbstractC1059420dfw
    public final C1059440dfy LIZIZ() {
        String str = this.LLJ;
        if (str == null) {
            str = "";
        }
        return new C1059440dfy(str);
    }

    @Override // X.AbstractC1059420dfw
    public final InterfaceC1051760dTa LIZ(C1059490dg3 c1059490dg3) {
        InterfaceC1061400dj8 interfaceC1061400dj8;
        C1537480q70 c1537480q70 = c1059490dg3.LJ;
        if (c1537480q70 != null && (interfaceC1061400dj8 = (InterfaceC1061400dj8) c1537480q70.LJFF(InterfaceC1061400dj8.class)) != null) {
            RefreshNavTitleMethod refreshNavTitleMethod = new RefreshNavTitleMethod(interfaceC1061400dj8);
            refreshNavTitleMethod.attach(c1059490dg3.LIZLLL);
            return refreshNavTitleMethod;
        }
        this.LLJ = "observer is null";
        return null;
    }
}

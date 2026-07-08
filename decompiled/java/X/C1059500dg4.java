package X;

import com.ss.android.ugc.aweme.fe.method.SendLogMethod;

/* JADX INFO: renamed from: X.0dg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059500dg4 extends AbstractC1059510dg5 {
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
        InterfaceC1048350dO5 interfaceC1048350dO5;
        C1537480q70 c1537480q70 = c1059490dg3.LJ;
        if (c1537480q70 != null && (interfaceC1048350dO5 = (InterfaceC1048350dO5) c1537480q70.LJFF(InterfaceC1048350dO5.class)) != null) {
            SendLogMethod sendLogMethod = new SendLogMethod(c1059490dg3.LIZIZ, interfaceC1048350dO5);
            sendLogMethod.attach(c1059490dg3.LIZLLL);
            return sendLogMethod;
        }
        this.LLJ = "adInfo is null";
        return null;
    }
}

package Y;

import X.C0W3J;
import X.C0XU4;
import X.C0XUD;
import X.C0XUF;
import X.C0XWJ;
import X.C0XX9;
import X.C1C7U;
import X.C2188811AlT;
import X.C795670VJd;
import X.C835200Wpa;
import X.C835260Wpg;
import X.InterfaceC835710WqP;
import X.InterfaceC835730WqR;
import Y.AComparatorS32S0000000_13;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.sliver.Sliver;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.oneclicklogin.storage.EncryptedLoginMethod;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS1S2210000_13 implements Runnable {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;
    public boolean z4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Long l;
        Sliver.nDump(((C795670VJd) this.l2).LIZ, this.s1, (TextUtils.isEmpty(this.s0) || (l = Sliver.mark.get(this.s0)) == null) ? -1L : l.longValue());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Thread) this.l3);
        sbLIZ.append(" dump ");
        sbLIZ.append(this.z4 ? "sync" : "async");
        sbLIZ.append(" success");
        Sliver.onStep(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZ$1() {
        final List listLIZIZ;
        C0XUF c0xuf = C0XU4.LIZIZ;
        String str = this.s0;
        String str2 = this.s1;
        Keva keva = (Keva) c0xuf.LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_oidc_key");
        keva.storeString(C2188811AlT.LIZIZ(sbLIZ), str2);
        List<? extends BaseLoginMethod> list = (List) this.l2;
        if (list != null) {
            c0xuf.LIZJ(list);
        }
        if (this.z4) {
            return;
        }
        List list2 = (List) this.l3;
        if (list2 != null) {
            C0XUD.LIZ.getClass();
            listLIZIZ = C0XUD.LIZIZ(list2, false);
        } else {
            listLIZIZ = null;
        }
        C0XU4.LIZ.getClass();
        final C835260Wpg c835260Wpg = (C835260Wpg) C0XU4.LIZLLL.getValue();
        String str3 = this.s0;
        String str4 = this.s1;
        c835260Wpg.getClass();
        C0XX9.LIZ.getClass();
        if (!C0XX9.LIZ()) {
            C0XWJ.LIZ.getClass();
            C0XWJ.LJIIIIZZ("BlockStore Unavailable");
            return;
        }
        final C835200Wpa c835200Wpa = new C835200Wpa();
        c835200Wpa.LIZ = str4.getBytes(C835260Wpg.LIZIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str3);
        sbLIZ2.append("_oidc_key");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        C0W3J.LJFF("key cannot be null or empty", strLIZIZ);
        c835200Wpa.LIZJ = strLIZIZ;
        c835260Wpg.LIZ.LIZ().LJFF(new InterfaceC835710WqP() { // from class: X.0Wpi
            @Override // X.InterfaceC835710WqP
            public final void onSuccess(Object obj) {
                final Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    c835200Wpa.LIZIZ = true;
                }
                AbstractC835450Wpz<Integer> abstractC835450WpzLIZJ = c835260Wpg.LIZ.LIZJ(c835200Wpa.LIZ());
                final List<EncryptedLoginMethod> list3 = listLIZIZ;
                final C835260Wpg c835260Wpg2 = c835260Wpg;
                abstractC835450WpzLIZJ.LJFF(new InterfaceC835710WqP() { // from class: X.0Wpf
                    @Override // X.InterfaceC835710WqP
                    public final void onSuccess(Object obj2) {
                        Pair pairLIZJ;
                        if (list3 != null) {
                            if (C293990Bfh.LIZ()) {
                                C835260Wpg c835260Wpg3 = c835260Wpg2;
                                List listLJLLLL = C13LP.LJLLLL(new AComparatorS32S0000000_13(26), list3);
                                c835260Wpg3.getClass();
                                pairLIZJ = C835260Wpg.LIZJ(listLJLLLL);
                            } else {
                                C835260Wpg c835260Wpg4 = c835260Wpg2;
                                List<EncryptedLoginMethod> list4 = list3;
                                c835260Wpg4.getClass();
                                pairLIZJ = C835260Wpg.LIZJ(list4);
                            }
                            C835200Wpa c835200Wpa2 = new C835200Wpa();
                            c835200Wpa2.LIZ = ((String) pairLIZJ.getFirst()).getBytes(C835260Wpg.LIZIZ);
                            C0W3J.LJFF("key cannot be null or empty", "LoginMethodsRepository");
                            c835200Wpa2.LIZJ = "LoginMethodsRepository";
                            if (bool.booleanValue()) {
                                c835200Wpa2.LIZIZ = true;
                            }
                            c835260Wpg2.LIZ.LIZJ(c835200Wpa2.LIZ()).LJFF(new InterfaceC835710WqP() { // from class: X.0WpW
                                @Override // X.InterfaceC835710WqP
                                public final void onSuccess(Object obj3) {
                                    C0XWJ.LIZ.getClass();
                                    C20684815ws.LJIILLIIL("save_oidc_token_success", new C0XGR().LIZ);
                                }
                            }).LIZLLL(new InterfaceC835730WqR() { // from class: X.0Wpj
                                @Override // X.InterfaceC835730WqR
                                public final void onFailure(Exception exc) {
                                    C0XWJ c0xwj = C0XWJ.LIZ;
                                    String message = exc.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    c0xwj.getClass();
                                    C0XWJ.LJIIIIZZ(message);
                                }
                            });
                        }
                    }
                }).LIZLLL(new InterfaceC835730WqR() { // from class: X.0Wpk
                    @Override // X.InterfaceC835730WqR
                    public final void onFailure(Exception exc) {
                        C0XWJ c0xwj = C0XWJ.LIZ;
                        String message = exc.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        c0xwj.getClass();
                        C0XWJ.LJIIIIZZ(message);
                    }
                });
            }
        }).LIZLLL(new InterfaceC835730WqR() { // from class: X.0Wpm
            @Override // X.InterfaceC835730WqR
            public final void onFailure(Exception exc) {
                C0XWJ c0xwj = C0XWJ.LIZ;
                String message = exc.getMessage();
                if (message == null) {
                    message = "";
                }
                c0xwj.getClass();
                C0XWJ.LJIIIIZZ(message);
            }
        });
    }

    public static final void run$0(ARunnableS1S2210000_13 aRunnableS1S2210000_13) {
        boolean zLIZ;
        C1C7U.LIZ("Sliver@4d0.dump$1");
        try {
            aRunnableS1S2210000_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Sliver@4d0.dump$1");
    }

    public static final void run$1(ARunnableS1S2210000_13 aRunnableS1S2210000_13) {
        boolean zLIZ;
        C1C7U.LIZ("LoginMethodsRepository@22bc.saveOIDCTokenAsync$disposable$1");
        try {
            aRunnableS1S2210000_13.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LoginMethodsRepository@22bc.saveOIDCTokenAsync$disposable$1");
    }

    public ARunnableS1S2210000_13(String str, Object obj, String str2, Object obj2, boolean z, int i) {
        this.$t = i;
        this.s0 = str;
        this.l2 = obj;
        this.s1 = str2;
        this.l3 = obj2;
        this.z4 = z;
    }
}

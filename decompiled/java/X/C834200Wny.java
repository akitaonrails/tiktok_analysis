package X;

import android.content.Intent;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import java.util.List;

/* JADX INFO: renamed from: X.0Wny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C834200Wny {
    public final Fragment LIZ;
    public final String LIZIZ;
    public InterfaceC834210Wnz LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final boolean LJFF;

    public C834200Wny(BaseI18nLoginFragment baseI18nLoginFragment, String str) {
        boolean z;
        this.LIZ = baseI18nLoginFragment;
        this.LIZIZ = str;
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        if (C0WWA.LIZ(C0XPY.LIZIZ) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZLLL = z;
        boolean zLIZ = C0VFU.LIZ(C0XPY.LIZIZ);
        this.LJ = zLIZ;
        this.LJFF = zLIZ && this.LIZLLL;
    }

    public final void LIZ(String str, boolean z) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_method", this.LIZIZ);
        c0xgr.LIZ(z ? 1 : 0, "is_successful");
        c0xgr.LIZLLL("error_desc", str);
        c0xgr.LIZ(this.LJ ? 1 : 0, "has_sim_card");
        c0xgr.LIZ(this.LIZLLL ? 1 : 0, "google_availability");
        C20684815ws.LJIILLIIL("phone_auto_fill", c0xgr.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.1BsM] */
    public final void LIZIZ(int i, int i2, Intent intent) {
        InterfaceC834210Wnz interfaceC834210Wnz;
        if (this.LJFF && i == 9999 && (interfaceC834210Wnz = this.LIZJ) != null) {
            boolean zLJIIZILJ = 0;
            if (i2 == -1) {
                C19EG activity = this.LIZ.getActivity();
                if (activity != null) {
                    try {
                        C834010Wnf.LIZ(activity);
                        String strLIZLLL = C833870WnR.LIZLLL(intent);
                        if (strLIZLLL.length() != 0) {
                            try {
                                zLJIIZILJ = C2218571BsN.LIZJ().LJIIZILJ(strLIZLLL, null);
                                if (zLJIIZILJ != 0) {
                                    InterfaceC834210Wnz interfaceC834210Wnz2 = this.LIZJ;
                                    if (interfaceC834210Wnz2 != null) {
                                        interfaceC834210Wnz2.setPhoneNumber(String.valueOf(zLJIIZILJ.getNationalNumber()));
                                    }
                                    InterfaceC834210Wnz interfaceC834210Wnz3 = this.LIZJ;
                                    if (interfaceC834210Wnz3 != null) {
                                        interfaceC834210Wnz3.setCountryCode(String.valueOf(zLJIIZILJ.getCountryCode()));
                                    }
                                    LIZ("", true);
                                    return;
                                }
                                return;
                            } catch (C1722250uv1 e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Failed to parse phone string with error: ");
                                sbLIZ.append(e.getMessage());
                                LIZ(C2188811AlT.LIZIZ(sbLIZ), zLJIIZILJ);
                                return;
                            }
                        }
                        return;
                    } catch (C0W4V e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Phone string fetch fail from intent with error: ");
                        sbLIZ2.append(e2.getMessage());
                        LIZ(C2188811AlT.LIZIZ(sbLIZ2), false);
                        return;
                    }
                }
                return;
            }
            EditText editText = interfaceC834210Wnz.getEditText();
            if (editText != null) {
                editText.requestFocus();
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onActivityResult result code: ");
            sbLIZ3.append(i2);
            LIZ(C2188811AlT.LIZIZ(sbLIZ3), false);
        }
    }
}

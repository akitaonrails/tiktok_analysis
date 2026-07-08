package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.compliance.consent.termsconditions.component.TermsConditionsAssem;
import com.ss.android.ugc.aweme.compliance.consent.termsconditions.existing.KRExistingUserTermsConsentDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14d4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20307214d4 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                break;
        }
    }

    public static final void onCheckedChanged$0(C20307214d4 c20307214d4, CompoundButton compoundButton, boolean z) {
        boolean z2;
        Function1<Boolean, Unit> function1;
        ((C0HZQ) c20307214d4.l0).setChecked(z);
        ((C0HZQ) c20307214d4.l1).setChecked(z);
        ((C0HZQ) c20307214d4.l2).setChecked(z);
        TermsConditionsAssem termsConditionsAssem = (TermsConditionsAssem) c20307214d4.l3;
        if (((C0HZQ) c20307214d4.l0).isChecked() && ((C0HZQ) c20307214d4.l1).isChecked()) {
            z2 = true;
        } else {
            z2 = false;
        }
        termsConditionsAssem.LLJLIL = z2;
        TermsConditionsAssem termsConditionsAssem2 = (TermsConditionsAssem) c20307214d4.l3;
        boolean z3 = termsConditionsAssem2.LLJLIL;
        C197039127h c197039127h = termsConditionsAssem2.LLJL;
        if (c197039127h != null) {
            c197039127h.setEnabled(z3);
        }
        C14SL c14slIp = ((TermsConditionsAssem) c20307214d4.l3).ip();
        if (c14slIp != null && (function1 = c14slIp.LLILLJJLI) != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    public static final void onCheckedChanged$1(C20307214d4 c20307214d4, CompoundButton compoundButton, boolean z) {
        boolean z2;
        Function1<Boolean, Unit> function1;
        boolean zIsChecked = ((C0HZQ) c20307214d4.l0).isChecked();
        boolean zIsChecked2 = ((C0HZQ) c20307214d4.l1).isChecked();
        C0HZQ c0hzq = (C0HZQ) c20307214d4.l2;
        if (z && ((C0HZQ) c20307214d4.l0).isChecked() && ((C0HZQ) c20307214d4.l1).isChecked()) {
            z2 = true;
        } else {
            z2 = false;
        }
        c0hzq.setChecked(z2);
        ((C0HZQ) c20307214d4.l0).setChecked(zIsChecked);
        ((C0HZQ) c20307214d4.l1).setChecked(zIsChecked2);
        C14SL c14slIp = ((TermsConditionsAssem) c20307214d4.l3).ip();
        if (c14slIp != null && (function1 = c14slIp.LLILZIL) != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    public static final void onCheckedChanged$2(C20307214d4 c20307214d4, CompoundButton compoundButton, boolean z) {
        boolean z2;
        ((C21412118qt) c20307214d4.l0).setChecked(z);
        ((C21412118qt) c20307214d4.l1).setChecked(z);
        KRExistingUserTermsConsentDialog kRExistingUserTermsConsentDialog = (KRExistingUserTermsConsentDialog) c20307214d4.l2;
        if (((C21412118qt) c20307214d4.l3).isChecked() && ((C21412118qt) c20307214d4.l0).isChecked() && ((C21412118qt) c20307214d4.l1).isChecked()) {
            z2 = true;
        } else {
            z2 = false;
        }
        kRExistingUserTermsConsentDialog.LLJILJIL = z2;
        KRExistingUserTermsConsentDialog kRExistingUserTermsConsentDialog2 = (KRExistingUserTermsConsentDialog) c20307214d4.l2;
        kRExistingUserTermsConsentDialog2.LLLLLZL().setEnabled(kRExistingUserTermsConsentDialog2.LLJILJIL);
    }

    public static final void onCheckedChanged$3(C20307214d4 c20307214d4, CompoundButton compoundButton, boolean z) {
        boolean z2;
        boolean zIsChecked = ((C21412118qt) c20307214d4.l0).isChecked();
        C21412118qt c21412118qt = (C21412118qt) c20307214d4.l1;
        boolean z3 = true;
        if (z && ((C21412118qt) c20307214d4.l0).isChecked()) {
            z2 = true;
        } else {
            z2 = false;
        }
        c21412118qt.setChecked(z2);
        ((C21412118qt) c20307214d4.l0).setChecked(zIsChecked);
        KRExistingUserTermsConsentDialog kRExistingUserTermsConsentDialog = (KRExistingUserTermsConsentDialog) c20307214d4.l2;
        if (!((C21412118qt) c20307214d4.l1).isChecked() || !((C21412118qt) c20307214d4.l3).isChecked() || !((C21412118qt) c20307214d4.l0).isChecked()) {
            z3 = false;
        }
        kRExistingUserTermsConsentDialog.LLJILJIL = z3;
        KRExistingUserTermsConsentDialog kRExistingUserTermsConsentDialog2 = (KRExistingUserTermsConsentDialog) c20307214d4.l2;
        kRExistingUserTermsConsentDialog2.LLLLLZL().setEnabled(kRExistingUserTermsConsentDialog2.LLJILJIL);
    }

    public static final void onCheckedChanged$4(C20307214d4 c20307214d4, CompoundButton compoundButton, boolean z) {
        boolean z2;
        boolean zIsChecked = ((C21412118qt) c20307214d4.l0).isChecked();
        C21412118qt c21412118qt = (C21412118qt) c20307214d4.l1;
        boolean z3 = true;
        if (z && ((C21412118qt) c20307214d4.l0).isChecked()) {
            z2 = true;
        } else {
            z2 = false;
        }
        c21412118qt.setChecked(z2);
        ((C21412118qt) c20307214d4.l0).setChecked(zIsChecked);
        KRExistingUserTermsConsentDialog kRExistingUserTermsConsentDialog = (KRExistingUserTermsConsentDialog) c20307214d4.l2;
        if (!((C21412118qt) c20307214d4.l1).isChecked() || !((C21412118qt) c20307214d4.l0).isChecked() || !((C21412118qt) c20307214d4.l3).isChecked()) {
            z3 = false;
        }
        kRExistingUserTermsConsentDialog.LLJILJIL = z3;
        KRExistingUserTermsConsentDialog kRExistingUserTermsConsentDialog2 = (KRExistingUserTermsConsentDialog) c20307214d4.l2;
        kRExistingUserTermsConsentDialog2.LLLLLZL().setEnabled(kRExistingUserTermsConsentDialog2.LLJILJIL);
    }

    public C20307214d4(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}

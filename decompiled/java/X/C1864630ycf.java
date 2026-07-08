package X;

import android.widget.CompoundButton;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.minis.payment.MinisRechargeFragment;
import com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionFragment;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.CorrectSchoolCell;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ycf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864630ycf implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                break;
        }
    }

    public C1864630ycf(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onCheckedChanged$0(C1864630ycf c1864630ycf, CompoundButton compoundButton, boolean z) {
        MinisRechargeFragment minisRechargeFragment = (MinisRechargeFragment) c1864630ycf.l0;
        if (!minisRechargeFragment.LLJLIL && z) {
            minisRechargeFragment.LLJLIL = true;
            C1841350y17 c1841350y17 = (C1841350y17) c1864630ycf.l1;
            if (c1841350y17 != null) {
                c1841350y17.setChecked(false);
            }
            MinisRechargeFragment minisRechargeFragment2 = (MinisRechargeFragment) c1864630ycf.l0;
            minisRechargeFragment2.LLJLIL = false;
            EnumC1841270y0z enumC1841270y0z = EnumC1841270y0z.WEB;
            minisRechargeFragment2.LLJL = enumC1841270y0z;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Payment method switched to: ");
            sbLIZ.append(enumC1841270y0z);
            C2188811AlT.LIZIZ(sbLIZ);
            minisRechargeFragment2.mS(enumC1841270y0z);
        }
    }

    public static final void onCheckedChanged$1(C1864630ycf c1864630ycf, CompoundButton compoundButton, boolean z) {
        MinisRechargeFragment minisRechargeFragment = (MinisRechargeFragment) c1864630ycf.l0;
        if (!minisRechargeFragment.LLJLIL && z) {
            minisRechargeFragment.LLJLIL = true;
            C1841350y17 c1841350y17 = (C1841350y17) c1864630ycf.l1;
            if (c1841350y17 != null) {
                c1841350y17.setChecked(false);
            }
            MinisRechargeFragment minisRechargeFragment2 = (MinisRechargeFragment) c1864630ycf.l0;
            minisRechargeFragment2.LLJLIL = false;
            EnumC1841270y0z enumC1841270y0z = EnumC1841270y0z.GOOGLE_PLAY;
            minisRechargeFragment2.LLJL = enumC1841270y0z;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Payment method switched to: ");
            sbLIZ.append(enumC1841270y0z);
            C2188811AlT.LIZIZ(sbLIZ);
            minisRechargeFragment2.mS(enumC1841270y0z);
        }
    }

    public static final void onCheckedChanged$2(C1864630ycf c1864630ycf, CompoundButton compoundButton, boolean z) {
        MinisSubscriptionFragment minisSubscriptionFragment = (MinisSubscriptionFragment) c1864630ycf.l0;
        if (!minisSubscriptionFragment.LLJLILLLLZIIL && z) {
            minisSubscriptionFragment.LLJLILLLLZIIL = true;
            C1841350y17 c1841350y17 = (C1841350y17) c1864630ycf.l1;
            if (c1841350y17 != null) {
                c1841350y17.setChecked(false);
            }
            MinisSubscriptionFragment minisSubscriptionFragment2 = (MinisSubscriptionFragment) c1864630ycf.l0;
            minisSubscriptionFragment2.LLJLILLLLZIIL = false;
            EnumC1841230y0v enumC1841230y0v = EnumC1841230y0v.WEB;
            minisSubscriptionFragment2.LLJLIL = enumC1841230y0v;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Payment method switched to: ");
            sbLIZ.append(enumC1841230y0v);
            C2188811AlT.LIZIZ(sbLIZ);
            minisSubscriptionFragment2.WR(enumC1841230y0v);
        }
    }

    public static final void onCheckedChanged$3(C1864630ycf c1864630ycf, CompoundButton compoundButton, boolean z) {
        MinisSubscriptionFragment minisSubscriptionFragment = (MinisSubscriptionFragment) c1864630ycf.l0;
        if (!minisSubscriptionFragment.LLJLILLLLZIIL && z) {
            minisSubscriptionFragment.LLJLILLLLZIIL = true;
            C1841350y17 c1841350y17 = (C1841350y17) c1864630ycf.l1;
            if (c1841350y17 != null) {
                c1841350y17.setChecked(false);
            }
            MinisSubscriptionFragment minisSubscriptionFragment2 = (MinisSubscriptionFragment) c1864630ycf.l0;
            minisSubscriptionFragment2.LLJLILLLLZIIL = false;
            EnumC1841230y0v enumC1841230y0v = EnumC1841230y0v.GOOGLE_PLAY;
            minisSubscriptionFragment2.LLJLIL = enumC1841230y0v;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Payment method switched to: ");
            sbLIZ.append(enumC1841230y0v);
            C2188811AlT.LIZIZ(sbLIZ);
            minisSubscriptionFragment2.WR(enumC1841230y0v);
        }
    }

    public static final void onCheckedChanged$4(C1864630ycf c1864630ycf, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            ((Function2) c1864630ycf.l0).invoke(Integer.valueOf(((C15QC) c1864630ycf.l1).getAbsoluteAdapterPosition()), Boolean.valueOf(!z));
        }
    }

    public static final void onCheckedChanged$5(C1864630ycf c1864630ycf, CompoundButton compoundButton, boolean z) {
        if (z) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((CorrectSchoolCell) c1864630ycf.l0), null, null, new C1844370y5z((CorrectSchoolCell) c1864630ycf.l0, (C331430Cyz) c1864630ycf.l1, null), 3);
        }
    }
}

package Y;

import X.AbstractC857240Xk2;
import X.C0LCS;
import X.C118300cf;
import X.C11GO;
import X.C1397510mTF;
import X.C19223110Ij;
import X.C19EG;
import X.C857660Xki;
import X.InterfaceC856160XiI;
import android.text.SpannableString;
import androidx.lifecycle.Observer;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.privacy.ui.EditPageDefaultPrivacySettingFragment;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class AObserverS79S0400000_14 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$0(AObserverS79S0400000_14 aObserverS79S0400000_14, Object obj) {
        C0LCS c0lcs = (C0LCS) obj;
        if (c0lcs != null) {
            Pair pair = (Pair) c0lcs.LIZ;
            int iIntValue = ((Number) pair.getFirst()).intValue();
            ((Boolean) pair.getSecond()).booleanValue();
            SpannableString spannableString = new SpannableString(C857660Xki.LIZIZ((C19EG) aObserverS79S0400000_14.l0, (VideoPublishEditModel) aObserverS79S0400000_14.l1));
            boolean zLJFF = C857660Xki.LJFF((VideoPublishEditModel) aObserverS79S0400000_14.l1);
            if (iIntValue != 0) {
                C19223110Ij c19223110Ij = (C19223110Ij) aObserverS79S0400000_14.l2;
                c19223110Ij.LJIIIZ = false;
                c19223110Ij.LJ = false;
                c19223110Ij.LJI = spannableString;
                ((EditPageDefaultPrivacySettingFragment) aObserverS79S0400000_14.l3).PS().setCellEnabled(false);
                ((C11GO) ((EditPageDefaultPrivacySettingFragment) aObserverS79S0400000_14.l3).PS().getAccessory()).LJIILJJIL(false);
                ((EditPageDefaultPrivacySettingFragment) aObserverS79S0400000_14.l3).PS().setSubtitle(spannableString);
                return;
            }
            ((C19223110Ij) aObserverS79S0400000_14.l2).LJI = spannableString;
            ((EditPageDefaultPrivacySettingFragment) aObserverS79S0400000_14.l3).PS().setSubtitle(spannableString);
            if (!C857660Xki.LJI((VideoPublishEditModel) aObserverS79S0400000_14.l1)) {
                return;
            }
            boolean zLJI = C857660Xki.LJI((VideoPublishEditModel) aObserverS79S0400000_14.l1);
            ((EditPageDefaultPrivacySettingFragment) aObserverS79S0400000_14.l3).PS().setCellEnabled(zLJI);
            ((C11GO) ((EditPageDefaultPrivacySettingFragment) aObserverS79S0400000_14.l3).PS().getAccessory()).LJIILJJIL(zLJFF);
            C19223110Ij c19223110Ij2 = (C19223110Ij) aObserverS79S0400000_14.l2;
            c19223110Ij2.LJIIIZ = zLJI;
            c19223110Ij2.LJ = zLJFF;
        }
    }

    public static final void onChanged$1(AObserverS79S0400000_14 aObserverS79S0400000_14, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            if (num.intValue() == 100) {
                ((C1397510mTF) aObserverS79S0400000_14.l0).LIZIZ(null);
                ((Function0) aObserverS79S0400000_14.l1).invoke();
                ((InterfaceC856160XiI) aObserverS79S0400000_14.l2).LIZJ((AbstractC857240Xk2) aObserverS79S0400000_14.l3);
            } else {
                if (num.intValue() != 101) {
                    return;
                }
                ((C1397510mTF) aObserverS79S0400000_14.l0).LIZIZ(null);
                ((Function0) aObserverS79S0400000_14.l1).invoke();
                ((InterfaceC856160XiI) aObserverS79S0400000_14.l2).LIZJ((AbstractC857240Xk2) aObserverS79S0400000_14.l3);
            }
        }
    }

    public static final void onChanged$2(AObserverS79S0400000_14 aObserverS79S0400000_14, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C1397510mTF) aObserverS79S0400000_14.l0).LIZIZ(null);
            ((Function0) aObserverS79S0400000_14.l1).invoke();
            ((InterfaceC856160XiI) aObserverS79S0400000_14.l2).LIZJ((AbstractC857240Xk2) aObserverS79S0400000_14.l3);
        }
    }

    public static final void onChanged$3(AObserverS79S0400000_14 aObserverS79S0400000_14, Object obj) {
        Integer num = (Integer) obj;
        ((C118300cf) aObserverS79S0400000_14.l0).element = num.intValue();
        if (num.intValue() == 100) {
            ((TuxSheet) aObserverS79S0400000_14.l1).dismissAllowingStateLoss();
            ((InterfaceC856160XiI) aObserverS79S0400000_14.l2).LIZJ((AbstractC857240Xk2) aObserverS79S0400000_14.l3);
        } else {
            if (num.intValue() != 101) {
                return;
            }
            ((TuxSheet) aObserverS79S0400000_14.l1).dismissAllowingStateLoss();
            ((InterfaceC856160XiI) aObserverS79S0400000_14.l2).LIZJ((AbstractC857240Xk2) aObserverS79S0400000_14.l3);
        }
    }

    public AObserverS79S0400000_14(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}

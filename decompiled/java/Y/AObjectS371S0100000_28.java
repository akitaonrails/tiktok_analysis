package Y;

import X.AbstractC1906850zil;
import X.C06W2;
import X.C0SY5;
import X.C0SY7;
import X.C1397660mTU;
import X.C1906900ziq;
import X.C19271010aK;
import X.C786410Ut5;
import android.content.DialogInterface;
import com.ss.android.ugc.trill.language.view.AppLanguageListFragment;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AObjectS371S0100000_28 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public AObjectS371S0100000_28(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS371S0100000_28 aObjectS371S0100000_28, Object obj) {
        C19271010aK c19271010aK = (C19271010aK) aObjectS371S0100000_28.l0;
        c19271010aK.getClass();
        c19271010aK.LJIIIIZZ = ((Boolean) obj).booleanValue();
        return null;
    }

    public static final Object invoke$1(AObjectS371S0100000_28 aObjectS371S0100000_28, Object obj) {
        ((Function1) aObjectS371S0100000_28.l0).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS371S0100000_28 aObjectS371S0100000_28, Object obj) {
        C0SY7 c0sy7 = (C0SY7) obj;
        if (C1906900ziq.LIZIZ(Collections.singletonList(((AbstractC1906850zil) aObjectS371S0100000_28.l0).bindedUser), true) == null) {
            C786410Ut5.u0(((AbstractC1906850zil) aObjectS371S0100000_28.l0).nameAppendFollowText, 8);
        } else if (((AbstractC1906850zil) aObjectS371S0100000_28.l0).nameAppendFollowText.getVisibility() != 0) {
            C786410Ut5.u0(((AbstractC1906850zil) aObjectS371S0100000_28.l0).nameAppendFollowText, 0);
        }
        if (C0SY5.LIZIZ.contains(Integer.valueOf(c0sy7.getValue()))) {
            ((AbstractC1906850zil) aObjectS371S0100000_28.l0).setAppendFollowTextMarginStart(4.0f);
            return null;
        }
        if (!C0SY5.LIZ.contains(Integer.valueOf(c0sy7.getValue()))) {
            return null;
        }
        ((AbstractC1906850zil) aObjectS371S0100000_28.l0).setAppendFollowTextMarginStart(7.0f);
        return null;
    }

    public static final Object invoke$3(AObjectS371S0100000_28 aObjectS371S0100000_28, Object obj) {
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) aObjectS371S0100000_28.l0;
        C1397660mTU c1397660mTU = (C1397660mTU) obj;
        c1397660mTU.LIZJ = false;
        onClickListener.onClick(c1397660mTU.LIZ(), c1397660mTU.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS371S0100000_28 aObjectS371S0100000_28, Object obj) {
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) aObjectS371S0100000_28.l0;
        C1397660mTU c1397660mTU = (C1397660mTU) obj;
        c1397660mTU.LIZJ = false;
        onClickListener.onClick(c1397660mTU.LIZ(), c1397660mTU.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS371S0100000_28 aObjectS371S0100000_28, Object obj) {
        AppLanguageListFragment appLanguageListFragment = (AppLanguageListFragment) aObjectS371S0100000_28.l0;
        String str = AppLanguageListFragment._pnsPageId;
        appLanguageListFragment.getClass();
        ((C06W2) obj).Dw2(new AObjectS402S0100000_28(appLanguageListFragment, 0));
        return null;
    }
}

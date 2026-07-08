package Y;

import X.C1348730lCZ;
import X.C1351440lGw;
import X.C1389890mGx;
import X.C1402120mag;
import X.EnumC1347820lB6;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AObjectS364S0100000_21 implements Function1 {
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
            default:
                return null;
        }
    }

    public AObjectS364S0100000_21(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS364S0100000_21 aObjectS364S0100000_21, Object obj) {
        C1348730lCZ c1348730lCZ = (C1348730lCZ) aObjectS364S0100000_21.l0;
        c1348730lCZ.getClass();
        C1389890mGx c1389890mGx = new C1389890mGx(c1348730lCZ.LLILZ);
        c1389890mGx.LJIIJ((String) obj);
        c1389890mGx.LJIIJJI();
        return null;
    }

    public static final Object invoke$1(AObjectS364S0100000_21 aObjectS364S0100000_21, Object obj) {
        KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) aObjectS364S0100000_21.l0;
        keyboardDialogFragment.getClass();
        C1389890mGx c1389890mGx = new C1389890mGx(keyboardDialogFragment.LLLLLLIL);
        c1389890mGx.LJIIJ((String) obj);
        c1389890mGx.LJIIJJI();
        return null;
    }

    public static final Object invoke$2(AObjectS364S0100000_21 aObjectS364S0100000_21, Object obj) {
        C1351440lGw c1351440lGw;
        KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) aObjectS364S0100000_21.l0;
        keyboardDialogFragment.getClass();
        if (obj == EnumC1347820lB6.HIDE && (c1351440lGw = keyboardDialogFragment.LLJJL) != null) {
            c1351440lGw.LJIILIIL(keyboardDialogFragment.LLLIZZ, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS364S0100000_21 aObjectS364S0100000_21, Object obj) {
        C1402120mag c1402120mag = (C1402120mag) aObjectS364S0100000_21.l0;
        c1402120mag.getClass();
        C1389890mGx c1389890mGx = new C1389890mGx(((KeyboardDialogFragment) c1402120mag.l0).LLLLLLIL);
        c1389890mGx.LJIIJ((String) obj);
        c1389890mGx.LJIIJJI();
        return null;
    }
}

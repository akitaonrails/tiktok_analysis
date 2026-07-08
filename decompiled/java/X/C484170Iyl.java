package X;

import Y.ATListenerS441S0100000_7;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Iyl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity$onCreate$3$1", f = "BaWelcomeMessageEditActivity.kt", l = {}, m = "invokeSuspend")
public final class C484170Iyl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaWelcomeMessageEditActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C484170Iyl(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity, InterfaceC1364105Vn<? super C484170Iyl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baWelcomeMessageEditActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C484170Iyl(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaWelcomeMessageEditActivity@83d7.onCreate$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BaWelcomeMessageEditActivity baWelcomeMessageEditActivity = this.LL;
        C0I7D c0i7dLLLLZIL = baWelcomeMessageEditActivity.LLLLZIL();
        KeyListener keyListener = baWelcomeMessageEditActivity.LLJ;
        if (keyListener == null) {
            keyListener = null;
        }
        c0i7dLLLLZIL.setKeyListener(keyListener);
        int i = baWelcomeMessageEditActivity.LLJI.LIZIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C786410Ut5.LJZ(0, baWelcomeMessageEditActivity.LLLLZLL());
                            StringBuilder sb = new StringBuilder();
                            sb.append(baWelcomeMessageEditActivity.getResources().getString(2131846637));
                            sb.append('\n');
                            sb.append(C786410Ut5.j4(baWelcomeMessageEditActivity.getResources().getString(2131846638), Arrays.copyOf(new Object[]{baWelcomeMessageEditActivity.LLJI.LIZLLL}, 1)));
                            baWelcomeMessageEditActivity.LLLLZLLIL().setText(sb);
                        }
                    } else {
                        C786410Ut5.LJZ(0, baWelcomeMessageEditActivity.LLLLZLL());
                        baWelcomeMessageEditActivity.LLLLZLLIL().setText(2131837235);
                    }
                } else {
                    C786410Ut5.LJZ(0, baWelcomeMessageEditActivity.LLLLZLL());
                    baWelcomeMessageEditActivity.LLLLZLLIL().setText(2131857726);
                    KeyEvent.Callback callbackFindViewById = baWelcomeMessageEditActivity.LLIZ;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = baWelcomeMessageEditActivity.findViewById(R.id.ma8);
                        baWelcomeMessageEditActivity.LLIZ = (LinearLayout) callbackFindViewById;
                    }
                    C786410Ut5.LJZL(4, (LinearLayout) callbackFindViewById);
                    baWelcomeMessageEditActivity.LLLLZIL().setKeyListener(null);
                    baWelcomeMessageEditActivity.LLLLZIL().setOnTouchListener(new ATListenerS441S0100000_7(baWelcomeMessageEditActivity, 13));
                    C786410Ut5.LLLLLLJ(baWelcomeMessageEditActivity.LLLLZI(), 4);
                }
            } else {
                C786410Ut5.LJZ(0, baWelcomeMessageEditActivity.LLLLZLL());
                baWelcomeMessageEditActivity.LLLLZLLIL().setText(2131846429);
            }
        } else {
            C786410Ut5.LJZ(8, baWelcomeMessageEditActivity.LLLLZLL());
        }
        baWelcomeMessageEditActivity.LLLLZIL().setText(baWelcomeMessageEditActivity.LLJI.LIZJ);
        baWelcomeMessageEditActivity.LLLZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaWelcomeMessageEditActivity@83d7.onCreate$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

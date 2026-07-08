package X;

import Y.ATListenerS441S0100000_7;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ikx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity$onCreate$4$1", f = "BaAutoReplyEditActivity.kt", l = {}, m = "invokeSuspend")
public final class C475610Ikx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaAutoReplyEditActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C475610Ikx(BaAutoReplyEditActivity baAutoReplyEditActivity, InterfaceC1364105Vn<? super C475610Ikx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baAutoReplyEditActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C475610Ikx(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaAutoReplyEditActivity@7146.onCreate$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BaAutoReplyEditActivity baAutoReplyEditActivity = this.LL;
        C0I7D c0i7dLLLLZLL = baAutoReplyEditActivity.LLLLZLL();
        KeyListener keyListener = baAutoReplyEditActivity.LLJJIJIL;
        if (keyListener == null) {
            keyListener = null;
        }
        c0i7dLLLLZLL.setKeyListener(keyListener);
        C0I7D c0i7dLLLLZLLIL = baAutoReplyEditActivity.LLLLZLLIL();
        KeyListener keyListener2 = baAutoReplyEditActivity.LLJJJ;
        if (keyListener2 == null) {
            keyListener2 = null;
        }
        c0i7dLLLLZLLIL.setKeyListener(keyListener2);
        int i = baAutoReplyEditActivity.LLJJIJIIJIL.LIZIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C786410Ut5.LJZ(0, baAutoReplyEditActivity.LLLLZLLLI());
                            StringBuilder sb = new StringBuilder();
                            sb.append(baAutoReplyEditActivity.getResources().getString(2131846637));
                            sb.append('\n');
                            sb.append(C786410Ut5.j4(baAutoReplyEditActivity.getResources().getString(2131846638), Arrays.copyOf(new Object[]{baAutoReplyEditActivity.LLJJIJIIJIL.LJ}, 1)));
                            baAutoReplyEditActivity.LLLZLZ().setText(sb);
                        }
                    } else {
                        C786410Ut5.LJZ(0, baAutoReplyEditActivity.LLLLZLLLI());
                        baAutoReplyEditActivity.LLLZLZ().setText(2131837235);
                    }
                } else {
                    C786410Ut5.LJZ(0, baAutoReplyEditActivity.LLLLZLLLI());
                    baAutoReplyEditActivity.LLLZLZ().setText(2131857726);
                    KeyEvent.Callback callbackFindViewById = baAutoReplyEditActivity.LLJ;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = baAutoReplyEditActivity.findViewById(R.id.ma8);
                        baAutoReplyEditActivity.LLJ = (LinearLayout) callbackFindViewById;
                    }
                    C786410Ut5.LJZL(4, (LinearLayout) callbackFindViewById);
                    baAutoReplyEditActivity.LLLLZLL().setKeyListener(null);
                    baAutoReplyEditActivity.LLLLZLLIL().setKeyListener(null);
                    ATListenerS441S0100000_7 aTListenerS441S0100000_7 = new ATListenerS441S0100000_7(baAutoReplyEditActivity, 14);
                    baAutoReplyEditActivity.LLLLZLL().setOnTouchListener(aTListenerS441S0100000_7);
                    baAutoReplyEditActivity.LLLLZLLIL().setOnTouchListener(aTListenerS441S0100000_7);
                    C786410Ut5.LLLLLLJ(baAutoReplyEditActivity.LLLLZIL(), 4);
                    C786410Ut5.LLLLLLJ(baAutoReplyEditActivity.LLLLZI(), 4);
                    C786410Ut5.LLLLZLL(baAutoReplyEditActivity.LLLZ(), 4);
                    KeyEvent.Callback callbackFindViewById2 = baAutoReplyEditActivity.LLJIJIL;
                    if (callbackFindViewById2 == null) {
                        callbackFindViewById2 = baAutoReplyEditActivity.findViewById(R.id.zst);
                        baAutoReplyEditActivity.LLJIJIL = (TuxTextView) callbackFindViewById2;
                    }
                    C786410Ut5.LLLLZLL((TuxTextView) callbackFindViewById2, 4);
                    KeyEvent.Callback callbackFindViewById3 = baAutoReplyEditActivity.LLJILJIL;
                    if (callbackFindViewById3 == null) {
                        callbackFindViewById3 = baAutoReplyEditActivity.findViewById(R.id.zsu);
                        baAutoReplyEditActivity.LLJILJIL = (TuxTextView) callbackFindViewById3;
                    }
                    C786410Ut5.LLLLZLL((TuxTextView) callbackFindViewById3, 4);
                    C786410Ut5.LLLLZLL(baAutoReplyEditActivity.LLLZIL(), 4);
                    KeyEvent.Callback callbackFindViewById4 = baAutoReplyEditActivity.LLJILLL;
                    if (callbackFindViewById4 == null) {
                        callbackFindViewById4 = baAutoReplyEditActivity.findViewById(R.id.zxe);
                        baAutoReplyEditActivity.LLJILLL = (TuxTextView) callbackFindViewById4;
                    }
                    C786410Ut5.LLLLZLL((TuxTextView) callbackFindViewById4, 4);
                    KeyEvent.Callback callbackFindViewById5 = baAutoReplyEditActivity.LLJJ;
                    if (callbackFindViewById5 == null) {
                        callbackFindViewById5 = baAutoReplyEditActivity.findViewById(R.id.zxg);
                        baAutoReplyEditActivity.LLJJ = (TuxTextView) callbackFindViewById5;
                    }
                    C786410Ut5.LLLLZLL((TuxTextView) callbackFindViewById5, 4);
                    View viewFindViewById = baAutoReplyEditActivity.LLJJI;
                    if (viewFindViewById == null) {
                        viewFindViewById = baAutoReplyEditActivity.findViewById(R.id.fz4);
                        baAutoReplyEditActivity.LLJJI = viewFindViewById;
                    }
                    C786410Ut5.LJLLLLLL(4, viewFindViewById);
                    View viewFindViewById2 = baAutoReplyEditActivity.LLJJIII;
                    if (viewFindViewById2 == null) {
                        viewFindViewById2 = baAutoReplyEditActivity.findViewById(R.id.fz5);
                        baAutoReplyEditActivity.LLJJIII = viewFindViewById2;
                    }
                    C786410Ut5.LJLLLLLL(4, viewFindViewById2);
                }
            } else {
                C786410Ut5.LJZ(0, baAutoReplyEditActivity.LLLLZLLLI());
                baAutoReplyEditActivity.LLLLZIL().setEnabled(true);
                baAutoReplyEditActivity.LLLZLZ().setText(2131846428);
            }
        } else {
            C786410Ut5.LJZ(8, baAutoReplyEditActivity.LLLLZLLLI());
            C786410Ut5.LLLLLLJ(baAutoReplyEditActivity.LLLLZI(), 8);
        }
        baAutoReplyEditActivity.LLLLZLL().setText(baAutoReplyEditActivity.LLJJIJIIJIL.LIZJ);
        baAutoReplyEditActivity.LLLLZLLIL().setText(baAutoReplyEditActivity.LLJJIJIIJIL.LIZLLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaAutoReplyEditActivity@7146.onCreate$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationTextEditContentAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditPageViewModel;
import com.bytedance.android.livesdk.model.RichTextStyle;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xw6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838240xw6 extends C09AY implements Function2<UIAssem, C291001Au<? extends C229200uY>, Unit> {
    public final /* synthetic */ DecorationTextEditContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1838240xw6(DecorationTextEditContentAssem decorationTextEditContentAssem) {
        super(2);
        this.LL = decorationTextEditContentAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends C229200uY> c291001Au) throws Throwable {
        Boolean boolValueOf;
        Editable editableLLLIIIIL;
        boolean z;
        RichTextStyle richTextStyle;
        C229200uY c229200uYLIZ = c291001Au.LIZ();
        if (c229200uYLIZ != null) {
            C1838450xwR c1838450xwR = (C1838450xwR) this.LL.LLJJI.getValue();
            int length = 0;
            if (c1838450xwR != null) {
                if (((ArrayList) c1838450xwR.LL).isEmpty()) {
                    z = true;
                    c1838450xwR.i0(c229200uYLIZ, true);
                } else {
                    c1838450xwR.e0(c229200uYLIZ.LIZIZ);
                    int i = 0;
                    for (Object obj : (ArrayList) c1838450xwR.LL) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            C1838520xwY c1838520xwY = (C1838520xwY) obj;
                            C229100uX c229100uX = (C229100uX) C13LP.LJJJLZIJ(i, c229200uYLIZ.LIZ);
                            if (c229100uX != null && (richTextStyle = c229100uX.LJ) != null) {
                                c1838520xwY.LJIIIIZZ(richTextStyle);
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                final DecorationTextEditContentAssem decorationTextEditContentAssem = this.LL;
                final C1838520xwY c1838520xwYIp = decorationTextEditContentAssem.ip();
                if (c1838520xwYIp != null) {
                    TextWatcher textWatcher = new TextWatcher() { // from class: X.0xw7
                        @Override // android.text.TextWatcher
                        public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                        }

                        @Override // android.text.TextWatcher
                        public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                        }

                        @Override // android.text.TextWatcher
                        public final void afterTextChanged(Editable editable) throws Throwable {
                            String string;
                            Editable editableLLLIIIIL2 = C2204961BRm.LLLIIIIL(c1838520xwYIp, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HBj/4Z+uwieiCqIHccPnCYl5Q8xXiTynnZOTxNKj6otkKdgJUuT5izcA6slAHY=", null));
                            if (editableLLLIIIIL2 != null && (string = editableLLLIIIIL2.toString()) != null) {
                                if (string.length() > decorationTextEditContentAssem.lp()) {
                                    DecorationTextEditContentAssem decorationTextEditContentAssem2 = decorationTextEditContentAssem;
                                    InterfaceC1818210xPn interfaceC1818210xPnHp = decorationTextEditContentAssem2.LLJJJJ;
                                    if (interfaceC1818210xPnHp == null) {
                                        synchronized (decorationTextEditContentAssem2) {
                                            interfaceC1818210xPnHp = decorationTextEditContentAssem2.LLJJJJ;
                                            if (interfaceC1818210xPnHp == null) {
                                                interfaceC1818210xPnHp = decorationTextEditContentAssem2.hp();
                                                decorationTextEditContentAssem2.LLJJJJ = interfaceC1818210xPnHp;
                                            }
                                        }
                                    }
                                    interfaceC1818210xPnHp.jq(new C1817880xPG(C497740JfY.LJIJJ(2131851424, Integer.valueOf(decorationTextEditContentAssem.lp())), "ttlive_boards_live_createBoard_characterToast"));
                                    String strSubstring = string.substring(0, decorationTextEditContentAssem.lp());
                                    c1838520xwYIp.setText(strSubstring);
                                    c1838520xwYIp.setSelection(strSubstring.length());
                                } else if (string.length() == 0) {
                                    c1838520xwYIp.setSelection(0);
                                }
                                final C1838520xwY c1838520xwY2 = c1838520xwYIp;
                                final DecorationTextEditContentAssem decorationTextEditContentAssem3 = decorationTextEditContentAssem;
                                HandlerHook.viewPost(c1838520xwY2, new Runnable() { // from class: X.0xw9
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        Spannable spannableStringBuilder;
                                        C1C7U.LIZ("DecorationTextEditContentAssem@918b.addListener$listener$1$afterTextChanged$1");
                                        try {
                                            AssemVMLazy assemVMLazy = decorationTextEditContentAssem3.LLJJIJI;
                                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = DecorationTextEditContentAssem.LLJJL;
                                            FullyCustomizedBoardEditPageViewModel fullyCustomizedBoardEditPageViewModel = (FullyCustomizedBoardEditPageViewModel) assemVMLazy.getValue();
                                            Editable editableLLLIIIIL3 = C2204961BRm.LLLIIIIL(c1838520xwY2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HBj/4Z+uwieiCqIHccPnCYl5Q8xXiTynnZOTxNKj6otkKdgJUuT5izcA6slAHY=", null));
                                            if (editableLLLIIIIL3 == null || (spannableStringBuilder = SpannableString.valueOf(editableLLLIIIIL3)) == null) {
                                                spannableStringBuilder = new SpannableStringBuilder();
                                            }
                                            fullyCustomizedBoardEditPageViewModel.wQ2().LLILLJJLI = spannableStringBuilder;
                                            fullyCustomizedBoardEditPageViewModel.vQ2();
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("DecorationTextEditContentAssem@918b.addListener$listener$1$afterTextChanged$1");
                                    }
                                });
                                c1838520xwYIp.requestLayout();
                            }
                        }
                    };
                    c1838520xwYIp.addTextChangedListener(textWatcher);
                    ((ArrayList) decorationTextEditContentAssem.LLJJJIL).add(new Pair(c1838520xwYIp, textWatcher));
                    c1838520xwYIp.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0xwA
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z2) {
                            if (z2) {
                                KeyBoardUtil.LIZLLL(C497740JfY.LJII(), c1838520xwYIp);
                            } else {
                                KeyBoardUtil.LIZJ(C497740JfY.LJII(), c1838520xwYIp);
                            }
                        }
                    });
                    c1838520xwYIp.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Gws
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (view.hasFocus()) {
                                view.getParent().requestDisallowInterceptTouchEvent(true);
                                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                    view.getParent().requestDisallowInterceptTouchEvent(false);
                                }
                            }
                            return false;
                        }
                    });
                }
                C1838520xwY c1838520xwYIp2 = this.LL.ip();
                if (c1838520xwYIp2 != null) {
                    c1838520xwYIp2.setHint(((C01DP) this.LL.LLJJIJIL.getValue()).LLILZLL);
                }
                DecorationTextEditContentAssem decorationTextEditContentAssem2 = this.LL;
                C1838520xwY c1838520xwYIp3 = decorationTextEditContentAssem2.ip();
                if (c1838520xwYIp3 != null) {
                    c1838520xwYIp3.clearFocus();
                }
                C1838520xwY c1838520xwYIp4 = decorationTextEditContentAssem2.ip();
                if (c1838520xwYIp4 != null) {
                    c1838520xwYIp4.requestFocus();
                }
                C1838520xwY c1838520xwYIp5 = decorationTextEditContentAssem2.ip();
                if (c1838520xwYIp5 != null && (editableLLLIIIIL = C2204961BRm.LLLIIIIL(c1838520xwYIp5, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HBj/4Z+uwieiCqIHccPnCYl5Q8xXiTynnZOTxNKj6otkKdgJUuT5izcA6slAHY=", null))) != null) {
                    length = editableLLLIIIIL.length();
                }
                C1838520xwY c1838520xwYIp6 = decorationTextEditContentAssem2.ip();
                if (c1838520xwYIp6 != null) {
                    c1838520xwYIp6.setSelection(length);
                }
                KeyBoardUtil.LIZLLL(decorationTextEditContentAssem2.getContext(), decorationTextEditContentAssem2.ip());
            }
        }
        return Unit.LIZ;
    }
}

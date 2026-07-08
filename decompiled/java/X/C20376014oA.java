package X;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14oA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20376014oA extends FrameLayout {
    public View LL;
    public ViewGroup LLILLJJLI;
    public LiveEditText LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public C16F5 LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public InterfaceC20376314oD LLJILJIL;

    public final String getEditable() {
        Editable editableLLLFZ;
        LiveEditText liveEditText = this.LLILLL;
        if (liveEditText == null || (editableLLLFZ = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GRAvPEceM8Zqav/OjVT0skDfdYqrRfCjtPWLhN4RLmgaDCg=", null))) == null) {
            return null;
        }
        return editableLLLFZ.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L43
            X.16F5 r0 = r3.LLILZ
            if (r0 == 0) goto La
            X.C12ES.LJIILL(r2, r0)
        La:
            X.16F5 r0 = r3.LLILZIL
            if (r0 == 0) goto L11
            X.C12ES.LJIILL(r2, r0)
        L11:
            X.16F5 r0 = r3.LLILZLL
            if (r0 == 0) goto L18
            X.C12ES.LJIILL(r2, r0)
        L18:
            boolean r0 = r3.LLIZLLLIL
            if (r0 == 0) goto L74
            java.lang.String r0 = r3.getEditable()
            boolean r0 = X.C500260Jjc.LJJIIZ(r0)
            if (r0 != 0) goto L3c
            boolean r0 = r3.LLJ
            if (r0 != 0) goto L3c
            com.bytedance.android.live.design.widget.LiveEditText r0 = r3.LLILLL
            if (r0 == 0) goto L41
            boolean r0 = r0.hasFocus()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L36:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L3d
        L3c:
            r2 = 1
        L3d:
            X.C500260Jjc.LJLJLJ(r3, r2)
            return
        L41:
            r0 = 0
            goto L36
        L43:
            boolean r0 = r3.LLJ
            if (r0 == 0) goto L5e
            X.16F5 r0 = r3.LLILZ
            r1 = 4
            if (r0 == 0) goto L4f
            X.C12ES.LJIILL(r1, r0)
        L4f:
            X.16F5 r0 = r3.LLILZIL
            if (r0 == 0) goto L56
            X.C12ES.LJIILL(r1, r0)
        L56:
            X.16F5 r0 = r3.LLILZLL
            if (r0 == 0) goto L18
            X.C12ES.LJIILL(r1, r0)
            goto L18
        L5e:
            X.16F5 r0 = r3.LLILZ
            if (r0 == 0) goto L65
            X.C439101nJ.LJI(r0)
        L65:
            X.16F5 r0 = r3.LLILZIL
            if (r0 == 0) goto L6c
            X.C439101nJ.LJI(r0)
        L6c:
            X.16F5 r0 = r3.LLILZLL
            if (r0 == 0) goto L18
            X.C439101nJ.LJI(r0)
            goto L18
        L74:
            X.C12ES.LJIILL(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20376014oA.LIZ(boolean):void");
    }

    public final void LIZIZ(String str) {
        boolean zHasFocus;
        LiveEditText liveEditText = this.LLILLL;
        if (liveEditText != null) {
            liveEditText.setHint(str);
        }
        LiveEditText liveEditText2 = this.LLILLL;
        if (liveEditText2 != null) {
            zHasFocus = liveEditText2.hasFocus();
        } else {
            zHasFocus = false;
        }
        LIZ(zHasFocus);
    }

    public final void LIZJ(int i) {
        C16F5 c16f5 = this.LLILZLL;
        if (c16f5 != null) {
            c16f5.setText(String.valueOf(i));
        }
        LiveEditText liveEditText = this.LLILLL;
        boolean zHasFocus = false;
        if (liveEditText != null) {
            liveEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i), new C20376114oB(i, this)});
        }
        LiveEditText liveEditText2 = this.LLILLL;
        if (liveEditText2 != null) {
            zHasFocus = liveEditText2.hasFocus();
        }
        LIZ(zHasFocus);
    }

    public final void LIZLLL(String str) throws Throwable {
        Editable editableLLLFFI;
        int length;
        Editable editableLLLFFI2;
        Editable editableLLLFFI3;
        Editable editableLLLFFI4;
        LiveEditText liveEditText = this.LLILLL;
        if (liveEditText != null) {
            editableLLLFFI = C2204961BRm.LLLFFI(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GRAvPEceM8Zqav/OjVT0skDfdYqrRfCjtPWLhN4RLmgaDCg=", null));
        } else {
            editableLLLFFI = null;
        }
        if (!Intrinsics.LJFF(String.valueOf(editableLLLFFI), str)) {
            LiveEditText liveEditText2 = this.LLILLL;
            if (liveEditText2 != null && (editableLLLFFI4 = C2204961BRm.LLLFFI(liveEditText2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GRAvPEceM8Zqav/OjVT0skDfdYqrRfCjtPWLhN4RLmgaDCg=", null))) != null) {
                editableLLLFFI4.clear();
            }
            LiveEditText liveEditText3 = this.LLILLL;
            if (liveEditText3 != null && (editableLLLFFI3 = C2204961BRm.LLLFFI(liveEditText3, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GRAvPEceM8Zqav/OjVT0skDfdYqrRfCjtPWLhN4RLmgaDCg=", null))) != null) {
                editableLLLFFI3.append((CharSequence) str);
            }
        }
        C16F5 c16f5 = this.LLILZ;
        boolean zHasFocus = false;
        if (c16f5 != null) {
            LiveEditText liveEditText4 = this.LLILLL;
            if (liveEditText4 != null && (editableLLLFFI2 = C2204961BRm.LLLFFI(liveEditText4, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GRAvPEceM8Zqav/OjVT0skDfdYqrRfCjtPWLhN4RLmgaDCg=", null))) != null) {
                length = editableLLLFFI2.length();
            } else {
                length = 0;
            }
            c16f5.setText(String.valueOf(length));
        }
        LiveEditText liveEditText5 = this.LLILLL;
        if (liveEditText5 != null) {
            zHasFocus = liveEditText5.hasFocus();
        }
        LIZ(zHasFocus);
    }

    public C20376014oA(Context context, AttributeSet attributeSet) {
        ViewGroup viewGroup;
        LiveEditText liveEditText;
        C16F5 c16f5;
        C16F5 c16f52;
        super(context, attributeSet, 0);
        this.LLIZ = true;
        C16HQ c16hq = new C16HQ(this, 10);
        C20376214oC c20376214oC = new TextView.OnEditorActionListener() { // from class: X.14oC
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return i == 6;
            }
        };
        C16HH c16hh = new C16HH(this, 2);
        View viewSd = C786410Ut5.Sd(R.layout.hb7, C786410Ut5.ne(getContext()), this);
        this.LL = viewSd;
        if (viewSd != null) {
            viewGroup = (ViewGroup) viewSd.findViewById(R.id.gt5);
        } else {
            viewGroup = null;
        }
        this.LLILLJJLI = viewGroup;
        View view = this.LL;
        if (view != null) {
            liveEditText = (LiveEditText) view.findViewById(R.id.gt6);
        } else {
            liveEditText = null;
        }
        this.LLILLL = liveEditText;
        View view2 = this.LL;
        if (view2 != null) {
            c16f5 = (C16F5) view2.findViewById(R.id.guh);
        } else {
            c16f5 = null;
        }
        this.LLILZ = c16f5;
        View view3 = this.LL;
        if (view3 != null) {
            c16f52 = (C16F5) view3.findViewById(R.id.gui);
        } else {
            c16f52 = null;
        }
        this.LLILZIL = c16f52;
        View view4 = this.LL;
        this.LLILZLL = view4 != null ? (C16F5) view4.findViewById(R.id.gug) : null;
        C16F5 c16f53 = this.LLILZIL;
        if (c16f53 != null) {
            c16f53.setText("/");
        }
        LiveEditText liveEditText2 = this.LLILLL;
        if (liveEditText2 != null) {
            liveEditText2.setRawInputType(1);
        }
        LiveEditText liveEditText3 = this.LLILLL;
        if (liveEditText3 != null) {
            liveEditText3.setImeOptions(6);
        }
        LiveEditText liveEditText4 = this.LLILLL;
        if (liveEditText4 != null) {
            liveEditText4.addTextChangedListener(c16hq);
        }
        LiveEditText liveEditText5 = this.LLILLL;
        if (liveEditText5 != null) {
            liveEditText5.setOnEditorActionListener(c20376214oC);
        }
        LiveEditText liveEditText6 = this.LLILLL;
        if (liveEditText6 != null) {
            liveEditText6.setOnFocusChangeListener(c16hh);
        }
    }
}

package X;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.14o6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20375614o6 extends FrameLayout {
    public View LL;
    public ViewGroup LLILLJJLI;
    public LiveEditText LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public C16F5 LLILZLL;
    public LiveIconView LLIZ;
    public boolean LLIZLLLIL;
    public InterfaceC20376314oD LLJ;
    public InterfaceC20376514oF LLJI;
    public Function0<Boolean> LLJIJIL;

    public final String getEditable() {
        Editable editableLLLFZ;
        LiveEditText liveEditText = this.LLILLL;
        if (liveEditText == null || (editableLLLFZ = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GRAvPEceM8Zqav/OjVT0skDfdYqrRfCjtOSLn+0VDW0b", null))) == null) {
            return null;
        }
        return editableLLLFZ.toString();
    }

    public final void LIZ(boolean z) {
        LiveEditText liveEditText;
        Editable editableLLLFFI;
        if (z) {
            LiveIconView liveIconView = this.LLIZ;
            if (liveIconView != null) {
                C12ES.LJIILL(4, liveIconView);
            }
            C16F5 c16f5 = this.LLILZ;
            if (c16f5 != null) {
                C12ES.LJIILL(0, c16f5);
            }
            C16F5 c16f52 = this.LLILZIL;
            if (c16f52 != null) {
                C12ES.LJIILL(0, c16f52);
            }
            C16F5 c16f53 = this.LLILZLL;
            if (c16f53 != null) {
                C12ES.LJIILL(0, c16f53);
                return;
            }
            return;
        }
        Function0<Boolean> function0 = this.LLJIJIL;
        if (function0 != null && function0.invoke().booleanValue() && (liveEditText = this.LLILLL) != null && (editableLLLFFI = C2204961BRm.LLLFFI(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GRAvPEceM8Zqav/OjVT0skDfdYqrRfCjtOSLn+0VDW0b", null))) != null && a0.LJJJIL(editableLLLFFI)) {
            LiveIconView liveIconView2 = this.LLIZ;
            if (liveIconView2 != null) {
                C12ES.LJIILL(4, liveIconView2);
            }
        } else {
            LiveIconView liveIconView3 = this.LLIZ;
            if (liveIconView3 != null) {
                C12ES.LJIILL(0, liveIconView3);
            }
        }
        C16F5 c16f54 = this.LLILZ;
        if (c16f54 != null) {
            C439101nJ.LJI(c16f54);
        }
        C16F5 c16f55 = this.LLILZIL;
        if (c16f55 != null) {
            C439101nJ.LJI(c16f55);
        }
        C16F5 c16f56 = this.LLILZLL;
        if (c16f56 == null) {
            return;
        }
        C439101nJ.LJI(c16f56);
    }

    public C20375614o6(Context context, AttributeSet attributeSet) {
        ViewGroup viewGroup;
        LiveEditText liveEditText;
        C16F5 c16f5;
        C16F5 c16f52;
        C16F5 c16f53;
        super(context, attributeSet, 0);
        this.LLIZLLLIL = true;
        C16HQ c16hq = new C16HQ(this, 11);
        C20375814o8 c20375814o8 = new TextView.OnEditorActionListener() { // from class: X.14o8
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return i == 6;
            }
        };
        C16HH c16hh = new C16HH(this, 3);
        View viewSd = C786410Ut5.Sd(R.layout.hb8, C786410Ut5.ne(getContext()), this);
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
        if (view4 != null) {
            c16f53 = (C16F5) view4.findViewById(R.id.gug);
        } else {
            c16f53 = null;
        }
        this.LLILZLL = c16f53;
        View view5 = this.LL;
        this.LLIZ = view5 != null ? (LiveIconView) view5.findViewById(R.id.gtd) : null;
        C16F5 c16f54 = this.LLILZIL;
        if (c16f54 != null) {
            c16f54.setText("/");
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
            liveEditText5.setOnEditorActionListener(c20375814o8);
        }
        LiveEditText liveEditText6 = this.LLILLL;
        if (liveEditText6 != null) {
            liveEditText6.setOnFocusChangeListener(c16hh);
        }
        LiveIconView liveIconView = this.LLIZ;
        if (liveIconView != null) {
            C500260Jjc.LJLIIIL(500L, liveIconView, new AwS610S0100000_31(this, 572));
        }
    }
}

package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Xb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C851700Xb6 extends LinearLayout {
    public TuxTextView LL;
    public C0HZQ LLILLJJLI;

    public final C0HZQ getChecklistItemCheckFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dr3);
            this.LLILLJJLI = (C0HZQ) callbackFindViewById;
        }
        return (C0HZQ) callbackFindViewById;
    }

    public final TuxTextView getChecklistItemDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dr5);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LIZ() {
        if (getChecklistItemCheckFromXml().isChecked()) {
            return;
        }
        announceForAccessibility(getChecklistItemDescFromXml().getText());
    }

    public final void LIZIZ(boolean z) {
        if (getChecklistItemCheckFromXml().isChecked() != z) {
            getChecklistItemCheckFromXml().setChecked(z);
            CharSequence charSequenceLIZLLL = new C20095613k2(CharSequence.class).LIZLLL(getChecklistItemCheckFromXml());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((Object) charSequenceLIZLLL);
            sbLIZ.append(", ");
            sbLIZ.append((Object) getChecklistItemDescFromXml().getText());
            announceForAccessibility(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void setChecklistItemCheckFromXml(C0HZQ c0hzq) {
        this.LLILLJJLI = c0hzq;
    }

    public final void setChecklistItemDescFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public void setDesc(String str) {
        getChecklistItemDescFromXml().setText(str);
    }

    public void setVariant(EnumC851670Xb3 enumC851670Xb3) {
        int i = C851710Xb7.LIZ[enumC851670Xb3.ordinal()];
        int iIntValue = 0;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LIZIZ(false);
                    TuxTextView checklistItemDescFromXml = getChecklistItemDescFromXml();
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, getContext());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    }
                    checklistItemDescFromXml.setTextColor(iIntValue);
                    C786410Ut5.y5(getChecklistItemCheckFromXml(), 0.5f);
                    C786410Ut5.B5(getChecklistItemDescFromXml(), 1.0f);
                    return;
                }
                throw new C1954807lC();
            }
            LIZIZ(true);
            TuxTextView checklistItemDescFromXml2 = getChecklistItemDescFromXml();
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, getContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            }
            checklistItemDescFromXml2.setTextColor(iIntValue);
            C786410Ut5.y5(getChecklistItemCheckFromXml(), 1.0f);
            C786410Ut5.B5(getChecklistItemDescFromXml(), 1.0f);
            return;
        }
        getChecklistItemCheckFromXml().setChecked(false);
        TuxTextView checklistItemDescFromXml3 = getChecklistItemDescFromXml();
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.zs, getContext());
        if (numLIZJ3 != null) {
            iIntValue = numLIZJ3.intValue();
        }
        checklistItemDescFromXml3.setTextColor(iIntValue);
        C786410Ut5.y5(getChecklistItemCheckFromXml(), 0.5f);
        C786410Ut5.B5(getChecklistItemDescFromXml(), 0.5f);
    }

    public C851700Xb6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C851700Xb6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.LJLLJ(context, R.layout.xh, this);
        setVariant(EnumC851670Xb3.None);
    }
}

package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GeO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C420580GeO extends LinearLayout {
    public TuxTextView LL;
    public TuxIconView LLILLJJLI;
    public boolean LLILLL;

    public final TuxIconView getChecklistItemCheckIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dr4);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getChecklistItemDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dr5);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LIZ(boolean z) {
        int i;
        if (this.LLILLL != z) {
            this.LLILLL = z;
            Context context = getContext();
            if (z) {
                i = 2131838683;
            } else {
                i = R.string.mf6;
            }
            String string = context.getString(i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append(", ");
            sbLIZ.append((Object) getChecklistItemDescFromXml().getText());
            announceForAccessibility(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void setChecklistItemCheckIconFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setChecklistItemDescFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public void setDesc(String str) {
        getChecklistItemDescFromXml().setText(str);
    }

    public void setVariant(EnumC428960Gru enumC428960Gru) {
        LinearLayout.LayoutParams layoutParams;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        ViewGroup.LayoutParams layoutParams2 = getChecklistItemCheckIconFromXml().getLayoutParams();
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        int i = C420590GeP.LIZ[enumC428960Gru.ordinal()];
        int iIntValue4 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LIZ(false);
                    if (layoutParams != null) {
                        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                        if (layoutParams != null) {
                            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                        }
                    }
                    C786410Ut5.M6(getChecklistItemCheckIconFromXml(), layoutParams);
                    TuxIconView checklistItemCheckIconFromXml = getChecklistItemCheckIconFromXml();
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1p);
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
                    c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    checklistItemCheckIconFromXml.setImageDrawable(c384050F3z.LIZ(getContext()));
                    TuxTextView checklistItemDescFromXml = getChecklistItemDescFromXml();
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
                    if (numLIZJ != null) {
                        iIntValue3 = numLIZJ.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    checklistItemDescFromXml.setTextColor(iIntValue3);
                    TuxIconView checklistItemCheckIconFromXml2 = getChecklistItemCheckIconFromXml();
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1p, getContext());
                    if (numLIZJ2 != null) {
                        iIntValue4 = numLIZJ2.intValue();
                    }
                    checklistItemCheckIconFromXml2.setTintColor(iIntValue4);
                    C786410Ut5.B5(getChecklistItemDescFromXml(), 1.0f);
                    getChecklistItemCheckIconFromXml().setContentDescription(getContext().getString(2131823335));
                    return;
                }
                throw new C1954807lC();
            }
            LIZ(true);
            if (layoutParams != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            }
            C786410Ut5.M6(getChecklistItemCheckIconFromXml(), layoutParams);
            TuxTextView checklistItemDescFromXml2 = getChecklistItemDescFromXml();
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1k, getContext());
            if (numLIZJ3 != null) {
                iIntValue2 = numLIZJ3.intValue();
            } else {
                iIntValue2 = 0;
            }
            checklistItemDescFromXml2.setTextColor(iIntValue2);
            getChecklistItemCheckIconFromXml().setIconRes(R.raw.icon_tick_fill_small);
            TuxIconView checklistItemCheckIconFromXml3 = getChecklistItemCheckIconFromXml();
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1v, getContext());
            if (numLIZJ4 != null) {
                iIntValue4 = numLIZJ4.intValue();
            }
            checklistItemCheckIconFromXml3.setTintColor(iIntValue4);
            C786410Ut5.B5(getChecklistItemDescFromXml(), 1.0f);
            getChecklistItemCheckIconFromXml().setContentDescription(getContext().getString(2131823334));
            return;
        }
        this.LLILLL = false;
        TuxTextView checklistItemDescFromXml3 = getChecklistItemDescFromXml();
        Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.zs, getContext());
        if (numLIZJ5 != null) {
            iIntValue = numLIZJ5.intValue();
        } else {
            iIntValue = 0;
        }
        checklistItemDescFromXml3.setTextColor(iIntValue);
        TuxIconView checklistItemCheckIconFromXml4 = getChecklistItemCheckIconFromXml();
        Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.a1p, getContext());
        if (numLIZJ6 != null) {
            iIntValue4 = numLIZJ6.intValue();
        }
        checklistItemCheckIconFromXml4.setTintColor(iIntValue4);
        C786410Ut5.B5(getChecklistItemDescFromXml(), 0.5f);
    }

    public C420580GeO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LinearLayout.inflate(context, R.layout.xi, this);
        setVariant(EnumC428960Gru.NONE);
        setGravity(16);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
}

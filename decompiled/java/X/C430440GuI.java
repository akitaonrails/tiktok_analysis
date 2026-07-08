package X;

import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0GuI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430440GuI extends TuxTextView implements InterfaceC1339670kxx {
    public CharSequence LLJJJJ;
    public Comment LLJJJJJIL;
    public Aweme LLJJJJLIIL;
    public String LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public final int LLJL;
    public SpannableStringBuilder LLJLIL;
    public AbstractC430450GuJ LLJLILLLLZIIL;
    public final ARunnableS106S0100000_6 LLJLL;
    public final C0IDP LLJLLIL;

    @Override // X.InterfaceC1339670kxx
    public final void LJII() {
    }

    @Override // X.InterfaceC1339670kxx
    public void setTranslateClickListener(InterfaceC1340280kyw interfaceC1340280kyw) {
    }

    @Override // X.InterfaceC1339670kxx
    public void setTranslationState(AbstractC1340120kyg abstractC1340120kyg) {
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        if (action == 0 || action == 1 || action == 3) {
            Layout layout = getLayout();
            if (layout == null) {
                return false;
            }
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - getTotalPaddingLeft();
            int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical((y - getTotalPaddingTop()) + getScrollY()), totalPaddingLeft + getScrollX());
            CharSequence text = getText();
            if (text instanceof Spannable) {
                AbstractC430450GuJ[] abstractC430450GuJArr = (AbstractC430450GuJ[]) ((Spannable) text).getSpans(iU3, iU3, AbstractC430450GuJ.class);
                if (abstractC430450GuJArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    AbstractC430450GuJ abstractC430450GuJ = abstractC430450GuJArr[0];
                    if (action != 0) {
                        if (action != 1 || abstractC430450GuJ.LL) {
                            abstractC430450GuJ.LL = false;
                            this.LLJLILLLLZIIL = null;
                            invalidate();
                        }
                    } else {
                        abstractC430450GuJ.LL = true;
                        this.LLJLILLLLZIIL = abstractC430450GuJ;
                        invalidate();
                    }
                    return super.onTouchEvent(motionEvent);
                }
                AbstractC430450GuJ abstractC430450GuJ2 = this.LLJLILLLLZIIL;
                if (abstractC430450GuJ2 != null) {
                    abstractC430450GuJ2.LL = false;
                    this.LLJLILLLLZIIL = null;
                    invalidate();
                    return true;
                }
                if (action == 0) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public C430440GuI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJL = 4;
        this.LLJLL = new ARunnableS106S0100000_6((Object) this, 152);
        setMovementMethod(LinkMovementMethod.getInstance());
        setTextAlignment(5);
        setLineSpacing(0.0f, 1.06f);
        this.LLJLLIL = new C0IDP(this, 7);
    }

    public final StaticLayout LJJJJL(int i, CharSequence charSequence) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), i).setIncludePad(getIncludeFontPadding()).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).build();
    }

    public final void LJJJJJ(Comment comment, CharSequence charSequence, Aweme aweme, String str, String str2) {
        if (charSequence != null && charSequence.length() != 0 && comment != null) {
            this.LLJJJJJIL = comment;
            this.LLJJJJ = charSequence;
            this.LLJJJJLIIL = aweme;
            this.LLJJL = str;
            this.LLJJLIIIJLLLLLLLZ = str2;
            if (comment.isAudioTextExpanded()) {
                setText(charSequence);
                setMaxLines(Integer.MAX_VALUE);
                getLayoutParams().height = -2;
            } else {
                setText(charSequence);
                setMaxLines(this.LLJL);
                getLayoutParams().height = -2;
                HandlerHook.viewRemoveCallbacks(this, this.LLJLL);
                addOnLayoutChangeListener(this.LLJLLIL);
            }
        }
    }
}

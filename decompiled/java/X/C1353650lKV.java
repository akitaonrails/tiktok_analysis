package X;

import Y.ACallableS426S0100000_21;
import Y.ALAdapterS7S0110000_21;
import Y.AUListenerS270S0100000_21;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.comment.commentlist.ui.CommentCharLimitConfig;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IPostModeService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lKV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1353650lKV extends TuxTextView implements InterfaceC1339670kxx {
    public final int LLJJJJ;
    public Comment LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public String LLJLIL;
    public boolean LLJLILLLLZIIL;
    public ViewTreeObserverOnGlobalLayoutListenerC1402100mae LLJLL;
    public final C01GW LLJLLIL;
    public final Map<Integer, Integer> LLJLLL;
    public ViewTreeObserverOnPreDrawListenerC1402060maa LLJZ;
    public InterfaceC1340140kyi LLJZIJLIL;
    public boolean LLL;
    public CharSequence LLLF;
    public CharSequence LLLFF;
    public String LLLFFI;
    public String LLLFZ;
    public int LLLI;
    public int LLLII;
    public int LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public int LLLIIL;
    public Animator LLLIILIL;
    public SpannableString LLLIL;
    public StaticLayout LLLILZ;
    public SpannableString LLLILZJ;
    public StaticLayout LLLILZLLLI;

    @Override // X.InterfaceC1339670kxx
    public final void LJII() {
    }

    public final void LJJJJL() {
        C1744700vVE.LJIIIZ(-2, this);
        if (C1353700lKa.LIZ()) {
            LJJJJJ();
            C1353710lKb translationTextView = getTranslationTextView();
            if (translationTextView != null) {
                translationTextView.LIZLLL();
            }
        }
    }

    public final void setNewVideoReplyStyle(boolean z) {
    }

    private final C1353710lKb getTranslationTextView() {
        return (C1353710lKb) this.LLJLLIL.getValue();
    }

    public final void LJJJJJ() {
        ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae;
        if (!this.LLL || this.LLJLL == null) {
            ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae2 = this.LLJLL;
            if (viewTreeObserverOnGlobalLayoutListenerC1402100mae2 != null) {
                C786410Ut5.C3(getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1402100mae2);
            }
            this.LLJLL = new ViewTreeObserverOnGlobalLayoutListenerC1402100mae(this, 6);
            if (this.LLL) {
                ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae3 = this.LLJLL;
                if (viewTreeObserverOnGlobalLayoutListenerC1402100mae3 == null) {
                    return;
                }
                C786410Ut5.x3(getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1402100mae3);
                return;
            }
            IPostModeService iPostModeService = (IPostModeService) PluggableExtentionKt.pluggableSpi$default(IPostModeService.class, false, false, false, 14, null);
            if (iPostModeService == null || !iPostModeService.LJJ()) {
                C786410Ut5.x3(getViewTreeObserver(), this.LLJLL);
                return;
            }
            LifecycleOwner lifecycleOwnerLIZJ = SAFExtensionKt.LIZJ(this);
            if ((lifecycleOwnerLIZJ == null && (lifecycleOwnerLIZJ = C948503nH.LIZ(this)) == null) || (viewTreeObserverOnGlobalLayoutListenerC1402100mae = this.LLJLL) == null) {
                return;
            }
            SAFExtensionKt.LIZIZ(getViewTreeObserver(), lifecycleOwnerLIZJ, viewTreeObserverOnGlobalLayoutListenerC1402100mae);
        }
    }

    public final boolean getCollapsed() {
        return !C1346420l8q.LIZ(this.LLJJJJJIL != null ? Boolean.valueOf(r0.isExpand) : null);
    }

    public final Integer getMaxActualLine() {
        return (Integer) C13LP.LJJLIIIJLJLI(((LinkedHashMap) this.LLJLLL).values());
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae;
        if (this.LLL && (viewTreeObserverOnGlobalLayoutListenerC1402100mae = this.LLJLL) != null) {
            C786410Ut5.C3(getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1402100mae);
        }
        Animator animator = this.LLLIILIL;
        if (animator != null) {
            animator.cancel();
        }
        super.onDetachedFromWindow();
    }

    private final int getFoldLineCount() {
        return C1353700lKa.LIZJ();
    }

    public final void LJJJJLL() {
        if (C1353700lKa.LIZ()) {
            ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae = this.LLJLL;
            if (viewTreeObserverOnGlobalLayoutListenerC1402100mae != null) {
                C786410Ut5.C3(getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1402100mae);
            }
            this.LLJLL = null;
            if (this.LLJZ != null) {
                C786410Ut5.D3(getViewTreeObserver(), this.LLJZ);
            }
            this.LLJZ = null;
            C1353710lKb translationTextView = getTranslationTextView();
            if (translationTextView != null) {
                translationTextView.LJFF();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            Comment comment = this.LLJJJJJIL;
            String message = e.getMessage();
            c1350920lG6.getClass();
            if (comment == null) {
                return true;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("group_id", comment.getAwemeId());
            c2344009Gk.LJIIIIZZ("comment_id", comment.getCid());
            c2344009Gk.LJIIIIZZ("comment_category", C1345700l7g.LIZ(comment));
            c2344009Gk.LJIIIIZZ("error_message", message);
            C11NZ.LJJJJI(new ACallableS426S0100000_21(c2344009Gk, 16)).LJL(C11S5.LIZ()).LJJLJ();
            return true;
        }
    }

    public final int getEllipsisColor() {
        return this.LLLIIII;
    }

    public final boolean getEnableCollapsed() {
        return this.LLLIIIIL;
    }

    public final String getExpandAction() {
        return this.LLLFZ;
    }

    public final int getExpandActionColor() {
        return this.LLLII;
    }

    public final boolean getFixMemoryLeak() {
        return this.LLL;
    }

    public final int getLimitedMaxLines() {
        return this.LLLI;
    }

    public final boolean getNeedCollapse() {
        return this.LLLIIIL;
    }

    public final CharSequence getOriginalText() {
        return this.LLLF;
    }

    public final String getShowAllAction() {
        return this.LLLFFI;
    }

    private final void setCollapsed(boolean z) {
        Comment comment = this.LLJJJJJIL;
        if (comment != null) {
            comment.isExpand = !z;
        }
    }

    private final void setNeedCollapse(boolean z) {
        this.LLLIIIL = z;
        Comment comment = this.LLJJJJJIL;
        if (comment != null) {
            comment.needCollapse = z;
        }
    }

    public final void LJJJLZIJ(boolean z) throws Throwable {
        int expandCount;
        int iIntValue;
        int measuredHeight;
        if (Intrinsics.LJFF(this.LLLF, this.LLLFF)) {
            setCollapsed(!getCollapsed());
            return;
        }
        Comment comment = this.LLJJJJJIL;
        if (comment != null) {
            comment.setExpandCount(comment.getExpandCount() + 1);
        }
        Comment comment2 = this.LLJJJJJIL;
        int i = this.LLJJJJLIIL;
        int i2 = this.LLJJL;
        String str = this.LLJJLIIIJLLLLLLLZ;
        String str2 = this.LLJL;
        String str3 = this.LLJLIL;
        if (comment2 != null) {
            expandCount = comment2.getExpandCount();
        } else {
            expandCount = 1;
        }
        C1350920lG6.LJJLIIIJILLIZJL(comment2, i, i2, str, str2, str3, false, expandCount, 64);
        InterfaceC1340140kyi interfaceC1340140kyi = this.LLJZIJLIL;
        if (interfaceC1340140kyi != null) {
            interfaceC1340140kyi.LIZIZ();
        }
        int height = getHeight();
        if (C1347610lAl.LIZLLL()) {
            Integer num = (Integer) ((LinkedHashMap) this.LLJLLL).get(Integer.valueOf(this.LLLI + ((CommentCharLimitConfig) C1353700lKa.LIZIZ.getValue()).expandLinesStep));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = Integer.MAX_VALUE;
            }
        } else {
            iIntValue = this.LLLI + ((CommentCharLimitConfig) C1353700lKa.LIZIZ.getValue()).expandLinesStep;
        }
        setMaxLines(iIntValue);
        if (z) {
            setMaxLines(this.LLJJJJ);
        }
        if (getCollapsed()) {
            setText(this.LLLF);
            C439870HMr.LIZJ(this, null);
        } else {
            setText(this.LLLFF);
        }
        if (C1347610lAl.LIZLLL()) {
            measuredHeight = LJJJLIIL(getMaxLines(), getWidth(), getText()).getHeight();
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 0));
            measuredHeight = getMeasuredHeight();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toggle  height0=");
        sbLIZ.append(height);
        sbLIZ.append("  height1=");
        sbLIZ.append(measuredHeight);
        C2188811AlT.LIZIZ(sbLIZ);
        Animator animator = this.LLLIILIL;
        if (animator != null) {
            animator.cancel();
        }
        long jAbs = ((long) Math.abs(measuredHeight - height)) * 2;
        if (jAbs > 300) {
            jAbs = 300;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, measuredHeight);
        valueAnimatorOfInt.setInterpolator(new C12DM());
        valueAnimatorOfInt.setDuration(jAbs);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS270S0100000_21(this, 30));
        valueAnimatorOfInt.addListener(new ALAdapterS7S0110000_21(this, z, 1));
        valueAnimatorOfInt.start();
        this.LLLIILIL = valueAnimatorOfInt;
    }

    public final void setAsrPiggybackTranslateListener(InterfaceC1340280kyw interfaceC1340280kyw) {
        boolean z;
        String cid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAsrPiggybackTranslateListener listener:");
        if (interfaceC1340280kyw != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", cid:");
        Comment comment = this.LLJJJJJIL;
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        sbLIZ.append(cid);
        C2188811AlT.LIZIZ(sbLIZ);
        C1353710lKb translationTextView = getTranslationTextView();
        if (translationTextView != null) {
            translationTextView.LJIIL = interfaceC1340280kyw;
        }
    }

    public final void setAsrTranslateClickListener(InterfaceC1340280kyw interfaceC1340280kyw) {
        boolean z;
        String cid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAsrTranslateClickListener listener:");
        if (interfaceC1340280kyw != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", cid:");
        Comment comment = this.LLJJJJJIL;
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        sbLIZ.append(cid);
        C2188811AlT.LIZIZ(sbLIZ);
        C1353710lKb translationTextView = getTranslationTextView();
        if (translationTextView != null) {
            translationTextView.LJIIJJI = interfaceC1340280kyw;
        }
    }

    public final void setAsrTranslationState(AbstractC1340120kyg abstractC1340120kyg) throws Throwable {
        String cid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAsrTranslationState state:");
        sbLIZ.append(abstractC1340120kyg);
        sbLIZ.append(", cid:");
        Comment comment = this.LLJJJJJIL;
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        sbLIZ.append(cid);
        C2188811AlT.LIZIZ(sbLIZ);
        C1353710lKb translationTextView = getTranslationTextView();
        if (translationTextView != null) {
            translationTextView.LJIIIIZZ = abstractC1340120kyg;
            translationTextView.LIZLLL();
        }
        LJJJZ((getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd(), "set_asr_translation_state");
    }

    public final void setEllipsisColor(int i) {
        this.LLLIIII = i;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        super.setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void setEnableCollapsed(boolean z) {
        this.LLLIIIIL = z;
    }

    public final void setExpandAction(String str) {
        this.LLLFZ = str;
        int length = String.valueOf((char) 8230).length();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((char) 8230);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        this.LLLIL = spannableString;
        C786410Ut5.p2(spannableString, new C444920HcY(62, false), length, this.LLLIL.length(), 33);
        C286050BJb.LIZ.getClass();
        if (C286050BJb.LIZ()) {
            SpannableString spannableString2 = this.LLLIL;
            AbstractC1353440lKA abstractC1353440lKA = new AbstractC1353440lKA() { // from class: X.0lKW
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) throws Throwable {
                    boolean z = false;
                    this.LL = false;
                    C1353650lKV c1353650lKV = this.LLILLL;
                    C0BJQ.LIZ.getClass();
                    if (((Number) C0BJQ.LIZIZ.getValue()).intValue() == 2) {
                        z = true;
                    }
                    c1353650lKV.LJJJLZIJ(z);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    float f;
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                    if (this.LL) {
                        f = 0.2f;
                    } else {
                        f = 1.0f;
                    }
                    textPaint.setColor(Color.argb((int) (Color.alpha(this.LLILLL.getExpandActionColor()) * f), Color.red(this.LLILLL.getExpandActionColor()), Color.green(this.LLILLL.getExpandActionColor()), Color.blue(this.LLILLL.getExpandActionColor())));
                }
            };
            abstractC1353440lKA.LLILLJJLI = true;
            C786410Ut5.p2(spannableString2, abstractC1353440lKA, 0, this.LLLIL.length(), 33);
            C786410Ut5.p2(this.LLLIL, new ForegroundColorSpan(this.LLLIIII), 0, length, 33);
            return;
        }
        SpannableString spannableString3 = this.LLLIL;
        AbstractC1353420lK8 abstractC1353420lK8 = new AbstractC1353420lK8() { // from class: X.0lKX
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) throws Throwable {
                boolean z = false;
                this.LL = false;
                C1353650lKV c1353650lKV = this.LLILLL;
                C0BJQ.LIZ.getClass();
                if (((Number) C0BJQ.LIZIZ.getValue()).intValue() == 2) {
                    z = true;
                }
                c1353650lKV.LJJJLZIJ(z);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                float f;
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                if (this.LL) {
                    f = 0.2f;
                } else {
                    f = 1.0f;
                }
                textPaint.setColor(Color.argb((int) (Color.alpha(this.LLILLL.getExpandActionColor()) * f), Color.red(this.LLILLL.getExpandActionColor()), Color.green(this.LLILLL.getExpandActionColor()), Color.blue(this.LLILLL.getExpandActionColor())));
            }
        };
        abstractC1353420lK8.LLILLJJLI = true;
        C786410Ut5.p2(spannableString3, abstractC1353420lK8, length, this.LLLIL.length(), 33);
    }

    public final void setExpandActionColor(int i) {
        this.LLLII = i;
    }

    public final void setExpandOrCollapseClickListener(InterfaceC1340140kyi interfaceC1340140kyi) {
        if (!C295360Bhu.LIZ()) {
            return;
        }
        this.LLJZIJLIL = interfaceC1340140kyi;
    }

    public final void setFixMemoryLeak(boolean z) {
        this.LLL = z;
    }

    public final void setLimitedMaxLines(int i) {
        if (this.LLLI == i) {
            return;
        }
        this.LLLI = i;
        LJJJZ((getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd(), "");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(i);
    }

    public final void setOriginalText(CharSequence charSequence) throws Throwable {
        int iLIZJ;
        int iLIZJ2;
        int iLIZJ3;
        this.LLLF = charSequence;
        setText(charSequence);
        if (!C1353700lKa.LIZ()) {
            return;
        }
        Comment comment = this.LLJJJJJIL;
        if (comment == null || getMaxLines() != comment.getCurTextMaxLines()) {
            Comment comment2 = this.LLJJJJJIL;
            if (comment2 != null) {
                iLIZJ = comment2.getCurTextMaxLines();
            } else {
                iLIZJ = C1353700lKa.LIZJ();
            }
            setMaxLines(iLIZJ);
        }
        C0BJQ.LIZ.getClass();
        if (((Number) C0BJQ.LIZIZ.getValue()).intValue() == 1) {
            setLimitedMaxLines(this.LLJJJJ);
            setMaxLines(this.LLJJJJ);
        } else if (C1347610lAl.LIZLLL()) {
            Comment comment3 = this.LLJJJJJIL;
            if (comment3 == null || this.LLLI != comment3.getCurTextLimitedLines()) {
                Comment comment4 = this.LLJJJJJIL;
                if (comment4 != null) {
                    iLIZJ3 = comment4.getCurTextLimitedLines();
                } else {
                    iLIZJ3 = C1353700lKa.LIZJ();
                }
                setLimitedMaxLines(iLIZJ3);
            }
        } else {
            Comment comment5 = this.LLJJJJJIL;
            if (comment5 == null || this.LLLI != comment5.getCurTextMaxLines()) {
                Comment comment6 = this.LLJJJJJIL;
                if (comment6 != null) {
                    iLIZJ2 = comment6.getCurTextMaxLines();
                } else {
                    iLIZJ2 = C1353700lKa.LIZJ();
                }
                setLimitedMaxLines(iLIZJ2);
            }
        }
        if (this.LLJLILLLLZIIL) {
            setMaxLines(this.LLLI);
            this.LLJZ = new ViewTreeObserverOnPreDrawListenerC1402060maa(this, 3);
            C786410Ut5.y3(getViewTreeObserver(), this.LLJZ);
            LJJJJJ();
            return;
        }
        LJJJZ(getWidth(), "reset_text");
    }

    public final void setShowAllAction(String str) {
        this.LLLFFI = str;
        int length = String.valueOf((char) 8230).length();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((char) 8230);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        this.LLLILZJ = spannableString;
        C786410Ut5.p2(spannableString, new C444920HcY(62, false), length, this.LLLILZJ.length(), 33);
        C286050BJb.LIZ.getClass();
        if (C286050BJb.LIZ()) {
            SpannableString spannableString2 = this.LLLILZJ;
            AbstractC1353440lKA abstractC1353440lKA = new AbstractC1353440lKA() { // from class: X.0lKY
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) throws Throwable {
                    this.LL = false;
                    this.LLILLL.LJJJLZIJ(true);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    float f;
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                    if (this.LL) {
                        f = 0.2f;
                    } else {
                        f = 1.0f;
                    }
                    textPaint.setColor(Color.argb((int) (Color.alpha(this.LLILLL.getExpandActionColor()) * f), Color.red(this.LLILLL.getExpandActionColor()), Color.green(this.LLILLL.getExpandActionColor()), Color.blue(this.LLILLL.getExpandActionColor())));
                }
            };
            abstractC1353440lKA.LLILLJJLI = true;
            C786410Ut5.p2(spannableString2, abstractC1353440lKA, 0, this.LLLILZJ.length(), 33);
            C786410Ut5.p2(this.LLLILZJ, new ForegroundColorSpan(this.LLLIIII), 0, length, 33);
            return;
        }
        SpannableString spannableString3 = this.LLLILZJ;
        AbstractC1353420lK8 abstractC1353420lK8 = new AbstractC1353420lK8() { // from class: X.0lKZ
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) throws Throwable {
                this.LL = false;
                this.LLILLL.LJJJLZIJ(true);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                float f;
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                if (this.LL) {
                    f = 0.2f;
                } else {
                    f = 1.0f;
                }
                textPaint.setColor(Color.argb((int) (Color.alpha(this.LLILLL.getExpandActionColor()) * f), Color.red(this.LLILLL.getExpandActionColor()), Color.green(this.LLILLL.getExpandActionColor()), Color.blue(this.LLILLL.getExpandActionColor())));
            }
        };
        abstractC1353420lK8.LLILLJJLI = true;
        C786410Ut5.p2(spannableString3, abstractC1353420lK8, length, this.LLLILZJ.length(), 33);
    }

    @Override // X.InterfaceC1339670kxx
    public void setTranslateClickListener(InterfaceC1340280kyw interfaceC1340280kyw) {
        C1353710lKb translationTextView = getTranslationTextView();
        if (translationTextView != null) {
            translationTextView.LJIIJ = interfaceC1340280kyw;
        }
    }

    @Override // X.InterfaceC1339670kxx
    public void setTranslationState(AbstractC1340120kyg abstractC1340120kyg) throws Throwable {
        C1353710lKb translationTextView = getTranslationTextView();
        if (translationTextView != null) {
            translationTextView.LJII = abstractC1340120kyg;
            translationTextView.LIZLLL();
        }
        LJJJZ((getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd(), "set_translation_state");
    }

    public C1353650lKV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJZ(int r19, java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1353650lKV.LJJJZ(int, java.lang.String):void");
    }

    public C1353650lKV(Context context, AttributeSet attributeSet, int i) {
        int iIntValue;
        int iIntValue2;
        super(context, attributeSet, i);
        this.LLJJJJ = 100000;
        this.LLJJJJLIIL = -1;
        this.LLJJL = -1;
        this.LLJLILLLLZIIL = true;
        this.LLJLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(context, 1203));
        this.LLJLLL = new LinkedHashMap();
        this.LLLF = "";
        this.LLLFFI = context.getResources().getString(2131836851);
        this.LLLFZ = context.getResources().getString(2131825209);
        this.LLLI = C1353700lKa.LIZJ();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLLII = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        this.LLLIIII = iIntValue2;
        this.LLLIL = new SpannableString("");
        this.LLLILZJ = new SpannableString("");
        new SpannableString("");
        setEllipsize(TextUtils.TruncateAt.END);
        C0BJQ.LIZ.getClass();
        if (((Number) C0BJQ.LIZIZ.getValue()).intValue() != 1) {
            setExpandAction(context.getResources().getString(2131825209));
        }
        C0A89.LIZ.getClass();
        if (C0A89.LIZ()) {
            setShowAllAction(context.getResources().getString(2131836851));
        }
    }

    public final void LJJJJLI(CharSequence charSequence, Comment comment, C1353740lKe c1353740lKe) {
        if (comment != null) {
            this.LLJJJJJIL = comment;
            C1353710lKb translationTextView = getTranslationTextView();
            if (translationTextView != null) {
                translationTextView.LJIIIZ = comment;
                translationTextView.LIZLLL();
            }
        }
        this.LLJJJJLIIL = c1353740lKe.LIZ;
        this.LLJJL = c1353740lKe.LIZIZ;
        this.LLJLIL = c1353740lKe.LIZJ;
        this.LLJJLIIIJLLLLLLLZ = c1353740lKe.LIZLLL;
        this.LLJL = c1353740lKe.LJ;
        C0BJQ.LIZ.getClass();
        if (((Number) C0BJQ.LIZIZ.getValue()).intValue() != 1) {
            setExpandAction(getContext().getResources().getString(2131825209));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindCommentTextWithEllipsize ");
        sbLIZ.append((Object) charSequence);
        C2188811AlT.LIZIZ(sbLIZ);
        if (charSequence == null) {
            charSequence = "";
        }
        setOriginalText(charSequence);
    }

    public final StaticLayout LJJJLIIL(int i, int i2, CharSequence charSequence) {
        if (i2 < 0) {
            i2 = 0;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), i2).setIncludePad(false).setEllipsize(TextUtils.TruncateAt.END).setMaxLines(i).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).build();
    }
}

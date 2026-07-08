package X;

import Y.AUListenerS159S0300000_32;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.ParagraphStyle;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.larus.business.markdown.api.model.BgListItemConfig;
import com.larus.business.markdown.api.model.CodeBlockConfig;
import com.larus.business.markdown.api.model.CodeStyle;
import com.larus.business.markdown.api.model.CustomSpaceScene;
import com.larus.business.markdown.api.model.InlineCodeConfig;
import com.larus.business.markdown.api.model.ListItemConfig;
import com.larus.business.markdown.api.model.TableConfig;
import com.larus.business.markdown.api.model.TaskListConfig;
import com.larus.business.markdown.impl.markwon.core.spans.quoteblock.QuoteCustomTextSizeSpan;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import io.noties.markwon.core.spans.CustomLinkSpan;
import io.noties.markwon.core.spans.CustomMentionSpan;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.18s5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21419518s5 implements InterfaceC1860180yVU {
    public final Context LIZ;
    public final boolean LIZIZ;
    public final C21419418s4 LIZJ;
    public final WeakReference<InterfaceC1860060yVI> LIZLLL;
    public final Map<String, ? extends Object> LJ;
    public Integer LJFF;
    public final C21432418uA LJI;

    @Override // X.InterfaceC1860180yVU
    public final C21432418uA LIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1860180yVU
    public final C21419418s4 LIZIZ() {
        return this.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1DcA] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0EfU] */
    /* JADX WARN: Type inference failed for: r11v2, types: [X.17tS] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.18rf] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.0GvD] */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.18r4] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.18r5] */
    public C21419518s5(final Context context, boolean z, C21419418s4 c21419418s4, WeakReference<InterfaceC1860060yVI> weakReference, Map<String, ? extends Object> map) {
        boolean z2;
        InterfaceC21173117tR interfaceC21173117tR;
        this.LIZ = context;
        this.LIZIZ = z;
        this.LIZJ = c21419418s4;
        this.LIZLLL = weakReference;
        this.LJ = map;
        C21432218u8 c21432218u8 = new C21432218u8(context);
        c21432218u8.LIZIZ(new AbstractC21425218t0() { // from class: X.18lf
            @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
            public final void LJII(TextView textView, AbstractC21430218to abstractC21430218to, C21431218ty c21431218ty) {
                Context context2;
                InterfaceC1860060yVI interfaceC1860060yVI;
                C14S7 c14s7 = c21431218ty.LIZIZ;
                C21419518s5 c21419518s5 = this.LIZ;
                C14S5<Context> c14s5 = C21379618le.LIZ;
                if (textView == null || (context2 = textView.getContext()) == null) {
                    context2 = c21419518s5.LIZ;
                }
                c14s7.LIZ(c14s5, context2);
                WeakReference<InterfaceC1860060yVI> weakReference2 = c21419518s5.LIZLLL;
                if (weakReference2 != null && (interfaceC1860060yVI = weakReference2.get()) != null) {
                    c14s7.LIZ(C21379618le.LIZJ, interfaceC1860060yVI);
                    Integer numValueOf = Integer.valueOf((interfaceC1860060yVI.getMarkdownWidth() - interfaceC1860060yVI.LJJZZI().getPaddingStart()) - interfaceC1860060yVI.LJJZZI().getPaddingEnd());
                    c21419518s5.LJFF = numValueOf;
                    c14s7.LIZ(C21379618le.LIZIZ, numValueOf);
                }
                Map<String, ? extends Object> map2 = c21419518s5.LJ;
                if (map2 != null) {
                    c14s7.LIZ(C21379618le.LIZLLL, map2);
                }
            }
        });
        c21432218u8.LIZIZ(new C21424318sr(c21419418s4.LJJIJ));
        InterfaceC21420018sA interfaceC21420018sA = (InterfaceC21420018sA) C21419918s9.LIZ.getValue();
        if (interfaceC21420018sA != null) {
            C14S5<Context> c14s5 = C21379618le.LIZ;
            c21432218u8.LIZIZ(interfaceC21420018sA.LIZIZ());
            C21419718s7.LIZ.LJIIL();
            c21432218u8.LIZIZ(interfaceC21420018sA.LIZ());
        }
        C21408418qI c21408418qI = c21419418s4.LJIIZILJ;
        c21408418qI = c21408418qI == null ? null : c21408418qI;
        if (c21408418qI == null) {
            C689270R1x c689270R1x = new C689270R1x();
            c689270R1x.LIZ = C446980Hfs.LIZ(context, R.color.rz);
            c689270R1x.LIZJ = C446980Hfs.LIZ(context, R.color.rz);
            c689270R1x.LIZIZ = C445120Hcs.LIZ(1);
            int i = C689250R1v.LIZ.get();
            int iLIZ = C445120Hcs.LIZ(180);
            int iLIZ2 = C445120Hcs.LIZ(12);
            int iLIZ3 = C445120Hcs.LIZ(16);
            float fLIZIZ = C445120Hcs.LIZIZ(4);
            float f = c21419418s4.LJIILLIIL;
            c21408418qI = new C21408418qI(c689270R1x, i, iLIZ, iLIZ2, iLIZ3, 0, 0, f <= 0.0f ? C445120Hcs.LIZIZ(16) : f, fLIZIZ, 0.0f, 0.0f, C446980Hfs.LIZ(context, R.color.ru), new C1860120yVO(), 1, false, false, null, null, 0, 0, 4135360);
        }
        C21408618qK c21408618qK = c21419418s4.LJJJLZIJ;
        c21408618qK = c21408618qK == null ? new C21408618qK(C445120Hcs.LIZ(120), C445120Hcs.LIZ(4), C446980Hfs.LIZ(context, R.color.rw)) : c21408618qK;
        TableConfig tableConfig = c21419418s4.LJJIL;
        if (tableConfig != null) {
            z2 = tableConfig.needVerticalDivider;
        } else {
            z2 = true;
        }
        c21432218u8.LIZIZ(new C21421418sO(c21408418qI, c21408618qK, z2));
        final boolean z3 = c21419418s4.LJJJI;
        final ?? r7 = new LinkMovementMethod(z3) { // from class: X.0GvD
            public final boolean LIZ;
            public final int LIZIZ = ViewConfiguration.getLongPressTimeout();
            public int LIZJ;
            public float LIZLLL;
            public float LJ;
            public long LJFF;
            public InterfaceC431020GvE LJI;

            {
                this.LIZ = z3;
            }

            @Override // android.text.method.LinkMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
            public final void initialize(TextView textView, Spannable spannable) {
                super.initialize(textView, spannable);
                this.LIZJ = ViewConfiguration.get(textView.getContext()).getScaledTouchSlop();
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x0072 A[PHI: r1
              0x0072: PHI (r1v2 java.lang.Integer) = (r1v1 java.lang.Integer), (r1v1 java.lang.Integer), (r1v8 java.lang.Integer) binds: [B:31:0x005f, B:33:0x0062, B:35:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static int LIZ(android.widget.TextView r13, float r14, float r15) {
                /*
                    java.lang.CharSequence r7 = r13.getText()
                    r6 = 0
                    r9 = 1
                    if (r7 == 0) goto L13
                    int r0 = r7.length()
                    if (r0 == 0) goto L13
                    r0 = 0
                Lf:
                    r5 = -1
                    if (r0 == 0) goto L15
                    return r5
                L13:
                    r0 = 1
                    goto Lf
                L15:
                    android.text.Layout r4 = r13.getLayout()
                    if (r4 != 0) goto L1c
                    return r5
                L1c:
                    int r0 = (int) r15
                    int r1 = r4.getLineForVertical(r0)
                    int r0 = r4.getParagraphDirection(r1)
                    if (r0 != r5) goto Lbb
                    r8 = 1
                L28:
                    int r3 = r4.getLineStart(r1)
                    int r2 = r4.getLineEnd(r1)
                    int r2 = r2 - r9
                    if (r3 > r2) goto Lbe
                L33:
                    boolean r9 = r4.isRtlCharAt(r2)
                    if (r8 != r9) goto Lb6
                    float r12 = r4.getPrimaryHorizontal(r2)
                L3d:
                    if (r9 == 0) goto L48
                    int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
                    if (r0 <= 0) goto L4d
                L43:
                    if (r2 == r3) goto Lbe
                    int r2 = r2 + (-1)
                    goto L33
                L48:
                    int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
                    if (r0 >= 0) goto L4d
                    goto L43
                L4d:
                    int r0 = r2 + 1
                    java.lang.CharSequence r11 = r7.subSequence(r2, r0)
                    int r0 = r4.getWidth()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                    int r0 = r1.intValue()
                    if (r0 > 0) goto L72
                    r0 = 0
                    if (r0 != 0) goto L72
                    int r0 = r13.getWidth()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                    int r0 = r1.intValue()
                    if (r0 <= 0) goto L43
                L72:
                    int r10 = r1.intValue()
                    int r1 = r11.length()
                    android.text.TextPaint r0 = r13.getPaint()
                    android.text.StaticLayout$Builder r1 = android.text.StaticLayout.Builder.obtain(r11, r6, r1, r0, r10)
                    android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
                    android.text.StaticLayout$Builder r10 = r1.setAlignment(r0)
                    float r1 = r13.getLineSpacingExtra()
                    float r0 = r13.getLineSpacingMultiplier()
                    android.text.StaticLayout$Builder r1 = r10.setLineSpacing(r1, r0)
                    boolean r0 = r13.getIncludeFontPadding()
                    android.text.StaticLayout$Builder r0 = r1.setIncludePad(r0)
                    android.text.StaticLayout r0 = r0.build()
                    if (r0 == 0) goto L43
                    float r1 = r0.getLineWidth(r6)
                    if (r9 == 0) goto Lb3
                    float r0 = r12 - r1
                Laa:
                    int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
                    if (r0 < 0) goto L43
                    int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
                    if (r0 >= 0) goto L43
                    return r2
                Lb3:
                    r0 = r12
                    float r12 = r12 + r1
                    goto Laa
                Lb6:
                    float r12 = r4.getSecondaryHorizontal(r2)
                    goto L3d
                Lbb:
                    r8 = 0
                    goto L28
                Lbe:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C431010GvD.LIZ(android.widget.TextView, float, float):int");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
            @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouchEvent(android.widget.TextView r12, android.text.Spannable r13, android.view.MotionEvent r14) {
                /*
                    Method dump skipped, instruction units count: 353
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C431010GvD.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
            }
        };
        final ?? r8 = new MovementMethod(r7) { // from class: X.18r4
            public final MovementMethod LIZ;

            @Override // android.text.method.MovementMethod
            public final boolean canSelectArbitrarily() {
                return this.LIZ.canSelectArbitrarily();
            }

            {
                this.LIZ = r7;
            }

            @Override // android.text.method.MovementMethod
            public final void initialize(TextView textView, Spannable spannable) {
                this.LIZ.initialize(textView, spannable);
            }

            @Override // android.text.method.MovementMethod
            public final boolean onGenericMotionEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
                return this.LIZ.onGenericMotionEvent(textView, spannable, motionEvent);
            }

            @Override // android.text.method.MovementMethod
            public final boolean onKeyOther(TextView textView, Spannable spannable, KeyEvent keyEvent) {
                return this.LIZ.onKeyOther(textView, spannable, keyEvent);
            }

            @Override // android.text.method.MovementMethod
            public final void onTakeFocus(TextView textView, Spannable spannable, int i2) {
                this.LIZ.onTakeFocus(textView, spannable, i2);
            }

            @Override // android.text.method.MovementMethod
            public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
                Object[] objArrLIZ;
                InterfaceC431020GvE interfaceC431020GvE;
                if (!this.LIZ.onTouchEvent(textView, spannable, motionEvent)) {
                    if (motionEvent.getAction() == 1) {
                        int x = (int) motionEvent.getX();
                        int y = (int) motionEvent.getY();
                        int totalPaddingLeft = x - textView.getTotalPaddingLeft();
                        int totalPaddingTop = y - textView.getTotalPaddingTop();
                        int scrollX = totalPaddingLeft + textView.getScrollX();
                        int scrollY = totalPaddingTop + textView.getScrollY();
                        Layout layout = textView.getLayout();
                        int lineForVertical = layout.getLineForVertical(scrollY);
                        int iU3 = C786410Ut5.U3(layout, lineForVertical, scrollX);
                        C11G2[] c11g2Arr = (C11G2[]) spannable.getSpans(iU3, iU3, C11G2.class);
                        if (c11g2Arr.length != 0 && (objArrLIZ = c11g2Arr[0].LIZ(scrollX, scrollY - layout.getLineTop(lineForVertical), InterfaceC431020GvE.class)) != null && (interfaceC431020GvE = (InterfaceC431020GvE) C13LQ.LJJIIZ(0, objArrLIZ)) != null) {
                            interfaceC431020GvE.onClick(textView);
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                return true;
            }

            @Override // android.text.method.MovementMethod
            public final boolean onTrackballEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
                return this.LIZ.onTrackballEvent(textView, spannable, motionEvent);
            }

            @Override // android.text.method.MovementMethod
            public final boolean onKeyDown(TextView textView, Spannable spannable, int i2, KeyEvent keyEvent) {
                return this.LIZ.onKeyDown(textView, spannable, i2, keyEvent);
            }

            @Override // android.text.method.MovementMethod
            public final boolean onKeyUp(TextView textView, Spannable spannable, int i2, KeyEvent keyEvent) {
                return this.LIZ.onKeyUp(textView, spannable, i2, keyEvent);
            }
        };
        final ?? r9 = new MovementMethod(context, r8) { // from class: X.18r5
            public final MovementMethod LIZ;
            public float LIZIZ;
            public C21408918qN LIZJ;
            public VelocityTracker LIZLLL;
            public final C21413418r6 LJ;
            public final float LJFF;
            public final int LJI;
            public boolean LJII;
            public float LJIIIIZZ;
            public float LJIIIZ;

            @Override // android.text.method.MovementMethod
            public final boolean canSelectArbitrarily() {
                return this.LIZ.canSelectArbitrarily();
            }

            @Override // android.text.method.MovementMethod
            public final void initialize(TextView textView, Spannable spannable) {
                this.LIZ.initialize(textView, spannable);
            }

            @Override // android.text.method.MovementMethod
            public final boolean onGenericMotionEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
                return this.LIZ.onGenericMotionEvent(textView, spannable, motionEvent);
            }

            @Override // android.text.method.MovementMethod
            public final boolean onKeyDown(TextView textView, Spannable spannable, int i2, KeyEvent keyEvent) {
                return this.LIZ.onKeyDown(textView, spannable, i2, keyEvent);
            }

            @Override // android.text.method.MovementMethod
            public final boolean onKeyOther(TextView textView, Spannable spannable, KeyEvent keyEvent) {
                return this.LIZ.onKeyOther(textView, spannable, keyEvent);
            }

            @Override // android.text.method.MovementMethod
            public final boolean onKeyUp(TextView textView, Spannable spannable, int i2, KeyEvent keyEvent) {
                return this.LIZ.onKeyUp(textView, spannable, i2, keyEvent);
            }

            @Override // android.text.method.MovementMethod
            public final void onTakeFocus(TextView textView, Spannable spannable, int i2) {
                this.LIZ.onTakeFocus(textView, spannable, i2);
            }

            @Override // android.text.method.MovementMethod
            public final boolean onTrackballEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
                return this.LIZ.onTrackballEvent(textView, spannable, motionEvent);
            }

            {
                this.LIZ = r8;
                this.LJ = new C21413418r6(context);
                this.LJFF = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                this.LJI = ViewConfiguration.get(context).getScaledTouchSlop();
            }

            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [X.18qN, android.view.VelocityTracker] */
            /* JADX WARN: Type inference failed for: r2v4 */
            @Override // android.text.method.MovementMethod
            public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
                ViewParent parent;
                ViewParent parent2;
                int iU3;
                Object[] spans;
                int actionMasked = motionEvent.getActionMasked();
                int iLIZIZ = 0;
                ?? r2 = 0;
                c21408918qN = null;
                c21408918qN = null;
                C21408918qN c21408918qN = null;
                if (actionMasked == 0) {
                    this.LJII = true;
                    this.LJIIIIZZ = motionEvent.getX();
                    this.LJIIIZ = motionEvent.getY();
                    C21413418r6 c21413418r6 = this.LJ;
                    ValueAnimator valueAnimator = c21413418r6.LIZ;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    c21413418r6.LIZ = null;
                    c21413418r6.LIZIZ.abortAnimation();
                    float x = motionEvent.getX();
                    float totalPaddingLeft = (x - textView.getTotalPaddingLeft()) + textView.getScrollX();
                    float y = (motionEvent.getY() - textView.getTotalPaddingTop()) + textView.getScrollY();
                    Layout layout = textView.getLayout();
                    CharSequence text = textView.getText();
                    if (layout != null && (text instanceof Spanned) && (spans = ((Spanned) text).getSpans((iU3 = C786410Ut5.U3(layout, layout.getLineForVertical((int) y), totalPaddingLeft)), iU3, C21408918qN.class)) != null) {
                        c21408918qN = (C21408918qN) C13LQ.LJJIFFI(spans);
                    }
                    this.LIZJ = c21408918qN;
                    if (c21408918qN != null) {
                        if (c21408918qN.LIZJ > 0.0f && (parent2 = textView.getParent()) != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        VelocityTracker velocityTracker = this.LIZLLL;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        } else {
                            this.LIZLLL = VelocityTracker.obtain();
                        }
                        VelocityTracker velocityTracker2 = this.LIZLLL;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                    }
                } else {
                    C21408918qN c21408918qN2 = this.LIZJ;
                    if (c21408918qN2 != null && c21408918qN2.LIZJ > 0.0f) {
                        float fAbs = Math.abs(motionEvent.getX() - this.LJIIIIZZ);
                        if (this.LJII && fAbs > this.LJI) {
                            textView.cancelLongPress();
                            this.LJII = false;
                        }
                        float fAbs2 = Math.abs(motionEvent.getY() - this.LJIIIZ);
                        if (fAbs2 > fAbs && fAbs2 > this.LJI && (parent = textView.getParent()) != null) {
                            parent.requestDisallowInterceptTouchEvent(false);
                        }
                        if (fAbs > fAbs2 && fAbs > this.LJI) {
                            float x2 = c21408918qN2.LIZIZ + (motionEvent.getX() - this.LIZIZ);
                            float f2 = c21408918qN2.LIZJ;
                            c21408918qN2.LIZIZ = Math.max((-f2) - (Math.abs(f2) * c21408918qN2.LIZ), Math.min(Math.abs(c21408918qN2.LIZJ) * c21408918qN2.LIZ, x2));
                            textView.postInvalidateOnAnimation();
                        }
                        VelocityTracker velocityTracker3 = this.LIZLLL;
                        if (velocityTracker3 != null) {
                            velocityTracker3.addMovement(motionEvent);
                        }
                    }
                    if (actionMasked == 1 || actionMasked == 3) {
                        C21408918qN c21408918qN3 = this.LIZJ;
                        if (c21408918qN3 != null) {
                            VelocityTracker velocityTracker4 = this.LIZLLL;
                            if (velocityTracker4 != null) {
                                velocityTracker4.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LJFF);
                            }
                            C21413418r6 c21413418r62 = this.LJ;
                            VelocityTracker velocityTracker5 = this.LIZLLL;
                            if (velocityTracker5 != null) {
                                iLIZIZ = C814420VxA.LIZIZ(velocityTracker5.getXVelocity());
                            }
                            OverScroller overScroller = c21413418r62.LIZIZ;
                            int i2 = (int) c21408918qN3.LIZIZ;
                            float f3 = c21408918qN3.LIZJ;
                            overScroller.fling(i2, 0, iLIZIZ, 0, -((int) f3), 0, 0, 0, (int) (Math.abs(f3) * c21408918qN3.LIZ), 0);
                            ValueAnimator valueAnimator2 = c21413418r62.LIZ;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.setDuration(Long.MAX_VALUE);
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS159S0300000_32(c21413418r62, c21408918qN3, textView, 4));
                            valueAnimatorOfFloat.start();
                            c21413418r62.LIZ = valueAnimatorOfFloat;
                            r2 = 0;
                        }
                        this.LIZJ = r2;
                        VelocityTracker velocityTracker6 = this.LIZLLL;
                        if (velocityTracker6 != null) {
                            velocityTracker6.recycle();
                        }
                        this.LIZLLL = r2;
                    }
                }
                this.LIZIZ = motionEvent.getX();
                return this.LIZ.onTouchEvent(textView, spannable, motionEvent);
            }
        };
        c21432218u8.LIZIZ(new AbstractC21425218t0(r9) { // from class: X.18sz
            public final MovementMethod LIZ;

            {
                this.LIZ = r9;
            }

            @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
            public final void LJIIIIZZ(C13A5 c13a5) {
                ((C21423818sm) ((C13A4) c13a5).LIZJ(C21423818sm.class)).LIZIZ = true;
            }

            @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
            public final void LJFF(TextView textView, Spanned spanned) {
                MovementMethod movementMethod = textView.getMovementMethod();
                MovementMethod movementMethod2 = this.LIZ;
                if (movementMethod != movementMethod2) {
                    textView.setMovementMethod(movementMethod2);
                }
            }
        });
        c21432218u8.LIZIZ(new C21436918ut() { // from class: X.18uk
            @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
            public final void LJIIIIZZ(C13A5 c13a5) {
                C21435918uj.LIZ(((C13A4) c13a5).LIZJ(C21423818sm.class));
            }
        });
        Pattern pattern = C21442318vl.LJIIJ;
        C21432018u6 c21432018u6 = new C21432018u6();
        c21432018u6.LIZJ = true;
        ((ArrayList) c21432018u6.LIZ).addAll(Arrays.asList(new AbstractC21442818vq() { // from class: X.18tr
            public static final Pattern LJ = PatternProtector.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
            public static final Pattern LJFF = PatternProtector.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

            @Override // X.AbstractC21442818vq
            public final char LIZLLL() {
                return '<';
            }

            @Override // X.AbstractC21442818vq
            public final AbstractC21430218to LIZIZ() {
                String strLIZ = LIZ(LJ);
                if (strLIZ != null) {
                    String strSubstring = strLIZ.substring(1, strLIZ.length() - 1);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("mailto:");
                    sbLIZ.append(strSubstring);
                    C21436418uo c21436418uo = new C21436418uo(C2188811AlT.LIZIZ(sbLIZ), null);
                    c21436418uo.LIZIZ(new C21437418uy(strSubstring));
                    return c21436418uo;
                }
                String strLIZ2 = LIZ(LJFF);
                if (strLIZ2 == null) {
                    return null;
                }
                String strSubstring2 = strLIZ2.substring(1, strLIZ2.length() - 1);
                C21436418uo c21436418uo2 = new C21436418uo(strSubstring2, null);
                c21436418uo2.LIZIZ(new C21437418uy(strSubstring2));
                return c21436418uo2;
            }
        }, new AbstractC21442818vq() { // from class: X.18v8
            public static final Pattern LJ = C21442318vl.LJIILIIL;

            @Override // X.AbstractC21442818vq
            public final char LIZLLL() {
                return '\\';
            }

            @Override // X.AbstractC21442818vq
            public final AbstractC21430218to LIZIZ() {
                this.LIZLLL++;
                if (LIZJ() == '\n') {
                    C21438218v6 c21438218v6 = new C21438218v6();
                    this.LIZLLL++;
                    return c21438218v6;
                }
                if (this.LIZLLL < this.LIZJ.length()) {
                    Pattern pattern2 = LJ;
                    String str = this.LIZJ;
                    int i2 = this.LIZLLL;
                    if (pattern2.matcher(str.substring(i2, i2 + 1)).matches()) {
                        String str2 = this.LIZJ;
                        int i3 = this.LIZLLL;
                        this.LIZ.getClass();
                        C21437418uy c21437418uy = new C21437418uy(str2.substring(i3, i3 + 1));
                        this.LIZLLL++;
                        return c21437418uy;
                    }
                }
                return LJFF("\\");
            }
        }, new AbstractC21442818vq() { // from class: X.18v9
            public static final Pattern LJ = PatternProtector.compile("`+");
            public static final Pattern LJFF = PatternProtector.compile("^`+");

            @Override // X.AbstractC21442818vq
            public final char LIZLLL() {
                return '`';
            }

            @Override // X.AbstractC21442818vq
            public final AbstractC21430218to LIZIZ() {
                String strLIZ;
                String strLIZ2 = LIZ(LJFF);
                if (strLIZ2 == null) {
                    return null;
                }
                int i2 = this.LIZLLL;
                do {
                    strLIZ = LIZ(LJ);
                    if (strLIZ == null) {
                        this.LIZLLL = i2;
                        return LJFF(strLIZ2);
                    }
                } while (!strLIZ.equals(strLIZ2));
                C21437518uz c21437518uz = new C21437518uz();
                String strReplace = this.LIZJ.substring(i2, this.LIZLLL - strLIZ2.length()).replace('\n', ' ');
                if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
                    int length = strReplace.length();
                    if (C21439918vN.LIZIZ(' ', strReplace, 0, length) != length) {
                        strReplace = strReplace.substring(1, strReplace.length() - 1);
                    }
                }
                c21437518uz.LJFF = strReplace;
                return c21437518uz;
            }
        }, new C21442918vr(), new AbstractC21442818vq() { // from class: X.18vm
            public static final Pattern LJ = C21442318vl.LJIILJJIL;

            @Override // X.AbstractC21442818vq
            public final char LIZLLL() {
                return ']';
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0184  */
            @Override // X.AbstractC21442818vq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.AbstractC21430218to LIZIZ() {
                /*
                    Method dump skipped, instruction units count: 484
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21442418vm.LIZIZ():X.18to");
            }
        }, new AbstractC21442818vq() { // from class: X.18ue
            public static final Pattern LJ = PatternProtector.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
            public static volatile boolean LJFF = false;

            @Override // X.AbstractC21442818vq
            public final char LIZLLL() {
                return '&';
            }

            @Override // X.AbstractC21442818vq
            public final AbstractC21430218to LIZIZ() {
                String strLIZ = LIZ(LJ);
                if (strLIZ == null) {
                    return null;
                }
                if (LJFF) {
                    return LJFF(strLIZ);
                }
                try {
                    return LJFF(C08ED.LIZ(strLIZ));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LJFF = true;
                    return LJFF(strLIZ);
                }
            }
        }, new AbstractC21442818vq() { // from class: X.18uf
            public static final Pattern LJ = PatternProtector.compile("^(?:<[A-Za-z][A-Za-z0-9-_]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-_]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

            @Override // X.AbstractC21442818vq
            public final char LIZLLL() {
                return '<';
            }

            @Override // X.AbstractC21442818vq
            public final AbstractC21430218to LIZIZ() {
                String strLIZ = LIZ(LJ);
                if (strLIZ == null) {
                    return null;
                }
                C21437218uw c21437218uw = new C21437218uw();
                c21437218uw.LJFF = strLIZ;
                return c21437218uw;
            }
        }, new AbstractC21442818vq() { // from class: X.18v7
            public static final Pattern LJ = PatternProtector.compile(" *$");

            @Override // X.AbstractC21442818vq
            public final char LIZLLL() {
                return '\n';
            }

            @Override // X.AbstractC21442818vq
            public final AbstractC21430218to LIZIZ() {
                int iEnd;
                this.LIZLLL++;
                AbstractC21430218to abstractC21430218to = this.LIZIZ.LIZJ;
                if (abstractC21430218to instanceof C21437418uy) {
                    C21437418uy c21437418uy = (C21437418uy) abstractC21430218to;
                    if (c21437418uy.LJFF.endsWith(" ")) {
                        String str = c21437418uy.LJFF;
                        Matcher matcher = LJ.matcher(str);
                        if (matcher.find() && (iEnd = matcher.end() - matcher.start()) > 0) {
                            c21437418uy.LJFF = str.substring(0, str.length() - iEnd);
                            if (iEnd >= 2) {
                                return new C21438218v6();
                            }
                        }
                        return new C21438618vA();
                    }
                }
                return new C21438618vA();
            }
        }, new C21443118vt()));
        ((ArrayList) c21432018u6.LIZIZ).addAll(Arrays.asList(new C21445518wH(), new C21445618wI()));
        c21432218u8.LIZIZ(new C21435718uh(c21432018u6));
        C21419718s7 c21419718s7 = C21419718s7.LIZ;
        if (!c21419718s7.LJIILIIL() && (interfaceC21173117tR = (InterfaceC21173117tR) C21173017tQ.LIZ.getValue()) != 0) {
            C21419618s6 c21419618s6 = new C21419618s6();
            float f2 = c21419418s4.LJI;
            c21419618s6.LIZ = f2 <= 0.0f ? 16.0f : f2;
            int i2 = c21419418s4.LJIIIIZZ;
            c21419618s6.LIZIZ = i2 == 0 ? C446980Hfs.LIZ(context, R.color.ru) : i2;
            c21419618s6.LIZJ = c21419718s7.LIZ();
            c21419618s6.LIZLLL = true;
            c21419618s6.LJ = c21419718s7.LJIIIZ();
            c21419618s6.LJFF = true;
            c21419618s6.LJI = c21419718s7.LIZ();
            c21419618s6.LJII = Boolean.valueOf(c21419718s7.LJFF());
            c21419618s6.LJIIIZ = c21419718s7.LIZLLL();
            c21419618s6.LJIIJ = C21379618le.LJFF;
            c21419618s6.LJIIJJI = C21379618le.LJI;
            c21419618s6.LJIIL = c21419718s7.LJIIJJI();
            List<String> listLIZJ = c21419718s7.LIZJ();
            c21419618s6.LJIIIIZZ = listLIZJ == null ? C13BV.INSTANCE : listLIZJ;
            c21419618s6.LJIILIIL = c21419718s7.LJIIIIZZ();
            final float f3 = c21419618s6.LIZ;
            final int i3 = c21419618s6.LIZIZ;
            final boolean z4 = c21419618s6.LIZJ;
            final boolean z5 = c21419618s6.LIZLLL;
            final boolean z6 = c21419618s6.LJ;
            final boolean z7 = c21419618s6.LJFF;
            final boolean z8 = c21419618s6.LJI;
            final Boolean bool = c21419618s6.LJII;
            final List<String> list = c21419618s6.LJIIIIZZ;
            final int i4 = c21419618s6.LJIIIZ;
            final C425110Glh c425110Glh = c21419618s6.LJIIJ;
            final C444870HcT c444870HcT = c21419618s6.LJIIJJI;
            final String str = c21419618s6.LJIIL;
            final Function2<? super String, Object, Unit> function2 = c21419618s6.LJIILIIL;
            c21432218u8.LIZIZ(interfaceC21173117tR.LIZIZ(context, new Object(f3, i3, z4, z5, z6, z7, z8, bool, list, i4, c425110Glh, c444870HcT, str, function2) { // from class: X.17tS
                public final float LIZ;
                public final int LIZIZ;
                public final boolean LIZJ;
                public final boolean LIZLLL;
                public final boolean LJ;
                public final boolean LJFF;
                public final boolean LJI;
                public final Boolean LJII;
                public final List<String> LJIIIIZZ;
                public final int LJIIIZ;
                public final C425110Glh LJIIJ;
                public final C444870HcT LJIIJJI;
                public final String LJIIL;
                public final Function2<? super String, Object, Unit> LJIILIIL;

                {
                    this.LIZ = f3;
                    this.LIZIZ = i3;
                    this.LIZJ = z4;
                    this.LIZLLL = z5;
                    this.LJ = z6;
                    this.LJFF = z7;
                    this.LJI = z8;
                    this.LJII = bool;
                    this.LJIIIIZZ = list;
                    this.LJIIIZ = i4;
                    this.LJIIJ = c425110Glh;
                    this.LJIIJJI = c444870HcT;
                    this.LJIIL = str;
                    this.LJIILIIL = function2;
                }
            }));
        }
        C21422218sW c21422218sW = new C21422218sW(c21419418s4.LJIILL, c21419418s4.LJJJJZ, c21419418s4.LJJJLIIL, c21419418s4.LJJIJL, c21419418s4.LJJIIJZLJL, c21419418s4.LJJJJZI, c21419418s4.LJJJLL);
        Iterator<AbstractC21434218uS> it2 = c21419418s4.LIZJ.iterator();
        while (it2.hasNext()) {
            c21422218sW.LJIIL(it2.next());
        }
        c21432218u8.LIZIZ(c21422218sW);
        final C2259441Dc6 c2259441Dc6 = new C2259441Dc6(new InterfaceC2259461Dc8() { // from class: X.1DcA
            public static final C2259451Dc7 LIZIZ = new InterfaceC2259401Dc2() { // from class: X.1Dc7
                @Override // X.InterfaceC2259401Dc2
                public final List<InterfaceC2259411Dc3> LIZ() {
                    return null;
                }

                @Override // X.InterfaceC2259401Dc2
                public final String name() {
                    return null;
                }
            };
            public final Map<String, InterfaceC2259401Dc2> LIZ = new HashMap(3);

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:4:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static X.C2259371Dbz LIZIZ(X.C2259441Dc6 r26, java.lang.String r27) {
                /*
                    Method dump skipped, instruction units count: 4038
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2259481DcA.LIZIZ(X.1Dc6, java.lang.String):X.1Dbz");
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
            @Override // X.InterfaceC2259461Dc8
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC2259401Dc2 LIZ(X.C2259441Dc6 r6, java.lang.String r7) {
                /*
                    Method dump skipped, instruction units count: 214
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2259481DcA.LIZ(X.1Dc6, java.lang.String):X.1Dc2");
            }
        });
        final ?? r2 = new AbstractC2259511DcD() { // from class: X.18rf
            public final int LIZIZ = 0;

            @Override // X.InterfaceC21420818sI
            public final void LIZJ() {
            }

            @Override // X.InterfaceC21420818sI
            public final int LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC2259511DcD
            public final void LIZLLL(String str2, String str3, String str4, int i5, SpannableStringBuilder spannableStringBuilder, int i6, int i7) {
                if ("css".equals(str2) && AbstractC2259511DcD.LJ("string", str3, str4)) {
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(-6656454), i6, i7, 33);
                    C786410Ut5.q2(spannableStringBuilder, new BackgroundColorSpan(-2130706433), i6, i7, 33);
                    return;
                }
                if (AbstractC2259511DcD.LJ("namespace", str3, str4)) {
                    i5 = (i5 & 16777215) | (((int) 179.0f) << 24);
                }
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(i5), i6, i7, 33);
                if (AbstractC2259511DcD.LJ("important", str3, str4) || AbstractC2259511DcD.LJ("bold", str3, str4)) {
                    C786410Ut5.q2(spannableStringBuilder, new C21416618rc(), i6, i7, 33);
                }
                if (AbstractC2259511DcD.LJ("italic", str3, str4)) {
                    C786410Ut5.q2(spannableStringBuilder, new C21416418ra(), i6, i7, 33);
                }
            }
        };
        c21432218u8.LIZIZ(new AbstractC21425218t0(c2259441Dc6, r2) { // from class: X.18sF
            public final C2259441Dc6 LIZ;
            public final InterfaceC21420818sI LIZIZ;
            public final String LIZJ = "c";

            @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
            public final void LJI(C448870Hiv c448870Hiv) {
                this.LIZIZ.LIZJ();
                c448870Hiv.LJIIJJI = -587202560;
                c448870Hiv.LJIIL = this.LIZIZ.LIZIZ();
            }

            @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
            public final void LJIIJ(C21434618uW c21434618uW) {
                final C2259441Dc6 c2259441Dc62 = this.LIZ;
                final InterfaceC21420818sI interfaceC21420818sI = this.LIZIZ;
                final String str2 = this.LIZJ;
                c21434618uW.LIZJ = new InterfaceC21428318tV(c2259441Dc62, interfaceC21420818sI, str2) { // from class: X.18x9
                    public final C2259441Dc6 LIZ;
                    public final InterfaceC21420818sI LIZIZ;
                    public final String LIZJ;

                    @Override // X.InterfaceC21428318tV
                    public final CharSequence LIZ(String str3, String str4) {
                        InterfaceC2259401Dc2 interfaceC2259401Dc2LIZIZ;
                        if (!str4.isEmpty() && str3 != null && ((interfaceC2259401Dc2LIZIZ = this.LIZ.LIZIZ(str3)) != null || (!TextUtils.isEmpty(this.LIZJ) && (interfaceC2259401Dc2LIZIZ = this.LIZ.LIZIZ((str3 = this.LIZJ))) != null))) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            C21451018xA c21451018xA = new C21451018xA(str3, this.LIZIZ, spannableStringBuilder);
                            this.LIZ.getClass();
                            c21451018xA.LIZ(C2259441Dc6.LJIIIZ(interfaceC2259401Dc2LIZIZ, str4));
                            return spannableStringBuilder;
                        }
                        return str4;
                    }

                    {
                        this.LIZ = c2259441Dc62;
                        this.LIZIZ = interfaceC21420818sI;
                        this.LIZJ = str2;
                    }
                };
            }

            {
                this.LIZ = c2259441Dc6;
                this.LIZIZ = r2;
            }
        });
        final int iLIZ4 = C446980Hfs.LIZ(this.LIZ, R.color.t0);
        final int iLIZ5 = C446980Hfs.LIZ(this.LIZ, R.color.t0);
        final int iLIZ6 = C446980Hfs.LIZ(this.LIZ, R.color.vy);
        final ?? r0 = new Drawable(iLIZ4, iLIZ5, iLIZ6) { // from class: X.0EfU
            public final int LIZ;
            public final int LIZIZ;
            public final Paint LIZJ = new Paint(1);
            public final RectF LIZLLL = new RectF();
            public final Paint LJ;
            public final Path LJFF;
            public boolean LJI;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -1;
            }

            @Override // android.graphics.drawable.Drawable
            public final boolean isStateful() {
                return true;
            }

            static {
                final float f4 = 0.3888889f;
                final float f5 = 0.6944444f;
                new Object(f4, f5) { // from class: X.0EfV
                };
                final float f6 = 0.8472222f;
                final float f7 = 0.2638889f;
                new Object(f6, f7) { // from class: X.0EfV
                };
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                Paint.Style style;
                int i5;
                if (this.LJI) {
                    style = Paint.Style.FILL_AND_STROKE;
                    i5 = this.LIZ;
                } else {
                    style = Paint.Style.STROKE;
                    i5 = this.LIZIZ;
                }
                this.LIZJ.setStyle(style);
                this.LIZJ.setColor(i5);
                Rect bounds = getBounds();
                float fWidth = (bounds.width() - this.LIZLLL.width()) / 2.0f;
                float fHeight = (bounds.height() - this.LIZLLL.height()) / 2.0f;
                float fWidth2 = this.LIZLLL.width() / 8.0f;
                int iSave = canvas.save();
                try {
                    canvas.translate(fWidth, fHeight);
                    canvas.drawRoundRect(this.LIZLLL, fWidth2, fWidth2, this.LIZJ);
                    if (this.LJI) {
                        canvas.drawPath(this.LJFF, this.LJ);
                    }
                    canvas.restoreToCount(iSave);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    canvas.restoreToCount(iSave);
                    throw th;
                }
            }

            @Override // android.graphics.drawable.Drawable
            public final void onBoundsChange(Rect rect) {
                super.onBoundsChange(rect);
                float fMin = Math.min(rect.width(), rect.height());
                float f4 = fMin / 8.0f;
                float f5 = fMin - f4;
                this.LIZLLL.set(0.0f, 0.0f, f5, f5);
                this.LIZJ.setStrokeWidth(f4);
                this.LJ.setStrokeWidth(f4);
                this.LJFF.reset();
                this.LJFF.moveTo(0.15277778f * f5, 0.45833334f * f5);
                this.LJFF.lineTo(0.3888889f * f5, 0.6944444f * f5);
                this.LJFF.lineTo(0.8472222f * f5, f5 * 0.2638889f);
            }

            @Override // android.graphics.drawable.Drawable
            public final boolean onStateChange(int[] iArr) {
                boolean z9;
                int length;
                if (iArr != null && (length = iArr.length) > 0) {
                    int i5 = 0;
                    while (16842912 != iArr[i5]) {
                        i5++;
                        if (i5 >= length) {
                            z9 = false;
                            break;
                        }
                    }
                    z9 = true;
                } else {
                    z9 = false;
                    break;
                }
                if (z9 == this.LJI) {
                    return false;
                }
                invalidateSelf();
                this.LJI = z9;
                return true;
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i5) {
                this.LIZJ.setAlpha(i5);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.LIZJ.setColorFilter(colorFilter);
            }

            {
                Paint paint = new Paint(1);
                this.LJ = paint;
                this.LJFF = new Path();
                this.LIZ = iLIZ4;
                this.LIZIZ = iLIZ5;
                paint.setColor(iLIZ6);
                paint.setStyle(Paint.Style.STROKE);
            }
        };
        c21432218u8.LIZIZ(new AbstractC21425218t0(r0) { // from class: X.18sD
            public final Drawable LIZ;

            {
                this.LIZ = r0;
            }

            @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
            public final void LIZJ(C21433918uP c21433918uP) {
                ((ArrayList) c21433918uP.LIZJ).add(new InterfaceC21447418wa() { // from class: X.18tm
                    @Override // X.InterfaceC21447418wa
                    public final AbstractC21430218to LIZ(AbstractC21430218to abstractC21430218to) {
                        abstractC21430218to.LIZ(new AbstractC21427418tM() { // from class: X.18tn
                            public static final Pattern LIZ = PatternProtector.compile("^\\[([xX\\s])]\\s+(.*)");

                            @Override // X.InterfaceC21437318ux
                            public final void LJIIL(C21445118wD c21445118wD) {
                                AbstractC21430218to abstractC21430218to2 = c21445118wD.LIZIZ;
                                if (abstractC21430218to2 instanceof C21439218vG) {
                                    AbstractC21430218to abstractC21430218to3 = abstractC21430218to2.LIZIZ;
                                    if (abstractC21430218to3 instanceof C21437418uy) {
                                        Matcher matcher = LIZ.matcher(((C21437418uy) abstractC21430218to3).LJFF);
                                        if (matcher.matches()) {
                                            boolean z9 = true;
                                            String strGroup = matcher.group(1);
                                            if (!"x".equals(strGroup) && !"X".equals(strGroup)) {
                                                z9 = false;
                                            }
                                            C21427618tO c21427618tO = new C21427618tO(z9);
                                            C21439218vG c21439218vG = new C21439218vG();
                                            c21427618tO.LJFF();
                                            AbstractC21430218to abstractC21430218to4 = c21445118wD.LIZLLL;
                                            c21427618tO.LIZLLL = abstractC21430218to4;
                                            if (abstractC21430218to4 != null) {
                                                abstractC21430218to4.LJ = c21427618tO;
                                            }
                                            c21427618tO.LJ = c21445118wD;
                                            c21445118wD.LIZLLL = c21427618tO;
                                            AbstractC21430218to abstractC21430218to5 = c21445118wD.LIZ;
                                            c21427618tO.LIZ = abstractC21430218to5;
                                            if (c21427618tO.LIZLLL == null) {
                                                abstractC21430218to5.LIZIZ = c21427618tO;
                                            }
                                            String strGroup2 = matcher.group(2);
                                            if (!TextUtils.isEmpty(strGroup2)) {
                                                c21439218vG.LIZIZ(new C21437418uy(strGroup2));
                                            }
                                            AbstractC21430218to abstractC21430218to6 = abstractC21430218to3.LJ;
                                            while (abstractC21430218to6 != null) {
                                                AbstractC21430218to abstractC21430218to7 = abstractC21430218to6.LJ;
                                                c21439218vG.LIZIZ(abstractC21430218to6);
                                                abstractC21430218to6 = abstractC21430218to7;
                                            }
                                            c21427618tO.LIZIZ(c21439218vG);
                                            AbstractC21430218to abstractC21430218to8 = abstractC21430218to2.LJ;
                                            while (abstractC21430218to8 != null) {
                                                AbstractC21430218to abstractC21430218to9 = abstractC21430218to8.LJ;
                                                c21427618tO.LIZIZ(abstractC21430218to8);
                                                abstractC21430218to8 = abstractC21430218to9;
                                            }
                                            c21445118wD.LJFF();
                                            LJJIIZ(c21427618tO);
                                            return;
                                        }
                                    }
                                }
                                LJJIIZ(c21445118wD);
                            }
                        });
                        return abstractC21430218to;
                    }
                });
            }

            @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
            public final void LIZLLL(C21427518tN c21427518tN) {
                c21427518tN.LIZ(C21427618tO.class, new InterfaceC21427718tP<C21427618tO>() { // from class: X.18sQ
                    @Override // X.InterfaceC21427718tP
                    public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                        C21427618tO c21427618tO = (C21427618tO) abstractC21430218to;
                        int length = interfaceC21427218tK.length();
                        interfaceC21427218tK.LJJIIZ(c21427618tO);
                        interfaceC21427218tK.LJIL().LIZ(AbstractC21379918lh.LIZ, Boolean.valueOf(c21427618tO.LJFF));
                        interfaceC21427218tK.LJJIIZI(c21427618tO, length);
                        if (interfaceC21427218tK.LJIJJLI(c21427618tO)) {
                            interfaceC21427218tK.LJIIJ();
                        }
                    }
                });
            }

            @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
            public final void LJ(C21435318ud c21435318ud) {
                c21435318ud.LIZ(C21427618tO.class, new InterfaceC21446318wP(this.LIZ) { // from class: X.18li
                    public final Drawable LIZ;

                    {
                        this.LIZ = drawable;
                    }

                    @Override // X.InterfaceC21446318wP
                    public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                        return new LeadingMarginSpan(c21432118u7.LIZ, this.LIZ, ((Boolean) c14s7.LIZIZ(AbstractC21379918lh.LIZ, Boolean.FALSE)).booleanValue()) { // from class: X.0HdF
                            public static final int[] LLILZ = {android.R.attr.state_checked};
                            public static final int[] LLILZIL = new int[0];
                            public final C448860Hiu LL;
                            public final Drawable LLILLJJLI;
                            public final boolean LLILLL;

                            @Override // android.text.style.LeadingMarginSpan
                            public final int getLeadingMargin(boolean z9) {
                                return this.LL.LIZJ;
                            }

                            {
                                this.LL = c448860Hiu;
                                this.LLILLJJLI = drawable;
                                this.LLILLL = z;
                            }

                            @Override // android.text.style.LeadingMarginSpan
                            public final void drawLeadingMargin(Canvas canvas, Paint paint, int i5, int i6, int i7, int i8, int i9, CharSequence charSequence, int i10, int i11, boolean z9, Layout layout) {
                                int i12;
                                int[] iArr;
                                if (z9 && AbstractC445160Hcw.LIZ(charSequence, this, i10)) {
                                    float fDescent = paint.descent();
                                    float fAscent = paint.ascent();
                                    int iSave = canvas.save();
                                    try {
                                        int i13 = this.LL.LIZJ;
                                        int i14 = (int) ((i13 * 0.75f) + 0.5f);
                                        this.LLILLJJLI.setBounds(0, 0, i14, (int) ((((int) ((fDescent - fAscent) + 0.5f)) * 0.75f) + 0.5f));
                                        if (this.LLILLJJLI.isStateful()) {
                                            if (this.LLILLL) {
                                                iArr = LLILZ;
                                            } else {
                                                iArr = LLILZIL;
                                            }
                                            this.LLILLJJLI.setState(iArr);
                                        }
                                        if (i6 > 0) {
                                            i12 = i5 + ((i13 - i14) / 2);
                                        } else {
                                            i12 = (i5 - ((i13 - i14) / 2)) - i14;
                                        }
                                        canvas.translate(i12, ((int) (i8 + fAscent + 0.5f)) + ((r5 - r4) / 2));
                                        this.LLILLJJLI.draw(canvas);
                                        canvas.restoreToCount(iSave);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        canvas.restoreToCount(iSave);
                                        throw th;
                                    }
                                }
                            }
                        };
                    }
                });
            }
        });
        if (this.LIZIZ) {
            c21432218u8.LIZIZ(new C21430718tt());
        }
        c21432218u8.LIZIZ(new AbstractC21425218t0() { // from class: X.18sC
            @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
            public final void LIZJ(C21433918uP c21433918uP) {
                Set<Class<? extends AbstractC21439018vE>> setLLIIIZ = C13LP.LLIIIZ(C21440618vU.LJIILL);
                if (this.LIZ.LIZIZ) {
                    setLLIIIZ.remove(C21440218vQ.class);
                }
                setLLIIIZ.remove(C21440318vR.class);
                setLLIIIZ.remove(C21439318vH.class);
                c21433918uP.LIZLLL = setLLIIIZ;
                c21433918uP.LIZ(new C21439718vL() { // from class: X.18vJ
                    @Override // X.C21439718vL, X.InterfaceC21445718wJ
                    public final AbstractC21449018wq LIZ(InterfaceC21449618ww interfaceC21449618ww, C21443618vy c21443618vy) {
                        CharSequence charSequence;
                        C21440618vU c21440618vU = (C21440618vU) interfaceC21449618ww;
                        if (c21440618vU.LJI >= 4 || (charSequence = c21440618vU.LIZ) == null || a0.LJLIIIL(charSequence).length() <= 1) {
                            return null;
                        }
                        return super.LIZ(interfaceC21449618ww, c21443618vy);
                    }
                });
            }

            @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
            public final void LIZLLL(C21427518tN c21427518tN) {
                CustomSpaceScene customSpaceScene;
                CustomSpaceScene customSpaceScene2 = null;
                if (!C21419718s7.LIZ.LJI()) {
                    final C21419418s4 c21419418s42 = this.LIZ.LIZJ;
                    c21427518tN.LIZ(C21445118wD.class, new InterfaceC21427718tP<C21445118wD>(c21419418s42) { // from class: X.18tF
                        public final C21419418s4 LIZ;

                        {
                            this.LIZ = c21419418s42;
                        }

                        @Override // X.InterfaceC21427718tP
                        public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                            C21419418s4 c21419418s43 = this.LIZ;
                            C689290R1z c689290R1z = c21419418s43.LJJIJL;
                            if (c689290R1z != null) {
                                C21422118sV.LIZJ(interfaceC21427218tK, abstractC21430218to, c689290R1z, c21419418s43.LJJIIJZLJL);
                            }
                            int length = interfaceC21427218tK.length();
                            interfaceC21427218tK.LJJIIZ(abstractC21430218to);
                            interfaceC21427218tK.LJIL().LIZ(AbstractC20267814Se.LJII, Boolean.valueOf(C21426518tD.LIZ(abstractC21430218to)));
                            AbstractC21430218to abstractC21430218to2 = abstractC21430218to.LIZ;
                            if (abstractC21430218to2 instanceof C21437618v0) {
                                C21437618v0 c21437618v0 = (C21437618v0) abstractC21430218to2;
                                int i5 = c21437618v0.LJI;
                                interfaceC21427218tK.LJIL().LIZ(AbstractC20267814Se.LIZ, C14S1.ORDERED);
                                interfaceC21427218tK.LJIL().LIZ(AbstractC20267814Se.LIZJ, Integer.valueOf(i5));
                                c21437618v0.LJI++;
                            } else {
                                interfaceC21427218tK.LJIL().LIZ(AbstractC20267814Se.LIZ, C14S1.BULLET);
                                C14S5<Integer> c14s52 = AbstractC20267814Se.LIZIZ;
                                C14S7 c14s7LJIL = interfaceC21427218tK.LJIL();
                                int i6 = 0;
                                for (AbstractC21430218to abstractC21430218to3 = abstractC21430218to.LIZ; abstractC21430218to3 != null; abstractC21430218to3 = abstractC21430218to3.LIZ) {
                                    if (abstractC21430218to3 instanceof C21445118wD) {
                                        i6++;
                                    }
                                }
                                c14s7LJIL.LIZ(c14s52, Integer.valueOf(i6));
                            }
                            if (length == interfaceC21427218tK.length()) {
                                interfaceC21427218tK.builder().LIZJ(e3.d);
                            }
                            interfaceC21427218tK.LJJIIJZLJL(abstractC21430218to, length);
                            if (interfaceC21427218tK.LJIJJLI(abstractC21430218to)) {
                                interfaceC21427218tK.LJIIJ();
                                interfaceC21427218tK.LJJIJ();
                            }
                        }
                    });
                } else {
                    final C21419418s4 c21419418s43 = this.LIZ.LIZJ;
                    C689290R1z c689290R1z = c21419418s43.LJJIJL;
                    if (c689290R1z != null) {
                        customSpaceScene = c689290R1z.LIZ;
                    } else {
                        customSpaceScene = null;
                    }
                    if (customSpaceScene == CustomSpaceScene.V2) {
                        c21427518tN.LIZ(C21445118wD.class, new InterfaceC21427718tP<C21445118wD>(c21419418s43) { // from class: X.18tE
                            public final C21419418s4 LIZ;

                            {
                                this.LIZ = c21419418s43;
                            }

                            @Override // X.InterfaceC21427718tP
                            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                                C21419418s4 c21419418s44 = this.LIZ;
                                C689290R1z c689290R1z2 = c21419418s44.LJJIJL;
                                if (c689290R1z2 != null) {
                                    C21422118sV.LIZJ(interfaceC21427218tK, abstractC21430218to, c689290R1z2, c21419418s44.LJJIIJZLJL);
                                }
                                int length = interfaceC21427218tK.length();
                                interfaceC21427218tK.LJJIIZ(abstractC21430218to);
                                interfaceC21427218tK.LJIL().LIZ(AbstractC20267814Se.LJII, Boolean.valueOf(C21426518tD.LIZ(abstractC21430218to)));
                                AbstractC21430218to abstractC21430218to2 = abstractC21430218to.LIZ;
                                if (abstractC21430218to2 instanceof C21437618v0) {
                                    C21437618v0 c21437618v0 = (C21437618v0) abstractC21430218to2;
                                    int i5 = c21437618v0.LJI;
                                    interfaceC21427218tK.LJIL().LIZ(AbstractC20267814Se.LIZ, C14S1.ORDERED);
                                    interfaceC21427218tK.LJIL().LIZ(AbstractC20267814Se.LIZJ, Integer.valueOf(i5));
                                    c21437618v0.LJI++;
                                } else {
                                    interfaceC21427218tK.LJIL().LIZ(AbstractC20267814Se.LIZ, C14S1.BULLET);
                                    C14S5<Integer> c14s52 = AbstractC20267814Se.LIZIZ;
                                    C14S7 c14s7LJIL = interfaceC21427218tK.LJIL();
                                    int i6 = 0;
                                    for (AbstractC21430218to abstractC21430218to3 = abstractC21430218to.LIZ; abstractC21430218to3 != null; abstractC21430218to3 = abstractC21430218to3.LIZ) {
                                        if (abstractC21430218to3 instanceof C21445118wD) {
                                            i6++;
                                        }
                                    }
                                    c14s7LJIL.LIZ(c14s52, Integer.valueOf(i6));
                                }
                                interfaceC21427218tK.LJJIIJZLJL(abstractC21430218to, length);
                                if (interfaceC21427218tK.LJIJJLI(abstractC21430218to)) {
                                    interfaceC21427218tK.LJIIJ();
                                }
                                C21419418s4 c21419418s45 = this.LIZ;
                                C689290R1z c689290R1z3 = c21419418s45.LJJIJL;
                                if (c689290R1z3 != null) {
                                    C21422118sV.LIZIZ(interfaceC21427218tK, abstractC21430218to, c689290R1z3, c21419418s45.LJJIIJZLJL);
                                }
                            }
                        });
                    }
                }
                final C21419418s4 c21419418s44 = this.LIZ.LIZJ;
                c21427518tN.LIZ(C21438618vA.class, new InterfaceC21427718tP<C21438618vA>(c21419418s44) { // from class: X.18se
                    public final C21419418s4 LIZ;

                    {
                        this.LIZ = c21419418s44;
                    }

                    @Override // X.InterfaceC21427718tP
                    public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                        C689290R1z c689290R1z2;
                        C21419418s4 c21419418s45 = this.LIZ;
                        if (c21419418s45 != null && (c689290R1z2 = c21419418s45.LJJIJL) != null) {
                            if (c689290R1z2.LIZ == CustomSpaceScene.V2) {
                                interfaceC21427218tK.LJJIJ();
                                return;
                            } else {
                                C21422018sU.LIZ.LIZ(interfaceC21427218tK, abstractC21430218to, c689290R1z2, c21419418s45.LJJIIJ);
                                return;
                            }
                        }
                        interfaceC21427218tK.LJJIJ();
                    }
                });
                final C21419418s4 c21419418s45 = this.LIZ.LIZJ;
                c21427518tN.LIZ(C21439218vG.class, new InterfaceC21427718tP<C21439218vG>(c21419418s45) { // from class: X.18sT
                    public final C21419418s4 LIZ;

                    {
                        this.LIZ = c21419418s45;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
                    @Override // X.InterfaceC21427718tP
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(X.InterfaceC21427218tK r7, X.AbstractC21430218to r8) {
                        /*
                            r6 = this;
                            X.18to r3 = r8.LIZ
                            r5 = 0
                            if (r3 == 0) goto L64
                            X.18to r1 = r3.LIZ
                            boolean r0 = r1 instanceof X.AbstractC21445918wL
                            if (r0 == 0) goto L64
                            X.18wL r1 = (X.AbstractC21445918wL) r1
                            boolean r4 = r1.LJFF
                        Lf:
                            r2 = 1
                            if (r3 == 0) goto L62
                            X.18to r1 = r3.LIZ
                            boolean r0 = r1 instanceof X.AbstractC21445918wL
                            if (r0 == 0) goto L62
                            X.18wL r1 = (X.AbstractC21445918wL) r1
                            boolean r0 = r1.LJFF
                            if (r0 != 0) goto L62
                            r0 = 1
                        L1f:
                            if (r4 != 0) goto L2b
                            if (r0 == 0) goto L5d
                            X.18s4 r0 = r6.LIZ
                            if (r0 == 0) goto L5d
                            boolean r0 = r0.LJIIJ
                            if (r0 != r2) goto L5d
                        L2b:
                            int r3 = r7.length()
                            r7.LJJIIZ(r8)
                            X.14S5<java.lang.Boolean> r2 = X.AbstractC20267814Se.LJI
                            X.14S7 r1 = r7.LJIL()
                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
                            r1.LIZ(r2, r0)
                            r7.LJJIIJZLJL(r8, r3)
                            X.18s4 r3 = r6.LIZ
                            if (r3 == 0) goto L57
                            X.0R1z r2 = r3.LJJIJL
                            if (r2 == 0) goto L57
                            com.larus.business.markdown.api.model.CustomSpaceScene r1 = r2.LIZ
                            com.larus.business.markdown.api.model.CustomSpaceScene r0 = com.larus.business.markdown.api.model.CustomSpaceScene.V2
                            if (r1 == r0) goto L57
                            X.18sU r1 = X.C21422018sU.LIZ
                            boolean r0 = r3.LJJIIJ
                            r1.LIZ(r7, r8, r2, r0)
                        L57:
                            if (r5 == 0) goto L5c
                            r7.LJJ(r8)
                        L5c:
                            return
                        L5d:
                            r5 = 1
                            r7.LJJIJIIJIL(r8)
                            goto L2b
                        L62:
                            r0 = 0
                            goto L1f
                        L64:
                            r4 = 0
                            goto Lf
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C21421918sT.LIZ(X.18tK, X.18to):void");
                    }
                });
                final C21419418s4 c21419418s46 = this.LIZ.LIZJ;
                c21427518tN.LIZ(C21445018wC.class, new InterfaceC21427718tP<C21445018wC>(c21419418s46) { // from class: X.18sd
                    public final C21419418s4 LIZ;

                    {
                        this.LIZ = c21419418s46;
                    }

                    @Override // X.InterfaceC21427718tP
                    public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                        C689290R1z c689290R1z2;
                        interfaceC21427218tK.LJJIJIIJIL(abstractC21430218to);
                        int length = interfaceC21427218tK.length();
                        interfaceC21427218tK.LJJIIZ(abstractC21430218to);
                        interfaceC21427218tK.LJJIIJZLJL(abstractC21430218to, length);
                        C21419418s4 c21419418s47 = this.LIZ;
                        if (c21419418s47 != null && (c689290R1z2 = c21419418s47.LJJIJL) != null && c689290R1z2.LIZ != CustomSpaceScene.V2) {
                            C21422018sU.LIZ.LIZ(interfaceC21427218tK, abstractC21430218to, c689290R1z2, c21419418s47.LJJIIJ);
                        }
                        interfaceC21427218tK.LJJ(abstractC21430218to);
                    }
                });
                c21427518tN.LIZ(C21438118v5.class, new InterfaceC21427718tP() { // from class: X.18sM
                    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
                    @Override // X.InterfaceC21427718tP
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(X.InterfaceC21427218tK r4, X.AbstractC21430218to r5) {
                        /*
                            r3 = this;
                            int r0 = r4.length()
                            r4.LJJIIZ(r5)
                            r4.LJJIIJZLJL(r5, r0)
                            X.18to r1 = r5.LIZJ
                            boolean r0 = r1 instanceof X.C21437418uy
                            if (r0 == 0) goto L49
                            X.18uy r1 = (X.C21437418uy) r1
                            if (r1 == 0) goto L49
                            java.lang.String r1 = r1.LJFF
                            X.14S5<android.content.Context> r0 = X.C21379618le.LIZ
                            int r0 = r1.length()
                            if (r0 == 0) goto L49
                            char r1 = X.C13LN.LJLLL(r1)
                            r0 = 19968(0x4e00, float:2.7981E-41)
                            if (r0 > r1) goto L4a
                            r0 = 40960(0xa000, float:5.7397E-41)
                            if (r1 >= r0) goto L53
                        L2b:
                            int r2 = r4.length()
                            X.18sn r1 = r4.builder()
                            r0 = 160(0xa0, float:2.24E-43)
                            r1.LIZ(r0)
                            X.0GVL r1 = new X.0GVL
                            r0 = 3
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                            int r0 = X.C445120Hcs.LIZ(r0)
                            r1.<init>(r0)
                            r4.LJIJI(r2, r1)
                        L49:
                            return
                        L4a:
                            r0 = 13312(0x3400, float:1.8654E-41)
                            if (r0 > r1) goto L49
                            r0 = 19904(0x4dc0, float:2.7891E-41)
                            if (r1 >= r0) goto L53
                            goto L2b
                        L53:
                            r0 = 131072(0x20000, float:1.83671E-40)
                            if (r0 > r1) goto L49
                            r0 = 173792(0x2a6e0, float:2.43534E-40)
                            if (r1 >= r0) goto L49
                            goto L2b
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C21421218sM.LIZ(X.18tK, X.18to):void");
                    }
                });
                final C21419518s5 c21419518s5 = this.LIZ;
                c21427518tN.LIZIZ = new C21426018t8() { // from class: X.18sS
                    @Override // X.C21426018t8, X.InterfaceC21437018uu
                    public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                        int iLIZ7;
                        if (interfaceC21427218tK.LJIJJLI(abstractC21430218to)) {
                            C21419518s5 c21419518s52 = c21419518s5;
                            C21419418s4 c21419418s47 = c21419518s52.LIZJ;
                            C689290R1z c689290R1z2 = c21419418s47.LJJIJL;
                            if (c689290R1z2 != null) {
                                if (c689290R1z2.LIZ == CustomSpaceScene.V2) {
                                    C21422118sV.LIZIZ(interfaceC21427218tK, abstractC21430218to, c689290R1z2, c21419418s47.LJJIIJZLJL);
                                    return;
                                } else {
                                    if ((abstractC21430218to instanceof C21439218vG) || (abstractC21430218to instanceof AbstractC21445918wL)) {
                                        return;
                                    }
                                    C21422018sU.LIZ.LIZ(interfaceC21427218tK, abstractC21430218to, c689290R1z2, c21419418s47.LJJIIJ);
                                    return;
                                }
                            }
                            interfaceC21427218tK.LJIIJ();
                            int length = interfaceC21427218tK.length();
                            interfaceC21427218tK.builder().LIZJ(" ");
                            Integer numValueOf = Integer.valueOf(c21419518s52.LIZJ.LJJIII);
                            if (numValueOf.intValue() > 0) {
                                iLIZ7 = numValueOf.intValue();
                            } else {
                                iLIZ7 = C445120Hcs.LIZ(16);
                            }
                            interfaceC21427218tK.LJIJI(length, C418300Gai.LIZ(iLIZ7));
                            interfaceC21427218tK.LJIIJ();
                        }
                    }

                    @Override // X.C21426018t8, X.InterfaceC21437018uu
                    public final void LIZIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                        interfaceC21427218tK.LJIIJ();
                        C21419418s4 c21419418s47 = c21419518s5.LIZJ;
                        C689290R1z c689290R1z2 = c21419418s47.LJJIJL;
                        if (c689290R1z2 != null) {
                            C21422118sV.LIZJ(interfaceC21427218tK, abstractC21430218to, c689290R1z2, c21419418s47.LJJIIJZLJL);
                        }
                    }
                };
                c21427518tN.LIZ(C21440218vQ.class, new InterfaceC21427718tP() { // from class: X.18sK
                    /* JADX WARN: Removed duplicated region for block: B:105:0x0260  */
                    /* JADX WARN: Removed duplicated region for block: B:107:0x0292  */
                    /* JADX WARN: Removed duplicated region for block: B:115:0x02ee  */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[Catch: Exception -> 0x0200, PHI: r13
                      0x0064: PHI (r13v16 java.lang.String) = (r13v1 java.lang.String), (r13v17 java.lang.String) binds: [B:28:0x005f, B:26:0x005b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0200, blocks: (B:18:0x004b, B:20:0x004f, B:25:0x0059, B:30:0x0064, B:31:0x0066, B:33:0x008a), top: B:120:0x004b }] */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x013f A[Catch: Exception -> 0x01fc, PHI: r17 r24
                      0x013f: PHI (r17v6 int) = (r17v5 int), (r17v5 int), (r17v5 int), (r17v7 int) binds: [B:54:0x00ec, B:56:0x00f1, B:57:0x00f3, B:62:0x0118] A[DONT_GENERATE, DONT_INLINE]
                      0x013f: PHI (r24v3 int) = (r24v2 int), (r24v2 int), (r24v2 int), (r24v4 int) binds: [B:54:0x00ec, B:56:0x00f1, B:57:0x00f3, B:62:0x0118] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x01fc, blocks: (B:59:0x010a, B:61:0x0114, B:62:0x0118, B:63:0x013f, B:65:0x016f, B:66:0x0173, B:68:0x0183, B:69:0x0187, B:71:0x01b4, B:72:0x01b6, B:78:0x01c3), top: B:124:0x010a }] */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x016f A[Catch: Exception -> 0x01fc, TryCatch #2 {Exception -> 0x01fc, blocks: (B:59:0x010a, B:61:0x0114, B:62:0x0118, B:63:0x013f, B:65:0x016f, B:66:0x0173, B:68:0x0183, B:69:0x0187, B:71:0x01b4, B:72:0x01b6, B:78:0x01c3), top: B:124:0x010a }] */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x0183 A[Catch: Exception -> 0x01fc, TryCatch #2 {Exception -> 0x01fc, blocks: (B:59:0x010a, B:61:0x0114, B:62:0x0118, B:63:0x013f, B:65:0x016f, B:66:0x0173, B:68:0x0183, B:69:0x0187, B:71:0x01b4, B:72:0x01b6, B:78:0x01c3), top: B:124:0x010a }] */
                    /* JADX WARN: Removed duplicated region for block: B:71:0x01b4 A[Catch: Exception -> 0x01fc, TryCatch #2 {Exception -> 0x01fc, blocks: (B:59:0x010a, B:61:0x0114, B:62:0x0118, B:63:0x013f, B:65:0x016f, B:66:0x0173, B:68:0x0183, B:69:0x0187, B:71:0x01b4, B:72:0x01b6, B:78:0x01c3), top: B:124:0x010a }] */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
                    /* JADX WARN: Removed duplicated region for block: B:75:0x01bb  */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x01be  */
                    /* JADX WARN: Removed duplicated region for block: B:78:0x01c3 A[Catch: Exception -> 0x01fc, TryCatch #2 {Exception -> 0x01fc, blocks: (B:59:0x010a, B:61:0x0114, B:62:0x0118, B:63:0x013f, B:65:0x016f, B:66:0x0173, B:68:0x0183, B:69:0x0187, B:71:0x01b4, B:72:0x01b6, B:78:0x01c3), top: B:124:0x010a }] */
                    /* JADX WARN: Removed duplicated region for block: B:94:0x020a  */
                    /* JADX WARN: Removed duplicated region for block: B:99:0x0214  */
                    @Override // X.InterfaceC21427718tP
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(X.InterfaceC21427218tK r34, X.AbstractC21430218to r35) {
                        /*
                            Method dump skipped, instruction units count: 784
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C21421018sK.LIZ(X.18tK, X.18to):void");
                    }
                });
                final C21419518s5 c21419518s52 = this.LIZ;
                c21427518tN.LIZ(C21428118tT.class, new InterfaceC21427718tP() { // from class: X.18sJ
                    @Override // X.InterfaceC21427718tP
                    public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                        int iIntValue;
                        int iIntValue2;
                        int intrinsicWidth;
                        int i5;
                        int iLIZ7;
                        int intrinsicWidth2;
                        C21428118tT c21428118tT = (C21428118tT) abstractC21430218to;
                        C21419518s5 c21419518s53 = c21419518s52;
                        Context context2 = c21419518s53.LIZ;
                        C21408418qI c21408418qI2 = c21419518s53.LIZJ.LJIIZILJ;
                        if (c21408418qI2 != null) {
                            iIntValue = c21408418qI2.LJ;
                        } else {
                            Integer num = c21419518s53.LJFF;
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                        }
                        C21419518s5 c21419518s54 = c21419518s52;
                        C21419418s4 c21419418s47 = c21419518s54.LIZJ;
                        boolean z9 = !c21419518s54.LIZIZ;
                        TableConfig tableConfig2 = c21419418s47.LJJIL;
                        if (tableConfig2 != null) {
                            try {
                                if (tableConfig2.enableTableTitle) {
                                    int length = interfaceC21427218tK.length();
                                    C21425518t3 c21425518t3LIZ = C21376618lA.LIZ(tableConfig2.titleStyle);
                                    String str2 = tableConfig2.tableTitle;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(str2);
                                    sbLIZ.append('\r');
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
                                    int i6 = c21425518t3LIZ.LIZ;
                                    Integer num2 = tableConfig2.tableTitleSize;
                                    if (num2 != null) {
                                        iIntValue2 = num2.intValue();
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    if (!tableConfig2.enableCopyButton) {
                                        i5 = 0;
                                    } else {
                                        spannableStringBuilder.insert(spannableStringBuilder.length(), (CharSequence) " ");
                                        int i7 = c21425518t3LIZ.LIZIZ;
                                        int i8 = c21425518t3LIZ.LIZLLL;
                                        int i9 = c21425518t3LIZ.LJ;
                                        int length2 = spannableStringBuilder.length();
                                        int i10 = length2 - 1;
                                        Drawable drawableLIZIZ = C800330VaR.LIZIZ(context2, i7);
                                        if (drawableLIZIZ != null) {
                                            intrinsicWidth = drawableLIZIZ.getIntrinsicWidth();
                                        } else {
                                            intrinsicWidth = 0;
                                        }
                                        i5 = intrinsicWidth + i8 + i9;
                                        C786410Ut5.q2(spannableStringBuilder, new C0GWM(context2, i7, i6, i8, i9, z9, tableConfig2.copyButtonDrawableTintColor), i10, length2, 33);
                                        C786410Ut5.q2(spannableStringBuilder, new C1860910yWf(c21428118tT.LJFF, c21428118tT.LJI), i10, length2, 17);
                                    }
                                    boolean z10 = tableConfig2.enableFullScreenButton;
                                    Integer num3 = c21425518t3LIZ.LIZJ;
                                    if (z10 && num3 != null) {
                                        spannableStringBuilder.insert(spannableStringBuilder.length(), (CharSequence) " ");
                                        int length3 = spannableStringBuilder.length();
                                        int i11 = length3 - 1;
                                        int i12 = c21425518t3LIZ.LJFF;
                                        int i13 = c21425518t3LIZ.LJI;
                                        Drawable drawableLIZIZ2 = C800330VaR.LIZIZ(context2, num3.intValue());
                                        if (drawableLIZIZ2 != null) {
                                            intrinsicWidth2 = drawableLIZIZ2.getIntrinsicWidth();
                                        } else {
                                            intrinsicWidth2 = 0;
                                        }
                                        i5 += intrinsicWidth2 + i12 + i13;
                                        C786410Ut5.q2(spannableStringBuilder, new C0GWM(context2, num3.intValue(), i6, i12, i13, z9), i11, length3, 33);
                                        C786410Ut5.q2(spannableStringBuilder, new C21429318tf(), i11, length3, 17);
                                    }
                                    spannableStringBuilder.insert(spannableStringBuilder.length(), (CharSequence) "\r\n");
                                    Integer num4 = tableConfig2.tableTitleTextColor;
                                    if (num4 != null) {
                                        iLIZ7 = num4.intValue();
                                    } else {
                                        iLIZ7 = C446980Hfs.LIZ(context2, R.color.rx);
                                    }
                                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iLIZ7), 0, spannableStringBuilder.length(), 17);
                                    C786410Ut5.q2(spannableStringBuilder, new AbsoluteSizeSpan(iIntValue2, true), 0, spannableStringBuilder.length(), 17);
                                    int i14 = c21425518t3LIZ.LJII;
                                    int length4 = str2.length();
                                    C786410Ut5.q2(spannableStringBuilder, new C0H15(spannableStringBuilder, iIntValue, Collections.singletonList(new Pair(0, Integer.valueOf(str2.length()))), interfaceC21427218tK.LJJIII().LIZ.LJIILJJIL + i14 + i5, i6, C445120Hcs.LIZ(2)), length4, length4 + 1, 33);
                                    int length5 = spannableStringBuilder.length() - 2;
                                    C786410Ut5.q2(spannableStringBuilder, new C0GVR(i14, i6), length5, length5 + 1, 33);
                                    interfaceC21427218tK.builder().LIZIZ(spannableStringBuilder);
                                    interfaceC21427218tK.LJIL().LIZ(C21420718sH.LIZ, Integer.valueOf(length));
                                    interfaceC21427218tK.LJIL().LIZ(C21420718sH.LIZIZ, Integer.valueOf(interfaceC21427218tK.length()));
                                    interfaceC21427218tK.LJJIIJZLJL(c21428118tT, length);
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                });
                final C21419418s4 c21419418s47 = this.LIZ.LIZJ;
                C689290R1z c689290R1z2 = c21419418s47.LJJIJL;
                if (c689290R1z2 != null) {
                    customSpaceScene2 = c689290R1z2.LIZ;
                }
                if (customSpaceScene2 == CustomSpaceScene.V2) {
                    c21427518tN.LIZ(C21427618tO.class, new InterfaceC21427718tP<C21427618tO>(c21419418s47) { // from class: X.18sR
                        public final C21419418s4 LIZ;

                        {
                            this.LIZ = c21419418s47;
                        }

                        @Override // X.InterfaceC21427718tP
                        public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                            C689290R1z c689290R1z3;
                            C689290R1z c689290R1z4;
                            C21427618tO c21427618tO = (C21427618tO) abstractC21430218to;
                            C21419418s4 c21419418s48 = this.LIZ;
                            if (c21419418s48 != null && (c689290R1z4 = c21419418s48.LJJIJL) != null) {
                                C21422118sV.LIZJ(interfaceC21427218tK, c21427618tO, c689290R1z4, c21419418s48.LJJIIJZLJL);
                            }
                            int length = interfaceC21427218tK.length();
                            interfaceC21427218tK.LJJIIZ(c21427618tO);
                            interfaceC21427218tK.LJIL().LIZ(AbstractC21379918lh.LIZ, Boolean.valueOf(c21427618tO.LJFF));
                            interfaceC21427218tK.LJJIIZI(c21427618tO, length);
                            if (interfaceC21427218tK.LJIJJLI(c21427618tO)) {
                                interfaceC21427218tK.LJIIJ();
                            }
                            C21419418s4 c21419418s49 = this.LIZ;
                            if (c21419418s49 != null && (c689290R1z3 = c21419418s49.LJJIJL) != null) {
                                C21422118sV.LIZIZ(interfaceC21427218tK, c21427618tO, c689290R1z3, c21419418s49.LJJIIJZLJL);
                            }
                        }
                    });
                }
            }

            @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
            public final void LJ(C21435318ud c21435318ud) {
                InterfaceC21446318wP interfaceC21446318wP;
                final Integer numValueOf;
                final Float f4;
                final Integer num;
                int iLIZ7;
                float fLIZIZ2;
                boolean z9;
                boolean z10;
                int iLIZ8;
                int iLIZ9;
                CodeStyle codeStyle;
                int iLIZ10;
                int iLIZ11;
                int iLIZ12;
                float f5;
                final int iLIZ13;
                final int iLIZ14;
                int iLIZ15;
                final Float f6;
                Integer num2;
                Integer num3;
                Integer num4;
                Integer numValueOf2;
                Integer num5;
                Integer num6;
                Integer num7;
                Integer num8;
                Integer num9;
                Integer num10;
                int i5;
                C21419518s5 c21419518s5 = this.LIZ;
                C21419418s4 c21419418s42 = c21419518s5.LIZJ;
                final int iLIZ16 = c21419418s42.LJJIIZ;
                if (iLIZ16 == 0) {
                    Context context2 = c21419518s5.LIZ;
                    if (c21419418s42.LJFF) {
                        i5 = R.color.ej;
                    } else {
                        i5 = R.color.t0;
                    }
                    iLIZ16 = C446980Hfs.LIZ(context2, i5);
                }
                C21419418s4 c21419418s43 = this.LIZ.LIZJ;
                final boolean z11 = c21419418s43.LJJIIZI;
                final Typeface typeface = c21419418s43.LJJIJIIJI;
                final Typeface typeface2 = c21419418s43.LJJIJIIJIL;
                c21435318ud.LIZ(C21436418uo.class, new C21424818sw(iLIZ16, z11, typeface, typeface2) { // from class: X.18so
                    public final int LIZ;
                    public final boolean LIZIZ;
                    public final Typeface LIZJ;
                    public final Typeface LIZLLL;

                    @Override // X.C21424818sw, X.InterfaceC21446318wP
                    public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                        String strLIZ;
                        Typeface typeface3;
                        String strLIZ2 = AbstractC20267814Se.LJ.LIZ(c14s7);
                        try {
                            strLIZ = C21424318sr.LIZLLL.LIZ(c14s7);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            strLIZ = null;
                        }
                        if (((Boolean) c14s7.LIZIZ(AbstractC20267814Se.LJIIIIZZ, Boolean.FALSE)).booleanValue()) {
                            typeface3 = this.LIZLLL;
                        } else {
                            typeface3 = this.LIZJ;
                        }
                        if (strLIZ != null && new Regex("^\\[\\d{1,2}\\]$").matches(strLIZ)) {
                            return new C445260Hd6(c21432118u7.LIZ, strLIZ, strLIZ2, c21432118u7.LIZJ);
                        }
                        if (u.LJJIIJZLJL(strLIZ2, "mention://", false)) {
                            return new CustomMentionSpan();
                        }
                        return new CustomLinkSpan(c21432118u7.LIZ, strLIZ2, c21432118u7.LIZJ, this.LIZ, this.LIZIZ, typeface3);
                    }

                    {
                        this.LIZ = iLIZ16;
                        this.LIZIZ = z11;
                        this.LIZJ = typeface;
                        this.LIZLLL = typeface2;
                    }
                });
                c21435318ud.LIZ(C21444918wB.class, new InterfaceC21446318wP() { // from class: X.18lo
                    @Override // X.InterfaceC21446318wP
                    public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                        return new ParagraphStyle[]{new C445250Hd5(c21432118u7.LIZ), C418300Gai.LIZ(C445120Hcs.LIZ(1))};
                    }
                });
                C21419418s4 c21419418s44 = this.LIZ.LIZJ;
                ListItemConfig listItemConfig = c21419418s44.LJJJJJ;
                if (listItemConfig != null) {
                    if (listItemConfig.useCustomIndent) {
                        interfaceC21446318wP = new InterfaceC21446318wP(listItemConfig, c21419418s44.LJJJJL, c21419418s44.LJJIIJ) { // from class: X.14Rz
                            public final ListItemConfig LIZ;
                            public final boolean LIZIZ;
                            public final boolean LIZJ;

                            @Override // X.InterfaceC21446318wP
                            public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                                String strLIZIZ;
                                ListItemConfig listItemConfig2 = this.LIZ;
                                int i6 = listItemConfig2.textMargin;
                                int i7 = listItemConfig2.bulletWidth;
                                int i8 = listItemConfig2.startMargin;
                                int i9 = listItemConfig2.marginPace;
                                int i10 = i8 + i6 + i7;
                                if (C14S1.BULLET == AbstractC20267814Se.LIZ.LIZ(c14s7)) {
                                    return new AbstractC445150Hcv(AbstractC20267814Se.LIZIZ.LIZ(c14s7).intValue(), i8, i6, i7, i10, i9, this.LIZJ) { // from class: X.0Hct
                                        public final int LLILZLL;
                                        public final int LLIZ;
                                        public final int LLIZLLLIL;
                                        public final int LLJ;
                                        public final int LLJI;
                                        public final RectF LLJIJIL;
                                        public final RectF LLJILJIL;

                                        {
                                            super(i, i10, i9, z);
                                            this.LLILZLL = i;
                                            this.LLIZ = i8;
                                            this.LLIZLLLIL = i6;
                                            this.LLJ = i7;
                                            this.LLJI = i9;
                                            RectF rectF = AbstractC445100Hcq.LIZIZ;
                                            this.LLJIJIL = rectF;
                                            this.LLJILJIL = rectF;
                                        }

                                        public static final void LIZIZ(C445130Hct c445130Hct, float f7, int i11, Canvas canvas, int i12, int i13, Paint paint) {
                                            if (!c445130Hct.LLILZ) {
                                                return;
                                            }
                                            float f8 = i11;
                                            float f9 = f7 - (c445130Hct.LLJI * f8);
                                            float f10 = f7 + (c445130Hct.LLIZ * f8);
                                            float f11 = f10 + (c445130Hct.LLJ * f8);
                                            c445130Hct.LLILZIL.setStyle(Paint.Style.FILL);
                                            c445130Hct.LLILZIL.setColor(-65536);
                                            float f12 = i12;
                                            float f13 = i13;
                                            canvas.drawRect(f9, f12, f7, f13, c445130Hct.LLILZIL);
                                            c445130Hct.LLILZIL.setColor(-16776961);
                                            canvas.drawRect(f7, f12, f10, f13, c445130Hct.LLILZIL);
                                            c445130Hct.LLILZIL.setColor(-16711936);
                                            canvas.drawRect(f11, f12, f11 + (c445130Hct.LLIZLLLIL * f8), f13, c445130Hct.LLILZIL);
                                            c445130Hct.LLILZIL.setColor(paint.getColor());
                                        }

                                        @Override // X.AbstractC445150Hcv
                                        public final void LIZ(Canvas canvas, Paint paint, float f7, int i11, int i12, int i13, int i14) {
                                            float f8;
                                            Paint.Style style;
                                            int iSave = canvas.save();
                                            try {
                                                int i15 = this.LLJ;
                                                if (i11 > 0) {
                                                    f8 = this.LLIZ + f7;
                                                } else {
                                                    f8 = (f7 - this.LLIZ) - i15;
                                                }
                                                float f9 = i15;
                                                float f10 = f8 + f9;
                                                float fDescent = (i13 + ((int) (((this.LLILZIL.descent() + this.LLILZIL.ascent()) / 2.0f) + 0.5f))) - (f9 / 2.0f);
                                                float f11 = f9 + fDescent;
                                                int i16 = this.LLILZLL;
                                                if (i16 != 0 && i16 != 1) {
                                                    this.LLJILJIL.set(f8, fDescent, f10, f11);
                                                    this.LLILZIL.setStyle(Paint.Style.FILL);
                                                    canvas.drawRect(this.LLJILJIL, this.LLILZIL);
                                                } else {
                                                    this.LLJIJIL.set(f8, fDescent, f10, f11);
                                                    if (this.LLILZLL == 0) {
                                                        style = Paint.Style.FILL;
                                                    } else {
                                                        style = Paint.Style.STROKE;
                                                    }
                                                    this.LLILZIL.setStyle(style);
                                                    this.LLILZIL.setStrokeWidth(C445120Hcs.LIZIZ(Float.valueOf(0.5f)));
                                                    canvas.drawOval(this.LLJIJIL, this.LLILZIL);
                                                }
                                                LIZIZ(this, f7, i11, canvas, i12, i14, paint);
                                                canvas.restoreToCount(iSave);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                canvas.restoreToCount(iSave);
                                                throw th;
                                            }
                                        }
                                    };
                                }
                                if (this.LIZIZ) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append('.');
                                    sbLIZ.append(AbstractC20267814Se.LIZJ.LIZ(c14s7).intValue());
                                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append((char) 160);
                                    sbLIZ2.append(strLIZIZ2);
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                } else {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(AbstractC20267814Se.LIZJ.LIZ(c14s7).intValue());
                                    sbLIZ3.append(". ");
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                }
                                return new AbstractC445150Hcv(strLIZIZ, i10, i9, this.LIZJ) { // from class: X.0Hcu
                                    public final String LLILZLL;
                                    public final int LLIZ;

                                    {
                                        super(0, i10, i9, z);
                                        this.LLILZLL = strLIZIZ;
                                        this.LLIZ = i10;
                                    }

                                    @Override // X.AbstractC445150Hcv
                                    public final void LIZ(Canvas canvas, Paint paint, float f7, int i11, int i12, int i13, int i14) {
                                        if (i11 <= 0) {
                                            f7 -= this.LLIZ;
                                        }
                                        this.LLILZIL.setFontFeatureSettings("tnum");
                                        canvas.drawText(this.LLILZLL, f7, i13, this.LLILZIL);
                                    }
                                };
                            }

                            {
                                this.LIZ = listItemConfig;
                                this.LIZIZ = z;
                                this.LIZJ = z;
                            }
                        };
                    } else {
                        interfaceC21446318wP = new InterfaceC21446318wP(listItemConfig) { // from class: X.14Ry
                            public final ListItemConfig LIZ;

                            {
                                this.LIZ = listItemConfig;
                            }

                            @Override // X.InterfaceC21446318wP
                            public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                                int i6;
                                int i7;
                                int i8;
                                int i9;
                                int i10;
                                int i11;
                                int i12;
                                int i13;
                                boolean zBooleanValue = ((Boolean) c14s7.LIZIZ(AbstractC20267814Se.LJII, Boolean.FALSE)).booleanValue();
                                ListItemConfig listItemConfig2 = this.LIZ;
                                if (zBooleanValue) {
                                    i6 = listItemConfig2.blockLeadingMarginInQuote;
                                } else {
                                    i6 = listItemConfig2.blockLeadingMargin;
                                }
                                ListItemConfig listItemConfig3 = this.LIZ;
                                if (zBooleanValue) {
                                    i7 = listItemConfig3.textMarginInQuote;
                                } else {
                                    i7 = listItemConfig3.textMargin;
                                }
                                ListItemConfig listItemConfig4 = this.LIZ;
                                if (zBooleanValue) {
                                    i8 = listItemConfig4.listItemColorInQuote;
                                } else {
                                    i8 = listItemConfig4.listItemColor;
                                }
                                if (C14S1.BULLET == AbstractC20267814Se.LIZ.LIZ(c14s7)) {
                                    ListItemConfig listItemConfig5 = this.LIZ;
                                    if (zBooleanValue) {
                                        i11 = listItemConfig5.bulletBlockLeadingMarginInQuote;
                                    } else {
                                        i11 = listItemConfig5.bulletBlockLeadingMargin;
                                    }
                                    ListItemConfig listItemConfig6 = this.LIZ;
                                    if (zBooleanValue) {
                                        i12 = listItemConfig6.bulletTextMarginInQuote;
                                        i13 = this.LIZ.bulletWidthInQuote;
                                    } else {
                                        i12 = listItemConfig6.bulletTextMargin;
                                        i13 = this.LIZ.bulletWidth;
                                    }
                                    int iIntValue = AbstractC20267814Se.LIZIZ.LIZ(c14s7).intValue();
                                    if (i11 <= 0) {
                                        i11 = i6;
                                    }
                                    if (i12 <= 0) {
                                        i12 = i7;
                                    }
                                    return new C445180Hcy(iIntValue, i11, i12, i13, i8, this.LIZ.bulletStyleUnify);
                                }
                                ListItemConfig listItemConfig7 = this.LIZ;
                                if (zBooleanValue) {
                                    i9 = listItemConfig7.orderedBlockLeadingMarginInQuote;
                                    i10 = this.LIZ.orderedTextMarginInQuote;
                                } else {
                                    i9 = listItemConfig7.orderedBlockLeadingMargin;
                                    i10 = this.LIZ.orderedTextMargin;
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(AbstractC20267814Se.LIZJ.LIZ(c14s7).intValue());
                                sbLIZ.append('.');
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                if (i9 > 0) {
                                    i6 = i9;
                                }
                                if (i10 > 0) {
                                    i7 = i10;
                                }
                                return new C445300HdA(strLIZIZ, i6, i7, i8);
                            }
                        };
                    }
                } else {
                    BgListItemConfig bgListItemConfig = c21419418s44.LJJII;
                    if (bgListItemConfig != null) {
                        final Integer numValueOf3 = Integer.valueOf(bgListItemConfig.bgColor);
                        BgListItemConfig bgListItemConfig2 = this.LIZ.LIZJ.LJJII;
                        if (bgListItemConfig2 != null) {
                            numValueOf = Integer.valueOf(bgListItemConfig2.bgMargin);
                        } else {
                            numValueOf = null;
                        }
                        BgListItemConfig bgListItemConfig3 = this.LIZ.LIZJ.LJJII;
                        if (bgListItemConfig3 != null) {
                            f4 = bgListItemConfig3.bgRadius;
                            num = bgListItemConfig3.leading;
                        } else {
                            f4 = null;
                            num = null;
                        }
                        interfaceC21446318wP = new C21427118tJ(f4, numValueOf3, numValueOf, num) { // from class: X.18tH
                            public final Integer LIZ;
                            public final Integer LIZIZ;
                            public final Float LIZJ;
                            public final Integer LIZLLL;

                            @Override // X.C21427118tJ, X.InterfaceC21446318wP
                            public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                                if (C14S1.BULLET == AbstractC20267814Se.LIZ.LIZ(c14s7)) {
                                    return super.LIZ(c21432118u7, c14s7);
                                }
                                if (this.LIZ != null && this.LIZIZ != null) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(AbstractC20267814Se.LIZJ.LIZ(c14s7).intValue());
                                    sbLIZ.append((char) 160);
                                    return new C445320HdC(c21432118u7.LIZ, C2188811AlT.LIZIZ(sbLIZ), this.LIZ.intValue(), this.LIZIZ.intValue(), this.LIZJ, this.LIZLLL) { // from class: X.0HdD
                                        public final int LLILZIL;
                                        public final int LLILZLL;
                                        public final Float LLIZ;
                                        public final Integer LLIZLLLIL;
                                        public final Paint LLJ = new Paint(1);

                                        @Override // X.C445320HdC, android.text.style.LeadingMarginSpan
                                        public final int getLeadingMargin(boolean z12) {
                                            int iIntValue;
                                            Integer num11 = this.LLIZLLLIL;
                                            if (num11 != null) {
                                                iIntValue = num11.intValue();
                                            } else {
                                                iIntValue = 0;
                                            }
                                            return iIntValue + (this.LLILZLL * 2);
                                        }

                                        {
                                            this.LLILZIL = i;
                                            this.LLILZLL = i;
                                            this.LLIZ = f;
                                            this.LLIZLLLIL = num;
                                        }

                                        @Override // X.C445320HdC, android.text.style.LeadingMarginSpan
                                        public final void drawLeadingMargin(Canvas canvas, Paint paint, int i6, int i7, int i8, int i9, int i10, CharSequence charSequence, int i11, int i12, boolean z12, Layout layout) {
                                            float fFloatValue;
                                            if (z12 && AbstractC445160Hcw.LIZ(charSequence, this, i11)) {
                                                this.LLILLL.set(paint);
                                                this.LL.LIZJ(this.LLILLL);
                                                String strSubstring = this.LLILLJJLI.substring(0, r1.length() - 1);
                                                int iMeasureText = (int) (this.LLILLL.measureText(this.LLILLJJLI) + 0.5f);
                                                int iMeasureText2 = (int) (this.LLILLL.measureText(strSubstring) + 0.5f);
                                                Rect rect = new Rect();
                                                if (paint != null) {
                                                    paint.getTextBounds(strSubstring, 0, strSubstring.length(), rect);
                                                }
                                                float fHeight = rect.height() + 0.5f;
                                                if (iMeasureText > this.LL.LIZJ) {
                                                    this.LLILZ = iMeasureText;
                                                } else {
                                                    this.LLILZ = 0;
                                                }
                                                this.LLJ.setColor(this.LLILZIL);
                                                this.LLJ.setStyle(Paint.Style.FILL);
                                                float f7 = i9;
                                                float f8 = f7 - fHeight;
                                                int i13 = this.LLILZLL;
                                                float f9 = f8 - i13;
                                                float f10 = iMeasureText2 + (i13 * 2);
                                                float f11 = i13 + f7;
                                                float fFloatValue2 = 0.0f;
                                                RectF rectF = new RectF(0.0f, f9, f10, f11);
                                                if (canvas != null) {
                                                    Float f12 = this.LLIZ;
                                                    if (f12 != null) {
                                                        fFloatValue = f12.floatValue();
                                                    } else {
                                                        fFloatValue = 0.0f;
                                                    }
                                                    Float f13 = this.LLIZ;
                                                    if (f13 != null) {
                                                        fFloatValue2 = f13.floatValue();
                                                    }
                                                    canvas.drawRoundRect(rectF, fFloatValue, fFloatValue2, this.LLJ);
                                                    canvas.drawText(this.LLILLJJLI, this.LLILZLL, f7, this.LLILLL);
                                                }
                                            }
                                        }
                                    };
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(AbstractC20267814Se.LIZJ.LIZ(c14s7).intValue());
                                sbLIZ2.append(". ");
                                return new C445340HdE(c21432118u7.LIZ, C2188811AlT.LIZIZ(sbLIZ2));
                            }

                            {
                                this.LIZ = numValueOf3;
                                this.LIZIZ = numValueOf;
                                this.LIZJ = f4;
                                this.LIZLLL = num;
                            }
                        };
                    } else {
                        final boolean z12 = c21419418s44.LJJJJL;
                        interfaceC21446318wP = new C21427118tJ(z12) { // from class: X.18tI
                            public final boolean LIZ;

                            {
                                this.LIZ = z12;
                            }

                            @Override // X.C21427118tJ, X.InterfaceC21446318wP
                            public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                                String strLIZIZ;
                                if (C14S1.BULLET == AbstractC20267814Se.LIZ.LIZ(c14s7)) {
                                    return new C445210Hd1(c21432118u7.LIZ, AbstractC20267814Se.LIZIZ.LIZ(c14s7).intValue());
                                }
                                if (this.LIZ) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append('.');
                                    sbLIZ.append(AbstractC20267814Se.LIZJ.LIZ(c14s7).intValue());
                                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append((char) 160);
                                    sbLIZ2.append(strLIZIZ2);
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                } else {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(AbstractC20267814Se.LIZJ.LIZ(c14s7).intValue());
                                    sbLIZ3.append(". ");
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                }
                                return new C445340HdE(c21432118u7.LIZ, strLIZIZ);
                            }
                        };
                    }
                }
                c21435318ud.LIZ(C21445118wD.class, interfaceC21446318wP);
                C21380418lm c21380418lm = this.LIZ.LIZJ.LJJI;
                if (c21380418lm != null) {
                    c21435318ud.LIZ(C21445018wC.class, new InterfaceC21446318wP(c21380418lm) { // from class: X.18ll
                        public final C21380418lm LIZ;

                        {
                            this.LIZ = c21380418lm;
                        }

                        @Override // X.InterfaceC21446318wP
                        public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                            List listLJIILJJIL = C1697810uHb.LJIILJJIL(new C445240Hd4(c21432118u7.LIZ, this.LIZ.LIZLLL), new ForegroundColorSpan(this.LIZ.LIZ));
                            C21380418lm c21380418lm2 = this.LIZ;
                            if (c21380418lm2.LJ != null && c21380418lm2.LJFF != null) {
                                listLJIILJJIL.add(new QuoteCustomTextSizeSpan(this.LIZ.LJ.intValue()));
                                listLJIILJJIL.add(C418300Gai.LIZ((int) (C445120Hcs.LIZ(this.LIZ.LJ) * this.LIZ.LJFF.floatValue())));
                            }
                            return listLJIILJJIL.toArray(new Object[0]);
                        }
                    });
                }
                C21419418s4 c21419418s45 = this.LIZ.LIZJ;
                c21435318ud.LIZ(C21439318vH.class, new C21380818lq(c21419418s45.LJIJ, c21419418s45.LJIJI, c21419418s45.LJIJJLI, c21419418s45.LJIL, c21419418s45.LJIJJ, c21419418s45.LJJ, c21419418s45.LJJIIJ));
                C21419518s5 c21419518s52 = this.LIZ;
                CodeBlockConfig codeBlockConfig = c21419518s52.LIZJ.LJJIJLIJ;
                if (codeBlockConfig != null && (num10 = codeBlockConfig.titleBgColor) != null) {
                    iLIZ7 = num10.intValue();
                } else {
                    iLIZ7 = C446980Hfs.LIZ(c21419518s52.LIZ, R.color.rz);
                }
                CodeBlockConfig codeBlockConfig2 = this.LIZ.LIZJ.LJJIJLIJ;
                if (codeBlockConfig2 != null && (num9 = codeBlockConfig2.cornerRadius) != null) {
                    fLIZIZ2 = num9.intValue();
                } else {
                    fLIZIZ2 = C445120Hcs.LIZIZ(8);
                }
                CodeBlockConfig codeBlockConfig3 = this.LIZ.LIZJ.LJJIJLIJ;
                if (codeBlockConfig3 != null) {
                    z9 = codeBlockConfig3.enableScroll;
                    z10 = codeBlockConfig3.enableLineNumber;
                } else {
                    z9 = false;
                    z10 = false;
                }
                C21408618qK c21408618qK2 = new C21408618qK(C445120Hcs.LIZ(120), C445120Hcs.LIZ(4), C446980Hfs.LIZ(this.LIZ.LIZ, R.color.rv));
                int i6 = this.LIZ.LIZ.getResources().getDisplayMetrics().widthPixels;
                C21419518s5 c21419518s53 = this.LIZ;
                CodeBlockConfig codeBlockConfig4 = c21419518s53.LIZJ.LJJIJLIJ;
                if (codeBlockConfig4 != null && (num8 = codeBlockConfig4.lineNumberColor) != null) {
                    iLIZ8 = num8.intValue();
                } else {
                    iLIZ8 = C446980Hfs.LIZ(c21419518s53.LIZ, R.color.rv);
                }
                C21419518s5 c21419518s54 = this.LIZ;
                CodeBlockConfig codeBlockConfig5 = c21419518s54.LIZJ.LJJIJLIJ;
                if (codeBlockConfig5 != null && (num7 = codeBlockConfig5.codeTextColor) != null) {
                    iLIZ9 = num7.intValue();
                } else {
                    iLIZ9 = C446980Hfs.LIZ(c21419518s54.LIZ, R.color.ru);
                }
                C21419518s5 c21419518s55 = this.LIZ;
                CodeBlockConfig codeBlockConfig6 = c21419518s55.LIZJ.LJJIJLIJ;
                if (codeBlockConfig6 == null || (codeStyle = codeBlockConfig6.codeStyle) == null) {
                    codeStyle = CodeStyle.NORMAL;
                }
                if (codeBlockConfig6 != null && (num6 = codeBlockConfig6.blockBorderColor) != null) {
                    iLIZ10 = num6.intValue();
                } else {
                    iLIZ10 = C446980Hfs.LIZ(c21419518s55.LIZ, R.color.rz);
                }
                CodeBlockConfig codeBlockConfig7 = this.LIZ.LIZJ.LJJIJLIJ;
                if (codeBlockConfig7 != null && (num5 = codeBlockConfig7.blockBorderWidth) != null) {
                    iLIZ11 = num5.intValue();
                } else {
                    iLIZ11 = C445120Hcs.LIZ(1);
                }
                CodeBlockConfig codeBlockConfig8 = this.LIZ.LIZJ.LJJIJLIJ;
                if (codeBlockConfig8 != null && codeBlockConfig8.codeTextSize > 0) {
                    if (codeBlockConfig8 != null) {
                        numValueOf2 = Integer.valueOf(codeBlockConfig8.codeTextSize);
                    } else {
                        numValueOf2 = null;
                    }
                    iLIZ12 = numValueOf2.intValue();
                } else {
                    iLIZ12 = C445120Hcs.LIZ(14);
                }
                CodeBlockConfig codeBlockConfig9 = this.LIZ.LIZJ.LJJIJLIJ;
                if (codeBlockConfig9 != null) {
                    f5 = codeBlockConfig9.blockCodeTextLineSpace;
                } else {
                    f5 = 1.5f;
                }
                c21435318ud.LIZ(C21440218vQ.class, new InterfaceC21446318wP(iLIZ7, fLIZIZ2, z9, z10, c21408618qK2, i6, iLIZ8, iLIZ9, codeStyle, iLIZ10, iLIZ11, iLIZ12, f5) { // from class: X.18qU
                    public final int LIZ;
                    public final float LIZIZ;
                    public final boolean LIZJ;
                    public final boolean LIZLLL;
                    public final C21408618qK LJ;
                    public final int LJFF;
                    public final int LJI;
                    public final int LJII;
                    public final CodeStyle LJIIIIZZ;
                    public final int LJIIIZ;
                    public final int LJIIJ;
                    public final int LJIIJJI;
                    public final float LJIIL;

                    @Override // X.InterfaceC21446318wP
                    public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                        int iIntValue;
                        if (this.LIZLLL) {
                            C448860Hiu c448860Hiu = c21432118u7.LIZ;
                            Integer num11 = (Integer) c14s7.LIZJ(C21409718qV.LIZ);
                            Integer num12 = (Integer) c14s7.LIZJ(C21409718qV.LIZIZ);
                            int i7 = this.LIZ;
                            float f7 = this.LIZIZ;
                            C21409518qT c21409518qT = new C21409518qT(this.LIZJ, (C21408918qN) c14s7.LIZJ(C21409718qV.LIZJ), this.LJ, this.LJII);
                            Map mapLJ = (Map) c14s7.LIZJ(C21409718qV.LJ);
                            if (mapLJ == null) {
                                mapLJ = C2097608Jq.LJ();
                            }
                            Integer num13 = (Integer) c14s7.LIZJ(C21409718qV.LIZLLL);
                            if (num13 != null) {
                                iIntValue = num13.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            return new C21409218qQ(c448860Hiu, new C445110Hcr(num11, num12, i7, f7, c21409518qT, new C21409418qS(mapLJ, iIntValue, this.LJI)), this.LJFF);
                        }
                        if (this.LJIIIIZZ == CodeStyle.BORDER) {
                            return new C445020Hci(c21432118u7.LIZ, new C445110Hcr((Integer) c14s7.LIZJ(C21409718qV.LIZ), (Integer) c14s7.LIZJ(C21409718qV.LIZIZ), this.LIZ, this.LIZIZ), this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL);
                        }
                        return new C445030Hcj(c21432118u7.LIZ, new C445110Hcr((Integer) c14s7.LIZJ(C21409718qV.LIZ), (Integer) c14s7.LIZJ(C21409718qV.LIZIZ), this.LIZ, this.LIZIZ));
                    }

                    {
                        this.LIZ = iLIZ7;
                        this.LIZIZ = fLIZIZ2;
                        this.LIZJ = z9;
                        this.LIZLLL = z10;
                        this.LJ = c21408618qK2;
                        this.LJFF = i6;
                        this.LJI = iLIZ8;
                        this.LJII = iLIZ9;
                        this.LJIIIIZZ = codeStyle;
                        this.LJIIIZ = iLIZ10;
                        this.LJIIJ = iLIZ11;
                        this.LJIIJJI = iLIZ12;
                        this.LJIIL = f5;
                    }
                });
                C21419518s5 c21419518s56 = this.LIZ;
                TableConfig tableConfig2 = c21419518s56.LIZJ.LJJIL;
                if (tableConfig2 != null && (num4 = tableConfig2.tableTitleBgColor) != null) {
                    iLIZ13 = num4.intValue();
                } else {
                    iLIZ13 = C446980Hfs.LIZ(c21419518s56.LIZ, R.color.rz);
                }
                final float fLIZIZ3 = C445120Hcs.LIZIZ(8);
                C21419518s5 c21419518s57 = this.LIZ;
                TableConfig tableConfig3 = c21419518s57.LIZJ.LJJIL;
                if (tableConfig3 != null && (num3 = tableConfig3.tableTitleBorderColor) != null) {
                    iLIZ14 = num3.intValue();
                } else {
                    iLIZ14 = C446980Hfs.LIZ(c21419518s57.LIZ, R.color.s0);
                }
                C21419518s5 c21419518s58 = this.LIZ;
                TableConfig tableConfig4 = c21419518s58.LIZJ.LJJIL;
                if (tableConfig4 != null && (num2 = tableConfig4.tableTitleBottomBorderColor) != null) {
                    iLIZ15 = num2.intValue();
                } else {
                    iLIZ15 = C446980Hfs.LIZ(c21419518s58.LIZ, R.color.s0);
                }
                final Integer numValueOf4 = Integer.valueOf(iLIZ15);
                TableConfig tableConfig5 = this.LIZ.LIZJ.LJJIL;
                if (tableConfig5 != null) {
                    f6 = tableConfig5.tableTitleBottomBorderWidth;
                } else {
                    f6 = null;
                }
                c21435318ud.LIZ(C21428118tT.class, new InterfaceC21446318wP(iLIZ13, fLIZIZ3, iLIZ14, numValueOf4, f6) { // from class: X.18sE
                    public final int LIZ;
                    public final float LIZIZ;
                    public final int LIZJ;
                    public final Integer LIZLLL;
                    public final Float LJ;

                    @Override // X.InterfaceC21446318wP
                    public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                        return new C445010Hch(c21432118u7.LIZ, this.LIZIZ, this.LIZ, (Integer) c14s7.LIZJ(C21420718sH.LIZ), this.LIZJ, this.LIZLLL, this.LJ);
                    }

                    {
                        this.LIZ = iLIZ13;
                        this.LIZIZ = fLIZIZ3;
                        this.LIZJ = iLIZ14;
                        this.LIZLLL = numValueOf4;
                        this.LJ = f6;
                    }
                });
                c21435318ud.LIZ(C21438718vB.class, new C21416818re(this.LIZ.LIZJ) { // from class: X.18rd
                    public final C21419418s4 LIZ;

                    {
                        this.LIZ = c21419418s4;
                    }

                    @Override // X.C21416818re, X.InterfaceC21446318wP
                    public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                        C21419418s4 c21419418s46 = this.LIZ;
                        if (c21419418s46 != null) {
                            if (c21419418s46.LJJJJLI != null) {
                                return new MetricAffectingSpan(this.LIZ.LJJJJLI) { // from class: X.18rZ
                                    public final Typeface LL;

                                    {
                                        this.LL = typeface;
                                    }

                                    @Override // android.text.style.CharacterStyle
                                    public final void updateDrawState(TextPaint textPaint) {
                                        if (textPaint != null) {
                                            textPaint.setTypeface(this.LL);
                                        }
                                    }

                                    @Override // android.text.style.MetricAffectingSpan
                                    public final void updateMeasureState(TextPaint textPaint) {
                                        textPaint.setTypeface(this.LL);
                                    }
                                };
                            }
                            if (c21419418s46 != null && c21419418s46.LJJJ) {
                                return null;
                            }
                        }
                        return new C21416618rc();
                    }
                });
                InlineCodeConfig inlineCodeConfig = this.LIZ.LIZJ.LJJJJI;
                if (inlineCodeConfig != null) {
                    c21435318ud.LIZ(C21437518uz.class, new InterfaceC21446318wP(inlineCodeConfig) { // from class: X.18lk
                        public final InlineCodeConfig LIZ;

                        {
                            this.LIZ = inlineCodeConfig;
                        }

                        @Override // X.InterfaceC21446318wP
                        public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                            return new ReplacementSpan(c21432118u7.LIZ, this.LIZ) { // from class: X.0Hcl
                                public final C448860Hiu LL;
                                public final InlineCodeConfig LLILLJJLI;
                                public final Paint LLILLL = new Paint(1);
                                public final Paint LLILZ = new Paint(1);
                                public final Path LLILZIL = new Path();
                                public final RectF LLILZLL = new RectF();
                                public final List<String> LLIZ = new ArrayList();
                                public final List<Float> LLIZLLLIL = new ArrayList();

                                {
                                    this.LL = c448860Hiu;
                                    this.LLILLJJLI = inlineCodeConfig;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
                                /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
                                @Override // android.text.style.ReplacementSpan
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final int getSize(android.graphics.Paint r12, java.lang.CharSequence r13, int r14, int r15, android.graphics.Paint.FontMetricsInt r16) {
                                    /*
                                        Method dump skipped, instruction units count: 365
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C445050Hcl.getSize(android.graphics.Paint, java.lang.CharSequence, int, int, android.graphics.Paint$FontMetricsInt):int");
                                }

                                @Override // android.text.style.ReplacementSpan
                                public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f7, int i9, int i10, int i11, Paint paint) {
                                    float[] fArr;
                                    float f8;
                                    float textSize = paint.getTextSize() * 1.5f;
                                    int i12 = paint.getFontMetricsInt().bottom - paint.getFontMetricsInt().top;
                                    float f9 = 2;
                                    float textSize2 = (((paint.getTextSize() - this.LLILZ.getTextSize()) * 1.5f) / f9) - this.LLILLJJLI.paddingTop;
                                    float textSize3 = (((paint.getTextSize() - this.LLILZ.getTextSize()) * 1.5f) / f9) - this.LLILLJJLI.paddingBottom;
                                    int size = ((ArrayList) this.LLIZ).size();
                                    for (int i13 = 0; i13 < size; i13++) {
                                        float fFloatValue = ((Number) ListProtector.get(this.LLIZLLLIL, i13)).floatValue();
                                        String str2 = (String) ListProtector.get(this.LLIZ, i13);
                                        float f10 = i9 + (i13 * textSize);
                                        this.LLILZLL.set(f7, f10 + textSize2, fFloatValue + f7, (f10 + textSize) - textSize3);
                                        Paint paint2 = this.LLILLL;
                                        int iLIZ17 = this.LL.LJIIL;
                                        if (iLIZ17 == 0) {
                                            iLIZ17 = AbstractC445040Hck.LIZ(paint.getColor(), 25);
                                        }
                                        paint2.setColor(iLIZ17);
                                        if (((ArrayList) this.LLIZ).size() > 1) {
                                            if (i13 == 0) {
                                                fArr = new float[]{C445120Hcs.LIZIZ(4), C445120Hcs.LIZIZ(4), 0.0f, 0.0f, 0.0f, 0.0f, C445120Hcs.LIZIZ(4), C445120Hcs.LIZIZ(4)};
                                            } else if (i13 == ((ArrayList) this.LLIZ).size() - 1) {
                                                fArr = new float[]{0.0f, 0.0f, C445120Hcs.LIZIZ(4), C445120Hcs.LIZIZ(4), C445120Hcs.LIZIZ(4), C445120Hcs.LIZIZ(4), 0.0f, 0.0f};
                                            } else {
                                                fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                                            }
                                        } else {
                                            fArr = new float[]{C445120Hcs.LIZIZ(4), C445120Hcs.LIZIZ(4), C445120Hcs.LIZIZ(4), C445120Hcs.LIZIZ(4), C445120Hcs.LIZIZ(4), C445120Hcs.LIZIZ(4), C445120Hcs.LIZIZ(4), C445120Hcs.LIZIZ(4)};
                                        }
                                        this.LLILZIL.reset();
                                        this.LLILZIL.addRoundRect(this.LLILZLL, fArr, Path.Direction.CW);
                                        canvas.drawPath(this.LLILZIL, this.LLILLL);
                                        this.LL.LIZIZ(this.LLILZ);
                                        float fAbs = f10 + ((textSize - i12) / f9) + Math.abs(this.LLILZ.getFontMetricsInt().top);
                                        if (i13 == 0) {
                                            f8 = this.LLILLJJLI.paddingStart + f7;
                                        } else {
                                            f8 = f7;
                                        }
                                        canvas.drawText(str2, f8, fAbs, this.LLILZ);
                                    }
                                }
                            };
                        }
                    });
                }
                TaskListConfig taskListConfig = this.LIZ.LIZJ.LJJJJIZL;
                if (taskListConfig != null) {
                    c21435318ud.LIZ(C21427618tO.class, new InterfaceC21446318wP(taskListConfig) { // from class: X.18lg
                        public final TaskListConfig LIZ;

                        {
                            this.LIZ = taskListConfig;
                        }

                        @Override // X.InterfaceC21446318wP
                        public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                            Drawable drawable;
                            if (((Boolean) c14s7.LIZIZ(AbstractC21379918lh.LIZ, Boolean.FALSE)).booleanValue()) {
                                drawable = this.LIZ.selectedDrawable;
                            } else {
                                drawable = this.LIZ.unselectedDrawable;
                            }
                            return new LeadingMarginSpan(drawable, this.LIZ.textMargin) { // from class: X.0Hd0
                                public final Drawable LL;
                                public final int LLILLJJLI;

                                @Override // android.text.style.LeadingMarginSpan
                                public final int getLeadingMargin(boolean z13) {
                                    return this.LL.getIntrinsicWidth() + this.LLILLJJLI;
                                }

                                {
                                    this.LL = drawable;
                                    this.LLILLJJLI = i;
                                }

                                @Override // android.text.style.LeadingMarginSpan
                                public final void drawLeadingMargin(Canvas canvas, Paint paint, int i7, int i8, int i9, int i10, int i11, CharSequence charSequence, int i12, int i13, boolean z13, Layout layout) {
                                    if (canvas != null && z13 && AbstractC445160Hcw.LIZ(charSequence, this, i12)) {
                                        int iSave = canvas.save();
                                        try {
                                            int intrinsicWidth = this.LL.getIntrinsicWidth();
                                            int intrinsicHeight = this.LL.getIntrinsicHeight();
                                            int i14 = i11 - i9;
                                            int i15 = i9 + ((i14 - intrinsicHeight) / 2);
                                            this.LL.setBounds(i7, i15, (i8 * intrinsicWidth) + i7, Math.min(intrinsicHeight, i14) + i15);
                                            this.LL.draw(canvas);
                                            canvas.restoreToCount(iSave);
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            canvas.restoreToCount(iSave);
                                            throw th;
                                        }
                                    }
                                }
                            };
                        }
                    });
                }
            }

            @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
            public final void LJI(C448870Hiv c448870Hiv) {
                boolean z9;
                int iLIZ7;
                int iLIZ8;
                int iLIZ9;
                int i5;
                C21419518s5 c21419518s5 = this.LIZ;
                C21419418s4 c21419418s42 = c21419518s5.LIZJ;
                int iLIZ10 = c21419418s42.LJJIIZ;
                if (iLIZ10 == 0) {
                    Context context2 = c21419518s5.LIZ;
                    if (c21419418s42.LJFF) {
                        i5 = R.color.ej;
                    } else {
                        i5 = R.color.t0;
                    }
                    iLIZ10 = C446980Hfs.LIZ(context2, i5);
                }
                c448870Hiv.LIZ = iLIZ10;
                int i6 = 0;
                c448870Hiv.LIZIZ = false;
                C21419518s5 c21419518s52 = this.LIZ;
                Integer numValueOf = Integer.valueOf(c21419518s52.LIZJ.LJIIL);
                if (numValueOf.intValue() > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Integer num = null;
                if (z9) {
                    c448870Hiv.LJIIIZ = numValueOf.intValue();
                } else {
                    c448870Hiv.LJIIIZ = 18;
                }
                C21419418s4 c21419418s43 = c21419518s52.LIZJ;
                c448870Hiv.LJIIJ = c21419418s43.LJJIZ;
                c448870Hiv.LJIJJ = c21419418s43.LJJJJJL;
                Integer numValueOf2 = Integer.valueOf(c21419418s43.LJIILIIL);
                if (numValueOf2.intValue() > 0) {
                    c448870Hiv.LJIIIIZZ = numValueOf2.intValue();
                }
                Integer numValueOf3 = Integer.valueOf(c21419518s52.LIZJ.LJIILJJIL);
                if (numValueOf3.intValue() > 0) {
                    c448870Hiv.LIZJ = numValueOf3.intValue();
                }
                C21419518s5 c21419518s53 = this.LIZ;
                C21419418s4 c21419418s44 = c21419518s53.LIZJ;
                c448870Hiv.LJII = c21419418s44.LJIIJJI;
                c448870Hiv.LJI = 0.5f;
                Integer num2 = c21419418s44.LJJJIL;
                if (num2 != null) {
                    iLIZ7 = num2.intValue();
                } else {
                    iLIZ7 = C446980Hfs.LIZ(c21419518s53.LIZ, R.color.rz);
                }
                c448870Hiv.LJIIZILJ = iLIZ7;
                Integer num3 = this.LIZ.LIZJ.LJJJJ;
                if (num3 != null) {
                    iLIZ8 = num3.intValue();
                } else {
                    iLIZ8 = C445120Hcs.LIZ(1);
                }
                c448870Hiv.LJIJ = iLIZ8;
                c448870Hiv.LJIIL = C446980Hfs.LIZ(this.LIZ.LIZ, R.color.ry);
                c448870Hiv.LJIILIIL = C446980Hfs.LIZ(this.LIZ.LIZ, R.color.ry);
                c448870Hiv.LJIIJJI = C446980Hfs.LIZ(this.LIZ.LIZ, R.color.ru);
                CodeBlockConfig codeBlockConfig = this.LIZ.LIZJ.LJJIJLIJ;
                if (codeBlockConfig != null && codeBlockConfig.blockMargin != null) {
                    if (codeBlockConfig != null) {
                        num = codeBlockConfig.blockMargin;
                    }
                    iLIZ9 = num.intValue();
                } else {
                    iLIZ9 = C445120Hcs.LIZ(16);
                }
                c448870Hiv.LJIILJJIL = iLIZ9;
                CodeBlockConfig codeBlockConfig2 = this.LIZ.LIZJ.LJJIJLIJ;
                if (codeBlockConfig2 != null) {
                    Integer.valueOf(codeBlockConfig2.codeTextSize).intValue();
                }
                C21419418s4 c21419418s45 = this.LIZ.LIZJ;
                CodeBlockConfig codeBlockConfig3 = c21419418s45.LJJIJLIJ;
                if (codeBlockConfig3 != null) {
                    i6 = codeBlockConfig3.codeTextSize;
                }
                c448870Hiv.LJIILL = i6;
                int i7 = c21419418s45.LJIIIZ;
                if (i7 != 0) {
                    c448870Hiv.LJFF = i7;
                }
                C21380418lm c21380418lm = c21419418s45.LJJI;
                if (c21380418lm != null) {
                    c448870Hiv.LIZLLL = c21380418lm.LIZIZ;
                    c448870Hiv.LJ = c21380418lm.LIZJ;
                }
            }

            @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
            public final void LJIIJ(C21434618uW c21434618uW) {
                c21434618uW.LIZLLL = new InterfaceC445270Hd7() { // from class: X.18sG
                    @Override // X.InterfaceC445270Hd7
                    public final void LIZ(View view, String str2) {
                        C14S5<Context> c14s52 = C21379618le.LIZ;
                    }
                };
                final C21419518s5 c21419518s5 = this.LIZ;
                final InterfaceC1631630sYr<? super CharSequence, ? super Boolean, ? super Map<String, ? extends Object>, ? super Boolean, ? extends InterfaceC418280Gag> interfaceC1631630sYr = C21379618le.LJ;
                if (interfaceC1631630sYr != null) {
                    c21434618uW.LJ = new InterfaceC21446418wQ() { // from class: X.18sB
                        @Override // X.InterfaceC21446418wQ
                        public final InterfaceC418280Gag LIZ(CharSequence charSequence) {
                            InterfaceC1631630sYr<CharSequence, Boolean, Map<String, ? extends Object>, Boolean, InterfaceC418280Gag> interfaceC1631630sYr2 = interfaceC1631630sYr;
                            Boolean boolValueOf = Boolean.valueOf(c21419518s5.LIZJ.LJJIJIL);
                            C21419418s4 c21419418s42 = c21419518s5.LIZJ;
                            return interfaceC1631630sYr2.invoke(charSequence, boolValueOf, c21419418s42.LJJJJLL, Boolean.valueOf(c21419418s42.LJJJJJL));
                        }
                    };
                }
            }

            @Override // X.AbstractC21425218t0
            public final void LJIIJJI(C21431218ty c21431218ty) {
                boolean z9 = this.LIZ.LIZIZ;
                C448860Hiu c448860Hiu = c21431218ty.LIZ.LIZ;
                float f4 = c448860Hiu.LJI;
                if (f4 == 1.0f && c448860Hiu.LJII == 1.0f) {
                    return;
                }
                c21431218ty.LJIJI(0, new C0H14(f4, c448860Hiu.LJII, z9));
            }

            @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
            public final void LJFF(TextView textView, Spanned spanned) {
                Object[] spans;
                if (this.LIZ.LIZJ.LJJJJJ != null && (spanned instanceof Spanned) && (spans = spanned.getSpans(0, spanned.length(), C445300HdA.class)) != null) {
                    TextPaint paint = textView.getPaint();
                    C089E c089e = new C089E(spans);
                    while (c089e.hasNext()) {
                        C445300HdA c445300HdA = (C445300HdA) c089e.next();
                        c445300HdA.LLILZLL = (int) (paint.measureText(c445300HdA.LL) + 0.5f);
                    }
                }
            }
        });
        this.LJI = c21432218u8.LIZ();
    }
}

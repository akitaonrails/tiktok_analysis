package X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0HcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444830HcP {
    public static boolean LJIIJJI;
    public static final LruCache<Integer, Layout> LJIIL;
    public C444890HcV LIZ;
    public final C444840HcQ LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final C01GW LJI;
    public int LJII;
    public float LJIIIIZZ;
    public Float LJIIIZ;
    public boolean LJIIJ;

    static {
        new C431830GwX();
        LJIIL = new LruCache<>(100);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01dc A[PHI: r8
      0x01dc: PHI (r8v1 int) = (r8v0 int), (r8v8 int) binds: [B:39:0x008f, B:50:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.Layout LIZLLL() {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C444830HcP.LIZLLL():android.text.Layout");
    }

    public final void LJFF() {
        if (this.LIZJ) {
            C444890HcV c444890HcV = new C444890HcV();
            c444890HcV.LIZ = this.LJIIJ;
            c444890HcV.set((TextPaint) this.LIZ);
            this.LIZ = c444890HcV;
            this.LIZJ = false;
        }
    }

    public final void LJI() {
        CharSequence charSequence;
        if (!LJIIJJI || (charSequence = this.LIZIZ.LIZ) == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int i = 0;
        while (i < spannableStringBuilder.length() - 1) {
            char cCharAt = spannableStringBuilder.charAt(i);
            int i2 = i + 1;
            char cCharAt2 = spannableStringBuilder.charAt(i2);
            if (8294 <= cCharAt && cCharAt < 8297 && (cCharAt2 == ' ' || cCharAt2 == '\t')) {
                i2 = i + 2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(cCharAt);
                sbLIZ.append((char) 8288);
                sbLIZ.append(cCharAt2);
                spannableStringBuilder = spannableStringBuilder.replace(i, i2, (CharSequence) C2188811AlT.LIZIZ(sbLIZ));
            }
            i = i2;
        }
        this.LIZIZ.LIZ = spannableStringBuilder;
    }

    public C444830HcP() {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.setAntiAlias(true);
        this.LIZ = c444890HcV;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int color = c444890HcV.getColor();
        C444890HcV c444890HcV2 = this.LIZ;
        this.LIZIZ = new C444840HcQ(alignment, textDirectionHeuristic, color, ((TextPaint) c444890HcV2).linkColor, c444890HcV2.getTypeface());
        this.LJI = C452501pT.LIZIZ(new C444850HcR());
    }

    public final Layout LIZIZ() {
        LJI();
        this.LJII = 0;
        this.LJIIIIZZ = 0.0f;
        return LJ(LIZLLL());
    }

    public final void LIZ(Layout.Alignment alignment) {
        this.LIZIZ.LJI = alignment;
    }

    public final Layout LJ(Layout layout) {
        int lineCount;
        if (this.LJFF && this.LIZIZ.LJII == TextUtils.TruncateAt.END && (lineCount = layout.getLineCount()) == this.LIZIZ.LIZIZ) {
            int i = lineCount - 1;
            if (layout.getEllipsisCount(i) > 10) {
                int lineStart = layout.getLineStart(i) + layout.getEllipsisStart(i);
                C444840HcQ c444840HcQ = this.LIZIZ;
                if (c444840HcQ.LIZ != null) {
                    c444840HcQ.LIZ = layout.getText().subSequence(0, lineStart + 2);
                    return LIZLLL();
                }
                return layout;
            }
            return layout;
        }
        return layout;
    }

    public final void LJII(int i) {
        LJFF();
        this.LIZ.LIZ(i);
        C444840HcQ c444840HcQ = this.LIZIZ;
        c444840HcQ.LJIJ = i;
        c444840HcQ.LJIILLIIL = this.LIZ.getLetterSpacing();
        LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1697600uHG.LIZJ(i, true, this.LJIIJ).LIZIZ))));
    }

    public final void LJIIIIZZ(int i) {
        LJFF();
        this.LIZIZ.LJIJI = i;
    }

    public final void LJIIIZ(int i) {
        C444840HcQ c444840HcQ = this.LIZIZ;
        if (i < 1) {
            i = 1;
        }
        c444840HcQ.LIZIZ = i;
    }

    public final void LJIIJ(int i) {
        this.LIZIZ.LJ = i;
    }

    public final void LJIIJJI(boolean z) {
        this.LJIIJ = z;
        this.LIZ.LIZ = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(java.lang.CharSequence r3) {
        /*
            r2 = this;
            X.0HcQ r0 = r2.LIZIZ
            java.lang.CharSequence r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto Lb
            return
        Lb:
            boolean r0 = androidx.emoji2.text.e.LJ()
            if (r0 == 0) goto L2b
            androidx.emoji2.text.e r0 = androidx.emoji2.text.e.LIZ()
            int r1 = r0.LIZJ()
            r0 = 1
            if (r1 != r0) goto L2b
        L1c:
            X.0HcQ r1 = r2.LIZIZ
            if (r0 == 0) goto L28
            androidx.emoji2.text.e r0 = androidx.emoji2.text.e.LIZ()
            java.lang.CharSequence r3 = r0.LJIIIZ(r3)
        L28:
            r1.LIZ = r3
            return
        L2b:
            r0 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C444830HcP.LJIILIIL(java.lang.CharSequence):void");
    }

    public final void LJIILJJIL(int i) {
        LJFF();
        this.LIZIZ.LJIIJ = i;
        this.LIZ.setColor(i);
    }

    public final void LJIILL(int i) {
        int i2;
        if (i <= 0) {
            i2 = 0;
        } else {
            i2 = 1073741824;
        }
        C444840HcQ c444840HcQ = this.LIZIZ;
        c444840HcQ.LIZLLL = i;
        c444840HcQ.LIZJ = i2;
    }

    public final void LJIIL(float f, float f2, float f3, int i) {
        LJFF();
        C444840HcQ c444840HcQ = this.LIZIZ;
        c444840HcQ.LJIILJJIL = f;
        c444840HcQ.LJIIL = f2;
        c444840HcQ.LJIILIIL = f3;
        c444840HcQ.LJIILL = i;
        this.LIZ.setShadowLayer(f, f2, f3, i);
    }

    public static Layout LIZJ(C444830HcP c444830HcP, float f, boolean z, List list, int i) {
        int iIntValue;
        int lineCount;
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            list = C13BV.INSTANCE;
        }
        c444830HcP.LJI();
        c444830HcP.LJII = 0;
        c444830HcP.LJIIIIZZ = 0.0f;
        c444830HcP.LJIIIZ = null;
        if (!list.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = list.iterator();
            int i2 = 0;
            Integer numValueOf = null;
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        Pair pair = (Pair) next;
                        int iIntValue2 = ((Number) pair.getFirst()).intValue();
                        int iIntValue3 = ((Number) pair.getSecond()).intValue();
                        while (iIntValue2 <= iIntValue3) {
                            int i4 = (iIntValue2 + iIntValue3) / 2;
                            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i4));
                            if (num != null) {
                                lineCount = num.intValue();
                            } else {
                                c444830HcP.LJIIIIZZ = C418440Gaw.LIZIZ(Integer.valueOf(i4));
                                Layout layoutLIZLLL = c444830HcP.LIZLLL();
                                linkedHashMap.put(Integer.valueOf(i4), Integer.valueOf(layoutLIZLLL.getLineCount()));
                                lineCount = layoutLIZLLL.getLineCount();
                            }
                            if (lineCount <= i3) {
                                iIntValue2 = i4 + 1;
                                numValueOf = Integer.valueOf(i4);
                            } else {
                                iIntValue3 = i4 - 1;
                            }
                        }
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                            break;
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                } else {
                    iIntValue = ((Number) ((Pair) ListProtector.get(list, list.size() - 1)).getFirst()).intValue();
                    break;
                }
            }
            c444830HcP.LJIIIIZZ = C418440Gaw.LIZIZ(Integer.valueOf(iIntValue));
        }
        Layout layoutLIZLLL2 = c444830HcP.LIZLLL();
        int lineCount2 = layoutLIZLLL2.getLineCount();
        if (f != 0.0f && c444830HcP.LIZIZ.LJ != Integer.MAX_VALUE && lineCount2 > 1) {
            C531650Kt9 it3 = C13LZ.LJIILJJIL(0, lineCount2).iterator();
            int lineWidth = 0;
            while (it3.LLILLL) {
                lineWidth += (int) (c444830HcP.LIZIZ.LJ - layoutLIZLLL2.getLineWidth(it3.nextInt()));
            }
            C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
            int i5 = c444840HcQ.LJ;
            int i6 = i5 - (lineWidth / lineCount2);
            int i7 = c444840HcQ.LJFF;
            if (i6 < i7) {
                i6 = i7;
            }
            int i8 = i5;
            while (i6 <= i5) {
                int i9 = (i6 + i5) / 2;
                c444830HcP.LJII = i9;
                if (c444830HcP.LIZLLL().getLineCount() == lineCount2) {
                    i8 = i5;
                    i5 = i9 - 1;
                } else {
                    i6 = i9 + 1;
                    i8 = i6;
                }
            }
            int i10 = c444830HcP.LIZIZ.LJ;
            c444830HcP.LJII = (int) Math.ceil(i10 - ((i10 - i8) * f));
            layoutLIZLLL2 = c444830HcP.LIZLLL();
        }
        if (z) {
            C531650Kt9 it4 = C13LZ.LJIILJJIL(0, lineCount2).iterator();
            if (it4.LLILLL) {
                int width = (int) (layoutLIZLLL2.getWidth() - layoutLIZLLL2.getLineWidth(it4.nextInt()));
                while (it4.LLILLL) {
                    int width2 = (int) (layoutLIZLLL2.getWidth() - layoutLIZLLL2.getLineWidth(it4.nextInt()));
                    if (width > width2) {
                        width = width2;
                    }
                }
                if (width > 0) {
                    c444830HcP.LJII = layoutLIZLLL2.getWidth() - width;
                    layoutLIZLLL2 = c444830HcP.LIZLLL();
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        return c444830HcP.LJ(layoutLIZLLL2);
    }
}

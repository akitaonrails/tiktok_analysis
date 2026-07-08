package X;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1CRB, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CRB extends ViewGroup {
    public static Boolean LLILZIL;
    public static Map<String, Integer> LLILZLL;
    public static int LLIZ = 251789312;
    public static final C1CR2 LLIZLLLIL;
    public static final C1CR1 LLJ;
    public static final C1CR0 LLJI;
    public static final C1CR3 LLJIJIL;
    public static final C1CR4 LLJILJIL;
    public static final C1CR5 LLJILJILJ;
    public static final C1CR6 LLJILLL;
    public static final C2230301CQy LLJJ;
    public static final C2230311CQz LLJJI;
    public static final C1CRA LLJJIII;
    public static final C1CRP LLJJIJI;
    public static final List<AbstractC2230291CQx> LLJJIJIIJIL;
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;

    public C1CRB(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [X.1CQz] */
    /* JADX WARN: Type inference failed for: r23v0, types: [X.1CQy] */
    /* JADX WARN: Type inference failed for: r24v0, types: [X.1CR6] */
    /* JADX WARN: Type inference failed for: r25v0, types: [X.1CR5] */
    /* JADX WARN: Type inference failed for: r26v0, types: [X.1CR4] */
    /* JADX WARN: Type inference failed for: r27v0, types: [X.1CR3] */
    /* JADX WARN: Type inference failed for: r28v0, types: [X.1CR0] */
    /* JADX WARN: Type inference failed for: r29v0, types: [X.1CR1] */
    /* JADX WARN: Type inference failed for: r31v0, types: [X.1CR2] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.1CRP] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.1CRA] */
    static {
        AbstractC2230291CQx abstractC2230291CQx = new AbstractC2230291CQx() { // from class: X.1CRb
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return f * f2;
            }
        };
        AbstractC2230291CQx abstractC2230291CQx2 = new AbstractC2230291CQx() { // from class: X.1CRa
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return f / f2;
            }
        };
        AbstractC2230291CQx abstractC2230291CQx3 = new AbstractC2230291CQx() { // from class: X.1CRS
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                int myHeight;
                if (i2 == 0) {
                    if (c1crb.getMyWidth() != -1) {
                        myHeight = c1crb.getMyWidth();
                    } else {
                        return Float.NaN;
                    }
                } else if (c1crb.getMyHeight() != -1) {
                    myHeight = c1crb.getMyHeight();
                } else {
                    return Float.NaN;
                }
                return myHeight * f * 0.01f;
            }
        };
        AbstractC2230291CQx abstractC2230291CQx4 = new AbstractC2230291CQx() { // from class: X.1CRW
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return f + f2;
            }
        };
        AbstractC2230291CQx abstractC2230291CQx5 = new AbstractC2230291CQx() { // from class: X.1CRc
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return f - f2;
            }
        };
        AbstractC2230291CQx abstractC2230291CQx6 = new AbstractC2230291CQx() { // from class: X.1CR8
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                if (f == f) {
                    return f == 0.0f ? 1.0f : 0.0f;
                }
                return Float.NaN;
            }
        };
        AbstractC2230291CQx abstractC2230291CQx7 = new AbstractC2230291CQx() { // from class: X.1CRZ
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                if (f == f && f2 == f2) {
                    return f < f2 ? 1.0f : 0.0f;
                }
                return Float.NaN;
            }
        };
        ?? r31 = new AbstractC2230291CQx() { // from class: X.1CR2
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                if (f == f && f2 == f2) {
                    return f <= f2 ? 1.0f : 0.0f;
                }
                return Float.NaN;
            }
        };
        LLIZLLLIL = r31;
        AbstractC2230291CQx abstractC2230291CQx8 = new AbstractC2230291CQx() { // from class: X.1CRX
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                if (f == f && f2 == f2) {
                    return f > f2 ? 1.0f : 0.0f;
                }
                return Float.NaN;
            }
        };
        ?? r29 = new AbstractC2230291CQx() { // from class: X.1CR1
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                if (f == f && f2 == f2) {
                    return f >= f2 ? 1.0f : 0.0f;
                }
                return Float.NaN;
            }
        };
        LLJ = r29;
        ?? r28 = new AbstractC2230291CQx() { // from class: X.1CR0
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                if (f == f && f2 == f2) {
                    return f == f2 ? 1.0f : 0.0f;
                }
                return Float.NaN;
            }
        };
        LLJI = r28;
        ?? r27 = new AbstractC2230291CQx() { // from class: X.1CR3
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                if (f == f && f2 == f2) {
                    return f == f2 ? 0.0f : 1.0f;
                }
                return Float.NaN;
            }
        };
        LLJIJIL = r27;
        ?? r26 = new AbstractC2230291CQx() { // from class: X.1CR4
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                if (f == f && f2 == f2) {
                    return (f == 0.0f || f2 == 0.0f) ? 0.0f : 1.0f;
                }
                return Float.NaN;
            }
        };
        LLJILJIL = r26;
        ?? r25 = new AbstractC2230291CQx() { // from class: X.1CR5
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                if (f == f && f2 == f2) {
                    return (f == 0.0f && f2 == 0.0f) ? 0.0f : 1.0f;
                }
                return Float.NaN;
            }
        };
        LLJILJILJ = r25;
        ?? r24 = new AbstractC2230291CQx() { // from class: X.1CR6
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return Float.NaN;
            }
        };
        LLJILLL = r24;
        ?? r23 = new AbstractC2230291CQx() { // from class: X.1CQy
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return Float.NaN;
            }
        };
        LLJJ = r23;
        ?? r22 = new AbstractC2230291CQx() { // from class: X.1CQz
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return Float.NaN;
            }
        };
        LLJJI = r22;
        AbstractC2230291CQx abstractC2230291CQx9 = new AbstractC2230291CQx() { // from class: X.1CRG
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return TypedValue.applyDimension(2, f, c1crb.getResources().getDisplayMetrics());
            }
        };
        AbstractC2230291CQx abstractC2230291CQx10 = new AbstractC2230291CQx() { // from class: X.1CRH
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return TypedValue.applyDimension(1, f, c1crb.getResources().getDisplayMetrics());
            }
        };
        AbstractC2230291CQx abstractC2230291CQx11 = new AbstractC2230291CQx() { // from class: X.1CRL
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return TypedValue.applyDimension(1, f, c1crb.getResources().getDisplayMetrics());
            }
        };
        AbstractC2230291CQx abstractC2230291CQx12 = new AbstractC2230291CQx() { // from class: X.1CRK
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return TypedValue.applyDimension(0, f, c1crb.getResources().getDisplayMetrics());
            }
        };
        AbstractC2230291CQx abstractC2230291CQx13 = new AbstractC2230291CQx() { // from class: X.1CRJ
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return TypedValue.applyDimension(3, f, c1crb.getResources().getDisplayMetrics());
            }
        };
        AbstractC2230291CQx abstractC2230291CQx14 = new AbstractC2230291CQx() { // from class: X.1CRI
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return TypedValue.applyDimension(5, f, c1crb.getResources().getDisplayMetrics());
            }
        };
        AbstractC2230291CQx abstractC2230291CQx15 = new AbstractC2230291CQx() { // from class: X.1CRF
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return TypedValue.applyDimension(4, f, c1crb.getResources().getDisplayMetrics());
            }
        };
        AbstractC2230291CQx abstractC2230291CQx16 = new AbstractC2230291CQx() { // from class: X.1CRQ
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return Math.max(f, f2);
            }
        };
        AbstractC2230291CQx abstractC2230291CQx17 = new AbstractC2230291CQx() { // from class: X.1CRR
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return Math.min(f, f2);
            }
        };
        AbstractC2230291CQx abstractC2230291CQx18 = new AbstractC2230291CQx() { // from class: X.1CRV
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return (float) Math.rint(f);
            }
        };
        AbstractC2230291CQx abstractC2230291CQx19 = new AbstractC2230291CQx() { // from class: X.1CRN
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return (float) Math.ceil(f);
            }
        };
        AbstractC2230291CQx abstractC2230291CQx20 = new AbstractC2230291CQx() { // from class: X.1CRU
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return (float) Math.floor(f);
            }
        };
        AbstractC2230291CQx abstractC2230291CQx21 = new AbstractC2230291CQx() { // from class: X.1CRT
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return Math.abs(f);
            }
        };
        AbstractC2230291CQx abstractC2230291CQx22 = new AbstractC2230291CQx() { // from class: X.1CRd
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return f % f2;
            }
        };
        AbstractC2230291CQx abstractC2230291CQx23 = new AbstractC2230291CQx() { // from class: X.1CRO
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return (float) Math.pow(f, f2);
            }
        };
        AbstractC2230291CQx abstractC2230291CQx24 = new AbstractC2230291CQx() { // from class: X.1CRY
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return f;
            }
        };
        ?? r5 = new AbstractC2230291CQx() { // from class: X.1CRA
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return Float.NaN;
            }
        };
        LLJJIII = r5;
        ?? r4 = new AbstractC2230291CQx() { // from class: X.1CRP
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                int myHeight;
                if (i2 == 0) {
                    if (c1crb.getMyWidth() == -1) {
                        return Float.NaN;
                    }
                    myHeight = c1crb.getMyWidth();
                } else {
                    if (c1crb.getMyHeight() == -1) {
                        return Float.NaN;
                    }
                    myHeight = c1crb.getMyHeight();
                }
                return myHeight;
            }
        };
        LLJJIJI = r4;
        LLJJIJIIJIL = C1697810uHb.LJIIJJI(abstractC2230291CQx4, abstractC2230291CQx5, abstractC2230291CQx2, abstractC2230291CQx, abstractC2230291CQx3, abstractC2230291CQx6, abstractC2230291CQx7, r31, abstractC2230291CQx8, r29, r28, r27, r26, r25, r24, r23, r22, abstractC2230291CQx9, abstractC2230291CQx10, abstractC2230291CQx11, abstractC2230291CQx12, abstractC2230291CQx13, abstractC2230291CQx14, abstractC2230291CQx15, abstractC2230291CQx16, abstractC2230291CQx17, abstractC2230291CQx18, abstractC2230291CQx19, abstractC2230291CQx20, abstractC2230291CQx21, abstractC2230291CQx22, abstractC2230291CQx23, abstractC2230291CQx24, r5, r4, new AbstractC2230291CQx() { // from class: X.1CRM
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                return C1CRB.LLJJIJI.LIZ(c1crb, i, i2, f, f2);
            }
        }, new AbstractC2230291CQx() { // from class: X.1CRE
            @Override // X.AbstractC2230291CQx
            public final float LIZ(C1CRB c1crb, int i, int i2, float f, float f2) {
                int i3;
                View childAt = c1crb.getChildAt(i);
                C1CRC c1crc = (C1CRC) childAt.getLayoutParams();
                if (i2 == 0) {
                    if (c1crc.LJIILLIIL == -1) {
                        C1CRD.LIZJ(c1crb, childAt, c1crc, -2, ((ViewGroup.LayoutParams) c1crc).height);
                        c1crc.LJIIZILJ = -1;
                    }
                    i3 = c1crc.LJIILLIIL;
                    if (i3 == -1) {
                        return Float.NaN;
                    }
                } else {
                    if (c1crc.LJIIZILJ == -1) {
                        C1CRD.LIZJ(c1crb, childAt, c1crc, ((ViewGroup.LayoutParams) c1crc).width, -2);
                        c1crc.LJIILLIIL = -1;
                    }
                    i3 = c1crc.LJIIZILJ;
                    if (i3 == -1) {
                        return Float.NaN;
                    }
                }
                return i3;
            }
        });
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1CRC(-2);
    }

    public final int getMyHeight() {
        return this.LLILZ;
    }

    public final int getMyHeightMeasureSpec() {
        return this.LLILLJJLI;
    }

    public final int getMyWidth() {
        return this.LLILLL;
    }

    public final int getMyWidthMeasureSpec() {
        return this.LL;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1CRC;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1CRC(getContext(), attributeSet);
    }

    public final void setMyHeight(int i) {
        this.LLILZ = i;
    }

    public final void setMyHeightMeasureSpec(int i) {
        this.LLILLJJLI = i;
    }

    public final void setMyWidth(int i) {
        this.LLILLL = i;
    }

    public final void setMyWidthMeasureSpec(int i) {
        this.LL = i;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1CRC(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0273, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0274, code lost:
    
        if (r4 >= r5) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0276, code lost:
    
        r3 = getChildAt(r4);
        r2 = (X.C1CRC) r3.getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0282, code lost:
    
        if (r2.LJI == null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0284, code lost:
    
        r1 = r2.LJIILJJIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0288, code lost:
    
        if (r1 != r1) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x028a, code lost:
    
        r8 = 1073741824;
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.round(r1), 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0296, code lost:
    
        if (r2.LJII == null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0298, code lost:
    
        r1 = r2.LJIILL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x029c, code lost:
    
        if (r1 != r1) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x029e, code lost:
    
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.round(r1), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02a6, code lost:
    
        r3.measure(r7, r0);
        r1 = (int) r2.LJIILJJIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02b0, code lost:
    
        if (r1 == r3.getMeasuredWidth()) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02b2, code lost:
    
        if (r1 <= 0) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02b4, code lost:
    
        r2.LJIILJJIL = r3.getMeasuredWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02bb, code lost:
    
        r1 = (int) r2.LJIILL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02c2, code lost:
    
        if (r1 == r3.getMeasuredHeight()) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02c4, code lost:
    
        if (r1 <= 0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02c6, code lost:
    
        r2.LJIILL = r3.getMeasuredHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02cd, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02d0, code lost:
    
        r1 = ((android.view.ViewGroup.LayoutParams) r2).height;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02d3, code lost:
    
        if (r1 != (-2)) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02d5, code lost:
    
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r21.LLILZ, Integer.MIN_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x02df, code lost:
    
        if (r1 != (-1)) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x02e1, code lost:
    
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r21.LLILZ, 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x02ea, code lost:
    
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.round(r2.LIZJ()), 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x02f9, code lost:
    
        r8 = 1073741824;
        r1 = ((android.view.ViewGroup.LayoutParams) r2).width;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02fe, code lost:
    
        if (r1 != (-2)) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0300, code lost:
    
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r21.LLILLL, Integer.MIN_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x030a, code lost:
    
        if (r1 != (-1)) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x030c, code lost:
    
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r21.LLILLL, 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0313, code lost:
    
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.round(r2.LJI()), 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x03f4, code lost:
    
        setMeasuredDimension((r21.LLILLL + r20) + r19, (r21.LLILZ + r18) + r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0403, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0213  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1CRB.onMeasure(int, int):void");
    }

    public C1CRB(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        if (isInEditMode()) {
            LLILZIL = Boolean.TRUE;
            if (LLILZLL == null) {
                LLILZLL = new LinkedHashMap();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C1CRC c1crc = (C1CRC) childAt.getLayoutParams();
                if (getLayoutDirection() == 1) {
                    int i6 = (i3 - i) - paddingLeft;
                    childAt.layout(i6 - Math.round(c1crc.LJ()), Math.round(c1crc.LJFF()) + paddingTop, i6 - Math.round(c1crc.LIZLLL()), Math.round(c1crc.LIZ()) + paddingTop);
                } else {
                    childAt.layout(Math.round(c1crc.LIZLLL()) + paddingLeft, Math.round(c1crc.LJFF()) + paddingTop, Math.round(c1crc.LJ()) + paddingLeft, Math.round(c1crc.LIZ()) + paddingTop);
                }
            }
        }
    }
}

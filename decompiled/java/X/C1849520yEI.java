package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yEI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849520yEI extends TuxTextView {
    public UrlModel LLJJJJ;
    public C419890GdH LLJJJJJIL;
    public C419890GdH LLJJJJLIIL;
    public C419890GdH LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public SpannableStringBuilder LLJLIL;
    public C1360500lVY LLJLILLLLZIIL;
    public int LLJLL;
    public float LLJLLIL;
    public int LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public int LLLFFI;
    public int LLLFZ;
    public boolean LLLI;

    private final int getEndIconWidth() {
        if (!this.LLLF) {
            return 0;
        }
        if (!this.LLJJLIIIJLLLLLLLZ) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        }
        C419890GdH c419890GdH = this.LLJJL;
        return c419890GdH != null ? c419890GdH.getSize(getPaint(), null, 0, 0, null) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
    }

    public final void LJJJJLI() {
        if (this.LLJL.length() == 0) {
            return;
        }
        LJJJJLL(this.LLJL, this.LLJJJJJIL, this.LLJZ, this.LLJZIJLIL);
    }

    public final int getColorDiggCount() {
        return this.LLLFZ;
    }

    public final int getColorDigged() {
        return this.LLLFFI;
    }

    public final boolean getNeedLayoutBuilderParams() {
        return this.LLLI;
    }

    public final void LJJJJJ(SpannableStringBuilder spannableStringBuilder) {
        float fMeasureText;
        float f;
        C419890GdH c419890GdH;
        C419890GdH c419890GdH2;
        C1360500lVY c1360500lVY;
        int i = 1;
        StaticLayout.Builder ellipsize = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), getPaint(), this.LLJLLL).setAlignment(Layout.Alignment.ALIGN_NORMAL).setMaxLines(getMaxLines()).setIncludePad(true).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setEllipsize(getEllipsize());
        if (this.LLLI && Build.VERSION.SDK_INT >= 29) {
            ellipsize.setBreakStrategy(1);
            ellipsize.setHyphenationFrequency(1);
        }
        StaticLayout staticLayoutBuild = ellipsize.build();
        int lineCount = staticLayoutBuild.getLineCount();
        if (lineCount < 1) {
            lineCount = 1;
        }
        int i2 = lineCount - 1;
        int lineStart = staticLayoutBuild.getLineStart(Math.min(i2, getMaxLines() - 1));
        if (lineStart == spannableStringBuilder.length()) {
            return;
        }
        staticLayoutBuild.getLineEnd(Math.min(i2, getMaxLines() - 1));
        if (staticLayoutBuild.getEllipsisCount(getMaxLines() - 1) > 0 || getMaxLines() < lineCount) {
            float f2 = 0.0f;
            if (this.LLJZ) {
                fMeasureText = getPaint().measureText("”");
            } else {
                fMeasureText = 0.0f;
            }
            if (this.LLL) {
                f = this.LLJLL;
            } else {
                f = 0.0f;
            }
            float endIconWidth = ((this.LLJLLL - fMeasureText) - f) - getEndIconWidth();
            if (getMaxLines() == 1) {
                f2 = this.LLJLLIL;
            }
            float fMeasureText2 = (endIconWidth - f2) - getPaint().measureText("…");
            String string = spannableStringBuilder.subSequence(lineStart, spannableStringBuilder.length()).toString();
            int iBreakText = getPaint().breakText(string, true, fMeasureText2, null);
            string.substring(0, iBreakText);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "…");
            if (this.LLJZ) {
                spannableStringBuilder2.append((CharSequence) "”");
            }
            if (this.LLL && (c1360500lVY = this.LLJLILLLLZIIL) != null) {
                spannableStringBuilder2.append((CharSequence) c1360500lVY);
            }
            if (this.LLLF) {
                spannableStringBuilder2.append((CharSequence) " ");
                if (C301450Brj.LIZ()) {
                    if (this.LLJJLIIIJLLLLLLLZ) {
                        c419890GdH2 = this.LLJJL;
                    } else {
                        c419890GdH2 = this.LLJJJJLIIL;
                    }
                    C786410Ut5.q2(spannableStringBuilder2, c419890GdH2, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                } else {
                    if (this.LLJJLIIIJLLLLLLLZ) {
                        c419890GdH = this.LLJJL;
                    } else {
                        c419890GdH = this.LLJJJJLIIL;
                    }
                    if (this.LLJZ) {
                        i = 2;
                    }
                    C786410Ut5.q2(spannableStringBuilder2, c419890GdH, i, spannableStringBuilder2.length(), 33);
                }
            }
            spannableStringBuilder.replace(lineStart + iBreakText, spannableStringBuilder.length(), (CharSequence) spannableStringBuilder2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getMinTextSize() != -1 && this.LLLFF) {
            SpannableStringBuilder spannableStringBuilder = this.LLJLIL;
            if (spannableStringBuilder != null) {
                LJJJJJ(spannableStringBuilder);
                setText(spannableStringBuilder);
            }
            this.LLLFF = false;
        }
    }

    public final void setColorDiggCount(int i) {
        this.LLLFZ = i;
    }

    public final void setColorDigged(int i) {
        this.LLLFFI = i;
    }

    public final void setEndIcon(C419890GdH c419890GdH) {
        boolean z;
        this.LLJJL = c419890GdH;
        if (c419890GdH != null) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    public final void setIsNeedEndDiggCount(boolean z) {
        this.LLL = z;
    }

    public final void setIsNeedEndIcon(boolean z) {
        this.LLLF = z;
    }

    public final void setIsNeedImage(boolean z) {
        this.LLJZIJLIL = z;
    }

    public final void setIsNeedQuote(boolean z) {
        this.LLJZ = z;
    }

    public final void setNeedLayoutBuilderParams(boolean z) {
        this.LLLI = z;
    }

    public final void setTextMaxWith(int i) {
        this.LLJLLL = i;
    }

    public final void setUiStyle(int i) {
        boolean z;
        boolean z2 = false;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        this.LLJZ = z;
        if (i > 1) {
            z2 = true;
        }
        this.LLJZIJLIL = z2;
    }

    public C1849520yEI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJL = "";
        this.LLJLLL = -1;
        this.LLLF = true;
        this.LLLI = true;
    }

    public final void LJJJJLL(String str, C419890GdH c419890GdH, boolean z, boolean z2) {
        C419890GdH c419890GdH2;
        C1360500lVY c1360500lVY;
        if (str != null && str.length() != 0) {
            this.LLJL = str;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (c419890GdH != null && z2) {
                spannableStringBuilder.append(" ");
                C786410Ut5.q2(spannableStringBuilder, c419890GdH, 0, 1, 33);
            }
            if (z) {
                spannableStringBuilder.append("“");
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.append("”");
            } else {
                spannableStringBuilder.append((CharSequence) str);
            }
            if (this.LLL && (c1360500lVY = this.LLJLILLLLZIIL) != null) {
                spannableStringBuilder.append((CharSequence) c1360500lVY);
            }
            int length = spannableStringBuilder.length();
            if (this.LLLF) {
                spannableStringBuilder.append(" ");
                if (this.LLJJJJLIIL == null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_chevron_right_ltr;
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    c419910GdJ.LIZLLL = null;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
                    this.LLJJJJLIIL = c419910GdJ.LIZIZ(2, getContext());
                }
                if (this.LLJJLIIIJLLLLLLLZ) {
                    c419890GdH2 = this.LLJJL;
                } else {
                    c419890GdH2 = this.LLJJJJLIIL;
                }
                C786410Ut5.q2(spannableStringBuilder, c419890GdH2, length, spannableStringBuilder.length(), 33);
                if (this.LLJJLIIIJLLLLLLLZ) {
                    if (C21627319kV.LIZJ().LIZLLL(spannableStringBuilder)) {
                        spannableStringBuilder.append("\u200f");
                    } else {
                        spannableStringBuilder.append("\u200e");
                    }
                }
            }
            this.LLJLIL = spannableStringBuilder;
            if (getMinTextSize() != -1) {
                this.LLLFF = true;
            } else {
                LJJJJJ(spannableStringBuilder);
            }
            setText(spannableStringBuilder);
        }
    }

    public static void LJJJJL(final C1849520yEI c1849520yEI, final String str, final UrlModel urlModel, C661300Pwm c661300Pwm, int i) {
        final int i2;
        int width;
        int i3;
        Integer numValueOf;
        C661300Pwm c661300Pwm2 = c661300Pwm;
        if ((i & 2) != 0) {
            urlModel = null;
        }
        if ((i & 4) != 0) {
            c661300Pwm2 = null;
        }
        if ((i & 8) != 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        c1849520yEI.LLJJJJ = urlModel;
        if (C301450Brj.LIZ() && c1849520yEI.LLL && c661300Pwm2 != null) {
            C1849530yEJ c1849530yEJ = new Object() { // from class: X.0yEJ
            };
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            boolean z = c661300Pwm2.LIZJ;
            long j = c661300Pwm2.LIZLLL;
            Context context = c1849520yEI.getContext();
            int i4 = c1849520yEI.LLLFZ;
            int i5 = c1849520yEI.LLLFFI;
            Integer numValueOf2 = Integer.valueOf(iLIZIZ);
            c1849530yEJ.getClass();
            C1360520lVa c1360520lVa = new C1360520lVa();
            if (numValueOf2 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                C426490Gnv.LIZ(numValueOf2.intValue(), spannableStringBuilder);
                c1360520lVa.LIZLLL(spannableStringBuilder);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) " ");
                C19M4 c19m4 = new C19M4(context, null, 6);
                c19m4.setTextColor(i4);
                c19m4.setTuxFont(61);
                C419910GdJ c419910GdJ = new C419910GdJ();
                if (z) {
                    i3 = R.raw.icon_like_fill;
                } else {
                    i3 = R.raw.icon_like;
                }
                c419910GdJ.LIZ = i3;
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                if (z) {
                    numValueOf = Integer.valueOf(i5);
                } else {
                    numValueOf = Integer.valueOf(i4);
                }
                c419910GdJ.LIZLLL = numValueOf;
                c19m4.setStartIcon(c419910GdJ);
                if (j > 0) {
                    c19m4.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                    c19m4.setText(C820940WIi.LIZ(j));
                } else {
                    c19m4.setCompoundDrawablePadding(0);
                    c19m4.setText("");
                }
                C786410Ut5.q2(spannableStringBuilder2, new C430750Gun(c19m4), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                c1360520lVa.LIZLLL(spannableStringBuilder2);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                C426490Gnv.LIZ(1, spannableStringBuilder3);
                c1360520lVa.LIZLLL(spannableStringBuilder3);
            }
            C1360500lVY c1360500lVY = c1360520lVa.LIZ;
            c1849520yEI.LLJLILLLLZIIL = c1360500lVY;
            if (c1360500lVY == null) {
                width = 0;
            } else {
                C444830HcP c444830HcP = new C444830HcP();
                c444830HcP.LJII(61);
                c444830HcP.LJIILIIL(c1360500lVY);
                width = c444830HcP.LIZIZ().getWidth();
            }
            c1849520yEI.LLJLL = width;
        }
        if (urlModel == null) {
            c1849520yEI.LJJJJLL(str, null, c1849520yEI.LLJZ, c1849520yEI.LLJZIJLIL);
            return;
        }
        c1849520yEI.LJJJJLL(str, null, c1849520yEI.LLJZ, c1849520yEI.LLJZIJLIL);
        if (!c1849520yEI.LLJZIJLIL) {
            return;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c1849520yEI.LLJJJJ));
        c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
        c1331670kl3LJIIIIZZ.LJJIIJ(new InterfaceC1331910klR() { // from class: X.0vdU
            @Override // X.InterfaceC1331910klR
            public final void onCanceled() {
            }

            @Override // X.InterfaceC1331910klR
            public final void onProgress(float f) {
            }

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                float f;
                float f2;
                int i6;
                if (!Intrinsics.LJFF(urlModel, c1849520yEI.LLJJJJ) || bitmap == null) {
                    return;
                }
                C443530HaJ c443530HaJ = new C443530HaJ(c1849520yEI.getContext().getResources(), bitmap);
                float f3 = c443530HaJ.LJIIJJI / c443530HaJ.LJIIL;
                if (C301450Brj.LIZ()) {
                    f = c1849520yEI.getPaint().getFontMetrics().bottom;
                    f2 = c1849520yEI.getPaint().getFontMetrics().top;
                } else {
                    f = c1849520yEI.getPaint().getFontMetrics().descent;
                    f2 = c1849520yEI.getPaint().getFontMetrics().ascent;
                }
                float f4 = f - f2;
                C1849520yEI c1849520yEI2 = c1849520yEI;
                int i7 = (int) (f3 * f4);
                int i8 = 1;
                if (i7 < 1) {
                    i6 = 1;
                } else {
                    i6 = i7;
                }
                c1849520yEI2.LLJLLIL = i6 + C418440Gaw.LIZIZ(4);
                if (i7 < 1) {
                    i7 = 1;
                }
                int i9 = (int) f4;
                if (i9 >= 1) {
                    i8 = i9;
                }
                c443530HaJ.setBounds(0, 0, i7, i8);
                c443530HaJ.LIZJ(C418440Gaw.LIZIZ(8));
                C1849520yEI c1849520yEI3 = c1849520yEI;
                C419890GdH c419890GdH = new C419890GdH(c443530HaJ, i2);
                c419890GdH.LIZIZ(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C426750GoL.LIZLLL(c1849520yEI.getContext()));
                c1849520yEI3.LLJJJJJIL = c419890GdH;
                C1849520yEI c1849520yEI4 = c1849520yEI;
                c1849520yEI4.LJJJJLL(str, c1849520yEI4.LLJJJJJIL, c1849520yEI4.LLJZ, c1849520yEI4.LLJZIJLIL);
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                String message;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFailed: ");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                C2188811AlT.LIZIZ(sbLIZ);
                C1849520yEI c1849520yEI2 = c1849520yEI;
                c1849520yEI2.LJJJJLL(str, null, c1849520yEI2.LLJZ, c1849520yEI2.LLJZIJLIL);
            }
        });
    }
}

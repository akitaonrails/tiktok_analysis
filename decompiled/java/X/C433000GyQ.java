package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.BidiFormatter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.tako.common.ui.markdown.style.LynxMarkdownBulletSpan;
import com.ss.android.ugc.aweme.tako.common.ui.markdown.style.MarkDownBulletSpan;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.0GyQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C433000GyQ implements C0Q7N {
    public static final C433000GyQ LIZ = new C433000GyQ();

    public static List LIZIZ(String str) {
        if (str == null) {
            return C13BV.INSTANCE;
        }
        Matcher matcher = PatternProtector.compile("(<u><b>)([\\s\\S]+?)(</b></u>)").matcher(str);
        ArrayList arrayList = new ArrayList();
        int iEnd = 0;
        while (matcher.find()) {
            if (iEnd < matcher.start()) {
                arrayList.add(new C433010GyR(str.substring(iEnd, matcher.start()), false));
            }
            arrayList.add(new C433010GyR(matcher.group(), true));
            iEnd = matcher.end() + 1;
        }
        if (iEnd < str.length()) {
            arrayList.add(new C433010GyR(str.substring(iEnd, str.length()), false));
        }
        return arrayList;
    }

    @Override // X.C0Q7N
    public final Spanned LIZ(String str, final AppCompatTextView appCompatTextView, final C436110H8f c436110H8f, final Map map, final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        if (z) {
            str = C1859900yV2.LIZIZ.LIZIZ(str);
        }
        try {
            return new C2273481Dyk(str, new InterfaceC2273521Dyo(appCompatTextView, c436110H8f, map, z, z2, z3, z4) { // from class: X.0Gnq
                public final TextView LIZ;
                public final InterfaceC418240Gac LIZIZ;
                public final Map<String, Object> LIZJ;
                public final boolean LIZLLL;
                public final boolean LJ;
                public final boolean LJFF;
                public final boolean LJI;
                public final int LJII;
                public final int LJIIIIZZ;
                public final int LJIIIZ;
                public final int LJIIJ;
                public final int LJIIJJI;
                public final int LJIIL;

                @Override // X.InterfaceC2273521Dyo
                public final SpannableStringBuilder LIZ(CharSequence charSequence) {
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
                    C786410Ut5.q2(spannableStringBuilderValueOf, new C444920HcY(42, true), 0, charSequence.length(), 33);
                    C786410Ut5.q2(spannableStringBuilderValueOf, new InterfaceC418250Gad() { // from class: X.0GaY
                        @Override // X.InterfaceC418250Gad
                        public final int getType() {
                            return 1005;
                        }

                        @Override // X.InterfaceC418250Gad
                        public final boolean LJI() {
                            return C418190GaX.LIZ(this);
                        }

                        @Override // X.InterfaceC418250Gad
                        public final boolean LJIIIIZZ() {
                            return C418190GaX.LIZIZ(this);
                        }
                    }, 0, charSequence.length(), 33);
                    return spannableStringBuilderValueOf;
                }

                @Override // X.InterfaceC2273521Dyo
                public final SpannableStringBuilder LIZJ(CharSequence charSequence) {
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
                    if (this.LJ) {
                        C786410Ut5.q2(spannableStringBuilderValueOf, new C444920HcY(43, true), 0, charSequence.length(), 33);
                    }
                    return spannableStringBuilderValueOf;
                }

                @Override // X.InterfaceC2273521Dyo
                public final SpannableStringBuilder LIZLLL(CharSequence charSequence) {
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
                    C418210GaZ c418210GaZ = new C418210GaZ(this.LJIIJJI, charSequence, this.LIZJ, this.LIZIZ);
                    C444920HcY c444920HcY = new C444920HcY(42, true);
                    C786410Ut5.q2(spannableStringBuilderValueOf, c418210GaZ, 0, charSequence.length(), 33);
                    C786410Ut5.q2(spannableStringBuilderValueOf, c444920HcY, 0, charSequence.length(), 33);
                    return spannableStringBuilderValueOf;
                }

                @Override // X.InterfaceC2273521Dyo
                public final void LJ(SpannableStringBuilder spannableStringBuilder) {
                    int iLIZIZ;
                    int i;
                    SpannableString spannableString = new SpannableString("\n");
                    if (this.LJFF) {
                        if (this.LJI) {
                            i = 12;
                        } else {
                            i = 8;
                        }
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    }
                    C786410Ut5.p2(spannableString, new C416680GVm(iLIZIZ), spannableString.length() - 1, spannableString.length(), 17);
                    spannableStringBuilder.append((CharSequence) spannableString);
                }

                @Override // X.InterfaceC2273521Dyo
                public final SpannableStringBuilder LJII(CharSequence charSequence) {
                    Object obj;
                    TextView textView;
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
                    if (this.LIZLLL && (textView = this.LIZ) != null && textView.getContext() != null) {
                        C418180GaW c418180GaW = new C418180GaW(this.LJIIIIZZ, this.LJIIJ, this.LJIIIZ, charSequence, C1859900yV2.LIZIZ.LJI(this.LIZ.getContext()));
                        c418180GaW.LLJ = this.LIZIZ;
                        obj = c418180GaW;
                    } else {
                        C418130GaR c418130GaR = new C418130GaR(this.LJIIIIZZ, this.LJIIJ, charSequence);
                        c418130GaR.LLJIJIL = this.LIZIZ;
                        obj = c418130GaR;
                    }
                    C786410Ut5.q2(spannableStringBuilderValueOf, obj, 0, charSequence.length(), 33);
                    return spannableStringBuilderValueOf;
                }

                @Override // X.InterfaceC2273521Dyo
                public final SpannableStringBuilder LJIIIIZZ(CharSequence charSequence) {
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
                    C786410Ut5.q2(spannableStringBuilderValueOf, new C444920HcY(42, true), 0, spannableStringBuilderValueOf.length(), 33);
                    return spannableStringBuilderValueOf;
                }

                @Override // X.InterfaceC2273521Dyo
                public final SpannableStringBuilder LJFF(CharSequence charSequence, CharSequence charSequence2) {
                    boolean zLIZLLL;
                    boolean zIsRtl;
                    Drawable bitmapDrawable;
                    Activity topActivity = ActivityStack.getTopActivity();
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_arrow_up_right_fill_ltr;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.bb);
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(topActivity);
                    TextView textView = this.LIZ;
                    if (textView != null) {
                        if (textView.getLayoutDirection() == 1) {
                            zLIZLLL = true;
                        } else {
                            zLIZLLL = false;
                        }
                    } else {
                        zLIZLLL = C426750GoL.LIZLLL(topActivity);
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        zIsRtl = BidiFormatter.getInstance().isRtl(charSequence);
                    } else {
                        zIsRtl = zLIZLLL;
                    }
                    if (zLIZLLL != zIsRtl) {
                        Bitmap bitmapLIZIZ = C376710Epp.LIZIZ(tuxIconDrawableLIZ);
                        Matrix matrix = new Matrix();
                        matrix.preScale(-1.0f, 1.0f);
                        bitmapDrawable = new BitmapDrawable(topActivity.getResources(), Bitmap.createBitmap(bitmapLIZIZ, 0, 0, bitmapLIZIZ.getWidth(), bitmapLIZIZ.getHeight(), matrix, false));
                    } else {
                        bitmapDrawable = tuxIconDrawableLIZ;
                    }
                    bitmapDrawable.setBounds(0, 0, tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ());
                    C0GZF c0gzf = new C0GZF(bitmapDrawable, 2);
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
                    spannableStringBuilderValueOf.append((CharSequence) "\u200b");
                    C786410Ut5.q2(spannableStringBuilderValueOf, c0gzf, spannableStringBuilderValueOf.length() - 1, spannableStringBuilderValueOf.length(), 17);
                    C786410Ut5.q2(spannableStringBuilderValueOf, new C426390Gnl(charSequence, charSequence2, this.LJIIL, c0gzf, this.LIZIZ, this.LIZJ), 0, spannableStringBuilderValueOf.length(), 33);
                    return spannableStringBuilderValueOf;
                }

                @Override // X.InterfaceC2273521Dyo
                public final SpannableStringBuilder LJI(int i, CharSequence charSequence) {
                    Object markDownBulletSpan;
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
                    if (this.LJFF) {
                        markDownBulletSpan = new LynxMarkdownBulletSpan(i, this.LJII, 0);
                    } else {
                        markDownBulletSpan = new MarkDownBulletSpan(i, this.LJII, 0);
                    }
                    C786410Ut5.q2(spannableStringBuilderValueOf, markDownBulletSpan, 0, spannableStringBuilderValueOf.length(), 33);
                    return spannableStringBuilderValueOf;
                }

                @Override // X.InterfaceC2273521Dyo
                public final SpannableStringBuilder LIZIZ(int i, int i2, int i3, CharSequence charSequence, String str2) {
                    Object markDownBulletSpan;
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
                    if (str2 != null) {
                        Matcher matcher = PatternProtector.compile("\\d+").matcher(str2);
                        if (matcher.find()) {
                            i2 = CastIntegerProtector.parseInt(matcher.group());
                        }
                    }
                    if (this.LJFF) {
                        markDownBulletSpan = new LynxMarkdownBulletSpan(i, this.LJII, i2);
                    } else {
                        markDownBulletSpan = new MarkDownBulletSpan(i, this.LJII, i2);
                    }
                    C786410Ut5.q2(spannableStringBuilderValueOf, markDownBulletSpan, 0, spannableStringBuilderValueOf.length(), 33);
                    return spannableStringBuilderValueOf;
                }

                {
                    Context context;
                    int iIntValue;
                    int iIntValue2;
                    int iIntValue3;
                    int iIntValue4;
                    int iIntValue5;
                    this.LIZ = appCompatTextView;
                    this.LIZIZ = c436110H8f;
                    this.LIZJ = map;
                    this.LIZLLL = z;
                    this.LJ = z2;
                    this.LJFF = z3;
                    this.LJI = z4;
                    new WeakReference(this.LIZ);
                    if (appCompatTextView != null && (context = appCompatTextView.getContext()) != null) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        this.LJII = iIntValue;
                        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context);
                        if (numLIZJ2 != null) {
                            iIntValue2 = numLIZJ2.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        this.LJIIIIZZ = iIntValue2;
                        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a03, context);
                        if (numLIZJ3 != null) {
                            iIntValue3 = numLIZJ3.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        this.LJIIIZ = iIntValue3;
                        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.br, context);
                        if (numLIZJ4 != null) {
                            iIntValue4 = numLIZJ4.intValue();
                        } else {
                            iIntValue4 = 0;
                        }
                        this.LJIIJ = iIntValue4;
                        Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.d5, context);
                        if (numLIZJ5 != null) {
                            iIntValue5 = numLIZJ5.intValue();
                        } else {
                            iIntValue5 = 0;
                        }
                        this.LJIIJJI = iIntValue5;
                        Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.bb, context);
                        this.LJIIL = numLIZJ6 != null ? numLIZJ6.intValue() : 0;
                    }
                }
            }).LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}

package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3CommentAvatarConfig;
import com.zhiliaoapp.musically.R;
import java.text.BreakIterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0HZn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443210HZn {
    public static final void LIZLLL(SpannableStringBuilder spannableStringBuilder) {
        C786410Ut5.q2(spannableStringBuilder, new C434230H0z(C341940Daq.LIZ(21.0d)), 0, spannableStringBuilder.length(), 18);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.drawable.InsetDrawable LJFF(final android.content.Context r8) {
        /*
            X.0GaF r4 = new X.0GaF
            r4.<init>(r8)
            r6 = 0
            if (r8 == 0) goto L5a
            boolean r0 = X.C426750GoL.LIZLLL(r8)
            r1 = 1
            if (r0 != r1) goto L5a
        Lf:
            r0 = 4
            if (r1 == 0) goto L43
            android.graphics.drawable.InsetDrawable r3 = new android.graphics.drawable.InsetDrawable
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r5 = X.C814420VxA.LIZIZ(r0)
            r7 = r6
            r8 = r6
            r3.<init>(r4, r5, r6, r7, r8)
        L25:
            r2 = 22
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r1 = X.C814420VxA.LIZIZ(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r3.setBounds(r6, r6, r1, r0)
            return r3
        L43:
            android.graphics.drawable.InsetDrawable r3 = new android.graphics.drawable.InsetDrawable
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r7 = X.C814420VxA.LIZIZ(r0)
            r3 = r3
            r4 = r4
            r5 = r6
            r6 = r6
            r8 = r6
            r3.<init>(r4, r5, r6, r7, r8)
            goto L25
        L5a:
            r1 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C443210HZn.LJFF(android.content.Context):android.graphics.drawable.InsetDrawable");
    }

    public static final String LJI(String str) {
        if (str.length() == 0) {
            return str;
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
        characterInstance.setText(str);
        characterInstance.first();
        int next = characterInstance.next();
        int i = 0;
        while (true) {
            if (next == -1) {
                break;
            }
            i++;
            if (i < 12) {
                next = characterInstance.next();
            } else if (next != -1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str.substring(0, next));
                sbLIZ.append("... ");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return str;
    }

    public static final void LIZIZ(SpannableStringBuilder spannableStringBuilder, String str) {
        int length = spannableStringBuilder.length();
        if (str == null) {
            str = "";
        }
        spannableStringBuilder.append((CharSequence) str);
        C444920HcY c444920HcY = new C444920HcY(41, false);
        Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 450, 0.0f, 0.0f, null, 0.0f, 0, null, 253);
        if (typefaceLIZIZ != null) {
            c444920HcY.LL = typefaceLIZIZ;
        }
        C786410Ut5.q2(spannableStringBuilder, c444920HcY, length, spannableStringBuilder.length(), 33);
    }

    public static final void LIZ(int i, Context context, SpannableStringBuilder spannableStringBuilder) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_triangle_right_fill_ltr;
        c419910GdJ.LIZLLL = Integer.valueOf(i);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
        spannableStringBuilder.append("→");
        C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
    }

    public static final C443530HaJ LJII(Context context, Resources resources, Bitmap bitmap) {
        int iIntValue;
        Integer numLIZJ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -12303292;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(iIntValue);
        float f = iLIZIZ;
        paint.setStrokeWidth(f);
        canvas.drawCircle(bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f, (bitmap.getWidth() / 2.0f) - (f / 2.0f), paint);
        C443530HaJ c443530HaJ = new C443530HaJ(resources, bitmap);
        c443530HaJ.LIZIZ();
        c443530HaJ.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
        return c443530HaJ;
    }

    public static final void LJ(SpannableStringBuilder spannableStringBuilder, String str, int i, Function0<Unit> function0) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        C786410Ut5.q2(spannableStringBuilder, new C431980Gwm(i, Color.argb(C814420VxA.LIZIZ(Color.alpha(i) * 0.2f), Color.red(i), Color.green(i), Color.blue(i)), new AwS585S0100000_6(function0, (Function0<Unit>) 312)), length, spannableStringBuilder.length(), 33);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(42, false), length, spannableStringBuilder.length(), 33);
    }

    public static final void LIZJ(final SpannableStringBuilder spannableStringBuilder, final Context context, int i, UrlModel urlModel, final InterfaceC1685420txc<? super Bitmap, ? super SpannableStringBuilder, ? super C419890GdH, ? super Integer, ? super Integer, Unit> interfaceC1685420txc, final Function1<? super SpannableStringBuilder, Unit> function1, Function0<Unit> function0) {
        List<String> urlList;
        if (!((FriendsV3CommentAvatarConfig) C1354720lME.LIZIZ.getValue()).enableCommentAvatar) {
            return;
        }
        if (urlModel != null) {
            urlList = urlModel.getUrlList();
        } else {
            urlList = null;
        }
        C03IT c03it = new C03IT(urlList);
        spannableStringBuilder.append(" ");
        final int length = spannableStringBuilder.length() - 1;
        final int length2 = spannableStringBuilder.length();
        final C419890GdH c419890GdH = new C419890GdH(LJFF(context), 2);
        C786410Ut5.q2(spannableStringBuilder, new C431980Gwm(i, Color.argb(C814420VxA.LIZIZ(Color.alpha(i) * 0.2f), Color.red(i), Color.green(i), Color.blue(i)), new AwS585S0100000_6(function0, (Function0<Unit>) 311)), length, spannableStringBuilder.length(), 33);
        C786410Ut5.q2(spannableStringBuilder, c419890GdH, length, length2, 33);
        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(c03it);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        c1331670kl3LJIIJ.LJIIIIZZ = iLIZIZ;
        c1331670kl3LJIIJ.LJIIIZ = iLIZIZ2;
        c1331670kl3LJIIJ.LJJII(new AbstractC468201s0() { // from class: X.0HZm
            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                if (bitmap != null) {
                    InterfaceC1685420txc<Bitmap, SpannableStringBuilder, C419890GdH, Integer, Integer, Unit> interfaceC1685420txc2 = interfaceC1685420txc;
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    C419890GdH c419890GdH2 = c419890GdH;
                    int i2 = length;
                    int i3 = length2;
                    if (interfaceC1685420txc2 != null) {
                        interfaceC1685420txc2.invoke(bitmap, spannableStringBuilder2, c419890GdH2, Integer.valueOf(i2), Integer.valueOf(i3));
                    }
                }
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                C419890GdH c419890GdH2 = new C419890GdH(C443210HZn.LJFF(context), 2);
                spannableStringBuilder.removeSpan(c419890GdH);
                C786410Ut5.q2(spannableStringBuilder, c419890GdH2, length, length2, 33);
                Function1<SpannableStringBuilder, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(spannableStringBuilder);
                }
            }
        });
    }
}

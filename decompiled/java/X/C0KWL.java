package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0KWL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KWL {
    public static final C0KWL LIZ = new C0KWL();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(243));

    public static long LJ() {
        return ((long) C0C64.LJIILLIIL().LJIJ(31744, 200, "studio_publish_page_draft_size_alert_config", true)) * 1024 * 1024;
    }

    public static int LJI() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_draft_button_panel_type", true);
    }

    public static View LIZLLL(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        int iIntValue = -1;
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(200));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        gradientDrawable.setColor(iIntValue);
        View view = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        layoutParams.gravity = 17;
        C786410Ut5.W5(view, layoutParams);
        view.setBackground(gradientDrawable);
        frameLayout.addView(view);
        return frameLayout;
    }

    public static View LIZ(int i, Context context) {
        int iIntValue;
        int iIntValue2;
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1f, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        frameLayout.setBackgroundColor(iIntValue);
        View view = new View(context);
        C786410Ut5.W5(view, new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)))));
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = -7829368;
        }
        view.setBackgroundColor(iIntValue2);
        frameLayout.addView(view);
        if (i > 0) {
            C426750GoL.LJIIIZ(view, Integer.valueOf(i), null, null, null, false, 30);
        }
        return frameLayout;
    }

    public static SpannableString LJFF(Context context, String str) {
        int iIntValue;
        SpannableString spannableString = new SpannableString(context.getString(2131846749, str));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -65536;
        }
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), a0.LJJJ(spannableString, str, 0, false, 6), a0.LJJJ(spannableString, str, 0, false, 6) + str.length(), 33);
        return spannableString;
    }

    public static void LJII(TuxTextView tuxTextView, int i, List list) {
        final String value;
        int iIntValue;
        Context context = tuxTextView.getContext();
        String string = a0.LJLIIIL(tuxTextView.getText().toString()).toString();
        View viewSd = null;
        CharSequence charSequenceLIZ = C19374310qz.LIZ(Integer.valueOf(i), new C19348710mr(null, EnumC19356310o5.COMPACT, EnumC826620Wbk.SHORT, 9), null, 0, 28);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append((Object) charSequenceLIZ);
        sbLIZ.append(')');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        MatchResult matchResultFind$default = Regex.find$default(new Regex("(\\S+)$"), string, 0, 2, null);
        if (matchResultFind$default != null && (value = matchResultFind$default.getValue()) != null) {
            String strSubstring = string.substring(0, matchResultFind$default.LIZIZ().LL);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strSubstring);
            sbLIZ2.append(value);
            sbLIZ2.append('#');
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            SpannableString spannableString = new SpannableString(strLIZIZ2);
            int length = strSubstring.length();
            int length2 = strLIZIZ2.length();
            TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
            tuxTextView2.setTuxFont(102);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -7829368;
            }
            tuxTextView2.setTextColor(iIntValue);
            tuxTextView2.setText(strLIZIZ);
            final Bitmap bitmapLIZIZ = C447070Hg1.LIZIZ(tuxTextView2);
            int size = list.size();
            if (size > 0) {
                viewSd = C786410Ut5.Sd(R.layout.d3j, C786410Ut5.ne(context), null);
                ImageView imageView = (ImageView) viewSd.findViewById(R.id.l9t);
                Bitmap bitmap = (Bitmap) ListProtector.get(list, 0);
                if (bitmap != null) {
                    imageView.setImageBitmap(C447070Hg1.LIZJ(bitmap));
                } else {
                    imageView.setImageDrawable(context.getDrawable(R.drawable.a6l));
                }
                if (size >= 2) {
                    ImageView imageView2 = (ImageView) viewSd.findViewById(R.id.l9z);
                    C786410Ut5.LJZI(0, imageView2);
                    C786410Ut5.LJLLLLLL(0, viewSd.findViewById(R.id.fzf));
                    Bitmap bitmap2 = (Bitmap) ListProtector.get(list, 1);
                    if (bitmap2 != null) {
                        imageView2.setImageBitmap(C447070Hg1.LIZJ(bitmap2));
                    } else {
                        imageView2.setImageDrawable(context.getDrawable(R.drawable.a6l));
                    }
                    if (size >= 3) {
                        ImageView imageView3 = (ImageView) viewSd.findViewById(R.id.l_3);
                        C786410Ut5.LJZI(0, imageView3);
                        C786410Ut5.LJLLLLLL(0, viewSd.findViewById(R.id.fzt));
                        Bitmap bitmap3 = (Bitmap) ListProtector.get(list, 2);
                        if (bitmap3 != null) {
                            imageView3.setImageBitmap(C447070Hg1.LIZJ(bitmap3));
                        } else {
                            imageView3.setImageDrawable(context.getDrawable(R.drawable.a6l));
                        }
                    }
                }
            }
            final Bitmap bitmapLIZIZ2 = C447070Hg1.LIZIZ(viewSd);
            if (bitmapLIZIZ != null && bitmapLIZIZ2 != null) {
                tuxTextView.getPaint();
                C786410Ut5.p2(spannableString, new ReplacementSpan(value, bitmapLIZIZ, bitmapLIZIZ2) { // from class: X.0GVh
                    public final String LL;
                    public final Bitmap LLILLJJLI;
                    public final Bitmap LLILLL;

                    {
                        this.LL = value;
                        this.LLILLJJLI = bitmapLIZIZ;
                        this.LLILLL = bitmapLIZIZ2;
                    }

                    @Override // android.text.style.ReplacementSpan
                    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                        float fMeasureText = paint.measureText(this.LL);
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        return (int) (fMeasureText + this.LLILLJJLI.getWidth() + this.LLILLL.getWidth() + (iLIZIZ * 2));
                    }

                    @Override // android.text.style.ReplacementSpan
                    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        float f2 = i5;
                        canvas.drawText(this.LL, f, f2, paint);
                        float f3 = iLIZIZ;
                        float fMeasureText = f + paint.measureText(this.LL) + f3;
                        canvas.drawBitmap(this.LLILLJJLI, fMeasureText, paint.getFontMetricsInt().ascent + f2, paint);
                        canvas.drawBitmap(this.LLILLL, fMeasureText + this.LLILLJJLI.getWidth() + f3, f2 + paint.getFontMetricsInt().ascent, paint);
                    }
                }, length, length2, 33);
                tuxTextView.setText(spannableString);
            }
        }
    }

    public static View LIZIZ(Context context, String str, int i, Integer num, boolean z) {
        int i2;
        View viewSd = C786410Ut5.Sd(R.layout.d3k, C786410Ut5.ne(context), null);
        ((TextView) viewSd.findViewById(R.id.title)).setText(str);
        TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.mk3);
        tuxIconView.setIconRes(i);
        if (num != null) {
            tuxIconView.setTintColorRes(num.intValue());
        }
        TuxIconView tuxIconView2 = (TuxIconView) viewSd.findViewById(R.id.tk9);
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView2, i2);
        return viewSd;
    }
}

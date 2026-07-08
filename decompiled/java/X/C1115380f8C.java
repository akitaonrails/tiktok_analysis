package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCommentDrawableEmojiSetting;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0f8C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115380f8C {
    public static final C1115360f8A LIZ = C1115360f8A.LIZJ();
    public static final Pattern LIZIZ = PatternProtector.compile("(\\[)([^\\[\\]]+)(])");

    public static SpannableStringBuilder LIZ(int i, SpannableStringBuilder spannableStringBuilder) {
        if (!LiveCommentDrawableEmojiSetting.INSTANCE.getValue() && spannableStringBuilder.length() > i) {
            return new SpannableStringBuilder(spannableStringBuilder.subSequence(0, i));
        }
        int length = spannableStringBuilder.length();
        C416610GVf[] c416610GVfArr = (C416610GVf[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C416610GVf.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C416610GVf c416610GVf : c416610GVfArr) {
            int i2 = c416610GVf.LLILLJJLI;
            for (int i3 = c416610GVf.LL; i3 < i2; i3++) {
                linkedHashMap.put(Integer.valueOf(i3), c416610GVf);
            }
            length += c416610GVf.LLILZIL;
        }
        if (length > i) {
            if (c416610GVfArr.length == 0) {
                return (SpannableStringBuilder) spannableStringBuilder.subSequence(0, i);
            }
            String string = spannableStringBuilder.toString();
            Set setKeySet = linkedHashMap.keySet();
            int i4 = 0;
            int i5 = 0;
            while (i4 < string.length()) {
                if (setKeySet.contains(Integer.valueOf(i4))) {
                    C416610GVf c416610GVf2 = (C416610GVf) linkedHashMap.get(Integer.valueOf(i4));
                    if (c416610GVf2 == null) {
                        continue;
                    } else {
                        i5 += 2;
                        if (i5 == i) {
                            return (SpannableStringBuilder) spannableStringBuilder.subSequence(0, i4 + c416610GVf2.LLILLL);
                        }
                        if (i5 > i) {
                            return (SpannableStringBuilder) spannableStringBuilder.subSequence(0, i4);
                        }
                        i4 += c416610GVf2.LLILLL;
                    }
                } else {
                    i5++;
                    i4++;
                    if (i5 >= i) {
                        return (SpannableStringBuilder) spannableStringBuilder.subSequence(0, i4);
                    }
                }
            }
            return spannableStringBuilder;
        }
        return spannableStringBuilder;
    }

    public static List LIZJ(Resources resources, CharSequence charSequence) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmapLIZ;
        if (!LiveCommentDrawableEmojiSetting.INSTANCE.getValue()) {
            return C13BV.INSTANCE;
        }
        Matcher matcher = LIZIZ.matcher(charSequence);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String strGroup = matcher.group();
            C1115360f8A c1115360f8A = LIZ;
            if (c1115360f8A.LIZLLL(strGroup)) {
                int iStart = matcher.start();
                int iEnd = matcher.end();
                if (resources != null && c1115360f8A.LIZLLL(strGroup) && (bitmapLIZ = c1115360f8A.LIZ(strGroup)) != null) {
                    bitmapDrawable = new BitmapDrawable(resources, bitmapLIZ);
                } else {
                    bitmapDrawable = null;
                }
                arrayList.add(new C1115510f8P(iStart, iEnd, bitmapDrawable, strGroup));
            }
        }
        return arrayList;
    }

    public static C416610GVf LIZIZ(int i, int i2, Drawable drawable, String str) {
        return new C416610GVf(drawable, i, i2, str.length());
    }

    public static void LIZLLL(final SpannableStringBuilder spannableStringBuilder, Resources resources, final LifecycleOwner lifecycleOwner, final Function2 function2) {
        if (!LiveCommentDrawableEmojiSetting.INSTANCE.getValue()) {
            if (function2 != null) {
                function2.invoke(spannableStringBuilder, Boolean.TRUE);
                return;
            }
            return;
        }
        ArrayList<C1115510f8P> arrayList = new ArrayList();
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C416610GVf.class)) {
            spannableStringBuilder.removeSpan(obj);
        }
        for (C1115510f8P c1115510f8P : LIZJ(resources, spannableStringBuilder)) {
            Drawable drawable = c1115510f8P.LIZLLL;
            if (drawable != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loadSync - ");
                sbLIZ.append(c1115510f8P.LIZJ);
                C20441214yg.LIZIZ("EmojiTextHelper", C2188811AlT.LIZIZ(sbLIZ));
                C786410Ut5.q2(spannableStringBuilder, LIZIZ(c1115510f8P.LIZ, c1115510f8P.LIZIZ, drawable, c1115510f8P.LIZJ), c1115510f8P.LIZ, c1115510f8P.LIZIZ, 33);
            } else {
                String str = c1115510f8P.LIZJ;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(0);
                C786410Ut5.q2(spannableStringBuilder, LIZIZ(c1115510f8P.LIZ, c1115510f8P.LIZIZ, gradientDrawable, str), c1115510f8P.LIZ, c1115510f8P.LIZIZ, 33);
                arrayList.add(c1115510f8P);
            }
        }
        if (function2 != null) {
            function2.invoke(spannableStringBuilder, Boolean.TRUE);
        }
        final C118300cf c118300cf = new C118300cf();
        c118300cf.element = arrayList.size();
        if (lifecycleOwner != null) {
            for (final C1115510f8P c1115510f8P2 : arrayList) {
                LIZ.LIZIZ(resources, lifecycleOwner, new InterfaceC314870CVx() { // from class: X.0f8B
                    @Override // X.InterfaceC314870CVx
                    public final void onDrawableLoaded(Drawable drawable2) {
                        if (drawable2 != null) {
                            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                            C1115510f8P c1115510f8P3 = c1115510f8P2;
                            Object[] spans = spannableStringBuilder2.getSpans(c1115510f8P3.LIZ, c1115510f8P3.LIZIZ, C416610GVf.class);
                            SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                            for (Object obj2 : spans) {
                                spannableStringBuilder3.removeSpan(obj2);
                            }
                            SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder;
                            C1115360f8A c1115360f8A = C1115380f8C.LIZ;
                            C1115510f8P c1115510f8P4 = c1115510f8P2;
                            C416610GVf c416610GVfLIZIZ = C1115380f8C.LIZIZ(c1115510f8P4.LIZ, c1115510f8P4.LIZIZ, drawable2, c1115510f8P4.LIZJ);
                            C1115510f8P c1115510f8P5 = c1115510f8P2;
                            C786410Ut5.q2(spannableStringBuilder4, c416610GVfLIZIZ, c1115510f8P5.LIZ, c1115510f8P5.LIZIZ, 33);
                        } else {
                            SpannableStringBuilder spannableStringBuilder5 = spannableStringBuilder;
                            C1115360f8A c1115360f8A2 = C1115380f8C.LIZ;
                            String str2 = c1115510f8P2.LIZJ;
                            GradientDrawable gradientDrawable2 = new GradientDrawable();
                            gradientDrawable2.setColor(0);
                            C1115510f8P c1115510f8P6 = c1115510f8P2;
                            C416610GVf c416610GVfLIZIZ2 = C1115380f8C.LIZIZ(c1115510f8P6.LIZ, c1115510f8P6.LIZIZ, gradientDrawable2, str2);
                            C1115510f8P c1115510f8P7 = c1115510f8P2;
                            C786410Ut5.q2(spannableStringBuilder5, c416610GVfLIZIZ2, c1115510f8P7.LIZ, c1115510f8P7.LIZIZ, 33);
                        }
                        C118300cf c118300cf2 = c118300cf;
                        int i = c118300cf2.element - 1;
                        c118300cf2.element = i;
                        if (i == 0) {
                            C20441214yg.LIZIZ("EmojiTextHelper", "loadAsyncDone");
                            LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                            C1DFH c1dfh = C0PEM.LIZ;
                            C500260Jjc.LJJJJJ(lifecycleOwner2, C2107308Nj.LIZ, new C407401iC(function2, spannableStringBuilder, null), 2);
                        }
                    }
                }, c1115510f8P2.LIZJ);
            }
        }
    }
}

package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS215S0300000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0HCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437350HCz {
    public static final void LIZIZ(SpannableString spannableString, Object obj, Object obj2) {
        C786410Ut5.p2(spannableString, obj2, spannableString.getSpanStart(obj), spannableString.getSpanEnd(obj), spannableString.getSpanFlags(obj));
        spannableString.removeSpan(obj);
    }

    public static final void LIZJ(Context context, C21415018rM c21415018rM, SpannableString spannableString, float f, int i, int i2, AwS585S0100000_6 awS585S0100000_6) {
        TextExtraStruct textExtraStruct;
        if (c21415018rM == null || !C0HD0.LIZ()) {
            return;
        }
        for (C0HD1 c0hd1 : (C0HD1[]) spannableString.getSpans(0, spannableString.length(), C0HD1.class)) {
            Object obj = c0hd1.LLILLL;
            if ((obj instanceof TextExtraStruct) && (textExtraStruct = (TextExtraStruct) obj) != null && textExtraStruct.getType() == 0 && textExtraStruct.isThirdPartyHighlight()) {
                int spanStart = spannableString.getSpanStart(c0hd1);
                int spanEnd = spannableString.getSpanEnd(c0hd1);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    Object[] spans = spannableString.getSpans(spanStart, spanEnd, Object.class);
                    if (!((Boolean) awS585S0100000_6.invoke(textExtraStruct)).booleanValue()) {
                        for (Object obj2 : spans) {
                            if (obj2 instanceof C428810Grf) {
                                spannableString.removeSpan(obj2);
                            }
                        }
                    } else {
                        for (Object obj3 : spans) {
                            if ((obj3 instanceof C428810Grf) || (obj3 instanceof C428820Grg) || (obj3 instanceof C428830Grh)) {
                                spannableString.removeSpan(obj3);
                            }
                        }
                        int spanFlags = spannableString.getSpanFlags(c0hd1);
                        C428810Grf c428810Grf = new C428810Grf(context, f, i, textExtraStruct, 48);
                        c428810Grf.LLIZ = spannableString.toString();
                        C786410Ut5.p2(spannableString, c428810Grf, spanStart, spanEnd, spanFlags);
                    }
                }
            }
        }
    }

    public static final void LIZ(Context context, C21415018rM c21415018rM, SpannableString spannableString, float f, int i, int i2, int i3, CommentContextSource commentContextSource) {
        if (c21415018rM == null) {
            return;
        }
        for (Object obj : spannableString.getSpans(0, spannableString.length(), Object.class)) {
            if (obj instanceof C444920HcY) {
                spannableString.removeSpan(obj);
            } else if (obj instanceof C0HD1) {
                C0HD1 c0hd1 = (C0HD1) obj;
                WeakReference weakReference = new WeakReference(c0hd1.LLILZ);
                C0HD1 c0hd12 = new C0HD1(0.75f, i, c0hd1.LLILLL);
                c0hd12.LLILZ = new AwS215S0300000_6(c0hd12, (C0HD1) commentContextSource, (CommentContextSource) weakReference, (WeakReference<Function1<Object, Unit>>) 0);
                LIZIZ(spannableString, obj, c0hd12);
            } else if (obj instanceof C428820Grg) {
                C428820Grg c428820Grg = (C428820Grg) obj;
                C428820Grg c428820Grg2 = new C428820Grg(context, f, i2, i, c428820Grg.LLILZIL, Integer.valueOf(i3));
                c428820Grg2.LIZJ(C0HD5.LIZIZ(c21415018rM, Double.valueOf(0.75d)), C0HD5.LIZIZ(c21415018rM, 4));
                c428820Grg2.LLJIJIL = C0HD5.LIZIZ(c21415018rM, 8);
                c428820Grg2.LLJ = C0HD5.LIZIZ(c21415018rM, 15);
                c428820Grg2.LLJI = C0HD5.LIZIZ(c21415018rM, 15);
                c428820Grg2.LLJILJILJ = c428820Grg.LLJILJILJ;
                LIZIZ(spannableString, obj, c428820Grg2);
            } else if (obj instanceof C0HD2) {
                int iLIZ = C0HD5.LIZ(c21415018rM, 15);
                ColorDrawable colorDrawable = new ColorDrawable(0);
                colorDrawable.setBounds(0, 0, iLIZ, iLIZ);
                LIZIZ(spannableString, obj, new C0HD2(colorDrawable, iLIZ, ((C0HD2) obj).LLILZIL, c21415018rM));
            } else if (obj instanceof C428830Grh) {
                C428830Grh c428830Grh = (C428830Grh) obj;
                TextExtraStruct textExtraStruct = c428830Grh.LLILZLL;
                String str = c428830Grh.LLJJJJLIIL;
                C428830Grh c428830Grh2 = new C428830Grh(context, C814420VxA.LIZIZ(f), 0, i, textExtraStruct, false, null, true, true, Integer.valueOf(i3), 96);
                c428830Grh2.LLJJIII = true;
                c428830Grh2.LLJILLL = C0HD5.LIZJ(8, context);
                c428830Grh2.LLJJ = C0HD5.LIZJ(2, context);
                c428830Grh2.LLJILJIL = C0HD5.LIZJ(15, context);
                c428830Grh2.LLJILJILJ = C0HD5.LIZJ(15, context);
                c428830Grh2.LLJJL = true;
                c428830Grh2.LLJJJJLIIL = str;
                LIZIZ(spannableString, obj, c428830Grh2);
            } else if (obj instanceof C428810Grf) {
                C428810Grf c428810Grf = (C428810Grf) obj;
                C428810Grf c428810Grf2 = new C428810Grf(context, f, i, c428810Grf.LLILZ, 48);
                c428810Grf2.LLIZ = c428810Grf.LLIZ;
                LIZIZ(spannableString, obj, c428810Grf2);
            } else if (obj instanceof ForegroundColorSpan) {
                spannableString.removeSpan(obj);
            }
        }
    }
}

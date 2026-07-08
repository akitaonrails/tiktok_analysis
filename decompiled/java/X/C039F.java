package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.039F, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C039F {
    public static final SpannableStringBuilder LIZ(Context context, AnonymousClass0376 anonymousClass0376, EnumC803903Cb enumC803903Cb) {
        int i = C039E.LIZ[enumC803903Cb.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ArrayList arrayList = new ArrayList();
                String str = anonymousClass0376.LLIZ;
                if (str != null) {
                    arrayList.add(str);
                }
                String str2 = anonymousClass0376.LLJJIJI;
                if (str2 != null) {
                    arrayList.add(str2);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((String) obj).length() > 0) {
                        arrayList2.add(obj);
                    }
                }
                return new SpannableStringBuilder(C13LP.LJJLIIIJ(arrayList2, ", ", null, null, 0, null, null, 62));
            }
            throw new C1954807lC();
        }
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(context, R.raw.icon_map_pin);
        tuxIconDrawable.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        tuxIconDrawable.LJI(R.attr.a1h, context);
        SpannableString spannableString = new SpannableString(" ");
        C786410Ut5.p2(spannableString, new C419890GdH(tuxIconDrawable, 2), 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
        spannableStringBuilder.append((CharSequence) " ");
        String str3 = anonymousClass0376.LLIZ;
        if (str3 != null) {
            spannableStringBuilder.append((CharSequence) str3);
        }
        String str4 = anonymousClass0376.LLIZLLLIL;
        if (str4 != null) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) str4);
        }
        String str5 = anonymousClass0376.LLJI;
        if (str5 != null) {
            spannableStringBuilder.append((CharSequence) str5).append((CharSequence) " ");
        }
        String str6 = anonymousClass0376.LLJ;
        if (str6 != null) {
            spannableStringBuilder.append((CharSequence) str6).append((CharSequence) " ");
        }
        String str7 = anonymousClass0376.LLJIJIL;
        if (str7 != null) {
            spannableStringBuilder.append((CharSequence) str7);
        }
        return spannableStringBuilder;
    }
}

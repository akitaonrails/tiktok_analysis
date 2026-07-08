package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0HMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439870HMr {
    public static final Pattern LIZ = PatternProtector.compile("(\\[)([^\\[\\]]+)(])");
    public static final C09M2 LIZIZ = new C09M2();
    public static final Pattern LIZJ = PatternProtector.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)");

    public static boolean LIZ(String str) {
        if (str != null && str.length() != 0) {
            try {
                int length = str.length();
                Matcher matcher = LIZJ.matcher(str);
                int i = 0;
                int length2 = 0;
                while (matcher.find()) {
                    length2 += matcher.group().length();
                    i++;
                }
                if (i != 1 || length2 != length) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public static int LIZIZ(String str) {
        C09M2 c09m2 = LIZIZ;
        if (str != null && str.length() != 0) {
            try {
                int length = str.length();
                Matcher matcher = LIZJ.matcher(str);
                int length2 = 0;
                while (matcher.find()) {
                    length2 += matcher.group().length();
                }
                if (length2 != length) {
                    Matcher matcher2 = LIZ.matcher(str);
                    while (matcher2.find()) {
                        String strGroup = matcher2.group();
                        if (c09m2.LIZIZ(strGroup)) {
                            length2 += strGroup.length();
                        }
                    }
                    if (length2 != 0) {
                        if (length2 != length) {
                            return 2;
                        }
                        return 1;
                    }
                } else {
                    return 1;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return 0;
    }

    public static int LIZLLL(String str) {
        int i = 0;
        if (!TextUtils.isEmpty(str)) {
            while (LIZJ.matcher(str).find()) {
                i++;
            }
        }
        return i;
    }

    public static void LIZJ(TextView textView, TextWatcher textWatcher) throws Throwable {
        int selectionStart;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            boolean z = textView instanceof EditText;
            CharSequence text = textView.getText();
            List<C439890HMt> listLJ = LJ(textView.getContext(), text.toString());
            if (((ArrayList) listLJ).size() == 0) {
                return;
            }
            if (z) {
                selectionStart = textView.getSelectionStart();
            } else {
                selectionStart = 0;
            }
            CharSequence charSequenceLJFF = LJFF(text, textView.getLineHeight(), listLJ, new C439880HMs(textView, selectionStart));
            if (charSequenceLJFF == text) {
                return;
            }
            if (z) {
                Editable editableLLJJ = C2204961BRm.LLJJ(textView, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+lbJXHkjGUdDznQHqfM0WJvBCWivCSShefw28HoCotIiHIIzTzThl2i3yG3g==", null));
                if (editableLLJJ != null) {
                    if (textWatcher != null) {
                        textView.removeTextChangedListener(textWatcher);
                    }
                    editableLLJJ.replace(0, text.length(), charSequenceLJFF);
                    if (textWatcher != null) {
                        textView.addTextChangedListener(textWatcher);
                        return;
                    }
                    return;
                }
                return;
            }
            textView.setText(charSequenceLJFF);
        }
    }

    public static List<C439890HMt> LJ(Context context, String str) {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        if ((context != null || ((abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (context = abstractC1387200mCcLIZIZ.LIZIZ()) != null)) && !TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            Matcher matcher = LIZ.matcher(str);
            while (matcher.find()) {
                String strGroup = matcher.group();
                Drawable drawableLIZ = LIZIZ.LIZ(context, strGroup);
                if (drawableLIZ != null) {
                    arrayList.add(new C439890HMt(matcher.start(), matcher.end(), drawableLIZ, strGroup));
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public static CharSequence LJFF(CharSequence charSequence, int i, List list, C439880HMs c439880HMs) {
        int i2;
        boolean z;
        ArrayList<C439890HMt> arrayList = (ArrayList) list;
        if (arrayList.size() == 0) {
            return charSequence;
        }
        int size = arrayList.size();
        SpannableString spannableString = new SpannableString(charSequence);
        C0GVV[] c0gvvArr = (C0GVV[]) spannableString.getSpans(0, charSequence.length(), C0GVV.class);
        if (c0gvvArr != null && c0gvvArr.length > 0) {
            if (c0gvvArr.length != size) {
                z = true;
            } else {
                z = false;
            }
            int length = c0gvvArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                C0GVV c0gvv = c0gvvArr[i3];
                spannableString.removeSpan(c0gvv);
                if (i3 < size && !z) {
                    CharSequence charSequence2 = c0gvv.LLILLJJLI;
                    if (charSequence2 == null) {
                        charSequence2 = "";
                    }
                    if (!TextUtils.equals(charSequence2, ((C439890HMt) ListProtector.get(list, i3)).LIZJ)) {
                        z = true;
                    }
                }
            }
            if (!z) {
                return charSequence;
            }
        }
        for (C439890HMt c439890HMt : arrayList) {
            int i4 = c439890HMt.LIZ;
            int i5 = c439890HMt.LIZIZ;
            Drawable drawable = c439890HMt.LIZLLL;
            drawable.setBounds(0, 0, (int) ((i * ((drawable.getIntrinsicWidth() + 0.0f) / drawable.getIntrinsicHeight())) + 0.5f), i);
            C786410Ut5.p2(spannableString, new C0GVV(drawable, Integer.valueOf(i5 - i4), c439890HMt.LIZJ), i4, i5, 33);
            if (c439880HMs != null && (i2 = c439880HMs.LIZ) > i4 && i2 < i5) {
                TextView textView = c439880HMs.LIZIZ;
                if (textView instanceof EditText) {
                    ((EditText) textView).setSelection(i5);
                }
            }
        }
        return spannableString;
    }
}

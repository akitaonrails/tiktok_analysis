package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import j27.s;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0HMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439900HMu {
    public static final Pattern LIZ = PatternProtector.compile("(\\[)([^\\[\\]]+)(])");
    public static boolean LIZIZ;

    public static void LIZ(TextView textView) throws Throwable {
        ArrayList arrayList;
        int selectionStart;
        boolean z;
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        CharSequence text = textView.getText();
        Context context = textView.getContext();
        String string = text.toString();
        if (context != null && !TextUtils.isEmpty(string)) {
            arrayList = new ArrayList();
            Matcher matcher = LIZ.matcher(string);
            while (matcher.find()) {
                String strGroup = matcher.group();
                if (C439910HMv.LIZ().LIZ(context, strGroup) != null) {
                    arrayList.add(strGroup);
                }
            }
        } else {
            arrayList = new ArrayList();
        }
        int size = arrayList.size();
        if (!TextUtils.isEmpty(text) && size > 0) {
            SpannableString spannableString = new SpannableString(text);
            C0GVZ[] c0gvzArr = (C0GVZ[]) spannableString.getSpans(0, text.length(), C0GVZ.class);
            if (c0gvzArr != null && c0gvzArr.length > 0) {
                if (c0gvzArr.length != size) {
                    z = true;
                } else {
                    z = false;
                }
                int length = c0gvzArr.length;
                for (int i = 0; i < length; i++) {
                    C0GVZ c0gvz = c0gvzArr[i];
                    spannableString.removeSpan(c0gvz);
                    if (i < size && !z) {
                        CharSequence charSequence = c0gvz.LLILLJJLI;
                        if (charSequence == null) {
                            charSequence = "";
                        }
                        if (!TextUtils.equals(charSequence, (CharSequence) ListProtector.get(arrayList, i))) {
                            z = true;
                        }
                    }
                }
                if (!z) {
                    LIZIZ = false;
                    return;
                }
            }
            boolean z2 = textView instanceof EditText;
            if (z2) {
                selectionStart = textView.getSelectionStart();
            } else {
                selectionStart = 0;
            }
            C439920HMw c439920HMwLIZ = C439910HMv.LIZ();
            Matcher matcher2 = LIZ.matcher(text);
            while (matcher2.find()) {
                int iStart = matcher2.start();
                int iEnd = matcher2.end();
                String strGroup2 = matcher2.group();
                Drawable drawableLIZ = c439920HMwLIZ.LIZ(textView.getContext(), strGroup2);
                if (drawableLIZ != null) {
                    int lineHeight = textView.getLineHeight();
                    drawableLIZ.setBounds(0, 0, (int) ((lineHeight * ((drawableLIZ.getIntrinsicWidth() + 0.0f) / drawableLIZ.getIntrinsicHeight())) + 0.5f), lineHeight);
                    C786410Ut5.p2(spannableString, new C0GVZ(drawableLIZ, Integer.valueOf(iEnd - iStart), strGroup2), iStart, iEnd, 33);
                    if (selectionStart > iStart && selectionStart < iEnd && z2) {
                        ((EditText) textView).setSelection(iEnd);
                    }
                }
            }
            if (z2) {
                Editable editableLLJJ = C2204961BRm.LLJJ(textView, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxAO0OAqhcV8BYTnSvYJhgNS7HKf0OMHoUZ6vagQ4C", null));
                if (editableLLJJ != null) {
                    editableLLJJ.replace(0, text.length(), spannableString);
                }
            } else {
                textView.setText(spannableString);
            }
            LIZIZ = false;
            return;
        }
        LIZIZ = false;
    }

    public static CharSequence LIZIZ(s sVar, CharSequence charSequence, int i) {
        C439920HMw c439920HMwLIZ = C439910HMv.LIZ();
        Matcher matcher = LIZ.matcher(charSequence);
        SpannableString spannableString = new SpannableString(charSequence);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group();
            Drawable drawableLIZ = c439920HMwLIZ.LIZ(sVar, strGroup);
            if (drawableLIZ != null) {
                drawableLIZ.setBounds(0, 0, (int) ((i * ((drawableLIZ.getIntrinsicWidth() + 0.0f) / drawableLIZ.getIntrinsicHeight())) + 0.5f), i);
                C786410Ut5.p2(spannableString, new C0GVZ(drawableLIZ, Integer.valueOf(iEnd - iStart), strGroup), iStart, iEnd, 33);
            }
        }
        return spannableString;
    }
}

package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.09M2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09M2 implements C09M3 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(306));

    @Override // X.C09M3
    public final boolean LIZIZ(String str) {
        C09M3 c09m3 = (C09M3) this.LIZ.getValue();
        if (c09m3 != null && c09m3.LIZIZ(str)) {
            return true;
        }
        return false;
    }

    public final LinkedHashMap<String, Integer> LIZJ(CharSequence charSequence) {
        int iValueOf;
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        if (charSequence != null && charSequence.length() != 0) {
            Matcher matcher = C439870HMr.LIZ.matcher(charSequence);
            while (matcher.find()) {
                String strGroup = matcher.group();
                if (LIZIZ(strGroup)) {
                    Integer num = linkedHashMap.get(strGroup);
                    if (num != null && num.intValue() > 0) {
                        iValueOf = Integer.valueOf(num.intValue() + 1);
                    } else {
                        iValueOf = 1;
                    }
                    linkedHashMap.put(strGroup, iValueOf);
                }
            }
            return linkedHashMap;
        }
        return linkedHashMap;
    }

    @Override // X.C09M3
    public final Drawable LIZ(Context context, String str) {
        C09M3 c09m3 = (C09M3) this.LIZ.getValue();
        if (c09m3 != null) {
            return c09m3.LIZ(context, str);
        }
        return null;
    }
}

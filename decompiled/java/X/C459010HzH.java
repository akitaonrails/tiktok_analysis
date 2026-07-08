package X;

import com.bytedance.assem.arch.core.UIAssem;

/* JADX INFO: renamed from: X.0HzH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C459010HzH {
    public static final String LIZ(UIAssem uIAssem) {
        int iIntValue;
        Integer num;
        Object obj = uIAssem.getConfig().LLILZ.get("tag_count");
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        uIAssem.getConfig().LLILZ.put("tag_count", Integer.valueOf(iIntValue + 1));
        return String.valueOf(iIntValue);
    }
}

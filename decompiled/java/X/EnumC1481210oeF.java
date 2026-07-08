package X;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0oeF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1481210oeF {
    public static final EnumC1481210oeF INS;
    public static final /* synthetic */ EnumC1481210oeF[] LLILLJJLI;
    public final C1481220oeG LL = new LinkedHashMap<String, Integer>() { // from class: X.0oeG
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Integer> entry) {
            if (size() > 3) {
                return true;
            }
            return false;
        }
    };

    static {
        EnumC1481210oeF enumC1481210oeF = new EnumC1481210oeF();
        INS = enumC1481210oeF;
        LLILLJJLI = new EnumC1481210oeF[]{enumC1481210oeF};
    }

    public static EnumC1481210oeF[] values() {
        return (EnumC1481210oeF[]) LLILLJJLI.clone();
    }

    public static EnumC1481210oeF valueOf(String str) {
        return (EnumC1481210oeF) C08FF.LIZ(EnumC1481210oeF.class, str);
    }

    public int getPreRenderType(String str) {
        Integer num;
        if (TextUtils.isEmpty(str) || (num = get(str)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public void recordPreRenderAction(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        put(str, Integer.valueOf(i));
    }
}

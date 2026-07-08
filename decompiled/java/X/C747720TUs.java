package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.sticker.model.EffectAttribution;

/* JADX INFO: renamed from: X.0TUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747720TUs {
    public static final C1360500lVY LIZ(EffectAttribution effectAttribution, Context context) {
        C1360520lVa c1360520lVa = new C1360520lVa();
        Resources resources = context.getResources();
        String[] strArr = new String[2];
        String str = effectAttribution.author;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        strArr[0] = str;
        String str3 = effectAttribution.creator;
        if (str3 != null) {
            str2 = str3;
        }
        strArr[1] = str2;
        c1360520lVa.LIZ(resources, 2131833511, strArr);
        return c1360520lVa.LIZ;
    }
}

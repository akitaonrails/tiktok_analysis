package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;

/* JADX INFO: renamed from: X.03uO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C992603uO extends C09AY implements InterfaceC1631620sYq<Context, String, C1537480q70, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> {
    public C992603uO() {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB invoke(Context context, String str, C1537480q70 c1537480q70) {
        Context context2 = context;
        String str2 = str;
        C1537480q70 c1537480q702 = c1537480q70;
        if (c1537480q702 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q702;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context2, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str2);
        sparkContext2.usePreload = true;
        c1537900q7g2.getClass();
        return new C1541950qED(context2, sparkContext2).LIZ(false);
    }
}

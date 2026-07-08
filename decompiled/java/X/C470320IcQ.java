package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0IcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470320IcQ implements InterfaceC470300IcO {
    public static final C470320IcQ LIZ = new C470320IcQ();

    @Override // X.InterfaceC470300IcO
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZ(Context context, String str, String str2, boolean z, Function2<? super SparkContext, ? super Integer, Unit> function2) {
        return ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).Vn2(context, str, null, str2, z, function2);
    }
}

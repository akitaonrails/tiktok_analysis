package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS226S0300000_17;

/* JADX INFO: renamed from: X.0eXO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092560eXO extends FrameLayout {
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LL;
    public C1146360fwA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092560eXO(int i, int i2, Context context) {
        super(context, null, 0);
        i = (i2 & 8) != 0 ? 0 : i;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        if (i > 0) {
            getLayoutParams().height = C439101nJ.LIZ(i);
        }
    }

    public final void LIZ(C1146360fwA c1146360fwA, LifecycleOwner lifecycleOwner, Function0<Unit> function0) {
        if (c1146360fwA.LLILLL > 0) {
            getLayoutParams().height = C439101nJ.LIZ((int) c1146360fwA.LLILLL);
        }
        SparkContext sparkContextWZ0 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).wZ0(c1146360fwA.LL, lifecycleOwner);
        new AwS226S0300000_17(c1146360fwA, (C1146360fwA) this, (C1092560eXO) function0, (Function0<Unit>) 13).invoke(sparkContextWZ0);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJ(sparkContextWZ0);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJIIIIZZ();
        }
    }
}

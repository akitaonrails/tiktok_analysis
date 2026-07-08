package com.bytedance.android.live.browser;

import X.C006A;
import X.C19EG;
import X.C1BHX;
import X.InterfaceC1541990qEH;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.uikit.setting.LivePanelFrameworkSetting;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
public interface IHybridContainerService extends C006A {
    C1BHX D60(Context context, String str, Function1 function1);

    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB DU1(Context context, String str, LifecycleOwner lifecycleOwner, boolean z, Function1<? super SparkContext, Unit> function1);

    void ID1(Context context, String str);

    InterfaceC1541990qEH NN(Context context, String str, LifecycleOwner lifecycleOwner, boolean z, Function1<? super SparkContext, Unit> function1);

    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB Vn2(Context context, String str, LifecycleOwner lifecycleOwner, String str2, boolean z, Function2<? super SparkContext, ? super Integer, Unit> function2);

    SparkContext YC1(Context context, String str, Function1<? super SparkContext, Unit> function1);

    InterfaceC1541990qEH bD0(C19EG c19eg, String str, LifecycleOwner lifecycleOwner, String str2, boolean z, Function2 function2);

    LivePanelFrameworkSetting.AllowItem ed1(String str);

    SparkContext wZ0(String str, LifecycleOwner lifecycleOwner);
}

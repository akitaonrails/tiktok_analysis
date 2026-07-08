package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.15Ml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20507715Ml extends InterfaceC1010530cP5, InterfaceC856250XiR, InterfaceC1057310dcX<InterfaceC20508415Ms>, InterfaceC856520Xis {
    JSONArray K81();

    void KC(boolean z);

    Object Ob1(Fragment fragment, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn);

    void Tv1(Fragment fragment);

    JSONArray Xe();

    void c12(boolean z, boolean z2);

    void mg1(int i, boolean z, boolean z2);

    void oi1(String str);

    @Override // X.InterfaceC1057310dcX
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    /* synthetic */ void onCreate();

    @Override // X.InterfaceC1057310dcX
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    /* synthetic */ void onDestroy();

    @Override // X.InterfaceC1057310dcX
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    /* synthetic */ void onPause();

    @Override // X.InterfaceC1057310dcX
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    /* synthetic */ void onResume();

    @Override // X.InterfaceC1057310dcX
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    /* synthetic */ void onStart();

    @Override // X.InterfaceC1057310dcX
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    /* synthetic */ void onStop();

    void or2(Context context);
}

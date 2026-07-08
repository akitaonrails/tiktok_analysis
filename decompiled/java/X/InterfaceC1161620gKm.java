package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.hybrid.spark.raven.data.EventModel;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility;
import java.util.Map;

/* JADX INFO: renamed from: X.0gKm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public interface InterfaceC1161620gKm extends LifecycleOwner, InterfaceC1161510gKb {
    C1161870gLB Br();

    Map<String, EventModel> Hm(String str);

    IRavenEventAbility Ld1();

    int Lg();

    ViewOnAttachStateChangeListenerC20604515jv Lt();

    Fragment S8();

    <T> void Ts(String str, LifecycleOwner lifecycleOwner, Observer<T> observer);

    void as(String str);

    int hi(String str);

    void qv(String str, LifecycleOwner lifecycleOwner, Observer<C1161140gK0> observer);

    <T> T qw(String str);

    void refresh();

    boolean sk2(View view, MotionEvent motionEvent);
}

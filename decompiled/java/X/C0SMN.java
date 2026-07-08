package X;

import X.C0SMO;
import android.view.View;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ext_power_list.AssemReusedDispatcher;

/* JADX INFO: renamed from: X.0SMN, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public interface C0SMN<R extends C0SMO<R, ITEM>, ITEM> extends InterfaceC719640SKs, C0SMO<R, ITEM>, LifecycleEventObserver {
    C0RDF C41();

    AssemReusedDispatcher<R, ITEM> LJJJLL();

    ReusedUIAssem<?> NG1();

    void SN1(int i, ITEM item);

    void Sl0(View view, InterfaceC719640SKs interfaceC719640SKs);

    ViewModelStore md1();

    void wY0();
}

package androidx.lifecycle;

import X.C13BV;
import X.C2363109Nt;
import X.InterfaceC2363209Nu;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ProcessLifecycleInitializer implements InterfaceC2363209Nu<LifecycleOwner> {
    @Override // X.InterfaceC2363209Nu
    public List<Class<? extends InterfaceC2363209Nu<?>>> dependencies() {
        return C13BV.INSTANCE;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC2363209Nu
    public LifecycleOwner create(Context context) {
        if (((HashSet) C2363109Nt.LIZJ(context).LIZIZ).contains(ProcessLifecycleInitializer.class)) {
            LifecycleDispatcher.init(context);
            ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.Companion;
            companion.init$lifecycle_process_release(context);
            return companion.get();
        }
        "ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString();
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }
}

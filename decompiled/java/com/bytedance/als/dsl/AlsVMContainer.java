package com.bytedance.als.dsl;

import X.C0LFH;
import X.C1647230sy1;
import X.C1659700tI8;
import X.C19EG;
import X.C2188811AlT;
import androidx.lifecycle.ViewModel;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.scene.Scene;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class AlsVMContainer extends ViewModel {
    public C1647230sy1 LL = new C1647230sy1(0);
    public volatile FeatureAlsLogicContainer LLILLJJLI;
    public volatile OCAdapterViewModel LLILLL;
    public WeakReference<C19EG> LLILZ;
    public Class<? extends Scene> LLILZIL;

    public AlsVMContainer() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" AlsVMContainer instance create successfully");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" AlsVMContainer onCleared");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final synchronized void vQ2(Scene scene) {
        String name;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" AlsVMContainer checkSceneClass ");
        sbLIZ.append(scene);
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Class<? extends Scene> cls = this.LLILZIL;
        if (cls != null && !Intrinsics.LJFF(cls, scene.getClass())) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this);
            sbLIZ2.append(" AlsVMContainer checkSceneClass mismatch: found ");
            Class<? extends Scene> cls2 = this.LLILZIL;
            if (cls2 != null) {
                name = cls2.getName();
            } else {
                name = null;
            }
            sbLIZ2.append(name);
            sbLIZ2.append(" instead of ");
            sbLIZ2.append(scene.getClass().getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            C0LFH.LIZ(new AwS426S0200000_25(this, scene, 16));
        }
    }

    public final synchronized void wQ2(C19EG c19eg) {
        C19EG c19eg2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" AlsVMContainer resetIfNeeded ");
        sbLIZ.append(c19eg);
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        WeakReference<C19EG> weakReference = this.LLILZ;
        if (weakReference != null) {
            c19eg2 = weakReference.get();
        } else {
            c19eg2 = null;
        }
        if (!Intrinsics.LJFF(c19eg2, c19eg)) {
            this.LLILZ = new WeakReference<>(c19eg);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this);
            sbLIZ2.append(" AlsVMContainer _clear");
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            this.LLILLJJLI = null;
            this.LLILLL = null;
        }
    }

    public final synchronized void xQ2(Scene scene) {
        this.LLILZIL = scene.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" setSceneClass ");
        sbLIZ.append(scene);
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}

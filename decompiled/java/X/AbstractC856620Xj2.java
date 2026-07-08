package X;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.scene.Scene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC856620Xj2 implements InterfaceC20508015Mo {
    public final MutableLiveData<Boolean> LIZ = new MutableLiveData<>();

    @Override // X.InterfaceC20508415Ms
    public final void getDelegate() {
    }

    @Override // X.InterfaceC1000860c9U
    public final Context getContext() {
        return getScene().getSceneContext();
    }

    @Override // X.InterfaceC20507615Mk
    public final LifecycleOwner getLifecycleOwner() {
        return getScene();
    }

    @Override // X.C15MY, X.InterfaceC20508415Ms
    public final MutableLiveData<Boolean> LJII() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1065900dqO
    public void LJIIIZ(final InterfaceC856250XiR interfaceC856250XiR) {
        ((C19A3) LJJ()).registerChildSceneLifecycleCallbacks(new C0Y8U() { // from class: X.0Xj3
            @Override // X.C0Y8U, X.C19AH
            public final void LJJIII(Scene scene) {
                if (Intrinsics.LJFF(this.getScene(), scene)) {
                    interfaceC856250XiR.LIZJ();
                }
            }

            @Override // X.C0Y8U, X.C19AH
            public final void LJJI(Scene scene, Bundle bundle) {
                if (Intrinsics.LJFF(this.getScene(), scene)) {
                    interfaceC856250XiR.onViewCreated(scene.mView, bundle);
                }
            }
        }, true);
    }
}

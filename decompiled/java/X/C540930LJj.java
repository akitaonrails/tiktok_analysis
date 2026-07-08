package X;

import Y.AObserverS212S0100000_8;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveStateTransformationsKt$map$liveData$1;

/* JADX INFO: renamed from: X.0LJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C540930LJj<T> extends C385670FAf<T> {
    public final MutableLiveData<T> LIZ;

    @Override // X.C385670FAf
    public final T LIZJ() {
        return this.LIZ.getValue();
    }

    public C540930LJj(T t) {
        this.LIZ = new MutableLiveData<>(t);
    }

    @Override // X.C385670FAf, X.InterfaceC540980LJo
    public final void LIZIZ(InterfaceC1441305kZ<T> interfaceC1441305kZ) {
        this.LIZ.removeObserver(interfaceC1441305kZ);
    }

    @Override // X.C385670FAf
    public final void LIZLLL(InterfaceC1441305kZ<T> interfaceC1441305kZ) {
        this.LIZ.observeForever(interfaceC1441305kZ);
    }

    @Override // X.C385670FAf
    public void LJFF(T t) {
        this.LIZ.postValue(t);
    }

    @Override // X.C385670FAf
    public final void LJI(LifecycleOwner lifecycleOwner) {
        this.LIZ.removeObservers(lifecycleOwner);
    }

    public void LJII(T t) {
        this.LIZ.setValue(t);
    }

    public C540930LJj(LiveStateTransformationsKt$map$liveData$1 liveStateTransformationsKt$map$liveData$1) {
        this.LIZ = liveStateTransformationsKt$map$liveData$1;
    }

    @Override // X.C385670FAf, X.InterfaceC540980LJo
    public final void LIZ(LifecycleOwner lifecycleOwner, InterfaceC1441305kZ<T> interfaceC1441305kZ) {
        this.LIZ.observe(lifecycleOwner, interfaceC1441305kZ);
    }

    @Override // X.C385670FAf
    public final void LJ(LifecycleOwner lifecycleOwner, InterfaceC1441305kZ<T> interfaceC1441305kZ) {
        this.LIZ.observe(lifecycleOwner, new AObserverS212S0100000_8(interfaceC1441305kZ, 1));
    }
}

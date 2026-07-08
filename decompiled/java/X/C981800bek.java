package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0bek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981800bek extends C0TBZ<InterfaceC983900bi8> {
    public final LiveData<Boolean> LJIIIZ = Transformations.map(this.LJFF, new AwS582S0100000_3(this, 120));
    public final MutableLiveData<Boolean> LJIIJ;
    public final MutableLiveData LJIIJJI;
    public final MutableLiveData<Boolean> LJIIL;
    public final MutableLiveData LJIILIIL;

    public final long LIZLLL() {
        User owner;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZ);
        if (roomLJJLIIIIJ == null || (owner = roomLJJLIIIIJ.getOwner()) == null) {
            return 0L;
        }
        return owner.getId();
    }

    public C981800bek() {
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(bool);
        this.LJIIJ = mutableLiveData;
        this.LJIIJJI = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(bool);
        this.LJIIL = mutableLiveData2;
        this.LJIILIIL = mutableLiveData2;
    }

    @Override // X.C0TBZ, X.InterfaceC969510bKv
    public final void onCleared() {
        super.onCleared();
        MutableLiveData<Boolean> mutableLiveData = this.LJIIJ;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LJIIL.setValue(bool);
    }

    public final void LJ(EnumC981560beM enumC981560beM) {
        this.LJIIL.setValue(Boolean.TRUE);
        InterfaceC983900bi8 interfaceC983900bi8 = (InterfaceC983900bi8) this.LIZIZ;
        if (interfaceC983900bi8 != null) {
            interfaceC983900bi8.LJIILIIL(enumC981560beM);
        }
    }
}

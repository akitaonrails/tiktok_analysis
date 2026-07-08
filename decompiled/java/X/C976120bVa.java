package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0bVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976120bVa extends C0TW5 {
    public static final /* synthetic */ int LJIL = 0;
    public final LiveData<Boolean> LJIILIIL = Transformations.map(this.LJIIIIZZ, new AwS591S0100000_12(this, 1025));
    public final MutableLiveData<Boolean> LJIILJJIL;
    public final MutableLiveData LJIILL;
    public final MutableLiveData<Boolean> LJIILLIIL;
    public final MutableLiveData LJIIZILJ;
    public final MutableLiveData<C976770bWd> LJIJ;
    public final MutableLiveData LJIJI;
    public Integer LJIJJ;
    public Integer LJIJJLI;

    public final long LJIIJJI() {
        User owner;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZ);
        if (roomLJJLIIIIJ == null || (owner = roomLJJLIIIIJ.getOwner()) == null) {
            return 0L;
        }
        return owner.getId();
    }

    public C976120bVa() {
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(bool);
        this.LJIILJJIL = mutableLiveData;
        this.LJIILL = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(bool);
        this.LJIILLIIL = mutableLiveData2;
        this.LJIIZILJ = mutableLiveData2;
        MutableLiveData<C976770bWd> mutableLiveData3 = new MutableLiveData<>();
        this.LJIJ = mutableLiveData3;
        this.LJIJI = mutableLiveData3;
    }

    @Override // X.C0TW5, X.InterfaceC969510bKv
    public final void onCleared() {
        super.onCleared();
        MutableLiveData<Boolean> mutableLiveData = this.LJIILJJIL;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LJIILLIIL.setValue(bool);
        this.LJIJ.setValue(new C976770bWd(null, null, null, null));
        this.LJIJJ = null;
        this.LJIJJLI = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(final X.EnumC976390bW1 r26, final long r27, boolean r29) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C976120bVa.LJIIL(X.0bW1, long, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(int r24, final long r25, java.lang.Integer r27, final boolean r28) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C976120bVa.LJIIJ(int, long, java.lang.Integer, boolean):void");
    }
}

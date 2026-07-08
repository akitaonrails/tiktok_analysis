package X;

import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11tZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19645111tZ extends C301301Et {
    public static final /* synthetic */ int LJII = 0;
    public final AtomicReference<String> LIZJ = new AtomicReference<>(null);
    public final MutableLiveData<C19646511tn> LIZLLL = new MutableLiveData<>(null);
    public final MutableLiveData<EnumC19645411tc> LJ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJFF = new MutableLiveData<>(Boolean.FALSE);
    public C11JF LJI;

    static {
        new C19645211ta();
    }

    @Override // X.C301301Et
    public final void LIZIZ() {
        C11JF c11jf = this.LJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        super.LIZIZ();
    }
}

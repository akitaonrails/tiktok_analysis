package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;

/* JADX INFO: renamed from: X.0lip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368730lip {
    public static final /* synthetic */ C1368730lip LIZ = new C1368730lip();

    public static InterfaceC1368670lij LIZ(C1368320liA c1368320liA, int i) {
        final List<IMUser> batchContacts;
        C1365460ldY c1365460ldY = c1368320liA.LJIILJJIL;
        if (c1365460ldY != null && (batchContacts = c1365460ldY.getBatchContacts()) != null && !batchContacts.isEmpty()) {
            return new InterfaceC1368670lij(batchContacts) { // from class: X.0liq
                public final List<IMContact> LL;
                public final MutableLiveData<String> LLILLJJLI = new MutableLiveData<>();
                public final MutableLiveData<List<IMContact>> LLILLL = new MutableLiveData<>();
                public final MutableLiveData<C1368560liY> LLILZ = new MutableLiveData<>();
                public final MutableLiveData<List<IMContact>> LLILZIL = new MutableLiveData<>();
                public final MutableLiveData LLILZLL = new MutableLiveData();

                @Override // X.InterfaceC20688615xU
                public final void LIZIZ(String str, String str2) {
                }

                @Override // X.InterfaceC1368670lij, X.InterfaceC20688615xU
                public final void LJJZZIII(String str) {
                }

                @Override // X.InterfaceC1368670lij
                public final void LJLIIL(String str) {
                }

                @Override // X.InterfaceC1368670lij, X.InterfaceC20688615xU
                public final void onCleared() {
                }

                @Override // X.InterfaceC1368670lij, X.InterfaceC20688615xU
                public final void refresh() {
                }

                @Override // X.InterfaceC1368670lij, X.InterfaceC20688615xU
                public final void LJL() {
                    this.LLILZIL.setValue(this.LL);
                }

                @Override // X.InterfaceC20688615xU
                public final MutableLiveData LIZ() {
                    return this.LLILZIL;
                }

                @Override // X.InterfaceC20688615xU
                public final MutableLiveData LIZJ() {
                    return this.LLILLL;
                }

                @Override // X.InterfaceC20688615xU
                public final MutableLiveData LIZLLL() {
                    return this.LLILLJJLI;
                }

                @Override // X.InterfaceC1368670lij
                public final MutableLiveData<List<IMContact>> LJLI() {
                    return this.LLILZIL;
                }

                @Override // X.InterfaceC1368670lij
                public final MutableLiveData<String> LJLIIIL() {
                    return this.LLILLJJLI;
                }

                @Override // X.InterfaceC1368670lij
                public final MutableLiveData<List<IMContact>> LJLIL() {
                    return this.LLILLL;
                }

                @Override // X.InterfaceC1368670lij
                public final MutableLiveData<C1368560liY> LJLILLLLZI() {
                    return this.LLILZ;
                }

                @Override // X.InterfaceC1368670lij
                public final MutableLiveData getState() {
                    return this.LLILZLL;
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LL = batchContacts;
                }
            };
        }
        return new C1369220ljc(c1368320liA, i);
    }
}

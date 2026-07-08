package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;

/* JADX INFO: renamed from: X.0lhX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1367930lhX {
    public static final /* synthetic */ C1367930lhX LIZ = new C1367930lhX();

    public static InterfaceC1368700lim LIZ(C1367930lhX c1367930lhX, final List list, boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i) {
        boolean z10;
        boolean z11 = z9;
        boolean z12 = z8;
        boolean z13 = z7;
        boolean z14 = z6;
        boolean z15 = z5;
        if ((i & 64) != 0) {
            z15 = false;
        }
        if ((i & 128) != 0) {
            z14 = false;
        }
        if ((i & 256) != 0) {
            z13 = false;
        }
        if ((i & 512) != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((i & 1024) != 0) {
            z12 = false;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z11 = false;
        }
        c1367930lhX.getClass();
        if (list.isEmpty()) {
            return new C1367890lhT((C1381810m3v) C452501pT.LIZIZ(new C1368270li5(z4, z3, null, null, z11, Boolean.FALSE, z2, str, z14, z13, z10, z12)).getValue(), z, z2, z15);
        }
        return new InterfaceC1368700lim(list) { // from class: X.0lhY
            public final List<IMContact> LL;
            public final MutableLiveData<String> LLILLJJLI = new MutableLiveData<>();
            public final MutableLiveData<List<IMContact>> LLILLL = new MutableLiveData<>();
            public final MutableLiveData<List<IMContact>> LLILZ = new MutableLiveData<>();
            public final MutableLiveData LLILZIL = new MutableLiveData();

            @Override // X.InterfaceC1368700lim, X.InterfaceC20688615xU
            public final void LJJZZIII(String str2) {
            }

            @Override // X.InterfaceC1368700lim, X.InterfaceC20688615xU
            public final void onCleared() {
            }

            @Override // X.InterfaceC1368700lim, X.InterfaceC20688615xU
            public final void refresh() {
            }

            @Override // X.InterfaceC1368700lim, X.InterfaceC20688615xU
            public final void LJL() {
                this.LLILZ.setValue(this.LL);
            }

            @Override // X.InterfaceC1368700lim, X.InterfaceC20688615xU
            public final /* bridge */ /* synthetic */ MutableLiveData LIZ() {
                return this.LLILZ;
            }

            @Override // X.InterfaceC1368700lim, X.InterfaceC20688615xU
            public final /* bridge */ /* synthetic */ MutableLiveData LIZJ() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC1368700lim, X.InterfaceC20688615xU
            public final /* bridge */ /* synthetic */ MutableLiveData LIZLLL() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC1368700lim
            public final MutableLiveData getState() {
                return this.LLILZIL;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LL = list;
                new MutableLiveData();
            }
        };
    }
}

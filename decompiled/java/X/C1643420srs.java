package X;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.0srs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643420srs implements InterfaceC1623110sL7 {
    public final MutableLiveData<Boolean> LL = new MutableLiveData<>(Boolean.FALSE);

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 32785) {
            C01TT.LIZLLL(new C1643430srt(i2, i3, this));
        }
    }
}

package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0lhT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1367890lhT implements InterfaceC1368700lim, InterfaceC328360Cu2<IMContact>, InterfaceC1368140lhs {
    public static final /* synthetic */ int LLJ = 0;
    public final C1381810m3v LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final MutableLiveData<String> LLILZIL = new MutableLiveData<>();
    public final MutableLiveData<List<IMContact>> LLILZLL = new MutableLiveData<>();
    public final MutableLiveData<List<IMContact>> LLIZ;
    public final MutableLiveData<EnumC1367900lhU> LLIZLLLIL;

    @Override // X.InterfaceC328360Cu2
    public final void tg2(List<IMContact> list, boolean z) {
    }

    @Override // X.InterfaceC328360Cu2
    public final void ug(Throwable th) {
    }

    @Override // X.InterfaceC1368700lim, X.InterfaceC20688615xU
    public final void LJL() {
        C1381810m3v c1381810m3v = this.LL;
        c1381810m3v.LLILLJJLI = this;
        c1381810m3v.LLJIJIL = this;
    }

    @Override // X.InterfaceC1368700lim, X.InterfaceC20688615xU
    public final void onCleared() {
        C1381810m3v c1381810m3v = this.LL;
        c1381810m3v.LLILLJJLI = null;
        c1381810m3v.LIZJ();
    }

    @Override // X.InterfaceC1368700lim, X.InterfaceC20688615xU
    public final void refresh() {
        this.LLIZLLLIL.setValue(EnumC1367900lhU.LOADING);
        List<IMContact> listData = this.LL.data();
        if (!((ArrayList) listData).isEmpty()) {
            r61(listData, this.LL.LJIIJJI());
        } else {
            this.LL.LIZLLL();
        }
    }

    @Override // X.InterfaceC1368700lim, X.InterfaceC20688615xU
    public final /* bridge */ /* synthetic */ MutableLiveData LIZ() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1368700lim, X.InterfaceC20688615xU
    public final /* bridge */ /* synthetic */ MutableLiveData LIZJ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1368700lim, X.InterfaceC20688615xU
    public final /* bridge */ /* synthetic */ MutableLiveData LIZLLL() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1368700lim
    public final /* bridge */ /* synthetic */ MutableLiveData getState() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1368700lim, X.InterfaceC20688615xU
    public final void LJJZZIII(String str) {
        this.LLILZIL.setValue(str);
        if (str.length() == 0) {
            this.LLILZLL.setValue(C13BV.INSTANCE);
        } else {
            this.LL.LJJZZIII(str);
        }
    }

    @Override // X.InterfaceC328360Cu2
    public final void WD2(Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadError: ");
        sbLIZ.append(th.getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLIZLLLIL.setValue(EnumC1367900lhU.ERROR);
    }

    @Override // X.InterfaceC1368140lhs
    public final void tm2(Throwable th) {
        this.LLIZ.postValue(new ArrayList());
    }

    @Override // X.InterfaceC1368140lhs
    public final void qN2(String str, List list) {
        this.LLILZLL.setValue(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    @Override // X.InterfaceC328360Cu2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r61(java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1367890lhT.r61(java.util.List, boolean):void");
    }

    public C1367890lhT(C1381810m3v c1381810m3v, boolean z, boolean z2, boolean z3) {
        this.LL = c1381810m3v;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        new MutableLiveData();
        this.LLIZ = new MutableLiveData<>();
        this.LLIZLLLIL = new MutableLiveData<>(EnumC1367900lhU.INIT);
    }

    @Override // X.InterfaceC1368140lhs
    public final void bK(List<IMContact> list, String str, Integer num, Double d, Double d2) {
        qN2(str, list);
    }
}

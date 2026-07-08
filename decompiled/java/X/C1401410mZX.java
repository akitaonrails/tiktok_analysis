package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0mZX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1401410mZX extends C1255920ims<C116F> {
    public final MutableLiveData<C1EBL> LLILZIL;
    public final MutableLiveData LLILZLL;

    public C1401410mZX() {
        MutableLiveData<C1EBL> mutableLiveData = new MutableLiveData<>();
        this.LLILZIL = mutableLiveData;
        this.LLILZLL = mutableLiveData;
        this.LLILLJJLI = new InterfaceC1212360hec<Aweme>() { // from class: X.1EBK
            @Override // X.InterfaceC1212360hec
            public final /* synthetic */ void SY() {
            }

            @Override // X.InterfaceC1212360hec
            public final /* synthetic */ void zK() {
                throw null;
            }

            @Override // X.InterfaceC1212360hec
            public final void Jm() {
                this.LL.LLILZIL.setValue(C1EBR.LIZ);
            }

            @Override // X.InterfaceC1212360hec
            public final void LJ() {
                this.LL.LLILZIL.setValue(C1EBT.LIZ);
            }

            @Override // X.InterfaceC1212360hec
            public final void Ng1() {
                this.LL.LLILZIL.setValue(C1EBQ.LIZ);
            }

            @Override // X.InterfaceC1212360hec
            public final void showLoadMoreLoading() {
                this.LL.LLILZIL.setValue(C1EBS.LIZ);
            }

            @Override // X.InterfaceC1212360hec
            public final void Uq2(Exception exc) {
                this.LL.LLILZIL.setValue(new C1EBN(exc));
            }

            @Override // X.InterfaceC1212360hec
            public final void Wi(Exception exc) {
                this.LL.LLILZIL.setValue(new C1EBP(exc));
            }

            @Override // X.InterfaceC1212360hec
            public final void bD1(Exception exc) {
                this.LL.LLILZIL.setValue(new C1EBO(exc));
            }

            @Override // X.InterfaceC1212360hec
            public final void LLJJJIL(List<Aweme> list, boolean z) {
                this.LL.LLILZIL.setValue(new C1EBJ(list, z));
            }

            @Override // X.InterfaceC1212360hec
            public final void Pj(List<Aweme> list, boolean z) {
                this.LL.LLILZIL.setValue(new C1EBI(list, z));
            }

            @Override // X.InterfaceC1212360hec
            public final void mE(List<Aweme> list, boolean z) {
                this.LL.LLILZIL.setValue(new C1EBM(list, z));
            }
        };
    }
}

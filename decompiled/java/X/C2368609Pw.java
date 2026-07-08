package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.ugc.appcontext.page.PageObservable$subscribe$observer$1;

/* JADX INFO: renamed from: X.09Pw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2368609Pw<T> extends C11NZ<T> {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final C11NZ<T> LL;

    public C2368609Pw(C11NZ<T> c11nz) {
        this.LL = c11nz;
    }

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        this.LL.LIZIZ(interfaceC626120Oh8);
    }

    public final C11JF LJLLLLLL(C09JN c09jn) {
        return (C11JF) this.LL.LJJLJLI(c09jn);
    }

    public final void LJLLLL(Lifecycle lifecycle, C09JN c09jn) {
        lifecycle.addObserver(new PageObservable$subscribe$observer$1((C11JF) this.LL.LJJLJLI(c09jn)));
    }
}

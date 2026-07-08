package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.0Icv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470630Icv<CacheKey, T> implements InterfaceC470830IdF<T> {
    public final LiveData<C1A6I<T>> LIZ;
    public final MutableLiveData<C470770Id9> LIZIZ;
    public final MutableLiveData<C470770Id9> LIZJ;
    public final MutableLiveData<Boolean> LIZLLL;
    public final C11RK<Object> LJ;
    public final C11RK<Object> LJFF;
    public final C11RK<Object> LJI;
    public final MutableLiveData<Integer> LJII;
    public final MutableLiveData<Boolean> LJIIIIZZ;
    public final InterfaceC470700Id2<CacheKey, T> LJIIIZ;
    public final CacheKey LJIIJ;

    public C470630Icv(C470610Ict<CacheKey, T> c470610Ict, LiveData<C1A6I<T>> liveData) {
        this.LIZIZ = c470610Ict.LIZ;
        this.LIZJ = c470610Ict.LIZIZ;
        this.LJIIIIZZ = c470610Ict.LIZJ;
        this.LJ = c470610Ict.LJ;
        this.LJFF = c470610Ict.LJFF;
        this.LJI = c470610Ict.LJI;
        this.LIZ = liveData;
        this.LIZLLL = c470610Ict.LIZLLL;
        this.LJII = c470610Ict.LJIIIZ;
        this.LJIIJ = c470610Ict.LJIIJJI;
        this.LJIIIZ = c470610Ict.LJIIL;
    }
}

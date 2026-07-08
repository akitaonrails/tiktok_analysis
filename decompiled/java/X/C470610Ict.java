package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0Ict, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470610Ict<CacheKey, V> {
    public static final C476690Imh LJIILLIIL;
    public CacheKey LJIIJJI;
    public InterfaceC470700Id2<CacheKey, V> LJIIL;
    public InterfaceC470710Id3<CacheKey, FeedExtra> LJIILIIL;
    public C0IZH<V> LJIILL;
    public final MutableLiveData<C470770Id9> LIZ = new MutableLiveData<>();
    public final MutableLiveData<C470770Id9> LIZIZ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LIZJ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LIZLLL = new MutableLiveData<>();
    public final C11RK<Object> LJ = new C11RK<>();
    public final C11RK<Object> LJFF = new C11RK<>();
    public final C11RK<Object> LJI = new C11RK<>();
    public volatile boolean LJII = false;
    public volatile boolean LJIIIIZZ = false;
    public final MutableLiveData<Integer> LJIIIZ = new MutableLiveData<>();
    public final AtomicLong LJIIJ = new AtomicLong(0);
    public C476690Imh LJIILJJIL = LJIILLIIL;

    static {
        C470620Icu c470620Icu = new C470620Icu();
        c470620Icu.LIZLLL = false;
        c470620Icu.LIZ = 12;
        c470620Icu.LIZIZ = 12;
        LJIILLIIL = c470620Icu.LIZ();
    }
}

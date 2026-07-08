package X;

import Y.AfS103S0300000_7;
import Y.AfS132S0000000_7;
import Y.AfS143S0200000_7;
import Y.AfS176S0100000_7;
import Y.AfS2S0200100_7;
import Y.AfS3S0200200_7;
import android.os.SystemClock;
import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Ics, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470600Ics<CacheKey, V> extends AbstractC485060J0m<Long, V> implements InterfaceC470920IdO {
    public final CacheKey LJFF;
    public final InterfaceC470700Id2<CacheKey, V> LJI;
    public final InterfaceC470710Id3<CacheKey, FeedExtra> LJII;
    public final MutableLiveData<C470770Id9> LJIIIIZZ;
    public final MutableLiveData<C470770Id9> LJIIIZ;
    public final MutableLiveData<Boolean> LJIIJ;
    public final MutableLiveData<Boolean> LJIIJJI;
    public final C470610Ict<CacheKey, V> LJIIL;
    public final C0IZH<V> LJIILIIL;
    public final long LJIILJJIL;
    public Runnable LJIILL;
    public final C11NJ LJIILLIIL;

    @Override // X.AbstractC485060J0m
    public final void LJIIJJI(C485090J0p c485090J0p) {
    }

    @Override // X.InterfaceC470920IdO
    public final void LIZ() {
        this.LJIILLIIL.LJ();
        LJFF(this);
    }

    public final boolean LJIILL() {
        boolean z;
        synchronized (this.LJIIL) {
            try {
                z = this.LJIILJJIL == this.LJIIL.LJIIJ.get();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public C470600Ics(C470610Ict<CacheKey, V> c470610Ict) {
        C11NJ c11nj = new C11NJ();
        this.LJIILLIIL = c11nj;
        this.LJFF = c470610Ict.LJIIJJI;
        this.LJI = c470610Ict.LJIIL;
        this.LJII = c470610Ict.LJIILIIL;
        this.LJIIIZ = c470610Ict.LIZIZ;
        this.LJIIIIZZ = c470610Ict.LIZ;
        this.LJIIJ = c470610Ict.LIZJ;
        this.LJIIJJI = c470610Ict.LIZLLL;
        this.LJIIL = c470610Ict;
        this.LJIILIIL = c470610Ict.LJIILL;
        this.LJIILJJIL = c470610Ict.LJIIJ.incrementAndGet();
        c11nj.LIZ(c470610Ict.LJFF.LJJLL(new AfS176S0100000_7(this, 220), new AfS132S0000000_7(30)));
        c11nj.LIZ(c470610Ict.LJ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS143S0200000_7((Object) this, (EmoteModel) c470610Ict, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 27), new AfS132S0000000_7(30)));
        c11nj.LIZ(c470610Ict.LJI.LJJLJLI(new AfS176S0100000_7(this, 221)));
        LIZIZ(this);
    }

    public static Long LJIILLIIL(FeedExtra feedExtra) {
        if (feedExtra != null && feedExtra.hasMore) {
            return Long.valueOf(feedExtra.maxTime);
        }
        return null;
    }

    @Override // X.AbstractC485060J0m
    public final void LJIIJ(C471830Ier<Long> c471830Ier, AbstractC470790IdB<Long, V> abstractC470790IdB) {
        if (this.LJIIL.LJII) {
            return;
        }
        this.LJIIIIZZ.postValue(C470770Id9.LIZIZ);
        this.LJIILL = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LJIILLIIL.LIZ(this.LJIILIIL.LIZ(c471830Ier.LIZ, false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS2S0200100_7(jCurrentTimeMillis, this, abstractC470790IdB, 9), new AfS103S0300000_7(abstractC470790IdB, this, c471830Ier, 18)));
    }

    @Override // X.AbstractC485060J0m
    public final void LJIIL(C485050J0l<Long> c485050J0l, AbstractC470800IdC<Long, V> abstractC470800IdC) {
        if (!LJIILL()) {
            C20441214yg.LIZIZ("RxCacheDataSource", "load initial not my generation ");
            return;
        }
        boolean z = false;
        if (this.LJIIL.LJIIIIZZ) {
            this.LJIIL.LJIIIIZZ = false;
            this.LJIIL.LJII = true;
        }
        MutableLiveData<C470770Id9> mutableLiveData = this.LJIIIZ;
        C470770Id9 c470770Id9 = C470770Id9.LIZIZ;
        mutableLiveData.postValue(c470770Id9);
        this.LJIIIIZZ.postValue(c470770Id9);
        this.LJIILL = null;
        List<V> list = this.LJI.get(this.LJFF);
        if (!C0IKQ.LIZ(list)) {
            FeedExtra feedExtra = this.LJII.get(this.LJFF);
            abstractC470800IdC.LIZ(LJIILLIIL(feedExtra), new ArrayList(list));
            if (this.LJIIL.LJII) {
                LJIILJJIL(this.LJIILIIL.LIZ(null, true), c485050J0l, abstractC470800IdC);
                return;
            }
            this.LJIIJJI.postValue(Boolean.FALSE);
            MutableLiveData<Boolean> mutableLiveData2 = this.LJIIJ;
            if (LJIILLIIL(feedExtra) != null) {
                z = true;
            }
            mutableLiveData2.postValue(Boolean.valueOf(z));
            MutableLiveData<C470770Id9> mutableLiveData3 = this.LJIIIZ;
            C470770Id9 c470770Id92 = C470770Id9.LIZJ;
            mutableLiveData3.postValue(c470770Id92);
            this.LJIIIIZZ.postValue(c470770Id92);
            return;
        }
        LJIILJJIL(this.LJIILIIL.LIZ(null, true), c485050J0l, abstractC470800IdC);
    }

    public final List<V> LJIIZILJ(List<V> list, FeedExtra feedExtra) {
        this.LJII.put(this.LJFF, feedExtra);
        return this.LJI.LIZLLL(this.LJFF, new ArrayList(list));
    }

    public final void LJIILJJIL(C11NZ<C0ITM<Pair<List<V>, FeedExtra>>> c11nz, C485050J0l<Long> c485050J0l, AbstractC470800IdC<Long, V> abstractC470800IdC) {
        if (c11nz == null) {
            MutableLiveData<C470770Id9> mutableLiveData = this.LJIIIZ;
            C470770Id9 c470770Id9 = C470770Id9.LIZJ;
            mutableLiveData.postValue(c470770Id9);
            this.LJIIIIZZ.postValue(c470770Id9);
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.LJIILLIIL.LIZ(c11nz.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS3S0200200_7(this, System.currentTimeMillis(), jElapsedRealtime, abstractC470800IdC, 2), new AfS103S0300000_7(abstractC470800IdC, this, c485050J0l, 19)));
    }
}

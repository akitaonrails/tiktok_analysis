package X;

import android.os.Looper;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1455340nyW implements InterfaceC1456360o0A {
    public CountDownLatch LIZIZ;
    public CoverNewItem LIZLLL;
    public final String LIZ = "publish_cover_generate_tag";
    public final List<Runnable> LIZJ = Collections.synchronizedList(new ArrayList());

    @Override // X.InterfaceC1456360o0A
    public final void LIZJ() {
        this.LIZLLL = null;
        this.LIZIZ = new CountDownLatch(1);
        C524780Ki4.LIZ.start(this.LIZ, "generate cover start");
    }

    @Override // X.InterfaceC1456360o0A
    public final CoverNewItem LIZIZ() {
        CoverNewItem coverNewItem = this.LIZLLL;
        this.LIZLLL = null;
        return coverNewItem;
    }

    @Override // X.InterfaceC1456360o0A
    public final boolean LJ() {
        CountDownLatch countDownLatch = this.LIZIZ;
        return countDownLatch == null || countDownLatch.getCount() == 0;
    }

    @Override // X.InterfaceC1456360o0A
    public final boolean LIZ(long j) {
        CountDownLatch countDownLatch = this.LIZIZ;
        boolean zAwait = true;
        if (countDownLatch == null) {
            return true;
        }
        try {
            zAwait = countDownLatch.await(j, TimeUnit.MILLISECONDS);
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        this.LIZIZ = null;
        return zAwait;
    }

    @Override // X.InterfaceC1456360o0A
    public final void LIZLLL(CoverNewItem coverNewItem) {
        this.LIZLLL = coverNewItem;
        C524780Ki4.LIZ.step(this.LIZ, "generate cover end");
        CountDownLatch countDownLatch = this.LIZIZ;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            Iterator<Runnable> it2 = this.LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().run();
            }
        } else {
            Iterator<Runnable> it3 = this.LIZJ.iterator();
            while (it3.hasNext()) {
                ExecutorC1592406Li.LLILLJJLI.execute(it3.next());
            }
        }
        this.LIZJ.clear();
        C524780Ki4.LIZ.end(this.LIZ, "generate cover clear task");
    }

    public final synchronized void LJFF(Runnable runnable) {
        if (LJ()) {
            runnable.run();
        } else {
            this.LIZJ.add(runnable);
        }
    }
}

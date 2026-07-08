package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0khM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329380khM extends AbstractC1327750kej {
    public C1329440khS LL;
    public final C1329360khK LLILLJJLI;

    public final synchronized InterfaceC1329600khi LIZ() {
        return isClosed() ? null : this.LL.LIZ;
    }

    public final synchronized C1329440khS LIZIZ() {
        return this.LL;
    }

    @Override // X.AbstractC1327750kej, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                C1329440khS c1329440khS = this.LL;
                if (c1329440khS == null) {
                    return;
                }
                this.LL = null;
                c1329440khS.LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1330440kj4
    public final synchronized int getHeight() {
        return isClosed() ? 0 : this.LL.LIZ.getHeight();
    }

    @Override // X.InterfaceC1330440kj4
    public final synchronized int getImageCount() {
        return this.LL.LIZ.getFrameCount();
    }

    @Override // X.AbstractC1327750kej
    public final synchronized int getSizeInBytes() {
        return isClosed() ? 0 : this.LL.LIZ.getSizeInBytes();
    }

    @Override // X.InterfaceC1330440kj4
    public final synchronized int getWidth() {
        return isClosed() ? 0 : this.LL.LIZ.getWidth();
    }

    @Override // X.AbstractC1327750kej
    public final synchronized boolean isClosed() {
        return this.LL == null;
    }

    @Override // X.AbstractC1327750kej
    public final boolean isStateful() {
        return true;
    }

    @Override // X.AbstractC1327750kej
    public final String getSourceUri() {
        C1329440khS c1329440khS = this.LL;
        if (c1329440khS != null) {
            return c1329440khS.LJ;
        }
        return null;
    }

    @Override // X.AbstractC1327750kej
    public final AbstractC1327750kej cloneOrNull() {
        InterfaceC1329600khi interfaceC1329600khiCloneOrNull;
        C1323050kX9 c1323050kX9LJFF;
        InterfaceC1329600khi interfaceC1329600khiLIZ = LIZ();
        if (interfaceC1329600khiLIZ == null || (interfaceC1329600khiCloneOrNull = interfaceC1329600khiLIZ.cloneOrNull()) == null) {
            return null;
        }
        C1329360khK c1329360khK = this.LLILLJJLI;
        C1330000kiM imageFormat = getImageFormat();
        C1329440khS c1329440khSLIZIZ = LIZIZ();
        int i = c1329440khSLIZIZ.LIZIZ;
        synchronized (c1329440khSLIZIZ) {
            c1323050kX9LJFF = C1323050kX9.LJFF(c1329440khSLIZIZ.LIZJ);
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            try {
                arrayList.add(c1329440khSLIZIZ.LIZIZ(i2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1323050kX9.LJII(c1323050kX9LJFF);
                C1323050kX9.LJI(arrayList);
                throw th;
            }
        }
        C1329460khU c1329460khU = new C1329460khU(interfaceC1329600khiCloneOrNull);
        c1329460khU.LIZIZ = C1323050kX9.LJFF(c1323050kX9LJFF);
        c1329460khU.LIZLLL = i;
        c1329460khU.LIZJ = C1323050kX9.LIZIZ(arrayList);
        c1329460khU.LJ = c1329360khK.LJIILJJIL;
        C1329380khM c1329380khM = new C1329380khM(c1329460khU.LIZ(), c1329360khK, imageFormat);
        C1323050kX9.LJII(c1323050kX9LJFF);
        C1323050kX9.LJI(arrayList);
        return c1329380khM;
    }

    @Override // X.AbstractC1327750kej
    public final void setSourceUri(String str) {
        C1329440khS c1329440khS = this.LL;
        if (c1329440khS != null) {
            if (c1329440khS.LIZ.getImageFormat() == C1328580kg4.LJIIIZ || c1329440khS.LIZ.getImageFormat() == C1328580kg4.LIZJ) {
                c1329440khS.LJ = str;
            }
        }
    }

    public C1329380khM(C1329440khS c1329440khS, C1329360khK c1329360khK, C1330000kiM c1330000kiM) {
        this.LL = c1329440khS;
        this.LLILLJJLI = c1329360khK;
        this.mImageFormat = c1330000kiM;
    }
}

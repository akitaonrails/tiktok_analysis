package X;

import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0ooo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487760ooo {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final List<HandlerThreadC1487770oop> LJFF;
    public final List<HandlerThreadC1487770oop> LJI;

    public final void LIZLLL() {
        Iterator<HandlerThreadC1487770oop> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().quitSafely();
        }
        Iterator<HandlerThreadC1487770oop> it3 = this.LJI.iterator();
        while (it3.hasNext()) {
            it3.next().quitSafely();
        }
        this.LJFF.clear();
        this.LJI.clear();
    }

    public C1487760ooo(C1487790oor c1487790oor) {
        int i = c1487790oor.LIZ;
        this.LIZ = i;
        int i2 = c1487790oor.LIZIZ;
        this.LIZIZ = i2;
        int i3 = c1487790oor.LJFF;
        this.LIZJ = i3;
        int i4 = c1487790oor.LJI;
        this.LIZLLL = i4;
        this.LJ = c1487790oor.LJ;
        if (c1487790oor.LJII) {
            this.LJFF = new CopyOnWriteArrayList();
            this.LJI = new CopyOnWriteArrayList();
        } else {
            this.LJFF = new ArrayList();
            this.LJI = new ArrayList();
        }
        if (C1487750oon.LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HandlerThreadPool initThreadPool, corePoolSize ");
            sbLIZ.append(i);
            sbLIZ.append(", maxPoolSize ");
            sbLIZ.append(i2);
            sbLIZ.append(", liveHandlerThreadPriority ");
            sbLIZ.append(i4);
            sbLIZ.append(", vodHandlerThreadPriority ");
            sbLIZ.append(i3);
            C1487750oon.LIZ("MediaLogger", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i > 0) {
            try {
                HandlerThreadC1487770oop handlerThreadC1487770oop = new HandlerThreadC1487770oop("media_thread_0", 0);
                handlerThreadC1487770oop.start();
                this.LJFF.add(handlerThreadC1487770oop);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (C1487750oon.LIZIZ() && C1487750oon.LIZ != null) {
                    C1481110oe5.LIZIZ("MediaLogger", " initThreadPool fail!");
                }
            }
        }
    }

    public final void LIZIZ(EnumC1482310og1 enumC1482310og1) {
        if (C1487750oon.LIZIZ()) {
            C1487750oon.LIZ("MediaLogger", "extendThreadPool");
        }
        int size = this.LJFF.size() + this.LJI.size();
        try {
            int i = this.LIZJ;
            if (enumC1482310og1 == EnumC1482310og1.LIVE) {
                i = this.LIZLLL;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("media_thread_extend");
            sbLIZ.append(size);
            HandlerThreadC1487770oop handlerThreadC1487770oop = new HandlerThreadC1487770oop(C2188811AlT.LIZIZ(sbLIZ), i);
            handlerThreadC1487770oop.start();
            this.LJFF.add(handlerThreadC1487770oop);
            if (C1487750oon.LIZIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("extend ThreadPool now index: ");
                sbLIZ2.append(size);
                sbLIZ2.append(", ");
                sbLIZ2.append(enumC1482310og1.getValue());
                sbLIZ2.append(", ");
                sbLIZ2.append(i);
                C1487750oon.LIZ("MediaLogger", C2188811AlT.LIZIZ(sbLIZ2));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C1487750oon.LIZIZ() && C1487750oon.LIZ != null) {
                C1481110oe5.LIZIZ("MediaLogger", "create extend thread fail");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Boolean, X.HandlerThreadC1487770oop> LIZ(X.EnumC1482310og1 r10, long r11) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1487760ooo.LIZ(X.0og1, long):kotlin.Pair");
    }

    public final void LIZJ(HandlerThread handlerThread, String str) {
        if (C1487750oon.LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recycleHandlerThread: acquireId ");
            sbLIZ.append(str);
            C1487750oon.LIZ("MediaLogger", C2188811AlT.LIZIZ(sbLIZ));
        }
        for (HandlerThreadC1487770oop handlerThreadC1487770oop : this.LJI) {
            if (handlerThreadC1487770oop != null && ((ArrayList) handlerThreadC1487770oop.LL).contains(str) && handlerThreadC1487770oop.getThreadId() == handlerThread.getThreadId()) {
                ((ArrayList) handlerThreadC1487770oop.LL).remove(str);
                if (C1487750oon.LIZIZ()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("recycleHandlerThread: remove acquireId ");
                    sbLIZ2.append(str);
                    C1487750oon.LIZ("MediaLogger", C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (((ArrayList) handlerThreadC1487770oop.LL).isEmpty()) {
                    if (this.LJFF.size() >= this.LIZ && handlerThreadC1487770oop.getLooper() != Looper.getMainLooper()) {
                        handlerThreadC1487770oop.quitSafely();
                        if (C1487750oon.LIZIZ()) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("recycleHandlerThread: quit thread ");
                            sbLIZ3.append(handlerThreadC1487770oop.getName());
                            C1487750oon.LIZ("MediaLogger", C2188811AlT.LIZIZ(sbLIZ3));
                        }
                        this.LJI.remove(handlerThreadC1487770oop);
                        return;
                    }
                    if (C1487750oon.LIZIZ()) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("recycleHandlerThread: recycle handlerthread ");
                        sbLIZ4.append(str);
                        C1487750oon.LIZ("MediaLogger", C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    this.LJFF.add(handlerThreadC1487770oop);
                    this.LJI.remove(handlerThreadC1487770oop);
                    if (C1487750oon.LIZIZ()) {
                        C1487780ooq.LIZ(handlerThreadC1487770oop.getLooper());
                    }
                    if (C1487750oon.LIZIZ()) {
                        C1487750oon.LIZ("MediaLogger", "do not Update thread priority when recycle");
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }
}

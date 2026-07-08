package X;

import X.AbstractC1313260kHM;
import android.graphics.Bitmap;
import com.lynx.react.bridge.ReadableArray;
import j27.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0kHQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1313300kHQ<T extends AbstractC1313260kHM<?>> {
    public final s LIZ;
    public T LIZIZ;
    public C1314390kJB LIZJ;
    public float LIZLLL;

    public abstract T LIZ();

    public final T LIZIZ() {
        if (this.LIZIZ == null) {
            this.LIZIZ = (T) LIZ();
            this.LIZIZ.setCallback(this.LIZJ);
        }
        return this.LIZIZ;
    }

    public final void LIZJ() {
        T t = this.LIZIZ;
        if (t == null) {
            return;
        }
        Iterator it2 = ((ArrayList) t.LJ.LL).iterator();
        while (it2.hasNext()) {
            ((AbstractC1313950kIT) it2.next()).LIZLLL();
        }
    }

    public final void LIZLLL() {
        T t = this.LIZIZ;
        if (t == null) {
            return;
        }
        Iterator it2 = ((ArrayList) t.LJ.LL).iterator();
        while (it2.hasNext()) {
            ((AbstractC1313950kIT) it2.next()).LJ();
        }
    }

    public final void LJ() {
        T t = this.LIZIZ;
        if (t != null) {
            Iterator it2 = ((ArrayList) t.LJ.LL).iterator();
            while (it2.hasNext()) {
                ((AbstractC1313950kIT) it2.next()).LJFF();
            }
        }
    }

    public AbstractC1313300kHQ(s sVar) {
        this.LIZ = sVar;
    }

    public final void LJFF(Bitmap.Config config) {
        T t = LIZIZ().LJ;
        if (t != 0) {
            t.LLJ = config;
            List<AbstractC1313950kIT> list = t.LL;
            if (list != null) {
                for (AbstractC1313950kIT abstractC1313950kIT : (ArrayList) list) {
                    if (abstractC1313950kIT != null) {
                        abstractC1313950kIT.LJII(t.LLJ);
                    }
                }
            }
        }
    }

    public final void LJI(ReadableArray readableArray) {
        T t = LIZIZ().LJ;
        ((ArrayList) t.LLILZ).clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                int i2 = readableArray.getInt(i);
                if (i2 >= 0 && i2 <= 4) {
                    ((ArrayList) t.LLILZ).add(Integer.valueOf(i2));
                } else {
                    ((ArrayList) t.LLILZ).add(1);
                }
            }
        }
    }

    public final void LJII(ReadableArray readableArray) {
        T t = LIZIZ().LJ;
        ((ArrayList) t.LLILLL).clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                int i2 = readableArray.getInt(i);
                if (i2 < 0 || i2 > 2) {
                    i2 = 1;
                }
                ((ArrayList) t.LLILLL).add(Integer.valueOf(i2));
            }
        }
    }

    public final void LJIIIIZZ(ReadableArray readableArray) {
        T t = LIZIZ().LJ;
        ((ArrayList) t.LLILLJJLI).clear();
        if (readableArray != null && readableArray.size() % 2 == 0) {
            for (int i = 0; i < readableArray.size(); i += 2) {
                int i2 = readableArray.getInt(i + 1);
                ((ArrayList) t.LLILLJJLI).add(new C1314490kJL(readableArray.getDynamic(i), i2));
            }
        }
    }

    public final void LJIIIZ(ReadableArray readableArray) {
        T t = LIZIZ().LJ;
        ((ArrayList) t.LLILZIL).clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                ((ArrayList) t.LLILZIL).add(EnumC1314080kIg.valueOf(readableArray.getInt(i)));
            }
        }
    }

    public final void LJIIJ(ReadableArray readableArray) {
        T t = LIZIZ().LJ;
        ((ArrayList) t.LLILZLL).clear();
        if (readableArray != null && readableArray.size() % 2 == 0) {
            int size = readableArray.size();
            for (int i = 0; i < size; i += 2) {
                ((ArrayList) t.LLILZLL).add(new C1314500kJM(readableArray.getDynamic(i), readableArray.getInt(i + 1)));
            }
        }
    }
}

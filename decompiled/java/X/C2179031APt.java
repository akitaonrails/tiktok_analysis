package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.1APt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179031APt {
    public final String LIZ;
    public final Random LIZIZ;
    public C1968707nR LIZJ;
    public C1968707nR LIZLLL;
    public final ReentrantLock LJ = new ReentrantLock();
    public final List<String> LJFF = new ArrayList(10);
    public final List<String> LJI;
    public String LJII;

    public final boolean LIZ() {
        ((ArrayList) this.LJFF).clear();
        C1968707nR c1968707nR = this.LIZJ;
        if (c1968707nR == null || this.LIZLLL == null) {
            return false;
        }
        if (((ArrayList) c1968707nR.LIZIZ).size() > 5) {
            ((ArrayList) this.LJFF).addAll(((ArrayList) this.LIZJ.LIZIZ).subList(0, 5));
        } else {
            ((ArrayList) this.LJFF).addAll(this.LIZJ.LIZIZ);
        }
        ArrayList arrayList = new ArrayList(this.LIZLLL.LIZIZ);
        arrayList.removeAll(this.LIZJ.LIZIZ);
        int size = 10 - ((ArrayList) this.LJFF).size();
        if (arrayList.size() >= size) {
            ((ArrayList) this.LJFF).addAll(arrayList.subList(0, size));
            return true;
        }
        ((ArrayList) this.LJFF).addAll(arrayList);
        int size2 = 10 - ((ArrayList) this.LJFF).size();
        if (((ArrayList) this.LIZJ.LIZIZ).size() - 5 > size2) {
            List<String> list = this.LJFF;
            ArrayList arrayList2 = (ArrayList) list;
            arrayList2.addAll(((ArrayList) this.LIZJ.LIZIZ).subList(5, size2 + 5));
            return true;
        }
        if (((ArrayList) this.LIZJ.LIZIZ).size() - 5 <= 0) {
            return true;
        }
        List<String> list2 = this.LJFF;
        List<String> list3 = this.LIZJ.LIZIZ;
        ArrayList arrayList3 = (ArrayList) list2;
        arrayList3.addAll(((ArrayList) list3).subList(5, ((ArrayList) list3).size()));
        return true;
    }

    public final List<String> LIZIZ() {
        List<String> list;
        this.LJ.lock();
        ArrayList arrayList = new ArrayList();
        C1968707nR c1968707nR = this.LIZLLL;
        if (c1968707nR != null && (list = c1968707nR.LIZIZ) != null && !((ArrayList) list).isEmpty()) {
            arrayList.addAll(this.LIZLLL.LIZIZ);
        }
        this.LJ.unlock();
        return arrayList;
    }

    public final List<String> LIZJ() {
        List<String> list;
        this.LJ.lock();
        ArrayList arrayList = new ArrayList();
        C1968707nR c1968707nR = this.LIZJ;
        if (c1968707nR != null && (list = c1968707nR.LIZIZ) != null && !((ArrayList) list).isEmpty()) {
            arrayList.addAll(this.LIZJ.LIZIZ);
        }
        this.LJ.unlock();
        return arrayList;
    }

    public final String LIZLLL() {
        List<String> list;
        List<String> list2;
        this.LJ.lock();
        List<String> list3 = this.LJI;
        if (list3 != null && !((ArrayList) list3).isEmpty()) {
            List<String> list4 = this.LJI;
            String str = (String) ListProtector.get(list4, this.LIZIZ.nextInt(((ArrayList) list4).size()));
            this.LJ.unlock();
            return str;
        }
        C1968707nR c1968707nR = this.LIZJ;
        if (c1968707nR != null && (list2 = c1968707nR.LIZIZ) != null && !((ArrayList) list2).isEmpty()) {
            String str2 = (String) ListProtector.get(this.LIZJ.LIZIZ, 0);
            this.LJ.unlock();
            return str2;
        }
        C1968707nR c1968707nR2 = this.LIZLLL;
        if (c1968707nR2 == null || (list = c1968707nR2.LIZIZ) == null || ((ArrayList) list).isEmpty()) {
            this.LJ.unlock();
            return null;
        }
        List<String> list5 = this.LIZLLL.LIZIZ;
        String str3 = (String) ListProtector.get(list5, this.LIZIZ.nextInt(((ArrayList) list5).size()));
        this.LJ.unlock();
        return str3;
    }

    public C2179031APt(String str) {
        new C830490Whz();
        this.LJI = new ArrayList();
        this.LJII = null;
        this.LIZ = str;
        this.LIZIZ = new Random(System.currentTimeMillis());
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0N5E, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N5E {
    public List<Aweme> LIZ = new ArrayList();
    public List<WeakReference<Aweme>> LIZIZ = new ArrayList();
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(5));

    public final boolean LIZIZ() {
        return ((Boolean) this.LIZJ.getValue()).booleanValue();
    }

    public final List<Aweme> LIZ() {
        if (!LIZIZ()) {
            return this.LIZ;
        }
        List<WeakReference<Aweme>> list = this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            Object obj = ((Reference) it2.next()).get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void LIZJ(List<Aweme> list) {
        if (LIZIZ()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new WeakReference(it2.next()));
            }
            this.LIZIZ = new ArrayList(arrayList);
            return;
        }
        this.LIZ = list;
    }
}

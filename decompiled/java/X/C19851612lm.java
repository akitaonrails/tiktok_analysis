package X;

import java.util.Comparator;

/* JADX INFO: renamed from: X.12lm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19851612lm implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC19851412lk abstractC19851412lk = (AbstractC19851412lk) obj;
        AbstractC19851412lk abstractC19851412lk2 = (AbstractC19851412lk) obj2;
        C19851512ll c19851512ll = new C19851512ll(abstractC19851412lk);
        C19851512ll c19851512ll2 = new C19851512ll(abstractC19851412lk2);
        while (c19851512ll.hasNext() && c19851512ll2.hasNext()) {
            int iCompareTo = Integer.valueOf(c19851512ll.zza() & 255).compareTo(Integer.valueOf(c19851512ll2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(abstractC19851412lk.zzd()).compareTo(Integer.valueOf(abstractC19851412lk2.zzd()));
    }
}

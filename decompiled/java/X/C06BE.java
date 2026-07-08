package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.06BE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06BE implements C06BH {
    public static final C06BE LL = new C06BE();
    public static final CopyOnWriteArrayList<C06BH> LLILLJJLI = new CopyOnWriteArrayList<>();

    @Override // X.C06BH
    public final void ec(StreakData streakData, String str) {
        Iterator<C06BH> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().ec(streakData, str);
        }
    }
}

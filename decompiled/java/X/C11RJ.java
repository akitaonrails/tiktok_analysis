package X;

import android.os.Looper;
import com.ss.android.ugc.aweme.model.StoryStatusResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11RJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11RJ {
    public static final Set<String> LIZ = new CopyOnWriteArraySet();
    public static final Set<User> LIZIZ = new CopyOnWriteArraySet();
    public static final C11RK<C01YS> LIZJ;

    static {
        C11RK<C01YS> c11rk = new C11RK<>();
        LIZJ = c11rk;
        new C11NJ().LIZ(C1239300iM4.LJ(c11rk.LJII(500L, TimeUnit.MILLISECONDS, C11S5.LIZIZ, 8).LJJIL(new InterfaceC19483011Ki() { // from class: X.08Bl
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return !((List) obj).isEmpty();
            }
        }).LJJJIL(new InterfaceC1487280oo2() { // from class: X.01YR
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                List list = (List) obj;
                Set<String> set = C11RJ.LIZ;
                final ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C01YS) it2.next()).LIZ);
                }
                final ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((C01YS) it3.next()).LIZIZ);
                }
                final boolean z = true;
                if (!C298480Bmw.LIZ()) {
                    if (!list.isEmpty()) {
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            if (((C01YS) it4.next()).LIZJ) {
                                break;
                            }
                        }
                        z = false;
                    } else {
                        z = false;
                    }
                }
                return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.01Xn
                    @Override // X.InterfaceC300801Eo
                    public final void subscribe(InterfaceC2329309At<StoryStatusResponse> interfaceC2329309At) {
                        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
                            C1AF0.LIZJ("SocPubStatusRepository: send request in main thread");
                        }
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C350001Xm(interfaceC2329309At, arrayList, z, arrayList2, null), 3);
                    }
                });
            }
        }), AFwS273S0000000_29.get$arr$(473), C1239300iM4.LIZJ, AFwS264S0000000_24.get$arr$(777)));
    }
}

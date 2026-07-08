package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.SkylightStoryNegativeFeedbackInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS162S0101000_24;
import kotlin.jvm.internal.AwS35S2200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS62S2100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qvx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569070qvx implements InterfaceC1569000qvq {
    public static final C1569070qvx LIZ = new C1569070qvx();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(4));
    public static final Map<AbstractC1569120qw2, List<SkylightStoryNegativeFeedbackInfo>> LIZJ = new LinkedHashMap();
    public static final Map<AbstractC1569120qw2, List<SkylightStoryNegativeFeedbackInfo>> LIZLLL = new LinkedHashMap();
    public static final Map<AbstractC1569120qw2, Object> LJ = C2097608Jq.LJIIJ(new Pair(C1569130qw3.LIZIZ, new Object()), new Pair(C1569140qw4.LIZIZ, new Object()), new Pair(C1569160qw6.LIZIZ, new Object()), new Pair(C1569150qw5.LIZIZ, new Object()), new Pair(C1569170qw7.LIZIZ, new Object()));
    public static final Map<AbstractC1569120qw2, List<C1569080qvy>> LJFF = new LinkedHashMap();
    public static final Map<AbstractC1569120qw2, String> LJI = new LinkedHashMap();
    public static final Map<AbstractC1569120qw2, Boolean> LJII = new LinkedHashMap();
    public static final Map<AbstractC1569120qw2, Integer> LJIIIIZZ = new LinkedHashMap();
    public static final Map<AbstractC1569120qw2, Boolean> LJIIIZ = new LinkedHashMap();
    public static final Map<AbstractC1569120qw2, C1569060qvw> LJIIJ = new LinkedHashMap();

    static {
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0qvv
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (i != 2 && i != 3) {
                    return;
                }
                ((LinkedHashMap) C1569070qvx.LIZJ).clear();
                ((LinkedHashMap) C1569070qvx.LIZLLL).clear();
                ((LinkedHashMap) C1569070qvx.LJFF).clear();
                ((LinkedHashMap) C1569070qvx.LJI).clear();
                ((LinkedHashMap) C1569070qvx.LJII).clear();
                ((LinkedHashMap) C1569070qvx.LJIIIZ).clear();
                ((LinkedHashMap) C1569070qvx.LJIIIIZZ).clear();
            }
        });
    }

    public static List LJII(List list) {
        String uid;
        AbstractC1569090qvz abstractC1569090qvz;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            User author = ((Aweme) it2.next()).getAuthor();
            if (author != null && (uid = author.getUid()) != null) {
                if (author.getStoryStatus() == 1) {
                    abstractC1569090qvz = new AbstractC1569090qvz() { // from class: X.0qw1
                    };
                } else {
                    abstractC1569090qvz = new AbstractC1569090qvz() { // from class: X.0qw0
                    };
                }
                C735840Sti.LIZ.getClass();
                arrayList.add(new SkylightStoryNegativeFeedbackInfo(uid, C735840Sti.LJIIIIZZ(author), abstractC1569090qvz.LIZ, new LinkedHashSet(), 0, 0, new LinkedHashSet()));
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1569000qvq
    public final boolean LIZJ(AbstractC1569120qw2 abstractC1569120qw2) {
        Boolean bool = (Boolean) LJIIIZ(abstractC1569120qw2, new AwS568S0100000_24(abstractC1569120qw2, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static void LJIIIIZZ(AbstractC1569120qw2 abstractC1569120qw2, String str) {
        List list;
        Object next;
        Object obj = ((LinkedHashMap) LJI).get(abstractC1569120qw2);
        if (obj != null && !Intrinsics.LJFF(obj, str) && (list = (List) ((LinkedHashMap) LJFF).get(abstractC1569120qw2)) != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((C1569080qvy) next).LIZ, obj)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1569080qvy c1569080qvy = (C1569080qvy) next;
            if (c1569080qvy != null) {
                c1569080qvy.LIZJ = System.currentTimeMillis();
            }
        }
    }

    public static Object LJIIIZ(AbstractC1569120qw2 abstractC1569120qw2, Function0 function0) {
        Object objInvoke;
        Object obj = ((LinkedHashMap) LJ).get(abstractC1569120qw2);
        if (obj == null) {
            return null;
        }
        synchronized (obj) {
            try {
                objInvoke = function0.invoke();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return objInvoke;
    }

    @Override // X.InterfaceC1569000qvq
    public final void LIZ(AbstractC1569120qw2 abstractC1569120qw2, int i) {
        LJIIIZ(abstractC1569120qw2, new AwS162S0101000_24(abstractC1569120qw2, i, 0));
    }

    @Override // X.InterfaceC1569000qvq
    public final void LIZIZ(AbstractC1569120qw2 abstractC1569120qw2, List<? extends Aweme> list) {
        C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), null, null, new C1569030qvt(abstractC1569120qw2, list, null), 3);
    }

    @Override // X.InterfaceC1569000qvq
    public final void LJ(AbstractC1569120qw2 abstractC1569120qw2, List<? extends Aweme> list) {
        C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), null, null, new C1569040qvu(abstractC1569120qw2, list, null), 3);
    }

    @Override // X.InterfaceC1569000qvq
    public final void LJI(AbstractC1569120qw2 abstractC1569120qw2, AbstractC1568960qvm abstractC1568960qvm) {
        C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), null, null, new C1569020qvs(abstractC1569120qw2, abstractC1568960qvm, null), 3);
    }

    @Override // X.InterfaceC1569000qvq
    public final void LIZLLL(AbstractC1569120qw2 abstractC1569120qw2, String str, String str2) {
        LJIIIZ(abstractC1569120qw2, new AwS62S2100000_24(abstractC1569120qw2, str2, str, 0));
    }

    @Override // X.InterfaceC1569000qvq
    public final void LJFF(AbstractC712110RwX abstractC712110RwX, AbstractC1569120qw2 abstractC1569120qw2, String str, String str2) {
        LJIIIZ(abstractC1569120qw2, new AwS35S2200000_24(abstractC712110RwX, abstractC1569120qw2, str2, str, 0));
    }
}

package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightColdStartOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0IT6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IT6 {
    public static volatile boolean LIZIZ;
    public static long LIZJ;
    public static C0IT1 LIZLLL;
    public static Pair<Long, ? extends List<Pair<String, User>>> LJ;
    public static final C0IT6 LIZ = new C0IT6();
    public static final List<C0IUI> LJFF = new CopyOnWriteArrayList();
    public static final Map<String, Set<String>> LJI = new LinkedHashMap();

    public static void LIZ() {
        long curUserId = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId();
        if (curUserId != LIZJ) {
            LIZLLL = null;
            LIZJ = curUserId;
        }
    }

    public static void LIZJ(final C0IT1 c0it1) {
        Integer numValueOf;
        List<? extends Room> list;
        long j;
        LIZ();
        C0IT1 c0it12 = LIZLLL;
        if (c0it12 != null) {
            C0IT7 c0it7 = c0it12.LIZIZ;
            if (c0it7 != null) {
                j = c0it7.LIZIZ;
            } else {
                j = 0;
                if (c0it12 != null) {
                }
            }
            if (j >= c0it1.LIZIZ.LIZIZ) {
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateData: ");
        sbLIZ.append(c0it1.LIZIZ.LIZLLL.name());
        sbLIZ.append(", size=");
        List<? extends Room> list2 = c0it1.LIZ;
        if (list2 != null) {
            numValueOf = Integer.valueOf(list2.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZLLL = c0it1;
        if (LiveSkylightColdStartOptSetting.enableLocalCache() && (list = c0it1.LIZ) != null && !list.isEmpty()) {
            final int localCacheSize = LiveSkylightColdStartOptSetting.getLocalCacheSize();
            C11NZ.LJJJJZ(c0it1).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0IT9
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    ArrayList arrayList;
                    List listLL;
                    int size = localCacheSize;
                    if (size <= 0) {
                        List<? extends Room> list3 = c0it1.LIZ;
                        if (list3 != null) {
                            size = list3.size();
                        } else {
                            size = 0;
                        }
                    }
                    List<? extends Room> list4 = c0it1.LIZ;
                    if (list4 != null && (listLL = C13LP.LL(list4, size)) != null) {
                        arrayList = new ArrayList(listLL);
                    } else {
                        arrayList = null;
                    }
                    C0IT6 c0it6 = C0IT6.LIZ;
                    Keva repo = Keva.getRepo("global_follow_live_data_repo");
                    repo.storeString("follow_live_data", GsonProtectorUtils.toJson(C293501Bt.LIZ(), arrayList));
                    repo.storeString("follow_live_data_extra", GsonProtectorUtils.toJson(C293501Bt.LIZ(), c0it1.LIZIZ));
                    return Unit.LIZ;
                }
            }).LJJLL(new C09JN() { // from class: X.0CLq
                @Override // X.C09JN
                public final void accept(Object obj) {
                    Integer numValueOf2;
                    C1C7U.LIZ("FollowDataCenter@4dad.saveFollowLiveData$2");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("saveFollowLiveData, originSize=");
                    List<? extends Room> list3 = c0it1.LIZ;
                    if (list3 != null) {
                        numValueOf2 = Integer.valueOf(list3.size());
                    } else {
                        numValueOf2 = null;
                    }
                    sbLIZ2.append(numValueOf2);
                    sbLIZ2.append(", maxSize=");
                    sbLIZ2.append(localCacheSize);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1C7U.LIZIZ("FollowDataCenter@4dad.saveFollowLiveData$2");
                }
            }, new C09JN() { // from class: X.00M3
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("FollowDataCenter@4dad.saveFollowLiveData$3");
                    C1C7U.LIZIZ("FollowDataCenter@4dad.saveFollowLiveData$3");
                }
            });
        }
    }

    public static final void LIZLLL(C0IV2 c0iv2, String str, List list) {
        LIZJ(new C0IT1(list, new C0IT7(str, System.currentTimeMillis(), Long.valueOf(UserService.getInstance().user().getCurrentUserId()), c0iv2, SystemClock.uptimeMillis())));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZIZ(int r10, java.lang.String r11, java.lang.String r12, java.util.List r13) {
        /*
            r9 = 0
            if (r13 != 0) goto L4
            return r9
        L4:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r8 = r13.iterator()
        Ld:
            boolean r0 = r8.hasNext()
            r5 = 0
            if (r0 == 0) goto L6e
            java.lang.Object r6 = r8.next()
            r7 = r6
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r0 = r7.getSecond()
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            if (r0 == 0) goto L6c
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r0.toString()
        L2f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r12)
            if (r0 != 0) goto L62
            r3 = 1
            if (r11 == 0) goto L61
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r0 = X.C0IT6.LJI
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r2 = r0.get(r11)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L6a
            java.lang.Object r0 = r7.getSecond()
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            if (r0 == 0) goto L68
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r0.toString()
        L58:
            boolean r0 = X.C13LP.LJJJJ(r0, r2)
            if (r0 != r3) goto L6a
            r0 = 1
        L5f:
            if (r0 != 0) goto L62
        L61:
            r5 = 1
        L62:
            if (r5 == 0) goto Ld
            r4.add(r6)
            goto Ld
        L68:
            r0 = r9
            goto L58
        L6a:
            r0 = 0
            goto L5f
        L6c:
            r0 = r9
            goto L2f
        L6e:
            int r0 = r4.size()
            if (r10 <= r0) goto L75
            r10 = r0
        L75:
            java.util.List r0 = r4.subList(r5, r10)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L82:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lbd
            java.lang.Object r0 = r3.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            com.google.gson.Gson r2 = X.C293501Bt.LIZ()     // Catch: java.lang.Throwable -> La4
            java.lang.Object r1 = r0.getFirst()     // Catch: java.lang.Throwable -> La4
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> La4
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r0 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            java.lang.Object r1 = r2.LJII(r1, r0)     // Catch: java.lang.Throwable -> La4
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r1     // Catch: java.lang.Throwable -> La4
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> La4
            goto Lb0
        La4:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        Lb0:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto Lb7
            r1 = r9
        Lb7:
            if (r1 == 0) goto L82
            r4.add(r1)
            goto L82
        Lbd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IT6.LIZIZ(int, java.lang.String, java.lang.String, java.util.List):java.util.List");
    }
}

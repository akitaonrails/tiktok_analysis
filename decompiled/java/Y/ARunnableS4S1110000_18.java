package Y;

import X.AbstractC848400XPy;
import X.C0BXL;
import X.C0XQ7;
import X.C1171960gbS;
import X.C1203930hR1;
import X.C1227904rF;
import X.C1389910mGz;
import X.C13LP;
import X.C1C7U;
import X.C20019113Un;
import X.C2188811AlT;
import X.C823050WQl;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import com.ss.android.ugc.nearby.container.model.NearbyRevampResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class ARunnableS4S1110000_18 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (this.z2) {
            return;
        }
        if (Intrinsics.LJFF(this.s0, ((C1171960gbS) this.l1).LL)) {
            C1389910mGz c1389910mGz = ((C1171960gbS) this.l1).LLILLJJLI;
            if (c1389910mGz != null) {
                c1389910mGz.LJII(false);
            }
            C1389910mGz c1389910mGz2 = ((C1171960gbS) this.l1).LLILLJJLI;
            if (c1389910mGz2 != null) {
                c1389910mGz2.LIZJ();
            }
            ((C1171960gbS) this.l1).LIZJ();
        }
        ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).removeSubscriber(((C1171960gbS) this.l1).LLILLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            r7 = this;
            java.lang.String r3 = r7.s0
            java.lang.Object r0 = r7.l1
            X.0grD r0 = (X.C1181730grD) r0
            java.util.List<X.0grK> r0 = r0.LLILZIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        Le:
            boolean r0 = r2.hasNext()
            r6 = 0
            if (r0 == 0) goto L47
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0grK r0 = (X.C1181800grK) r0
            java.lang.String r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto Le
        L24:
            X.0grK r1 = (X.C1181800grK) r1
            if (r1 == 0) goto Lad
            X.0gpu r0 = r1.LIZJ
            if (r0 == 0) goto Lad
            com.ss.android.ugc.aweme.slash.component.BaseComponentData r0 = r0.LIZLLL
            if (r0 == 0) goto Lad
            com.ss.android.ugc.aweme.slash.component.SlashConfig r0 = r0.slashConfig
            if (r0 == 0) goto Lad
            java.lang.Boolean r1 = r0.isAsyncLoad
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lad
            java.lang.Object r1 = r7.l1
            X.0grD r1 = (X.C1181730grD) r1
            boolean r0 = r1.LLIZLLLIL
            if (r0 == 0) goto L49
            return
        L47:
            r1 = r6
            goto L24
        L49:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0grL> r1 = r1.LLILZLL
            java.lang.String r0 = r7.s0
            java.lang.Object r0 = r1.get(r0)
            X.0grL r0 = (X.C1181810grL) r0
            if (r0 == 0) goto L90
            java.lang.Object r4 = r7.l1
            X.0grD r4 = (X.C1181730grD) r4
            java.lang.String r3 = r7.s0
            boolean r5 = r7.z2
            X.09AE r0 = r0.job
            r0.LIZIZ(r6)
            X.0grI r0 = X.EnumC1181780grI.LOAD_FINISH
            r4.LJJIIZI(r3, r0)
            java.util.List<X.0grK> r1 = r4.LLILZIL
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L94
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L94
        L76:
            X.0956 r0 = r4.LLIZ
            if (r0 == 0) goto L7d
            r0.LIZIZ(r6)
        L7d:
            r4.LLIZ = r6
        L7f:
            r4.LJJIIJ()
            kotlin.jvm.functions.Function1<X.0gpQ, kotlin.Unit> r1 = r4.LLILLL
            X.0gpQ r0 = r4.LLJ
            r1.invoke(r0)
            if (r5 == 0) goto L91
            X.0grH r0 = X.EnumC1181770grH.LOAD_SUCCESS
        L8d:
            r4.LJJIFFI(r0, r3)
        L90:
            return
        L91:
            X.0grH r0 = X.EnumC1181770grH.LOAD_FAILURE
            goto L8d
        L94:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r2 = r1.iterator()
        L9a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r2.next()
            X.0grK r0 = (X.C1181800grK) r0
            X.0grI r1 = r0.LIZIZ
            X.0grI r0 = X.EnumC1181780grI.LOAD_FINISH
            if (r1 != r0) goto L7f
            goto L9a
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS4S1110000_18.LIZ$1():void");
    }

    public final void LIZ$2() {
        List<Aweme> list;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Aweme aweme = null;
            NearbyRevampResponse nearbyRevampResponseLJ = NearbyRevampResponse.LJ((NearbyRevampResponse) this.l1, null, Long.valueOf(jCurrentTimeMillis), Boolean.valueOf(this.z2), 7999);
            C1203930hR1.LIZ.getClass();
            C1203930hR1.LJI().storeString("nearby_cache_last_region_2column", this.s0);
            C1203930hR1.LJI().storeString("nearby_cache_current_uid_2column", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            Keva kevaLJI = C1203930hR1.LJI();
            C1227904rF.LIZ.getClass();
            kevaLJI.storeString("key_cache_nearby_list_2column", C1227904rF.LJI(nearbyRevampResponseLJ));
            C1203930hR1.LJI().storeLong("nearby_cache_save_timestamp", jCurrentTimeMillis);
            C1203930hR1.LJI().storeBoolean("nearby_cache_has_been_consumed", this.z2);
            C20019113Un c20019113Un = C20019113Un.LIZ;
            List<Aweme> list2 = ((NearbyRevampResponse) this.l1).awemeList;
            c20019113Un.getClass();
            if (C20019113Un.LJI()) {
                if (list2 != null) {
                    list2.size();
                }
                C823050WQl.LJFF().execute(new ARunnableS130S0100000_30(list2, 56));
            }
            if (C0BXL.LIZ()) {
                C1203930hR1.LIZJ = (NearbyRevampResponse) this.l1;
                NearbyRevampResponse nearbyRevampResponse = C1203930hR1.LIZJ;
                if (nearbyRevampResponse != null) {
                    nearbyRevampResponse.cacheHasBeenConsumed = Boolean.valueOf(this.z2);
                }
                NearbyRevampResponse nearbyRevampResponse2 = C1203930hR1.LIZJ;
                if (nearbyRevampResponse2 != null) {
                    nearbyRevampResponse2.cacheSaveTime = Long.valueOf(jCurrentTimeMillis);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Write new prebuiltResponse isConsumed=");
                sbLIZ.append(this.z2);
                sbLIZ.append(", Cache=");
                NearbyRevampResponse nearbyRevampResponse3 = C1203930hR1.LIZJ;
                if (nearbyRevampResponse3 != null && (list = nearbyRevampResponse3.awemeList) != null) {
                    aweme = (Aweme) C13LP.LJJJLL(list);
                }
                sbLIZ.append(aweme);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1203930hR1.LIZ.getClass();
            C1203930hR1.LIZJ();
        }
    }

    public static final void run$0(ARunnableS4S1110000_18 aRunnableS4S1110000_18) {
        boolean zLIZ;
        C1C7U.LIZ("FeedAddToFavoritesPopToast$FavoriteToastSession@c5b9.motaCacheSubscriber$1$1");
        try {
            aRunnableS4S1110000_18.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedAddToFavoritesPopToast$FavoriteToastSession@c5b9.motaCacheSubscriber$1$1");
    }

    public static final void run$1(ARunnableS4S1110000_18 aRunnableS4S1110000_18) {
        boolean zLIZ;
        C1C7U.LIZ("SlashSerialLoadPlugin@753b.<init>$1$onSkeletonSignalNotify$1");
        try {
            aRunnableS4S1110000_18.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SlashSerialLoadPlugin@753b.<init>$1$onSkeletonSignalNotify$1");
    }

    public static final void run$2(ARunnableS4S1110000_18 aRunnableS4S1110000_18) {
        boolean zLIZ;
        C1C7U.LIZ("NearbyDoubleColumnFeedCacheManager@6e26.cacheFeedList$1");
        try {
            aRunnableS4S1110000_18.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NearbyDoubleColumnFeedCacheManager@6e26.cacheFeedList$1");
    }

    public ARunnableS4S1110000_18(Object obj, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.z2 = z;
    }
}

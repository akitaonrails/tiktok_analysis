package X;

import X.C085L;
import X.C11NJ;
import X.C1548820qPI;
import X.C19EG;
import X.C1C7U;
import X.C2188811AlT;
import X.InterfaceC1548390qOb;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.series.reservation.anchor.ShortDramaReserveAnchorProvider;
import com.ss.android.ugc.aweme.series.reservation.model.ShortDramaReserveExtraModel;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0rF7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580950rF7 implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final /* synthetic */ ShortDramaReserveAnchorProvider LL;

    public C1580950rF7(ShortDramaReserveAnchorProvider shortDramaReserveAnchorProvider) {
        this.LL = shortDramaReserveAnchorProvider;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        Aweme aweme;
        String str;
        VideoItemParams videoItemParams2 = videoItemParams;
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null) {
            ShortDramaReserveExtraModel shortDramaReserveExtraModelLIZJ = this.LL.LIZJ(aweme);
            if (shortDramaReserveExtraModelLIZJ != null) {
                long collectionId = shortDramaReserveExtraModelLIZJ.getCollectionId();
                String lynxSchema = shortDramaReserveExtraModelLIZJ.getLynxSchema();
                if (collectionId > 0 && lynxSchema != null && !a0.LJJJIL(lynxSchema)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("short_drama_reserve_");
                    sbLIZ.append(collectionId);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append('#');
                    sbLIZ2.append(lynxSchema);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    if (C08SX.LIZ.add(strLIZIZ2)) {
                        try {
                            C1581010rFD c1581010rFD = C1581010rFD.LIZIZ;
                            C1548440qOg c1548440qOgLIZJ = c1581010rFD.LIZJ(C2097608Jq.LJ(), C13BV.INSTANCE, false, EnumC1548460qOi.FOREST_RESOURCE_PRELOAD);
                            c1581010rFD.LIZIZ(strLIZIZ, lynxSchema, c1548440qOgLIZJ);
                            c1581010rFD.LIZLLL(c1581010rFD.LJ(lynxSchema, c1548440qOgLIZJ), strLIZIZ, c1548440qOgLIZJ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C08SX.LIZ.remove(strLIZIZ2);
                        }
                    }
                }
            }
            if (aweme != null) {
                if (shortDramaReserveExtraModelLIZJ != null) {
                    this.LL.LLILLJJLI.put(C2286608xc.LJFF(shortDramaReserveExtraModelLIZJ.getCollectionId()), new WeakReference<>(aweme));
                    final ShortDramaReserveAnchorProvider shortDramaReserveAnchorProvider = this.LL;
                    final Fragment fragment = videoItemParams2.fragment;
                    if (fragment == null) {
                        shortDramaReserveAnchorProvider.getClass();
                    } else {
                        C786410Ut5.LJJZZIII(shortDramaReserveAnchorProvider.LLILZLL, new Runnable() { // from class: com.ss.android.ugc.aweme.series.reservation.anchor.ShortDramaReserveAnchorProvider$ensureReserveEventSubscribed$1
                            public final void LIZ() throws JSONException {
                                C085L c085l;
                                final C19EG activity = fragment.getActivity();
                                if (activity == null || activity.isFinishing() || fragment.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                                    return;
                                }
                                final ShortDramaReserveAnchorProvider shortDramaReserveAnchorProvider2 = shortDramaReserveAnchorProvider;
                                synchronized (shortDramaReserveAnchorProvider2.LLILZ) {
                                    try {
                                        if (shortDramaReserveAnchorProvider2.LLILZ.containsKey(activity)) {
                                            c085l = null;
                                        } else {
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("short_drama_reserve_anchor_");
                                            sbLIZ3.append(System.identityHashCode(activity));
                                            c085l = new C085L(C2188811AlT.LIZIZ(sbLIZ3), System.currentTimeMillis(), new InterfaceC1548390qOb() { // from class: X.0rF8
                                                /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
                                                /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
                                                @Override // X.InterfaceC1548390qOb
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                    To view partially-correct add '--show-bad-code' argument
                                                */
                                                public final void H4(X.InterfaceC1107590evd r9, java.lang.String r10) {
                                                    /*
                                                        r8 = this;
                                                        com.ss.android.ugc.aweme.series.reservation.anchor.ShortDramaReserveAnchorProvider r5 = r1
                                                        r5.getClass()
                                                        if (r9 == 0) goto L5c
                                                        java.util.Map r1 = r9.LIZ()
                                                        if (r1 == 0) goto L5c
                                                        java.lang.String r0 = "collection_id"
                                                        java.lang.Object r0 = r1.get(r0)
                                                        if (r0 == 0) goto L5c
                                                        java.lang.String r0 = r0.toString()
                                                        if (r0 == 0) goto L5c
                                                        java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
                                                        if (r0 == 0) goto L5c
                                                        long r6 = r0.longValue()
                                                        java.lang.String r0 = "is_reserved"
                                                        java.lang.Object r3 = r1.get(r0)
                                                        boolean r0 = r3 instanceof java.lang.Boolean
                                                        r2 = 1
                                                        if (r0 == 0) goto L5d
                                                        java.lang.Boolean r3 = (java.lang.Boolean) r3
                                                        boolean r4 = r3.booleanValue()
                                                    L36:
                                                        java.lang.Long r3 = java.lang.Long.valueOf(r6)
                                                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
                                                        java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Boolean> r0 = r5.LLILLL
                                                        r0.put(r3, r1)
                                                        java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.ref.WeakReference<com.ss.android.ugc.aweme.feed.model.Aweme>> r1 = r5.LLILLJJLI
                                                        java.lang.Long r0 = java.lang.Long.valueOf(r6)
                                                        java.lang.Object r0 = r1.get(r0)
                                                        java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
                                                        if (r0 == 0) goto L5c
                                                        java.lang.Object r0 = r0.get()
                                                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
                                                        if (r0 == 0) goto L5c
                                                        X.C1259670isv.LIZ(r0, r4, r2)
                                                    L5c:
                                                        return
                                                    L5d:
                                                        boolean r0 = r3 instanceof java.lang.Number
                                                        if (r0 == 0) goto L6b
                                                        java.lang.Number r3 = (java.lang.Number) r3
                                                        int r0 = r3.intValue()
                                                        if (r0 == 0) goto L83
                                                    L69:
                                                        r4 = 1
                                                        goto L36
                                                    L6b:
                                                        boolean r0 = r3 instanceof java.lang.String
                                                        if (r0 == 0) goto L5c
                                                        r1 = r3
                                                        java.lang.String r1 = (java.lang.String) r1
                                                        java.lang.String r0 = "true"
                                                        boolean r0 = kotlin.text.u.LJIJI(r1, r0, r2)
                                                        if (r0 != 0) goto L69
                                                        java.lang.String r0 = "1"
                                                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
                                                        if (r0 == 0) goto L83
                                                        goto L69
                                                    L83:
                                                        r4 = 0
                                                        goto L36
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: X.C1580960rF8.H4(X.0evd, java.lang.String):void");
                                                }
                                            }, null);
                                            shortDramaReserveAnchorProvider2.LLILZ.put(activity, c085l);
                                            shortDramaReserveAnchorProvider2.LLILZIL.put(activity, new C11NJ());
                                        }
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                        throw th2;
                                    }
                                }
                                if (c085l == null) {
                                    return;
                                }
                                C1548820qPI.LJI(c085l, "drama_reserve_state_did_update");
                                Lifecycle lifecycle = fragment.getLifecycle();
                                final ShortDramaReserveAnchorProvider shortDramaReserveAnchorProvider3 = shortDramaReserveAnchorProvider;
                                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.series.reservation.anchor.ShortDramaReserveAnchorProvider$ensureReserveEventSubscribed$1.1
                                    @Override // androidx.lifecycle.LifecycleEventObserver
                                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                                        C085L c085lRemove;
                                        if (event == Lifecycle.Event.ON_DESTROY) {
                                            lifecycleOwner.getLifecycle().removeObserver(this);
                                            ShortDramaReserveAnchorProvider shortDramaReserveAnchorProvider4 = shortDramaReserveAnchorProvider3;
                                            C19EG c19eg = activity;
                                            synchronized (shortDramaReserveAnchorProvider4.LLILZ) {
                                                try {
                                                    C11NJ c11njRemove = shortDramaReserveAnchorProvider4.LLILZIL.remove(c19eg);
                                                    if (c11njRemove != null) {
                                                        c11njRemove.dispose();
                                                    }
                                                    c085lRemove = shortDramaReserveAnchorProvider4.LLILZ.remove(c19eg);
                                                } catch (Throwable th3) {
                                                    TryCatchGuardChecker.doCheck(th3);
                                                    throw th3;
                                                }
                                            }
                                            if (c085lRemove != null) {
                                                C1548820qPI.LJIIIZ(c085lRemove, "drama_reserve_state_did_update");
                                            }
                                        }
                                    }
                                });
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("ShortDramaReserveAnchorProvider@3238.ensureReserveEventSubscribed$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("ShortDramaReserveAnchorProvider@3238.ensureReserveEventSubscribed$1");
                            }
                        });
                    }
                }
                ShortDramaReserveAnchorProvider shortDramaReserveAnchorProvider2 = this.LL;
                String str2 = videoItemParams2.mEventType;
                shortDramaReserveAnchorProvider2.getClass();
                C2344009Gk c2344009GkLIZ = ShortDramaReserveAnchorProvider.LIZ(aweme, shortDramaReserveExtraModelLIZJ, str2);
                if (shortDramaReserveExtraModelLIZJ != null && shortDramaReserveAnchorProvider2.LIZIZ(shortDramaReserveExtraModelLIZJ)) {
                    str = "registered";
                } else {
                    str = "unregistered";
                }
                c2344009GkLIZ.LJIIIIZZ("series_register_status", str);
                C20684815ws.LJIILLIIL("series_anchor_show", c2344009GkLIZ.LIZ);
            }
        }
        return new C1387205bq(null);
    }
}

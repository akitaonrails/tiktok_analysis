package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.ContainerConfigModel;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpAwemeInfo;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpComponentTracker;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageInfo;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageNode;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.StayTimeConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS147S1200000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rjk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704180Rjk {
    public static final C704180Rjk LIZ = new C704180Rjk();
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"is_cta_guide", "is_cta_guide_dynamic", "is_cta_guide_show", "click_method", "cta_status"});
    public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"poi_cta_btn_container", "poi_cta_text_container"});

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(java.lang.String r4, android.view.View r5, java.util.Map r6) {
        /*
            java.lang.String r0 = "anchor_poi"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 != 0) goto L9
            return r6
        L9:
            java.lang.String r4 = "click_method"
            r3 = 0
            if (r6 == 0) goto L1b
            java.lang.Object r0 = r6.get(r4)
        L12:
            java.lang.String r2 = "1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto L1d
            return r6
        L1b:
            r0 = r3
            goto L12
        L1d:
            if (r5 == 0) goto L20
            goto L22
        L20:
            r1 = r3
            goto L30
        L22:
            android.content.res.Resources r1 = r5.getResources()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L20
            int r0 = r5.getId()     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = r1.getResourceEntryName(r0)     // Catch: java.lang.Throwable -> L34
        L30:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L34
            goto L40
        L34:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L40:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L47
            r3 = r1
        L47:
            if (r3 == 0) goto L62
            java.util.Set<java.lang.String> r0 = X.C704180Rjk.LIZJ
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L62
        L51:
            if (r6 == 0) goto L5c
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r6)
        L58:
            r0.put(r4, r2)
            return r0
        L5c:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            goto L58
        L62:
            java.lang.String r2 = "0"
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C704180Rjk.LIZ(java.lang.String, android.view.View, java.util.Map):java.util.Map");
    }

    public static Map LIZIZ(String str, Map map, boolean z) {
        if (!Intrinsics.LJFF(str, "anchor_poi") && !z && map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            Iterator<T> it2 = LIZIZ.iterator();
            while (it2.hasNext()) {
                linkedHashMap.remove(it2.next());
            }
            return linkedHashMap;
        }
        return map;
    }

    public static void LIZJ(FcpAwemeInfo fcpAwemeInfo, Integer num, final Object obj, String str, String str2, Map map) {
        Map<String, ContainerConfigModel> map2;
        ContainerConfigModel containerConfigModel;
        List<String> list;
        Map<String, ContainerConfigModel> map3;
        List<String> list2;
        if (str != null && str2 != null) {
            C01GW c01gw = C00RW.LIZIZ;
            StayTimeConfig stayTimeConfig = (StayTimeConfig) c01gw.getValue();
            if (stayTimeConfig == null || (list2 = stayTimeConfig.allowComponentList) == null || !list2.contains(str)) {
                StayTimeConfig stayTimeConfig2 = (StayTimeConfig) c01gw.getValue();
                if (stayTimeConfig2 != null && (map3 = stayTimeConfig2.containerAllowList) != null && !map3.containsKey(str2)) {
                    return;
                }
                StayTimeConfig stayTimeConfig3 = (StayTimeConfig) c01gw.getValue();
                if (stayTimeConfig3 != null && (map2 = stayTimeConfig3.containerAllowList) != null && (containerConfigModel = map2.get(str2)) != null && (list = containerConfigModel.componentBlockList) != null && list.contains(str)) {
                    return;
                }
            }
            C18KJ.LIZ.getClass();
            if (str != null && str.length() != 0 && obj != null) {
                new C20673615v4(C1697810uHb.LJIIJJI(C18KO.LIZ, new InterfaceC20673715v5<C18KP>() { // from class: X.18KL
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC20673715v5
                    public final void LIZ(C20673615v4 c20673615v4) {
                        FcpAwemeInfo awemeInfo;
                        String str3;
                        int iIntValue;
                        T t = c20673615v4.LIZIZ;
                        FcpPageInfo fcpPageInfo = ((C18KP) t).LJI;
                        Map<String, String> map4 = ((C18KP) t).LJ;
                        if (fcpPageInfo != null && (awemeInfo = fcpPageInfo.getAwemeInfo()) != null) {
                            T t2 = c20673615v4.LIZIZ;
                            String str4 = ((C18KP) t2).LIZIZ;
                            if (str4 == null || (str3 = ((C18KP) t2).LIZJ) == null) {
                                return;
                            }
                            Integer num2 = ((C18KP) t2).LJFF;
                            if (num2 != null) {
                                iIntValue = num2.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            C18KG c18kg = C18KG.LIZ;
                            FcpPageNode fcpPageNodePeek = c18kg.LIZJ().peek();
                            if (fcpPageNodePeek != null && fcpPageNodePeek.isPageMatch(fcpPageInfo, false)) {
                                FcpComponentTracker tracker = fcpPageNodePeek.getTracker();
                                if (tracker != null) {
                                    tracker.reset();
                                }
                                fcpPageNodePeek.setTracker(new FcpComponentTracker(str4, str3, awemeInfo, map4, Integer.valueOf(iIntValue)));
                                FcpComponentTracker tracker2 = fcpPageNodePeek.getTracker();
                                if (tracker2 != null) {
                                    tracker2.start();
                                }
                            } else {
                                fcpPageNodePeek = new FcpPageNode(fcpPageInfo);
                                fcpPageNodePeek.setTracker(new FcpComponentTracker(str4, str3, awemeInfo, map4, Integer.valueOf(iIntValue)));
                                FcpComponentTracker tracker3 = fcpPageNodePeek.getTracker();
                                if (tracker3 != null) {
                                    tracker3.start();
                                }
                                c18kg.LIZJ().push(fcpPageNodePeek);
                            }
                            ((C18KP) c20673615v4.LIZIZ).LJII = fcpPageNodePeek;
                            c20673615v4.LIZ();
                        }
                    }
                }, new InterfaceC20673715v5<C18KP>(obj) { // from class: X.18KM
                    public final Object LIZ;

                    {
                        this.LIZ = obj;
                    }

                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // X.InterfaceC20673715v5
                    public final void LIZ(C20673615v4 c20673615v4) {
                        C19EG c19eg;
                        FcpPageNode fcpPageNode = ((C18KP) c20673615v4.LIZIZ).LJII;
                        if (fcpPageNode == null) {
                            return;
                        }
                        Object obj2 = this.LIZ;
                        if ((obj2 instanceof C19EG) && (c19eg = (C19EG) obj2) != null) {
                            AbstractC813200VvC abstractC813200VvC = new AbstractC813200VvC(fcpPageNode) { // from class: X.18K7
                                public final FcpPageNode LL;
                                public boolean LLILLJJLI;

                                {
                                    this.LL = fcpPageNode;
                                }

                                public static void LIZ(Fragment fragment, String str3) {
                                    new AwS147S1200000_32(fragment, fragment.getActivity(), str3, 18);
                                    C0T6L.LIZLLL();
                                }

                                @Override // X.AbstractC813200VvC
                                public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                                    super.onFragmentDestroyed(fragmentManager, fragment);
                                    LIZ(fragment, "onFragmentDestroyed");
                                }

                                @Override // X.AbstractC813200VvC
                                public final void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
                                    super.onFragmentDetached(fragmentManager, fragment);
                                    LIZ(fragment, "onFragmentDetached");
                                }

                                @Override // X.AbstractC813200VvC
                                public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
                                    super.onFragmentPaused(fragmentManager, fragment);
                                    LIZ(fragment, "onFragmentPaused");
                                }

                                @Override // X.AbstractC813200VvC
                                public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                                    super.onFragmentResumed(fragmentManager, fragment);
                                    this.LLILLJJLI = false;
                                    LIZ(fragment, "onFragmentResumed");
                                }

                                @Override // X.AbstractC813200VvC
                                public final void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
                                    super.onFragmentStarted(fragmentManager, fragment);
                                    LIZ(fragment, "onFragmentStarted");
                                }

                                @Override // X.AbstractC813200VvC
                                public final void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
                                    super.onFragmentStopped(fragmentManager, fragment);
                                    LIZ(fragment, "onFragmentStopped");
                                }

                                @Override // X.AbstractC813200VvC
                                public final void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                                    super.onFragmentViewDestroyed(fragmentManager, fragment);
                                    C19EG activity = fragment.getActivity();
                                    C1584400rKg.LIZ.getClass();
                                    if (!C1584400rKg.LIZ(fragment)) {
                                        this.LL.tryRemoveFrame(C18K6.LIZ(fragment));
                                    }
                                    if (this.LL.getFrameIds().isEmpty() && !this.LLILLJJLI && activity != null) {
                                        C18K9.LIZ.getClass();
                                        C18K9.LIZ(activity);
                                    }
                                    LIZ(fragment, "onFragmentViewDestroyed");
                                    C18KJ.LIZ.getClass();
                                    C18KJ.LIZJ.remove(fragment);
                                }

                                @Override // X.AbstractC813200VvC
                                public final void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
                                    super.onFragmentAttached(fragmentManager, fragment, context);
                                    LIZ(fragment, "onFragmentAttached");
                                }

                                @Override // X.AbstractC813200VvC
                                public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                                    super.onFragmentCreated(fragmentManager, fragment, bundle);
                                    LIZ(fragment, "onFragmentCreated");
                                }

                                @Override // X.AbstractC813200VvC
                                public final void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                                    C18KJ.LIZ.getClass();
                                    C786410Ut5.LJJJI("fcp_frame_id", C18KJ.LIZJ.get(fragment), bundle);
                                    this.LLILLJJLI = true;
                                    LIZ(fragment, "onFragmentSaveInstanceState");
                                }

                                @Override // X.AbstractC813200VvC
                                public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
                                    super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
                                    if (bundle != null) {
                                        String string = bundle.getString("fcp_frame_id");
                                        if (string != null && string.length() != 0) {
                                            C18KJ.LIZ.getClass();
                                            C18KJ.LIZJ.put(fragment, string);
                                        }
                                        if (bundle != null) {
                                            C786410Ut5.LJJJI("fcp_frame_id", "", bundle);
                                        }
                                    }
                                    C1584400rKg.LIZ.getClass();
                                    if (!C1584400rKg.LIZ(fragment)) {
                                        this.LL.tryAddFrame(C18K6.LIZ(fragment));
                                    }
                                    LIZ(fragment, "onFragmentViewCreated");
                                }
                            };
                            c19eg.getSupportFragmentManager().LJZL(abstractC813200VvC, true);
                            C18KJ.LIZ.getClass();
                            C18KJ.LIZLLL.put(fcpPageNode.getInfo().getPageId(), (C18K7) abstractC813200VvC);
                            c20673615v4.LIZ();
                        }
                    }
                }), 0, new C18KP(fcpAwemeInfo, num, obj, str, str2, map)).LIZ();
            }
        }
    }
}

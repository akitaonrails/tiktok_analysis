package X;

import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal.LayoutSlardarMonitor;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicLayoutApplogCombineSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdk.userservice.UserService;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AXN, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AXN implements InterfaceC964830bDN {
    public final /* synthetic */ C1AXM LIZ;

    @Override // X.InterfaceC964830bDN
    public final void LIZJ() {
        String strLLIIII = this.LIZ.LLIIII(580);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStartSuccess, config.liveType:");
        sbLIZ.append(this.LIZ.LL.LIZLLL);
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LIZ.LJLLLL().LJI("onStartSuccess", true);
        this.LIZ.LLFFF();
        this.LIZ.LIZJ("start success");
        C1AXM c1axm = this.LIZ;
        if (c1axm.LL.LIZIZ == 4) {
            c1axm.LJZ();
        }
    }

    public C1AXN(C1AXM c1axm) {
        this.LIZ = c1axm;
    }

    @Override // X.InterfaceC964830bDN
    public final void onUserJoined(final String str) {
        Long l;
        String strLLIIII = this.LIZ.LLIIII(453);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LJLLL());
        sbLIZ.append(":onUserJoin linkMicId = ");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LIZ.LLJ(true);
        LinkUser linkUserLJIIJ = this.LIZ.LJJZ().LJIIJ(str);
        if (linkUserLJIIJ != null && (l = linkUserLJIIJ.userId) != null) {
            C1AXM c1axm = this.LIZ;
            for (InterfaceC958970b3v interfaceC958970b3v : c1axm.LLJJIJIIJIL) {
                LinkUser linkUserLJIIJJI = c1axm.LJJZ().LJIIJJI(l.longValue());
                if (linkUserLJIIJJI == null) {
                    LinkUser.Builder builder = new LinkUser.Builder();
                    builder.setUserId(l);
                    builder.setLinkMicId(str);
                    linkUserLJIIJJI = builder.build();
                }
                interfaceC958970b3v.LLLJ(linkUserLJIIJJI);
            }
            C1AXI c1axi = new C1AXI(EnumC918810a19.StateJoined, l, str, null, null, null, null, 1016);
            C1AXM c1axm2 = this.LIZ;
            if (c1axm2.LJJLIIJ().LJIILLIIL(c1axi, null)) {
                c1axm2.LLIILII("on user join", null);
            }
            this.LIZ.LL(true);
            return;
        }
        String strLLIIII2 = this.LIZ.LLIIII(446);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ.LJLLL());
        sbLIZ2.append(":onUserJoined return as  there isn't linkMicId in linkedList");
        C1AZW.LJIIJ(12, strLLIIII2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        this.LIZ.LLILLL.add(new Runnable() { // from class: X.0hdh
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LinkLayoutManager@cbf4.mRtcCallback$1$onUserJoined$1");
                try {
                    this.LL.onUserJoined(str);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LinkLayoutManager@cbf4.mRtcCallback$1$onUserJoined$1");
            }
        });
    }

    @Override // X.InterfaceC964830bDN
    public final void LIZIZ(final String str, final SurfaceView surfaceView) {
        if (this.LIZ.LJLJJLL().LIZLLL(str) == null) {
            this.LIZ.LLILZ.add(new Runnable() { // from class: X.0hdg
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LinkLayoutManager@cbf4.mRtcCallback$1$onFirstRemoteAuxStreamVideoRender$1");
                    try {
                        this.LL.LIZIZ(str, surfaceView);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LinkLayoutManager@cbf4.mRtcCallback$1$onFirstRemoteAuxStreamVideoRender$1");
                }
            });
            return;
        }
        if (surfaceView != null) {
            C1AXM.LLIL(surfaceView);
        }
        C1AXM c1axm = this.LIZ;
        if (c1axm.LL.LIZIZ == 4) {
            c1axm.LJJLIIJ().LJIILLIIL(new C1AXI(EnumC918810a19.StateInit, null, str, surfaceView, null, null, null, 976), null);
        }
        C1AXM c1axm2 = this.LIZ;
        if (c1axm2.LL.LIZIZ == 2) {
            c1axm2.LJJLIIJ().LJIILLIIL(new C1AXI(EnumC918810a19.StateLinked, null, str, surfaceView, null, null, null, 976), null);
        }
        this.LIZ.LLIILII("onFirstRemoteAuxStreamVideoRender", null);
    }

    @Override // X.InterfaceC964830bDN
    public final void LIZLLL(final String str, LinkLayerRTCMessage linkLayerRTCMessage) {
        final String str2;
        String strLLIIII = this.LIZ.LLIIII(522);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LJLLL());
        sbLIZ.append(":onRoomMsgReceived LINK_LAYER_LAYOUT_CHANGE param = ");
        sbLIZ.append(linkLayerRTCMessage.param);
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LinkLayerRTCMessageParam linkLayerRTCMessageParam = linkLayerRTCMessage.param;
        if (linkLayerRTCMessageParam != null && (str2 = linkLayerRTCMessageParam.layoutId) != null) {
            final C1AXM c1axm = this.LIZ;
            c1axm.LL.LJFF.LJJL(c1axm.LLJJIII.LIZ, str2, new InterfaceC1303160k14() { // from class: X.1AXo
                @Override // X.InterfaceC1303160k14
                public final void LIZ(Layout layout) throws JSONException {
                    if (layout != null) {
                        C1AXM c1axm2 = c1axm;
                        String str3 = str;
                        String str4 = str2;
                        String strLLIIII2 = c1axm2.LLIIII(527);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(c1axm2.LJLLL());
                        sbLIZ2.append(":onRoomMsgReceived linkMicId = ");
                        sbLIZ2.append(str3);
                        sbLIZ2.append(" layoutId = ");
                        sbLIZ2.append(str4);
                        C1AZW.LJIIJ(12, strLLIIII2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                        C1AXM.LLIZLLLIL(c1axm2, layout, "onLayoutMsgReceived", false, false, false, false, false, null, 252);
                    }
                }
            }, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r20v0, types: [android.view.SurfaceView] */
    /* JADX WARN: Type inference failed for: r20v1, types: [android.view.SurfaceView] */
    /* JADX WARN: Type inference failed for: r21v0, types: [X.1AYd] */
    /* JADX WARN: Type inference failed for: r21v1, types: [X.1AYd] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.ref.WeakReference] */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.ref.WeakReference] */
    /* JADX WARN: Type inference failed for: r23v0, types: [X.0a19] */
    /* JADX WARN: Type inference failed for: r23v1, types: [X.0a19] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.widget.FrameLayout, java.lang.String, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v4, types: [X.1AYR] */
    /* JADX WARN: Type inference failed for: r8v5, types: [X.1AYR] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout r26, final com.bytedance.android.livesdk.sei.SeiAppData r27) {
        /*
            Method dump skipped, instruction units count: 1151
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AXN.LJI(com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout, com.bytedance.android.livesdk.sei.SeiAppData):void");
    }

    public final void LJII(DslLayout dslLayout, InterfaceC940430aa1 interfaceC940430aa1) {
        String str;
        Integer numValueOf;
        String str2;
        SeiDsl seiDsl;
        SeiDsl seiDsl2;
        Long l;
        SeiDsl seiDsl3;
        FrameLayout frameLayout;
        C1AXM c1axm = this.LIZ;
        Long l2 = null;
        if (c1axm.LLLIL != null) {
            SeiAppData seiAppData = c1axm.LLLIILIL;
            if (seiAppData != null) {
                seiDsl3 = seiAppData.dsl;
            } else {
                seiDsl3 = null;
            }
            if (Intrinsics.LJFF(seiDsl3, interfaceC940430aa1.LJII())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                int i = 0;
                for (C1AX3 c1ax3 : this.LIZ.LJJLIIJ().LIZIZ()) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C1AX3 c1ax32 = c1ax3;
                        String str3 = c1ax32.LIZ.LIZJ;
                        if (str3 != null) {
                            linkedHashMap2.put(str3, c1ax32);
                            linkedHashMap.put(str3, Integer.valueOf(i));
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                Set<String> setLJII = C15442062u.LJII(this.LIZ.LJJLIIJ().LJII(), C13LP.LLIIJI(interfaceC940430aa1.LJ()));
                C1AXM c1axm2 = this.LIZ;
                for (String str4 : setLJII) {
                    if (str4 != null) {
                        c1axm2.LJJLIIJ().LJIIL(str4);
                    }
                }
                List<String> listLJ = interfaceC940430aa1.LJ();
                C1AXM c1axm3 = this.LIZ;
                for (String str5 : listLJ) {
                    if (str5 != null) {
                        LinkUser linkUserLJIIJ = c1axm3.LL.LJFF.LJIIJ(str5);
                        if (linkUserLJIIJ != null) {
                            l2 = linkUserLJIIJ.userId;
                        }
                        String strLJLLL = c1axm3.LJLLL();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onSei linkMicId:");
                        sbLIZ.append(str5);
                        sbLIZ.append(", userId:");
                        sbLIZ.append(l2);
                        C20441214yg.LIZIZ(strLJLLL, C2188811AlT.LIZIZ(sbLIZ));
                        C1AYR c1ayrLJJLIIJ = c1axm3.LJJLIIJ();
                        EnumC918810a19 enumC918810a19 = EnumC918810a19.StateLinked;
                        C1AXI c1axi = new C1AXI(enumC918810a19, l2, str5, null, null, null, enumC918810a19, 952);
                        C1AX3 c1ax33 = (C1AX3) linkedHashMap2.get(str5);
                        if (c1ax33 != null) {
                            frameLayout = c1ax33.LIZIZ;
                        } else {
                            frameLayout = null;
                        }
                        c1ayrLJJLIIJ.LJIILLIIL(c1axi, frameLayout);
                    }
                    l2 = null;
                }
                return;
            }
        }
        Set<String> setLJII2 = C15442062u.LJII(this.LIZ.LJJLIIJ().LJII(), C13LP.LLIIJI(interfaceC940430aa1.LJ()));
        C1AXM c1axm4 = this.LIZ;
        for (String str6 : setLJII2) {
            if (str6 != null) {
                c1axm4.LJJLIIJ().LJIIL(str6);
            }
        }
        List<String> listLJ2 = interfaceC940430aa1.LJ();
        C1AXM c1axm5 = this.LIZ;
        for (String str7 : listLJ2) {
            if (str7 != null) {
                LinkUser linkUserLJIIJ2 = c1axm5.LL.LJFF.LJIIJ(str7);
                if (linkUserLJIIJ2 != null) {
                    l = linkUserLJIIJ2.userId;
                } else {
                    l = null;
                }
                C1AZW c1azw = C1AZW.LIZ;
                String strLLIIII = c1axm5.LLIIII(340);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c1axm5.LJLLL());
                sbLIZ2.append(":onSei linkMicId:");
                sbLIZ2.append(str7);
                sbLIZ2.append(", userId:");
                sbLIZ2.append(l);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                c1azw.getClass();
                C1AZW.LIZ(strLLIIII, strLIZIZ, null, null);
                c1axm5.LJJLIIJ().LJIILLIIL(new C1AXI(EnumC918810a19.StateLinked, l, str7, null, null, null, null, 1016), null);
            }
        }
        this.LIZ.LLJJIII.LIZ = dslLayout.version;
        SeiDsl seiDslLJII = interfaceC940430aa1.LJII();
        if (seiDslLJII != null && (str = seiDslLJII.layoutId) != null) {
            final C1AXM c1axm6 = this.LIZ;
            C1AXQ c1axq = c1axm6.LL.LJFF;
            int i3 = dslLayout.version;
            InterfaceC1303160k14 interfaceC1303160k14 = new InterfaceC1303160k14() { // from class: X.1AXb
                /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
                @Override // X.InterfaceC1303160k14
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(com.bytedance.android.livesdk.comp.api.linkcore.model.Layout r11) throws org.json.JSONException {
                    /*
                        r10 = this;
                        r1 = r11
                        if (r1 == 0) goto L1c
                        X.1AXM r0 = r1
                        java.lang.String r2 = "realHandleSeiLink"
                        r3 = 1
                        r4 = 0
                        r8 = 0
                        r9 = 248(0xf8, float:3.48E-43)
                        r5 = r4
                        r6 = r4
                        r7 = r4
                        X.C1AXM.LLIZLLLIL(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    L12:
                        X.1AXM r0 = r1
                        X.1AXw r1 = r0.LJLJI()
                        r0 = 0
                        r1.LIZIZ = r0
                        return
                    L1c:
                        com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkNotFindDslEndLayout r0 = com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkNotFindDslEndLayout.INSTANCE
                        boolean r0 = r0.audienceEnable()
                        if (r0 == 0) goto L43
                        X.1AXM r2 = r1
                        X.1AIb r0 = r2.LL
                        int r1 = r0.LIZIZ
                        r0 = 2
                        if (r1 != r0) goto L43
                        java.util.concurrent.ConcurrentLinkedQueue<X.0b3v> r0 = r2.LLJJIJIIJIL
                        java.util.Iterator r1 = r0.iterator()
                    L33:
                        boolean r0 = r1.hasNext()
                        if (r0 == 0) goto L12
                        java.lang.Object r0 = r1.next()
                        X.0b3v r0 = (X.InterfaceC958970b3v) r0
                        r0.LLJJJ()
                        goto L33
                    L43:
                        X.1AXM r0 = r1
                        r0.ul()
                        goto L12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2180931AXb.LIZ(com.bytedance.android.livesdk.comp.api.linkcore.model.Layout):void");
                }
            };
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("LinkLayoutManager#realHandleSei-605(scene:");
            SeiAppData seiAppDataLIZ = interfaceC940430aa1.LIZ();
            if (seiAppDataLIZ != null && (seiDsl2 = seiAppDataLIZ.dsl) != null) {
                numValueOf = Integer.valueOf(seiDsl2.scene);
            } else {
                numValueOf = null;
            }
            sbLIZ3.append(numValueOf);
            sbLIZ3.append(",layoutId:");
            SeiAppData seiAppDataLIZ2 = interfaceC940430aa1.LIZ();
            if (seiAppDataLIZ2 != null && (seiDsl = seiAppDataLIZ2.dsl) != null) {
                str2 = seiDsl.layoutId;
            } else {
                str2 = null;
            }
            sbLIZ3.append(str2);
            sbLIZ3.append(')');
            c1axq.LJJL(i3, str, interfaceC1303160k14, C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0520  */
    @Override // X.InterfaceC964830bDN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C945320ahu r14, final X.InterfaceC940430aa1 r15, boolean r16) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AXN.LJ(X.0ahu, X.0aa1, boolean):void");
    }

    @Override // X.InterfaceC964830bDN
    public final void LJFF(long j, String str, Long l) {
        C1AXI c1axi;
        SurfaceView surfaceView;
        LayoutSlardarMonitor layoutSlardarMonitor;
        Long l2 = l;
        String strLLIIII = this.LIZ.LLIIII(484);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LJLLL());
        sbLIZ.append(":onUserLeft linkMicId = ");
        sbLIZ.append(str);
        sbLIZ.append(" leaveReason = ");
        sbLIZ.append(j);
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (l2 == null) {
            LinkUser linkUserLJIIJ = this.LIZ.LJJZ().LJIIJ(str);
            if (linkUserLJIIJ != null) {
                l2 = linkUserLJIIJ.userId;
            } else {
                l2 = null;
            }
        }
        long j2 = this.LIZ.LL.LJ;
        if (l2 != null && l2.longValue() == j2) {
            return;
        }
        Iterator<C1AX3> it2 = this.LIZ.LJJLIIJ().LIZIZ().iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().LIZ.LIZJ, str)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        C1AXM c1axm = this.LIZ;
        if (i != -1 && (layoutSlardarMonitor = c1axm.LLLJ) != null) {
            layoutSlardarMonitor.LIZIZ(false, l2, str, Integer.valueOf(c1axm.LJJLIIJ().LJIILIIL(i)), Integer.valueOf(i), false, c1axm.LJLLL());
        }
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        if (l2 != null && l2.longValue() == currentUserId) {
            C1AXM c1axm2 = this.LIZ;
            if (c1axm2.LLLIZZ) {
                return;
            }
            Integer numLIZLLL = c1axm2.LJLJJLL().LIZLLL(str);
            if (numLIZLLL != null) {
                C1AXM c1axm3 = this.LIZ;
                SurfaceView surfaceView2 = c1axm3.LJJLIIJ().LJFF(numLIZLLL.intValue()).LIZ.LIZLLL;
                if (surfaceView2 == null) {
                    c1axm3.LJJLIIJ().LJIIL(str);
                    String strLLIIII2 = c1axm3.LLIIII(502);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c1axm3.LJLLL());
                    sbLIZ2.append(":onUserLeft release return as surfaceView is null!");
                    C1AZW.LJFF(strLLIIII2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                    return;
                }
                C1AXM.LLIL(surfaceView2);
            }
            this.LIZ.LLJ(false);
            this.LIZ.LJJLIIJ().LJIIL(str);
        } else {
            C1AX3 c1ax3LJI = this.LIZ.LJJLIIJ().LJI(str);
            if (c1ax3LJI != null && (c1axi = c1ax3LJI.LIZ) != null && (surfaceView = c1axi.LIZLLL) != null) {
                C1AXM.LLIL(surfaceView);
            }
            this.LIZ.LJJLIIJ().LJIIL(str);
        }
        this.LIZ.LL(true);
        this.LIZ.LLIILII("onUserLeft", null);
    }

    @Override // X.InterfaceC964830bDN
    public final void LIZ(final EnumC964810bDL enumC964810bDL, final String str, SurfaceView surfaceView, final InterfaceC1268870j7l interfaceC1268870j7l) throws JSONException {
        boolean z;
        C1AXI c1axi;
        final SurfaceView surfaceView2 = surfaceView;
        String strLLIIII = this.LIZ.LLIIII(538);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LJLLL());
        sbLIZ.append(":onFirstRemoteVideoFrameRender linkMicId = ");
        sbLIZ.append(str);
        sbLIZ.append(", surfaceView == null? ");
        boolean z2 = false;
        if (surfaceView2 == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" layer == null ? ");
        if (interfaceC1268870j7l == null) {
            z2 = true;
        }
        sbLIZ.append(z2);
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LIZ.LLJ(true);
        LinkUser linkUserLJIIJ = this.LIZ.LJJZ().LJIIJ(str);
        if (linkUserLJIIJ == null) {
            String strLJJJJI = this.LIZ.LL.LJFF.LJJJJI();
            if (LivesdkLinkmicLayoutApplogCombineSetting.INSTANCE.isLinkUserNotFoundReportEnable()) {
                JSONObject jSONObjectLIZ = C1303200k18.LIZ(null);
                jSONObjectLIZ.put("sub_event", "linkuser_not_found");
                jSONObjectLIZ.put("target_linkmic_id", str);
                jSONObjectLIZ.put("latest_msg_id", strLJJJJI);
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_linkmic_layout_exception", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_1000()));
                c474500IjALIZIZ.LJJIIJZLJL(jSONObjectLIZ);
                if (BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
                    c474500IjALIZIZ.LIZ();
                } else {
                    c474500IjALIZIZ.LJJIJLIJ();
                    c474500IjALIZIZ.LJJIJL();
                }
                C1304680k3W.LIZ.LIZ(40003, C786410Ut5.J3(jSONObjectLIZ), null);
            }
            String strLLIIII2 = this.LIZ.LLIIII(581);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LIZ.LJLLL());
            sbLIZ2.append(",onFirstRemoteVideoFrameRender linkUser ");
            sbLIZ2.append(str);
            sbLIZ2.append(" not found and report");
            C1AZW.LJFF(strLLIIII2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            this.LIZ.LLILLL.add(new Runnable() { // from class: X.0hf3
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LinkLayoutManager@cbf4.mRtcCallback$1$onRemoteRender$1");
                    try {
                        this.LL.LIZ(enumC964810bDL, str, surfaceView2, interfaceC1268870j7l);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LinkLayoutManager@cbf4.mRtcCallback$1$onRemoteRender$1");
                }
            });
            return;
        }
        C1AX3 c1ax3LJI = this.LIZ.LJJLIIJ().LJI(str);
        C1AYR c1ayrLJJLIIJ = this.LIZ.LJJLIIJ();
        Long l = linkUserLJIIJ.userId;
        String str2 = linkUserLJIIJ.linkMicId;
        EnumC918810a19 enumC918810a19 = EnumC918810a19.StateLinked;
        if (surfaceView2 == null) {
            if (c1ax3LJI != null && (c1axi = c1ax3LJI.LIZ) != null) {
                surfaceView2 = c1axi.LIZLLL;
            } else {
                surfaceView2 = null;
            }
        }
        c1ayrLJJLIIJ.LJIILLIIL(new C1AXI(enumC918810a19, l, str2, surfaceView2, null, new WeakReference(interfaceC1268870j7l), null, 976), null);
        this.LIZ.LLIILII("onRemoteRender", null);
    }
}

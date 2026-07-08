package X;

import Y.AfS13S1201000_15;
import Y.AfS41S1200000_15;
import Y.AfS4S1210000_15;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestSameAsIosZoomSetting;
import com.bytedance.android.livesdk.model.message.EnlargePositionStatusSynContent;
import com.bytedance.scene.Scene;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;
import webcast.data.multilive_biz.BizChangeLayoutParams;

/* JADX INFO: renamed from: X.0a33, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C919990a33 extends AbstractC919970a31 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJFF;
    public final String LIZJ;
    public final C919900a2u LIZLLL;
    public final C304201Fw LJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C919990a33.class, "anchorUserManager", "getAnchorUserManager()Lcom/bytedance/android/live/liveinteract/multiguestv3/service/usermanage/common/IAnchorUserManager;", 0);
        C13LE.LIZ.getClass();
        LJFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public void LJJIIJ(EnlargePositionStatusSynContent enlargePositionStatusSynContent) {
    }

    @Override // X.InterfaceC927510aFB
    public final List<PosIdentity> LIZIZ() {
        return this.LIZ.LJIIIIZZ();
    }

    public final InterfaceC302401Fe LJJIII() {
        C304201Fw c304201Fw = this.LJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJFF;
        return (InterfaceC302401Fe) c304201Fw.LIZ();
    }

    @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
    public final EnumC920250a3T LJIJJLI() {
        return LJIL(LJIILL());
    }

    @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
    public final void destroy() {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        super.destroy();
        C919900a2u c919900a2u = this.LIZLLL;
        c919900a2u.getClass();
        C915980Zwa.LJIIIIZZ().a9(c919900a2u.LJ);
        C304201Fw c304201Fw = c919900a2u.LIZLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C919900a2u.LJII;
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) c304201Fw.LIZ();
        if (linkMessageCenter != null) {
            linkMessageCenter.LJ(c919900a2u.LJFF);
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null) {
            return;
        }
        interfaceC937900aVwLLIIJLIL.LJLJLJ(c919900a2u.LJI);
    }

    public C919990a33(C919350a21 c919350a21) {
        super(c919350a21);
        this.LIZJ = "Zoom/ZoomAnchorPresent";
        this.LIZLLL = new C919900a2u(this, c919350a21);
        this.LJ = new C304201Fw("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
    }

    public static void LJJIIJZLJL(String str) {
        Layout layoutLJFF;
        int iLIZIZ;
        int i;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL();
            int i2 = 1;
            if (interfaceC937900aVwLLIIJLIL != null && (layoutLJFF = interfaceC937900aVwLLIIJLIL.LJFF()) != null && layoutLJFF.isFloatType()) {
                InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL2 != null) {
                    iLIZIZ = interfaceC954180awCLLJLL2.LIZIZ();
                } else {
                    iLIZIZ = 0;
                }
                InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL3 != null) {
                    Layout layoutLJFF2 = interfaceC937900aVwLLIIJLIL.LJFF();
                    if (layoutLJFF2 != null) {
                        i = layoutLJFF2.micCount;
                    } else {
                        i = 0;
                    }
                    if (str == null) {
                        str = "";
                    }
                    BizChangeLayoutParams bizChangeLayoutParams = new BizChangeLayoutParams();
                    if (iLIZIZ > 1) {
                        i2 = 3;
                    }
                    bizChangeLayoutParams.displayId = i2;
                    interfaceC954180awCLLJLL3.LLFF(new C920450a3n(i, str, bizChangeLayoutParams), null);
                }
            }
        }
    }

    @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
    public final void LJIIJ(List<String> list) {
        AbstractC919790a2j abstractC919790a2j = this.LIZ;
        ((LinkedHashMap) abstractC919790a2j.LJI).clear();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            abstractC919790a2j.LJI.put(it2.next(), Boolean.TRUE);
        }
    }

    @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
    public EnumC920250a3T LJIL(String str) {
        if (LJJI(str)) {
            EnumC920250a3T enumC920250a3T = EnumC920250a3T.CAN_ZOOM_TO_MAX;
            if (!(!Intrinsics.LJFF(str, LJIILIIL())) || enumC920250a3T == null) {
                return EnumC920250a3T.CAN_ZOOM_TO_MIN;
            }
            return enumC920250a3T;
        }
        return EnumC920250a3T.ZOOM_DISABLED;
    }

    public boolean LJJI(String str) {
        boolean zLJFF;
        int iLJIILLIIL = this.LIZ.LJIILLIIL(C920280a3W.LIZ(), str);
        AbstractC919790a2j.LJIIJJI.getClass();
        if (iLJIILLIIL != AbstractC919790a2j.LJIILIIL) {
            AbstractC919790a2j abstractC919790a2j = this.LIZ;
            if (abstractC919790a2j.LJFF != null) {
                return true;
            }
            boolean zLJIIJJI = abstractC919790a2j.LJIIJJI(Boolean.FALSE, str);
            if (LJIIIIZZ()) {
                if (!zLJIIJJI && this.LIZ.LJIIJ(str)) {
                    return false;
                }
                return true;
            }
            Layout layoutLIZLLL = this.LIZ.LIZLLL();
            if (layoutLIZLLL == null) {
                return false;
            }
            if (zLJIIJJI) {
                zLJFF = Intrinsics.LJFF(layoutLIZLLL.layoutId, layoutLIZLLL.anchorZoomLayoutId);
            } else if (!this.LIZ.LJIIJ(str)) {
                zLJFF = Intrinsics.LJFF(layoutLIZLLL.layoutId, layoutLIZLLL.zoomLayoutId);
            }
            return !zLJFF;
        }
        return false;
    }

    @Override // X.InterfaceC927510aFB
    public final AbstractC19486711Lt LJIILLIIL(int i, final boolean z) {
        return this.LIZ.LJJIIJZLJL(i, z).LJII(new InterfaceC781210Ukh() { // from class: X.0a3D
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                Layout layoutLIZLLL;
                String str;
                if (z || (layoutLIZLLL = this.LIZ.LIZLLL()) == null || (str = layoutLIZLLL.layoutId) == null) {
                    return;
                }
                this.getClass();
                C919990a33.LJJIIJZLJL(str);
            }
        });
    }

    @Override // X.InterfaceC927510aFB
    public void LJ(int i, Function1 function1, boolean z, boolean z2) {
        function1.invoke(LJIILLIIL(i, z));
    }

    public final void LJJIFFI(int i, InterfaceC920110a3F interfaceC920110a3F, String str, String str2, Throwable th) {
        if (str2 == null) {
            str2 = C497740JfY.LJIJI(2131851936);
        }
        if (th != null) {
            C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
            StackTraceElement[] stackTrace = th.getStackTrace();
            c1143300frELJIIJJI.getClass();
            AbstractC1143290frD.LJIIJ(stackTrace, 0);
        } else {
            C1143300frE.LJIIJJI().LJII(this.LIZJ, C2097608Jq.LJIIJ(new Pair("action", "zoomGuestToMax"), new Pair("linkMicId", str), new Pair("errorCode", Integer.valueOf(i)), new Pair("errorMessage", str2)));
        }
        if (interfaceC920110a3F != null) {
            interfaceC920110a3F.LIZ(i, str, str2, th);
        }
    }

    public final void LJJIIZ(final String str, final InterfaceC920110a3F interfaceC920110a3F, Map<String, String> map, final boolean z, boolean z2, final EnumC919910a2v enumC919910a2v) {
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        String str2 = this.LIZJ;
        Map<String, ?> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("action", "zoomGuestToMin"), new Pair("linkMicId", str));
        mapLJIIJ.putAll(map);
        c1143300frELJIIJJI.LJII(str2, mapLJIIJ);
        this.LIZ.LJI.put(str, Boolean.valueOf(z2));
        C11NJ c11nj = this.LIZIZ;
        C480460Ism.LIZ().getClass();
        c11nj.LIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).zoom(map).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0a39
            @Override // X.C09JN
            public final void accept(Object obj) {
                String str3;
                C1C7U.LIZ("ZoomAnchorPresent@8a17.zoomGuestToMin$2");
                BaseResponse baseResponse = (BaseResponse) obj;
                C930480aJy.LIZ.getClass();
                int i = baseResponse.statusCode;
                if (i == 0) {
                    EnumC919910a2v enumC919910a2v2 = enumC919910a2v;
                    if (enumC919910a2v2 == EnumC919910a2v.FROM_MULTI_GUEST_MANAGE_PANEL) {
                        C919870a2r.LIZJ(3, Long.valueOf(C01HE.LJI(str)).toString(), "cancel_enlarge");
                    } else if (enumC919910a2v2 == EnumC919910a2v.FROM_HOST_ZOOM_SELF) {
                        C919870a2r.LIZIZ(1, "enlarge");
                    }
                    InterfaceC920110a3F interfaceC920110a3F2 = interfaceC920110a3F;
                    if (interfaceC920110a3F2 != null) {
                        interfaceC920110a3F2.LIZJ(str);
                    }
                    if (z && MultiGuestSameAsIosZoomSetting.INSTANCE.isEnable()) {
                        Layout layoutLIZLLL = this.LIZ.LIZLLL();
                        if (layoutLIZLLL != null) {
                            str3 = layoutLIZLLL.layoutId;
                        } else {
                            str3 = null;
                        }
                        C919990a33.LJJIIJZLJL(str3);
                    }
                } else {
                    this.LJJIFFI(i, interfaceC920110a3F, str, baseResponse.LJ.message, null);
                }
                C1C7U.LIZIZ("ZoomAnchorPresent@8a17.zoomGuestToMin$2");
            }
        }, new AfS41S1200000_15(this, interfaceC920110a3F, str, 6)));
    }

    @Override // X.InterfaceC927510aFB
    public void LJI(String str, InterfaceC920110a3F interfaceC920110a3F, boolean z, boolean z2, boolean z3, boolean z4, EnumC919910a2v enumC919910a2v, C334801Rq c334801Rq) {
        String str2;
        int iLIZ = this.LIZ.LIZ(str, z3);
        int i = 0;
        C1143300frE.LJIIJJI().LJII(this.LIZJ, C2097608Jq.LJIIJ(new Pair("action", "zoom"), new Pair("linkMicId", str), new Pair("noMoreZoom", Boolean.valueOf(z2)), new Pair("zoomFromAnchor", Boolean.valueOf(z3)), new Pair(Scene.SCENE_SERVICE, Integer.valueOf(iLIZ)), new Pair("zoomSource", enumC919910a2v.name()), new Pair("playTrafficData", c334801Rq)));
        if (iLIZ != 1 && iLIZ != 2) {
            this.LIZ.getClass();
            Map<String, String> mapLJFF = AbstractC919790a2j.LJFF(iLIZ, 0L, str, z2);
            if (this.LIZ.LJIIJJI(Boolean.FALSE, str)) {
                C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                String str3 = this.LIZJ;
                Map<String, ?> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("action", "zoomAnchorToMin"), new Pair("linkMicId", str));
                mapLJIIJ.putAll(mapLJFF);
                c1143300frELJIIJJI.LJII(str3, mapLJIIJ);
                C11NJ c11nj = this.LIZIZ;
                C480460Ism.LIZ().getClass();
                c11nj.LIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).zoom(mapLJFF).LJIILIIL(new C0UO0()).LJJLL(new AfS4S1210000_15(this, interfaceC920110a3F, str, z, 1), new AfS41S1200000_15(this, interfaceC920110a3F, str, 8)));
                return;
            }
            LJJIIZ(str, interfaceC920110a3F, mapLJFF, z, z2, enumC919910a2v);
            return;
        }
        if (this.LIZ.LJIIJJI(Boolean.FALSE, str)) {
            str2 = "anchor";
        } else {
            str2 = "guest";
        }
        String str4 = null;
        if (!LJJI(str)) {
            if (interfaceC920110a3F != null) {
                interfaceC920110a3F.LIZ(EnumC919060a1Y.E_C_GUEST_REJECT_ZOOM.ordinal(), str, "", null);
            }
        } else {
            this.LIZ.getClass();
            if (AbstractC919790a2j.LJIJI() == null) {
                if (interfaceC920110a3F != null) {
                    interfaceC920110a3F.LIZ(EnumC919060a1Y.E_C_ROOM_EMPTY.ordinal(), str, "", null);
                }
            } else {
                C1143300frE.LJIIJJI().LJII(this.LIZJ, C2097608Jq.LJIIJ(new Pair("action", "tryZoomToMax status ready")));
                String strLJJIIZ = this.LIZ.LJJIIZ(Boolean.FALSE, str);
                this.LIZ.getClass();
                Map<String, String> mapLJFF2 = AbstractC919790a2j.LJFF(iLIZ, 0L, str, false);
                if (strLJJIIZ == null) {
                    if (interfaceC920110a3F != null) {
                        interfaceC920110a3F.LIZ(EnumC919060a1Y.E_C_LAYOUT_EMPTY.ordinal(), str, "", null);
                    }
                    C01N8.LIZ(0, "zoom", "zoom_max", 0L, str2, "empty_layoutId", "");
                    return;
                }
                if (this.LIZ.LJIIJJI(Boolean.FALSE, str)) {
                    if (C500260Jjc.LJJIIZ(this.LIZ.LJ)) {
                        Layout layoutLJII = this.LIZ.LJII();
                        if (layoutLJII != null) {
                            str4 = layoutLJII.layoutId;
                        }
                        if (Intrinsics.LJFF(strLJJIIZ, str4)) {
                            String strLJJIJIL = this.LIZ.LJJIJIL();
                            if (strLJJIJIL == null) {
                                return;
                            }
                            HashMap map = (HashMap) mapLJFF2;
                            map.put(Scene.SCENE_SERVICE, "3");
                            String strLJIILIIL = LJIILIIL();
                            String str5 = "";
                            if (strLJIILIIL == null) {
                                strLJIILIIL = "";
                            }
                            map.put("linkmic_id", strLJIILIIL);
                            String strLJIILIIL2 = LJIILIIL();
                            if (strLJIILIIL2 != null) {
                                str5 = strLJIILIIL2;
                            }
                            map.put("guest_user_id", String.valueOf(C01HE.LJI(str5)));
                            LJJIIZ(strLJJIJIL, interfaceC920110a3F, mapLJFF2, z, false, enumC919910a2v);
                            return;
                        }
                    }
                    C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
                    String str6 = this.LIZJ;
                    Map<String, ?> mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("action", "zoomAnchorToMax"), new Pair("linkMicId", str));
                    mapLJIIJ2.putAll(mapLJFF2);
                    c1143300frELJIIJJI2.LJII(str6, mapLJIIJ2);
                    boolean zLJJ = LJJ();
                    C480460Ism.LIZ().getClass();
                    ((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).zoom(mapLJFF2).LJIILIIL(new C0UO0()).LJJLL(new AfS4S1210000_15(this, interfaceC920110a3F, str, zLJJ, 0), new AfS41S1200000_15(this, interfaceC920110a3F, str, 7));
                    return;
                }
                C1143300frE c1143300frELJIIJJI3 = C1143300frE.LJIIJJI();
                String str7 = this.LIZJ;
                Map<String, ?> mapLJIIJ3 = C2097608Jq.LJIIJ(new Pair("action", "zoomGuestToMax"), new Pair("linkMicId", str));
                mapLJIIJ3.putAll(mapLJFF2);
                c1143300frELJIIJJI3.LJII(str7, mapLJIIJ3);
                if (C500260Jjc.LJJIIZ(LJIILIIL())) {
                    if (LJJ()) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                }
                C11NJ c11nj2 = this.LIZIZ;
                C480460Ism.LIZ().getClass();
                c11nj2.LIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).zoom(mapLJFF2).LJIILIIL(new C0UO0()).LJJLL(new AfS13S1201000_15(this, str, i, interfaceC920110a3F, 0), new AfS41S1200000_15(this, interfaceC920110a3F, str, 9)));
                return;
            }
        }
        C1143300frE.LJIIJJI().LJII(this.LIZJ, C2097608Jq.LJIIJ(new Pair("action", "tryZoomToMax status check failed")));
        C01N8.LIZ(0, "zoom", "zoom_max", 0L, str2, "room_status_unavailable", "");
    }
}

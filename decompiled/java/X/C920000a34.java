package X;

import Y.AfS13S1201000_15;
import Y.AfS41S1200000_15;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.scene.Scene;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0a34, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C920000a34 extends AbstractC919970a31 {
    public final String LIZJ;

    @Override // X.InterfaceC927510aFB
    public final List<PosIdentity> LIZIZ() {
        return this.LIZ.LJIIIIZZ();
    }

    public C920000a34(AbstractC919790a2j abstractC919790a2j) {
        super(abstractC919790a2j);
        this.LIZJ = "Zoom/ZoomModeratorPresenter";
    }

    @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
    public EnumC920250a3T LJIL(String str) {
        String strLJIILIIL;
        if (LJJI(str)) {
            EnumC920250a3T enumC920250a3T = EnumC920250a3T.CAN_ZOOM_TO_MAX;
            AbstractC919790a2j abstractC919790a2j = this.LIZ;
            if (!(abstractC919790a2j instanceof C919770a2h) || (strLJIILIIL = ((C919770a2h) abstractC919790a2j).LJIJJ) == null) {
                strLJIILIIL = LJIILIIL();
            }
            if (!(!Intrinsics.LJFF(str, strLJIILIIL)) || enumC920250a3T == null) {
                return EnumC920250a3T.CAN_ZOOM_TO_MIN;
            }
            return enumC920250a3T;
        }
        return EnumC920250a3T.ZOOM_DISABLED;
    }

    public boolean LJJI(String str) {
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL()) {
            int iLJIILLIIL = this.LIZ.LJIILLIIL(C920280a3W.LIZ(), str);
            AbstractC919790a2j.LJIIJJI.getClass();
            if (iLJIILLIIL != AbstractC919790a2j.LJIILIIL) {
                AbstractC919790a2j abstractC919790a2j = this.LIZ;
                if (abstractC919790a2j.LJFF != null) {
                    return true;
                }
                if (abstractC919790a2j.LJIIJJI(Boolean.FALSE, str)) {
                    return false;
                }
                if (LJIIIIZZ()) {
                    return true;
                }
                if (this.LIZ.LIZLLL() == null) {
                    return false;
                }
                return !Intrinsics.LJFF(r0.layoutId, r0.zoomLayoutId);
            }
        }
        return false;
    }

    @Override // X.InterfaceC927510aFB
    public final AbstractC19486711Lt LJIILLIIL(int i, boolean z) {
        return C11QJ.LL;
    }

    @Override // X.InterfaceC927510aFB
    public final void LJ(int i, Function1 function1, boolean z, boolean z2) {
        function1.invoke(C11QJ.LL);
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

    @Override // X.InterfaceC927510aFB
    public void LJI(String str, InterfaceC920110a3F interfaceC920110a3F, boolean z, boolean z2, boolean z3, boolean z4, EnumC919910a2v enumC919910a2v, C334801Rq c334801Rq) {
        int iLIZ = this.LIZ.LIZ(str, z3);
        int i = 0;
        C1143300frE.LJIIJJI().LJII(this.LIZJ, C2097608Jq.LJIIJ(new Pair("action", "zoom"), new Pair("linkMicId", str), new Pair("noMoreZoom", Boolean.valueOf(z2)), new Pair("zoomFromAnchor", Boolean.valueOf(z3)), new Pair(Scene.SCENE_SERVICE, Integer.valueOf(iLIZ)), new Pair("zoomSource", enumC919910a2v.name())));
        if (iLIZ == 2) {
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
                    AbstractC919790a2j abstractC919790a2j = this.LIZ;
                    long currentUserId = UserService.getInstance().user().getCurrentUserId();
                    abstractC919790a2j.getClass();
                    Map<String, String> mapLJFF = AbstractC919790a2j.LJFF(iLIZ, currentUserId, str, false);
                    if (strLJJIIZ == null) {
                        if (interfaceC920110a3F != null) {
                            interfaceC920110a3F.LIZ(EnumC919060a1Y.E_C_LAYOUT_EMPTY.ordinal(), str, "", null);
                        }
                        C01N8.LIZ(0, "zoom", "zoom_max", 0L, "guest", "empty_layoutId", "");
                        return;
                    }
                    C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                    String str2 = this.LIZJ;
                    Map<String, ?> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("action", "zoomGuestToMax"), new Pair("linkMicId", str));
                    mapLJIIJ.putAll(mapLJFF);
                    c1143300frELJIIJJI.LJII(str2, mapLJIIJ);
                    if (C500260Jjc.LJJIIZ(this.LIZ.LJ)) {
                        if (LJJ()) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                    }
                    C11NJ c11nj = this.LIZIZ;
                    C480460Ism.LIZ().getClass();
                    c11nj.LIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).zoom(mapLJFF).LJIILIIL(new C0UO0()).LJJLL(new AfS13S1201000_15(this, str, i, interfaceC920110a3F, 1), new AfS41S1200000_15(interfaceC920110a3F, this, str, 13)));
                    return;
                }
            }
            C1143300frE.LJIIJJI().LJII(this.LIZJ, C2097608Jq.LJIIJ(new Pair("action", "tryZoomToMax status check failed")));
            C01N8.LIZ(0, "zoom", "zoom_max", 0L, "guest", "room_status_unavailable", "");
            return;
        }
        AbstractC919790a2j abstractC919790a2j2 = this.LIZ;
        long currentUserId2 = UserService.getInstance().user().getCurrentUserId();
        abstractC919790a2j2.getClass();
        Map<String, String> mapLJFF2 = AbstractC919790a2j.LJFF(iLIZ, currentUserId2, str, z2);
        C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
        String str3 = this.LIZJ;
        Map<String, ?> mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("action", "zoomGuestToMin"), new Pair("linkMicId", str));
        mapLJIIJ2.putAll(mapLJFF2);
        c1143300frELJIIJJI2.LJII(str3, mapLJIIJ2);
        this.LIZ.LJI.put(str, Boolean.valueOf(z2));
        C11NJ c11nj2 = this.LIZIZ;
        C480460Ism.LIZ().getClass();
        c11nj2.LIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).zoom(mapLJFF2).LJIILIIL(new C0UO0()).LJJLL(new AfS41S1200000_15(interfaceC920110a3F, this, str, 14), new AfS41S1200000_15(interfaceC920110a3F, this, str, 15)));
    }
}

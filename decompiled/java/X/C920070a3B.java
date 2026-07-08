package X;

import Y.AfS151S0200000_15;
import Y.AfS41S1200000_15;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageParams;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AwS55S1300000_15;
import kotlin.jvm.internal.AwS80S1300000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0a3B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920070a3B extends C920000a34 {
    public final C916180Zwu LIZLLL;

    public C920070a3B(AbstractC919790a2j abstractC919790a2j) {
        super(abstractC919790a2j);
        this.LIZLLL = new C916180Zwu(abstractC919790a2j.LIZ, new C11NJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // X.C920000a34, X.AbstractC919970a31, X.InterfaceC927510aFB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC920250a3T LJIL(java.lang.String r5) {
        /*
            r4 = this;
            X.0a2j r1 = r4.LIZ
            boolean r0 = r1 instanceof X.C919770a2h
            if (r0 == 0) goto L47
            X.0a2h r1 = (X.C919770a2h) r1
            java.util.List<tikcast.linkmic.common.PosIdentity> r0 = r1.LJIJJLI
            if (r0 == 0) goto L40
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L40
            X.0a2j r0 = r4.LIZ
            X.0a2h r0 = (X.C919770a2h) r0
            java.util.List<tikcast.linkmic.common.PosIdentity> r1 = r0.LJIJJLI
        L18:
            boolean r0 = r4.LJJI(r5)
            if (r0 == 0) goto L4c
            X.0a3T r3 = X.EnumC920250a3T.CAN_ZOOM_TO_MAX
            if (r1 == 0) goto L3b
            java.util.Iterator r2 = r1.iterator()
        L26:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r1 = r2.next()
            r0 = r1
            tikcast.linkmic.common.PosIdentity r0 = (tikcast.linkmic.common.PosIdentity) r0
            boolean r0 = r0.LIZJ(r5)
            if (r0 == 0) goto L26
            if (r1 != 0) goto L3d
        L3b:
            if (r3 != 0) goto L3f
        L3d:
            X.0a3T r3 = X.EnumC920250a3T.CAN_ZOOM_TO_MIN
        L3f:
            return r3
        L40:
            X.0a2j r0 = r4.LIZ
            java.util.List r1 = r0.LJIIIIZZ()
            goto L18
        L47:
            java.util.List r1 = r1.LJIIIIZZ()
            goto L18
        L4c:
            X.0a3T r3 = X.EnumC920250a3T.ZOOM_DISABLED
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C920070a3B.LJIL(java.lang.String):X.0a3T");
    }

    @Override // X.C920000a34
    public final boolean LJJI(String str) {
        if (this.LIZ.LJIIJJI(Boolean.FALSE, str)) {
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

    @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
    public final void LJIIJJI(InterfaceC920110a3F interfaceC920110a3F, String str) {
        EnlargeScreenManageParams enlargeScreenManageParams = new EnlargeScreenManageParams();
        C914970Zux.LIZ(enlargeScreenManageParams);
        enlargeScreenManageParams.scene = 9;
        enlargeScreenManageParams.layoutId = str;
        C480460Ism.LIZ().getClass();
        new C11NJ().LIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).zoom(enlargeScreenManageParams).LJIILIIL(new C0UO0()).LJJLL(new AfS151S0200000_15(interfaceC920110a3F, this, 62), new AfS151S0200000_15(interfaceC920110a3F, this, 63)));
    }

    public final void LJJIIJ(String str, EnlargeScreenManageParams enlargeScreenManageParams, InterfaceC920110a3F interfaceC920110a3F) {
        C480460Ism.LIZ().getClass();
        new C11NJ().LIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).zoom(enlargeScreenManageParams).LJIILIIL(new C0UO0()).LJJLL(new AfS41S1200000_15(interfaceC920110a3F, this, str, 16), new AfS41S1200000_15(interfaceC920110a3F, this, str, 17)));
    }

    public static void LJJIII(C920070a3B c920070a3B, Throwable th, InterfaceC920110a3F interfaceC920110a3F, String str) {
        int iOrdinal = EnumC919060a1Y.E_C_DEFAULT.ordinal();
        c920070a3B.getClass();
        String strLJIJI = C497740JfY.LJIJI(2131851936);
        if (th != null) {
            C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
            StackTraceElement[] stackTrace = th.getStackTrace();
            c1143300frELJIIJJI.getClass();
            AbstractC1143290frD.LJIIJ(stackTrace, 0);
        } else {
            C1143300frE.LJIIJJI().LJII("ZoomModeratorPresenterV2", C2097608Jq.LJIIJ(new Pair("action", "zoomGuestToMax"), new Pair("linkMicId", str), new Pair("errorCode", Integer.valueOf(iOrdinal)), new Pair("errorMessage", strLJIJI)));
        }
        if (interfaceC920110a3F != null) {
            interfaceC920110a3F.LIZ(iOrdinal, str, strLJIJI, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C920000a34, X.InterfaceC927510aFB
    public final void LJI(String str, InterfaceC920110a3F interfaceC920110a3F, boolean z, boolean z2, boolean z3, boolean z4, EnumC919910a2v enumC919910a2v, C334801Rq c334801Rq) {
        Context context;
        EnlargeScreenManageParams enlargeScreenManageParams = new EnlargeScreenManageParams();
        C914970Zux.LIZ(enlargeScreenManageParams);
        PosIdentity posIdentity = new PosIdentity();
        posIdentity.type = 1;
        posIdentity.value = str;
        enlargeScreenManageParams.operatedPosition = posIdentity;
        enlargeScreenManageParams.linkmicId = str;
        enlargeScreenManageParams.guestUserId = C01HE.LJI(str);
        Iterator<PosIdentity> it2 = this.LIZ.LJIIIIZZ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            PosIdentity next = it2.next();
            if (next.LIZJ(str)) {
                if (next != null) {
                    enlargeScreenManageParams.scene = 8;
                    String str2 = this.LIZ.LIZJ;
                    if (str2 == null) {
                        LJJIIJ(str, enlargeScreenManageParams, interfaceC920110a3F);
                        return;
                    } else if (Intrinsics.LJFF(LJIILL(), str)) {
                        LJJIIJ(str, enlargeScreenManageParams, interfaceC920110a3F);
                        return;
                    } else {
                        this.LIZLLL.LIZ(str2, new AwS80S1300000_15(interfaceC920110a3F, this, enlargeScreenManageParams, str, 7));
                        return;
                    }
                }
            }
        }
        int size = this.LIZ.LJIIIIZZ().size();
        if (size > 1) {
            DataChannel dataChannel = this.LIZ.LIZ;
            if (dataChannel != null && (context = (Context) dataChannel.gg0(C956860b0W.class)) != null) {
                DialogC933230aOP dialogC933230aOPLIZ = C920230a3R.LIZ(context, false, (PosIdentity) ListProtector.get(this.LIZ.LJIIIIZZ(), 0), (PosIdentity) ListProtector.get(this.LIZ.LJIIIIZZ(), 1), new AwS55S1300000_15(interfaceC920110a3F, this, enlargeScreenManageParams, str, 6));
                dialogC933230aOPLIZ.setOnDismissListener(new DialogInterfaceOnDismissListenerC987030bnB(dialogC933230aOPLIZ, this, str, 5));
                C786410Ut5.N4(dialogC933230aOPLIZ);
                C915850ZwN.LJIIJ(str, false);
                return;
            }
            return;
        }
        if (size == 1 && z4) {
            enlargeScreenManageParams.replacedPos = C1697810uHb.LJIILJJIL(ListProtector.get(this.LIZ.LJIIIIZZ(), 0));
        }
        enlargeScreenManageParams.scene = 7;
        LJJIIJ(str, enlargeScreenManageParams, interfaceC920110a3F);
    }
}

package X;

import Y.AfS151S0200000_15;
import Y.AfS181S0100000_12;
import Y.AfS184S0100000_15;
import Y.AfS41S1200000_15;
import Y.AfS48S1100000_15;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.api.ILayoutServerApi;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageParams;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.PosIdentity;
import webcast.api.linkmic_multi_guest.LayoutUpdateParams;
import webcast.api.linkmic_multi_guest.SwitchSpotParams;

/* JADX INFO: renamed from: X.0a3M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC920180a3M implements InterfaceC920200a3O {
    public final C11NJ LIZ = new C11NJ();

    @Override // X.InterfaceC920200a3O
    public void LIZ(PosIdentity posIdentity, boolean z, boolean z2, InterfaceC920110a3F interfaceC920110a3F) {
    }

    @Override // X.InterfaceC920200a3O
    public void LIZLLL(C917100ZyO c917100ZyO) {
    }

    @Override // X.InterfaceC920200a3O
    public void LIZIZ() {
        this.LIZ.LJ();
    }

    public static void LJIIIZ(LayoutUpdateParams layoutUpdateParams) {
        long id;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        if (roomLJJLI != null) {
            id = roomLJJLI.getId();
        } else {
            id = 0;
        }
        layoutUpdateParams.roomId = id;
        layoutUpdateParams.channelId = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0a3C] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Boolean] */
    public static C920080a3C LJIIJ(final InterfaceC920110a3F interfaceC920110a3F, final EnlargeScreenManageParams enlargeScreenManageParams) {
        final int size;
        InterfaceC920220a3Q dataSource;
        List<C957020b0m> listLJIIIZ;
        InterfaceC920220a3Q dataSource2;
        List<C957020b0m> listLJIIIZ2;
        final C259800zU c259800zU = new C259800zU();
        InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
        if (interfaceC923120a86LIZ != null && (dataSource2 = interfaceC923120a86LIZ.getDataSource()) != null && (listLJIIIZ2 = dataSource2.LJIIIZ()) != null) {
            ArrayList arrayList = new ArrayList();
            for (C957020b0m c957020b0m : listLJIIIZ2) {
                MultiGuestSpotExtra multiGuestExtra = c957020b0m.getMultiGuestExtra();
                if (multiGuestExtra != null && multiGuestExtra.isEnlarged) {
                    arrayList.add(c957020b0m);
                }
            }
            size = arrayList.size();
        } else {
            size = 0;
        }
        InterfaceC923120a86 interfaceC923120a86LIZ2 = C940770aaZ.LIZ();
        if (interfaceC923120a86LIZ2 != null && (dataSource = interfaceC923120a86LIZ2.getDataSource()) != null && (listLJIIIZ = dataSource.LJIIIZ()) != null) {
            for (C957020b0m c957020b0m2 : listLJIIIZ) {
                MultiGuestSpotExtra multiGuestExtra2 = c957020b0m2.getMultiGuestExtra();
                if (multiGuestExtra2 != null && multiGuestExtra2.isEnlarged) {
                    if (c957020b0m2.LLJIJIL) {
                        c259800zU.element = Boolean.FALSE;
                    } else {
                        c259800zU.element = Boolean.TRUE;
                    }
                }
            }
        }
        return new InterfaceC920110a3F() { // from class: X.0a3C
            @Override // X.InterfaceC920110a3F
            public final void LIZJ(String str) {
                int i;
                int size2;
                InterfaceC920110a3F interfaceC920110a3F2 = interfaceC920110a3F;
                if (interfaceC920110a3F2 != null) {
                    interfaceC920110a3F2.LIZJ(str);
                }
                int i2 = size;
                EnlargeScreenManageParams enlargeScreenManageParams2 = enlargeScreenManageParams;
                int i3 = enlargeScreenManageParams2.scene;
                int i4 = 0;
                if (i3 == 7) {
                    i = 1;
                } else if (i3 == 8) {
                    i = -1;
                } else {
                    i = 0;
                }
                int i5 = i2 + i;
                List<PosIdentity> list = enlargeScreenManageParams2.replacedPos;
                if (list != null) {
                    size2 = list.size();
                } else {
                    size2 = 0;
                }
                if (i5 - size2 > 1) {
                    return;
                }
                if (Intrinsics.LJFF(str, C915980Zwa.LIZLLL().Q92())) {
                    int i6 = enlargeScreenManageParams.scene;
                    if (i6 != 7) {
                        if (i6 == 8) {
                            C919870a2r.LIZIZ(2, "cancel_enlarge");
                            return;
                        }
                        return;
                    }
                    C919870a2r.LIZIZ(Intrinsics.LJFF(c259800zU.element, Boolean.TRUE) ? 1 : 0, "enlarge");
                    return;
                }
                EnlargeScreenManageParams enlargeScreenManageParams3 = enlargeScreenManageParams;
                int i7 = enlargeScreenManageParams3.scene;
                if (i7 != 7) {
                    if (i7 != 8) {
                        return;
                    }
                    C919870a2r.LIZJ(3, String.valueOf(enlargeScreenManageParams3.guestUserId), "cancel_enlarge");
                } else {
                    Boolean bool = c259800zU.element;
                    if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                        i4 = 1;
                    } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
                        i4 = 2;
                    }
                    C919870a2r.LIZJ(i4, String.valueOf(enlargeScreenManageParams.guestUserId), "enlarge");
                }
            }

            @Override // X.InterfaceC920110a3F
            public final void LIZIZ(List<PosIdentity> list, Function1<? super PosIdentity, Unit> function1) {
                InterfaceC920110a3F interfaceC920110a3F2 = interfaceC920110a3F;
                if (interfaceC920110a3F2 != null) {
                    interfaceC920110a3F2.LIZIZ(list, function1);
                }
            }

            @Override // X.InterfaceC920110a3F
            public final void LIZ(int i, String str, String str2, Throwable th) {
                InterfaceC920110a3F interfaceC920110a3F2 = interfaceC920110a3F;
                if (interfaceC920110a3F2 != null) {
                    interfaceC920110a3F2.LIZ(i, str, str2, th);
                }
            }
        };
    }

    public static void LJIIJJI(Throwable th, Function1 function1) {
        if (th instanceof C501520Jle) {
            if (function1 != null) {
                C501520Jle c501520Jle = (C501520Jle) th;
                int errorCode = c501520Jle.getErrorCode();
                String message = c501520Jle.getMessage();
                if (message == null) {
                    message = "ApiException with null message";
                }
                function1.invoke(new LinkCoreError(errorCode, 0L, message));
            }
        } else if (function1 != null) {
            LinkCoreError.Companion companion = LinkCoreError.Companion;
            int i = companion.getCOMMON_UNKNOWN().errorCode;
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = companion.getCOMMON_UNKNOWN().errorMsg;
            }
            function1.invoke(new LinkCoreError(i, 0L, message2));
        }
        Context contextLIZ = C176600m4.LIZ();
        if (contextLIZ != null) {
            C501540Jlg.LIZJ(contextLIZ, th);
        }
    }

    public final void LJIILL(InterfaceC920110a3F interfaceC920110a3F, EnlargeScreenManageParams enlargeScreenManageParams) {
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZIZ(((ILayoutServerApi) C480460Ism.LIZLLL(ILayoutServerApi.class)).zoom(enlargeScreenManageParams).LJIILIIL(new C0UO0()), this.LIZ, new AfS184S0100000_15(interfaceC920110a3F, 130), new AfS151S0200000_15(this, interfaceC920110a3F, 35), null, null, 56);
    }

    public final void LJIILIIL(SwitchSpotParams switchSpotParams, AwS559S0100000_15 awS559S0100000_15, AwS594S0100000_15 awS594S0100000_15) {
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZIZ(((ILayoutServerApi) C480460Ism.LIZLLL(ILayoutServerApi.class)).switchSpot(switchSpotParams).LJIILIIL(new C0UO0()), this.LIZ, new AfS181S0100000_12(awS559S0100000_15, 178), new C515801zg(this, awS594S0100000_15, 28), null, null, 56);
    }

    public final void LJIILJJIL(String str, EnlargeScreenManageParams enlargeScreenManageParams, InterfaceC920110a3F interfaceC920110a3F) {
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZIZ(((ILayoutServerApi) C480460Ism.LIZLLL(ILayoutServerApi.class)).zoom(enlargeScreenManageParams).LJIILIIL(new C0UO0()), this.LIZ, new AfS48S1100000_15(interfaceC920110a3F, str, 1), new AfS41S1200000_15(this, interfaceC920110a3F, str, 4), null, null, 56);
    }

    public static void LJIIIIZZ(AbstractC920180a3M abstractC920180a3M, Throwable th, InterfaceC920110a3F interfaceC920110a3F, String str) {
        int iOrdinal = EnumC919060a1Y.E_C_DEFAULT.ordinal();
        abstractC920180a3M.getClass();
        String strLJIJI = C497740JfY.LJIJI(2131851936);
        if (interfaceC920110a3F != null) {
            interfaceC920110a3F.LIZ(iOrdinal, str, strLJIJI, th);
        }
    }

    public final void LJIIL(LayoutUpdateParams layoutUpdateParams, Function0<Unit> function0, Function1<? super LayoutState, Unit> function1, Function1<? super LinkCoreError, Unit> function12) {
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZIZ(((ILayoutServerApi) C480460Ism.LIZLLL(ILayoutServerApi.class)).switchLayout(layoutUpdateParams).LJIILIIL(new C0UO0()), this.LIZ, new C515801zg(function0, function1, 26), new C515801zg(this, function12, 27), null, null, 56);
    }
}

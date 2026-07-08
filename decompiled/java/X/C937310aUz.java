package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings.MultiGuestPanelLayoutStyleSupportFloatTypeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937310aUz {
    public static final C19488511Ml LIZ(C11PQ c11pq) {
        return c11pq.LJJII(new InterfaceC1627390sS1() { // from class: X.0aV0
            @Override // X.InterfaceC1627390sS1
            public final boolean test(Object obj, Object obj2) {
                return Intrinsics.LJFF(C13LP.LJJJLL((List) obj), C13LP.LJJJLL((List) obj2));
            }
        });
    }

    public static final EnumC934000aPe LIZIZ(DataChannel dataChannel) {
        List list = (List) dataChannel.gg0(MultiGuestLayoutRenderV2.RoleChannel.class);
        if (list != null) {
            return (EnumC934000aPe) C13LP.LJJJLL(list);
        }
        return null;
    }

    public static final boolean LIZJ(InterfaceC920220a3Q interfaceC920220a3Q) {
        MultiGuestPanelLayoutStyleSupportFloatTypeSetting multiGuestPanelLayoutStyleSupportFloatTypeSetting = MultiGuestPanelLayoutStyleSupportFloatTypeSetting.INSTANCE;
        if (multiGuestPanelLayoutStyleSupportFloatTypeSetting.getValue().length != 0) {
            if (C13LQ.LJIILJJIL(interfaceC920220a3Q.getPanelLayoutType(), multiGuestPanelLayoutStyleSupportFloatTypeSetting.getValue())) {
                return true;
            }
        }
        if (interfaceC920220a3Q.LJII() != 1) {
            return false;
        }
        return true;
    }

    public static final String LJIIIIZZ(C947470alN c947470alN) {
        return C13LP.LJJLIIIJ(c947470alN.LIZLLL, ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(253), 30);
    }

    public static final void LIZLLL(String str, String str2) {
        if ("".length() == 0) {
            C20441214yg.LIZIZ(str, str2);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('-');
        sbLIZ.append(str);
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), str2);
    }

    public static final void LJ(DataChannel dataChannel, String str) {
        if (LIZIZ(dataChannel) == EnumC934000aPe.AUDIENCE) {
            return;
        }
        LIZLLL("MultiGuestInfoCenter", str);
    }

    public static final void LJFF(String str, String str2) {
        if ("".length() == 0) {
            C20441214yg.LJ(str, str2);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('-');
        sbLIZ.append(str);
        C20441214yg.LJ(C2188811AlT.LIZIZ(sbLIZ), str2);
    }

    public static final void LJII(String str, String str2) {
        if ("".length() == 0) {
            C20441214yg.LJIIIZ(str, str2);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('-');
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ), str2);
    }

    public static final C19489111Mr LJI(C11IW c11iw, final String str, final String str2) {
        return c11iw.LJIIIIZZ(new C09JN() { // from class: X.0Uzg
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MaskUtilKt@eb4b.logError$1");
                String str3 = str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(" error=");
                sbLIZ.append(obj);
                C937310aUz.LJFF(str3, C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("MaskUtilKt@eb4b.logError$1");
            }
        });
    }
}

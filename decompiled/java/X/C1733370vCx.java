package X;

import com.ss.android.ugc.aweme.ecommerce.content.sea.datacontext.SeaContentStateContextModule;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.track.SeaLiveTrackParamsContextModule;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733370vCx {
    public static final /* synthetic */ int LIZ = 0;

    public static C1750060vds LIZ(String str, String str2, C1561410qjb c1561410qjb, ISeaLiveContextAbility iSeaLiveContextAbility, Map map) {
        InterfaceC600380Ngi interfaceC600380NgiCm0;
        InterfaceC599740Nfg interfaceC599740NfgSU1;
        InterfaceC599460NfE interfaceC599460NfEHW1;
        InterfaceC599740Nfg interfaceC599740NfgSU12;
        Pair[] pairArr = new Pair[3];
        C599380Nf6 c599380Nf6MF = null;
        if (iSeaLiveContextAbility != null) {
            interfaceC600380NgiCm0 = iSeaLiveContextAbility.Cm0();
        } else {
            interfaceC600380NgiCm0 = null;
        }
        pairArr[0] = new Pair(InterfaceC600380Ngi.class, new C1544630qIX(interfaceC600380NgiCm0));
        if (iSeaLiveContextAbility != null) {
            interfaceC599740NfgSU1 = iSeaLiveContextAbility.SU1();
        } else {
            interfaceC599740NfgSU1 = null;
        }
        pairArr[1] = new Pair(InterfaceC599740Nfg.class, new C1544630qIX(interfaceC599740NfgSU1));
        if (iSeaLiveContextAbility != null) {
            interfaceC599460NfEHW1 = iSeaLiveContextAbility.hW1();
        } else {
            interfaceC599460NfEHW1 = null;
        }
        pairArr[2] = new Pair(InterfaceC599460NfE.class, new C1544630qIX(interfaceC599460NfEHW1));
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        Pair[] pairArr2 = new Pair[2];
        Object[] objArr = new Object[2];
        if (iSeaLiveContextAbility != null) {
            interfaceC599740NfgSU12 = iSeaLiveContextAbility.SU1();
        } else {
            interfaceC599740NfgSU12 = null;
        }
        objArr[0] = interfaceC599740NfgSU12;
        if (iSeaLiveContextAbility != null) {
            c599380Nf6MF = iSeaLiveContextAbility.MF();
        }
        objArr[1] = c599380Nf6MF;
        pairArr2[0] = new Pair("seaContentStateContext", new C1311220kE4(SeaContentStateContextModule.class, C1697810uHb.LJIIJJI(objArr)));
        pairArr2[1] = new Pair("seaLiveTrackParamsContext", new C1311220kE4(SeaLiveTrackParamsContextModule.class, Collections.singletonList(iSeaLiveContextAbility)));
        return new C1750060vds(str, str2, c1561410qjb, map, mapLJIIIIZZ, C2097608Jq.LJIIJ(pairArr2));
    }
}

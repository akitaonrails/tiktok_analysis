package X;

import Y.AfS186S0100000_17;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x1S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803120x1S extends AbstractC1804870x4H {
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r12, java.lang.Throwable r13, java.util.HashMap r14) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1803120x1S.LIZJ(com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, java.lang.Throwable, java.util.HashMap):void");
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        EnumC1803160x1W enumC1803160x1W;
        final InterfaceC1803140x1U interfaceC1803140x1U = (InterfaceC1803140x1U) xBaseParamModel;
        final HashMap map = new HashMap();
        map.put("charge_source", "JSB_fetchProductDetails");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC1803290x1j rechargeService = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeService();
        if (Intrinsics.LJFF(interfaceC1803140x1U.getUseCache(), Boolean.TRUE)) {
            enumC1803160x1W = EnumC1803160x1W.USE;
        } else {
            enumC1803160x1W = EnumC1803160x1W.NON_USE;
        }
        final InterfaceC1804390x3V interfaceC1804390x3VInitializeRechargeApiStateTracking = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).initializeRechargeApiStateTracking();
        C1126800fQc.LIZ.py();
        final EnumC1803160x1W enumC1803160x1W2 = enumC1803160x1W;
        final EnumC1803160x1W enumC1803160x1W3 = enumC1803160x1W;
        rechargeService.LJ(2, 0L, 0L, null, enumC1803160x1W, C1134860fdc.LIZ.LIZ(), interfaceC1804390x3VInitializeRechargeApiStateTracking, false).LJIILIIL(new C0UO0()).LJJIJIL(new AfS186S0100000_17(interfaceC1804390x3VInitializeRechargeApiStateTracking, 77)).LJJIIZI(new AfS186S0100000_17(interfaceC1804390x3VInitializeRechargeApiStateTracking, 78)).LJJLL(new C09JN() { // from class: X.0x4B
            /* JADX WARN: Removed duplicated region for block: B:121:0x02f7  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x0302  */
            /* JADX WARN: Removed duplicated region for block: B:127:0x030d  */
            /* JADX WARN: Removed duplicated region for block: B:130:0x0318  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x0323  */
            /* JADX WARN: Removed duplicated region for block: B:136:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:139:0x0339  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x0344  */
            /* JADX WARN: Removed duplicated region for block: B:144:0x037d  */
            /* JADX WARN: Removed duplicated region for block: B:145:0x037f  */
            /* JADX WARN: Removed duplicated region for block: B:146:0x0381  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x0383  */
            /* JADX WARN: Removed duplicated region for block: B:148:0x0385  */
            /* JADX WARN: Removed duplicated region for block: B:149:0x0387  */
            /* JADX WARN: Removed duplicated region for block: B:150:0x0389  */
            /* JADX WARN: Removed duplicated region for block: B:151:0x038c  */
            /* JADX WARN: Removed duplicated region for block: B:152:0x038f  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0164  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0170  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x01af  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r21) {
                /*
                    Method dump skipped, instruction units count: 930
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1804810x4B.accept(java.lang.Object):void");
            }
        }, new C09JN() { // from class: X.0x1V
            @Override // X.C09JN
            public final void accept(Object obj) {
                Map<String, Long> mapLJIIIIZZ;
                C1C7U.LIZ("FetchProductDetailsMethod@6f21.handle$disposable$4");
                Throwable th = (Throwable) obj;
                map.put("cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                map.put("cache_policy", enumC1803160x1W3.toString());
                InterfaceC1804390x3V interfaceC1804390x3V = interfaceC1804390x3VInitializeRechargeApiStateTracking;
                if (interfaceC1804390x3V != null && (mapLJIIIIZZ = interfaceC1804390x3V.LJIIIIZZ()) != null) {
                    map.putAll(mapLJIIIIZZ);
                }
                C1803120x1S c1803120x1S = this;
                CompletionBlock<InterfaceC1804880x4I> completionBlock2 = completionBlock;
                HashMap<String, Object> map2 = map;
                c1803120x1S.getClass();
                C1803120x1S.LIZJ(completionBlock2, th, map2);
                C1C7U.LIZIZ("FetchProductDetailsMethod@6f21.handle$disposable$4");
            }
        });
    }
}

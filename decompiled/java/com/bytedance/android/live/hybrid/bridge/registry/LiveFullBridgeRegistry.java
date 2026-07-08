package com.bytedance.android.live.hybrid.bridge.registry;

import X.AbstractC1549150qPp;
import X.C1530080pv4;
import X.InterfaceC2268841DrG;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveFullBridgeRegistry implements InterfaceC2268841DrG {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:744:0x0815 A[RETURN] */
    @Override // X.InterfaceC2268841DrG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Class<? extends X.AbstractC1549150qPp<?, ?>> getIDLMethodClassByName(java.lang.String r3) {
        /*
            Method dump skipped, instruction units count: 2864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.hybrid.bridge.registry.LiveFullBridgeRegistry.getIDLMethodClassByName(java.lang.String):java.lang.Class");
    }

    @Override // X.InterfaceC2268841DrG
    public Class<? extends AbstractC1549150qPp<?, ?>> getLocalTestIDLMethodClassByName(String str) {
        if (!Intrinsics.LJFF(str, "updateGlobalProps")) {
            return null;
        }
        return C1530080pv4.class;
    }
}

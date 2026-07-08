package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aMZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932090aMZ {
    public final DataChannel LIZ;
    public final Function0<Boolean> LIZIZ;

    public C932090aMZ(DataChannel dataChannel, Function0<Boolean> function0) {
        this.LIZ = dataChannel;
        this.LIZIZ = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.view.View r9, kotlin.jvm.functions.Function0 r10, boolean r11) {
        /*
            r8 = this;
            X.14i1<java.lang.Integer> r0 = X.InterfaceC772190UQv.c3
            java.lang.Object r0 = r0.LIZ()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L2a
            int r0 = r0.intValue()
            r2 = 1
            if (r0 != r2) goto L2a
        L11:
            r1 = 2131840800(0x7f114f20, float:1.931489E38)
            r0 = 2131840816(0x7f114f30, float:1.9314922E38)
            r5 = r9
            X.C971370bNv.LIZIZ(r5, r1, r0, r2)
            kotlin.jvm.internal.AwS36S0310000_15 r2 = new kotlin.jvm.internal.AwS36S0310000_15
            r7 = 1
            r4 = r11
            r6 = r10
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 500(0x1f4, double:2.47E-321)
            X.C500260Jjc.LJLIIIL(r0, r5, r2)
            return
        L2a:
            r2 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C932090aMZ.LIZIZ(android.view.View, kotlin.jvm.functions.Function0, boolean):void");
    }

    public static void LIZ(C932090aMZ c932090aMZ, View view, MultiGuestDataHolder multiGuestDataHolder, boolean z, Function0 function0, Function0 function02, AwS559S0100000_15 awS559S0100000_15, int i) {
        Function0 function03 = function02;
        Function0 function04 = function0;
        AwS559S0100000_15 awS559S0100000_152 = null;
        if ((i & 4) != 0) {
            function04 = null;
        }
        if ((i & 8) != 0) {
            function03 = null;
        }
        if ((i & 16) == 0) {
            awS559S0100000_152 = awS559S0100000_15;
        }
        C971370bNv.LIZIZ(view, 2131840825, 2131840824, c932090aMZ.LIZIZ.invoke().booleanValue());
        C500260Jjc.LJLIIIL(500L, view, new C932060aMW(c932090aMZ, multiGuestDataHolder, z, function04, function03, awS559S0100000_152, view));
    }
}

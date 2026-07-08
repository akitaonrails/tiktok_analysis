package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MWW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.creative.common.api.navigation.MainEditBridge$navigateToMainEditPage$1$1", f = "MainEditBridge.kt", l = {}, m = "invokeSuspend")
public final class C0MWW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1390130mHL LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ Intent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MWW(C1390130mHL c1390130mHL, C19EG c19eg, Intent intent, InterfaceC1364105Vn<? super C0MWW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1390130mHL;
        this.LLILLJJLI = c19eg;
        this.LLILLL = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MWW(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_im_creative_common_api_navigation_MainEditBridge$navigateToMainEditPage$1$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "MainEditBridge@817c.navigateToMainEditPage$1$1"
            X.C1C7U.LIZ(r7)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r9)
            X.0mHL r0 = r8.LL
            X.C436180H8m.LIZIZ(r0)
            X.01GW r0 = X.C0AHI.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r6 = 0
            if (r0 == 0) goto L80
            boolean r0 = X.C296250BjL.LIZIZ()
            if (r0 == 0) goto L80
            X.19EG r1 = r8.LLILLJJLI
            android.content.Intent r0 = r8.LLILLL
            android.os.Bundle r2 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_im_creative_common_api_navigation_MainEditBridge$navigateToMainEditPage$1$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(r0)
            boolean r0 = r1 instanceof X.InterfaceC1711206n0
            if (r0 == 0) goto L80
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L80
            X.15ms r1 = (X.InterfaceC20622815ms) r1
            if (r1 == 0) goto L80
            X.198H r5 = r1.getRootSAFSceneWrapper()
            if (r5 == 0) goto L80
            com.bytedance.scene.navigation.NavigationScene r4 = r1.getNavigationScene()
            if (r4 == 0) goto L80
            if (r2 != 0) goto L4c
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L4c:
            java.lang.String r1 = "extra_request_code"
            r0 = 1002(0x3ea, float:1.404E-42)
            int r3 = r2.getInt(r1, r0)
            java.lang.String r1 = "creative_saa_page"
            java.lang.String r0 = "VideoEditContainerScene"
            X.C786410Ut5.LJJJI(r1, r0, r2)
            X.C1411560mpu.LIZIZ = r6
            java.lang.Class<com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene> r0 = com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene.class
            com.bytedance.scene.Scene r2 = X.C2350509Ix.LIZ(r2, r0)
            com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene r2 = (com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene) r2
            X.194i r1 = new X.194i
            r1.<init>()
            X.0MWX r0 = new X.0MWX
            r0.<init>()
            r1.LIZ(r0)
            X.0MWH r0 = X.C0MWH.LIZ
            r0.getClass()
            X.C0MWH.LJIJ(r4, r5, r2, r3, r1)
        L7a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L80:
            X.0MTo r2 = X.C1660680tJi.LIZ()
            X.19EG r1 = r8.LLILLJJLI
            android.content.Intent r0 = r8.LLILLL
            r2.LJIIL(r1, r0)
            X.19EG r0 = r8.LLILLJJLI
            X.C786410Ut5.ce(r0, r6, r6)
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MWW.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

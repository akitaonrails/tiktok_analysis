package X;

import android.app.Activity;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ul8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781480Ul8 extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function1<Integer, Unit> LLILZ;
    public final /* synthetic */ DataChannel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C781480Ul8(String str, Activity activity, Function0<Unit> function0, Function1<? super Integer, Unit> function1, DataChannel dataChannel) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = activity;
        this.LLILLL = function0;
        this.LLILZ = function1;
        this.LLILZIL = dataChannel;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(java.lang.Integer r9) {
        /*
            r8 = this;
            java.lang.Number r9 = (java.lang.Number) r9
            int r4 = r9.intValue()
            boolean r0 = com.bytedance.android.livesdk.livesetting.linkmic.LinkMicVEPluginAdapt.enable()
            r3 = 0
            if (r0 == 0) goto L36
            java.lang.String r2 = r8.LL
            if (r2 == 0) goto L33
            int r0 = r2.length()
            if (r0 <= 0) goto L33
        L17:
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostCreativeTool> r0 = com.bytedance.android.livesdkapi.host.IHostCreativeTool.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostCreativeTool r1 = (com.bytedance.android.livesdkapi.host.IHostCreativeTool) r1
            if (r1 == 0) goto L36
            android.app.Activity r0 = r8.LLILLJJLI
            boolean r0 = r1.a72(r0, r2)
            if (r0 != 0) goto L36
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r8.LLILLL
            if (r0 == 0) goto L30
            r0.invoke()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            java.lang.String r2 = "linkmic_interact"
            goto L17
        L36:
            boolean r0 = com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLyraxPluginAdapt.enable()
            if (r0 == 0) goto L56
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostCreativeTool> r0 = com.bytedance.android.livesdkapi.host.IHostCreativeTool.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostCreativeTool r1 = (com.bytedance.android.livesdkapi.host.IHostCreativeTool) r1
            if (r1 == 0) goto L56
            android.app.Activity r0 = r8.LLILLJJLI
            boolean r0 = r1.cd(r0)
            if (r0 != 0) goto L56
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r8.LLILLL
            if (r0 == 0) goto L30
            r0.invoke()
            goto L30
        L56:
            com.bytedance.android.livesdk.livesetting.broadcast.DeleteBluetoothPermissionRequestGuestSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.DeleteBluetoothPermissionRequestGuestSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L75
            boolean r0 = X.C925080aBG.LIZ
            android.app.Activity r3 = r8.LLILLJJLI
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r5 = r8.LLILZ
            kotlin.jvm.functions.Function0<kotlin.Unit> r6 = r8.LLILLL
            java.lang.String r7 = r8.LL
            X.0UV0 r1 = X.C0UV0.LiveResource
            X.0UV5 r2 = new X.0UV5
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.String r0 = "interact"
            r1.checkInstall(r3, r0, r2)
            goto L30
        L75:
            boolean r0 = X.C925080aBG.LIZ
            r0 = 269(0x10d, float:3.77E-43)
            java.lang.String r2 = X.C925080aBG.LJII(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "checkDevicePermission success, frorm:"
            r1.append(r0)
            java.lang.String r0 = r8.LL
            r1.append(r0)
            java.lang.String r0 = ", multiLiveType: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = 12
            X.C1AZW.LJIIJ(r0, r2, r1, r3, r3)
            android.app.Activity r3 = r8.LLILLJJLI
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r8.LLILZIL
            X.0UV6 r2 = new X.0UV6
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r5 = r8.LLILZ
            kotlin.jvm.functions.Function0<kotlin.Unit> r6 = r8.LLILLL
            java.lang.String r7 = r8.LL
            r2.<init>(r3, r4, r5, r6, r7)
            X.C19671211xm.LIZ(r3, r0, r2)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C781480Ul8.invoke(java.lang.Object):java.lang.Object");
    }
}

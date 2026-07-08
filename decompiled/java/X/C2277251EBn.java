package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkUseRealFirstFrameRenderCallback;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRustRTCMsgDispatchSetting;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1EBn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2277251EBn implements InterfaceC1274710jHB {
    public final InterfaceC2277241EBm LIZ;
    public final boolean LIZIZ = MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getSyncNetworkState();
    public final boolean LIZJ = LivesdkUseRealFirstFrameRenderCallback.getValue();
    public final boolean LIZLLL = LinkMicRustRTCMsgDispatchSetting.INSTANCE.enable();

    @Override // X.InterfaceC1274710jHB
    public final /* synthetic */ void LIZJ(InterfaceC1276380jJs interfaceC1276380jJs, LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent) {
    }

    public C2277251EBn(C1279770jPL c1279770jPL) {
        this.LIZ = c1279770jPL;
    }

    public static void LIZLLL(InterfaceC2277241EBm interfaceC2277241EBm, Function1 function1) {
        C965900bF6.LIZ(new C2277201EBi(interfaceC2277241EBm, function1));
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0279  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1274710jHB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.InterfaceC1276380jJs r16, int r17, long r18, long r20, java.lang.Object... r22) {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2277251EBn.LIZ(X.0jJs, int, long, long, java.lang.Object[]):void");
    }

    @Override // X.InterfaceC1274710jHB
    public final void LIZIZ(InterfaceC1276380jJs interfaceC1276380jJs, int i, long j, long j2, Exception exc) {
        C965900bF6.LIZ(new C2277171EBf(i, this, j, j2, exc));
        C176600m4.LIZJ(new C2277181EBg(i, this, j, j2));
    }
}

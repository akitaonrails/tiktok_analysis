package X;

import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0g02, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1148760g02 extends AbstractC1097350ef7 {
    public final Map<String, String> LIZ;
    public final Map<String, String> LIZIZ;
    public final Map<String, Object> LIZJ;
    public final boolean LIZLLL;
    public final Map<String, Boolean> LJ;
    public final String LJFF;
    public List<SMBOptInStep> LJI;
    public Function2<? super SMBOptInStep, ? super String, String> LJII;
    public Function2<? super SMBOptInStep, ? super String, String> LJIIIIZZ;
    public Function2<? super SMBOptInStep, ? super String, String> LJIIIZ;

    @Override // X.InterfaceC1097470efJ
    public final boolean LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1097470efJ
    public final Map<String, String> LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1097470efJ
    public final Map<String, Boolean> LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC1097470efJ
    public final Map<String, Object> LJII() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1097470efJ
    public final Map<String, String> getLogParam() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1097470efJ
    public final String getSceneKey() {
        return this.LJFF;
    }

    public C1148760g02(int i) {
        Map<String, String> mapLJ = C2097608Jq.LJ();
        Map<String, String> mapLJ2 = C2097608Jq.LJ();
        Map<String, Object> mapLJ3 = C2097608Jq.LJ();
        Map<String, Boolean> mapLJ4 = C2097608Jq.LJ();
        this.LIZ = mapLJ;
        this.LIZIZ = mapLJ2;
        this.LIZJ = mapLJ3;
        this.LIZLLL = true;
        this.LJ = mapLJ4;
        this.LJFF = "live_pcs_service_plus_onboarding";
        this.LJI = C13BV.INSTANCE;
        this.LJII = new C1148780g04();
        this.LJIIIIZZ = new C1148790g05();
        this.LJIIIZ = new C1148770g03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r4 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r4.length() != 0) goto L28;
     */
    @Override // X.AbstractC1097350ef7, X.InterfaceC1097470efJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadStrategyConfig r8) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1148760g02.LIZIZ(com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadStrategyConfig):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
    @Override // X.AbstractC1097350ef7, X.InterfaceC1097470efJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadStrategyConfig r5) {
        /*
            r4 = this;
            java.lang.String r2 = r5.preCheckKey
            if (r2 == 0) goto Lb8
            int r1 = r2.hashCode()
            r0 = -1095779790(0xffffffffbeafba32, float:-0.34321743)
            r3 = 1
            if (r1 == r0) goto L8c
            r0 = -260005885(0xfffffffff080a003, float:-3.184602E29)
            if (r1 == r0) goto L61
            r0 = 949551612(0x389901fc, float:7.295978E-5)
            if (r1 != r0) goto Lb8
            java.lang.String r0 = "preload_onboarding_welcome_message"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb8
            java.util.List<com.bytedance.android.livesdk.chatroom.api.SMBOptInStep> r1 = r4.LJI
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L4b
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L4b
        L2c:
            r3 = 0
        L2d:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "PcsOnboardingStepsPreloadScene.preCheckByScene preCheckKey="
            r1.append(r0)
            java.lang.String r0 = r5.preCheckKey
            r1.append(r0)
            java.lang.String r0 = " result="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1121890fIh.LIZ(r0)
            return r3
        L4b:
            java.util.Iterator r2 = r1.iterator()
        L4f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r2.next()
            com.bytedance.android.livesdk.chatroom.api.SMBOptInStep r0 = (com.bytedance.android.livesdk.chatroom.api.SMBOptInStep) r0
            int r1 = r0.type
            r0 = 3
            if (r1 != r0) goto L4f
            goto L2d
        L61:
            java.lang.String r0 = "preload_onboarding_suggested_questions"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb8
            java.util.List<com.bytedance.android.livesdk.chatroom.api.SMBOptInStep> r1 = r4.LJI
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L76
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L76
            goto L2c
        L76:
            java.util.Iterator r2 = r1.iterator()
        L7a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r2.next()
            com.bytedance.android.livesdk.chatroom.api.SMBOptInStep r0 = (com.bytedance.android.livesdk.chatroom.api.SMBOptInStep) r0
            int r1 = r0.type
            r0 = 2
            if (r1 != r0) goto L7a
            goto L2d
        L8c:
            java.lang.String r0 = "preload_onboarding_form"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb8
            java.util.List<com.bytedance.android.livesdk.chatroom.api.SMBOptInStep> r1 = r4.LJI
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto La1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto La1
            goto L2c
        La1:
            java.util.Iterator r2 = r1.iterator()
        La5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r2.next()
            com.bytedance.android.livesdk.chatroom.api.SMBOptInStep r0 = (com.bytedance.android.livesdk.chatroom.api.SMBOptInStep) r0
            int r1 = r0.type
            r0 = 4
            if (r1 != r0) goto La5
            goto L2d
        Lb8:
            boolean r3 = super.LJFF(r5)
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1148760g02.LJFF(com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadStrategyConfig):boolean");
    }
}

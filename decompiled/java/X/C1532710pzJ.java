package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pzJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532710pzJ extends C1532740pzM implements InterfaceC1541060qCm {
    public final boolean LJJ;
    public final boolean LJJI;
    public final C1532950pzh LJJIFFI;
    public int LJJII;
    public final C1532720pzK LJJIII;
    public final C1529350ptt LJJIIJ;
    public final String LJJIIJZLJL;
    public List<String> LJJIIZ;
    public C1541080qCo<C1532310pyf> LJJIIZI;
    public C1531940py4 LJJIJ;
    public final C1532480pyw LJJIJIIJI;
    public final C1532470pyv LJJIJIIJIL;
    public List<String> LJJIJIL;
    public boolean LJJIJL;

    @Override // X.InterfaceC1541060qCm
    public final int hashCode() {
        return this.LJJIIJZLJL.hashCode();
    }

    @Override // X.InterfaceC1541060qCm
    public final String toString() {
        return this.LJJIIJZLJL;
    }

    @Override // X.InterfaceC1541060qCm
    public final C1535940q4W LIZ(InterfaceC1541060qCm interfaceC1541060qCm, C1535940q4W c1535940q4W) {
        if (!(interfaceC1541060qCm instanceof C1532710pzJ)) {
            return null;
        }
        if (interfaceC1541060qCm == this) {
            return c1535940q4W;
        }
        C1532710pzJ c1532710pzJ = (C1532710pzJ) interfaceC1541060qCm;
        if ((!c1532710pzJ.LJIIIIZZ && !c1532710pzJ.LJIIIZ) || (!this.LJIIIIZZ && !this.LJIIIZ)) {
            return null;
        }
        C1529350ptt c1529350ptt = this.LJJIIJ;
        if ((c1529350ptt == null || !Intrinsics.LJFF(c1529350ptt, c1532710pzJ.LJJIIJ)) && !Intrinsics.LJFF(this.LJJIII, c1532710pzJ.LJJIII)) {
            return null;
        }
        if ((c1532710pzJ.LJIILL ^ this.LJIILL) || !Intrinsics.LJFF(c1532710pzJ.LJJIII.LIZIZ, this.LJJIII.LIZIZ)) {
            c1535940q4W.LIZIZ = true;
            return c1535940q4W;
        }
        return c1535940q4W;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0196 A[PHI: r7
      0x0196: PHI (r7v7 X.0ptt) = (r7v6 X.0ptt), (r7v6 X.0ptt), (r7v19 X.0ptt) binds: [B:220:0x03b3, B:90:0x0153, B:106:0x018f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021b A[PHI: r7
      0x021b: PHI (r7v9 X.0ptt) = (r7v8 X.0ptt), (r7v8 X.0ptt), (r7v14 X.0ptt), (r7v15 X.0ptt), (r7v8 X.0ptt) binds: [B:127:0x01e6, B:129:0x01ea, B:139:0x0219, B:137:0x0208, B:133:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03aa A[PHI: r7
      0x03aa: PHI (r7v11 X.0ptt) = (r7v9 X.0ptt), (r7v14 X.0ptt) binds: [B:141:0x021f, B:139:0x0219] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04c6 A[PHI: r15 r16
      0x04c6: PHI (r15v4 java.util.List<com.bytedance.geckox.settings.model.GlobalConfigSettings$PipelineStep>) = 
      (r15v2 java.util.List<com.bytedance.geckox.settings.model.GlobalConfigSettings$PipelineStep>)
      (r15v3 java.util.List<com.bytedance.geckox.settings.model.GlobalConfigSettings$PipelineStep>)
      (r15v5 java.util.List<com.bytedance.geckox.settings.model.GlobalConfigSettings$PipelineStep>)
     binds: [B:281:0x04c4, B:279:0x04be, B:276:0x04b6] A[DONT_GENERATE, DONT_INLINE]
      0x04c6: PHI (r16v3 com.bytedance.geckox.settings.model.GlobalConfigSettings$CurrentLevelConfig) = 
      (r16v1 com.bytedance.geckox.settings.model.GlobalConfigSettings$CurrentLevelConfig)
      (r16v1 com.bytedance.geckox.settings.model.GlobalConfigSettings$CurrentLevelConfig)
      (r16v4 com.bytedance.geckox.settings.model.GlobalConfigSettings$CurrentLevelConfig)
     binds: [B:281:0x04c4, B:279:0x04be, B:276:0x04b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0595 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0143 A[PHI: r7
      0x0143: PHI (r7v22 X.0ptt) = (r7v5 X.0ptt), (r7v5 X.0ptt), (r7v5 X.0ptt), (r7v27 X.0ptt) binds: [B:348:0x05b9, B:350:0x05bd, B:352:0x05c5, B:86:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.00Yq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1532710pzJ(java.lang.String r21, boolean r22, boolean r23, X.C1532950pzh r24, com.tiktok.forestx.RequestParamsX r25) {
        /*
            Method dump skipped, instruction units count: 1575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1532710pzJ.<init>(java.lang.String, boolean, boolean, X.0pzh, com.tiktok.forestx.RequestParamsX):void");
    }
}

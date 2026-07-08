package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: X.126I, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C126I {
    public static final C126I LIZ = new C126I();
    public static final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public static final C13OY LIZJ;
    public static final Map<String, Effect> LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static StoryStreakEnterEditParam LJII;
    public static C126V LJIIIIZZ;
    public static int LJIIIZ;
    public static String LJIIJ;
    public static String LJIIJJI;
    public static boolean LJIIL;
    public static String LJIILIIL;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    static {
        /*
            X.126I r0 = new X.126I
            r0.<init>()
            X.C126I.LIZ = r0
            X.1DFB r1 = X.C0PEM.LIZJ
            X.094b r0 = X.C2296908zH.LIZ()
            kotlin.coroutines.CoroutineContext r0 = r1.plus(r0)
            X.054G r0 = X.C2296808zG.LIZ(r0)
            X.C126I.LIZIZ = r0
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IInternalAVService> r0 = com.ss.android.ugc.aweme.services.IInternalAVService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.services.IFoundationAVService r0 = (com.ss.android.ugc.aweme.services.IFoundationAVService) r0
            com.ss.android.ugc.aweme.services.effect.IEffectService r2 = r0.effectService()
            if (r2 == 0) goto L58
            android.app.Application r1 = X.C0CHQ.LIZ
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            r0.getRegionService()
            java.lang.String r0 = X.C20186013yc.LIZ()
            X.0sex r0 = r2.createEffectPlatform(r1, r0)
            if (r0 == 0) goto L58
            com.ss.android.ugc.effectmanager.EffectManager r0 = r0.LLJILJILJ()
            if (r0 == 0) goto L58
            X.13OY r0 = r0.getEffectPlatform()
        L46:
            X.C126I.LIZJ = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            X.C126I.LIZLLL = r0
            java.lang.String r0 = ""
            X.C126I.LJIIJ = r0
            X.C126I.LJIIJJI = r0
            X.C126I.LJIILIIL = r0
            return
        L58:
            r0 = 0
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126I.<clinit>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126I.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super java.lang.String> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C126L
            if (r0 == 0) goto L24
            r3 = r13
            X.126L r3 = (X.C126L) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r1 = r3.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r11 = 0
            r7 = 0
            java.lang.String r5 = ""
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            goto L7a
        L24:
            X.126L r3 = new X.126L
            r3.<init>(r12, r13)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = X.C103200aE.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r2) goto L47
            r0 = 1
        L44:
            if (r0 != 0) goto L49
            return r5
        L47:
            r0 = 0
            goto L44
        L49:
            java.lang.Class<com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService> r6 = com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService.class
            r10 = 14
            r8 = r7
            r9 = r7
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L98
            com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService r0 = (com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService) r0     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L5c
            java.lang.String r1 = r0.LJ()     // Catch: java.lang.Throwable -> L98
            goto L5d
        L5c:
            r1 = r11
        L5d:
            if (r1 == 0) goto L66
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L66
            goto L68
        L66:
            r0 = 1
            goto L69
        L68:
            r0 = 0
        L69:
            if (r0 == 0) goto L6c
            return r5
        L6c:
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L98
            r3.LL = r1     // Catch: java.lang.Throwable -> L98
            r3.LLILZ = r2     // Catch: java.lang.Throwable -> L98
            java.lang.Object r1 = LIZ(r1, r3)     // Catch: java.lang.Throwable -> L98
            if (r1 != r4) goto L7d
            return r4
        L7a:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L98
        L7d:
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r1     // Catch: java.lang.Throwable -> L98
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L98
            if (r1 == 0) goto L93
            java.lang.String r1 = r1.getUnzipPath()     // Catch: java.lang.Throwable -> L98
            if (r1 == 0) goto L93
            boolean r0 = X.C2286708xd.LIZJ(r1)     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L91
            r11 = r1
        L91:
            if (r11 != 0) goto L94
        L93:
            r11 = r5
        L94:
            X.C189200o6.m2constructorimpl(r11)     // Catch: java.lang.Throwable -> L98
            goto La4
        L98:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r11 = new X.00Yq
            r11.<init>(r0)
            X.C189200o6.m2constructorimpl(r11)
        La4:
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r11)
            if (r3 == 0) goto Lb5
            java.util.Map r2 = X.C2097608Jq.LJ()
            java.lang.String r1 = "story_x_streaks"
            java.lang.String r0 = "save special language font error"
            com.bytedance.crash.Npth.reportBizException(r1, r3, r0, r2, r7)
        Lb5:
            boolean r0 = X.C189200o6.m7isFailureimpl(r11)
            if (r0 != 0) goto Lbc
            return r11
        Lbc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126I.LIZJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0134 A[Catch: all -> 0x0206, TryCatch #2 {all -> 0x0206, blocks: (B:65:0x0123, B:66:0x0126, B:72:0x0134, B:74:0x0141, B:77:0x0148, B:78:0x014a, B:84:0x015a, B:90:0x0166, B:99:0x0183, B:100:0x01b7, B:106:0x01c3, B:107:0x01f2, B:98:0x0179, B:108:0x01f4), top: B:124:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015a A[Catch: all -> 0x0206, TryCatch #2 {all -> 0x0206, blocks: (B:65:0x0123, B:66:0x0126, B:72:0x0134, B:74:0x0141, B:77:0x0148, B:78:0x014a, B:84:0x015a, B:90:0x0166, B:99:0x0183, B:100:0x01b7, B:106:0x01c3, B:107:0x01f2, B:98:0x0179, B:108:0x01f4), top: B:124:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0176  */
    /* JADX WARN: Type inference failed for: r10v3, types: [T] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v5, types: [T] */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126I.LIZLLL(X.05Vn):java.lang.Object");
    }

    public static Object LIZ(String str, AbstractC23140094w abstractC23140094w) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(abstractC23140094w));
        C13OY c13oy = LIZJ;
        if (c13oy != null) {
            C13NY c13ny = new C13NY() { // from class: X.0mwb
                @Override // X.C13NY
                public final void onProgress(Effect effect, int i, long j) {
                }

                @Override // X.C13NY
                public final void onStart(Effect effect) {
                }

                @Override // X.C13MA
                public final void onSuccess(Effect effect) {
                    InterfaceC1364105Vn<Effect> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(effect);
                    interfaceC1364105Vn.resumeWith(effect);
                }

                @Override // X.C13MA
                public final /* bridge */ /* synthetic */ void preProcess(Effect effect) {
                }

                @Override // X.C13MA
                public final void onFail(Effect effect, C1662010tLr c1662010tLr) {
                    InterfaceC1364105Vn<Effect> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn.resumeWith(null);
                }
            };
            boolean zLJI = MethodIDManager.LJI(137867);
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            c13oy.LJIIIZ(arrayList, true, null, new C13M0(c13ny), false);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLIZ;
    }
}

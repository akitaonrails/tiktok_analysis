package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Z2O, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z2O {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final C879090YeB LIZ;
    public final C876800YaU LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public boolean LJFF;
    public volatile boolean LJI;
    public final PrivacySettingsFeature LJIIIIZZ;
    public final List<InterfaceC876420YZs> LJ = Collections.synchronizedList(new ArrayList());
    public final C1DEV LJII = C2191201ApK.LIZ();

    public static ILightInteractionPlatformService LIZ() {
        return (ILightInteractionPlatformService) ServiceManager.get().getService(ILightInteractionPlatformService.class);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C0Z2O(C879090YeB c879090YeB, C876800YaU c876800YaU) {
        this.LIZ = c879090YeB;
        this.LIZIZ = c876800YaU;
        C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
        if (c1908480zlO.LJIJ(21) == null) {
            C0Z9P c0z9p = C0Z9P.LL;
            c0z9p.getClass();
            c1908480zlO.LJ(c0z9p);
            c1908480zlO.LJIILL(c0z9p, C0Z9P.LLILZLL);
        }
        C0Z9H c0z9h = C0Z9H.LL;
        c0z9h.getClass();
        if (c1908480zlO.LJIJ(1009) == null) {
            c1908480zlO.LJ(c0z9h);
            c1908480zlO.LJIILL(c0z9h, C0Z9H.LLILZ);
        }
        this.LJIIIIZZ = C1336205Ku.LIZ(false).getImPrivacySettings();
    }

    public final void LIZIZ(C879180YeK c879180YeK, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[invokeIMNotificationShowListeners], failToShow = ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        List<InterfaceC876420YZs> list = this.LJ;
        List<InterfaceC876420YZs> listSubList = list.subList(0, list.size());
        if (!listSubList.isEmpty()) {
            Iterator<InterfaceC876420YZs> it2 = listSubList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(c879180YeK, z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (X.C876900Yae.LJFF(null) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("showNotification, delayTime = ");
        r1.append(r11);
        X.C2188811AlT.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r11 <= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        X.C23250099c.LIZLLL(X.C2296808zG.LIZ(X.C0PEM.LIZ), null, null, new X.C315140CWy(r11, r10, r13, null), 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r10.LIZJ == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r13 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r0 = X.C740740T3w.LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r0.isAd() != true) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        r10.LIZJ = true;
        LJFF(1000, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        r1 = X.C1908480zlO.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r1.LJIIJJI() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r1.LJIIIZ(true) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        r0 = X.C1906580ziK.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        r0 = r0.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        r0 = r0.getResources();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
    
        r0 = r0.getConfiguration();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
    
        if (r0.orientation != 2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
    
        if (X.C1585030rLh.LJIJI("NOTIFICATION") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (X.C1618630sDt.LIZIZ.isShowing() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ae, code lost:
    
        r10.LIZJ = false;
        r10.LJFF = true;
        X.C23250099c.LIZLLL(X.C2296808zG.LIZ(X.C0PEM.LIZ), null, null, new X.C327490Csd(r10, null), 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r10.LIZ.LJIIL() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(long r11, boolean r13) {
        /*
            r10 = this;
            X.01GW r0 = X.C311050CHf.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r9 = 0
            r4 = 0
            r3 = 1
            r7 = r10
            if (r0 == 0) goto L1d
            X.0YeB r0 = r7.LIZ
            boolean r0 = r0.LJIIL()
            if (r0 == 0) goto L2e
        L1a:
            r7.LIZJ = r4
            return
        L1d:
            X.0YeB r0 = r7.LIZ
            boolean r0 = r0.LJIIL()
            if (r0 != 0) goto L1a
            X.0Yae r0 = X.C876900Yae.LIZ
            boolean r0 = X.C876900Yae.LJFF(r9)
            if (r0 != 0) goto L2e
            goto L1a
        L2e:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "showNotification, delayTime = "
            r1.append(r0)
            r5 = r11
            r1.append(r5)
            X.C2188811AlT.LIZIZ(r1)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r2 = 3
            r8 = r13
            if (r0 <= 0) goto L55
            X.1DFH r0 = X.C0PEM.LIZ
            X.054G r0 = X.C2296808zG.LIZ(r0)
            X.0CWy r4 = new X.0CWy
            r4.<init>(r5, r7, r8, r9)
            X.C23250099c.LIZLLL(r0, r9, r9, r4, r2)
            return
        L55:
            boolean r0 = r7.LIZJ
            if (r0 == 0) goto L5c
            if (r8 != 0) goto L5c
            return
        L5c:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C740740T3w.LJ()
            if (r0 == 0) goto L70
            boolean r0 = r0.isAd()
            if (r0 != r3) goto L70
        L68:
            r7.LIZJ = r3
            r0 = 1000(0x3e8, double:4.94E-321)
            r7.LJFF(r0, r3)
            return
        L70:
            X.0zlO r1 = X.C1908480zlO.LIZIZ
            boolean r0 = r1.LJIIJJI()
            if (r0 != 0) goto L7f
            boolean r0 = r1.LJIIIZ(r3)
            if (r0 == 0) goto L7f
            goto L68
        L7f:
            X.0mCc r0 = X.C1906580ziK.LIZIZ()
            if (r0 == 0) goto L9d
            android.app.Activity r0 = r0.LIZIZ()
            if (r0 == 0) goto L9d
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L9d
            android.content.res.Configuration r0 = r0.getConfiguration()
            if (r0 == 0) goto L9d
            int r1 = r0.orientation
            r0 = 2
            if (r1 != r0) goto L9d
            goto L68
        L9d:
            java.lang.String r0 = "NOTIFICATION"
            boolean r0 = X.C1585030rLh.LJIJI(r0)
            if (r0 == 0) goto Lae
            X.0sDt r0 = X.C1618630sDt.LIZIZ
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Lae
            goto L68
        Lae:
            r7.LIZJ = r4
            r7.LJFF = r3
            X.1DFH r0 = X.C0PEM.LIZ
            X.054G r1 = X.C2296808zG.LIZ(r0)
            X.0Csd r0 = new X.0Csd
            r0.<init>(r7, r9)
            X.C23250099c.LIZLLL(r1, r9, r9, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z2O.LJFF(long, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C879180YeK r8, com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate r9, android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z2O.LJ(X.0YeK, com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate, android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C869590Y9l r8, X.EnumC876540Ya4 r9, X.InterfaceC1364105Vn<? super X.C19323510in> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C876670YaH
            if (r0 == 0) goto L43
            r6 = r10
            X.0YaH r6 = (X.C876670YaH) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r2 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L28
            if (r0 != r4) goto L52
            X.C155000ia.LIZIZ(r2)
        L22:
            X.0YeK r2 = (X.C879180YeK) r2
            r1 = 0
            if (r2 != 0) goto L49
            return r1
        L28:
            X.C155000ia.LIZIZ(r2)
            X.0YaD r0 = X.C876550Ya5.LJI
            r0.getClass()
            X.0Ya5 r3 = X.C876630YaD.LJFF(r8, r9)
            X.0YeB r2 = r7.LIZ
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.LLILLL = r4
            java.lang.Object r2 = r2.LIZIZ(r3, r0, r6)
            if (r2 != r5) goto L22
            return r5
        L43:
            X.0YaH r6 = new X.0YaH
            r6.<init>(r7, r10)
            goto L12
        L49:
            java.util.List r0 = X.C879200YeM.LIZ(r2)
            X.10in r0 = LIZJ(r7, r2, r1, r0)
            return r0
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z2O.LIZLLL(X.0Y9l, X.0Ya4, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x036b  */
    /* JADX WARN: Type inference failed for: r19v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C19323510in LIZJ(X.C0Z2O r146, X.C879180YeK r147, com.ss.android.ugc.aweme.im.message.content.ShareLiveContent r148, java.util.List r149) {
        /*
            Method dump skipped, instruction units count: 1986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z2O.LIZJ(X.0Z2O, X.0YeK, com.ss.android.ugc.aweme.im.message.content.ShareLiveContent, java.util.List):X.10in");
    }
}

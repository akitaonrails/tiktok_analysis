package X;

import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.creation.publish.IMediaPublishManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performance.MediaUploadPerformanceMonitor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2256621DUe extends AbstractC873650YPb {
    public final C869590Y9l LIZIZ;
    public final C0YC6 LIZJ;
    public final C2256701DUm LIZLLL;
    public final C0Y3I LJ;
    public final C2256741DUq LJFF;
    public final boolean LJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.1DUQ] */
    @Override // X.AbstractC873650YPb
    public final Object LIZ(final C873910YQb c873910YQb, InterfaceC1364105Vn<? super InterfaceC873770YPn> interfaceC1364105Vn) {
        C0YS1.LIZJ("im-media-sending-step", "start execute RetryPublishPhotoStep");
        boolean zLJFF = Intrinsics.LJFF(this.LIZJ.ext.get("key_is_from_main_post"), "1");
        final C259800zU c259800zU = new C259800zU();
        C0YC6 c0yc6 = this.LIZJ;
        c259800zU.element = new C1DUQ(c0yc6.localPath, null, c0yc6.getOriginalWidth(), this.LIZJ.getOriginalHeight(), this.LIZJ.length, null, zLJFF, false, false, null, 7650);
        IMediaPublishManager iMediaPublishManager = (IMediaPublishManager) PluggableExtentionKt.pluggableSpiForReal(IMediaPublishManager.class);
        if (iMediaPublishManager == null) {
            return C873780YPo.LIZ;
        }
        C2256651DUh c2256651DUh = (C2256651DUh) MediaUploadPerformanceMonitor.LIZIZ.LIZ(this.LIZIZ.getUuid());
        c2256651DUh.LJJI(C2256641DUg.LJIIIZ(this.LIZIZ, this.LIZLLL.LJIIJ));
        c2256651DUh.LJIL(C2256641DUg.LJFF(this.LIZIZ));
        c2256651DUh.LJJ(C2256641DUg.LJIIIIZZ(this.LIZIZ));
        c2256651DUh.LJJIFFI(C2256641DUg.LJIIJ(this.LIZIZ));
        c2256651DUh.LJIJJ(C2256641DUg.LJ(this.LIZIZ));
        String str = ((C1DUQ) c259800zU.element).LIZ;
        if (this.LJI && C258460AAy.LIZIZ && str != null && str.length() != 0) {
            return LIZJ(c873910YQb, iMediaPublishManager, (C1DUQ) c259800zU.element, str, interfaceC1364105Vn);
        }
        String uuid = this.LIZIZ.getUuid();
        C1DUQ c1duq = (C1DUQ) c259800zU.element;
        String str2 = c1duq.LIZ;
        boolean z = c1duq.LJIIIZ;
        int scene = C09KR.PRIVATE_MEDIA.getScene();
        boolean z2 = this.LJI;
        C327300CsK.LIZ.getClass();
        iMediaPublishManager.LJIIIZ(uuid, str2, z, scene, true, false, z2, C327300CsK.LIZ(), C2097608Jq.LJ(), new AwS628S0100000_14(c873910YQb, 56));
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        iMediaPublishManager.LIZIZ(new C09KS<DMUploadImageResult>() { // from class: X.1DUi
            @Override // X.C09KS
            public final void Z3(C912060ZqG c912060ZqG) {
            }

            @Override // X.C09KS
            public final void onProgress(int i) {
            }

            public final void LIZ(String str3) {
                EnumC2249731D3r enumC2249731D3r;
                C2256621DUe c2256621DUe = this.LL;
                InterfaceC1631630sYr<C0Y3I, C869590Y9l, C09KS<?>, C2256701DUm, Unit> interfaceC1631630sYr = c2256621DUe.LJFF.LIZLLL;
                C0Y3I c0y3iLIZ = c2256621DUe.LJ.LIZ();
                C869590Y9l c869590Y9l = c873910YQb.LIZ;
                if (c869590Y9l == null) {
                    InterfaceC20236714Gf<InterfaceC873770YPn> interfaceC20236714Gf = c2252611DEt;
                    if (interfaceC20236714Gf.isActive()) {
                        C873780YPo c873780YPo = C873780YPo.LIZ;
                        C189200o6.m2constructorimpl(c873780YPo);
                        interfaceC20236714Gf.resumeWith(c873780YPo);
                        return;
                    }
                    return;
                }
                C2256621DUe c2256621DUe2 = this.LL;
                C2256701DUm c2256701DUm = c2256621DUe2.LIZLLL;
                if (c2256621DUe2.LJI) {
                    enumC2249731D3r = EnumC2249731D3r.SYNTHESISED;
                } else {
                    enumC2249731D3r = EnumC2249731D3r.DEFAULT;
                }
                interfaceC1631630sYr.invoke(c0y3iLIZ, c869590Y9l, this, C2256701DUm.LIZ(c2256701DUm, enumC2249731D3r, null, false, 2039));
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<InterfaceC873770YPn> interfaceC20236714Gf2 = c2252611DEt;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("photo retry upload failed: ");
                    sbLIZ.append(str3);
                    C0YPZ c0ypz = new C0YPZ(new C0YPY(-1053, C2188811AlT.LIZIZ(sbLIZ), null, null));
                    C189200o6.m2constructorimpl(c0ypz);
                    interfaceC20236714Gf2.resumeWith(c0ypz);
                }
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.C09KS
            public final void Uj(C0OPV c0opv) {
                C2256621DUe c2256621DUe = this.LL;
                if (c2256621DUe.LJI) {
                    return;
                }
                InterfaceC1685420txc<C0Y3I, C869590Y9l, C0OPV, C1DUQ, Function1<? super C1DUQ, Unit>, Unit> interfaceC1685420txc = c2256621DUe.LJFF.LIZIZ;
                C0Y3I c0y3iLIZ = c2256621DUe.LJ.LIZ();
                C869590Y9l c869590Y9l = c873910YQb.LIZ;
                if (c869590Y9l == null) {
                    return;
                }
                C259800zU<C1DUQ> c259800zU2 = c259800zU;
                interfaceC1685420txc.invoke(c0y3iLIZ, c869590Y9l, c0opv, c259800zU2.element, new AwS614S0100000_35(c259800zU2, (C259800zU<C1DUQ>) 159));
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.1DUi for r13v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // X.C09KS
            public final void l1(X.C09KK r14) {
                /*
                    r13 = this;
                    r10 = r13
                    X.1DUe r1 = r10.LL
                    X.1DUq r0 = r1.LJFF
                    X.1EMt<X.0Y3I, X.0Y9l, X.1DUQ, com.ss.android.ugc.aweme.creation.config.DMUploadImageResult, X.09KS<?>, X.1DUm, kotlin.jvm.functions.Function1<? super X.1DUQ, kotlin.Unit>, kotlin.Unit> r5 = r0.LIZJ
                    X.0Y3I r0 = r1.LJ
                    X.0Y3I r6 = r0.LIZ()
                    X.0YQb r0 = r2
                    X.0Y9l r7 = r0.LIZ
                    if (r7 != 0) goto L24
                    X.14Gf<X.0YPn> r1 = r4
                    boolean r0 = r1.isActive()
                    if (r0 == 0) goto L23
                    X.0YPo r0 = X.C873780YPo.LIZ
                    X.C189200o6.m2constructorimpl(r0)
                    r1.resumeWith(r0)
                L23:
                    return
                L24:
                    X.00zU<X.1DUQ> r0 = r3
                    T r8 = r0.element
                    X.1DUe r0 = r10.LL
                    X.1DUm r4 = r0.LIZLLL
                    boolean r0 = r0.LJI
                    if (r0 == 0) goto L5a
                    X.1D3r r3 = X.EnumC2249731D3r.SYNTHESISED
                L32:
                    r2 = 0
                    r1 = 2039(0x7f7, float:2.857E-42)
                    r0 = 0
                    X.1DUm r11 = X.C2256701DUm.LIZ(r4, r3, r0, r2, r1)
                    kotlin.jvm.internal.AwS614S0100000_35 r12 = new kotlin.jvm.internal.AwS614S0100000_35
                    X.00zU<X.1DUQ> r1 = r3
                    r0 = 161(0xa1, float:2.26E-43)
                    r12.<init>(r1, r0)
                    r9 = r14
                    r5.yc(r6, r7, r8, r9, r10, r11, r12)
                    X.14Gf<X.0YPn> r0 = r4
                    boolean r0 = r0.isActive()
                    if (r0 == 0) goto L23
                    X.14Gf<X.0YPn> r1 = r4
                    X.0YPo r0 = X.C873780YPo.LIZ
                    X.C189200o6.m2constructorimpl(r0)
                    r1.resumeWith(r0)
                    return
                L5a:
                    X.1D3r r3 = X.EnumC2249731D3r.DEFAULT
                    goto L32
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2256661DUi.l1(X.09KK):void");
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.C09KS
            public final void m4(String str3) {
                C2256621DUe c2256621DUe = this.LL;
                if (c2256621DUe.LJI) {
                    return;
                }
                InterfaceC1685420txc<C0Y3I, C869590Y9l, String, C1DUQ, Function1<? super C1DUQ, Unit>, Unit> interfaceC1685420txc = c2256621DUe.LJFF.LIZ;
                C0Y3I c0y3iLIZ = c2256621DUe.LJ.LIZ();
                C869590Y9l c869590Y9l = c873910YQb.LIZ;
                if (c869590Y9l == null) {
                    return;
                }
                C259800zU<C1DUQ> c259800zU2 = c259800zU;
                interfaceC1685420txc.invoke(c0y3iLIZ, c869590Y9l, str3, c259800zU2.element, new AwS614S0100000_35(c259800zU2, (C259800zU<C1DUQ>) 158));
            }

            @Override // X.C09KS
            public final void rf(C1898507c7 c1898507c7) {
                LIZ(c1898507c7.LIZ);
            }
        }, this.LIZIZ.getUuid());
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public /* synthetic */ C2256621DUe(C869590Y9l c869590Y9l, C0YC6 c0yc6, C2256701DUm c2256701DUm, C0Y3I c0y3i, C2256741DUq c2256741DUq) {
        this(c869590Y9l, c0yc6, c2256701DUm, c0y3i, c2256741DUq, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.1DVe] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.ss.android.ugc.aweme.creation.publish.IMediaPublishManager] */
    /* JADX WARN: Type inference failed for: r22v0, types: [T, X.1DUQ] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C873910YQb r20, com.ss.android.ugc.aweme.creation.publish.IMediaPublishManager r21, X.C1DUQ r22, java.lang.String r23, X.InterfaceC1364105Vn<? super X.InterfaceC873770YPn> r24) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2256621DUe.LIZJ(X.0YQb, com.ss.android.ugc.aweme.creation.publish.IMediaPublishManager, X.1DUQ, java.lang.String, X.05Vn):java.lang.Object");
    }

    public C2256621DUe(C869590Y9l c869590Y9l, C0YC6 c0yc6, C2256701DUm c2256701DUm, C0Y3I c0y3i, C2256741DUq c2256741DUq, boolean z) {
        super("camera-retry-publish-photo");
        this.LIZIZ = c869590Y9l;
        this.LIZJ = c0yc6;
        this.LIZLLL = c2256701DUm;
        this.LJ = c0y3i;
        this.LJFF = c2256741DUq;
        this.LJI = z;
    }
}

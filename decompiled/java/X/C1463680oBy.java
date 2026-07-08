package X;

import android.content.Context;
import android.view.SurfaceView;
import com.bytedance.ies.nle.editor_jni.INLEExporter;
import com.bytedance.ies.nle.editor_jni.INLEListenerCompile;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.INLEPurePlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoCompileEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLE_COMPILE_TYPE;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.ies.nleeditor.NLE;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import kotlin.Pair;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0oBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463680oBy {
    public final File LIZ;
    public final File LIZIZ;
    public final File LIZJ;
    public final File LIZLLL;
    public final File LJ;
    public final Context LJFF;
    public final NLEEditor LJI;
    public C1463860oCG LJII;
    public C1463780oC8 LJIIIIZZ;
    public final NLEEditor LJIIIZ;
    public C1463860oCG LJIIJ;
    public C1463760oC6 LJIIJJI;
    public final NLEEditor LJIIL;
    public C1463720oC2 LJIILIIL;
    public C1463860oCG LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;

    public final void LJFF() {
        if (this.LJIILL) {
            return;
        }
        this.LJIIIZ.getModel().clearTrack();
        C1463760oC6 c1463760oC6 = this.LJIIJJI;
        if (c1463760oC6 != null) {
            this.LJIIIZ.removeConsumer(c1463760oC6);
        }
        this.LJIIJJI = null;
        this.LJIILL = true;
    }

    public final void LJI() {
        if (this.LJIILLIIL) {
            this.LJI.getModel().clearTrack();
            C1463780oC8 c1463780oC8 = this.LJIIIIZZ;
            if (c1463780oC8 != null) {
                this.LJI.removeConsumer(c1463780oC8);
            }
            this.LJIIIIZZ = null;
            this.LJIILLIIL = true;
        }
    }

    public static String LJIIJJI() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('_');
        sbLIZ.append(curUserId);
        return a0.LJJJJJL('0', 64, new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(C2188811AlT.LIZIZ(sbLIZ).getBytes(Charsets.UTF_8))).toString(16)).substring(0, 8);
    }

    public final void LJ() {
        INLEPlayer playerApi;
        LJI();
        LJFF();
        if (this.LJIIZILJ) {
            return;
        }
        this.LJIJ = false;
        C1463860oCG c1463860oCG = this.LJIILJJIL;
        if (c1463860oCG != null && (playerApi = c1463860oCG.getPlayerApi()) != null) {
            ((C389960FQs) playerApi).destroy();
        }
        this.LJIIL.getModel().clearTrack();
        C1463720oC2 c1463720oC2 = this.LJIILIIL;
        if (c1463720oC2 != null) {
            this.LJIIL.removeConsumer(c1463720oC2);
        }
        this.LJIILIIL = null;
        this.LJIIZILJ = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0oC8, com.bytedance.ies.nle.editor_jni.NLEEditorListener] */
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
    public final void LJIIIIZZ() {
        System.currentTimeMillis();
        this.LJII = LIZIZ(this.LJI, null);
        this.LJI.setModel(LIZ(326, 407, 2));
        ?? r1 = new C354000DuI() { // from class: X.0oC8
            @Override // X.C354000DuI
            public final void LIZ() {
                C1463680oBy c1463680oBy = this.LIZ;
                C1463860oCG c1463860oCG = c1463680oBy.LJII;
                if (c1463860oCG != null) {
                    c1463860oCG.setDataSource(c1463680oBy.LJI.getModel());
                }
            }
        };
        this.LJIIIIZZ = r1;
        this.LJI.addConsumer(r1);
        this.LJI.commit();
        this.LJI.done();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0oC6, com.bytedance.ies.nle.editor_jni.NLEEditorListener] */
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
    public final void LJIIJ() {
        System.currentTimeMillis();
        this.LJIIJ = LIZIZ(this.LJIIIZ, null);
        NLEEditor nLEEditor = this.LJIIIZ;
        long jLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(390));
        long jLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(390));
        NLEModel nLEModel = new NLEModel();
        nLEModel.clearTrack();
        File file = this.LIZJ;
        getClass();
        NLETrack nLETrackLIZJ = LIZJ(file, false, true, 0, LSPassThroughRecordSizeConfig.DEFAULT, jLIZIZ2, jLIZIZ, null, null);
        File file2 = this.LIZLLL;
        getClass();
        NLETrack nLETrackLIZJ2 = LIZJ(file2, false, false, 1, LSPassThroughRecordSizeConfig.DEFAULT, jLIZIZ2, jLIZIZ2, null, null);
        if (nLETrackLIZJ != null) {
            nLEModel.addTrack(nLETrackLIZJ);
        }
        if (nLETrackLIZJ2 != null) {
            nLEModel.addTrack(nLETrackLIZJ2);
        }
        nLEModel.setCanvasRatio(0.5625f);
        nLEEditor.setModel(nLEModel);
        ?? r1 = new C354000DuI() { // from class: X.0oC6
            @Override // X.C354000DuI
            public final void LIZ() {
                C1463680oBy c1463680oBy = this.LIZ;
                C1463860oCG c1463860oCG = c1463680oBy.LJIIJ;
                if (c1463860oCG != null) {
                    c1463860oCG.setDataSource(c1463680oBy.LJIIIZ.getModel());
                }
                this.LIZ.LJIIIZ.removeConsumer(this);
            }
        };
        this.LJIIJJI = r1;
        this.LJIIIZ.addConsumer(r1);
        this.LJIIIZ.commit();
        this.LJIIIZ.done();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0oC2, com.bytedance.ies.nle.editor_jni.NLEEditorListener] */
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
    public final void LJII(final SurfaceView surfaceView) {
        INLEPlayer playerApi;
        INLEPlayer playerApi2;
        INLEMediaRuntime mediaRuntimeApi;
        INLEMediaSettings mediaSettingApi;
        System.currentTimeMillis();
        this.LJIILJJIL = LIZIZ(this.LJIIL, surfaceView);
        this.LJIIL.setModel(LIZ(surfaceView.getLayoutParams().width, surfaceView.getLayoutParams().height, 2));
        ?? r1 = new C354000DuI() { // from class: X.0oC2
            @Override // X.C354000DuI
            public final void LIZ() {
                INLEPlayer playerApi3;
                INLEPlayer playerApi4;
                C1463680oBy c1463680oBy = this.LIZ;
                C1463860oCG c1463860oCG = c1463680oBy.LJIILJJIL;
                if (c1463860oCG != null) {
                    c1463860oCG.setDataSource(c1463680oBy.LJIIL.getModel());
                }
                C1463680oBy c1463680oBy2 = this.LIZ;
                if (c1463680oBy2.LJIJ) {
                    return;
                }
                C1463860oCG c1463860oCG2 = c1463680oBy2.LJIILJJIL;
                if (c1463860oCG2 != null && (playerApi4 = c1463860oCG2.getPlayerApi()) != null) {
                    INLEPurePlayer.DefaultImpls.bindSurfaceView$default(playerApi4, surfaceView, false, 2, null);
                }
                C1463860oCG c1463860oCG3 = this.LIZ.LJIILJJIL;
                if (c1463860oCG3 != null && (playerApi3 = c1463860oCG3.getPlayerApi()) != null) {
                    ((C389960FQs) playerApi3).prepare();
                }
                this.LIZ.LJIJ = true;
            }
        };
        this.LJIILIIL = r1;
        this.LJIIL.addConsumer(r1);
        this.LJIIL.commit();
        this.LJIIL.done();
        C1463860oCG c1463860oCG = this.LJIILJJIL;
        if (c1463860oCG != null && (mediaSettingApi = c1463860oCG.getMediaSettingApi()) != null) {
            ((C1463880oCI) mediaSettingApi).setPreviewFps(30, true);
        }
        C1463860oCG c1463860oCG2 = this.LJIILJJIL;
        if (c1463860oCG2 != null && (mediaRuntimeApi = c1463860oCG2.getMediaRuntimeApi()) != null) {
            ((C1463950oCP) mediaRuntimeApi).setBackgroundColor(0);
        }
        C1463860oCG c1463860oCG3 = this.LJIILJJIL;
        if (c1463860oCG3 != null && (playerApi2 = c1463860oCG3.getPlayerApi()) != null) {
            ((C389960FQs) playerApi2).play();
        }
        C1463860oCG c1463860oCG4 = this.LJIILJJIL;
        if (c1463860oCG4 != null && (playerApi = c1463860oCG4.getPlayerApi()) != null) {
            ((C389960FQs) playerApi).refreshCurrentFrame();
        }
    }

    public static C1463860oCG LIZIZ(NLEEditor nLEEditor, SurfaceView surfaceView) {
        String absolutePath;
        NLEMediaConfig nLEMediaConfig = new NLEMediaConfig();
        C0VSJ c0vsjLJ = C2354809Ko.LJ();
        if (c0vsjLJ != null && (absolutePath = c0vsjLJ.getAbsolutePath()) != null && nLEMediaConfig.getNleMediaAbConfig() != null) {
            nLEMediaConfig.setWorkSpace(absolutePath);
            nLEMediaConfig.setForCanvasMode(true);
            nLEMediaConfig.setEnableCoexistGlobalEffect(true);
        }
        C1419820n3E.LIZ.LIZ();
        return new C1463860oCG(nLEMediaConfig, surfaceView, nLEEditor, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC497601wk r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C1381580m3Y
            if (r0 == 0) goto L28
            r8 = r11
            X.0m3Y r8 = (X.C1381580m3Y) r8
            int r2 = r8.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r8.LLILZIL = r2
        L12:
            java.lang.Object r1 = r8.LLILLL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILZIL
            r6 = 0
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L46
            if (r0 == r4) goto L3a
            if (r0 != r5) goto L32
            java.lang.Object r3 = r8.LL
            java.util.List r3 = (java.util.List) r3
            goto L2e
        L28:
            X.0m3Y r8 = new X.0m3Y
            r8.<init>(r9, r11)
            goto L12
        L2e:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L7d
            goto L89
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3a:
            X.099G r2 = r8.LLILLJJLI
            java.lang.Object r3 = r8.LL
            java.util.List r3 = (java.util.List) r3
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L44
            goto L6e
        L44:
            r1 = move-exception
            goto L7e
        L46:
            X.C155000ia.LIZIZ(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.0m1b r0 = new X.0m1b     // Catch: java.lang.Exception -> L7b
            r0.<init>(r9, r3, r6)     // Catch: java.lang.Exception -> L7b
            r2 = 3
            X.099G r1 = X.C23250099c.LIZIZ(r10, r6, r6, r0, r2)     // Catch: java.lang.Exception -> L7b
            X.0m1a r0 = new X.0m1a     // Catch: java.lang.Exception -> L7b
            r0.<init>(r9, r3, r6)     // Catch: java.lang.Exception -> L7b
            X.099G r2 = X.C23250099c.LIZIZ(r10, r6, r6, r0, r2)     // Catch: java.lang.Exception -> L7b
            r8.LL = r3     // Catch: java.lang.Exception -> L7b
            r8.LLILLJJLI = r2     // Catch: java.lang.Exception -> L7b
            r8.LLILZIL = r4     // Catch: java.lang.Exception -> L7b
            java.lang.Object r0 = r1.LJLIIIL(r8)     // Catch: java.lang.Exception -> L7b
            if (r0 != r7) goto L6e
            return r7
        L6e:
            r8.LL = r3     // Catch: java.lang.Exception -> L7d
            r8.LLILLJJLI = r6     // Catch: java.lang.Exception -> L7d
            r8.LLILZIL = r5     // Catch: java.lang.Exception -> L7d
            java.lang.Object r0 = r2.LJLIIIL(r8)     // Catch: java.lang.Exception -> L7d
            if (r0 != r7) goto L89
            return r7
        L7b:
            r1 = move-exception
            goto L7e
        L7d:
            r1 = move-exception
        L7e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0m1c r0 = new X.0m1c
            r0.<init>(r1)
            r3.add(r0)
        L89:
            int r0 = r3.size()
            if (r0 > 0) goto L92
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L92:
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1463680oBy.LJIIIZ(X.01wk, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(X.InterfaceC497601wk r21, X.InterfaceC1364105Vn<? super X.C1378260lyC> r22) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1463680oBy.LJIIL(X.01wk, X.05Vn):java.lang.Object");
    }

    public final NLEModel LIZ(int i, int i2, int i3) {
        int i4;
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(this.LJ.getAbsolutePath());
        if (videoFileInfo != null) {
            i4 = videoFileInfo.duration;
        } else {
            i4 = LSPassThroughRecordSizeConfig.DEFAULT;
        }
        int i5 = i4 * i3;
        long jLIZJ = (long) C12ES.LIZJ(i2, this.LJFF);
        long jLIZJ2 = (long) C12ES.LIZJ(i, this.LJFF);
        NLEModel nLEModel = new NLEModel();
        nLEModel.clearTrack();
        File file = this.LIZ;
        getClass();
        NLETrack nLETrackLIZJ = LIZJ(file, false, true, 0, i5, jLIZJ2, jLIZJ, null, null);
        NLETrack nLETrackLIZJ2 = LIZJ(this.LJ, true, false, 1, i5, jLIZJ2, jLIZJ2, Float.valueOf(0.05f), Float.valueOf(8.0f));
        File file2 = this.LIZIZ;
        getClass();
        NLETrack nLETrackLIZJ3 = LIZJ(file2, false, false, 2, i5, jLIZJ2, jLIZJ, null, null);
        if (nLETrackLIZJ != null) {
            nLEModel.addTrack(nLETrackLIZJ);
        }
        if (nLETrackLIZJ2 != null) {
            nLEModel.addTrack(nLETrackLIZJ2);
        }
        if (nLETrackLIZJ3 != null) {
            nLEModel.addTrack(nLETrackLIZJ3);
        }
        nLEModel.setCanvasRatio(jLIZJ2 / jLIZJ);
        C348350DlB.LJIIJJI(nLEModel, (int) jLIZJ2);
        return nLEModel;
    }

    public C1463680oBy(File file, File file2, File file3, File file4, File file5, Context context) {
        this.LIZ = file;
        this.LIZIZ = file2;
        this.LIZJ = file3;
        this.LIZLLL = file4;
        this.LJ = file5;
        this.LJFF = context;
        NLE.loadNLELibrary$default(NLE.INSTANCE, false, C293550Bez.LIZ(), false, 5, null);
        this.LJI = new NLEEditor();
        this.LJIIIZ = new NLEEditor();
        this.LJIIL = new NLEEditor();
    }

    public static Object LJIILIIL(final C1463680oBy c1463680oBy, C1463860oCG c1463860oCG, final boolean z, final C0VSJ c0vsj, final String str, int i, InterfaceC1364105Vn interfaceC1364105Vn) {
        NLE_COMPILE_TYPE nle_compile_type;
        INLEExporter exporterApi;
        c1463680oBy.getClass();
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        System.currentTimeMillis();
        final C013C c013c = new C013C();
        c013c.element = true;
        NLEVideoEncodeSettings nLEVideoEncodeSettings = new NLEVideoEncodeSettings();
        if (z) {
            nle_compile_type = NLE_COMPILE_TYPE.COMPILE_TYPE_MP4;
        } else {
            nle_compile_type = NLE_COMPILE_TYPE.COMPILE_TYPE_PNG;
        }
        nLEVideoEncodeSettings.setCompileType(nle_compile_type);
        nLEVideoEncodeSettings.setFps(30);
        nLEVideoEncodeSettings.setOutputSize(new PairIntInt(1080, i));
        nLEVideoEncodeSettings.setIsSupportHWEncoder(true);
        NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings = new NLEVideoCompileEncodeSettings();
        nLEVideoCompileEncodeSettings.setUseHWEncoder(true);
        nLEVideoCompileEncodeSettings.setIsSupportHWEncoder(true);
        nLEVideoEncodeSettings.setMVideoCompileEncodeSetting(nLEVideoCompileEncodeSettings);
        if (c1463860oCG != null && (exporterApi = c1463860oCG.getExporterApi()) != null) {
            Boolean.valueOf(((C1463840oCE) exporterApi).compile(c0vsj.getAbsolutePath(), nLEVideoEncodeSettings, new INLEListenerCompile() { // from class: X.0lyD
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
                
                    if (r6 == false) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
                
                    r4.LJI();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
                
                    r4.LJFF();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
                
                    if (r6 != false) goto L17;
                 */
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onCompileDone() {
                    /*
                        r7 = this;
                        r5 = 0
                        X.013C r0 = r1     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L64
                        boolean r0 = r0.element     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L64
                        if (r0 == 0) goto L31
                        X.0oBy r0 = r4     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L64
                        android.content.Context r1 = r0.LJFF     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L64
                        java.io.File r0 = r5     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L64
                        java.lang.String r2 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L64
                        java.lang.String r3 = r3     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L64
                        boolean r4 = r6     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L64
                        r6 = 112(0x70, float:1.57E-43)
                        X.C2471909mP.LJJIJIIJI(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L64
                        X.14Gf<kotlin.Pair<? extends java.io.File, ? extends java.lang.Exception>> r0 = r2     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L64
                        boolean r0 = r0.isActive()     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L64
                        if (r0 == 0) goto L31
                        X.14Gf<kotlin.Pair<? extends java.io.File, ? extends java.lang.Exception>> r2 = r2     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L64
                        kotlin.Pair r1 = new kotlin.Pair     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L64
                        java.io.File r0 = r5     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L64
                        r1.<init>(r0, r5)     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L64
                        X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L64
                        r2.resumeWith(r1)     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L64
                    L31:
                        boolean r0 = r6
                        if (r0 == 0) goto L5e
                        goto L58
                    L36:
                        r3 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L64
                        X.14Gf<kotlin.Pair<? extends java.io.File, ? extends java.lang.Exception>> r0 = r2     // Catch: java.lang.Throwable -> L64
                        boolean r0 = r0.isActive()     // Catch: java.lang.Throwable -> L64
                        if (r0 == 0) goto L54
                        X.14Gf<kotlin.Pair<? extends java.io.File, ? extends java.lang.Exception>> r2 = r2     // Catch: java.lang.Throwable -> L64
                        kotlin.Pair r1 = new kotlin.Pair     // Catch: java.lang.Throwable -> L64
                        X.0ly3 r0 = new X.0ly3     // Catch: java.lang.Throwable -> L64
                        r0.<init>(r3)     // Catch: java.lang.Throwable -> L64
                        r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> L64
                        X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L64
                        r2.resumeWith(r1)     // Catch: java.lang.Throwable -> L64
                    L54:
                        boolean r0 = r6
                        if (r0 == 0) goto L5e
                    L58:
                        X.0oBy r0 = r4
                        r0.LJI()
                        return
                    L5e:
                        X.0oBy r0 = r4
                        r0.LJFF()
                        return
                    L64:
                        r1 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L64
                        boolean r0 = r6
                        if (r0 == 0) goto L72
                        X.0oBy r0 = r4
                        r0.LJI()
                        throw r1
                    L72:
                        X.0oBy r0 = r4
                        r0.LJFF()
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1378270lyD.onCompileDone():void");
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileProgress(float f) {
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileError(int i2, int i3, float f, String str2) {
                    c013c.element = false;
                    if (c2252611DEt.isActive()) {
                        InterfaceC20236714Gf<Pair<? extends File, ? extends Exception>> interfaceC20236714Gf = c2252611DEt;
                        if (str2 == null) {
                            str2 = "On compile error";
                        }
                        Pair pair = new Pair(null, new C1378250lyB(str2));
                        C189200o6.m2constructorimpl(pair);
                        interfaceC20236714Gf.resumeWith(pair);
                    }
                }
            }));
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static NLETrack LIZJ(File file, boolean z, boolean z2, int i, int i2, long j, long j2, Float f, Float f2) {
        NLEResType nLEResType;
        float fFloatValue;
        NLETrackType nLETrackType;
        String absolutePath = file.getAbsolutePath();
        if (absolutePath == null) {
            return null;
        }
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        nLETrackSlot.setStartTime(0L);
        long j3 = ((long) i2) * 1000;
        nLETrackSlot.setEndTime(j3);
        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceFile(absolutePath);
        if (z) {
            nLEResType = NLEResType.VIDEO;
        } else {
            nLEResType = NLEResType.IMAGE;
        }
        nLEResourceAV.setResourceType(nLEResType);
        float fFloatValue2 = 0.0f;
        if (f2 != null) {
            fFloatValue = f2.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        nLETrackSlot.setRotation(fFloatValue);
        nLEResourceAV.setWidth(j);
        nLEResourceAV.setHeight(j2);
        nLEResourceAV.setDuration(j3);
        if (f != null) {
            fFloatValue2 = f.floatValue();
        }
        nLETrackSlot.setTransformY(fFloatValue2);
        nLESegmentVideo.setAVFile(nLEResourceAV);
        nLESegmentVideo.setTimeClipStart(0L);
        nLESegmentVideo.setTimeClipEnd(j3);
        nLETrackSlot.setMainSegment(nLESegmentVideo);
        NLETrack nLETrack = new NLETrack();
        nLETrack.setMainTrack(z2);
        nLETrack.setLayer(i);
        if (z) {
            nLETrackType = NLETrackType.VIDEO;
        } else {
            nLETrackType = NLETrackType.IMAGE;
        }
        nLETrack.setExtraTrackType(nLETrackType);
        nLETrack.addSlot(nLETrackSlot);
        nLETrack.setDuration(nLETrackSlot.getDuration());
        return nLETrack;
    }
}

package X;

import Y.AfS172S0100000_3;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import v7.o;

/* JADX INFO: renamed from: X.0nMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class RunnableC1432010nMt implements Runnable {
    public final SingleImageData LL;
    public final ImageAlbumData LLILLJJLI;
    public final CreativeModel LLILLL;
    public final String LLILZ;
    public final C1432030nMv LLILZIL;
    public final Function1<ImageSynthesisResult, Unit> LLILZLL;
    public final InterfaceC1631620sYq<Integer, Exception, String, Unit> LLIZ;
    public final String LLIZLLLIL;
    public volatile boolean LLJ;
    public volatile boolean LLJI;
    public InterfaceC1452170ntP LLJIJIL;
    public final ReentrantLock LLJILJIL;

    /* JADX WARN: Removed duplicated region for block: B:190:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0341 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03b4  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public final void LIZJ() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1432010nMt.LIZJ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ImageSynthesisTask@c8d1.run");
        try {
            LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageSynthesisTask@c8d1.run");
    }

    public final void LIZ() {
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageSynthesisTask cancel ");
        sbLIZ.append(hashCode());
        c1437510nVlLJJLIIIJ.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJIJIL = null;
        if (this.LLJI) {
            return;
        }
        this.LLJI = true;
    }

    public final void LIZIZ() throws Throwable {
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageSynthesisTask run ");
        sbLIZ.append(hashCode());
        c1437510nVlLJJLIIIJ.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILZLL == null || this.LLILZ == null) {
            throw new IllegalArgumentException("image synthesis task targetPath and onSynthesisSuccess must not be null");
        }
        if (((Boolean) C280110AyP.LIZ.getValue()).booleanValue()) {
            File parentFile = new C0VSJ(this.LLILZ).getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("image publish presenter create targetFile targetPath = ");
            sbLIZ2.append(parentFile != null ? Boolean.valueOf(parentFile.exists()) : null);
            C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (this.LLJI) {
            return;
        }
        if (this.LLJ) {
            C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ImageSynthesisTask pause ");
            sbLIZ3.append(hashCode());
            c1437510nVlLJJLIIIJ2.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ3));
            this.LLJILJIL.lock();
        }
        if (this.LLILZIL.LIZJ == null) {
            LJ(new AwS566S0100000_22(this, 847));
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("image publish presenter start create image synthesisTask compileNLE targetPath = ");
        sbLIZ4.append(this.LLILZ);
        C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_publish_image_exception_publish_error_fix", true, false)) {
            LIZJ();
            return;
        }
        try {
            LIZJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("image publish presenter compile Error e = ");
            sbLIZ5.append(e.getMessage());
            C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
            LJ(new AwS566S0100000_22(this, 846));
        }
    }

    public final void LJ(Function0<Unit> function0) {
        if (this.LLJI) {
            return;
        }
        C01TT.LIZLLL(new AwS566S0100000_22(function0, (Function0<Boolean>) 848));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap LIZLLL(final int i, final int i2) {
        String str;
        if (Intrinsics.LJFF(this.LLILLJJLI.getImageUiBusinessData().getHasNLEEdit(), Boolean.TRUE) && this.LLILZIL.LIZJ != null) {
            final C259800zU c259800zU = new C259800zU();
            final o oVar = new o();
            if (C287050BMx.LIZ()) {
                str = ".webp";
            } else {
                str = ".jpeg";
            }
            final String path = this.LLILZ;
            if (path == null) {
                String str2 = this.LLILZIL.LIZJ;
                if (str2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("temp_");
                    sbLIZ.append(System.currentTimeMillis());
                    sbLIZ.append(str);
                    path = new C0VSJ(str2, C2188811AlT.LIZIZ(sbLIZ)).getPath();
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            if (C295670BiP.LIZ()) {
                C1449990npt c1449990npt = C1449990npt.LIZ;
                SingleImageData singleImageData = this.LL;
                ImageAlbumData imageAlbumData = this.LLILLJJLI;
                CreativeModel creativeModel = this.LLILLL;
                C1432030nMv c1432030nMv = this.LLILZIL;
                final String str3 = path;
                InterfaceC1450050npz interfaceC1450050npz = new InterfaceC1450050npz() { // from class: X.09q2
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
                    @Override // X.InterfaceC1450050npz
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZIZ(com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult r12) throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 202
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C2494409q2.LIZIZ(com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult):void");
                    }

                    @Override // X.InterfaceC1450050npz
                    public final void LIZ(int i3, int i4, float f) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Debug-F getNLEBitmap onCompileError error ");
                        sbLIZ2.append(i3);
                        C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                        oVar.LJ(Unit.LIZ);
                        this.LLJIJIL = null;
                    }
                };
                c1449990npt.getClass();
                C11NZ.LJIJJLI(new C1432020nMu(singleImageData, imageAlbumData, creativeModel, c1432030nMv, path, interfaceC1450050npz, null)).LJL(C1701940uOG.LIZIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS172S0100000_3(this, 33), new C09JN() { // from class: X.01kB
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("ImageSynthesisTask@c8d1.getNLEBitmap$3");
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Error: ");
                        sbLIZ2.append(((Throwable) obj).getMessage());
                        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
                        C1C7U.LIZIZ("ImageSynthesisTask@c8d1.getNLEBitmap$3");
                    }
                });
            } else {
                this.LLJIJIL = C1449990npt.LIZ.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZIL, path, new InterfaceC1450050npz() { // from class: X.09q3
                    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.graphics.Bitmap] */
                    @Override // X.InterfaceC1450050npz
                    public final void LIZIZ(ImageSynthesisResult imageSynthesisResult) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Debug-F getNLEBitmap default onCompileDone path = ");
                        sbLIZ2.append(path);
                        C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                        c259800zU.element = BitmapFactory.decodeFile(imageSynthesisResult.getPath());
                        oVar.LJ(Unit.LIZ);
                        this.LLJIJIL = null;
                    }

                    @Override // X.InterfaceC1450050npz
                    public final void LIZ(int i3, int i4, float f) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Debug-F getNLEBitmap default onCompileError error ");
                        sbLIZ2.append(i3);
                        C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                        oVar.LJ(Unit.LIZ);
                        this.LLJIJIL = null;
                    }
                }, null);
            }
            oVar.LIZ.LJIJJLI();
            return (Bitmap) c259800zU.element;
        }
        return null;
    }

    public /* synthetic */ RunnableC1432010nMt(SingleImageData singleImageData, ImageAlbumData imageAlbumData, CreativeModel creativeModel, String str, C1432030nMv c1432030nMv, Function1 function1, InterfaceC1631620sYq interfaceC1631620sYq, int i) {
        this(singleImageData, imageAlbumData, creativeModel, (i & 8) != 0 ? null : str, (i & 16) != 0 ? new C1432030nMv(null, null, null, 31) : c1432030nMv, (Function1<? super ImageSynthesisResult, Unit>) ((i & 32) != 0 ? null : function1), (InterfaceC1631620sYq<? super Integer, ? super Exception, ? super String, Unit>) ((i & 64) != 0 ? null : interfaceC1631620sYq), (String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC1432010nMt(SingleImageData singleImageData, ImageAlbumData imageAlbumData, CreativeModel creativeModel, String str, C1432030nMv c1432030nMv, Function1<? super ImageSynthesisResult, Unit> function1, InterfaceC1631620sYq<? super Integer, ? super Exception, ? super String, Unit> interfaceC1631620sYq, String str2) {
        this.LL = singleImageData;
        this.LLILLJJLI = imageAlbumData;
        this.LLILLL = creativeModel;
        this.LLILZ = str;
        this.LLILZIL = c1432030nMv;
        this.LLILZLL = function1;
        this.LLIZ = interfaceC1631620sYq;
        this.LLIZLLLIL = str2;
        this.LLJILJIL = new ReentrantLock();
    }
}

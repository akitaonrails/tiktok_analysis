package X;

import android.app.Application;
import android.os.Process;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS116S0101000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0L8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538050L8h extends AbstractC538070L8j {
    public static final int LJIIL;
    public static final int LJIILIIL;
    public int LJII;
    public volatile int LJIIIIZZ;
    public int LJIIIZ = -1;
    public int LJIIJ = -1;
    public final C538060L8i LJIIJJI = new C538060L8i();

    static {
        boolean zIs64Bit = false;
        try {
            zIs64Bit = Process.is64Bit();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        LJIIL = zIs64Bit ? 3 : 1;
        LJIILIIL = zIs64Bit ? 4 : 2;
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final int LJIL() {
        return 80;
    }

    @Override // X.InterfaceC538100L8m
    public final String getTaskName() {
        return "COMPRESS_MEDIA";
    }

    public static String LJJIJL(CreativeInfo creativeInfo) {
        String strLIZLLL = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.TEMPLATE, null, false, 12);
        if (!new C0VSJ(strLIZLLL).exists()) {
            new C0VSJ(strLIZLLL).mkdirs();
        }
        return strLIZLLL;
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final boolean LJIIZILJ(C0FQS c0fqs) {
        Set<Integer> setLIZIZ;
        if (!super.LJIIZILJ(c0fqs)) {
            return false;
        }
        NLETemplateModel nLETemplateModel = c0fqs.LJIIJ;
        if (nLETemplateModel != null && (setLIZIZ = C0FPT.LIZIZ(nLETemplateModel)) != null && setLIZIZ.contains(Integer.valueOf(C0CIJ.UGC_I2V_FRAME.getValue()))) {
            LIZJ(c0fqs, null);
            return false;
        }
        CreativeInfo creativeInfoLIZ = C0F1Q.LIZ(c0fqs.LIZIZ);
        if (!creativeInfoLIZ.isValid()) {
            C381530Exb.LIZIZ(this, "execute: CreativeInfo is invalid");
            LJJIIZ(new C381350ExJ(10001, "CreativeInfo is invalid", 4));
            return false;
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C538000L8c(this, c0fqs, creativeInfoLIZ, null), 2);
        return false;
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final void LIZJ(C0FQS c0fqs, C381330ExH c381330ExH) {
        for (C537990L8b c537990L8b : c0fqs.LIZLLL) {
            C538060L8i c538060L8i = this.LJIIJJI;
            String string = ((Keva) c538060L8i.LIZ.getValue()).getString(c537990L8b.LIZ, null);
            if (string == null) {
                string = c537990L8b.LIZ;
            }
            c537990L8b.LJ = string;
        }
        super.LIZJ(c0fqs, c381330ExH);
    }

    public final String LJJIJIL(CreativeInfo creativeInfo, C537990L8b c537990L8b) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJJIJL(creativeInfo));
        sbLIZ.append(C08HM.LIZJ(c537990L8b.LIZ));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C538060L8i c538060L8i = this.LJIIJJI;
        String string = ((Keva) c538060L8i.LIZ.getValue()).getString(c537990L8b.LIZ, null);
        if (C123100dR.LIZ(string) && !Intrinsics.LJFF(string, strLIZIZ)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("generateCompressPath: hit cache. srcPath=");
            sbLIZ2.append(c537990L8b.LIZ);
            sbLIZ2.append(", destPath=");
            sbLIZ2.append(strLIZIZ);
            C381530Exb.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ2));
            C2471909mP.LIZJ(c537990L8b.LIZ, strLIZIZ);
        }
        return strLIZIZ;
    }

    public final void LJJIJ(C0FQS c0fqs, CreativeInfo creativeInfo, List<C537990L8b> list) throws Throwable {
        if (LJJIIJZLJL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("compressNextFastImportMedia: compressFastImportMediaIndex=");
            sbLIZ.append(this.LJIIJ);
            C381530Exb.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        synchronized (this) {
            try {
                int i = this.LJIIJ + 1;
                this.LJIIJ = i;
                if (C13LP.LJJJLZIJ(i, list) == null) {
                    if (this.LJII == this.LJIIIIZZ) {
                        C383980F3s.LIZIZ(new AwS409S0200000_8(this, c0fqs, 139));
                    }
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("compressNextFastImportMedia start: indexForLog=");
                sbLIZ2.append(i);
                C381530Exb.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ2));
                C537990L8b c537990L8b = list.get(this.LJIIJ);
                C537990L8b c537990L8b2 = c537990L8b;
                String strLJJIJIL = LJJIJIL(creativeInfo, c537990L8b2);
                if (!new C0VSJ(strLJJIJIL).exists() && !C2471909mP.LIZJ(c537990L8b2.LIZ, strLJJIJIL)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("compressNextFastImportMedia Fail: indexForLog=");
                    sbLIZ3.append(i);
                    sbLIZ3.append(", CompletedCount=");
                    sbLIZ3.append(this.LJII);
                    C381530Exb.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ3));
                    C383980F3s.LIZIZ(new AwS552S0100000_8(this, 1072));
                    return;
                }
                synchronized (this) {
                    try {
                        this.LJII++;
                        if (((Keva) this.LJIIJJI.LIZ.getValue()).getString(c537990L8b.LIZ, null) != null) {
                            this.LJIIJJI.LIZ(c537990L8b.LIZ, strLJJIJIL);
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("compressNextFastImportMedia Success: indexForLog=");
                        sbLIZ4.append(i);
                        sbLIZ4.append(", CompletedCount=");
                        sbLIZ4.append(this.LJII);
                        sbLIZ4.append(", destPath=");
                        sbLIZ4.append(strLJJIJIL);
                        C381530Exb.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ4));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C383980F3s.LIZIZ(new AwS552S0100000_8(this, 1071));
                LJJIJ(c0fqs, creativeInfo, list);
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJJIJIIJI(C0FQS c0fqs, CreativeInfo creativeInfo, List<C537990L8b> list) throws Throwable {
        Object c098200Yq;
        if (LJJIIJZLJL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("compressNextImage: compressImageIndex=");
            sbLIZ.append(this.LJIIIZ);
            C381530Exb.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        synchronized (this) {
            try {
                int i = this.LJIIIZ + 1;
                this.LJIIIZ = i;
                if (C13LP.LJJJLZIJ(i, list) == null) {
                    if (this.LJII == this.LJIIIIZZ) {
                        C383980F3s.LIZIZ(new AwS409S0200000_8(this, c0fqs, 140));
                    }
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("compressNextImage start: indexForLog=");
                sbLIZ2.append(i);
                C381530Exb.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ2));
                C537990L8b c537990L8b = list.get(this.LJIIIZ);
                C537990L8b c537990L8b2 = c537990L8b;
                String strLJJIJIL = LJJIJIL(creativeInfo, c537990L8b2);
                if (!new C0VSJ(strLJJIJIL).exists()) {
                    try {
                        c098200Yq = C2473209mc.LIZ(C0CHQ.LIZ, c537990L8b2.LIZ, strLJJIJIL, C1450870nrJ.LIZIZ() * 2, null);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
                    if (C189200o6.m8isSuccessimpl(c189200o6M1boximpl.m10unboximpl())) {
                        c189200o6M1boximpl.m10unboximpl();
                    } else if (!C2471909mP.LIZJ(c537990L8b2.LIZ, strLJJIJIL)) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("compressNextImage Fail: indexForLog=");
                        sbLIZ3.append(i);
                        sbLIZ3.append(", CompletedCount=");
                        sbLIZ3.append(this.LJII);
                        C381530Exb.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ3));
                        C383980F3s.LIZIZ(new AwS552S0100000_8(this, 1074));
                        return;
                    }
                }
                synchronized (this) {
                    try {
                        this.LJII++;
                        this.LJIIJJI.LIZ(c537990L8b.LIZ, strLJJIJIL);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("compressNextImage Success: indexForLog=");
                        sbLIZ4.append(i);
                        sbLIZ4.append(", CompletedCount=");
                        sbLIZ4.append(this.LJII);
                        sbLIZ4.append(", destPath=");
                        sbLIZ4.append(strLJJIJIL);
                        C381530Exb.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ4));
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
                C383980F3s.LIZIZ(new AwS552S0100000_8(this, 1073));
                LJJIJIIJI(c0fqs, creativeInfo, list);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    public final void LJJIJIIJIL(C0FQS c0fqs, CreativeInfo creativeInfo, List<C537990L8b> list, int i) throws Throwable {
        if (LJJIIJZLJL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("compressNextVideo: index=");
            sbLIZ.append(i);
            C381530Exb.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C259800zU c259800zU = new C259800zU();
        synchronized (this) {
            try {
                if (C13LP.LJJJLZIJ(i, list) == null) {
                    if (this.LJII == this.LJIIIIZZ) {
                        C383980F3s.LIZIZ(new AwS409S0200000_8(this, c0fqs, 141));
                    }
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("compressNextVideo start: index=");
                sbLIZ2.append(i);
                C381530Exb.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ2));
                ?? r0 = list.get(i);
                c259800zU.element = r0;
                final String strLJJIJIL = LJJIJIL(creativeInfo, (C537990L8b) r0);
                final C537990L8b c537990L8b = (C537990L8b) c259800zU.element;
                String strLJJIJL = LJJIJL(creativeInfo);
                final C538040L8g c538040L8g = new C538040L8g(this, c0fqs, creativeInfo, list, i, c259800zU, strLJJIJIL);
                final AwS116S0101000_8 awS116S0101000_8 = new AwS116S0101000_8(this, i, 11);
                if (new C0VSJ(strLJJIJIL).exists()) {
                    c538040L8g.invoke(strLJJIJIL);
                    return;
                }
                C539510LDx c539510LDx = C539510LDx.LIZ;
                Application application = C0CHQ.LIZ;
                String str = c537990L8b.LIZ;
                InterfaceC352560Dry interfaceC352560Dry = new InterfaceC352560Dry() { // from class: X.0L8a
                    @Override // X.InterfaceC352560Dry
                    public final void LIZJ(C352570Drz c352570Drz) {
                    }

                    @Override // X.InterfaceC352560Dry
                    public final void onProgress(float f) {
                    }

                    @Override // X.InterfaceC352560Dry
                    public final void LIZIZ(String str2, String str3) {
                        C2473009ma c2473009ma = C2473009ma.LIZ;
                        C0VSJ c0vsj = new C0VSJ(str3);
                        c2473009ma.getClass();
                        C2473009ma.LJIIIIZZ(c0vsj);
                    }

                    @Override // X.InterfaceC352560Dry
                    public final void LJJI(String str2, String str3) {
                        String strLJJIFFI = u.LJJIFFI(str3, "//", "/", false);
                        if (!Intrinsics.LJFF(strLJJIFFI, strLJJIJIL)) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("out path not right: finalOutPut=");
                            sbLIZ3.append(strLJJIFFI);
                            sbLIZ3.append(", destPath=");
                            sbLIZ3.append(strLJJIJIL);
                            LIZ(str2, str3, C2188811AlT.LIZIZ(sbLIZ3));
                            return;
                        }
                        C2473009ma c2473009ma = C2473009ma.LIZ;
                        Application application2 = C0CHQ.LIZ;
                        c2473009ma.getClass();
                        if (!C2473009ma.LJFF(application2, strLJJIFFI)) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("out path not exist: OutPut=");
                            sbLIZ4.append(strLJJIFFI);
                            LIZ(str2, str3, C2188811AlT.LIZIZ(sbLIZ4));
                            return;
                        }
                        c538040L8g.invoke(strLJJIJIL);
                    }

                    @Override // X.InterfaceC352560Dry
                    public final void LIZ(String str2, String str3, String str4) {
                        C2473009ma c2473009ma = C2473009ma.LIZ;
                        C0VSJ c0vsj = new C0VSJ(str3);
                        c2473009ma.getClass();
                        C2473009ma.LJIIIIZZ(c0vsj);
                        if (C2471909mP.LIZJ(c537990L8b.LIZ, strLJJIJIL)) {
                            LJJI(str2, strLJJIJIL);
                        } else {
                            awS116S0101000_8.invoke(str4);
                        }
                    }
                };
                c539510LDx.getClass();
                C539510LDx.LIZLLL(application, str, 1920, 1920, interfaceC352560Dry, strLJJIJIL, strLJJIJL, null, null, null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

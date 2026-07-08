package X;

import android.content.Context;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: renamed from: X.0k2X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304070k2X {
    public final C1524970pmp LIZ;
    public final Vector<InterfaceC1304080k2Y> LIZIZ = new Vector<>();
    public final C1303970k2N LIZJ;

    public final void LIZ() {
        this.LIZIZ.clear();
        this.LIZIZ.add(new C2219881BuU(this.LIZ));
        this.LIZIZ.add(new C2220081Buo(this.LIZ));
        Vector<InterfaceC1304080k2Y> vector = this.LIZIZ;
        final C1524970pmp c1524970pmp = this.LIZ;
        vector.add(new AbstractC1304120k2c(c1524970pmp) { // from class: X.1Bva
            public final C1524970pmp LIZ;
            public final InterfaceC2220701Bvo LIZIZ;

            @Override // X.InterfaceC1304080k2Y
            public final void onExit() {
            }

            @Override // X.InterfaceC1304080k2Y
            public final void onStart() {
                this.LIZ.LIZ();
                C21346018gE c21346018gE = this.LIZ.LIZJ;
                C2220331BvD c2220331BvD = new C2220331BvD(new C2220391BvJ(this.LIZIZ, c21346018gE));
                c21346018gE.LJIILIIL(new C1304430k37("readFile", new C2220521BvW(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("readFileArrayBuffer", new C2220881Bw6(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("access", new C2220821Bw0(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("getSavedFileList", new C2221031BwL(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("removeSavedFile", new C2220721Bvq(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("saveFile", new C2220771Bvv(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("copyFile", new C2221001BwI(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("rename", new C2220791Bvx(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("rmdir", new C2220951BwD(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("unlink", new C2220861Bw4(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("truncate", new C2220751Bvt(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("readZipEntry", new C2220961BwE(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("readCompressedFile", new C2220601Bve(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("unzip", new C2221011BwJ(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("appendFile", new C2220611Bvf(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("writeFile", new C2220471BvR(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("stat", new C2220631Bvh(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("fstat", new C2220981BwG(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("getFileInfo", new C2220711Bvp(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("ftruncate", new C2220741Bvs(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("open", new C2220371BvH(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("read", new C2220431BvN(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("close", new C2220451BvP(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("mkdir", new C2220871Bw5(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("readDir", new C2220891Bw7(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("readdir", new C2220901Bw8(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("write", new C2220361BvG(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("decompress", new C2220671Bvl(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("readFileSync", new C2220491BvT(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("readFileArrayBufferSync", new C2220811Bvz(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("accessSync", new C2220801Bvy(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("mkdirSync", new C2220851Bw3(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("saveFileSync", new C2220761Bvu(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("copyFileSync", new C2220991BwH(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("renameSync", new C2220781Bvw(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("rmdirSync", new C2220911Bw9(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("unlinkSync", new C2220841Bw2(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("truncateSync", new C2220641Bvi(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("readZipEntrySync", new C2220941BwC(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("readCompressedFileSync", new C2220581Bvc(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("appendFileSync", new C2220551BvZ(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("writeFileSync", new C2220481BvS(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("statSync", new C2220621Bvg(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("fstatSync", new C2220971BwF(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("getFileInfoSync", new C2220691Bvn(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("ftruncateSync", new C2220731Bvr(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("openSync", new C2220341BvE(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("readSync", new C2220411BvL(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("closeSync", new C2220461BvQ(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("readDirSync", new C2220831Bw1(c2220331BvD), c2220331BvD));
                c21346018gE.LJIILIIL(new C1304430k37("readdirSync", new C2220401BvK(c2220331BvD), c2220331BvD));
                c21346018gE.LIZIZ.put("writeSync", new C1304140k2e("writeSync", new C2220351BvF(c2220331BvD), null));
                c21346018gE.LJIILIIL(new C1304430k37("decompressSync", new C2220661Bvk(c2220331BvD), c2220331BvD));
                c21346018gE.LJLJI(null, "writeFileBuffer", new C2220541BvY(c2220331BvD));
                c21346018gE.LJLJI(null, "writeFileBufferSync", new C2220501BvU(c2220331BvD));
                c21346018gE.LJLJI(null, "readFileBuffer", new C2220531BvX(c2220331BvD));
                c21346018gE.LJLJI(null, "readFileBufferSync", new C2220511BvV(c2220331BvD));
                c21346018gE.LJLJI(null, "decompressBuffer", new C2220681Bvm(c2220331BvD));
                c21346018gE.LJLJI(null, "decompressBufferSync", new C2220651Bvj(c2220331BvD));
                c21346018gE.LJLJI(null, "readCompressedFile", new C2220591Bvd(c2220331BvD));
                c21346018gE.LJLJI(null, "readCompressedFileSync", new C2220571Bvb(c2220331BvD));
                c21346018gE.LJLJI(null, "readZipEntry", new C2220931BwB(c2220331BvD));
                c21346018gE.LJLJI(null, "readZipEntrySync", new C2220921BwA(c2220331BvD));
            }

            {
                this.LIZ = c1524970pmp;
                this.LIZIZ = c1524970pmp.LIZIZ;
            }
        });
        Vector<InterfaceC1304080k2Y> vector2 = this.LIZIZ;
        final C1524970pmp c1524970pmp2 = this.LIZ;
        vector2.add(new AbstractC1304120k2c(c1524970pmp2) { // from class: X.0pml
            public final C1524970pmp LIZ;
            public final C1524360plq LIZIZ;
            public final C1524470pm1 LIZJ;
            public final C1525170pn9 LIZLLL;
            public final C1525160pn8 LJ;
            public final C1522950pjZ LJFF;
            public final C1524780pmW LJI;
            public final C09U3 LJII;
            public final C1524940pmm LJIIIIZZ;

            @Override // X.InterfaceC1304080k2Y
            public final void onExit() {
            }

            @Override // X.InterfaceC1304080k2Y
            public final void onStart() {
                Context contextLIZ = this.LIZ.LIZ();
                C1524970pmp c1524970pmp3 = this.LIZ;
                C21346018gE c21346018gE = c1524970pmp3.LIZJ;
                C1525170pn9 c1525170pn9 = this.LIZLLL;
                c1525170pn9.LIZ = new C1525060pmy(this.LIZIZ, c21346018gE, c1524970pmp3.LIZ);
                c21346018gE.LJIILIIL(new C1304430k37("request", new C1524830pmb(c1525170pn9), c1525170pn9));
                c21346018gE.LJIILIIL(new C1304430k37("operateRequest", new C1524860pme(c1525170pn9), c1525170pn9));
                C1525160pn8 c1525160pn8 = this.LJ;
                c1525160pn8.LIZ = new C1525040pmw(this.LIZJ, c21346018gE, this.LIZ.LIZ);
                c21346018gE.LJIILIIL(new C1304430k37("downloadFile", new C1524810pmZ(c1525160pn8), c1525160pn8));
                c21346018gE.LJIILIIL(new C1304430k37("operateDownload", new C1524840pmc(c1525160pn8), c1525160pn8));
                C1524780pmW c1524780pmW = this.LJI;
                c1524780pmW.LIZ = new C1525050pmx(this.LJFF, c21346018gE, this.LIZ.LIZ);
                c21346018gE.LJIILIIL(new C1304430k37("connectSocket", new C1524820pma(c1524780pmW), c1524780pmW));
                c21346018gE.LJIILIIL(new C1304430k37("operateSocketTask", new C1524910pmj(c1524780pmW), c1524780pmW));
                c21346018gE.LJIILIIL(new C1304430k37("SocketTask.send", new C1524920pmk(c1524780pmW), c1524780pmW));
                c21346018gE.LJIILIIL(new C1304430k37("SocketTask.close", new C1524980pmq(c1524780pmW), c1524780pmW));
                C1524940pmm c1524940pmm = this.LJIIIIZZ;
                C09U3 c09u3 = this.LJII;
                c1524940pmm.LIZ = new C1525020pmu(contextLIZ, c09u3, c21346018gE, this.LIZ.LIZ);
                c09u3.LJI = c1524940pmm.LIZJ;
                c1524940pmm.LIZIZ = new C1525000pms(c09u3, c1524940pmm.LIZJ);
                c21346018gE.LJIILIIL(new C1304430k37("createUDPSocket", new C1524960pmo(c1524940pmm), c1524940pmm));
                c21346018gE.LJIILIIL(new C1304430k37("operateUDPSocket", new C1524950pmn(c1524940pmm), c1524940pmm));
            }

            {
                this.LIZ = c1524970pmp2;
                c1524970pmp2.LIZ();
                this.LIZIZ = c1524970pmp2.LIZLLL;
                this.LIZJ = c1524970pmp2.LJ;
                this.LIZLLL = new C1525170pn9();
                this.LJ = new C1525160pn8();
                this.LJFF = c1524970pmp2.LJI;
                this.LJI = new C1524780pmW();
                this.LJII = c1524970pmp2.LJII;
                this.LJIIIIZZ = new C1524940pmm();
            }
        });
        this.LIZIZ.add(new C1848940yDM(this.LIZ));
        Vector<InterfaceC1304080k2Y> vector3 = this.LIZIZ;
        final C1524970pmp c1524970pmp3 = this.LIZ;
        vector3.add(new AbstractC1304120k2c(c1524970pmp3) { // from class: X.0k39
            public final C1304480k3C LIZ;

            @Override // X.InterfaceC1304080k2Y
            public final void onExit() {
            }

            @Override // X.InterfaceC1304080k2Y
            public final void onStart() {
                C1304480k3C c1304480k3C = this.LIZ;
                C21346018gE c21346018gE = c1304480k3C.LIZ.LIZJ;
                c21346018gE.LIZIZ.put("triggerGC", new C1304430k37("triggerGC", new C1304440k38(c1304480k3C), c1304480k3C));
                c21346018gE.LIZIZ.put("reportPerformance", new C1304430k37("reportPerformance", new C1304470k3B(c1304480k3C), c1304480k3C));
                c21346018gE.LIZIZ.put("performanceNowTime", new C1304430k37("performanceNowTime", new C1304460k3A(c1304480k3C), c1304480k3C));
            }

            {
                c1524970pmp3.LIZ();
                this.LIZ = new C1304480k3C(c1524970pmp3);
            }
        });
        this.LIZIZ.add(this.LIZJ);
        Iterator<InterfaceC1304080k2Y> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onStart();
        }
    }

    public C1304070k2X(C1524970pmp c1524970pmp) {
        this.LIZ = c1524970pmp;
        this.LIZJ = new C1303970k2N(c1524970pmp);
    }
}

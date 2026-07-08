package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.zoin.decode.DecodeProcessor;
import com.bytedance.zoin.model.AbstractModule;
import com.bytedance.zoin.model.AbstractModuleInfo;
import com.bytedance.zoin.model.LibDependency;
import com.bytedance.zoin.model.LibModuleInfo;
import com.bytedance.zoin.model.ModuleManager;
import com.bytedance.zoin.model.ZoinBuildFileInfo;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.Iterator;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.09eI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2421609eI extends AbstractModule {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public LibModuleInfo LIZLLL;
    public LibModuleInfo LJ;

    @Override // com.bytedance.zoin.model.AbstractModule
    public final void doWhenUpdateApk() {
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final C2421909eL install() {
        if (!this.LIZ) {
            ClassLoader classLoaderLIZ = C2421809eK.LIZ(C2421809eK.LIZ.getClassLoader());
            boolean zLIZ = C20661087n.LIZ(C2421809eK.LIZ, classLoaderLIZ, C2421709eJ.LIZIZ().getPath(), this.LIZIZ, this.LIZ);
            C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ClassloaderInject:");
            sbLIZ.append(classLoaderLIZ);
            sbLIZ.append(" invoked ");
            sbLIZ.append(zLIZ);
            c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            if (!zLIZ) {
                return new C2421909eL(8, new C2418409dm("cant inception classloader"));
            }
        }
        return C2421909eL.LIZJ;
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final boolean isDecoded() {
        String strLIZLLL = C2421809eK.LIZLLL(this.moduleName, "key.lib.decode.finished");
        boolean z = C2418109dj.LIZLLL().LJ().getBoolean(strLIZLLL, false);
        C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getBoolean ");
        sbLIZ.append(strLIZLLL);
        sbLIZ.append(" ");
        sbLIZ.append(z);
        c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final void setDecoded() {
        C2421809eK.LJ(C2421809eK.LIZLLL(this.moduleName, "key.lib.decode.finished"), true);
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final void setNotDecoded() {
        C2421809eK.LJ(C2421809eK.LIZLLL(this.moduleName, "key.lib.decode.finished"), false);
    }

    public C2421609eI() {
        this.LIZIZ = true;
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final boolean checkDecompressedFiles() {
        if (C2418609do.LIZIZ(C2421709eJ.LIZIZ(), this.LJ.curAbiInfo.libFileInfoList)) {
            C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.moduleName);
            sbLIZ.append(" DecompressedFilesPrepared");
            c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            setDecoded();
            return true;
        }
        C2418109dj c2418109djLIZLLL2 = C2418109dj.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.moduleName);
        sbLIZ2.append(" DecompressedFilesChanged");
        c2418109djLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
        setNotDecoded();
        return false;
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final void init() {
        super.init();
        for (ZoinBuildFileInfo zoinBuildFileInfo : this.LIZLLL.curAbiInfo.libFileInfoList) {
            File fileLIZIZ = C2421709eJ.LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(zoinBuildFileInfo.name);
            sbLIZ.append(".temp");
            zoinBuildFileInfo.decompressPath = new C0VSJ(fileLIZIZ, C2188811AlT.LIZIZ(sbLIZ)).getPath();
        }
        if (!C2421709eJ.LIZ && !isDecoded()) {
            Iterator<ZoinBuildFileInfo> it2 = this.LIZLLL.curAbiInfo.libFileInfoList.iterator();
            while (it2.hasNext()) {
                ZoinBuildFileInfo next = it2.next();
                long jLIZ = C2418609do.LIZ(new C0VSJ(C2421709eJ.LIZIZ(), next.name));
                if (jLIZ == next.checkNumber) {
                    C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Ignore ");
                    sbLIZ2.append(next);
                    c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                    it2.remove();
                } else {
                    C2418109dj c2418109djLIZLLL2 = C2418109dj.LIZLLL();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("StillNeedDecompress ");
                    sbLIZ3.append(next);
                    sbLIZ3.append(" ");
                    sbLIZ3.append(jLIZ);
                    c2418109djLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }
        if (this.LIZJ) {
            if (isDecoded()) {
                this.moduleInited = true;
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int iPreFallocate = preFallocate(this.LIZLLL.curAbiInfo.libFileInfoList);
                C2418109dj c2418109djLIZLLL3 = C2418109dj.LIZLLL();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("zoin fallocate use ");
                sbLIZ4.append(System.currentTimeMillis() - jCurrentTimeMillis);
                sbLIZ4.append(" ms ");
                sbLIZ4.append(iPreFallocate);
                c2418109djLIZLLL3.LJFF(C2188811AlT.LIZIZ(sbLIZ4));
                if (iPreFallocate == 0) {
                    this.preFallocate = true;
                    this.moduleInited = true;
                } else {
                    this.moduleInited = false;
                    HashMap map = new HashMap();
                    map.put("fallocate_code", Integer.valueOf(iPreFallocate));
                    map.put("key_module_name", this.moduleName);
                    C2418109dj.LIZLLL().LJI(this.moduleName, map);
                }
            }
            if (!this.moduleInited) {
                return;
            }
        } else {
            this.moduleInited = true;
        }
        if (this.LIZ) {
            boolean zLIZ = C20661087n.LIZ(C2421809eK.LIZ, C2421809eK.LIZ(C2421809eK.LIZ.getClassLoader()), C2421709eJ.LIZIZ().getPath(), this.LIZIZ, this.LIZ);
            C2418109dj c2418109djLIZLLL4 = C2418109dj.LIZLLL();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("InjectClassload:invoked ");
            sbLIZ5.append(zLIZ);
            c2418109djLIZLLL4.LJFF(C2188811AlT.LIZIZ(sbLIZ5));
            ModuleManager.setDependencyList(this.LIZLLL.curAbiInfo.libDependencyList);
        }
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final void reset() {
        super.reset();
    }

    public C2421609eI(String str) {
        this.LIZIZ = true;
        this.moduleName = str;
        this.LIZ = true;
        this.LIZIZ = true;
        this.LIZJ = false;
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final C2421909eL decode(boolean z) throws IOException {
        if (!this.moduleInited) {
            return new C2421909eL(6, new C2418409dm("prefallocate failed, no disk space"));
        }
        C2421709eJ.LJ();
        File fileLIZIZ = C2421709eJ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.moduleName);
        sbLIZ.append(e3.d);
        sbLIZ.append("zoin.lib.lk");
        C0VSJ c0vsj = new C0VSJ(fileLIZIZ, C2188811AlT.LIZIZ(sbLIZ));
        C2422009eM c2422009eM = new C2422009eM(c0vsj);
        C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
        if (!c0vsj.exists()) {
            File parentFile = c0vsj.getParentFile();
            C08PB.LIZIZ(parentFile);
            C2418109dj c2418109djLIZLLL2 = C2418109dj.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Ensure lock permission ");
            sbLIZ2.append(parentFile);
            c2418109djLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
            c0vsj.createNewFile();
            C2418109dj c2418109djLIZLLL3 = C2418109dj.LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Create LockFile ");
            sbLIZ3.append(c0vsj);
            c2418109djLIZLLL3.LJFF(C2188811AlT.LIZIZ(sbLIZ3));
        }
        c2422009eM.LIZ = new RandomAccessFile(c0vsj, "rw");
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("RAF ");
        sbLIZ4.append(c0vsj.getPath());
        sbLIZ4.append(" opened");
        c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ4));
        try {
            c2422009eM.LIZJ = c2422009eM.LIZ.getChannel();
            try {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Blocking on lock ");
                sbLIZ5.append(c0vsj.getCanonicalPath());
                c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ5));
                c2422009eM.LIZIZ = c2422009eM.LIZJ.lock();
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("Acquired on lock ");
                sbLIZ6.append(c0vsj.getCanonicalPath());
                c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ6));
                if (!z && C2418609do.LIZIZ(C2421709eJ.LIZIZ(), this.LIZLLL.curAbiInfo.libFileInfoList)) {
                    C2418109dj c2418109djLIZLLL4 = C2418109dj.LIZLLL();
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append(this.moduleName);
                    sbLIZ7.append("Locker DecodeSuccess");
                    c2418109djLIZLLL4.LJFF(C2188811AlT.LIZIZ(sbLIZ7));
                    setDecoded();
                    C2421709eJ.LJFF();
                    return C2421909eL.LIZJ;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                File fileLIZIZ2 = C2421709eJ.LIZIZ();
                LibModuleInfo libModuleInfo = this.LIZLLL;
                String str = libModuleInfo.algorithm;
                LibModuleInfo.AbiLibInfo abiLibInfo = libModuleInfo.curAbiInfo;
                int iDecodeAndVerify = DecodeProcessor.decodeAndVerify(fileLIZIZ2, str, abiLibInfo.libFileInfoList, abiLibInfo.blockInfoList, !this.preFallocate);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                PrintStream printStream = System.err;
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("ZOIN decode ");
                sbLIZ8.append(this.moduleName);
                sbLIZ8.append(", duration ");
                sbLIZ8.append(jCurrentTimeMillis2);
                printStream.println(C2188811AlT.LIZIZ(sbLIZ8));
                if (iDecodeAndVerify == 0) {
                    setDecoded();
                    FileLock fileLock = c2422009eM.LIZIZ;
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    C2418109dj c2418109djLIZLLL5 = C2418109dj.LIZLLL();
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("Released lock ");
                    sbLIZ9.append(c2422009eM.LIZLLL.getPath());
                    c2418109djLIZLLL5.LJFF(C2188811AlT.LIZIZ(sbLIZ9));
                    C08PB.LIZ(c2422009eM.LIZJ);
                    C08PB.LIZ(c2422009eM.LIZ);
                    C2421709eJ.LJFF();
                    return C2421909eL.LIZJ;
                }
                C2421709eJ.LJFF();
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("Lib decode failed ");
                sbLIZ10.append(iDecodeAndVerify);
                throw new C2418409dm(C2188811AlT.LIZIZ(sbLIZ10));
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C08PB.LIZ(c2422009eM.LIZJ);
                throw e2;
            }
        } catch (IOException e3) {
            TryCatchGuardChecker.doCheck(e3);
            C08PB.LIZ(c2422009eM.LIZ);
            throw e3;
        }
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final AbstractModule findByFileName(String str) {
        Iterator<LibDependency> it2 = this.LIZLLL.curAbiInfo.libDependencyList.iterator();
        while (it2.hasNext()) {
            if (it2.next().libName.equals(str)) {
                return this;
            }
        }
        return null;
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final void setModuleInfo(AbstractModuleInfo abstractModuleInfo) {
        LibModuleInfo libModuleInfo = (LibModuleInfo) abstractModuleInfo;
        this.LIZLLL = libModuleInfo;
        this.LJ = libModuleInfo;
    }
}

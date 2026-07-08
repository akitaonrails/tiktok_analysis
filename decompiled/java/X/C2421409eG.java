package X;

import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.zoin.model.AbstractModule;
import com.bytedance.zoin.model.AbstractModuleInfo;
import com.bytedance.zoin.model.ModuleManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.09eG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2421409eG {
    public static volatile boolean LIZIZ;
    public final ConcurrentHashMap<String, AbstractModule> LIZ = new ConcurrentHashMap<>();

    public final String LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        File fileLIZIZ = C2421709eJ.LIZIZ();
        sb.append("FirstLog:\n");
        C0VSJ c0vsj = new C0VSJ(fileLIZIZ, "zoin_load.log");
        if (c0vsj.exists()) {
            try {
                sb.append("LogSize:");
                sb.append(c0vsj.length());
                sb.append("\n");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C0VSP c0vsp = new C0VSP(c0vsj);
                try {
                    byte[] bArr = new byte[32768];
                    while (true) {
                        int i = c0vsp.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    C08PB.LIZ(byteArrayOutputStream);
                    C08PB.LIZ(c0vsp);
                    sb.append(new String(byteArray));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C08PB.LIZ(byteArrayOutputStream);
                    C08PB.LIZ(c0vsp);
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                sb.append("DumpFirstLogError:");
                sb.append(C2418209dk.LIZ(th2));
            }
        } else {
            sb.append("FirstLogNotExist\n");
        }
        sb.append("DecompressDir:");
        sb.append(fileLIZIZ.getAbsolutePath());
        sb.append("\n");
        Iterator<Map.Entry<String, AbstractModule>> it2 = this.LIZ.entrySet().iterator();
        while (it2.hasNext()) {
            AbstractModule value = it2.next().getValue();
            sb.append("moduleName:");
            sb.append(value.moduleName);
            sb.append(" isDecoded:");
            sb.append(value.isDecoded());
            sb.append("\nFilesCheck:");
            sb.append(value.checkDecompressedFiles());
            sb.append("\n");
        }
        sb.append("CurrentLog:\n");
        C2418109dj.LIZLLL().getClass();
        sb.append(C2418109dj.LIZJ());
        sb.append("ConstructTime:");
        sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sb.append(" ms\nConstructLength:");
        sb.append(sb.length());
        return sb.toString();
    }

    public final synchronized void LIZJ(C2421609eI c2421609eI) {
        if (!LIZIZ) {
            C2418109dj.LIZLLL().LJFF("zoin not initialize, do nothing");
            return;
        }
        AbstractModuleInfo abstractModuleInfoFindModuleByName = ModuleManager.findModuleByName(c2421609eI.moduleName);
        if (abstractModuleInfoFindModuleByName == null) {
            C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("zoin cant find module ");
            sbLIZ.append(c2421609eI.moduleName);
            sbLIZ.append(", do nothing");
            c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        c2421609eI.setModuleInfo(abstractModuleInfoFindModuleByName);
        if (this.LIZ.get(c2421609eI.moduleName) != null) {
            C2418109dj c2418109djLIZLLL2 = C2418109dj.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("zoin register ");
            sbLIZ2.append(c2421609eI.moduleName);
            sbLIZ2.append(" twice, ignored");
            c2418109djLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        this.LIZ.put(c2421609eI.moduleName, c2421609eI);
        c2421609eI.init();
        C2418109dj c2418109djLIZLLL3 = C2418109dj.LIZLLL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("RegisterModule:");
        sbLIZ3.append(c2421609eI.moduleName);
        c2418109djLIZLLL3.LJFF(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final synchronized void LIZIZ(Application application, C2418009di c2418009di) {
        if (!LIZIZ) {
            C2418109dj.LIZJ = c2418009di;
            C2421809eK.LIZ = application;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ZoinInitStart:");
            sbLIZ.append(jCurrentTimeMillis);
            c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            ModuleManager.init(application);
            C2421709eJ.LIZ(ModuleManager.getTotalLibModuleInfos());
            LIZIZ = true;
            C2418109dj c2418109djLIZLLL2 = C2418109dj.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ZoinInitEnd Status:");
            sbLIZ2.append(LIZIZ);
            sbLIZ2.append(" isFirst:");
            sbLIZ2.append(C2421709eJ.LIZ);
            sbLIZ2.append(" ");
            sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sbLIZ2.append(" ms");
            c2418109djLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}

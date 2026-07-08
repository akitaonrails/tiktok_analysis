package X;

import Y.AComparatorS53S0000000_34;
import android.app.Application;
import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.DirectoryWalker;
import org.apache.commons.io.FileUtils;

/* JADX INFO: renamed from: X.1B9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200401B9y implements InterfaceC2203751BMv {
    public static volatile C2200401B9y LJ;
    public final ArrayList<C1BA0> LIZ = new ArrayList<>();
    public final C0VSJ LIZIZ;
    public final C0VSJ LIZJ;
    public final C0VSJ LIZLLL;

    @Override // X.InterfaceC2203751BMv
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC2203751BMv
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC2203751BMv
    public final void getName() {
    }

    public static void LJII() {
        try {
            try {
                new DirectoryWalker<C1BA0>() { // from class: X.1B9z
                    @Override // org.apache.commons.io.DirectoryWalker
                    public final void handleFile(File file, int i, Collection<C1BA0> collection) throws Throwable {
                        super.handleFile(file, i, collection);
                        try {
                            long j = CastLongProtector.parseLong(file.getName());
                            String fileToString = FileUtils.readFileToString(file, Charset.forName("UTF-8"));
                            C1BA0 c1ba0 = new C1BA0();
                            c1ba0.LIZIZ = fileToString;
                            c1ba0.LIZ = j;
                            collection.add(c1ba0);
                        } catch (NumberFormatException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }.walk(LJ.LIZIZ, LJ.LIZ);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                LJIIIIZZ(e);
            }
            C2200391B9x.LIZLLL("SettingAndABRecorder", C786410Ut5.j4("loadConf from %s", new Object[]{LJ.LIZIZ.getAbsolutePath()}));
            Collections.sort(LJ.LIZ, new AComparatorS53S0000000_34(7));
            C2200391B9x.LIZLLL("SettingAndABRecorder", C786410Ut5.j4("loadConf items len %d", new Object[]{Integer.valueOf(LJ.LIZ.size())}));
        } catch (IllegalStateException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LJIIIIZZ(e2);
            LJFF(LJ.LIZIZ);
        }
    }

    @Override // X.InterfaceC2203751BMv
    public final List<C1BA1> LIZ() {
        Collections.sort(this.LIZ, new AComparatorS53S0000000_34(8));
        return this.LIZ;
    }

    public final void LJIIIZ() throws Throwable {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ.getAbsolutePath());
            sbLIZ.append("-tmp");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            FileUtils.forceMkdir(c0vsj);
            ArrayList<C1BA0> arrayList = this.LIZ;
            if (arrayList != null) {
                for (C1BA0 c1ba0 : arrayList) {
                    FileUtils.writeStringToFile(new C0VSJ(c0vsj, String.valueOf(c1ba0.LIZ)), c1ba0.LIZIZ, Charset.forName("UTF-8"));
                }
            }
            LJFF(this.LIZIZ);
            c0vsj.renameTo(this.LIZIZ);
            C786410Ut5.j4("save path: %s", new Object[]{this.LIZIZ.getAbsolutePath()});
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIIIZZ(e);
        }
    }

    @Override // X.InterfaceC2203751BMv
    public final void clearAll() {
        try {
            this.LIZ.clear();
            C0VSJ c0vsj = this.LIZIZ;
            if (c0vsj != null) {
                C2112608Pk.LJIIIIZZ(c0vsj.getAbsolutePath());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C2200401B9y(Context context) throws Throwable {
        Object obj;
        new Gson();
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = context.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Context applicationContext = null;
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(objInvoke);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error: ");
                    sbLIZ.append(e.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Application context obtained through ActivityThread: ");
                    sbLIZ2.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(th.getMessage());
                    sbLIZ3.append(":");
                    sbLIZ3.append(C08RN.LIZJ());
                    sbLIZ3.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                }
                System.out.println("Error: mInitialApplication is not an instance of Application");
                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                sbLIZ32.append(th.getMessage());
                sbLIZ32.append(":");
                sbLIZ32.append(C08RN.LIZJ());
                sbLIZ32.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ32));
            }
            file = C786450Ut9.LIZJ;
        }
        C0VSJ c0vsj = new C0VSJ(file.getAbsolutePath(), "SettingsRecorder");
        this.LIZLLL = c0vsj;
        try {
            FileUtils.forceMkdir(c0vsj);
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        this.LIZIZ = new C0VSJ(this.LIZLLL, "content");
        this.LIZJ = new C0VSJ(this.LIZLLL, "stable.json");
    }

    public static void LJFF(C0VSJ c0vsj) {
        try {
            if (c0vsj.isFile()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("delete file ");
                sbLIZ.append(c0vsj.getAbsolutePath());
                C2200391B9x.LIZLLL("SettingAndABRecorder", C2188811AlT.LIZIZ(sbLIZ));
                C2260008tK.LIZLLL(c0vsj.getAbsolutePath());
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("delete dir ");
            sbLIZ2.append(c0vsj.getAbsolutePath());
            C2200391B9x.LIZLLL("SettingAndABRecorder", C2188811AlT.LIZIZ(sbLIZ2));
            C2112608Pk.LJIIIIZZ(c0vsj.getAbsolutePath());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static C2200401B9y LJI(Context context) {
        if (LJ == null) {
            synchronized (C2200401B9y.class) {
                try {
                    if (LJ == null) {
                        LJ = new C2200401B9y(context);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(LJ.LIZIZ.getAbsolutePath());
                        sbLIZ.append("-tmp");
                        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                        if (LJ.LIZIZ.exists()) {
                            C2200391B9x.LIZLLL("SettingAndABRecorder", "load contentDir exists");
                            LJFF(c0vsj);
                            LJII();
                        } else if (c0vsj.exists()) {
                            C2200391B9x.LIZLLL("SettingAndABRecorder", "renameTo contentDir");
                            c0vsj.renameTo(LJ.LIZIZ);
                            LJII();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    public static void LJIIIIZZ(Throwable th) {
        if (C2203571BMd.LJIILLIIL.LIZIZ != null) {
            C805380Via.LJ("LaunchProtectException", C786410Ut5.j4("LaunchProtect stage: %d", new Object[]{-1}), th);
        }
    }

    @Override // X.InterfaceC2203751BMv
    public final boolean LIZLLL(C1BA1 c1ba1) throws Throwable {
        if (!(c1ba1 instanceof C1BA0)) {
            return false;
        }
        C2200391B9x.LIZLLL("SettingAndABRecorder", "begin rollBack: snapshot");
        try {
            C1BA0 c1ba0 = (C1BA0) c1ba1;
            C1BMY.LIZIZ().getClass();
            C0WT0 c0wt0 = C2203571BMd.LJIILLIIL.LIZIZ;
            System.currentTimeMillis();
            c0wt0.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZJ.getAbsolutePath());
            sbLIZ.append("-tmp");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            FileUtils.writeStringToFile(c0vsj, c1ba0.LIZIZ, Charset.forName("UTF-8"));
            LJFF(this.LIZJ);
            c0vsj.renameTo(this.LIZJ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("rollBack md5: ");
            sbLIZ2.append(C2200381B9w.LIZIZ(c1ba0.LIZIZ));
            C2188811AlT.LIZIZ(sbLIZ2);
            C2200391B9x.LIZLLL("SettingAndABRecorder", "end rollBack: snapshot");
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIIIZZ(e);
            C2200391B9x.LIZ("write stable file error", e);
            return false;
        }
    }

    @Override // X.InterfaceC2203751BMv
    public final boolean LJ(C1BA1 c1ba1) throws Throwable {
        if (this.LIZ == null || c1ba1 == null) {
            return false;
        }
        C2200391B9x.LIZLLL("SettingAndABRecorder", C786410Ut5.j4("clearSnapshot %d", new Object[]{Long.valueOf(c1ba1.LIZ)}));
        boolean zRemove = this.LIZ.remove(c1ba1);
        C2200391B9x.LIZLLL("SettingAndABRecorder", C786410Ut5.j4("clearSnapshot items count %d", new Object[]{Integer.valueOf(this.LIZ.size())}));
        if (zRemove) {
            LJIIIZ();
        }
        return zRemove;
    }
}

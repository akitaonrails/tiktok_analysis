package X;

import Y.ARunnableS83S0000000_3;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VDB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VDB {
    public static volatile Context LJFF = null;
    public static volatile C0VDB LJI = null;
    public static InterfaceC794190VDl LJII = null;
    public static InterfaceC792950V8r LJIIIIZZ = null;
    public static volatile boolean LJIIIZ = false;
    public static volatile String LJIIJ = "";
    public static String LJIIJJI;
    public final List<C0VDD> LIZIZ;
    public final ExecutorService LIZJ;
    public long LJ;
    public volatile HashMap<String, String> LIZLLL = new HashMap<>();
    public final Vector LIZ = new Vector(10);

    public static C0VDB LIZIZ() {
        if (LJI == null) {
            synchronized (C0VDB.class) {
                try {
                    if (LJI == null) {
                        if (!LJIIIZ) {
                            throw new RuntimeException("call CloudMessageManager.init() first");
                        }
                        LJI = new C0VDB();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00db, code lost:
    
        r4 = r1.getValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VDB.LIZ():void");
    }

    public C0VDB() {
        ExecutorService executorService = (ExecutorService) C0WP3.LIZ(PthreadAsyncTask.THREAD_POOL_EXECUTOR_V2);
        this.LIZJ = executorService;
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(new C0VDO() { // from class: X.0VDL
            public long LIZIZ;

            @Override // X.C0VDO
            public final String LJFF() {
                return "new_file";
            }

            @Override // X.C0VDO
            public final boolean LJI(C0VDC c0vdc) throws Throwable {
                C0VSJ c0vsjLJI;
                JSONObject jSONObject = c0vdc.LIZLLL;
                if (System.currentTimeMillis() - this.LIZIZ < 120000) {
                    C0VDZ.LIZ(0, c0vdc.LIZJ, "2分钟不重复处理文件回捞", null);
                    return false;
                }
                this.LIZIZ = System.currentTimeMillis();
                String strOptString = jSONObject.optString("rootNode");
                String strOptString2 = jSONObject.optString("relativeFilename");
                if (!strOptString2.contains("../")) {
                    if ("systemlib_so".equals(strOptString)) {
                        if (!strOptString2.endsWith(".so") && !strOptString2.endsWith(".odex") && !strOptString2.endsWith(".jar") && !strOptString2.endsWith(".vdex") && !strOptString2.endsWith(".art")) {
                            throw new C0VFS("disallow uploading files which are not with suffix of so, jar, odex, vdex, art");
                        }
                        c0vsjLJI = new C0VSJ(strOptString2);
                    } else {
                        c0vsjLJI = C2120108Sh.LJI(strOptString, strOptString2);
                        if (c0vsjLJI == null) {
                            throw new C0VFS("目录参数解析失败");
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handling file upload:");
                    sbLIZ.append(c0vsjLJI.getAbsolutePath());
                    C0VDZ.LIZ(0, c0vdc.LIZJ, C2188811AlT.LIZIZ(sbLIZ), null);
                    if (c0vsjLJI.exists()) {
                        if (c0vsjLJI.canRead()) {
                            if (c0vsjLJI.isDirectory() && C08OX.LIZLLL(c0vsjLJI) > 134217728) {
                                throw new C0VFS("回捞目录过大，禁止回捞");
                            }
                            C0VDM c0vdm = C794160VDi.LIZ;
                            File fileLIZ = c0vdm.LIZ();
                            if (fileLIZ != null) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(c0vdc.LIZJ);
                                sbLIZ2.append("_temp");
                                C0VSJ c0vsj = new C0VSJ(fileLIZ, C2188811AlT.LIZIZ(sbLIZ2));
                                if (c0vsj.exists()) {
                                    C2120108Sh.LJII(c0vsj.getAbsolutePath());
                                }
                                c0vsj.mkdirs();
                                C2120108Sh.LIZJ(new C0VSJ(c0vsj, "result.zip").getAbsolutePath(), c0vsjLJI.getAbsolutePath());
                                c0vdm.LIZIZ(c0vdc, c0vsj, jSONObject.optString("fileContentType", "unknown"));
                                return true;
                            }
                            throw new C0VFS("pending目录因拿不到context而未设置");
                        }
                        throw new C0VFS("文件或目录无可读权限");
                    }
                    throw new C0VFS("文件或目录不存在");
                }
                throw new C0VFS("it's not allowed to use the form `../` to route in path");
            }
        });
        arrayList.add(new C0VDK());
        arrayList.add(new C0VDT());
        arrayList.add(new C0VDY());
        arrayList.add(new C0VDO() { // from class: X.0VDI
            @Override // X.C0VDO
            public final String LJFF() {
                return "route";
            }

            @Override // X.C0VDO
            public final boolean LJI(C0VDC c0vdc) {
                if (TextUtils.isEmpty(new JSONObject(c0vdc.LIZ).optString("schema"))) {
                    C0VDO.LJII("路由scheme为空", c0vdc);
                    return true;
                }
                return false;
            }
        });
        arrayList.add(new C0VDF());
        arrayList.add(new C0VDV());
        arrayList.add(new C0VDO() { // from class: X.0VDN
            @Override // X.C0VDO
            public final String LJFF() {
                return "sp";
            }

            @Override // X.C0VDO
            public final synchronized boolean LJI(C0VDC c0vdc) {
                C0VDB.LIZIZ().getClass();
                C0VSJ c0vsjLIZ = C2120208Si.LIZ(C0VDB.LJFF);
                if (c0vsjLIZ == null) {
                    C0VDO.LJII("sp文件拷贝失败", c0vdc);
                    return true;
                }
                C794160VDi.LIZ.LIZIZ(c0vdc, c0vsjLIZ.getParentFile(), "default_sp_file_type");
                return true;
            }
        });
        arrayList.add(new C0VDS());
        arrayList.add(new C0VDQ());
        arrayList.add(new C0VDP());
        arrayList.add(new C0VDO() { // from class: X.0VDE
            @Override // X.C0VDO
            public final String LJFF() {
                return "abtest";
            }

            @Override // X.C0VDO
            public final boolean LJI(C0VDC c0vdc) {
                new JSONObject(c0vdc.LIZ);
                return false;
            }
        });
        arrayList.add(new C0VDO() { // from class: X.0VDG
            @Override // X.C0VDO
            public final String LJFF() {
                return "patch";
            }

            @Override // X.C0VDO
            public final boolean LJI(C0VDC c0vdc) {
                new JSONObject(c0vdc.LIZ);
                return false;
            }
        });
        arrayList.add(new C0VDO() { // from class: X.0VDH
            @Override // X.C0VDO
            public final String LJFF() {
                return "plugin";
            }

            @Override // X.C0VDO
            public final boolean LJI(C0VDC c0vdc) {
                new JSONObject(c0vdc.LIZ);
                return false;
            }
        });
        arrayList.add(new C0VDX());
        arrayList.add(new C0VDR());
        arrayList.add(new C0VDO() { // from class: X.0VDU
            @Override // X.C0VDO
            public final String LJFF() {
                return "data_clear";
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
            @Override // X.C0VDO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LJI(X.C0VDC r19) {
                /*
                    Method dump skipped, instruction units count: 428
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0VDU.LJI(X.0VDC):boolean");
            }
        });
        arrayList.add(new C0VDD() { // from class: X.0VDc
            @Override // X.C0VDD
            public final boolean LIZ(C0VDC c0vdc) {
                Enumeration enumerationElements = C0VDB.LIZIZ().LIZ.elements();
                if (enumerationElements != null) {
                    while (enumerationElements.hasMoreElements()) {
                        InterfaceC794200VDm interfaceC794200VDm = (InterfaceC794200VDm) enumerationElements.nextElement();
                        if (interfaceC794200VDm != null && interfaceC794200VDm.LIZ()) {
                            C0VDW.LIZJ(new C794080VDa(c0vdc.LIZJ, null));
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }
        });
        this.LIZIZ = Collections.unmodifiableList(arrayList);
        InterfaceC794190VDl interfaceC794190VDl = LJII;
        if (interfaceC794190VDl != null) {
            LIZJ(interfaceC794190VDl);
            LJII = null;
        }
        InterfaceC792950V8r interfaceC792950V8r = LJIIIIZZ;
        if (interfaceC792950V8r != null) {
            LIZLLL(interfaceC792950V8r);
            LJIIIIZZ = null;
        }
        executorService.execute(new ARunnableS83S0000000_3(30));
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            Context context = LJFF;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C786410Ut5.y2(context, null));
            sbLIZ2.append("/monitor");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
            if (!c0vsj.exists()) {
                c0vsj.mkdir();
            }
            sbLIZ.append(c0vsj.getAbsolutePath());
            sbLIZ.append("/dump.hprof");
            LJIIJ = C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZJ(InterfaceC794190VDl interfaceC794190VDl) {
        if (interfaceC794190VDl != null) {
            for (C0VDD c0vdd : this.LIZIZ) {
                if (c0vdd instanceof C0VDP) {
                    ((C0VDP) c0vdd).LIZIZ = interfaceC794190VDl;
                    return;
                }
            }
        }
    }

    public final void LIZLLL(InterfaceC792950V8r interfaceC792950V8r) {
        if (interfaceC792950V8r != null) {
            for (C0VDD c0vdd : this.LIZIZ) {
                if (c0vdd instanceof C0VDQ) {
                    ((C0VDQ) c0vdd).LIZIZ = interfaceC792950V8r;
                    return;
                }
            }
        }
    }
}

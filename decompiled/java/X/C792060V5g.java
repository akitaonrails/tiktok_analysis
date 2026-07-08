package X;

import Y.ARunnableS113S0100000_13;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.apm.impl.ApmAgentServiceImpl;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V5g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792060V5g {
    public static List<InterfaceC792050V5f> LIZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0V63] */
    public static C0V63 LIZ(Context context) {
        final C0V6O c0v6o = new C0V6O(context);
        synchronized (C0V6M.class) {
            if (C0V6M.LIZ) {
                return null;
            }
            C0V6M.LIZ = true;
            C0V6M.LIZ(c0v6o);
            return new Runnable() { // from class: X.0V63
                public final void LIZ() throws Throwable {
                    final C0V6N c0v6n = c0v6o;
                    C792590V7h.LIZIZ(IHttpService.class, new InterfaceC792260V6a<IHttpService>() { // from class: X.0V62
                        @Override // X.InterfaceC792260V6a
                        public final IHttpService create() {
                            getClass();
                            return C792400V6o.LJIIIIZZ;
                        }
                    });
                    C792590V7h.LIZIZ(IApmAgent.class, new InterfaceC792260V6a<IApmAgent>() { // from class: X.0V5m
                        @Override // X.InterfaceC792260V6a
                        public final IApmAgent create() {
                            getClass();
                            return new ApmAgentServiceImpl();
                        }
                    });
                    C792590V7h.LIZIZ(C0V78.class, new InterfaceC792260V6a<C0V78>() { // from class: X.0V6A
                        @Override // X.InterfaceC792260V6a
                        public final C0V78 create() {
                            getClass();
                            return new C0V77();
                        }
                    });
                    C792590V7h.LIZIZ(InterfaceC792210V5v.class, new InterfaceC792260V6a<InterfaceC792210V5v>() { // from class: X.0V5r
                        @Override // X.InterfaceC792260V6a
                        public final InterfaceC792210V5v create() {
                            getClass();
                            return new C792090V5j();
                        }
                    });
                    C792590V7h.LIZIZ(C0V6L.class, new InterfaceC792260V6a<C0V6L>() { // from class: X.0V6B
                        @Override // X.InterfaceC792260V6a
                        public final C0V6L create() {
                            getClass();
                            return new C0V7D();
                        }
                    });
                    C792590V7h.LIZIZ(InterfaceC791730V3z.class, new InterfaceC792260V6a<InterfaceC791730V3z>() { // from class: X.0V5s
                        @Override // X.InterfaceC792260V6a
                        public final InterfaceC791730V3z create() {
                            getClass();
                            return new C791710V3x();
                        }
                    });
                    C792590V7h.LIZIZ(InterfaceC792570V7f.class, new InterfaceC792260V6a<InterfaceC792570V7f>() { // from class: X.0V6C
                        @Override // X.InterfaceC792260V6a
                        public final InterfaceC792570V7f create() {
                            getClass();
                            return new C0V74();
                        }
                    });
                    C792590V7h.LIZIZ(C0V7R.class, new InterfaceC792260V6a<C0V7R>() { // from class: X.0V65
                        @Override // X.InterfaceC792260V6a
                        public final C0V7R create() {
                            return new C792680V7q();
                        }
                    });
                    C792590V7h.LIZIZ(C0V5X.class, new InterfaceC792260V6a<C0V5X>() { // from class: X.0V5n
                        @Override // X.InterfaceC792260V6a
                        public final C0V5X create() {
                            getClass();
                            return C788700Uwm.LIZ.LLILZIL;
                        }
                    });
                    C792590V7h.LIZIZ(C0V6G.class, new InterfaceC792260V6a<C0V6G>() { // from class: X.0V66
                        @Override // X.InterfaceC792260V6a
                        public final C0V6G create() {
                            getClass();
                            return new C0V6G() { // from class: X.0V67
                                @Override // X.C0V6G
                                public final String LIZ(String str, List<Pair<String, String>> list) {
                                    return C08GZ.LJFF(str, list);
                                }
                            };
                        }
                    });
                    C792590V7h.LIZIZ(InterfaceC794310VDx.class, new InterfaceC792260V6a<InterfaceC794310VDx>() { // from class: X.0V5o
                        @Override // X.InterfaceC792260V6a
                        public final InterfaceC794310VDx create() {
                            getClass();
                            return C788700Uwm.LIZ.LLJILJIL;
                        }
                    });
                    C792590V7h.LIZIZ(InterfaceC2257308st.class, new InterfaceC792260V6a<InterfaceC2257308st>() { // from class: X.0V64
                        @Override // X.InterfaceC792260V6a
                        public final InterfaceC2257308st create() {
                            return C2257208ss.LIZ();
                        }
                    });
                    C792590V7h.LIZIZ(InterfaceC793490VAt.class, new InterfaceC792260V6a<InterfaceC793490VAt>() { // from class: X.0V5l
                        @Override // X.InterfaceC792260V6a
                        public final InterfaceC793490VAt create() {
                            return new C793830VCb(C792420V6q.LJIILL());
                        }
                    });
                    C792590V7h.LIZIZ(InterfaceC793480VAs.class, new InterfaceC792260V6a<InterfaceC793480VAs>() { // from class: X.0V5u
                        @Override // X.InterfaceC792260V6a
                        public final InterfaceC793480VAs create() {
                            return new InterfaceC793480VAs() { // from class: X.09bX
                                public String LIZ;
                                public volatile boolean LIZIZ;
                                public byte[] LIZJ;
                                public long LIZLLL;
                                public String LJ;

                                @Override // X.InterfaceC793480VAs
                                public final Pair<byte[], String> LIZ() throws Throwable {
                                    if (!this.LIZIZ) {
                                        this.LIZJ = C2404609bY.LIZIZ(new C0VSJ(LIZJ(C792190V5t.LIZIZ), "monitor_dict"));
                                        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C792190V5t.LIZIZ, 0, "dict_interval");
                                        this.LIZLLL = sharedPreferencesLIZJ.getLong("dict_interval", 0L);
                                        this.LJ = sharedPreferencesLIZJ.getString("dict_version", null);
                                        this.LIZIZ = true;
                                    }
                                    byte[] bArr = this.LIZJ;
                                    if (bArr == null || System.currentTimeMillis() - this.LIZLLL > 604800000) {
                                        HashMap map = new HashMap(C792420V6q.LJIIJJI());
                                        map.put("slardar_zstd_dict_type", "monitor");
                                        map.put("zstd_client_code_version", "dynamic");
                                        map.put("Content-Type", "application/json; charset=utf-8");
                                        try {
                                            byte[] bytes = C786410Ut5.J3(new JSONObject(map)).getBytes();
                                            C2403609bO c2403609bODoPost = ((IHttpService) C792590V7h.LIZ(IHttpService.class)).doPost(C015O.LIZ(this.LIZ, map), bytes, map);
                                            if (c2403609bODoPost != null && c2403609bODoPost.LIZJ != null) {
                                                JSONObject jSONObject = new JSONObject(new String(c2403609bODoPost.LIZJ));
                                                String string = JSONObjectProtectorUtils.getString(jSONObject, "dict_version");
                                                String string2 = JSONObjectProtectorUtils.getString(jSONObject, "dict");
                                                if (JSONObjectProtectorUtils.getInt(jSONObject, "code") == 200) {
                                                    byte[] bArrDecode = Base64.decode(string2, 0);
                                                    LIZLLL(new C0VSJ(LIZJ(C792190V5t.LIZIZ), "monitor_dict"), bArrDecode);
                                                    this.LJ = string;
                                                    this.LIZJ = bArrDecode;
                                                    this.LIZLLL = System.currentTimeMillis();
                                                    C810670Vr7.LIZJ(C792190V5t.LIZIZ, 0, "dict_interval").edit().putLong("dict_interval", this.LIZLLL).putString("dict_version", string).commit();
                                                }
                                            }
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                        bArr = this.LIZJ;
                                    }
                                    return new Pair<>(bArr, this.LJ);
                                }

                                public static File LIZJ(Context context2) throws Throwable {
                                    File file = C786450Ut9.LIZJ;
                                    if (file != null && C786450Ut9.LJ) {
                                        return file;
                                    }
                                    try {
                                        C786450Ut9.LIZJ = context2.getFilesDir();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        Context applicationContext = null;
                                        try {
                                            Class<?> cls = Class.forName("android.app.ActivityThread");
                                            Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                                            Field declaredField = cls.getDeclaredField("mInitialApplication");
                                            declaredField.setAccessible(true);
                                            Object obj = declaredField.get(objInvoke);
                                            if (obj instanceof Application) {
                                                applicationContext = ((Application) obj).getApplicationContext();
                                                PrintStream printStream = System.out;
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("Application context obtained through ActivityThread: ");
                                                sbLIZ.append(applicationContext);
                                                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                                            } else {
                                                System.out.println("Error: mInitialApplication is not an instance of Application");
                                            }
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            PrintStream printStream2 = System.out;
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("Error: ");
                                            sbLIZ2.append(e.getMessage());
                                            printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                                        }
                                        if (applicationContext != null) {
                                            C786450Ut9.LIZJ = applicationContext.getFilesDir();
                                            C08RN.LIZ(applicationContext);
                                        } else {
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append(th.getMessage());
                                            sbLIZ3.append(":");
                                            sbLIZ3.append(C08RN.LIZJ());
                                            sbLIZ3.append(" applicationContext is null");
                                            throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                                        }
                                    }
                                    return C786450Ut9.LIZJ;
                                }

                                @Override // X.InterfaceC793480VAs
                                public final void LIZIZ(String str) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("https://");
                                    sbLIZ.append(str);
                                    sbLIZ.append("/monitor/collect/zstd_dict/");
                                    this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
                                }

                                public static void LIZLLL(C0VSJ c0vsj, byte[] bArr) throws Throwable {
                                    C0VSV c0vsv;
                                    if (bArr != null && bArr.length != 0) {
                                        c0vsj.getParentFile().mkdirs();
                                        C0VSV c0vsv2 = null;
                                        try {
                                            try {
                                                if (c0vsj.exists()) {
                                                    c0vsj.delete();
                                                }
                                                c0vsj.exists();
                                                c0vsv = new C0VSV(c0vsj);
                                            } catch (Exception e) {
                                                e = e;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                        try {
                                            c0vsv.write(bArr);
                                            c0vsv.flush();
                                            C2105408Mq.LIZIZ(c0vsv);
                                        } catch (Exception e2) {
                                            e = e2;
                                            c0vsv2 = c0vsv;
                                            TryCatchGuardChecker.doCheck(e);
                                            C2105408Mq.LIZIZ(c0vsv2);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c0vsv2 = c0vsv;
                                            TryCatchGuardChecker.doCheck(th);
                                            C2105408Mq.LIZIZ(c0vsv2);
                                            throw th;
                                        }
                                    }
                                }
                            };
                        }
                    });
                    C792590V7h.LIZIZ(InterfaceC792280V6c.class, new InterfaceC792260V6a<InterfaceC792280V6c>() { // from class: X.0V5k
                        @Override // X.InterfaceC792260V6a
                        public final InterfaceC792280V6c create() {
                            return C0V1T.LIZ;
                        }
                    });
                    new C792680V7q();
                    C792590V7h.LIZIZ(C0V7H.class, new InterfaceC792260V6a<C0V7H>() { // from class: X.0V68
                        @Override // X.InterfaceC792260V6a
                        public final C0V7H create() {
                            getClass();
                            return new C0V7E() { // from class: X.0V7G
                                @Override // X.C0V7E, X.C0V7H
                                public final C0V7P getConfig() {
                                    C0V7P c0v7p = this.LIZ;
                                    if (c0v7p != null) {
                                        c0v7p.LIZLLL = C792400V6o.LJIIZILJ;
                                        c0v7p.LIZJ = false;
                                    }
                                    return c0v7p;
                                }
                            };
                        }
                    });
                    C792590V7h.LIZIZ(InterfaceC791620V3o.class, new InterfaceC792260V6a<InterfaceC791620V3o>() { // from class: X.0V5p
                        @Override // X.InterfaceC792260V6a
                        public final InterfaceC791620V3o create() {
                            getClass();
                            return new InterfaceC791620V3o() { // from class: X.0V3d
                                @Override // X.InterfaceC791620V3o
                                public final void start() {
                                    if (C791500V3c.LIZJ || C791500V3c.LIZIZ == null) {
                                        return;
                                    }
                                    C791500V3c.LIZJ = true;
                                }
                            };
                        }
                    });
                    C792590V7h.LIZIZ(InterfaceC2166408eE.class, new InterfaceC792260V6a<InterfaceC2166408eE>() { // from class: X.0V69
                        @Override // X.InterfaceC792260V6a
                        public final InterfaceC2166408eE create() {
                            getClass();
                            return new InterfaceC2166408eE() { // from class: X.08eD
                                @Override // X.InterfaceC2166408eE
                                public final JSONObject LIZIZ() {
                                    JSONObject jSONObject = new JSONObject();
                                    C2166008eA.LIZ.LIZIZ(jSONObject);
                                    return jSONObject;
                                }
                            };
                        }
                    });
                    C792590V7h.LIZIZ(C0V76.class, new InterfaceC792260V6a<C0V76>() { // from class: X.0V6D
                        @Override // X.InterfaceC792260V6a
                        public final C0V76 create() {
                            return new C0V75();
                        }
                    });
                    C792590V7h.LIZIZ(C0V44.class, new InterfaceC792260V6a<C0V44>() { // from class: X.0V6F
                        @Override // X.InterfaceC792260V6a
                        public final C0V44 create() {
                            return C0V6H.LIZ;
                        }
                    });
                    C792590V7h.LIZIZ(InterfaceC792070V5h.class, new InterfaceC792260V6a<InterfaceC792070V5h>() { // from class: X.0V5q
                        @Override // X.InterfaceC792260V6a
                        public final InterfaceC792070V5h create() {
                            getClass();
                            return new InterfaceC792070V5h() { // from class: X.0V5e
                                @Override // X.InterfaceC792070V5h
                                public final void LIZJ(JSONObject jSONObject) {
                                    if (!C792400V6o.LJIIIZ()) {
                                        return;
                                    }
                                    C787900UvU.LIZ.LIZJ(new ARunnableS113S0100000_13(jSONObject, 297));
                                }
                            };
                        }
                    });
                    C792590V7h.LIZIZ(C0V7B.class, new InterfaceC792260V6a<C0V7B>() { // from class: X.0V6E
                        @Override // X.InterfaceC792260V6a
                        public final C0V7B create() {
                            return new C0V79();
                        }
                    });
                    C0V70.LIZ().LIZIZ();
                    C792490V6x c792490V6xLIZ = C792490V6x.LIZ(EnumC792970V8t.LIGHT_WEIGHT);
                    c0v6n.getClass();
                    c792490V6xLIZ.LIZJ(new AbstractRunnableC792500V6y() { // from class: X.0V7I
                        /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
                        /* JADX WARN: Type inference failed for: r0v1, types: [X.0V7S] */
                        /* JADX WARN: Type inference failed for: r0v19, types: [X.0V7N] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public static void LIZ() {
                            /*
                                Method dump skipped, instruction units count: 298
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C0V7I.LIZ():void");
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("Apm@8f2f.initWithOtherThread$16");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("Apm@8f2f.initWithOtherThread$16");
                        }
                    });
                    C0VB3 c0vb3 = C0VB3.LJ;
                    C0V6K c0v6k = new C0V6K() { // from class: X.0V6J
                    };
                    synchronized (c0vb3) {
                        c0vb3.LIZIZ = c0v6k;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("Apm@8f2f.initWithAsync$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("Apm@8f2f.initWithAsync$1");
                }
            };
        }
    }
}

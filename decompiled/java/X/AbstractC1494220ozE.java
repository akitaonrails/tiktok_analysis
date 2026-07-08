package X;

import android.content.Context;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ozE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1494220ozE implements InterfaceC1494830p0D, InterfaceC1339100kx2, InterfaceC1494260ozI {
    public static volatile boolean LLILZIL = true;
    public static volatile boolean LLILZLL = false;
    public Request LL;
    public C1494600ozq LLILLJJLI = C1494600ozq.LJJJJZ.create();
    public final boolean LLILLL;
    public volatile boolean LLILZ;

    public Request LIZJ(Request request, C1494600ozq c1494600ozq) {
        return request;
    }

    public boolean LIZLLL() {
        return false;
    }

    public void LJ(Exception exc) {
    }

    public abstract void LJIIIIZZ(C1494570ozn c1494570ozn);

    public abstract Context LJIIJ();

    public int LJIIJJI(IOException iOException) {
        return -1;
    }

    public void LJIILIIL() {
    }

    public void LJIILL(Exception exc) {
    }

    public void LJIILLIIL(TypedInput typedInput) {
    }

    public abstract void LJIIZILJ(String str, Request request, C1494600ozq c1494600ozq, Map<String, String> map);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff A[Catch: all -> 0x012c, TRY_ENTER, TryCatch #7 {all -> 0x012c, blocks: (B:53:0x00ff, B:55:0x0106, B:57:0x0111, B:58:0x0112, B:60:0x0116, B:62:0x0122, B:63:0x0123, B:64:0x012a, B:65:0x012b), top: B:95:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012b A[Catch: all -> 0x012c, TRY_LEAVE, TryCatch #7 {all -> 0x012c, blocks: (B:53:0x00ff, B:55:0x0106, B:57:0x0111, B:58:0x0112, B:60:0x0116, B:62:0x0122, B:63:0x0123, B:64:0x012a, B:65:0x012b), top: B:95:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.0ozq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [long] */
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
    @Override // X.InterfaceC1494830p0D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C2175508fh execute() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1494220ozE.execute():X.08fh");
    }

    public final void LJFF() throws C1494450ozb {
        if (LIZLLL() || LJIIJ() == null) {
            return;
        }
        LJIIJ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("network not available for ");
        sbLIZ.append(this.LL.getPath());
        C1494450ozb c1494450ozb = new C1494450ozb(C2188811AlT.LIZIZ(sbLIZ));
        c1494450ozb.setInfo(false, false, this.LL.getUrl(), "", this.LLILLJJLI);
        throw c1494450ozb;
    }

    @Override // X.InterfaceC1339100kx2
    public final Object getRequestInfo() {
        return this.LLILLJJLI;
    }

    public AbstractC1494220ozE(Request request) {
        this.LL = request;
        if (request.getMetrics() != null) {
            this.LLILLJJLI.LJIILIIL(request.getMetrics());
        }
        C1494570ozn c1494570ozn = this.LLILLJJLI.LIZLLL;
        c1494570ozn.getClass();
        c1494570ozn.LJLJI = new C1494650ozv();
        this.LLILLJJLI.LIZLLL.LJLILLLLZI.LIZ.LIZJ = C1497080p3q.LJ().LJIILIIL;
        this.LLILLJJLI.LIZLLL.LJLILLLLZI.LIZ.LIZLLL = C1497080p3q.LJ().LJJIL;
        C1494600ozq c1494600ozq = this.LLILLJJLI;
        c1494600ozq.LIZLLL.LJJJZ = "4.2.243.57-tiktok";
        c1494600ozq.LJJIIZ = this.LL.isResponseStreaming();
        if (this.LL.getExtraInfo() instanceof C1494160oz8) {
            this.LLILLJJLI.LIZJ = (T) this.LL.getExtraInfo();
            T t = this.LLILLJJLI.LIZJ;
            this.LLILLL = t.LJIIL;
            List<C825090WYh> list = t.LJIJJ;
            if (list != null) {
                ArrayList arrayList = (ArrayList) list;
                if (arrayList.size() > 0 && arrayList.size() <= 3) {
                    this.LLILLJJLI.LJJJJL = new C1494110oz3(list);
                }
            }
        }
    }

    public static String LJIIIZ(Map<String, List<String>> map) {
        List<String> value;
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        if (entry != null) {
                            String key = entry.getKey();
                            if (!C2093608Ic.LJ(key) && (value = entry.getValue()) != null && !value.isEmpty()) {
                                StringBuilder sb = new StringBuilder();
                                int i = 0;
                                for (String str : value) {
                                    if (!C2093608Ic.LJ(str)) {
                                        if (i == 0) {
                                            sb.append(str);
                                        } else {
                                            sb.append("; ");
                                            sb.append(str);
                                        }
                                        i++;
                                    }
                                }
                                jSONObject.put(key, sb.toString());
                            }
                        }
                    }
                    return C786410Ut5.J3(jSONObject);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return "";
    }

    public IOException LJI(Exception exc) {
        return new IOException(exc.getMessage(), exc.getCause());
    }

    public static List<C080U> LJII(InterfaceC1494260ozI interfaceC1494260ozI, List<String> list) {
        Map<String, List<String>> mapLJJIJL = interfaceC1494260ozI.LJJIJL();
        if (mapLJJIJL == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : mapLJJIJL.entrySet()) {
            String key = entry.getKey();
            if (key != null && list != null && !list.isEmpty()) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (key.equalsIgnoreCase(it2.next())) {
                        break;
                    }
                }
            }
            Iterator<String> it3 = entry.getValue().iterator();
            while (it3.hasNext()) {
                arrayList.add(new C080U(key, it3.next()));
            }
        }
        return arrayList;
    }

    public static boolean LJIIL(Request request, InterfaceC1494260ozI interfaceC1494260ozI) {
        if (request.isResponseStreaming()) {
            if (interfaceC1494260ozI.LJJIJIL() >= 200 && interfaceC1494260ozI.LJJIJIL() < 300) {
                return true;
            }
            return false;
        }
        if (interfaceC1494260ozI.LJJIJIL() == 200) {
            return true;
        }
        return false;
    }

    public static void LJJ(Request request, C1494600ozq c1494600ozq) {
        C1494230ozF.LJIILL(c1494600ozq.LIZLLL);
        Object extraInfo = request.getExtraInfo();
        if (extraInfo != null && (extraInfo instanceof C1494160oz8) && ((C1494160oz8) extraInfo).LJIJ) {
            return;
        }
        c1494600ozq.LIZLLL.LJLJI.LIZIZ.LIZIZ();
        try {
            C1494230ozF.LJIILLIIL();
            c1494600ozq.LIZLLL.LJJJJZI();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1494600ozq.LIZLLL.LJJJJZI();
            throw th;
        }
    }

    public void LJIILJJIL(C1494600ozq c1494600ozq, InterfaceC1494260ozI interfaceC1494260ozI) {
        String baseType;
        JSONObject jSONObjectLIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1494600ozq.LJII = jCurrentTimeMillis;
        c1494600ozq.LJIIIIZZ = jCurrentTimeMillis;
        String strLIZIZ = interfaceC1494260ozI.LIZIZ();
        try {
        } catch (C1494410ozX e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C2093608Ic.LJ(strLIZIZ)) {
            baseType = "";
        } else {
            baseType = new C1494390ozV(strLIZIZ).getBaseType();
        }
        c1494600ozq.LJJIJIIJI = baseType;
        String strLJJIZ = interfaceC1494260ozI.LJJIZ("x-net-info.remoteaddr");
        if (!C2093608Ic.LJ(strLJJIZ)) {
            try {
                c1494600ozq.LJIJ = strLJJIZ;
                T t = c1494600ozq.LIZJ;
                if (t != 0) {
                    t.LIZ = strLJJIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        T t2 = c1494600ozq.LIZJ;
        if (t2 != 0) {
            t2.LIZIZ = interfaceC1494260ozI.LJJIJIL();
        }
        String strLJJIZ2 = interfaceC1494260ozI.LJJIZ("X-TT-LOGID");
        c1494600ozq.LJJIJIIJIL = strLJJIZ2;
        if (strLJJIZ2 == null) {
            c1494600ozq.LJJIJIIJIL = "";
        }
        c1494600ozq.LIZLLL.getClass();
        interfaceC1494260ozI.LJJIL();
        try {
            long j = c1494600ozq.LJJJJI;
            if (j >= 0) {
                c1494600ozq.LJJIIJZLJL.put("turing_callback", j);
            }
            long j2 = c1494600ozq.LJJJJJ;
            if (j2 >= 0) {
                c1494600ozq.LJJIIJZLJL.put("retry_for_account_cost", j2);
            }
            if (c1494600ozq.LJJJIL) {
                c1494600ozq.LJJIIJZLJL.put("turing_retry", "1");
            }
            String str = c1494600ozq.LJJJJIZL;
            if (str != null) {
                c1494600ozq.LJJIIJZLJL.put("retry_by_header", str);
            }
            C1494110oz3 c1494110oz3 = c1494600ozq.LJJJJL;
            if (c1494110oz3 != null && (jSONObjectLIZ = c1494110oz3.LIZ()) != null && jSONObjectLIZ.length() > 0) {
                c1494600ozq.LJJIIJZLJL.put("rotation_host_retry", jSONObjectLIZ);
                C1494570ozn c1494570ozn = c1494600ozq.LIZLLL;
                c1494570ozn.LJLJI.LJ.LIZ = jSONObjectLIZ;
                c1494570ozn.LJLI = jSONObjectLIZ;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.retrofit2.client.Request LJIJ(com.bytedance.retrofit2.client.Request r9, X.C1494600ozq r10) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1494220ozE.LJIJ(com.bytedance.retrofit2.client.Request, X.0ozq):com.bytedance.retrofit2.client.Request");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIFFI(X.C1494600ozq r4, X.InterfaceC1494260ozI r5, java.lang.Exception r6) {
        /*
            java.util.Map r0 = r5.LJJIJL()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = LJIIIZ(r0)     // Catch: java.lang.Throwable -> L4e
            boolean r0 = X.C2093608Ic.LJ(r2)     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L15
            org.json.JSONObject r1 = r4.LJJIIJZLJL     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = "response-headers"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L4e
        L15:
            java.lang.String r3 = r6.getMessage()     // Catch: java.lang.Throwable -> L4e
            java.lang.Throwable r2 = r6.getCause()     // Catch: java.lang.Throwable -> L4e
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L46
            if (r2 == 0) goto L46
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L4e
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L46
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L4e
            r1.append(r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = ", cause = "
            r1.append(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L4e
            r1.append(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L4e
        L46:
            org.json.JSONObject r1 = r4.LJJIIJZLJL     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = "ex"
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> L4e
            goto L52
        L4e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L52:
            java.lang.String r0 = r4.LJIJ
            boolean r0 = X.C2093608Ic.LJ(r0)
            if (r0 == 0) goto L91
            java.lang.String r1 = r6.getMessage()     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L7c
            java.lang.String r0 = r6.getMessage()     // Catch: java.lang.Throwable -> L78
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L7c
            java.lang.String r0 = "\\|"
            java.lang.String[] r2 = r1.split(r0)     // Catch: java.lang.Throwable -> L78
            int r1 = r2.length     // Catch: java.lang.Throwable -> L78
            r0 = 2
            if (r1 < r0) goto L7c
            r0 = 0
            r1 = r2[r0]     // Catch: java.lang.Throwable -> L78
            goto L7e
        L78:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7c:
            java.lang.String r1 = ""
        L7e:
            boolean r0 = X.C2093608Ic.LJ(r1)
            if (r0 != 0) goto L91
            r4.LJIJ = r1     // Catch: java.lang.Throwable -> L8d
            T extends X.0oz8 r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L91
            r0.LIZ = r1     // Catch: java.lang.Throwable -> L8d
            return
        L8d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1494220ozE.LJJIFFI(X.0ozq, X.0ozI, java.lang.Exception):void");
    }

    public final void LJIJJLI(Request request, C1494600ozq c1494600ozq, InterfaceC1494260ozI interfaceC1494260ozI, Map<String, String> map) throws IOException {
        interfaceC1494260ozI.LJJJI();
        c1494600ozq.LJJJJLI = System.currentTimeMillis();
        LJIIZILJ(request.getUrl(), request, c1494600ozq, map);
        try {
            LJIIIIZZ(c1494600ozq.LIZLLL);
            LJIL(request, c1494600ozq, this, false, false);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            LJJI(request, LJIIJJI(e), c1494600ozq, interfaceC1494260ozI, e, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIJI(X.C1494600ozq r12, java.util.Map r13, int r14, java.io.InputStream r15, java.lang.String r16) {
        /*
            r7 = r15
            r4 = 0
            if (r7 != 0) goto L5
            return r4
        L5:
            r1 = 1
            int[] r8 = new int[r1]     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L7c
            X.0ozn r0 = r12.LIZLLL     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L7c
            r5 = 0
            java.io.InputStream r7 = X.C1495270p0v.LIZIZ(r7, r13, r5, r0)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L7c
            X.0ozn r9 = r12.LIZLLL     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L7c
            boolean r11 = r12.LIZ     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L7c
            r6 = r14
            r10 = r5
            byte[] r3 = X.C1495270p0v.LIZJ(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L7c
            X.C1495270p0v.LJI(r7)
            if (r3 == 0) goto L71
            int r0 = r3.length
            if (r0 <= 0) goto L71
            r5 = r16
            boolean r0 = X.C2093608Ic.LJ(r5)
            if (r0 != 0) goto L71
            boolean r0 = com.bytedance.common.utility.Logger.debug()
            if (r0 != 0) goto L3c
            T extends X.0oz8 r0 = r12.LIZJ
            if (r0 == 0) goto L3a
            boolean r0 = r0.LJIIJ
            if (r0 == 0) goto L3a
        L37:
            if (r1 == 0) goto L71
            goto L3c
        L3a:
            r1 = 0
            goto L37
        L3c:
            X.0ozV r2 = new X.0ozV     // Catch: java.lang.Throwable -> L6d
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "text"
            java.lang.String r0 = r2.getPrimaryType()     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L59
            java.lang.String r1 = "application/json"
            java.lang.String r0 = r2.getBaseType()     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L71
        L59:
            java.lang.String r0 = "charset"
            java.lang.String r1 = r2.getParameter(r0)     // Catch: java.lang.Throwable -> L6d
            boolean r0 = X.C2093608Ic.LJ(r1)     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L67
            java.lang.String r1 = "utf-8"
        L67:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L6d
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L6d
            return r0
        L6d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L71:
            return r4
        L72:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L7c
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7c
            X.C1495270p0v.LJI(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1494220ozE.LJIJI(X.0ozq, java.util.Map, int, java.io.InputStream, java.lang.String):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:67:0x011e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static com.bytedance.retrofit2.mime.TypedInput LJIJJ(java.lang.String r16, final com.bytedance.retrofit2.client.Request r17, final X.C1494600ozq r18, final X.InterfaceC1494260ozI r19, final X.InterfaceC1494830p0D r20) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1494220ozE.LJIJJ(java.lang.String, com.bytedance.retrofit2.client.Request, X.0ozq, X.0ozI, X.0p0D):com.bytedance.retrofit2.mime.TypedInput");
    }

    public final List<String> LJIL(Request request, C1494600ozq c1494600ozq, InterfaceC1494260ozI interfaceC1494260ozI, boolean z, boolean z2) {
        String str;
        Request requestLIZ = request;
        C1494320ozO c1494320ozOLJIILJJIL = C1494230ozF.LJIILJJIL(requestLIZ, interfaceC1494260ozI.LJJIJIL(), c1494600ozq, requestLIZ.getHeaders(), interfaceC1494260ozI.LJJIJL(), z, z2);
        ArrayList arrayList = null;
        if (c1494320ozOLJIILJJIL != null && c1494320ozOLJIILJJIL.LIZ) {
            if (c1494600ozq.LJJJJJL) {
                C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
                c0xmbNewBuilder.LIZJ(c1494320ozOLJIILJJIL.LIZLLL);
                requestLIZ = c0xmbNewBuilder.LIZ();
            } else {
                int i = c1494600ozq.LJJJJ + 1;
                c1494600ozq.LJJJJ = i;
                if (C1955507lJ.LIZ.get()) {
                    C080U firstHeader = requestLIZ.getFirstHeader("x-tt-request-tag");
                    if (firstHeader != null) {
                        str = firstHeader.LIZIZ;
                    } else {
                        str = null;
                    }
                    String strLIZ = C1955507lJ.LIZ("bdr-cnt", String.valueOf(i), str);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new C080U("x-tt-request-tag", strLIZ));
                    List<C080U> headers = requestLIZ.getHeaders();
                    if (headers != null) {
                        for (C080U c080u : headers) {
                            if (c080u != null && !"x-tt-request-tag".equalsIgnoreCase(c080u.LIZ)) {
                                arrayList2.add(c080u);
                            }
                        }
                    }
                    C0XMB c0xmbNewBuilder2 = requestLIZ.newBuilder();
                    c0xmbNewBuilder2.LIZJ = arrayList2;
                    requestLIZ = c0xmbNewBuilder2.LIZ();
                }
            }
            LJIJJLI(requestLIZ, c1494600ozq, interfaceC1494260ozI, c1494320ozOLJIILJJIL.LIZJ);
            return null;
        }
        if (!C2093608Ic.LJ(c1494600ozq.LJJJJIZL) && (c1494320ozOLJIILJJIL == null || c1494320ozOLJIILJJIL.LIZIZ)) {
            arrayList = new ArrayList();
            if (!C2093608Ic.LJ(c1494600ozq.LJJJJIZL)) {
                arrayList.add(c1494600ozq.LJJJJIZL);
            }
        }
        return arrayList;
    }

    public final void LJJI(Request request, int i, C1494600ozq c1494600ozq, InterfaceC1494260ozI interfaceC1494260ozI, IOException iOException, boolean z) throws IOException {
        C1494320ozO c1494320ozOLJIILJJIL = C1494230ozF.LJIILJJIL(request, i, c1494600ozq, request.getHeaders(), null, z, false);
        if (c1494320ozOLJIILJJIL != null && c1494320ozOLJIILJJIL.LIZ && c1494600ozq.LJJJJJL) {
            C0XMB c0xmbNewBuilder = request.newBuilder();
            c0xmbNewBuilder.LIZJ(c1494320ozOLJIILJJIL.LIZLLL);
            LJIJJLI(c0xmbNewBuilder.LIZ(), c1494600ozq, interfaceC1494260ozI, c1494320ozOLJIILJJIL.LIZJ);
            return;
        }
        throw iOException;
    }
}

package X;

import android.util.Log;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Z0P, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z0P implements InterfaceC882480Yje {
    public final InterfaceC892680Z0g LIZ;
    public final C0Z0A LIZIZ;
    public final ExecutorService LIZJ;
    public final C0Z0O LIZLLL;
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final AtomicBoolean LJFF = new AtomicBoolean(false);
    public InterfaceC892690Z0h LJI;

    @Override // X.InterfaceC882480Yje
    public final C882890YkJ LIZ() {
        return this.LIZLLL.LIZ();
    }

    @Override // X.InterfaceC882480Yje
    public final void LIZIZ(C892820Z0u c892820Z0u) throws JSONException {
        this.LJ.set(true);
        C882890YkJ c882890YkJLIZ = this.LIZLLL.LIZ();
        if (c892820Z0u != null) {
            c882890YkJLIZ.LJFF = c892820Z0u;
            c882890YkJLIZ.LJ = false;
        } else {
            c882890YkJLIZ.LJ = true;
        }
        this.LIZLLL.LJFF.LIZ(c882890YkJLIZ.LIZJ);
        LIZLLL(c882890YkJLIZ);
        InterfaceC892690Z0h interfaceC892690Z0h = this.LJI;
        if (interfaceC892690Z0h != null) {
            interfaceC892690Z0h.LIZ(c882890YkJLIZ);
        }
    }

    public final void LIZLLL(C882890YkJ c882890YkJ) throws JSONException {
        Map mapLJIIIIZZ;
        String str;
        boolean z;
        String str2;
        String name;
        C0Z0Q c0z0q = this.LIZLLL.LJFF;
        String message = null;
        if (c0z0q.LIZIZ != 1) {
            mapLJIIIIZZ = C2097608Jq.LJ();
        } else {
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            for (Object obj : (ArrayList) c0z0q.LJ) {
                int i2 = i + 1;
                if (i >= 0) {
                    C0Z0Q c0z0q2 = (C0Z0Q) obj;
                    int i3 = c0z0q2.LIZIZ;
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    str = "unknown";
                                } else {
                                    str = "post-processor";
                                }
                            } else {
                                str = "pre-processor";
                            }
                        } else {
                            str = "task";
                        }
                    } else {
                        str = "pipeline";
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i);
                    sbLIZ.append('_');
                    sbLIZ.append(c0z0q2.LIZ);
                    sbLIZ.append("[type:");
                    sbLIZ.append(str);
                    sbLIZ.append(']');
                    jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), c0z0q2.LIZLLL);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("pipeline_type", "tars_core"), new Pair("duration", String.valueOf(c0z0q.LIZLLL)), new Pair("pipeline_duration", String.valueOf(c0z0q.LIZLLL)), new Pair("subtasks_duration", C786410Ut5.J3(jSONObject)));
        }
        if (!this.LIZIZ.LJI && c882890YkJ.LJ) {
            this.LIZIZ.LJI = true;
            z = true;
        } else {
            z = false;
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair(Scene.SCENE_SERVICE, this.LIZLLL.LIZIZ);
        if (c882890YkJ.LJ) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("success", str2);
        pairArr[2] = new Pair("is_first_inference", String.valueOf(z));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        Throwable th = c882890YkJ.LJFF;
        if (th != null) {
            name = th.getClass().getName();
        } else {
            name = null;
        }
        sbLIZ2.append(name);
        sbLIZ2.append(':');
        Throwable th2 = c882890YkJ.LJFF;
        if (th2 != null) {
            message = th2.getMessage();
        }
        sbLIZ2.append(message);
        pairArr[3] = new Pair("error_description", C2188811AlT.LIZIZ(sbLIZ2));
        Map mapLJIIL = C2097608Jq.LJIIL(mapLJIIIIZZ, C2097608Jq.LJIIIIZZ(pairArr));
        Function2<? super String, ? super Map<String, String>, Unit> function2 = this.LIZIZ.LJFF;
        if (function2 != null) {
            function2.invoke("ml_scene_run", mapLJIIL);
        }
    }

    public final Object LJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws JSONException {
        InterfaceC892680Z0g interfaceC892680Z0g = this.LIZ;
        if (interfaceC892680Z0g != null) {
            if (this.LJFF.compareAndSet(false, true)) {
                Object objLIZJ = LIZJ(interfaceC892680Z0g, interfaceC1364105Vn);
                if (objLIZJ == C099R.LJFF()) {
                    return objLIZJ;
                }
            } else {
                C2286608xc.LJ(Log.i("tarsx_flow_state", "repeated start pipeline"));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027e  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC892680Z0g r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z0P.LIZJ(X.0Z0g, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC892690Z0h r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) throws org.json.JSONException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0Z0U
            if (r0 == 0) goto L22
            r5 = r8
            X.0Z0U r5 = (X.C0Z0U) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 != r2) goto L2e
            X.0YkJ r3 = r5.LL
            goto L28
        L22:
            X.0Z0U r5 = new X.0Z0U
            r5.<init>(r6, r8)
            goto L12
        L28:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L2c
            goto L92
        L2c:
            r0 = move-exception
            goto L82
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r1)
            X.0Z0O r0 = r6.LIZLLL
            X.0YkJ r3 = r0.LIZ()
            X.0Z0O r0 = r6.LIZLLL
            X.0Z0Q r1 = r0.LJFF
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.LIZIZ
            r1.LIZIZ(r0)
            r6.LJI = r7
            X.0Z0A r0 = r6.LIZIZ
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.LJ
            boolean r0 = r0.get()
            if (r0 == 0) goto L76
            X.0Z0O r0 = r6.LIZLLL
            X.0Z0Q r1 = r0.LJFF
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.LIZJ
            r1.LIZ(r0)
            X.0Z0u r2 = new X.0Z0u
            java.lang.String r1 = "tars pipeline is already release"
            java.lang.String r0 = "runtime"
            r2.<init>(r1, r0)
            r3.LJFF(r2)
            r6.LIZLLL(r3)
            X.0Z0h r0 = r6.LJI
            if (r0 == 0) goto L73
            r0.LIZ(r3)
        L73:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L76:
            r5.LL = r3     // Catch: java.lang.Throwable -> L81
            r5.LLILZ = r2     // Catch: java.lang.Throwable -> L81
            java.lang.Object r0 = r6.LJ(r5)     // Catch: java.lang.Throwable -> L81
            if (r0 != r4) goto L92
            return r4
        L81:
            r0 = move-exception
        L82:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r3.LJFF(r0)
            r6.LIZLLL(r3)
            X.0Z0h r0 = r6.LJI
            if (r0 == 0) goto L92
            r0.LIZ(r3)
        L92:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z0P.LJFF(X.0Z0h, X.05Vn):java.lang.Object");
    }

    public C0Z0P(InterfaceC892680Z0g interfaceC892680Z0g, C0Z0A c0z0a, ExecutorService executorService, C0Z0O c0z0o) {
        this.LIZ = interfaceC892680Z0g;
        this.LIZIZ = c0z0a;
        this.LIZJ = executorService;
        this.LIZLLL = c0z0o;
    }
}

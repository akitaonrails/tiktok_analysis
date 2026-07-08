package X;

import android.os.SystemClock;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tars.TarsSharedInterface;
import com.ss.android.ugc.aweme.tars.spi.ITarsStreamPipelineCreator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Z0K, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z0K implements C0Z0Y {
    public static final C054G LJI = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final String LIZ;
    public final C0Z0A LIZIZ;
    public boolean LIZJ;
    public final Throwable LIZLLL;
    public volatile C2239071CkL<C589930NBv> LJ;
    public final CopyOnWriteArrayList<C0Z0J> LJFF;

    @Override // X.C0Z0Y
    public final void release() {
        Object c098200Yq;
        try {
            C0Z0A c0z0a = this.LIZIZ;
            if (c0z0a != null) {
                C0Z0A.LJFF(c0z0a);
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        for (C0Z0J c0z0j : this.LJFF) {
            if (c0z0j.LIZJ.compareAndSet(false, true)) {
                AnonymousClass0956 anonymousClass0956 = c0z0j.LIZLLL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c0z0j.LIZ = null;
                c0z0j.LIZIZ.remove(c0z0j);
            }
        }
        this.LJFF.clear();
        TarsSharedInterface tarsSharedInterface = (TarsSharedInterface) PluggableExtentionKt.pluggableSpi$default(TarsSharedInterface.class, false, false, false, 14, null);
        if (tarsSharedInterface != null) {
            tarsSharedInterface.LIZIZ(this);
        }
    }

    @Override // X.C0Z0Y
    public final boolean LIZJ() {
        C0Z0A c0z0a = this.LIZIZ;
        if (c0z0a != null) {
            List<InterfaceC892680Z0g> listLIZJ = c0z0a.LIZJ();
            ArrayList arrayList = new ArrayList();
            for (InterfaceC892680Z0g interfaceC892680Z0g : listLIZJ) {
                if (interfaceC892680Z0g instanceof C0Z03) {
                    arrayList.add(interfaceC892680Z0g);
                }
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((C0Z03) it2.next()).LJ()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.C0Z0Y
    public final boolean LIZLLL() {
        C0Z0A c0z0a = this.LIZIZ;
        if (c0z0a != null) {
            List<InterfaceC892680Z0g> listLIZJ = c0z0a.LIZJ();
            ArrayList arrayList = new ArrayList();
            for (InterfaceC892680Z0g interfaceC892680Z0g : listLIZJ) {
                if (interfaceC892680Z0g instanceof C0Z03) {
                    arrayList.add(interfaceC892680Z0g);
                }
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((C0Z03) it2.next()).LIZLLL()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.C0Z0Y
    public final C2239071CkL<C589930NBv> LJII() {
        InterfaceC2239091CkN interfaceC2239091CkNLIZ;
        if (this.LJ != null) {
            return this.LJ;
        }
        C0Z0A c0z0a = this.LIZIZ;
        C2239071CkL<C589930NBv> c2239071CkL = null;
        if (c0z0a != null) {
            String str = this.LIZ;
            InterfaceC892680Z0g interfaceC892680Z0g = (InterfaceC892680Z0g) ((LinkedHashMap) c0z0a.LIZJ).get("start");
            if (interfaceC892680Z0g == null) {
                throw new RuntimeException("can not find start node");
            }
            ITarsStreamPipelineCreator iTarsStreamPipelineCreator = (ITarsStreamPipelineCreator) PluggableExtentionKt.pluggableSpi$default(ITarsStreamPipelineCreator.class, false, false, false, 14, null);
            if (iTarsStreamPipelineCreator == null || (interfaceC2239091CkNLIZ = iTarsStreamPipelineCreator.LIZ(interfaceC892680Z0g, c0z0a, c0z0a.LIZ, str)) == null) {
                throw new RuntimeException("ITarsStreamPipelineCreator df is not ready");
            }
            interfaceC2239091CkNLIZ.initialize();
            c2239071CkL = new C2239071CkL<>(interfaceC2239091CkNLIZ, interfaceC2239091CkNLIZ);
        }
        this.LJ = c2239071CkL;
        return c2239071CkL;
    }

    @Override // X.C0Z0Y
    public final String getScene() {
        return this.LIZ;
    }

    @Override // X.C0Z0Y
    public final void LIZ(InterfaceC882520Yji interfaceC882520Yji) {
        Object c098200Yq;
        Throwable thM5exceptionOrNullimpl;
        C0Z0A c0z0a;
        if (!this.LIZJ) {
            if (interfaceC882520Yji != null) {
                interfaceC882520Yji.LIZ(new C892820Z0u("pipeline build failed", this.LIZLLL));
                return;
            }
            return;
        }
        try {
            c0z0a = this.LIZIZ;
            c098200Yq = null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (c0z0a != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(new C2232408os(c0z0a.LIZ).plus(new C914180Ztg(CoroutineExceptionHandler.LJJLIL, interfaceC882520Yji, 0))), null, null, new C0Z06(interfaceC882520Yji, c0z0a, null), 3);
        } else {
            if (interfaceC882520Yji != null) {
                interfaceC882520Yji.LIZ(new C892820Z0u("preload failed: pipeline is null", this.LIZLLL));
            }
            C189200o6.m2constructorimpl(c098200Yq);
            thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null && interfaceC882520Yji != null) {
                interfaceC882520Yji.LIZ(new C892820Z0u("preload failed", thM5exceptionOrNullimpl));
                return;
            }
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
        }
    }

    @Override // X.C0Z0Y
    public final void LJFF(InterfaceC882520Yji interfaceC882520Yji) {
        LIZIZ(interfaceC882520Yji, 0L);
    }

    @Override // X.C0Z0Y
    public final void LJI(InterfaceC882520Yji interfaceC882520Yji) {
        if (!this.LIZJ) {
            interfaceC882520Yji.LIZ(new C892820Z0u("pipeline build failed", this.LIZLLL));
            return;
        }
        C0Z0A c0z0a = this.LIZIZ;
        if (c0z0a != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(new C2232408os(c0z0a.LIZ)), null, null, new C892610Yzz(interfaceC882520Yji, c0z0a, null), 3);
        } else {
            interfaceC882520Yji.LIZ(new C892820Z0u("preDownload failed: pipeline empty", this.LIZLLL));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC892680Z0g LJIIIZ(final com.ss.android.ugc.aweme.tars.settings.TarsConfig.TaskConfig r6, java.util.List r7) throws X.C892820Z0u {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z0K.LJIIIZ(com.ss.android.ugc.aweme.tars.settings.TarsConfig$TaskConfig, java.util.List):X.0Z0g");
    }

    @Override // X.C0Z0Y
    public final void LIZIZ(InterfaceC882520Yji interfaceC882520Yji, long j) {
        if (!this.LIZJ) {
            interfaceC882520Yji.LIZ(new C892820Z0u("pipeline build failed", this.LIZLLL));
            return;
        }
        C0Z0J c0z0j = new C0Z0J(interfaceC882520Yji, this.LJFF);
        this.LJFF.add(c0z0j);
        if (j > 0) {
            c0z0j.LIZLLL = C23250099c.LIZLLL(LJI, null, null, new C0Z0I(j, c0z0j, null), 3);
        }
        C0Z0A c0z0a = this.LIZIZ;
        if (c0z0a != null) {
            String str = this.LIZ;
            Function2<? super String, ? super Map<String, String>, Unit> function2 = c0z0a.LJFF;
            if (function2 != null) {
                function2.invoke("tars_env_observable", C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, str), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "start")));
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            C23250099c.LIZLLL(C2296808zG.LIZ(new C2232408os(c0z0a.LIZ).plus(new C0Z04(CoroutineExceptionHandler.LJJLIL, jUptimeMillis, c0z0a, str, c0z0j))), null, null, new C0Z01(c0z0a, jUptimeMillis, str, c0z0j, null), 3);
        }
    }

    @Override // X.C0Z0Y
    public final void LJIIIIZZ(Map<String, ? extends Object> map, InterfaceC892690Z0h interfaceC892690Z0h) throws JSONException {
        C882890YkJ c882890YkJ = new C882890YkJ(map);
        if (!this.LIZJ) {
            c882890YkJ.LJFF(new C892820Z0u("pipeline build failed", this.LIZLLL));
            interfaceC892690Z0h.LIZ(c882890YkJ);
            return;
        }
        C0Z0A c0z0a = this.LIZIZ;
        if (c0z0a != null) {
            String str = this.LIZ;
            C882890YkJ c882890YkJ2 = new C882890YkJ(map);
            InterfaceC892680Z0g interfaceC892680Z0g = (InterfaceC892680Z0g) ((LinkedHashMap) c0z0a.LIZJ).get("start");
            if (interfaceC892680Z0g != null) {
                ExecutorService executorService = c0z0a.LIZ;
                C0Z0O c0z0o = new C0Z0O(interfaceC892680Z0g, c882890YkJ2, str);
                C0Z0P c0z0p = new C0Z0P(interfaceC892680Z0g, c0z0a, executorService, c0z0o);
                C882890YkJ c882890YkJLIZ = c0z0o.LIZ();
                c0z0o.LJFF.LIZIZ(c882890YkJLIZ.LIZIZ);
                c0z0p.LJI = interfaceC892690Z0h;
                if (c0z0a.LJ.get()) {
                    c0z0o.LJFF.LIZ(c882890YkJLIZ.LIZJ);
                    c882890YkJLIZ.LJFF(new C892820Z0u("tars pipeline is already release", "runtime"));
                    c0z0p.LIZLLL(c882890YkJLIZ);
                    InterfaceC892690Z0h interfaceC892690Z0h2 = c0z0p.LJI;
                    if (interfaceC892690Z0h2 != null) {
                        interfaceC892690Z0h2.LIZ(c882890YkJLIZ);
                        return;
                    }
                    return;
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(new C2232408os(executorService).plus(new C0Z0N(CoroutineExceptionHandler.LJJLIL, c882890YkJLIZ, c0z0p))), null, null, new C0Z0M(c0z0p, c882890YkJLIZ, interfaceC892690Z0h, null), 3);
                return;
            }
            throw new RuntimeException("can not find start node");
        }
        c882890YkJ.LJFF(new C892820Z0u("pipeline error", this.LIZLLL));
        interfaceC892690Z0h.LIZ(c882890YkJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0YhP, X.0Z0h] */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.0Z0h] */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.0Z0h] */
    @Override // X.C0Z0Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.util.List r9, X.C881090YhP r10, X.InterfaceC1364105Vn r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C0Z0T
            if (r0 == 0) goto L24
            r5 = r11
            X.0Z0T r5 = (X.C0Z0T) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r1 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r6 = 1
            if (r0 == 0) goto L37
            if (r0 != r6) goto L2f
            X.0YkJ r3 = r5.LLILLJJLI
            X.0Z0h r10 = r5.LL
            goto L2a
        L24:
            X.0Z0T r5 = new X.0Z0T
            r5.<init>(r8, r11)
            goto L12
        L2a:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> La8
            goto Lb2
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            X.C155000ia.LIZIZ(r1)
            X.0YkJ r3 = new X.0YkJ
            java.lang.Object r0 = X.C13LP.LJJJLL(r9)
            java.util.Map r0 = (java.util.Map) r0
            r3.<init>(r0)
            boolean r0 = r8.LIZJ
            if (r0 != 0) goto L5b
            X.0Z0u r2 = new X.0Z0u
            java.lang.String r1 = "pipeline build failed"
            java.lang.Throwable r0 = r8.LIZLLL
            r2.<init>(r1, r0)
            r3.LJFF(r2)
            r10.LIZ(r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5b:
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r9, r0)
            r7.<init>(r0)
            java.util.Iterator r2 = r9.iterator()
        L6a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r1 = r2.next()
            java.util.Map r1 = (java.util.Map) r1
            X.0YkJ r0 = new X.0YkJ
            r0.<init>(r1)
            r7.add(r0)
            goto L6a
        L7f:
            X.0Z0A r1 = r8.LIZIZ     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L96
            java.lang.String r0 = r8.LIZ     // Catch: java.lang.Throwable -> La6
            X.0Z0P r0 = r1.LIZLLL(r0, r7)     // Catch: java.lang.Throwable -> La6
            r5.LL = r10     // Catch: java.lang.Throwable -> La6
            r5.LLILLJJLI = r3     // Catch: java.lang.Throwable -> La6
            r5.LLILZIL = r6     // Catch: java.lang.Throwable -> La6
            java.lang.Object r0 = r0.LJFF(r10, r5)     // Catch: java.lang.Throwable -> La6
            if (r0 != r4) goto Lb2
            return r4
        L96:
            X.0Z0u r2 = new X.0Z0u     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = "pipeline error"
            java.lang.Throwable r0 = r8.LIZLLL     // Catch: java.lang.Throwable -> La6
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> La6
            r3.LJFF(r2)     // Catch: java.lang.Throwable -> La6
            r10.LIZ(r3)     // Catch: java.lang.Throwable -> La6
            goto Lb2
        La6:
            r0 = move-exception
            goto La9
        La8:
            r0 = move-exception
        La9:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r3.LJFF(r0)
            r10.LIZ(r3)
        Lb2:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z0K.LJ(java.util.List, X.0YhP, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0155  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0Z0K(java.lang.String r27, com.ss.android.ugc.aweme.tars.settings.TarsConfig r28, java.util.List<? extends X.InterfaceC892680Z0g> r29, java.util.concurrent.ExecutorService r30) throws X.C892820Z0u {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z0K.<init>(java.lang.String, com.ss.android.ugc.aweme.tars.settings.TarsConfig, java.util.List, java.util.concurrent.ExecutorService):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0Z0K(java.lang.String r9, com.ss.android.ugc.aweme.tars.settings.TarsConfig r10, java.util.concurrent.ExecutorService r11, java.util.List<X.C892640Z0c> r12) {
        /*
            r8 = this;
            r4 = 0
            if (r12 == 0) goto L61
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r12, r0)
            r3.<init>(r0)
            java.util.Iterator r7 = r12.iterator()
        L12:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r5 = r7.next()
            X.0Z0c r5 = (X.C892640Z0c) r5
            java.util.List<com.ss.android.ugc.aweme.tars.settings.TarsConfig$TaskConfig> r0 = r10.pipelineConfigs
            java.util.Iterator r6 = r0.iterator()
        L24:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r2 = r6.next()
            r0 = r2
            com.ss.android.ugc.aweme.tars.settings.TarsConfig$TaskConfig r0 = (com.ss.android.ugc.aweme.tars.settings.TarsConfig.TaskConfig) r0
            java.lang.String r1 = r0.task
            java.lang.String r0 = r5.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L24
        L3b:
            com.ss.android.ugc.aweme.tars.settings.TarsConfig$TaskConfig r2 = (com.ss.android.ugc.aweme.tars.settings.TarsConfig.TaskConfig) r2
            if (r2 == 0) goto L55
            int r1 = r5.LJ
            if (r1 != 0) goto L4c
            X.0Z0S r0 = new X.0Z0S
            r0.<init>(r2)
        L48:
            r3.add(r0)
            goto L12
        L4c:
            r0 = 2
            if (r1 != r0) goto L55
            X.0Z0Z r0 = new X.0Z0Z
            r0.<init>(r2)
            goto L48
        L55:
            r0 = r4
            goto L48
        L57:
            r2 = r4
            goto L3b
        L59:
            java.util.List r0 = X.C13LP.LJJJJLI(r3)
            java.util.List r4 = X.C13LP.LLIIII(r0)
        L61:
            r8.<init>(r9, r10, r4, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z0K.<init>(java.lang.String, com.ss.android.ugc.aweme.tars.settings.TarsConfig, java.util.concurrent.ExecutorService, java.util.List):void");
    }
}

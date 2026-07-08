package X;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import android.view.ContextThemeWrapper;
import com.bytedance.otis.ultimate.inflater.internal.cache.CacheHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;

/* JADX INFO: renamed from: X.17p7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21146317p7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0T98, X.17pC] */
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
    public static final C21146817pC LIZ(Context context, C21147117pF c21147117pF) {
        C21143617og c21143617ogLIZ;
        final Context context2 = context;
        if (context2 == null) {
            context2 = C21145617p0.LIZ.LIZ;
        }
        final InterfaceC21138617ns interfaceC21138617ns = c21147117pF.LIZJ;
        final int i = c21147117pF.LIZ;
        final String str = c21147117pF.LIZIZ;
        ?? r4 = new C0T98(context2, interfaceC21138617ns, i, str) { // from class: X.17pC
            public Context LLILLJJLI;
            public InterfaceC21138617ns LLILLL;
            public Integer LLILZ;
            public String LLILZIL;

            @Override // X.C0T98
            public final void LIZ() {
                this.LLILLJJLI = null;
                this.LLILLL = null;
                this.LLILZ = null;
                this.LLILZIL = null;
            }

            @Override // X.C0T98
            public final void LIZIZ() {
                InterfaceC21138617ns interfaceC21138617ns2;
                Integer num;
                Object c098200Yq;
                final Context context3 = this.LLILLJJLI;
                if (context3 == null || (interfaceC21138617ns2 = this.LLILLL) == null || (num = this.LLILZ) == null) {
                    return;
                }
                int iIntValue = num.intValue();
                String str2 = this.LLILZIL;
                if (str2 != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        InterfaceC21146617pA interfaceC21146617pA = C21145617p0.LIZ.LIZLLL;
                        if (interfaceC21146617pA != null) {
                            interfaceC21146617pA.LIZ();
                        }
                        if (C21145417oy.LIZ(context3) == null && !(context3 instanceof ContextThemeWrapper)) {
                            final int i2 = C21145617p0.LIZ.LIZIZ;
                            if (i2 == 0) {
                                i2 = R.style.xm;
                            }
                            context3 = new ContextThemeWrapper(context3, i2) { // from class: X.09nx
                                public static final /* synthetic */ int LIZ = 0;

                                @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper
                                public final void attachBaseContext(Context context4) {
                                    if (NxRewordManager.LJIILIIL) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("attachBaseContextWrapper: ");
                                        sbLIZ.append(Log.getStackTraceString(new Throwable(context4.toString())));
                                        C2188811AlT.LIZIZ(sbLIZ);
                                        context4 = new C817700W5w(context4, false);
                                    }
                                    super.attachBaseContext(context4);
                                }
                            };
                        }
                        interfaceC21138617ns2.LIZIZ(context3);
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        InterfaceC21146617pA interfaceC21146617pA2 = C21145617p0.LIZ.LIZLLL;
                        if (interfaceC21146617pA2 != null) {
                            interfaceC21146617pA2.LJIIIZ(iIntValue, jCurrentTimeMillis2, str2);
                        }
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        C21145717p1.LJI(iIntValue, interfaceC21138617ns2);
                        InterfaceC21146617pA interfaceC21146617pA3 = C21145617p0.LIZ.LIZLLL;
                        if (interfaceC21146617pA3 != null) {
                            interfaceC21146617pA3.LJIIL(iIntValue, str2, thM5exceptionOrNullimpl);
                        }
                    }
                }
            }

            {
                this.LLILLJJLI = context2;
                this.LLILLL = interfaceC21138617ns;
                this.LLILZ = Integer.valueOf(i);
                this.LLILZIL = str;
            }
        };
        c21147117pF.LIZJ.LIZLLL(r4);
        C21145717p1 c21145717p1 = C21145717p1.LJ;
        int i2 = c21147117pF.LIZ;
        InterfaceC21138617ns interfaceC21138617ns2 = c21147117pF.LIZJ;
        C21143417oe c21143417oe = c21147117pF.LIZLLL;
        InterfaceC21143917oj interfaceC21143917ojLIZLLL = c21145717p1.LIZLLL(context2);
        ReentrantReadWriteLock.ReadLock lock = C21145717p1.LIZIZ.readLock();
        lock.lock();
        try {
            List<C21143617og> listLIZ = C21145717p1.LIZJ.LIZ(i2);
            synchronized (listLIZ) {
                try {
                    c21143617ogLIZ = C21143617og.LJIIIIZZ.LIZ(i2, context2, interfaceC21138617ns2, c21143417oe, interfaceC21143917ojLIZLLL);
                    listLIZ.add(c21143617ogLIZ);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            lock.unlock();
            CacheHandler cacheHandler = C21145717p1.LIZ;
            cacheHandler.getClass();
            long j = C21145617p0.LIZ.LJ;
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.arg1 = c21143617ogLIZ.LIZIZ;
            messageObtain.obj = c21143617ogLIZ.LIZLLL;
            cacheHandler.sendMessageDelayed(messageObtain, j);
            InterfaceC21146617pA interfaceC21146617pA = C21145617p0.LIZ.LIZLLL;
            if (interfaceC21146617pA != null) {
                c21143617ogLIZ.LIZ();
                interfaceC21146617pA.LJIIJJI();
            }
            return r4;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public static final void LIZIZ(Context context, String str, List list) {
        Runnable runnableC797830VRl;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(LIZ(context, (C21147117pF) it2.next()));
        }
        if (str == null) {
            runnableC797830VRl = new C01OY(arrayList);
        } else {
            synchronized (RunnableC797830VRl.LLILLL) {
                try {
                    Map<String, RunnableC797830VRl> map = RunnableC797830VRl.LLILZ;
                    RunnableC797830VRl runnableC797830VRl2 = (RunnableC797830VRl) ((HashMap) map).get(str);
                    if (runnableC797830VRl2 != null) {
                        ((ConcurrentLinkedQueue) runnableC797830VRl2.LL).addAll(arrayList);
                        return;
                    } else {
                        runnableC797830VRl = new RunnableC797830VRl(str, arrayList);
                        ((HashMap) map).put(str, runnableC797830VRl);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C21145617p0.LIZ.LIZJ.execute(runnableC797830VRl);
    }
}

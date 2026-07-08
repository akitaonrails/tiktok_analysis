package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.jsbridge.LynxBytecodeCallback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.TemplateBundle;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536080q4k extends AbstractC1541130qCt<C1536080q4k> {
    public static final /* synthetic */ int LJII = 0;
    public final AbstractC1536120q4o LIZLLL;
    public final Semaphore LJ;
    public volatile C1536070q4j LJFF;
    public volatile AtomicInteger LJI;

    @Override // X.AbstractC1541130qCt
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.AbstractC1541130qCt
    public final boolean LJFF(InterfaceC1541240qD4 interfaceC1541240qD4) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0q4l] */
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
    @Override // X.InterfaceC1541360qDG
    public final void execute() {
        this.LIZJ.LIZJ("cache_check");
        final C1536170q4t c1536170q4t = C1536070q4j.LJ;
        AbstractC1536120q4o abstractC1536120q4o = this.LIZLLL;
        c1536170q4t.getClass();
        try {
            C0VSJ c0vsjLIZJ = abstractC1536120q4o.LIZJ();
            if (c0vsjLIZJ.isDirectory()) {
                HashMap map = new HashMap();
                File[] fileArrListFiles = c0vsjLIZJ.listFiles();
                if (fileArrListFiles != null) {
                    for (final File file : fileArrListFiles) {
                        try {
                            map.put(file.getName(), new FutureTask(new Callable(c1536170q4t, file) { // from class: X.08Fh
                                public final /* synthetic */ File LL;

                                {
                                    this.LL = file;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    Object c098200Yq;
                                    C1C7U.LIZ("JsCodeCacheEntry$Companion@2fae.buildFromDisk$1$2$1$1$1");
                                    try {
                                        C0VSP c0vsp = new C0VSP(this.LL);
                                        try {
                                            c098200Yq = C2106208My.LIZIZ(c0vsp);
                                            C2107108Nh.LIZ(c0vsp, null);
                                            C189200o6.m2constructorimpl(c098200Yq);
                                        } catch (Throwable th) {
                                            th = th;
                                            try {
                                                TryCatchGuardChecker.doCheck(th);
                                                try {
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    while (true) {
                                                        try {
                                                            TryCatchGuardChecker.doCheck(th);
                                                            C2107108Nh.LIZ(c0vsp, th);
                                                            throw th;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                th = null;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        TryCatchGuardChecker.doCheck(th5);
                                        c098200Yq = new C098200Yq(th5);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    }
                                    Object obj = C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq;
                                    C1C7U.LIZIZ("JsCodeCacheEntry$Companion@2fae.buildFromDisk$1$2$1$1$1");
                                    return obj;
                                }
                            }));
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                }
                if (!map.isEmpty()) {
                    C1536070q4j c1536070q4j = new C1536070q4j(abstractC1536120q4o, map, null);
                    this.LIZLLL.LIZ = null;
                    LJI(c1536070q4j, null);
                    return;
                }
            } else {
                C189200o6.m2constructorimpl(null);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        AbstractC1536120q4o abstractC1536120q4o2 = this.LIZLLL;
        TemplateBundle templateBundle = abstractC1536120q4o2.LIZ;
        abstractC1536120q4o2.LIZ = null;
        if (templateBundle == 0) {
            C1536070q4j.LJ.getClass();
            LJI(new C1536070q4j(abstractC1536120q4o2, null, "no cache found"), null);
        } else {
            this.LJ.release();
            this.LIZJ.LIZJ("cache_generate");
            templateBundle.LJI(this.LIZLLL.LIZIZ(), new LynxBytecodeCallback() { // from class: X.0q4l
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0 */
                /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r3v4 */
                @Override // com.lynx.jsbridge.LynxBytecodeCallback
                public final void onResponse(String str, JavaOnlyMap javaOnlyMap) throws JSONException {
                    String strLJJLJLI;
                    final byte[] bArr;
                    ByteBuffer byteBuffer;
                    Object obj;
                    Semaphore semaphore = this.LIZ.LJ;
                    while (true) {
                        try {
                            semaphore.acquire();
                            break;
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                        }
                    }
                    this.LIZ.LIZJ.LIZJ("cache_finish");
                    ?? r3 = 0;
                    if (str != null) {
                        this.LIZ.LIZJ.LIZ();
                        JSONObject jSONObjectLIZIZ = C08AB.LIZIZ(this.LIZ.LIZJ);
                        C1536080q4k c1536080q4k = this.LIZ;
                        C1536170q4t c1536170q4t2 = C1536070q4j.LJ;
                        AbstractC1536120q4o abstractC1536120q4o3 = c1536080q4k.LIZLLL;
                        c1536170q4t2.getClass();
                        c1536080q4k.LJI(new C1536070q4j(abstractC1536120q4o3, null, str), null);
                        C1536040q4g.LIZIZ(0, 0, str, this.LIZ.LIZLLL, jSONObjectLIZIZ);
                        return;
                    }
                    if (javaOnlyMap != null && !javaOnlyMap.isEmpty()) {
                        HashMap map2 = new HashMap();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(this.LIZ.LIZLLL.LIZJ().getAbsolutePath());
                        sbLIZ.append("_tmp");
                        final C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                        c0vsj.mkdirs();
                        this.LIZ.LJI = new AtomicInteger(javaOnlyMap.size());
                        final C118300cf c118300cf = new C118300cf();
                        final C1536080q4k c1536080q4k2 = this.LIZ;
                        for (Map.Entry<String, Object> entry : javaOnlyMap.entrySet()) {
                            String key = entry.getKey();
                            String strLJJLIL = a0.LJJLIL(key, c1536080q4k2.LIZLLL.LIZIZ(), key);
                            if (u.LJJIIJZLJL(entry.getKey(), "dynamic-component/", r3)) {
                                strLJJLJLI = a0.LJJLIL(strLJJLIL, "//", strLJJLIL);
                            } else {
                                strLJJLJLI = a0.LJJLJLI(strLJJLIL, "##/", strLJJLIL);
                            }
                            final String strLJJI = u.LJJI(strLJJLJLI, '/', '#', r3);
                            Object value = entry.getValue();
                            if ((value instanceof ByteBuffer) && (byteBuffer = (ByteBuffer) value) != null) {
                                try {
                                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                                    byteBufferDuplicate.position(r3);
                                    byte[] bArr2 = new byte[byteBufferDuplicate.remaining()];
                                    byteBufferDuplicate.get(bArr2);
                                    C189200o6.m2constructorimpl(bArr2);
                                    obj = bArr2;
                                } catch (Throwable th4) {
                                    TryCatchGuardChecker.doCheck(th4);
                                    C098200Yq c098200Yq = new C098200Yq(th4);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                    obj = c098200Yq;
                                }
                                boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
                                Object obj2 = obj;
                                if (zM7isFailureimpl) {
                                    obj2 = null;
                                }
                                bArr = (byte[]) obj2;
                            } else {
                                bArr = null;
                            }
                            map2.put(strLJJI, new FutureTask(new Callable() { // from class: X.0q4n
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    C1C7U.LIZ("JsCodeCacheOperation@83ec.execute$2$onResponse$1$1");
                                    byte[] bArr3 = bArr;
                                    if (bArr3 != null) {
                                        c118300cf.element += bArr3.length;
                                        C1532960pzi.LJ(new C1536100q4m(c0vsj, strLJJI, c1536080q4k2, bArr3));
                                    } else {
                                        C1532760pzO.LIZIZ(C1536180q4u.LIZJ, "JsCodeCacheOperation", "execute", "cannot generate byte array", null, null, 48);
                                    }
                                    byte[] bArr4 = bArr;
                                    C1C7U.LIZIZ("JsCodeCacheOperation@83ec.execute$2$onResponse$1$1");
                                    return bArr4;
                                }
                            }));
                            r3 = 0;
                        }
                        C1536080q4k c1536080q4k3 = this.LIZ;
                        C1536170q4t c1536170q4t3 = C1536070q4j.LJ;
                        AbstractC1536120q4o abstractC1536120q4o4 = c1536080q4k3.LIZLLL;
                        c1536170q4t3.getClass();
                        Iterator it2 = map2.entrySet().iterator();
                        while (it2.hasNext()) {
                            ((FutureTask) ((Map.Entry) it2.next()).getValue()).run();
                        }
                        c1536080q4k3.LJI(new C1536070q4j(abstractC1536120q4o4, map2, null), null);
                        this.LIZ.LIZJ.LIZ();
                        C1536040q4g.LIZIZ(map2.size(), c118300cf.element, null, this.LIZ.LIZLLL, C08AB.LIZIZ(this.LIZ.LIZJ));
                        return;
                    }
                    this.LIZ.LIZJ.LIZ();
                    JSONObject jSONObjectLIZIZ2 = C08AB.LIZIZ(this.LIZ.LIZJ);
                    C1536080q4k c1536080q4k4 = this.LIZ;
                    C1536170q4t c1536170q4t4 = C1536070q4j.LJ;
                    AbstractC1536120q4o abstractC1536120q4o5 = c1536080q4k4.LIZLLL;
                    c1536170q4t4.getClass();
                    c1536080q4k4.LJI(new C1536070q4j(abstractC1536120q4o5, null, "generate empty buffer"), null);
                    C1536040q4g.LIZIZ(0, 0, "generate empty buffer", this.LIZ.LIZLLL, jSONObjectLIZIZ2);
                }
            });
        }
    }

    @Override // X.AbstractC1541130qCt
    public final boolean LJ(AbstractC1541130qCt abstractC1541130qCt) {
        long jLongValue;
        long jLongValue2;
        C1536080q4k c1536080q4k = (C1536080q4k) abstractC1541130qCt;
        C1536070q4j c1536070q4j = this.LJFF;
        if (c1536070q4j != null) {
            if (!c1536070q4j.isSuccess() && c1536080q4k.LIZLLL.LIZ != null) {
                return false;
            }
            c1536080q4k.LJI(c1536070q4j, EnumC1541200qD0.CACHE);
            return true;
        }
        if (!c1536080q4k.LIZ.LIZ.LIZ) {
            Semaphore semaphore = this.LJ;
            while (true) {
                try {
                    semaphore.acquire();
                    break;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            this.LJ.release();
            C1536070q4j c1536070q4j2 = this.LJFF;
            if (c1536070q4j2 != null) {
                if (!c1536070q4j2.isSuccess() && c1536080q4k.LIZLLL.LIZ != null) {
                    return false;
                }
                c1536080q4k.LJI(c1536070q4j2, EnumC1541200qD0.REQUEST);
                return true;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            C443120HZe c443120HZe = (C443120HZe) C13LP.LJJLIIIJL(this.LIZJ.LIZJ);
            if (c443120HZe != null) {
                jLongValue2 = ((Number) c443120HZe.getSecond()).longValue();
            } else {
                jLongValue2 = jCurrentTimeMillis;
            }
            if (jCurrentTimeMillis - jLongValue2 > 4000) {
                return false;
            }
            C1536170q4t c1536170q4t = C1536070q4j.LJ;
            AbstractC1536120q4o abstractC1536120q4o = this.LIZLLL;
            c1536170q4t.getClass();
            c1536080q4k.LJI(new C1536070q4j(abstractC1536120q4o, null, "still in generation"), EnumC1541200qD0.REQUEST);
            return true;
        }
        if (this.LIZ.LIZ.LIZ) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            C443120HZe c443120HZe2 = (C443120HZe) C13LP.LJJLIIIJL(this.LIZJ.LIZJ);
            if (c443120HZe2 != null) {
                jLongValue = ((Number) c443120HZe2.getSecond()).longValue();
            } else {
                jLongValue = jCurrentTimeMillis2;
            }
            if (jCurrentTimeMillis2 - jLongValue > 4000) {
                return false;
            }
            return true;
        }
        if (c1536080q4k.LIZLLL.LIZ != null) {
            return false;
        }
        return true;
    }

    public C1536080q4k(AbstractC1536120q4o abstractC1536120q4o, C1541080qCo<C1536070q4j> c1541080qCo) {
        super(c1541080qCo);
        this.LIZLLL = abstractC1536120q4o;
        this.LJ = new Semaphore(0);
    }

    public final void LJI(C1536070q4j c1536070q4j, EnumC1541200qD0 enumC1541200qD0) {
        this.LJFF = c1536070q4j;
        this.LJ.release();
        LIZLLL(c1536070q4j, enumC1541200qD0);
    }
}

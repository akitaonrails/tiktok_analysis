package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0NGO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NGO implements C0NGM {
    public final C0NGH LIZ;
    public final C0NGR LIZIZ;
    public final C0NGM LIZJ;
    public volatile boolean LJI;
    public final C054G LJIIIIZZ;
    public final C2232408os LJIIIZ;
    public final C054G LJIIJ;
    public C591100NGi LJIIJJI;
    public final C591420NHo LJIIL;
    public final AtomicReference<C0NGG> LIZLLL = new AtomicReference<>(new C0NGG(0, C13BV.INSTANCE));
    public volatile int LJ = -1;
    public List<String> LJFF = new CopyOnWriteArrayList();
    public volatile C823170WQx LJII = new C823170WQx();

    @Override // X.C0NGM
    public final void LIZ() {
        this.LJI = true;
        this.LJII = null;
        LJI();
        C23250099c.LIZLLL(this.LJIIIIZZ, null, null, new C0NGT(this, null), 3);
        C23250099c.LIZLLL(this.LJIIIIZZ, C2107308Nj.LIZ, null, new C0NGN(this, null), 2);
    }

    public static void LJ() {
        File[] fileArrListFiles;
        String name;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZJ(contextLIZ).getAbsolutePath());
        sbLIZ.append(File.separator);
        sbLIZ.append("golden_house");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        try {
            if (c0vsj.exists() && c0vsj.isDirectory() && (fileArrListFiles = c0vsj.listFiles()) != null) {
                for (File file : fileArrListFiles) {
                    if (file != null && ((name = file.getName()) == null || !a0.LJJIIZI(name, curUserId, false))) {
                        C08QA.LJIIZILJ(file);
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final int LJFF() {
        return this.LIZLLL.get().LIZIZ.size();
    }

    public final void LJI() {
        C23250099c.LIZLLL(this.LJIIJ, null, null, new C0NGW(this, null), 3);
    }

    public final CacheEntry LJII() {
        CacheEntry cacheEntry;
        loop0: while (true) {
            C0NGG c0ngg = this.LIZLLL.get();
            ArrayList arrayList = new ArrayList(c0ngg.LIZIZ);
            cacheEntry = (CacheEntry) C19719612Di.LJJIIZI(arrayList);
            AtomicReference<C0NGG> atomicReference = this.LIZLLL;
            C0NGG c0ngg2 = new C0NGG(c0ngg.LIZ + 1, arrayList);
            while (!atomicReference.compareAndSet(c0ngg, c0ngg2)) {
                if (atomicReference.get() != c0ngg) {
                    break;
                }
            }
        }
        if (cacheEntry != null) {
            Aweme aweme = cacheEntry.value;
            if (aweme != null) {
                AwemeBizExtKt.setGCacheVideoPath(aweme, cacheEntry.videoFilePath);
            }
            List<String> list = this.LJFF;
            if (list != null && cacheEntry.videoFilePath.length() > 0) {
                synchronized (list) {
                    try {
                        ((CopyOnWriteArrayList) list).add(cacheEntry.videoFilePath);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            LJI();
        }
        return cacheEntry;
    }

    public final void LJIIIIZZ() {
        C2296808zG.LIZJ(this.LJIIIIZZ, null);
        C2296808zG.LIZJ(this.LJIIJ, null);
        this.LJIIIZ.close();
        C591100NGi c591100NGi = this.LJIIJJI;
        if (c591100NGi != null) {
            C2296808zG.LIZJ((InterfaceC497601wk) c591100NGi.LJII.getValue(), null);
        }
    }

    public static File LIZJ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
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

    @Override // X.C0NGM
    public final void LIZIZ(List<? extends CacheEntry> list) {
        C23250099c.LIZLLL(this.LJIIIIZZ, null, null, new C0NGK(this, list, null), 3);
        C23250099c.LIZLLL(this.LJIIIIZZ, C2107308Nj.LIZ, null, new C0NGL(this, list, null), 2);
    }

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
    public final Unit LIZLLL(List list) {
        C823170WQx c823170WQx;
        C0S4J c0s4j = C0NH6.LJIILLIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GHouseCachePool cacheEntriesLoaded size ");
        sbLIZ.append(list.size());
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (list.isEmpty()) {
            return Unit.LIZ;
        }
        while (true) {
            C0NGG c0ngg = this.LIZLLL.get();
            ArrayList arrayList = new ArrayList(c0ngg.LIZIZ);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                CacheEntry cacheEntry = (CacheEntry) it2.next();
                if (!arrayList.contains(cacheEntry) && ((c823170WQx = this.LJII) == null || !c823170WQx.contains(cacheEntry.key))) {
                    arrayList2.add(cacheEntry);
                }
            }
            arrayList.addAll(arrayList2);
            this.LIZ.LIZ(arrayList);
            AtomicReference<C0NGG> atomicReference = this.LIZLLL;
            C0NGG c0ngg2 = new C0NGG(c0ngg.LIZ + 1, arrayList);
            while (!atomicReference.compareAndSet(c0ngg, c0ngg2)) {
                if (atomicReference.get() != c0ngg) {
                    break;
                }
            }
            return Unit.LIZ;
        }
    }

    public C0NGO(C591020NGa c591020NGa, C0NGR c0ngr, C0NGM c0ngm) {
        this.LIZ = c591020NGa;
        this.LIZIZ = c0ngr;
        this.LIZJ = c0ngm;
        CoroutineContext coroutineContextPlus = C0PEM.LIZJ.plus(C2296908zH.LIZ());
        C2185208hG c2185208hG = CoroutineExceptionHandler.LJJLIL;
        this.LJIIIIZZ = C2296808zG.LIZ(coroutineContextPlus.plus(new C0NGP(c2185208hG)));
        C2232408os c2232408os = new C2232408os(C786410Ut5.h4());
        this.LJIIIZ = c2232408os;
        this.LJIIJ = C2296808zG.LIZ(c2232408os.plus(C2296908zH.LIZ()).plus(new C0NGQ(c2185208hG)));
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZJ(contextLIZ).getAbsolutePath());
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append("golden_house");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(str);
        sbLIZ2.append(curUserId);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ2);
        sbLIZ3.append(str);
        sbLIZ3.append(c0ngr.LIZIZ);
        this.LJIIL = new C591420NHo(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ3)));
    }
}

package X;

import android.os.Looper;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.keva.KevaInfo;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC309290CAl {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LJFF;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final Set<KevaInfo> LIZLLL = new LinkedHashSet();
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final C01GW LJI = C452501pT.LIZIZ(new C309310CAn(this));

    public void LIZ() {
        this.LIZ = false;
    }

    public void LIZIZ() {
        this.LIZ = true;
    }

    public abstract String LIZJ();

    public abstract boolean LIZLLL();

    public void LJFF() {
    }

    public void LJ() {
        Object c098200Yq;
        List<KevaInfo> list;
        try {
            c098200Yq = null;
            String string = Keva.getRepo((String) this.LJI.getValue()).getString("keva_info_list", null);
            if (string != null && (list = (List) C08JS.LIZIZ().LJIIIIZZ(string, new TypeToken<List<? extends KevaInfo>>() { // from class: X.0CAo
            }.getType())) != null && (!list.isEmpty())) {
                for (KevaInfo kevaInfo : list) {
                    LJFF();
                    KevaImpl.getRepoSync(kevaInfo.repoName, kevaInfo.mode);
                }
                c098200Yq = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m8isSuccessimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public void LJII() {
        Object c098200Yq;
        try {
            c098200Yq = C13LP.LLIIII(this.LIZLLL);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object c098200Yq2 = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        List list = (List) c098200Yq;
        this.LIZLLL.clear();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AbsKevaRepoPreload[");
            sbLIZ.append(LIZJ());
            sbLIZ.append("] saving keva info : ");
            sbLIZ.append(list != null ? Integer.valueOf(list.size()) : null);
            C2188811AlT.LIZIZ(sbLIZ);
            if (list != null) {
                if (!list.isEmpty()) {
                    Keva.getRepo((String) this.LJI.getValue()).storeString("keva_info_list", C08JS.LIZLLL(list));
                }
                c098200Yq2 = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        C189200o6.m8isSuccessimpl(c098200Yq2);
        C189200o6.m5exceptionOrNullimpl(c098200Yq2);
    }

    public static void LJI(final Function0 function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            if (((Boolean) C274470ApJ.LJI.getValue()).booleanValue()) {
                C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0CAm
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AbsKevaRepoPreload@c966.sam$java_lang_Runnable$0");
                        try {
                            function0.invoke();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AbsKevaRepoPreload@c966.sam$java_lang_Runnable$0");
                    }
                });
                return;
            } else {
                C823050WQl.LJFF().execute(new Runnable() { // from class: X.0CAm
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AbsKevaRepoPreload@c966.sam$java_lang_Runnable$0");
                        try {
                            function0.invoke();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AbsKevaRepoPreload@c966.sam$java_lang_Runnable$0");
                    }
                });
                return;
            }
        }
        function0.invoke();
    }
}

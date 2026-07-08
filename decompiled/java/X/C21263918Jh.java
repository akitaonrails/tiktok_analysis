package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.nita.Nita$beginDynamicInflate$1;
import com.bytedance.nita.memory.MemoryManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Jh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21263918Jh {
    public static Context LIZ;
    public static C16F0 LIZIZ;
    public static InterfaceC21264618Jo LIZJ;
    public static InterfaceC21264718Jp LIZLLL;
    public static final C21263918Jh LJ = new C21263918Jh();

    public static final void LIZ(InterfaceC21263418Jc interfaceC21263418Jc) {
        synchronized (C21263318Jb.LIZIZ) {
            try {
                C21263318Jb.LIZ.put(interfaceC21263418Jc.LJIIIZ(), interfaceC21263418Jc);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean LJ(String str) {
        boolean z;
        synchronized (C21263318Jb.LIZIZ) {
            try {
                if (C21263318Jb.LIZ.get(str) != null) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public static int LIZIZ(Context context, String str) {
        SparseArray<List<InterfaceC21265418Jw>> sparseArray;
        MemoryManager memoryManager = MemoryManager.LLJIJIL;
        memoryManager.getClass();
        ConcurrentHashMap<Integer, SparseArray<List<InterfaceC21265418Jw>>> concurrentHashMap = MemoryManager.LLILLJJLI.get(str);
        int size = 0;
        if (concurrentHashMap != null) {
            int iLJIIZILJ = memoryManager.LJIIZILJ(context, str, false);
            synchronized (concurrentHashMap) {
                try {
                    sparseArray = concurrentHashMap.get(Integer.valueOf(iLJIIZILJ));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (sparseArray != null) {
                synchronized (sparseArray) {
                    try {
                        List<InterfaceC21265418Jw> list = sparseArray.get(R.layout.bk3);
                        if (list != null) {
                            size = list.size();
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }
        }
        return size;
    }

    public static View LIZJ(Activity activity, String str, Function0 function0) {
        AbstractC21264018Ji abstractC21264018Ji;
        synchronized (C21263318Jb.LIZIZ) {
            try {
                if (!LJ(str)) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fallbackInflate ");
                    sbLIZ.append(str);
                    sbLIZ.append(" nitaview is not find");
                    C2188811AlT.LIZIZ(sbLIZ);
                    abstractC21264018Ji = null;
                } else {
                    InterfaceC21263418Jc interfaceC21263418Jc = C21263318Jb.LIZ.get(str);
                    if (interfaceC21263418Jc != null) {
                        abstractC21264018Ji = (AbstractC21264018Ji) interfaceC21263418Jc;
                    } else {
                        throw new C1955207lG(str);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (abstractC21264018Ji != null) {
            return (View) C21263318Jb.LIZ(((Nita$beginDynamicInflate$1) abstractC21264018Ji).LLILZIL, R.layout.bk3, activity);
        }
        return (View) function0.invoke();
    }

    public static boolean LIZLLL(Context context, int i, String str) {
        MemoryManager memoryManager = MemoryManager.LLJIJIL;
        memoryManager.getClass();
        if (context == null) {
            return false;
        }
        if (MemoryManager.LJIILJJIL(context, memoryManager.LJIIZILJ(context, str, false), i, str)) {
            return true;
        }
        return MemoryManager.LJIILJJIL(context, memoryManager.LJIIZILJ(context, str, true), i, str);
    }

    public static final void LJFF(Context context, int i, String str) {
        if (C292700Bdc.LIZJ > 0 && C820260WFs.LIZ() > 0 && C2456309jt.LIZIZ()) {
            Keva keva = C20278414Wg.LIZ;
            try {
                if (!TextUtils.isEmpty(str) && C20278414Wg.LIZIZ.add(str)) {
                    Keva kevaLIZ = C20278414Wg.LIZ();
                    kevaLIZ.storeInt(str, kevaLIZ.getInt(str, 0) + 1);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        InterfaceC21263418Jc interfaceC21263418Jc = C21263318Jb.LIZ.get(str);
        if (interfaceC21263418Jc != null) {
            if (context == null) {
                Context context2 = LIZ;
                if (context2 != null) {
                    if (interfaceC21263418Jc.LIZJ() != 0) {
                        context = new C2481909o1(context2, interfaceC21263418Jc.LIZJ());
                    } else {
                        context = new C2481909o1(context2);
                    }
                } else {
                    throw new IllegalArgumentException("Nita context must not be null");
                }
            }
            InterfaceC21264518Jn interfaceC21264518Jn = C21153517qH.LIZ.get(interfaceC21263418Jc.LIZLLL());
            if (interfaceC21264518Jn == null) {
                Intrinsics.LJIIL();
            }
            interfaceC21264518Jn.LIZ(i, context, interfaceC21263418Jc);
            return;
        }
        throw new C1955207lG(str);
    }
}

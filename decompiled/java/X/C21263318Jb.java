package X;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.bytedance.nita.memory.MemoryManager;
import com.ss.android.legoimpl.InitAndInflaterTask;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Jb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21263318Jb {
    public static final C21263318Jb LIZIZ = new C21263318Jb();
    public static final ConcurrentHashMap<String, InterfaceC21263418Jc> LIZ = new ConcurrentHashMap<>();

    public static Object LIZ(String str, int i, Context context) {
        System.currentTimeMillis();
        MemoryManager memoryManager = MemoryManager.LLJIJIL;
        View viewLJ = memoryManager.LJ(context, i, str);
        InterfaceC21263418Jc interfaceC21263418Jc = LIZ.get(str);
        if (interfaceC21263418Jc != null) {
            if (viewLJ != null) {
                LIZIZ(interfaceC21263418Jc, i, viewLJ, context, true);
                if (C21263918Jh.LIZIZ != null) {
                    System.currentTimeMillis();
                    if (InitAndInflaterTask.LIZ()) {
                        Looper.getMainLooper().getThread();
                        C786410Ut5.u3();
                    }
                }
            } else {
                viewLJ = memoryManager.LJ(context, i, str);
                if (viewLJ == null) {
                    System.currentTimeMillis();
                    viewLJ = interfaceC21263418Jc.LJFF().LIZ(context, i, interfaceC21263418Jc.LJI(context));
                    if (C21263918Jh.LIZIZ != null) {
                        System.currentTimeMillis();
                        if (InitAndInflaterTask.LIZ()) {
                            Looper.getMainLooper().getThread();
                            C786410Ut5.u3();
                        }
                    }
                } else {
                    LIZIZ(interfaceC21263418Jc, i, viewLJ, context, true);
                }
                if (C21263918Jh.LIZIZ != null) {
                    System.currentTimeMillis();
                    if (InitAndInflaterTask.LIZ()) {
                        Looper.getMainLooper().getThread();
                        C786410Ut5.u3();
                    }
                }
                if (viewLJ == null) {
                    Intrinsics.LJIIL();
                    return viewLJ;
                }
            }
            return viewLJ;
        }
        throw new C1955207lG(str);
    }

    public static void LIZIZ(InterfaceC21263418Jc interfaceC21263418Jc, int i, View view, Context context, boolean z) {
        if (!(context instanceof Activity)) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("nitaView currentContext is ApplicationContext,view type is ");
            sbLIZ.append(view.getClass().getSimpleName());
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (view.getContext() instanceof C2481909o1) {
            Context context2 = view.getContext();
            if (context2 != null) {
                ((C2481909o1) context2).LIZ = new WeakReference<>(context);
                if (z) {
                    Field field = C0W08.LIZ;
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("replace start ");
                    sbLIZ2.append(System.currentTimeMillis());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C0W08.LIZIZ((Activity) context, view);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("replace end ");
                    sbLIZ3.append(System.currentTimeMillis());
                    C2188811AlT.LIZIZ(sbLIZ3);
                    interfaceC21263418Jc.LJII();
                    return;
                }
                return;
            }
            throw new C2482109o3("null cannot be cast to non-null type com.bytedance.nita.context.NitaContext");
        }
    }
}

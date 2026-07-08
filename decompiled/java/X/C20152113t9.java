package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerpreload.task.TaskTraceMetric;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.UUID;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13t9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20152113t9 implements InterfaceC728860SiS {
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(235));
    public final C20152213tA LIZ;

    @Override // X.InterfaceC728860SiS
    public final void LIZ(Bundle bundle, Class<? extends InterfaceC20153313tL> cls, InterfaceC1726310v1Z interfaceC1726310v1Z, Boolean bool) {
        this.LIZ.LIZ(bundle, cls, interfaceC1726310v1Z, bool);
    }

    public final void LIZJ(Bundle bundle, InterfaceC20153313tL interfaceC20153313tL, InterfaceC1726310v1Z interfaceC1726310v1Z, Boolean bool) {
        this.LIZ.LIZIZ(bundle, interfaceC20153313tL, null, bool);
    }

    public C20152113t9(C20152213tA c20152213tA) {
        this.LIZ = c20152213tA;
    }

    public final void LIZIZ(Intent intent) throws Throwable {
        String strLJJIJIIJIL;
        C20152313tB next;
        C20152313tB c20152313tBLIZ;
        C20152213tA c20152213tA = this.LIZ;
        c20152213tA.getClass();
        Uri data = intent.getData();
        ComponentName component = intent.getComponent();
        Bundle extras = null;
        if (component != null) {
            strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(component, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtWRf5SngbvHzG+kSWPJuePWL8M7/9cJwpFItdwIs", null));
        } else {
            strLJJIJIIJIL = null;
        }
        if (data != null && data.isOpaque()) {
            return;
        }
        C20152913tH.LIZLLL.getClass();
        if (!C20153113tJ.LIZ()) {
            return;
        }
        if (data != null) {
            if (strLJJIJIIJIL == null || (c20152313tBLIZ = C2277141EBc.LIZ(data.toString())) == null || !Intrinsics.LJFF(c20152313tBLIZ.LJFF, strLJJIJIIJIL)) {
                return;
            }
            try {
                C1203010hPX.LIZIZ(intent);
                C20152013t8 c20152013t8 = c20152213tA.LIZ;
                try {
                    extras = intent.getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                c20152013t8.LIZIZ(c20152313tBLIZ, extras);
                return;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C20152413tC.LIZ(e2);
                return;
            }
        }
        if (strLJJIJIIJIL == null) {
            return;
        }
        Iterator<C20152313tB> it2 = C2277141EBc.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LJFF, strLJJIJIIJIL)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C20152313tB c20152313tB = next;
        if (c20152313tB == null) {
            return;
        }
        try {
            C1203010hPX.LIZIZ(intent);
            C20152013t8 c20152013t82 = c20152213tA.LIZ;
            try {
                extras = intent.getExtras();
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            c20152013t82.LIZIZ(c20152313tB, extras);
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            C20152413tC.LIZ(e4);
        }
    }

    public final void LIZLLL(Bundle bundle, Class<? extends InterfaceC20153313tL> cls) {
        C20152213tA c20152213tA = this.LIZ;
        c20152213tA.getClass();
        c20152213tA.LIZ(bundle, cls, null, Boolean.FALSE);
    }

    public final void LJ(String str, Class<? extends Activity> cls, Class<? extends Fragment> cls2, Bundle bundle) {
        C20152313tB c20152313tBLIZ;
        C20152213tA c20152213tA = this.LIZ;
        c20152213tA.getClass();
        C20152913tH.LIZLLL.getClass();
        if (C20153113tJ.LIZ() && (c20152313tBLIZ = C2277141EBc.LIZ(str)) != null && Intrinsics.LJFF(c20152313tBLIZ.LJI, cls2.getName())) {
            if (bundle != null) {
                try {
                    String strLIZIZ = C1203000hPW.LIZIZ(bundle);
                    if (strLIZIZ == null) {
                        strLIZIZ = UUID.randomUUID().toString();
                        C786410Ut5.LJJJI("PRELOAD_TRACE_INFO_LIFECYCLE_KEY", strLIZIZ, bundle);
                    }
                    LruCache<String, TaskTraceMetric> lruCache = C1203000hPW.LIZ;
                    if (lruCache.get(strLIZIZ) == null) {
                        lruCache.put(strLIZIZ, new TaskTraceMetric());
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20152413tC.LIZ(e);
                    return;
                }
            }
            c20152313tBLIZ.LJFF = cls.getName();
            c20152213tA.LIZ.LIZIZ(c20152313tBLIZ, bundle);
        }
    }
}

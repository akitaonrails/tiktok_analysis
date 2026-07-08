package X;

import android.text.TextUtils;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.ICrashFilter;
import com.bytedance.crash.IOOMCallback;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vdn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802410Vdn {
    public static boolean LJIJI;
    public ICrashFilter LJIILL;
    public InterfaceC308350C6v LJIILLIIL;
    public boolean LJIIZILJ;
    public volatile boolean LJIJ = true;
    public final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, String> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZJ = new ConcurrentHashMap<>();
    public final C803120Vew<CrashType, AttachUserData> LIZLLL = new C803120Vew<>();
    public final C803120Vew<CrashType, ICrashCallback> LJ = new C803120Vew<>();
    public final C803120Vew<CrashType, C801770Vcl> LJFF = new C803120Vew<>();
    public final List<IOOMCallback> LJI = new CopyOnWriteArrayList();
    public final List<IOOMCallback> LJII = new CopyOnWriteArrayList();
    public final List<InterfaceC803840Vg6> LJIIIIZZ = new CopyOnWriteArrayList();
    public final List<InterfaceC803790Vg1> LJIIJJI = new CopyOnWriteArrayList();
    public final List<InterfaceC803750Vfx> LJIIL = new CopyOnWriteArrayList();
    public final Map<String, LinkedList<String>> LJIILIIL = new ConcurrentHashMap();
    public final Map<String, Integer> LJIILJJIL = new ConcurrentHashMap();
    public final C803120Vew<CrashType, InterfaceC802370Vdj> LJIIIZ = new C803120Vew<>();
    public final C803120Vew<CrashType, InterfaceC801650VcZ> LJIIJ = new C803120Vew<>();

    public final Map<String, String> LJI() {
        C08OM c08om = C802400Vdm.LIZ;
        if (c08om != null) {
            return ((C08OL) c08om).LIZ(C802400Vdm.LIZIZ).getAll();
        }
        return (NativeBridge.LJJIJIIJIL() && this.LJIIZILJ) ? NativeBridge.LJJI() : this.LIZ;
    }

    public final void LIZJ(Map<? extends String, ? extends String> map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (NativeBridge.LJJIJIIJIL() && this.LJIIZILJ) {
                            if (value == null) {
                                NativeBridge.LJJJJIZL(key);
                            } else if (!TextUtils.isEmpty(key)) {
                                NativeBridge.LJJJJI(key, value);
                            }
                        } else if (value == null) {
                            this.LIZ.remove(key);
                        } else if (key != null) {
                            this.LIZ.put(key, value);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final List<AttachUserData> LIZLLL(CrashType crashType) {
        List<AttachUserData> list;
        synchronized (this.LIZLLL) {
            try {
                list = this.LIZLLL.getList(crashType);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return list;
    }

    public final Map<String, String> LJ(CrashType crashType) {
        List<AttachUserData> list;
        synchronized (this.LIZLLL) {
            try {
                list = this.LIZLLL.getList(crashType);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        HashMap map = new HashMap();
        Iterator<AttachUserData> it2 = list.iterator();
        while (it2.hasNext()) {
            Map<? extends String, ? extends String> userData = it2.next().getUserData(crashType);
            if (userData != null) {
                map.putAll(userData);
            }
        }
        return map;
    }

    public final List<ICrashCallback> LJFF(CrashType crashType) {
        List<ICrashCallback> list;
        synchronized (this.LJ) {
            try {
                list = this.LJ.getList(crashType);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return list;
    }

    public final List<InterfaceC802370Vdj> LJII(CrashType crashType) {
        List<InterfaceC802370Vdj> list;
        synchronized (this.LJIIIZ) {
            try {
                list = this.LJIIIZ.getList(crashType);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return list;
    }

    public final void LIZ(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            synchronized (this.LIZLLL) {
                try {
                    if (crashType == CrashType.ALL) {
                        this.LIZLLL.addMulti(attachUserData, CrashType.ANR, CrashType.LAUNCH, CrashType.JAVA, CrashType.DART, CrashType.GAME, CrashType.NATIVE);
                    } else {
                        this.LIZLLL.add(crashType, attachUserData);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LIZIZ(String str, String str2) {
        if (NativeBridge.LJJIJIIJIL() && this.LJIIZILJ) {
            if (str2 == null) {
                NativeBridge.LJJJJIZL(str);
                return;
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                NativeBridge.LJJJJI(str, str2);
                return;
            }
        }
        if (str2 == null) {
            this.LIZ.remove(str);
        } else {
            if (str == null) {
                return;
            }
            this.LIZ.put(str, str2);
        }
    }

    public final boolean LJIIIIZZ(CrashType crashType, JSONObject jSONObject) {
        ICrashFilter iCrashFilter = this.LJIILL;
        if (iCrashFilter == null) {
            return false;
        }
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (crashType == CrashType.NATIVE) {
            return !this.LJIILL.onNativeCrashFilter(jSONObject.optString("data"), jSONObject.optString("crash_thread_name"));
        }
        if (crashType == CrashType.ANR && (iCrashFilter instanceof InterfaceC803710Vft)) {
            jSONObject.optString("data");
            jSONObject.optString("anr_info");
            return !((InterfaceC803710Vft) this.LJIILL).LIZ();
        }
        return false;
    }

    public final void LJIIIZ(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            synchronized (this.LIZLLL) {
                try {
                    if (crashType == CrashType.ALL) {
                        this.LIZLLL.removeAll(attachUserData);
                    } else {
                        this.LIZLLL.removeInList(crashType, attachUserData);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}

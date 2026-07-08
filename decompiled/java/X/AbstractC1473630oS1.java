package X;

import android.content.Context;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.ttvideoengine.TTVideoEngine;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0oS1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1473630oS1 implements InterfaceC1491100ouC {
    public final Context LIZ;
    public C1473600oRy LIZIZ;
    public C1471230oO9 LIZJ;
    public WeakReference<TTVideoEngine> LIZLLL;
    public Map<Integer, ? extends Pair<? extends Object, ? extends EnumC1473790oSH>> LJ;

    @Override // X.InterfaceC1491100ouC
    public final void destroy() {
        C1473600oRy c1473600oRy = this.LIZIZ;
        if (c1473600oRy == null || !c1473600oRy.LIZ()) {
            return;
        }
        C1471190oO5 c1471190oO5 = c1473600oRy.LLILLJJLI;
        if (c1471190oO5.LL != null) {
            WeakHandler weakHandler = c1471190oO5.LLJJIJIL;
            if (weakHandler != null) {
                weakHandler.removeMessages(201);
            }
            c1471190oO5.LLJILJILJ = false;
            c1471190oO5.LLJJ = false;
            c1471190oO5.LL.LJIILL();
            c1471190oO5.LL = null;
        }
    }

    public AbstractC1473630oS1(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC1491100ouC
    public final void LIZ(C1491120ouE c1491120ouE) {
        C1473600oRy c1473600oRy = this.LIZIZ;
        if (c1473600oRy != null && c1473600oRy.LIZ()) {
            C1471190oO5 c1471190oO5 = c1473600oRy.LLILLJJLI;
            if (c1471190oO5.LL != null) {
                c1471190oO5.LL.stop();
            }
        }
        if (c1491120ouE != null) {
            c1491120ouE.LIZ(0, null, 0, null);
        }
    }

    @Override // X.InterfaceC1491100ouC
    public final void LIZLLL(InterfaceC1469360oL8 interfaceC1469360oL8) {
        C1473600oRy c1473600oRy = this.LIZIZ;
        if (c1473600oRy != null) {
            c1473600oRy.setVideoEngineCallback(interfaceC1469360oL8);
        }
    }

    @Override // X.InterfaceC1491100ouC
    public final void LJ(Map<Integer, ? extends Pair<? extends Object, ? extends EnumC1473790oSH>> map) {
        WeakReference<TTVideoEngine> weakReference = this.LIZLLL;
        if (weakReference != null && weakReference.get() != null) {
            LJIJ(map);
        } else {
            this.LJ = map;
        }
    }

    @Override // X.InterfaceC1491100ouC
    public final void LJIIIIZZ(InterfaceC1467770oIZ interfaceC1467770oIZ) {
        C1473600oRy c1473600oRy = this.LIZIZ;
        if (c1473600oRy != null) {
            c1473600oRy.setDataSource(interfaceC1467770oIZ);
        }
    }

    @Override // X.InterfaceC1491100ouC
    public final void LJIIIZ(InterfaceC1473620oS0 interfaceC1473620oS0) {
        C1473600oRy c1473600oRy = this.LIZIZ;
        if (c1473600oRy != null) {
            c1473600oRy.setMediaVideoEngineCallback(interfaceC1473620oS0);
        }
    }

    @Override // X.InterfaceC1491100ouC
    public final void LJIIJ(InterfaceC1467780oIa interfaceC1467780oIa) {
        C1473600oRy c1473600oRy = this.LIZIZ;
        if (c1473600oRy != null) {
            c1473600oRy.setVideoEngineInfoListener(interfaceC1467780oIa);
        }
    }

    @Override // X.InterfaceC1491100ouC
    public final int LJIIJJI(C1491110ouD c1491110ouD) {
        boolean z;
        C1473600oRy c1473600oRy = this.LIZIZ;
        if (c1473600oRy != null && !c1473600oRy.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (c1491110ouD != null) {
                c1491110ouD.LIZ(7, null, -1, "player is not prepared");
            }
            return -1;
        }
        if (c1491110ouD != null) {
            c1491110ouD.LIZ(0, new C1473640oS2(this), 0, null);
        }
        C1473600oRy c1473600oRy2 = this.LIZIZ;
        if (c1473600oRy2 == null) {
            return -1;
        }
        return c1473600oRy2.getDuration();
    }

    @Override // X.InterfaceC1491100ouC
    public final void LJIIZILJ(C1491120ouE c1491120ouE) {
        C1473600oRy c1473600oRy = this.LIZIZ;
        if (c1473600oRy != null) {
            c1473600oRy.LIZJ();
        }
        if (c1491120ouE != null) {
            c1491120ouE.LIZ(0, null, 0, null);
        }
    }

    public final void LJIJ(Map<Integer, ? extends Pair<? extends Object, ? extends EnumC1473790oSH>> map) {
        TTVideoEngine tTVideoEngine;
        WeakReference<TTVideoEngine> weakReference = this.LIZLLL;
        if (weakReference != null && (tTVideoEngine = weakReference.get()) != null) {
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                int i = C1473780oSG.LIZ[((EnumC1473790oSH) ((Pair) entry.getValue()).getSecond()).ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                tTVideoEngine.LLD(((Float) ((Pair) entry.getValue()).getFirst()).floatValue(), ((Number) entry.getKey()).intValue());
                            }
                        } else {
                            tTVideoEngine.LIZIZ(((Number) entry.getKey()).intValue(), ((Long) ((Pair) entry.getValue()).getFirst()).longValue());
                        }
                    } else {
                        tTVideoEngine.LIZJ(((Number) entry.getKey()).intValue(), ((Integer) ((Pair) entry.getValue()).getFirst()).intValue());
                    }
                } else {
                    tTVideoEngine.LIZ(((Number) entry.getKey()).intValue(), (String) ((Pair) entry.getValue()).getFirst());
                }
            }
        }
    }

    public boolean LJIJI(Map<String, ? extends Object> map) {
        if (!map.containsKey("muted") && !map.containsKey("loop") && !map.containsKey("speed") && !map.containsKey("volume") && !map.containsKey("tag") && !map.containsKey("sub_tag") && !map.containsKey("cache-size") && !map.containsKey("progress_update_interval")) {
            return false;
        }
        return true;
    }
}

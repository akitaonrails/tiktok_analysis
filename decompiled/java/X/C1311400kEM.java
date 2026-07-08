package X;

import Y.ARunnableS120S0100000_20;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: renamed from: X.0kEM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1311400kEM {
    public Map<Integer, WeakReference<InterfaceC1311590kEf>> LIZ;
    public LinkedList<InterfaceC1311590kEf> LIZIZ;
    public LinkedList<InterfaceC1311590kEf> LIZJ;
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public C1310330kCd LJ;
    public boolean LJFF;
    public InterfaceC1311590kEf LJI;
    public C1311390kEL LJII;

    public final boolean LIZJ() {
        if (!C1299180jue.LIZ.booleanValue()) {
            return this.LJFF;
        }
        return false;
    }

    public final void LIZ() {
        BPEAHandler bPEAHandler;
        if (!LIZJ() || this.LJII == null || (bPEAHandler = this.LIZLLL) == null) {
            return;
        }
        C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS120S0100000_20(this, 234));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LIZIZ(String str, C1298740jtw c1298740jtw) {
        if (LIZJ() && this.LJII != null) {
            LinkedList<InterfaceC1311590kEf> linkedList = this.LIZJ;
            if (this.LJI != null) {
                if (!"touchstart".equals(str) && !"touchmove".equals(str) && !"touchcancel".equals(str) && !"touchend".equals(str)) {
                    return;
                }
                for (int i = 0; i < linkedList.size(); i++) {
                    Map<Integer, AbstractC1311530kEZ> gestureHandlers = linkedList.get(i).getGestureHandlers();
                    if (gestureHandlers != null) {
                        for (AbstractC1311530kEZ abstractC1311530kEZ : gestureHandlers.values()) {
                            switch (str.hashCode()) {
                                case -1578593149:
                                    if (str.equals("touchstart") && ((Boolean) ((HashMap) abstractC1311530kEZ.LIZLLL).get("onTouchesDown")).booleanValue()) {
                                        abstractC1311530kEZ.LJIILIIL("onTouchesDown", abstractC1311530kEZ.LJFF(c1298740jtw));
                                    }
                                    break;
                                case -819532484:
                                    if (str.equals("touchend") && ((Boolean) ((HashMap) abstractC1311530kEZ.LIZLLL).get("onTouchesUp")).booleanValue()) {
                                        abstractC1311530kEZ.LJIILIIL("onTouchesUp", abstractC1311530kEZ.LJFF(c1298740jtw));
                                    }
                                    break;
                                case 364536720:
                                    if (str.equals("touchmove") && ((Boolean) ((HashMap) abstractC1311530kEZ.LIZLLL).get("onTouchesMove")).booleanValue()) {
                                        abstractC1311530kEZ.LJIILIIL("onTouchesMove", abstractC1311530kEZ.LJFF(c1298740jtw));
                                    }
                                    break;
                                case 2127979129:
                                    if (str.equals("touchcancel") && ((Boolean) ((HashMap) abstractC1311530kEZ.LIZLLL).get("onTouchesCancel")).booleanValue()) {
                                        abstractC1311530kEZ.LJIILIIL("onTouchesCancel", abstractC1311530kEZ.LJFF(c1298740jtw));
                                    }
                                    break;
                            }
                        }
                    }
                }
            }
        }
    }
}

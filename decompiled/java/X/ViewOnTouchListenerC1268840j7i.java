package X;

import android.util.AndroidRuntimeException;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0j7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class ViewOnTouchListenerC1268840j7i implements InterfaceC1268980j7w, View.OnTouchListener {
    public C1267590j5h LL;
    public C1272880jEE LLILLJJLI;
    public final List<InterfaceC1268960j7u> LLILLL;
    public String LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public C1268860j7k LLIZ;
    public C1271790jCT LLIZLLLIL;
    public C1271880jCc LLJ;
    public View LLJI;
    public final C1267500j5Y LLJIJIL;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    static {
        new AtomicInteger(0);
    }

    public final void LIZIZ() {
        synchronized (this.LLILLL) {
            try {
                for (InterfaceC1268960j7u interfaceC1268960j7u : (ArrayList) this.LLILLL) {
                    if (interfaceC1268960j7u != null) {
                        VideoMixer.VideoMixerDescription videoMixerDescriptionLIZIZ = interfaceC1268960j7u.LIZIZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Dump Layer(name:");
                        sbLIZ.append(interfaceC1268960j7u.name());
                        sbLIZ.append(",w:");
                        sbLIZ.append(interfaceC1268960j7u.getWidth());
                        sbLIZ.append(",h:");
                        sbLIZ.append(interfaceC1268960j7u.getHeight());
                        sbLIZ.append(",");
                        sbLIZ.append(videoMixerDescriptionLIZIZ != null ? videoMixerDescriptionLIZIZ.toString() : "");
                        AVLog.ioi("LayerControl", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Release ");
        sbLIZ.append(this);
        AVLog.ioi("LayerControl", C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ();
        synchronized (this.LLILLL) {
            try {
                Iterator it2 = ((ArrayList) this.LLILLL).iterator();
                while (it2.hasNext()) {
                    C1268850j7j c1268850j7j = (C1268850j7j) ((InterfaceC1268960j7u) it2.next());
                    C1267590j5h c1267590j5h = c1268850j7j.LLIZLLLIL.LL;
                    if (c1267590j5h != null) {
                        c1267590j5h.removeTrack(c1268850j7j.LLILLJJLI);
                    }
                }
                ((ArrayList) this.LLILLL).clear();
            } finally {
            }
        }
        View view = this.LLJI;
        if (view != null) {
            view.setOnTouchListener(null);
            this.LLJI = null;
        }
        C1272880jEE c1272880jEE = this.LLILLJJLI;
        if (c1272880jEE != null) {
            c1272880jEE.release();
            this.LLILLJJLI = null;
        }
        C1267590j5h c1267590j5h2 = this.LL;
        if (c1267590j5h2 != null) {
            synchronized (c1267590j5h2) {
                try {
                    c1267590j5h2.release();
                    this.LL = null;
                } finally {
                }
            }
        }
    }

    public ViewOnTouchListenerC1268840j7i(C1267500j5Y c1267500j5Y) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Construct ");
        sbLIZ.append(this);
        AVLog.ioi("LayerControl", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL = new ArrayList();
        this.LLJIJIL = c1267500j5Y;
    }

    public final InterfaceC1268960j7u LIZJ(String str) {
        if (str == null) {
            return null;
        }
        synchronized (this.LLILLL) {
            try {
                for (InterfaceC1268960j7u interfaceC1268960j7u : (ArrayList) this.LLILLL) {
                    if (interfaceC1268960j7u.name().equals(str)) {
                        return interfaceC1268960j7u;
                    }
                }
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LIZLLL(long j) {
        if (this.LLILZIL <= 0) {
            return true;
        }
        long j2 = this.LLILZLL;
        if (j2 != 0) {
            long j3 = j2 - j;
            long jAbs = Math.abs(j3);
            long j4 = this.LLILZIL;
            if (jAbs < j4 * 2) {
                if (j3 > 0) {
                    return false;
                }
                this.LLILZLL += j4;
                return true;
            }
        }
        this.LLILZLL = j + (this.LLILZIL / 2);
        return true;
    }

    public final C1268850j7j LIZ(final String str, final VideoMixer.VideoMixerDescription videoMixerDescription, final int i, final int i2, int i3) {
        C1268850j7j c1268680j7S;
        if (LIZJ(str) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Layer name '");
            sbLIZ.append(str);
            sbLIZ.append("' already exist.");
            InvalidParameterException invalidParameterException = new InvalidParameterException(C2188811AlT.LIZIZ(sbLIZ));
            AVLog.ioe("LayerControl", invalidParameterException.getMessage(), invalidParameterException);
            C1274080jGA.LIZ.LIZ("LayerControl.createLayerExt", invalidParameterException);
            if (!C1274040jG6.LIZ()) {
                return null;
            }
            throw new AndroidRuntimeException(invalidParameterException);
        }
        if (i3 != 1) {
            if (i3 != 4) {
                c1268680j7S = new C1268850j7j(this, str, i, i2, videoMixerDescription);
            } else {
                c1268680j7S = new C1268680j7S(this, str, i, i2, videoMixerDescription);
            }
        } else {
            c1268680j7S = new C1268850j7j(this, str, i, i2, videoMixerDescription) { // from class: X.0j7m
            };
        }
        synchronized (this.LLILLL) {
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Create Layer(name:");
                sbLIZ2.append(c1268680j7S.LL);
                sbLIZ2.append(",w:");
                sbLIZ2.append(c1268680j7S.LLILLL);
                sbLIZ2.append(",h:");
                sbLIZ2.append(c1268680j7S.LLILZ);
                sbLIZ2.append(")");
                AVLog.ioi("LayerControl", C2188811AlT.LIZIZ(sbLIZ2));
                if (!((ArrayList) this.LLILLL).contains(c1268680j7S)) {
                    ((ArrayList) this.LLILLL).add(c1268680j7S);
                } else {
                    throw new AndroidRuntimeException("BUG");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1268680j7S;
    }
}

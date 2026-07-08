package X;

import X.C1317070kNV;
import X.InterfaceC1317060kNU;
import android.graphics.PointF;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0kNV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317070kNV {
    public final C1313470kHh LIZ;
    public final GestureDetector LIZIZ;
    public InterfaceC1317060kNU LIZJ;
    public InterfaceC1317060kNU LJ;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public PointF LJIIJ;
    public boolean LJIIL;
    public final LinkedList<InterfaceC1317060kNU> LIZLLL = new LinkedList<>();
    public final LinkedList<InterfaceC1317060kNU> LJFF = new LinkedList<>();
    public PointF LJI = new PointF(Float.MIN_VALUE, Float.MIN_VALUE);
    public final float LJII = C1312940kGq.LIZ(50.0f);
    public final HashSet<Integer> LJIIJJI = new HashSet<>();

    public final C1298420jtQ LIZIZ() {
        return this.LIZ.LIZJ.LLILLL;
    }

    public final void LIZLLL() {
        Iterator<InterfaceC1317060kNU> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().offResponseChain();
        }
        this.LIZLLL.clear();
        this.LJFF.clear();
        this.LJIIJJI.clear();
    }

    public final void LIZJ() {
        if (LIZIZ() == null) {
            return;
        }
        Iterator<InterfaceC1317060kNU> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            LIZIZ().LIZIZ(it2.next().getSign());
        }
    }

    public C1317070kNV(C1313470kHh c1313470kHh) {
        this.LIZ = c1313470kHh;
        this.LIZIZ = new GestureDetector(c1313470kHh.LIZJ, new GestureDetector.SimpleOnGestureListener() { // from class: p86.z$a
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                C1317070kNV c1317070kNV = this.LL;
                InterfaceC1317060kNU interfaceC1317060kNU = c1317070kNV.LIZJ;
                if (interfaceC1317060kNU != null && c1317070kNV.LIZ(interfaceC1317060kNU)) {
                    C1317070kNV c1317070kNV2 = this.LL;
                    c1317070kNV2.LJ(c1317070kNV2.LIZJ, "longpress", motionEvent.getX(), motionEvent.getY());
                }
                this.LL.LJIIL = true;
                super.onLongPress(motionEvent);
            }
        }, new BPEAHandler(Looper.getMainLooper()));
    }

    public final boolean LIZ(InterfaceC1317060kNU interfaceC1317060kNU) {
        if (interfaceC1317060kNU == null) {
            return false;
        }
        HashSet<Integer> hashSet = this.LJIIJJI;
        if (hashSet != null && !hashSet.isEmpty()) {
            Boolean bool = Boolean.TRUE;
            while (true) {
                if (interfaceC1317060kNU.parent() != interfaceC1317060kNU) {
                    if (this.LJIIJJI.contains(Integer.valueOf(interfaceC1317060kNU.getSign()))) {
                        bool = Boolean.FALSE;
                        break;
                    }
                    interfaceC1317060kNU = interfaceC1317060kNU.parent();
                    if (interfaceC1317060kNU == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
            return bool.booleanValue();
        }
        return true;
    }

    public final void LJ(InterfaceC1317060kNU interfaceC1317060kNU, String str, float f, float f2) {
        if (LIZIZ() != null) {
            InterfaceC1317060kNU interfaceC1317060kNU2 = this.LIZJ;
            if (interfaceC1317060kNU2 != null && interfaceC1317060kNU2.LIZJ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("do not sendTouchEvent since mActiveUI.eventThrough == true, which sign is: ");
                sbLIZ.append(this.LIZJ.getSign());
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            C1298950juH c1298950juH = new C1298950juH(f, f2);
            if (interfaceC1317060kNU instanceof SDUIBaseUI) {
                this.LIZ.LIZIZ.LJIILIIL();
                ((SDUIBaseUI) interfaceC1317060kNU).LJIILIIL();
            }
            C1298420jtQ c1298420jtQLIZIZ = LIZIZ();
            C1298960juI c1298960juI = new C1298960juI(interfaceC1317060kNU.getSign(), str, c1298950juH);
            if (c1298420jtQLIZIZ.LIZ == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("sendTouchEvent event: ");
                sbLIZ2.append(str);
                sbLIZ2.append(" failed since mTemplateAssembler is null");
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            c1298420jtQLIZIZ.LIZ(EnumC1298380jtM.kLynxEventTypeTouchEvent, c1298960juI);
        }
    }
}

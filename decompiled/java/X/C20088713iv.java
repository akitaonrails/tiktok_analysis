package X;

import Y.ARunnableS6S0110100_30;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS609S0100000_30;
import p2.j1;

/* JADX INFO: renamed from: X.13iv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20088713iv {
    public final C1776880wL8 LIZ;
    public InterfaceC20089713j5 LIZIZ;
    public final BPEAHandler LIZJ;
    public final C20088313ir LIZLLL;
    public final C20088613iu<InterfaceC1692950u9l> LJ;
    public long LJFF;
    public boolean LJI;
    public final C20089113iz LJII;

    public final void LIZIZ() {
        C20088613iu<InterfaceC1692950u9l> c20088613iu = this.LJ;
        if (c20088613iu != null) {
            ARunnableS6S0110100_30 aRunnableS6S0110100_30 = c20088613iu.LIZLLL;
            aRunnableS6S0110100_30.z1 = false;
            aRunnableS6S0110100_30.j2 = 0L;
            c20088613iu.LIZ.removeCallbacks(aRunnableS6S0110100_30);
        }
        this.LIZJ.removeCallbacksAndMessages(null);
        this.LJFF = 0L;
        this.LJI = false;
    }

    public final void LIZ(String str) {
        if (this.LJI && this.LJFF > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LJFF;
            this.LIZIZ.LIZ();
            this.LJFF = 0L;
            this.LJI = false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("finishExposure itemId: ");
            sbLIZ.append(this.LIZ.LIZ);
            sbLIZ.append(" exposureTime: ");
            sbLIZ.append(jCurrentTimeMillis);
            sbLIZ.append(" from: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.13iz] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13ir, X.13j1] */
    public C20088713iv(final C1776880wL8 c1776880wL8, InterfaceC20089713j5 interfaceC20089713j5) {
        final int i;
        this.LIZ = c1776880wL8;
        this.LIZIZ = interfaceC20089713j5;
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.13j0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C20088713iv c20088713iv;
                C20088613iu<InterfaceC1692950u9l> c20088613iu;
                InterfaceC1692950u9l interfaceC1692950u9l;
                C20088313ir c20088313ir;
                if (message.what == 10000 && (c20088613iu = (c20088713iv = this.LL).LJ) != null && (interfaceC1692950u9l = c20088613iu.LIZJ) != null && (c20088313ir = c20088713iv.LIZLLL) != null) {
                    c20088313ir.LIZIZ(interfaceC1692950u9l, c20088713iv.LJI, c20088713iv.LJII);
                    return true;
                }
                return true;
            }
        });
        this.LIZJ = bPEAHandler;
        if (C258120A9q.LIZ()) {
            final float f = c1776880wL8.LIZIZ;
            ?? r3 = new AbstractC20089313j1(f, c1776880wL8) { // from class: X.13ir
                public final float LIZLLL;
                public ComposeView LJ;
                public boolean LJFF;

                public final boolean LJI(InterfaceC1692950u9l interfaceC1692950u9l) {
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    C20053713dH c20053713dH;
                    if (!interfaceC1692950u9l.LIZLLL()) {
                        return false;
                    }
                    C1683130ttv c1683130ttvLIZJ = C1692940u9k.LIZJ(interfaceC1692950u9l);
                    if (c1683130ttvLIZJ.LIZIZ >= 0.0f && c1683130ttvLIZJ.LIZLLL >= 0.0f) {
                        Rect rect = new Rect((int) c1683130ttvLIZJ.LIZ, (int) c1683130ttvLIZJ.LIZIZ, (int) c1683130ttvLIZJ.LIZJ, (int) c1683130ttvLIZJ.LIZLLL);
                        long jLIZ = interfaceC1692950u9l.LIZ();
                        if (rect.width() > 0 && rect.height() > 0 && (i2 = (int) (jLIZ >> 32)) > 0 && (i3 = (int) (jLIZ & 4294967295L)) > 0) {
                            if (this.LJFF) {
                                this.LJFF = false;
                                InterfaceC1692950u9l interfaceC1692950u9lLIZLLL = C1692940u9k.LIZLLL(interfaceC1692950u9l);
                                ComposeView composeView = null;
                                if ((interfaceC1692950u9lLIZLLL instanceof j1) && (c20053713dH = ((j1) interfaceC1692950u9lLIZLLL).LLJILJILJ) != null) {
                                    Iterator<ConcurrentHashMap<Integer, WeakReference<ComposeView>>> it2 = C20089413j2.LIZIZ.values().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        ConcurrentHashMap<Integer, WeakReference<ComposeView>> next = it2.next();
                                        if (next.containsKey(Integer.valueOf(c20053713dH.hashCode()))) {
                                            WeakReference<ComposeView> weakReference = next.get(Integer.valueOf(c20053713dH.hashCode()));
                                            if (weakReference != null) {
                                                composeView = weakReference.get();
                                            }
                                        }
                                    }
                                    this.LJ = composeView;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("isAchievePercent itemId: ");
                                    sbLIZ.append(this.LIZ.LIZ);
                                    sbLIZ.append(" composeView ");
                                    sbLIZ.append(this.LJ);
                                    sbLIZ.append(" size: ");
                                    sbLIZ.append(i2);
                                    sbLIZ.append("  ");
                                    sbLIZ.append(i3);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                }
                            }
                            ComposeView composeView2 = this.LJ;
                            if (composeView2 != null) {
                                if (composeView2.isAttachedToWindow() && composeView2.hasWindowFocus() && composeView2.getWindowVisibility() == 0 && composeView2.isShown() && composeView2.getWidth() > 0 && composeView2.getHeight() > 0 && composeView2.getAlpha() > 0.0f) {
                                    Rect rect2 = new Rect();
                                    if (composeView2.getGlobalVisibleRect(rect2) && (i4 = rect.bottom) > (i5 = rect2.top) && (i6 = rect.top) < (i7 = rect2.bottom)) {
                                        if (i6 < i5) {
                                            rect.top = i5;
                                        }
                                        if (i4 > i7) {
                                            rect.bottom = i7;
                                        }
                                    }
                                }
                                return false;
                            }
                            if (this.LIZLLL <= 0.0f) {
                                return true;
                            }
                            float fWidth = (rect.width() * rect.height()) / (i2 * i3);
                            float f2 = this.LIZLLL;
                            if (f2 > 1.0f) {
                                f2 = 1.0f;
                            }
                            if (fWidth < f2) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return false;
                }

                {
                    super(c1776880wL8);
                    this.LIZLLL = f;
                    this.LJFF = true;
                }

                @Override // X.AbstractC20089313j1
                public final void LIZIZ(InterfaceC1692950u9l interfaceC1692950u9l, boolean z, InterfaceC20090313jB interfaceC20090313jB) {
                    boolean zLJI;
                    this.LIZJ = interfaceC20090313jB;
                    try {
                        zLJI = LJI(interfaceC1692950u9l);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("checkExposure ex: ");
                        sbLIZ.append(e);
                        C2188811AlT.LIZIZ(sbLIZ);
                        zLJI = false;
                    }
                    if (z) {
                        if (zLJI) {
                            return;
                        }
                        LIZ();
                        LJ(false);
                        return;
                    }
                    if (!zLJI) {
                        LIZ();
                    } else {
                        LIZJ(interfaceC1692950u9l, z);
                    }
                }
            };
            C20088913ix c20088913ix = new C20088913ix(c1776880wL8.LIZJ, bPEAHandler, c1776880wL8);
            if (!c1776880wL8.LIZLLL) {
                i = 1;
            } else {
                i = Integer.MAX_VALUE;
            }
            AbstractC20089313j1 abstractC20089313j1 = new AbstractC20089313j1(i, c1776880wL8) { // from class: X.13iy
                public final int LIZLLL;
                public int LJ;

                @Override // X.AbstractC20089313j1
                public final void LJFF() {
                    super.LJFF();
                    this.LJ = 0;
                }

                @Override // X.AbstractC20089313j1
                public final void LIZLLL(boolean z) {
                    if (z) {
                        this.LJ++;
                    }
                }

                {
                    super(c1776880wL8);
                    this.LIZLLL = i;
                }

                @Override // X.AbstractC20089313j1
                public final void LIZIZ(InterfaceC1692950u9l interfaceC1692950u9l, boolean z, InterfaceC20090313jB interfaceC20090313jB) {
                    this.LIZJ = interfaceC20090313jB;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("checkExposure exposureCount: ");
                    sbLIZ.append(this.LJ);
                    sbLIZ.append(" limitTime: ");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(" itemId: ");
                    sbLIZ.append(this.LIZ.LIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (this.LJ < this.LIZLLL) {
                        LIZJ(interfaceC1692950u9l, z);
                    } else {
                        LIZ();
                    }
                }
            };
            r3.LIZIZ = abstractC20089313j1;
            abstractC20089313j1.LIZIZ = c20088913ix;
            this.LIZLLL = r3;
            this.LJ = new C20088613iu<>(bPEAHandler, new AwS609S0100000_30(this, 354));
        }
        this.LJII = new InterfaceC20090313jB() { // from class: X.13iz
            @Override // X.InterfaceC20090313jB
            public final void LIZ(boolean z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onExposureStateChange itemId: ");
                sbLIZ.append(this.LIZ.LIZ.LIZ);
                sbLIZ.append(" exposureState: ");
                sbLIZ.append(this.LIZ.LJI);
                sbLIZ.append("  -> ");
                sbLIZ.append(z);
                C2188811AlT.LIZIZ(sbLIZ);
                if (z) {
                    this.LIZ.LJFF = System.currentTimeMillis();
                    C20088713iv c20088713iv = this.LIZ;
                    c20088713iv.LIZIZ.LIZIZ(c20088713iv.LIZ.LIZ);
                } else {
                    this.LIZ.LIZ("checkExposureState");
                }
                this.LIZ.LJI = z;
            }
        };
    }
}

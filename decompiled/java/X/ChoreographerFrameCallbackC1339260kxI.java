package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS21S0100100_20;
import android.os.SystemClock;
import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.xelement.markdown.MarkdownShadowNode;
import com.lynx.animax.drawable.BitmapBuffer;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.list.container.UIListContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0kxI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class ChoreographerFrameCallbackC1339260kxI implements Choreographer.FrameCallback {
    public final int $t;
    public Object l0;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.$t) {
            case 0:
                doFrame$0(this, j);
                break;
            case 1:
                doFrame$1(this, j);
                break;
            case 2:
                doFrame$2(this, j);
                break;
            case 3:
                doFrame$3(this, j);
                break;
            case 4:
                doFrame$4(this, j);
                break;
            case 5:
                doFrame$5(this, j);
                break;
            case 6:
                doFrame$6(this, j);
                break;
        }
    }

    public ChoreographerFrameCallbackC1339260kxI(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void doFrame$0(ChoreographerFrameCallbackC1339260kxI choreographerFrameCallbackC1339260kxI, long j) {
        C1288320jd8 c1288320jd8 = (C1288320jd8) choreographerFrameCallbackC1339260kxI.l0;
        synchronized (c1288320jd8.LJIIIIZZ) {
            try {
                if (c1288320jd8.LJII) {
                    return;
                }
                Choreographer choreographer = c1288320jd8.LIZ;
                List<InterfaceC1285170jY3> list = null;
                if (choreographer == null) {
                    choreographer = null;
                }
                ChoreographerFrameCallbackC1339260kxI choreographerFrameCallbackC1339260kxI2 = c1288320jd8.LIZLLL;
                if (choreographerFrameCallbackC1339260kxI2 == null) {
                    choreographerFrameCallbackC1339260kxI2 = null;
                }
                choreographer.postFrameCallback(choreographerFrameCallbackC1339260kxI2);
                try {
                    if (!c1288320jd8.LJIIIZ) {
                        List<InterfaceC1285170jY3> list2 = c1288320jd8.LIZIZ;
                        if (list2 == null) {
                            list2 = null;
                        }
                        ArrayList arrayList = new ArrayList(list2);
                        List<InterfaceC1285170jY3> list3 = c1288320jd8.LIZIZ;
                        if (list3 == null) {
                            list3 = null;
                        }
                        list3.clear();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1285170jY3) it2.next()).doFrame(j);
                        }
                        if (c1288320jd8.LJIIJ) {
                            List<InterfaceC1285170jY3> list4 = c1288320jd8.LIZJ;
                            if (list4 == null) {
                                list4 = null;
                            }
                            Iterator<InterfaceC1285170jY3> it3 = list4.iterator();
                            while (it3.hasNext()) {
                                it3.next().doFrame(j);
                            }
                        }
                    } else {
                        if (c1288320jd8.LJFF == 0) {
                            c1288320jd8.LJFF = c1288320jd8.LJ + j;
                        }
                        long j2 = c1288320jd8.LJFF;
                        if (j > j2) {
                            long j3 = c1288320jd8.LJ;
                            long j4 = j2 + j3;
                            c1288320jd8.LJFF = j4;
                            if ((j - j4) / j3 > c1288320jd8.LJI) {
                                c1288320jd8.LJFF = j3 + j;
                            }
                            List<InterfaceC1285170jY3> list5 = c1288320jd8.LIZIZ;
                            if (list5 == null) {
                                list5 = null;
                            }
                            ArrayList arrayList2 = new ArrayList(list5);
                            List<InterfaceC1285170jY3> list6 = c1288320jd8.LIZIZ;
                            if (list6 == null) {
                                list6 = null;
                            }
                            list6.clear();
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                ((InterfaceC1285170jY3) it4.next()).doFrame(j);
                            }
                            if (c1288320jd8.LJIIJ) {
                                List<InterfaceC1285170jY3> list7 = c1288320jd8.LIZJ;
                                if (list7 == null) {
                                    list7 = null;
                                }
                                Iterator<InterfaceC1285170jY3> it5 = list7.iterator();
                                while (it5.hasNext()) {
                                    it5.next().doFrame(j);
                                }
                            }
                        }
                    }
                    if (!c1288320jd8.LJIIJ) {
                        List<InterfaceC1285170jY3> list8 = c1288320jd8.LIZJ;
                        if (list8 != null) {
                            list = list8;
                        }
                        Iterator<InterfaceC1285170jY3> it6 = list.iterator();
                        while (it6.hasNext()) {
                            it6.next().doFrame(j);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    th.toString();
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public static final void doFrame$1(ChoreographerFrameCallbackC1339260kxI choreographerFrameCallbackC1339260kxI, long j) {
        MarkdownShadowNode markdownShadowNode;
        C1315200kKU c1315200kKU = (C1315200kKU) choreographerFrameCallbackC1339260kxI.l0;
        if (c1315200kKU.LLLFF != null && c1315200kKU.LLLF) {
            c1315200kKU.LJIIIIZZ();
            C1315260kKa c1315260kKa = c1315200kKU.LL;
            if (c1315260kKa != null && (markdownShadowNode = c1315260kKa.LJ.get()) != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (markdownShadowNode.LJJIJIIJIL != 0) {
                    markdownShadowNode.LJJIJIIJI(new ARunnableS21S0100100_20(jElapsedRealtime, markdownShadowNode, 3));
                }
            }
            C786410Ut5.v2().postFrameCallback(c1315200kKU.LLLFF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void doFrame$2(X.ChoreographerFrameCallbackC1339260kxI r8, long r9) {
        /*
            java.lang.Object r5 = r8.l0
            X.0kSy r5 = (X.C1320460kSy) r5
            long r3 = r5.LJFF
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Le
            r5.LJFF = r9
        Le:
            int r0 = r5.LJII
            int r0 = r0 + 1
            r5.LJII = r0
            boolean r0 = r5.LIZIZ
            if (r0 == 0) goto L1f
            android.view.Choreographer r0 = X.C786410Ut5.v2()
            r0.postFrameCallback(r8)
        L1f:
            java.lang.Object r5 = r8.l0
            X.0kSy r5 = (X.C1320460kSy) r5
            long r1 = r5.LJI
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L9c
            long r3 = r9 - r1
            double r1 = (double) r3
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r1 = r1 / r3
            long r3 = (long) r1
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 <= 0) goto L9c
            int r3 = r5.LJIIJ
            r0 = -1
            if (r3 != r0) goto L80
            java.lang.ref.WeakReference<j27.s> r0 = r5.LIZ
            java.lang.Object r0 = r0.get()
            j27.o r0 = (j27.o) r0
            if (r0 == 0) goto Lb9
            android.content.Context r3 = r0.LIZ()
            java.lang.Class<android.hardware.display.DisplayManager> r0 = android.hardware.display.DisplayManager.class
            java.lang.Object r3 = r3.getSystemService(r0)
            android.hardware.display.DisplayManager r3 = (android.hardware.display.DisplayManager) r3
            if (r3 == 0) goto Lb7
            r0 = 0
            android.view.Display r3 = r3.getDisplay(r0)
        L5b:
            r0 = 1114636288(0x42700000, float:60.0)
            if (r3 == 0) goto Lb4
            float r3 = r3.getRefreshRate()
        L63:
            float r0 = r3 - r0
            float r0 = java.lang.Math.abs(r0)
            r4 = 1084437299(0x40a33333, float:5.1)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto Lb9
            r0 = 1119092736(0x42b40000, float:90.0)
            float r0 = r3 - r0
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto La3
            r0 = 90
        L7e:
            r5.LJIIJ = r0
        L80:
            java.util.LinkedList<java.lang.Long> r0 = r5.LJ
            int r3 = r0.size()
            r0 = 20000(0x4e20, float:2.8026E-41)
            if (r3 <= r0) goto L8f
            java.util.LinkedList<java.lang.Long> r0 = r5.LJ
            r0.poll()
        L8f:
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r1 = r1 * r3
            long r3 = (long) r1
            java.util.LinkedList<java.lang.Long> r1 = r5.LJ
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1.add(r0)
        L9c:
            java.lang.Object r0 = r8.l0
            X.0kSy r0 = (X.C1320460kSy) r0
            r0.LJI = r9
            return
        La3:
            r0 = 1123024896(0x42f00000, float:120.0)
            float r0 = r3 - r0
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto Lb2
            r0 = 120(0x78, float:1.68E-43)
            goto L7e
        Lb2:
            int r0 = (int) r3
            goto L7e
        Lb4:
            r3 = 1114636288(0x42700000, float:60.0)
            goto L63
        Lb7:
            r3 = 0
            goto L5b
        Lb9:
            r0 = 60
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ChoreographerFrameCallbackC1339260kxI.doFrame$2(X.0kxI, long):void");
    }

    public static final void doFrame$3(ChoreographerFrameCallbackC1339260kxI choreographerFrameCallbackC1339260kxI, long j) {
        LynxLog.i(((AbstractC1298500jtY) ((ARunnableS120S0100000_20) choreographerFrameCallbackC1339260kxI.l0).l0).LJIJJ, "onRootViewDraw ObserverHandler");
        ((AbstractC1298500jtY) ((ARunnableS120S0100000_20) choreographerFrameCallbackC1339260kxI.l0).l0).LJII();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void doFrame$4(X.ChoreographerFrameCallbackC1339260kxI r5, long r6) {
        /*
            java.lang.Object r1 = r5.l0
            com.lynx.tasm.behavior.ui.list.UIList r1 = (com.lynx.tasm.behavior.ui.list.UIList) r1
            int r0 = r1.LLJZ
            r4 = 1
            r3 = 0
            if (r0 <= 0) goto L10
            boolean r0 = r1.LJJIJL(r4)
            if (r0 != 0) goto L1f
        L10:
            java.lang.Object r1 = r5.l0
            com.lynx.tasm.behavior.ui.list.UIList r1 = (com.lynx.tasm.behavior.ui.list.UIList) r1
            int r0 = r1.LLJZ
            if (r0 >= 0) goto L5a
            r0 = -1
            boolean r0 = r1.LJJIJL(r0)
            if (r0 == 0) goto L5a
        L1f:
            java.lang.Object r2 = r5.l0
            com.lynx.tasm.behavior.ui.list.UIList r2 = (com.lynx.tasm.behavior.ui.list.UIList) r2
            boolean r0 = r2.LLJJJJJIL
            if (r0 == 0) goto L50
            T extends android.view.View r1 = r2.mView
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            int r0 = r2.LLJZ
            r1.scrollBy(r3, r0)
        L30:
            java.lang.Object r1 = r5.l0
            com.lynx.tasm.behavior.ui.list.UIList r1 = (com.lynx.tasm.behavior.ui.list.UIList) r1
            boolean r0 = r1.LLJLLL
            if (r0 == 0) goto L5c
            if (r4 != 0) goto L3e
            boolean r0 = r1.LLJZIJLIL
            if (r0 != 0) goto L5c
        L3e:
            X.0kxI r0 = r1.LLLJ
            if (r0 == 0) goto L4f
            android.view.Choreographer r1 = X.C786410Ut5.v2()
            java.lang.Object r0 = r5.l0
            com.lynx.tasm.behavior.ui.list.UIList r0 = (com.lynx.tasm.behavior.ui.list.UIList) r0
            X.0kxI r0 = r0.LLLJ
            r1.postFrameCallback(r0)
        L4f:
            return
        L50:
            T extends android.view.View r1 = r2.mView
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            int r0 = r2.LLJZ
            r1.scrollBy(r0, r3)
            goto L30
        L5a:
            r4 = 0
            goto L30
        L5c:
            r1.LJJJJJL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ChoreographerFrameCallbackC1339260kxI.doFrame$4(X.0kxI, long):void");
    }

    public static final void doFrame$5(ChoreographerFrameCallbackC1339260kxI choreographerFrameCallbackC1339260kxI, long j) {
        AbstractC1317530kOF abstractC1317530kOF = (AbstractC1317530kOF) choreographerFrameCallbackC1339260kxI.l0;
        boolean zLIZ = abstractC1317530kOF.LIZ(abstractC1317530kOF.LIZIZ);
        if (zLIZ) {
            AbstractC1317530kOF abstractC1317530kOF2 = (AbstractC1317530kOF) choreographerFrameCallbackC1339260kxI.l0;
            int i = abstractC1317530kOF2.LIZIZ;
            UIListContainer uIListContainer = ((C1317520kOE) abstractC1317530kOF2).LJFF;
            if (uIListContainer.LL) {
                uIListContainer.mView.scrollBy(0, i);
            } else {
                uIListContainer.mView.scrollBy(i, 0);
            }
        }
        AbstractC1317530kOF abstractC1317530kOF3 = (AbstractC1317530kOF) choreographerFrameCallbackC1339260kxI.l0;
        if (abstractC1317530kOF3.LIZ && (zLIZ || !abstractC1317530kOF3.LIZJ)) {
            if (abstractC1317530kOF3.LIZLLL != null) {
                C786410Ut5.v2().postFrameCallback(((AbstractC1317530kOF) choreographerFrameCallbackC1339260kxI.l0).LIZLLL);
            }
        } else {
            C1317480kOA c1317480kOA = (C1317480kOA) ((C1317520kOE) abstractC1317530kOF3).LJFF.mView;
            c1317480kOA.LLJJJJ = false;
            c1317480kOA.setScrollState(1);
            ((AbstractC1317530kOF) choreographerFrameCallbackC1339260kxI.l0).LIZIZ();
        }
    }

    public static final void doFrame$6(ChoreographerFrameCallbackC1339260kxI choreographerFrameCallbackC1339260kxI, long j) {
        C1288640jde c1288640jde = (C1288640jde) choreographerFrameCallbackC1339260kxI.l0;
        BitmapBuffer bitmapBuffer = c1288640jde.LLIZ;
        BitmapBuffer bitmapBufferLIZJ = c1288640jde.LL.LIZJ(bitmapBuffer);
        c1288640jde.LLIZ = bitmapBufferLIZJ;
        if (bitmapBufferLIZJ != null && bitmapBuffer != bitmapBufferLIZJ) {
            c1288640jde.invalidate();
        }
    }
}

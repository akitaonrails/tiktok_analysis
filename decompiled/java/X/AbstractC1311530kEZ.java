package X;

import Y.ARunnableS120S0100000_20;
import android.os.Looper;
import android.view.MotionEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.lynx.react.bridge.ReadableMap;
import j27.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0kEZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1311530kEZ {
    public final int LIZ;
    public int LIZIZ;
    public final s LIZJ;
    public final Map<String, Boolean> LIZLLL;
    public final C1311420kEO LJ;
    public final InterfaceC1311590kEf LJFF;

    public void LIZ() {
        this.LIZIZ = 2;
        InterfaceC1311590kEf interfaceC1311590kEf = this.LJFF;
        if (interfaceC1311590kEf != null) {
            interfaceC1311590kEf.onPlatformGestureStatusChanged(2);
        }
    }

    public final void LIZIZ() {
        this.LIZIZ = 1;
        InterfaceC1311590kEf interfaceC1311590kEf = this.LJFF;
        if (interfaceC1311590kEf != null) {
            interfaceC1311590kEf.onPlatformGestureStatusChanged(1);
        }
    }

    public void LIZLLL() {
        this.LIZIZ = 5;
        InterfaceC1311590kEf interfaceC1311590kEf = this.LJFF;
        if (interfaceC1311590kEf != null) {
            interfaceC1311590kEf.onPlatformGestureStatusChanged(5);
        }
    }

    public abstract void LJIIJ(MotionEvent motionEvent, C1298740jtw c1298740jtw, float f, float f2, boolean z, C1311460kES c1311460kES);

    public void LJIIL() {
        this.LIZIZ = 0;
    }

    public void LJ() {
        int i = this.LIZIZ;
        if (i != 5) {
            if (i == 1) {
                this.LIZIZ = 4;
            } else {
                this.LIZIZ = 3;
            }
        }
        InterfaceC1311590kEf interfaceC1311590kEf = this.LJFF;
        if (interfaceC1311590kEf != null) {
            interfaceC1311590kEf.onPlatformGestureStatusChanged(this.LIZIZ);
        }
    }

    public final boolean LJI() {
        return ((Boolean) ((HashMap) this.LIZLLL).get("onBegin")).booleanValue();
    }

    public final boolean LJII() {
        return ((Boolean) ((HashMap) this.LIZLLL).get("onEnd")).booleanValue();
    }

    public final boolean LJIIIIZZ() {
        return ((Boolean) ((HashMap) this.LIZLLL).get("onStart")).booleanValue();
    }

    public final boolean LJIIIZ() {
        return ((Boolean) ((HashMap) this.LIZLLL).get("onUpdate")).booleanValue();
    }

    public final HashMap<String, Object> LJFF(C1298740jtw c1298740jtw) {
        HashMap<String, Object> map = new HashMap<>();
        if (c1298740jtw != null) {
            map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
            map.put("type", c1298740jtw.LIZIZ);
            C1298900juC c1298900juC = c1298740jtw.LJIIIIZZ;
            if (c1298900juC != null) {
                map.put("x", Integer.valueOf(LJIIJJI(c1298900juC.LIZ)));
                map.put("y", Integer.valueOf(LJIIJJI(c1298740jtw.LJIIIIZZ.LIZIZ)));
            }
            C1298900juC c1298900juC2 = c1298740jtw.LJII;
            if (c1298900juC2 != null) {
                map.put("pageX", Integer.valueOf(LJIIJJI(c1298900juC2.LIZ)));
                map.put("pageY", Integer.valueOf(LJIIJJI(c1298740jtw.LJII.LIZIZ)));
            }
            C1298900juC c1298900juC3 = c1298740jtw.LJI;
            if (c1298900juC3 != null) {
                map.put("clientX", Integer.valueOf(LJIIJJI(c1298900juC3.LIZ)));
                map.put("clientY", Integer.valueOf(LJIIJJI(c1298740jtw.LJI.LIZIZ)));
            }
        }
        return map;
    }

    public final int LJIIJJI(float f) {
        s sVar = this.LIZJ;
        if (sVar != null && sVar.getResources() != null && sVar.getResources().getDisplayMetrics() != null) {
            return (int) (((double) (f / sVar.getResources().getDisplayMetrics().density)) + 0.5d);
        }
        return (int) f;
    }

    public final void LJIILIIL(String str, HashMap<String, Object> map) {
        if (this.LJ == null) {
            return;
        }
        this.LIZJ.LLIZ.LJFF(this.LJ.LIZ, new C1298700jts(this.LIZ, str, map));
    }

    public AbstractC1311530kEZ(int i, s sVar, C1311420kEO c1311420kEO, InterfaceC1311590kEf interfaceC1311590kEf) {
        this.LIZ = i;
        this.LIZJ = sVar;
        this.LJ = c1311420kEO;
        this.LJFF = interfaceC1311590kEf;
        HashMap map = new HashMap();
        this.LIZLLL = map;
        List<String> list = c1311420kEO.LIZJ;
        Boolean bool = Boolean.FALSE;
        map.put("onTouchesDown", bool);
        map.put("onTouchesMove", bool);
        map.put("onTouchesUp", bool);
        map.put("onTouchesCancel", bool);
        map.put("onBegin", bool);
        map.put("onUpdate", bool);
        map.put("onStart", bool);
        map.put("onEnd", bool);
        if (list != null) {
            for (Object obj : (ArrayList) list) {
                if (((HashMap) this.LIZLLL).containsKey(obj)) {
                    ((HashMap) this.LIZLLL).put(obj, Boolean.TRUE);
                }
            }
        }
    }

    public static Map<Integer, AbstractC1311530kEZ> LIZJ(final int i, final s sVar, final InterfaceC1311590kEf interfaceC1311590kEf, Map<Integer, C1311420kEO> map) {
        HashMap map2 = new HashMap();
        Iterator<Integer> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            final C1311420kEO c1311420kEO = map.get(Integer.valueOf(it2.next().intValue()));
            if (c1311420kEO != null) {
                int i2 = c1311420kEO.LIZIZ;
                if (i2 == 0) {
                    map2.put(Integer.valueOf(i2), new C1311550kEb(i, sVar, c1311420kEO, interfaceC1311590kEf));
                } else if (i2 == 2) {
                    map2.put(Integer.valueOf(i2), new AbstractC1311530kEZ(i, sVar, c1311420kEO, interfaceC1311590kEf) { // from class: X.0kEa
                        public final HashMap<String, Object> LJI;
                        public float LJII;
                        public float LJIIIIZZ;
                        public boolean LJIIIZ;
                        public boolean LJIIJ;
                        public int LJIIJJI;
                        public C1298740jtw LJIIL;

                        @Override // X.AbstractC1311530kEZ
                        public final void LIZ() {
                            throw null;
                        }

                        @Override // X.AbstractC1311530kEZ
                        public final void LJIIL() {
                            this.LIZIZ = 0;
                            this.LJII = 0.0f;
                            this.LJIIIIZZ = 0.0f;
                            this.LJIIIZ = false;
                            this.LJIIJ = false;
                        }

                        @Override // X.AbstractC1311530kEZ
                        public final void LIZLLL() {
                            super.LIZLLL();
                            C1298740jtw c1298740jtw = this.LJIIL;
                            if (c1298740jtw == null) {
                                LJIILLIIL(null);
                            } else {
                                LJIILLIIL(c1298740jtw);
                            }
                        }

                        @Override // X.AbstractC1311530kEZ
                        public final void LJ() {
                            super.LJ();
                            C1298740jtw c1298740jtw = this.LJIIL;
                            if (c1298740jtw == null) {
                                LJIILLIIL(null);
                            } else {
                                LJIILLIIL(c1298740jtw);
                            }
                        }

                        public final void LJIILL(C1298740jtw c1298740jtw) {
                            if (LJI() && !this.LJIIIZ) {
                                this.LJIIIZ = true;
                                LJIILIIL("onBegin", LJIILJJIL(0.0f, 0.0f));
                            }
                        }

                        public final void LJIILLIIL(C1298740jtw c1298740jtw) {
                            if (LJII() && !this.LJIIJ && this.LJIIIZ) {
                                this.LJIIJ = true;
                                LJIILIIL("onEnd", LJIILJJIL(0.0f, 0.0f));
                            }
                        }

                        public final HashMap<String, Object> LJIILJJIL(float f, float f2) {
                            this.LJI.put("scrollX", Integer.valueOf(LJIIJJI(this.LJFF.getMemberScrollX())));
                            this.LJI.put("scrollY", Integer.valueOf(LJIIJJI(this.LJFF.getMemberScrollY())));
                            this.LJI.put("deltaX", Integer.valueOf(LJIIJJI(f)));
                            this.LJI.put("deltaY", Integer.valueOf(LJIIJJI(f2)));
                            this.LJI.put("isAtStart", Boolean.valueOf(this.LJFF.isAtBorder(true)));
                            this.LJI.put("isAtEnd", Boolean.valueOf(this.LJFF.isAtBorder(false)));
                            return this.LJI;
                        }

                        public final void LJIIZILJ(float f, float f2, C1311460kES c1311460kES) {
                            HashSet<Integer> hashSet;
                            InterfaceC1311590kEf interfaceC1311590kEf2 = this.LJFF;
                            if (interfaceC1311590kEf2 != null) {
                                interfaceC1311590kEf2.onGestureScrollBy(f, f2);
                            }
                            if (c1311460kES != null) {
                                c1311460kES.LIZLLL = true;
                                c1311460kES.LIZIZ = f;
                                c1311460kES.LIZJ = f2;
                            }
                            if (Math.abs((int) f) > this.LJIIJJI || Math.abs((int) f2) > this.LJIIJJI) {
                                s sVar2 = this.LIZJ;
                                int i3 = this.LIZ;
                                C1311380kEK c1311380kEK = sVar2.LLIZLLLIL;
                                if (c1311380kEK != null && (hashSet = c1311380kEK.LJIJJ) != null) {
                                    hashSet.add(Integer.valueOf(i3));
                                }
                            }
                            if (!LJIIIZ()) {
                                return;
                            }
                            LJIILIIL("onUpdate", LJIILJJIL(f, f2));
                        }

                        public final boolean LJIJ(float f, float f2, C1311460kES c1311460kES) {
                            InterfaceC1311590kEf interfaceC1311590kEf2;
                            if (c1311460kES != null && (interfaceC1311590kEf2 = this.LJFF) != null) {
                                if (c1311460kES.LIZ == -1 && interfaceC1311590kEf2.getScrollContainerDirection() != -1) {
                                    return true;
                                }
                                if (c1311460kES.LIZ == 1 && this.LJFF.getScrollContainerDirection() != 1) {
                                    return true;
                                }
                            }
                            return !this.LJFF.canConsumeGesture(f, f2);
                        }

                        {
                            this.LJIIJJI = 3;
                            ReadableMap readableMap = c1311420kEO.LJ;
                            if (readableMap != null) {
                                this.LJIIJJI = readableMap.getInt("tapSlop", 3);
                            }
                            this.LJI = new HashMap<>();
                        }

                        /* JADX WARN: Removed duplicated region for block: B:101:0x0124  */
                        @Override // X.AbstractC1311530kEZ
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LJIIJ(android.view.MotionEvent r9, X.C1298740jtw r10, float r11, float r12, boolean r13, X.C1311460kES r14) {
                            /*
                                Method dump skipped, instruction units count: 315
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1311540kEa.LJIIJ(android.view.MotionEvent, X.0jtw, float, float, boolean, X.0kES):void");
                        }
                    });
                } else if (i2 == 1) {
                    map2.put(Integer.valueOf(i2), new AbstractC1311530kEZ(i, sVar, c1311420kEO, interfaceC1311590kEf) { // from class: X.0kEc
                        public boolean LJI;
                        public boolean LJII;
                        public boolean LJIIIIZZ;
                        public final HashMap<String, Object> LJIIIZ = new HashMap<>();

                        @Override // X.AbstractC1311530kEZ
                        public final void LJIIL() {
                            this.LIZIZ = 0;
                            this.LJI = false;
                            this.LJII = false;
                            this.LJIIIIZZ = false;
                        }

                        @Override // X.AbstractC1311530kEZ
                        public final void LIZLLL() {
                            super.LIZLLL();
                            LJIILL(null);
                        }

                        @Override // X.AbstractC1311530kEZ
                        public final void LJ() {
                            super.LJ();
                            LJIILL(null);
                        }

                        public final void LJIILL(C1298740jtw c1298740jtw) {
                            if (LJII() && !this.LJIIIIZZ && this.LJI) {
                                this.LJIIIIZZ = true;
                                LJIILIIL("onEnd", LJIILJJIL(0.0f, 0.0f));
                            }
                        }

                        public final HashMap<String, Object> LJIILJJIL(float f, float f2) {
                            this.LJIIIZ.put("scrollX", Integer.valueOf(LJIIJJI(this.LJFF.getMemberScrollX())));
                            this.LJIIIZ.put("scrollY", Integer.valueOf(LJIIJJI(this.LJFF.getMemberScrollY())));
                            this.LJIIIZ.put("deltaX", Integer.valueOf(LJIIJJI(f)));
                            this.LJIIIZ.put("deltaY", Integer.valueOf(LJIIJJI(f2)));
                            this.LJIIIZ.put("isAtStart", Boolean.valueOf(this.LJFF.isAtBorder(true)));
                            this.LJIIIZ.put("isAtEnd", Boolean.valueOf(this.LJFF.isAtBorder(false)));
                            return this.LJIIIZ;
                        }

                        @Override // X.AbstractC1311530kEZ
                        public final void LJIIJ(MotionEvent motionEvent, C1298740jtw c1298740jtw, float f, float f2, boolean z, C1311460kES c1311460kES) {
                            InterfaceC1311590kEf interfaceC1311590kEf2 = this.LJFF;
                            if (interfaceC1311590kEf2 != null) {
                                interfaceC1311590kEf2.onInvalidate();
                            }
                            if (motionEvent != null && (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 2)) {
                                this.LIZIZ = 6;
                                return;
                            }
                            if (motionEvent != null && motionEvent.getActionMasked() == 1) {
                                LIZIZ();
                                if (LJI() && !this.LJI) {
                                    this.LJI = true;
                                    LJIILIIL("onBegin", LJIILJJIL(0.0f, 0.0f));
                                    return;
                                }
                                return;
                            }
                            int i3 = this.LIZIZ;
                            if (i3 >= 3 && i3 <= 5) {
                                LJIILL(null);
                                return;
                            }
                            if (f == Float.MIN_VALUE && f2 == Float.MIN_VALUE) {
                                LJ();
                                LJIILL(null);
                                return;
                            }
                            if (i3 != 0 && i3 != 6) {
                                if (LJIIIZ()) {
                                    LJIILIIL("onUpdate", LJIILJJIL(f, f2));
                                    return;
                                }
                                return;
                            }
                            LIZIZ();
                            LIZ();
                            if (LJI() && !this.LJI) {
                                this.LJI = true;
                                LJIILIIL("onBegin", LJIILJJIL(0.0f, 0.0f));
                            }
                            if (LJIIIIZZ() && !this.LJII && this.LJI) {
                                this.LJII = true;
                                LJIILIIL("onStart", LJIILJJIL(0.0f, 0.0f));
                            }
                        }
                    });
                } else if (i2 == 3) {
                    map2.put(Integer.valueOf(i2), new AbstractC1311530kEZ(i, sVar, c1311420kEO, interfaceC1311590kEf) { // from class: X.0kEd
                        public float LJI;
                        public long LJII;
                        public float LJIIIIZZ = 0.0f;
                        public float LJIIIZ = 0.0f;
                        public float LJIIJ = 0.0f;
                        public float LJIIJJI = 0.0f;
                        public boolean LJIIL = false;
                        public C1298740jtw LJIILIIL = null;
                        public BPEAHandler LJIILJJIL = null;
                        public final ARunnableS120S0100000_20 LJIILL = new ARunnableS120S0100000_20(this, 254);

                        @Override // X.AbstractC1311530kEZ
                        public final void LJIIL() {
                            this.LIZIZ = 0;
                            this.LJIIL = false;
                        }

                        @Override // X.AbstractC1311530kEZ
                        public final void LIZLLL() {
                            super.LIZLLL();
                            LJIILJJIL(this.LJIILIIL);
                        }

                        @Override // X.AbstractC1311530kEZ
                        public final void LJ() {
                            super.LJ();
                            LJIILJJIL(this.LJIILIIL);
                        }

                        public final void LJIILJJIL(C1298740jtw c1298740jtw) {
                            if (LJII() && !this.LJIIL) {
                                this.LJIIL = true;
                                LJIILIIL("onEnd", LJFF(c1298740jtw));
                            }
                        }

                        {
                            this.LJI = C1311130kDv.LIZIZ(10.0f, 0.0f);
                            this.LJII = 500L;
                            ReadableMap readableMap = c1311420kEO.LJ;
                            if (readableMap != null) {
                                this.LJII = readableMap.getLong("maxDuration", 500L);
                                this.LJI = C1311130kDv.LIZIZ(readableMap.getLong("maxDistance", 10L), 0.0f);
                            }
                        }

                        @Override // X.AbstractC1311530kEZ
                        public final void LJIIJ(MotionEvent motionEvent, C1298740jtw c1298740jtw, float f, float f2, boolean z, C1311460kES c1311460kES) {
                            this.LJIILIIL = c1298740jtw;
                            if (motionEvent == null) {
                                this.LIZIZ = 6;
                                BPEAHandler bPEAHandler = this.LJIILJJIL;
                                if (bPEAHandler != null) {
                                    bPEAHandler.removeCallbacksAndMessages(null);
                                    this.LJIILJJIL = null;
                                    return;
                                }
                                return;
                            }
                            if (this.LIZIZ >= 3) {
                                BPEAHandler bPEAHandler2 = this.LJIILJJIL;
                                if (bPEAHandler2 != null) {
                                    bPEAHandler2.removeCallbacksAndMessages(null);
                                    this.LJIILJJIL = null;
                                    return;
                                }
                                return;
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked != 0) {
                                if (actionMasked != 1) {
                                    if (actionMasked == 2) {
                                        this.LJIIJ = motionEvent.getX();
                                        this.LJIIJJI = motionEvent.getY();
                                        float fAbs = Math.abs(this.LJIIJ - this.LJIIIIZZ);
                                        float fAbs2 = Math.abs(this.LJIIJJI - this.LJIIIZ);
                                        float f3 = this.LJI;
                                        if (fAbs > f3 || fAbs2 > f3) {
                                            LJ();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                this.LJIIJ = motionEvent.getX();
                                this.LJIIJJI = motionEvent.getY();
                                if (this.LIZIZ >= 3) {
                                    LJ();
                                } else {
                                    LIZ();
                                    if (LJIIIIZZ()) {
                                        LJIILIIL("onStart", LJFF(c1298740jtw));
                                    }
                                    LJIILJJIL(c1298740jtw);
                                }
                                BPEAHandler bPEAHandler3 = this.LJIILJJIL;
                                if (bPEAHandler3 == null) {
                                    return;
                                }
                                bPEAHandler3.removeCallbacksAndMessages(null);
                                this.LJIILJJIL = null;
                                return;
                            }
                            this.LJIIIIZZ = motionEvent.getX();
                            this.LJIIIZ = motionEvent.getY();
                            this.LJIIL = false;
                            LIZIZ();
                            if (LJI()) {
                                LJIILIIL("onBegin", LJFF(c1298740jtw));
                            }
                            BPEAHandler bPEAHandler4 = this.LJIILJJIL;
                            if (bPEAHandler4 == null) {
                                this.LJIILJJIL = new BPEAHandler(Looper.getMainLooper());
                            } else {
                                bPEAHandler4.removeCallbacksAndMessages(null);
                            }
                            C786410Ut5.LJLIIL(this.LJII, this.LJIILJJIL, this.LJIILL);
                        }
                    });
                } else if (i2 == 4) {
                    map2.put(Integer.valueOf(i2), new C1311580kEe(i, sVar, c1311420kEO, interfaceC1311590kEf));
                } else if (i2 == 7) {
                    map2.put(Integer.valueOf(i2), new C1311550kEb(i, sVar, c1311420kEO, interfaceC1311590kEf) { // from class: X.0kEg
                    });
                }
            }
        }
        return map2;
    }
}

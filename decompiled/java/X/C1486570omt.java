package X;

import android.os.HandlerThread;
import android.text.TextUtils;
import java.lang.Thread;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0omt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486570omt implements InterfaceC1486580omu {
    public static volatile int LIZJ;
    public final C1487730ool LIZ = new InterfaceC1486580omu() { // from class: X.0ool
        public C1487760ooo LIZ;
        public C1487740oom LIZIZ;
        public InterfaceC1487870ooz LIZJ;
        public boolean LIZLLL;

        public final synchronized void LIZLLL() {
            C1487790oor c1487790oor;
            if (this.LIZ == null || this.LIZIZ == null) {
                InterfaceC1487870ooz interfaceC1487870ooz = this.LIZJ;
                if (interfaceC1487870ooz != null) {
                    C1487810oot.LIZ();
                    c1487790oor = C1487810oot.LIZ();
                } else {
                    if (C1487750oon.LIZIZ()) {
                        C1487750oon.LIZ("MediaLogger", "MediaThreadManagerOrigin initialize default settings");
                    }
                    c1487790oor = new C1487790oor(new C1487800oos());
                }
                if (this.LIZ == null) {
                    this.LIZ = new C1487760ooo(c1487790oor);
                    if (C1487750oon.LIZIZ()) {
                        C1487750oon.LIZ("MediaLogger", "MediaThreadManagerOrigin initialize new HandlerThreadPool");
                    }
                }
                if (this.LIZIZ == null && c1487790oor.LIZJ > 0) {
                    this.LIZIZ = new C1487740oom(c1487790oor);
                    if (C1487750oon.LIZIZ()) {
                        C1487750oon.LIZ("MediaLogger", "MediaThreadManagerOrigin initialize new TaskThreadPool");
                    }
                }
            }
        }

        @Override // X.InterfaceC1486580omu
        public final synchronized void release() {
            C1487760ooo c1487760ooo = this.LIZ;
            if (c1487760ooo != null) {
                c1487760ooo.LIZLLL();
            }
            C1487740oom c1487740oom = this.LIZIZ;
            if (c1487740oom != null) {
                if (C1487750oon.LIZIZ()) {
                    C1487750oon.LIZ("MediaLogger", "TaskThreadPool release");
                }
                c1487740oom.LIZ.shutdown();
                c1487740oom.LIZ = null;
            }
            this.LIZ = null;
            this.LIZIZ = null;
        }

        @Override // X.InterfaceC1486580omu
        public final C1481380oeW LIZJ() {
            C1487760ooo c1487760ooo = this.LIZ;
            int i = 0;
            if (c1487760ooo == null) {
                return new C1481380oeW(0, 0, 0);
            }
            int size = c1487760ooo.LJFF.size();
            int size2 = c1487760ooo.LJI.size();
            Iterator<HandlerThreadC1487770oop> it2 = c1487760ooo.LJI.iterator();
            while (it2.hasNext()) {
                if (it2.next().getState() == Thread.State.BLOCKED) {
                    i++;
                }
            }
            return new C1481380oeW(size, size2, i);
        }

        @Override // X.InterfaceC1486580omu
        public final synchronized void init() {
            C1487810oot c1487810oot = C1486540omq.LIZ;
            C1486550omr c1486550omr = C1486540omq.LIZIZ;
            synchronized (this) {
                if (!this.LIZLLL) {
                    if (C1487750oon.LIZIZ()) {
                        C1487750oon.LIZ("MediaLogger", "MediaThreadManagerOrigin init");
                    }
                    this.LIZJ = c1487810oot;
                    C1487750oon.LIZ = c1486550omr;
                    LIZLLL();
                    this.LIZLLL = true;
                }
            }
        }

        @Override // X.InterfaceC1486580omu
        public final synchronized C1480770odX LIZ(EnumC1482310og1 enumC1482310og1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (enumC1482310og1 != null && !TextUtils.isEmpty(enumC1482310og1.getValue())) {
                if (this.LIZ == null) {
                    LIZLLL();
                }
                C1487760ooo c1487760ooo = this.LIZ;
                if (c1487760ooo == null) {
                    return null;
                }
                Pair<Boolean, HandlerThreadC1487770oop> pairLIZ = c1487760ooo.LIZ(enumC1482310og1, jCurrentTimeMillis);
                HandlerThreadC1487770oop second = pairLIZ.getSecond();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(enumC1482310og1.getValue());
                sbLIZ.append(jCurrentTimeMillis);
                C1480770odX c1480770odX = new C1480770odX(second, C2188811AlT.LIZIZ(sbLIZ));
                c1480770odX.LIZJ = pairLIZ.getFirst().booleanValue();
                return c1480770odX;
            }
            if (C1487750oon.LIZIZ()) {
                C1487750oon.LIZ("MediaLogger", "acquireHandlerThread scene null return");
            }
            return null;
        }

        @Override // X.InterfaceC1486580omu
        public final synchronized void LIZIZ(C1480770odX c1480770odX) {
            HandlerThread handlerThread;
            C1487760ooo c1487760ooo;
            if (this.LIZ == null) {
                LIZLLL();
            }
            if (c1480770odX != null && (handlerThread = c1480770odX.LIZ) != null && (c1487760ooo = this.LIZ) != null) {
                c1487760ooo.LIZJ(handlerThread, c1480770odX.LIZIZ);
            }
        }
    };
    public final C1487820oou LIZIZ = new C1487820oou();

    public final InterfaceC1486580omu LIZLLL() {
        return LIZJ != 1 ? this.LIZ : this.LIZIZ;
    }

    @Override // X.InterfaceC1486580omu
    public final C1481380oeW LIZJ() {
        return LIZLLL().LIZJ();
    }

    @Override // X.InterfaceC1486580omu
    public final void init() {
        LIZLLL().init();
    }

    @Override // X.InterfaceC1486580omu
    public final void release() {
        LIZLLL().release();
    }

    @Override // X.InterfaceC1486580omu
    public final C1480770odX LIZ(EnumC1482310og1 enumC1482310og1) {
        return LIZLLL().LIZ(enumC1482310og1);
    }

    @Override // X.InterfaceC1486580omu
    public final void LIZIZ(C1480770odX c1480770odX) {
        LIZLLL().LIZIZ(c1480770odX);
    }
}

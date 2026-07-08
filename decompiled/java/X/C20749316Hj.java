package X;

import android.app.Activity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.16Hj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20749316Hj implements InterfaceC849390XTt {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC849390XTt
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
        }
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
        }
    }

    public static final void LIZ$0(C20749316Hj c20749316Hj) {
        if (!((C15LD) c20749316Hj.l1).LJFF.LIZLLL.isFinishing()) {
            C15LD c15ld = (C15LD) c20749316Hj.l1;
            C1661100tKO c1661100tKOLJFF = c15ld.LJFF.LJFF(c15ld.LIZ, c15ld.LIZJ);
            c1661100tKOLJFF.LJFF = null;
            c1661100tKOLJFF.LJI = null;
            C15LD c15ld2 = (C15LD) c20749316Hj.l1;
            C1661130tKR c1661130tKRLJI = c15ld2.LJFF.LJI(c15ld2.LIZ, c15ld2.LIZJ);
            C15LD c15ld3 = (C15LD) c20749316Hj.l1;
            C15LD c15ld4 = c15ld3.LJFF.LJFF;
            boolean z = c15ld3.LIZIZ;
            c1661130tKRLJI.getClass();
            c1661130tKRLJI.LIZ(null, c15ld4, z, c1661130tKRLJI.LIZ.LIZIZ, false, false);
        }
    }

    public static final void LIZ$1(C20749316Hj c20749316Hj) {
        if (!((Activity) c20749316Hj.l0).isFinishing()) {
            ((Function0) c20749316Hj.l1).invoke();
        }
    }

    public static final void LIZIZ$0(C20749316Hj c20749316Hj) {
        C15LD c15ld = (C15LD) c20749316Hj.l1;
        c15ld.LJFF((C1661050tKJ) c20749316Hj.l0, c15ld.LIZ, c15ld.LIZIZ, c15ld.LIZLLL, c15ld.LJ);
    }

    public static final void LIZIZ$1(C20749316Hj c20749316Hj) {
        ((Function0) c20749316Hj.l1).invoke();
    }

    public C20749316Hj(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

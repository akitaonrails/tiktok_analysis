package X;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.1ACU, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ACU {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;
    public final Function0<Unit> LJI;
    public final Function0<Integer> LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    public C1ACU() {
        this(AFwS224S0000000_33.get$arr$(650), AFwS224S0000000_33.get$arr$(651), AFwS224S0000000_33.get$arr$(652), AFwS224S0000000_33.get$arr$(653), AFwS224S0000000_33.get$arr$(654), AFwS224S0000000_33.get$arr$(655), AFwS224S0000000_33.get$arr$(656), AFwS224S0000000_33.get$arr$(657));
    }

    public final List<Integer> LIZ(int i) {
        if (this.LJIIIIZZ == i) {
            return C13BV.INSTANCE;
        }
        C1ACT c1act = C1ACT.BIND;
        if (i != c1act.getState() && i != C1ACT.BIND_VIEW.getState() && i != C1ACT.SELECTED.getState() && i != C1ACT.RESUME.getState()) {
            if (i != C1ACT.PAUSE.getState() && i != C1ACT.UNSELECTED.getState() && i != C1ACT.UNBIND.getState()) {
                return C13BV.INSTANCE;
            }
            return Collections.singletonList(Integer.valueOf(i));
        }
        if (!this.LJIIIZ) {
            return C13LP.LLIIII(new IntRange(c1act.getState(), i));
        }
        if (i == c1act.getState()) {
            return C13BV.INSTANCE;
        }
        return Collections.singletonList(Integer.valueOf(i));
    }

    public final void LIZIZ(int i) {
        if (i == C1ACT.BIND.getState()) {
            this.LIZ.invoke();
            return;
        }
        if (i == C1ACT.BIND_VIEW.getState()) {
            this.LIZIZ.invoke();
            return;
        }
        if (i == C1ACT.SELECTED.getState()) {
            this.LIZJ.invoke();
            return;
        }
        if (i == C1ACT.RESUME.getState()) {
            this.LIZLLL.invoke();
            return;
        }
        if (i == C1ACT.PAUSE.getState()) {
            this.LJ.invoke();
        } else if (i == C1ACT.UNSELECTED.getState()) {
            this.LJFF.invoke();
        } else {
            if (i != C1ACT.UNBIND.getState()) {
                return;
            }
            this.LJI.invoke();
        }
    }

    public C1ACU(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function0<Integer> function08) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = function03;
        this.LIZLLL = function04;
        this.LJ = function05;
        this.LJFF = function06;
        this.LJI = function07;
        this.LJII = function08;
        this.LJIIIIZZ = C1ACT.INITIALIZING.getState();
    }
}

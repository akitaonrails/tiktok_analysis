package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C391480FWo extends C0W9W {
    public final int $t;
    public Object l0;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            default:
                super.run();
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(C391480FWo c391480FWo) {
        C1C7U.LIZ("TimerTaskUtils@4bb5.addTask$1");
        boolean zLJ = C0W9U.LJ(c391480FWo.bpeaTraceContext);
        try {
            ((Runnable) c391480FWo.l0).run();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("TimerTaskUtils@4bb5.addTask$1");
    }

    public static final void run$1(C391480FWo c391480FWo) {
        C1C7U.LIZ("CommentImageBrushEditorImpl@67b8.applyCutoutBrushMotion$1$1");
        boolean zLJ = C0W9U.LJ(c391480FWo.bpeaTraceContext);
        try {
            C1463670oBx c1463670oBxLIZLLL = ((C354740DvU) c391480FWo.l0).LIZLLL();
            if (c1463670oBxLIZLLL != null) {
                c1463670oBxLIZLLL.refreshCurrentFrame();
            }
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("CommentImageBrushEditorImpl@67b8.applyCutoutBrushMotion$1$1");
    }

    public static final void run$2(C391480FWo c391480FWo) {
        C1C7U.LIZ("StudioToggleASR@da80.throttledVolumeChange$2$invoke$$inlined$throttle$1$1");
        boolean zLJ = C0W9U.LJ(c391480FWo.bpeaTraceContext);
        try {
            ((C259800zU) c391480FWo.l0).element = null;
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("StudioToggleASR@da80.throttledVolumeChange$2$invoke$$inlined$throttle$1$1");
    }

    public static final void run$3(C391480FWo c391480FWo) {
        C1C7U.LIZ("MattingUtils@777b.startFetchAiMattingRes$2$1");
        boolean zLJ = C0W9U.LJ(c391480FWo.bpeaTraceContext);
        try {
            C1524705y1.LIZJ(new AwS549S0100000_5((C118300cf) c391480FWo.l0, 1377));
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("MattingUtils@777b.startFetchAiMattingRes$2$1");
    }

    public static final void run$4(C391480FWo c391480FWo) {
        C1C7U.LIZ("TimerTaskUtils@6b0c.addTask$1");
        boolean zLJ = C0W9U.LJ(c391480FWo.bpeaTraceContext);
        try {
            ((Runnable) c391480FWo.l0).run();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("TimerTaskUtils@6b0c.addTask$1");
    }

    public static final void run$5(C391480FWo c391480FWo) {
        C1C7U.LIZ("LynxPreLayoutManager@ebe2.addData$1");
        boolean zLJ = C0W9U.LJ(c391480FWo.bpeaTraceContext);
        try {
            ((Function0) c391480FWo.l0).invoke();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("LynxPreLayoutManager@ebe2.addData$1");
    }

    public static final void run$6(C391480FWo c391480FWo) {
        C1C7U.LIZ("TimerOperator@4904.startTimer$1");
        boolean zLJ = C0W9U.LJ(c391480FWo.bpeaTraceContext);
        try {
            ((Function0) c391480FWo.l0).invoke();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("TimerOperator@4904.startTimer$1");
    }

    public static final void run$7(C391480FWo c391480FWo) {
        C1C7U.LIZ("CutoutEditorImpl@3770.applyCutoutBrushMotion$2$1");
        boolean zLJ = C0W9U.LJ(c391480FWo.bpeaTraceContext);
        try {
            ((C354730DvT) c391480FWo.l0).LIZ.getPlayer().LJJIIZ(null);
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("CutoutEditorImpl@3770.applyCutoutBrushMotion$2$1");
    }

    public C391480FWo(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

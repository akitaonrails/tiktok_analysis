package X;

import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Mqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581140Mqm implements InterfaceC19515111Wr {
    public final int $t;
    public Object l0;

    public static final void onCanceled$0(C581140Mqm c581140Mqm) {
    }

    public static final void onCanceled$1(C581140Mqm c581140Mqm) {
    }

    public static final void onCanceled$2(C581140Mqm c581140Mqm) {
    }

    public static final void onCanceled$3(C581140Mqm c581140Mqm) {
    }

    public static final void onCanceled$4(C581140Mqm c581140Mqm) {
    }

    public static final void onCanceled$5(C581140Mqm c581140Mqm) {
    }

    public static final void onCanceled$6(C581140Mqm c581140Mqm) {
    }

    public static final void onCanceled$7(C581140Mqm c581140Mqm) {
    }

    @Override // X.InterfaceC19515111Wr
    public final void LIZ(C0HWO... c0hwoArr) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, c0hwoArr);
                break;
            case 1:
                LIZ$1(this, c0hwoArr);
                break;
            case 2:
                LIZ$2(this, c0hwoArr);
                break;
            case 3:
                LIZ$3(this, c0hwoArr);
                break;
            case 4:
                LIZ$4(this, c0hwoArr);
                break;
            case 5:
                LIZ$5(this, c0hwoArr);
                break;
            case 6:
                LIZ$6(this, c0hwoArr);
                break;
            case 7:
                LIZ$7(this, c0hwoArr);
                break;
        }
    }

    @Override // X.InterfaceC19515111Wr
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                onCanceled$1(this);
                break;
            case 2:
                onCanceled$2(this);
                break;
            case 3:
                onCanceled$3(this);
                break;
            case 4:
                onCanceled$4(this);
                break;
            case 5:
                onCanceled$5(this);
                break;
            case 6:
                onCanceled$6(this);
                break;
            case 7:
                onCanceled$7(this);
                break;
        }
    }

    public C581140Mqm(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C581140Mqm c581140Mqm, C0HWO... c0hwoArr) {
        Pair<String[], int[]> pairLIZ = C446440Hf0.LIZ((C0HWO[]) Arrays.copyOf(c0hwoArr, c0hwoArr.length));
        String[] first = pairLIZ.getFirst();
        ((C0LH5) c581140Mqm.l0).LIZ(pairLIZ.getSecond(), first);
    }

    public static final void LIZ$1(C581140Mqm c581140Mqm, C0HWO... c0hwoArr) {
        Pair<String[], int[]> pairLIZ = C446440Hf0.LIZ(c0hwoArr);
        ((C0LH5) c581140Mqm.l0).LIZ(pairLIZ.getSecond(), pairLIZ.getFirst());
    }

    public static final void LIZ$2(C581140Mqm c581140Mqm, C0HWO... c0hwoArr) {
        Pair<String[], int[]> pairLIZ = C446440Hf0.LIZ((C0HWO[]) Arrays.copyOf(c0hwoArr, c0hwoArr.length));
        String[] first = pairLIZ.getFirst();
        ((C0LEH) c581140Mqm.l0).LIZ(pairLIZ.getSecond(), first);
    }

    public static final void LIZ$3(C581140Mqm c581140Mqm, C0HWO... c0hwoArr) {
        Pair<String[], int[]> pairLIZ = C446440Hf0.LIZ((C0HWO[]) Arrays.copyOf(c0hwoArr, c0hwoArr.length));
        String[] first = pairLIZ.getFirst();
        ((C540300LGy) c581140Mqm.l0).LIZ(pairLIZ.getSecond(), first);
    }

    public static final void LIZ$4(C581140Mqm c581140Mqm, C0HWO... c0hwoArr) {
        Pair<String[], int[]> pairLIZ = C446440Hf0.LIZ((C0HWO[]) Arrays.copyOf(c0hwoArr, c0hwoArr.length));
        String[] first = pairLIZ.getFirst();
        ((C540300LGy) c581140Mqm.l0).LIZ(pairLIZ.getSecond(), first);
    }

    public static final void LIZ$5(C581140Mqm c581140Mqm, C0HWO... c0hwoArr) {
        Function0 function0 = (Function0) c581140Mqm.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$6(C581140Mqm c581140Mqm, C0HWO... c0hwoArr) {
        Function1 function1 = (Function1) c581140Mqm.l0;
        if (function1 != null) {
            function1.invoke(C13LQ.LJJLL(c0hwoArr));
        }
    }

    public static final void LIZ$7(C581140Mqm c581140Mqm, C0HWO... c0hwoArr) {
        Pair<String[], int[]> pairLIZ = C446440Hf0.LIZ((C0HWO[]) Arrays.copyOf(c0hwoArr, c0hwoArr.length));
        String[] first = pairLIZ.getFirst();
        ((C1455000nxy) c581140Mqm.l0).LIZ(pairLIZ.getSecond(), first);
    }
}

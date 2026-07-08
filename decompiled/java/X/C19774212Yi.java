package X;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Yi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19774212Yi implements InterfaceC19515111Wr {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onCanceled$1(C19774212Yi c19774212Yi) {
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
        }
    }

    public static final void onCanceled$0(C19774212Yi c19774212Yi) {
        ((C20656615sK) c19774212Yi.l0).LIZ();
        InterfaceC19515111Wr interfaceC19515111Wr = (InterfaceC19515111Wr) c19774212Yi.l1;
        if (interfaceC19515111Wr != null) {
            interfaceC19515111Wr.onCanceled();
        }
    }

    public static final void LIZ$0(C19774212Yi c19774212Yi, C0HWO... c0hwoArr) {
        ((C20656615sK) c19774212Yi.l0).LIZ();
        InterfaceC19515111Wr interfaceC19515111Wr = (InterfaceC19515111Wr) c19774212Yi.l1;
        if (interfaceC19515111Wr != null) {
            interfaceC19515111Wr.LIZ((C0HWO[]) Arrays.copyOf(c0hwoArr, c0hwoArr.length));
        }
    }

    public static final void LIZ$1(C19774212Yi c19774212Yi, C0HWO... c0hwoArr) {
        Boolean boolValueOf;
        int length = c0hwoArr.length;
        int i = 0;
        while (true) {
            boolValueOf = null;
            if (i >= length) {
                break;
            }
            C0HWO c0hwo = c0hwoArr[i];
            if (Intrinsics.LJFF(c0hwo.LIZ, "android.permission.BLUETOOTH_CONNECT")) {
                boolValueOf = Boolean.valueOf(c0hwo.LIZ());
                break;
            }
            i++;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            ((Function0) c19774212Yi.l0).invoke();
        } else {
            ((Function0) c19774212Yi.l1).invoke();
        }
    }

    public C19774212Yi(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

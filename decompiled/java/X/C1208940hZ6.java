package X;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hZ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208940hZ6 implements InterfaceC19515111Wr {
    public final int $t;
    public Object l0;

    public static final void onCanceled$0(C1208940hZ6 c1208940hZ6) {
    }

    public static final void onCanceled$1(C1208940hZ6 c1208940hZ6) {
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

    public C1208940hZ6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C1208940hZ6 c1208940hZ6, C0HWO... c0hwoArr) {
        int length = c0hwoArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C0HWO c0hwo = c0hwoArr[i];
            if (Intrinsics.LJFF(c0hwo.LIZ, "android.permission.ACCESS_FINE_LOCATION")) {
                if (c0hwo.LIZ()) {
                    InterfaceC1207030hW1 interfaceC1207030hW1 = (InterfaceC1207030hW1) c1208940hZ6.l0;
                    if (interfaceC1207030hW1 != null) {
                        interfaceC1207030hW1.LIZ();
                        return;
                    }
                    return;
                }
            } else {
                i++;
            }
        }
        InterfaceC1207030hW1 interfaceC1207030hW12 = (InterfaceC1207030hW1) c1208940hZ6.l0;
        if (interfaceC1207030hW12 == null) {
            return;
        }
        interfaceC1207030hW12.LIZJ(1);
    }

    public static final void LIZ$1(C1208940hZ6 c1208940hZ6, C0HWO... c0hwoArr) {
        EnumC1207930hXT enumC1207930hXT;
        ArrayList arrayList = new ArrayList();
        for (C0HWO c0hwo : c0hwoArr) {
            int i = C449240HjW.LIZ[c0hwo.LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        enumC1207930hXT = EnumC1207930hXT.DeniedPermanently;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    enumC1207930hXT = EnumC1207930hXT.Denied;
                }
            } else {
                enumC1207930hXT = EnumC1207930hXT.Granted;
            }
            arrayList.add(new Pair(c0hwo.LIZ, enumC1207930hXT));
        }
        InterfaceC1208110hXl interfaceC1208110hXl = (InterfaceC1208110hXl) c1208940hZ6.l0;
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        interfaceC1208110hXl.LIZIZ((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}

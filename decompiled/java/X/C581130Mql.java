package X;

import android.app.Activity;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Mql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581130Mql implements InterfaceC19515111Wr {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onCanceled$0(C581130Mql c581130Mql) {
    }

    public static final void onCanceled$1(C581130Mql c581130Mql) {
    }

    public static final void onCanceled$2(C581130Mql c581130Mql) {
    }

    public static final void onCanceled$3(C581130Mql c581130Mql) {
    }

    public static final void onCanceled$4(C581130Mql c581130Mql) {
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
        }
    }

    public static final void LIZ$0(C581130Mql c581130Mql, C0HWO... c0hwoArr) {
        for (C0HWO c0hwo : c0hwoArr) {
            if (C0LHI.LIZ[c0hwo.LIZIZ.ordinal()] == 1) {
                ((Function0) c581130Mql.l0).invoke();
            } else {
                ((Function0) c581130Mql.l1).invoke();
            }
        }
    }

    public static final void LIZ$1(C581130Mql c581130Mql, C0HWO... c0hwoArr) {
        if (c0hwoArr.length != 0 && c0hwoArr[0].LIZIZ == EnumC442280HVy.GRANTED) {
            ((Function0) c581130Mql.l1).invoke();
        } else {
            ((Function0) c581130Mql.l0).invoke();
        }
    }

    public static final void LIZ$2(C581130Mql c581130Mql, C0HWO... c0hwoArr) {
        EnumC442280HVy enumC442280HVy;
        C0HWO c0hwo = (C0HWO) C13LQ.LJJIFFI(c0hwoArr);
        if (c0hwo != null && (enumC442280HVy = c0hwo.LIZIZ) != null) {
            int i = C540270LGv.LIZ[enumC442280HVy.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C341530DaB c341530DaB = C341530DaB.LIZ;
                    Activity activity = (Activity) c581130Mql.l1;
                    c341530DaB.getClass();
                    C341530DaB.LIZ(activity);
                    return;
                }
                return;
            }
            ((Function0) c581130Mql.l0).invoke();
        }
    }

    public static final void LIZ$3(C581130Mql c581130Mql, C0HWO... c0hwoArr) {
        for (C0HWO c0hwo : c0hwoArr) {
            if (c0hwo.LIZIZ == EnumC442280HVy.GRANTED) {
                C540060LGa c540060LGa = C540060LGa.LIZ;
                List list = (List) c581130Mql.l0;
                Function0 function0 = (Function0) c581130Mql.l1;
                c540060LGa.getClass();
                C540060LGa.LIZ(list, function0);
            } else {
                ((Function0) c581130Mql.l1).invoke();
            }
        }
    }

    public static final void LIZ$4(C581130Mql c581130Mql, C0HWO... c0hwoArr) {
        for (C0HWO c0hwo : c0hwoArr) {
            if (c0hwo.LIZIZ != EnumC442280HVy.GRANTED) {
                ((Function0) c581130Mql.l1).invoke();
                return;
            }
        }
        ((Function0) c581130Mql.l0).invoke();
    }

    public C581130Mql(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}

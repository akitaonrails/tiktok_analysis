package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IDn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C462970IDn implements InterfaceC19515111Wr {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onCanceled$0(C462970IDn c462970IDn) {
    }

    public static final void onCanceled$1(C462970IDn c462970IDn) {
    }

    public static final void onCanceled$2(C462970IDn c462970IDn) {
    }

    public static final void onCanceled$3(C462970IDn c462970IDn) {
    }

    public static final void onCanceled$4(C462970IDn c462970IDn) {
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

    public static final void LIZ$0(C462970IDn c462970IDn, C0HWO... c0hwoArr) {
        for (C0HWO c0hwo : c0hwoArr) {
            if (Intrinsics.LJFF(c0hwo.LIZ, "android.permission.RECORD_AUDIO")) {
                int i = C449060HjE.LIZ[c0hwo.LIZIZ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ((Function0) c462970IDn.l1).invoke();
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        ((Function0) c462970IDn.l1).invoke();
                    }
                } else {
                    ((Function0) c462970IDn.l0).invoke();
                }
            }
        }
    }

    public static final void LIZ$1(C462970IDn c462970IDn, C0HWO... c0hwoArr) {
        Function1 function1 = (Function1) c462970IDn.l0;
        if (function1 != null) {
            function1.invoke(c0hwoArr);
        }
        Function2 function2 = (Function2) c462970IDn.l1;
        for (C0HWO c0hwo : c0hwoArr) {
            if (function2 != null) {
                function2.invoke(c0hwo.LIZ, c0hwo.LIZIZ);
            }
        }
    }

    public static final void LIZ$2(C462970IDn c462970IDn, C0HWO... c0hwoArr) {
        EnumC442280HVy enumC442280HVy;
        C0HWO c0hwo = (C0HWO) C13LQ.LJJIFFI(c0hwoArr);
        if (c0hwo == null || (enumC442280HVy = c0hwo.LIZIZ) == null) {
            enumC442280HVy = EnumC442280HVy.THIS_OPERATION_NOT_PERMITTED;
        }
        int i = C449160HjO.LIZ[enumC442280HVy.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C449180HjQ c449180HjQ = C449180HjQ.LIZ;
                    Activity activity = (Activity) c462970IDn.l1;
                    c449180HjQ.getClass();
                    C449180HjQ.LIZ(activity);
                    ((Function1) c462970IDn.l0).invoke(Boolean.FALSE);
                    return;
                }
                throw new C1954807lC();
            }
            ((Function1) c462970IDn.l0).invoke(Boolean.FALSE);
            return;
        }
        ((Function1) c462970IDn.l0).invoke(Boolean.TRUE);
    }

    public static final void LIZ$3(C462970IDn c462970IDn, C0HWO... c0hwoArr) {
        int i = C449200HjS.LIZ[c0hwoArr[0].LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C449180HjQ c449180HjQ = C449180HjQ.LIZ;
                    Activity activity = (Activity) c462970IDn.l1;
                    c449180HjQ.getClass();
                    C449180HjQ.LIZIZ(activity);
                    ((Function1) c462970IDn.l0).invoke(Boolean.FALSE);
                    return;
                }
                throw new C1954807lC();
            }
            ((Function1) c462970IDn.l0).invoke(Boolean.FALSE);
            return;
        }
        ((Function1) c462970IDn.l0).invoke(Boolean.TRUE);
    }

    public static final void LIZ$4(C462970IDn c462970IDn, C0HWO... c0hwoArr) {
        for (C0HWO c0hwo : c0hwoArr) {
            int i = C446390Hev.LIZ[c0hwo.LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new C1954807lC();
                }
                ShareDependService.LIZ.getClass();
                ShareDependServiceImpl.LJJJJI().LJJJI((Activity) c462970IDn.l1, null);
            } else {
                ((Function1) c462970IDn.l0).invoke(Boolean.TRUE);
            }
        }
    }

    public C462970IDn(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}

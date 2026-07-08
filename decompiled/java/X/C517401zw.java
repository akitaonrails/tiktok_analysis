package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01zw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C517401zw implements InterfaceC19483011Ki {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC19483011Ki
    public final boolean test(Object obj) {
        switch (this.$t) {
            case 0:
                return test$0(this, obj);
            case 1:
                return test$1(this, obj);
            case 2:
                return test$2(this, obj);
            case 3:
                return test$3(this, obj);
            case 4:
                return test$4(this, obj);
            case 5:
                return test$5(this, obj);
            default:
                return false;
        }
    }

    public C517401zw(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean test$0(C517401zw c517401zw, Object obj) {
        return Intrinsics.LJFF(((AbstractC1387200mCc) obj).LIZIZ(), (C19EG) c517401zw.l0);
    }

    public static final boolean test$1(C517401zw c517401zw, Object obj) {
        C257100z3 c257100z3 = (C257100z3) obj;
        User userLIZJ = ((InterfaceC434201mW) c517401zw.l0).LIZJ();
        if (userLIZJ != null && c257100z3.LIZ.LIZ == userLIZJ.getId()) {
            return true;
        }
        return false;
    }

    public static final boolean test$2(C517401zw c517401zw, Object obj) {
        return ((Boolean) ((Function1) c517401zw.l0).invoke(obj)).booleanValue();
    }

    public static final boolean test$3(C517401zw c517401zw, Object obj) {
        return ((Boolean) ((Function1) c517401zw.l0).invoke(obj)).booleanValue();
    }

    public static final boolean test$4(C517401zw c517401zw, Object obj) {
        return ((Boolean) ((Function1) c517401zw.l0).invoke(obj)).booleanValue();
    }

    public static final boolean test$5(C517401zw c517401zw, Object obj) {
        return ((Boolean) ((Function1) c517401zw.l0).invoke(obj)).booleanValue();
    }
}

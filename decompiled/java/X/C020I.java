package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.controller.ChangeStateReq;
import tikcast.linkmic.controller.ChangeStateResp;

/* JADX INFO: renamed from: X.020I, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020I extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C020I c020i, Object obj) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) c020i.l0), null, null, new C446501oV(((Number) obj).intValue(), (Context) c020i.l1, (LifecycleOwner) c020i.l0, null, (Function1) c020i.l2, (Function1) c020i.l3), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(C020I c020i, Object obj) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) c020i.l0), null, null, new C447101ob(((Number) obj).intValue(), (Context) c020i.l1, (LifecycleOwner) c020i.l0, null, (Function1) c020i.l2, (Function1) c020i.l3), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(C020I c020i, Object obj) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) c020i.l0), null, null, new C447501of(((Number) obj).intValue(), (Context) c020i.l1, (LifecycleOwner) c020i.l0, null, (Function1) c020i.l2, (Function1) c020i.l3), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$3(C020I c020i, Object obj) {
        boolean z;
        ChangeStateResp changeStateResp = (ChangeStateResp) obj;
        InterfaceC490201vY interfaceC490201vY = ((C490301vZ) c020i.l0).LL;
        int i = ((ChangeStateReq) c020i.l1).stateType;
        int i2 = 0;
        if (changeStateResp != null && changeStateResp.result == 1) {
            z = true;
        } else {
            z = false;
        }
        interfaceC490201vY.LIZ(i, z);
        ((C490301vZ) c020i.l0).LL.LIZIZ(2, (ChangeStateReq) c020i.l1);
        Function1 function1 = (Function1) c020i.l2;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        int i3 = ((ChangeStateReq) c020i.l1).stateType;
        C926820aE4 c926820aE4 = (C926820aE4) c020i.l3;
        if (c926820aE4 != null) {
            i2 = c926820aE4.statusCode;
        }
        C505301xz.LIZ(i3, 1, i2, null);
        return Unit.LIZ;
    }

    public static final Object invoke$4(C020I c020i, Object obj) {
        return ((C490301vZ) c020i.l0).LIZIZ((C490701vd) obj, (ChangeStateReq) c020i.l1, (C490701vd) c020i.l2, (Throwable) c020i.l3);
    }

    public static final Object invoke$5(C020I c020i, Object obj) {
        return ((C490301vZ) c020i.l0).LIZIZ((C490701vd) obj, (ChangeStateReq) c020i.l1, (C490701vd) c020i.l2, (Throwable) c020i.l3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020I(C490301vZ c490301vZ, ChangeStateReq changeStateReq, C490701vd c490701vd, Throwable th, int i) {
        super(1);
        this.$t = i;
        this.l0 = c490301vZ;
        this.l1 = changeStateReq;
        this.l2 = c490701vd;
        this.l3 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020I(C490301vZ c490301vZ, C490301vZ c490301vZ2, ChangeStateReq changeStateReq, Function1<? super Boolean, Unit> function1, C926820aE4<ChangeStateResp> c926820aE4) {
        super(1);
        this.$t = c926820aE4;
        this.l0 = c490301vZ;
        this.l1 = c490301vZ2;
        this.l2 = changeStateReq;
        this.l3 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020I(Context context, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12, int i) {
        super(1);
        this.$t = i;
        this.l0 = lifecycleOwner;
        this.l1 = context;
        this.l2 = function1;
        this.l3 = function12;
    }
}

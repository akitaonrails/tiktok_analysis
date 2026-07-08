package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.020F, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020F extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C020F c020f, Object obj, Object obj2) {
        if (((View) c020f.l1) == obj && Intrinsics.LJFF(c020f.s0, obj2)) {
            ((Function0) c020f.l2).invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(X.C020F r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C020F.invoke$1(X.020F, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020F(C953600avG c953600avG, C953610avH c953610avH, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = c953610avH;
        this.s0 = str;
        this.l2 = c953600avG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020F(View view, View view2, String str, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l1 = view;
        this.s0 = view2;
        this.l2 = str;
    }
}

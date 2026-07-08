package Y;

import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import com.bytedance.android.live.broadcast.stablemode.ModuleDecision;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public class AgS102S1100000_12 implements InterfaceC346701Wf {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS102S1100000_12(Object obj, Function2<? super Boolean, ? super ModuleDecision, Unit> function2, String str) {
        this.$t = str;
        this.l1 = obj;
        this.s0 = function2;
    }

    public static final Object emit$0(AgS102S1100000_12 agS102S1100000_12, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ModuleDecision moduleDecision = (ModuleDecision) obj;
        ((Function2) agS102S1100000_12.l1).invoke(Boolean.valueOf(moduleDecision.features.contains(agS102S1100000_12.s0)), moduleDecision);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS102S1100000_12 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C776030UcL
            if (r0 == 0) goto L42
            r5 = r8
            X.0UcL r5 = (X.C776030UcL) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L48
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l1
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r0 = r7
            com.bytedance.android.live.broadcast.stablemode.ModuleDecision r0 = (com.bytedance.android.live.broadcast.stablemode.ModuleDecision) r0
            java.lang.String r1 = r0.module
            java.lang.String r0 = r6.s0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L22
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L42:
            X.0UcL r5 = new X.0UcL
            r5.<init>(r6, r8)
            goto L12
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS102S1100000_12.emit$1(Y.AgS102S1100000_12, java.lang.Object, X.05Vn):java.lang.Object");
    }
}

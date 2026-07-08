package X;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05ac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1379605ac {
    public static final boolean LIZLLL(C20067313fT c20067313fT) {
        List<C20066813fO> list = c20067313fT.LIZ;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C20066813fO) ListProtector.get(list, i)).LJIIIIZZ != 2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004b -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.C05ZT r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C1379905af
            if (r0 == 0) goto L4e
            r7 = r9
            X.05af r7 = (X.C1379905af) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r6 = r7.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r4 = 1
            if (r0 == 0) goto L3e
            if (r0 != r4) goto L55
            X.05ZT r8 = r7.LL
            X.C155000ia.LIZIZ(r6)
        L24:
            X.13fT r6 = (X.C20067313fT) r6
            java.util.List<X.13fO> r3 = r6.LIZ
            int r2 = r3.size()
            r1 = 0
        L2d:
            if (r1 >= r2) goto L54
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            X.13fO r0 = (X.C20066813fO) r0
            boolean r0 = X.C05ZS.LIZ(r0)
            if (r0 == 0) goto L41
            int r1 = r1 + 1
            goto L2d
        L3e:
            X.C155000ia.LIZIZ(r6)
        L41:
            X.13fE r0 = X.EnumC20065813fE.Main
            r7.LL = r8
            r7.LLILLL = r4
            java.lang.Object r6 = r8.LJJIJIL(r0, r7)
            if (r6 != r5) goto L24
            return r5
        L4e:
            X.05af r7 = new X.05af
            r7.<init>(r9)
            goto L12
        L54:
            return r6
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1379605ac.LIZ(X.05ZT, X.05Vn):java.lang.Object");
    }

    public static final InterfaceC1685750ty9 LJ(C1685760tyA c1685760tyA, final Function1 function1) {
        return C1679720toQ.LIZ(c1685760tyA, 8675309, new PointerInputEventHandler() { // from class: X.05aY
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                Object objLJJJLIIL = interfaceC1369205Xm.LJJJLIIL(new C1379105aX(function1, null), interfaceC1364105Vn);
                if (objLJJJLIIL == C099R.LJFF()) {
                    return objLJJJLIIL;
                }
                return Unit.LIZ;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6 A[Catch: CancellationException -> 0x00ce, TryCatch #0 {CancellationException -> 0x00ce, blocks: (B:30:0x009b, B:31:0x009e, B:33:0x00a6, B:35:0x00b2, B:37:0x00be, B:38:0x00c1, B:39:0x00c4, B:40:0x00c8, B:20:0x0059, B:21:0x005c, B:23:0x0060, B:27:0x007d, B:17:0x0040), top: B:46:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8 A[Catch: CancellationException -> 0x00ce, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00ce, blocks: (B:30:0x009b, B:31:0x009e, B:33:0x00a6, B:35:0x00b2, B:37:0x00be, B:38:0x00c1, B:39:0x00c4, B:40:0x00c8, B:20:0x0059, B:21:0x005c, B:23:0x0060, B:27:0x007d, B:17:0x0040), top: B:46:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZJ(X.C05ZT r11, X.C05ZY r12, X.C20067313fT r13, X.InterfaceC1364105Vn r14) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1379605ac.LIZJ(X.05ZT, X.05ZY, X.13fT, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(X.C05ZT r13, X.InterfaceC1380005ag r14, X.C1379505ab r15, X.C20067313fT r16, X.InterfaceC1364105Vn r17) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1379605ac.LIZIZ(X.05ZT, X.05ag, X.05ab, X.13fT, X.05Vn):java.lang.Object");
    }
}

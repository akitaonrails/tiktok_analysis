package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.touchpoint.api.model.TaskInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS142S1100000_28;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896450zRz {
    public static void LIZ(final C1896450zRz c1896450zRz, final String str, final int i, final long j, final AwS142S1100000_28 awS142S1100000_28, final AwS142S1100000_28 awS142S1100000_282) {
        final TaskInfo taskInfo = null;
        c1896450zRz.getClass();
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0zRu
            public final /* synthetic */ Boolean LIZ = null;
            public final /* synthetic */ JSONObject LIZIZ = null;
            public final /* synthetic */ boolean LJI = true;

            /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: all -> 0x0156, PHI: r4 r5
              0x0067: PHI (r4v16 java.lang.String) = (r4v14 java.lang.String), (r4v17 java.lang.String) binds: [B:27:0x0065, B:25:0x0061] A[DONT_GENERATE, DONT_INLINE]
              0x0067: PHI (r5v20 int) = (r5v15 int), (r5v21 int) binds: [B:27:0x0065, B:25:0x0061] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0156, blocks: (B:3:0x000e, B:5:0x001e, B:7:0x0024, B:11:0x0031, B:13:0x0039, B:14:0x003d, B:18:0x0048, B:20:0x0058, B:28:0x0067, B:29:0x006c, B:31:0x007f, B:33:0x0085, B:35:0x009a, B:26:0x0063, B:36:0x00a2, B:41:0x00d5, B:43:0x00f0, B:51:0x00ff, B:52:0x0104, B:54:0x0117, B:56:0x011d, B:58:0x0132, B:49:0x00fb, B:59:0x0139, B:61:0x013f, B:63:0x0145, B:65:0x014f), top: B:86:0x000e }] */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00ff A[Catch: all -> 0x0156, PHI: r4 r5
              0x00ff: PHI (r4v11 java.lang.String) = (r4v9 java.lang.String), (r4v12 java.lang.String) binds: [B:50:0x00fd, B:48:0x00f9] A[DONT_GENERATE, DONT_INLINE]
              0x00ff: PHI (r5v11 int) = (r5v6 int), (r5v12 int) binds: [B:50:0x00fd, B:48:0x00f9] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0156, blocks: (B:3:0x000e, B:5:0x001e, B:7:0x0024, B:11:0x0031, B:13:0x0039, B:14:0x003d, B:18:0x0048, B:20:0x0058, B:28:0x0067, B:29:0x006c, B:31:0x007f, B:33:0x0085, B:35:0x009a, B:26:0x0063, B:36:0x00a2, B:41:0x00d5, B:43:0x00f0, B:51:0x00ff, B:52:0x0104, B:54:0x0117, B:56:0x011d, B:58:0x0132, B:49:0x00fb, B:59:0x0139, B:61:0x013f, B:63:0x0145, B:65:0x014f), top: B:86:0x000e }] */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0167  */
            @Override // X.InterfaceC1478005qU
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void subscribe(X.C09AJ<X.C1896420zRw> r27) {
                /*
                    Method dump skipped, instruction units count: 513
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1896400zRu.subscribe(X.09AJ):void");
            }
        }).LJJLIIIJLJLI(new C1900160zXy(2, 3000L)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<C1896420zRw>() { // from class: X.0zRy
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
                Function1<C1896420zRw, Unit> function1 = awS142S1100000_282;
                int i2 = 100000;
                if (function1 != null) {
                    function1.invoke(new C1896420zRw(100000, null));
                }
                try {
                    String message = th.getMessage();
                    if (message != null) {
                        i2 = CastIntegerProtector.parseInt(message);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                String str2 = str;
                c1893680zNW.getClass();
                C1893680zNW.LIZJ(i2, str2);
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(C1896420zRw c1896420zRw) {
                C1896420zRw c1896420zRw2 = c1896420zRw;
                if (c1896420zRw2.LIZ == 0) {
                    Function1<C1896420zRw, Unit> function1 = awS142S1100000_28;
                    if (function1 != null) {
                        function1.invoke(c1896420zRw2);
                        return;
                    }
                    return;
                }
                Function1<C1896420zRw, Unit> function12 = awS142S1100000_282;
                if (function12 == null) {
                    return;
                }
                function12.invoke(c1896420zRw2);
            }
        });
    }
}

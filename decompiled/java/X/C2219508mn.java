package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdAndElementViewModel;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08mn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdAndElementViewModel$stickerHasFace$2", f = "IdAndElementViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2219508mn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ IdAndElementViewModel LLILLJJLI;
    public final /* synthetic */ File LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2219508mn(String str, IdAndElementViewModel idAndElementViewModel, File file, InterfaceC1364105Vn<? super C2219508mn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = idAndElementViewModel;
        this.LLILLL = file;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2219508mn(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[PHI: r0
      0x0048: PHI (r0v3 java.io.File) = (r0v2 java.io.File), (r0v7 java.io.File) binds: [B:19:0x0046, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "IdAndElementViewModel@a6fe.stickerHasFace$2"
            X.C1C7U.LIZ(r5)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r7)
            r4 = 0
            X.0HLI r2 = X.C0HLI.LIZ     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L3b X.C0HKR -> L40 java.lang.Throwable -> L57
            java.lang.String r1 = r6.LL     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L3b X.C0HKR -> L40 java.lang.Throwable -> L57
            X.08mp r0 = X.EnumC2219708mp.ONLY_FACE     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L3b X.C0HKR -> L40 java.lang.Throwable -> L57
            r2.getClass()     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L3b X.C0HKR -> L40 java.lang.Throwable -> L57
            X.C0HLI.LJIIIIZZ(r1, r0, r4)     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L3b X.C0HKR -> L40 java.lang.Throwable -> L57
            java.io.File r0 = r6.LLILLL
            if (r0 == 0) goto L23
            boolean r0 = r0.delete()
            java.lang.Boolean.valueOf(r0)
        L23:
            r4 = 1
            goto L4f
        L25:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L57
            com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdAndElementViewModel r0 = r6.LLILLJJLI     // Catch: java.lang.Throwable -> L57
            X.0zpH r2 = r0.getLogger()     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "IdAndElementViewModel"
            java.lang.String r0 = "Sticker face detection failed unexpectedly"
            r2.LIZJ(r1, r0, r3)     // Catch: java.lang.Throwable -> L57
            java.io.File r0 = r6.LLILLL
            if (r0 == 0) goto L4f
            goto L48
        L3b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L57
            throw r0     // Catch: java.lang.Throwable -> L57
        L40:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L57
            java.io.File r0 = r6.LLILLL
            if (r0 == 0) goto L4f
        L48:
            boolean r0 = r0.delete()
            java.lang.Boolean.valueOf(r0)
        L4f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            X.C1C7U.LIZIZ(r5)
            return r0
        L57:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L57
            java.io.File r0 = r6.LLILLL
            if (r0 == 0) goto L66
            boolean r0 = r0.delete()
            java.lang.Boolean.valueOf(r0)
        L66:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2219508mn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

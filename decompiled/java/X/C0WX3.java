package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WX3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {114, 121}, m = "invokeSuspend")
public final class C0WX3 extends C09AX implements Function2<InterfaceC346701Wf<? super Float>, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC824740WWy LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ ContentResolver LLILZ;
    public final /* synthetic */ Uri LLILZIL;
    public final /* synthetic */ C0WX4 LLILZLL;
    public final /* synthetic */ C095E<Unit> LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WX3(ContentResolver contentResolver, Uri uri, C0WX4 c0wx4, C095E<Unit> c095e, Context context, InterfaceC1364105Vn<? super C0WX3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = contentResolver;
        this.LLILZIL = uri;
        this.LLILZLL = c0wx4;
        this.LLIZ = c095e;
        this.LLIZLLLIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0WX3 c0wx3 = new C0WX3(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c0wx3.LLILLL = obj;
        return c0wx3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:17:0x004e, B:19:0x0056, B:29:0x0087), top: B:37:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0075 -> B:34:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:? -> B:30:0x008b). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L2a
            if (r0 == r4) goto L20
            if (r0 != r5) goto L18
            X.0WWy r7 = r8.LL
            java.lang.Object r3 = r8.LLILLL
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L86
            goto L41
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L20:
            X.0WWy r7 = r8.LL
            java.lang.Object r3 = r8.LLILLL
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L86
            goto L4e
        L2a:
            X.C155000ia.LIZIZ(r9)
            java.lang.Object r3 = r8.LLILLL
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            android.content.ContentResolver r7 = r8.LLILZ
            android.net.Uri r2 = r8.LLILZIL
            r1 = 0
            X.0WX4 r0 = r8.LLILZLL
            r7.registerContentObserver(r2, r1, r0)
            X.095E<kotlin.Unit> r0 = r8.LLIZ     // Catch: java.lang.Throwable -> L86
            X.0WWy r7 = r0.iterator()     // Catch: java.lang.Throwable -> L86
        L41:
            r8.LLILLL = r3     // Catch: java.lang.Throwable -> L84
            r8.LL = r7     // Catch: java.lang.Throwable -> L84
            r8.LLILLJJLI = r4     // Catch: java.lang.Throwable -> L84
            java.lang.Object r9 = r7.LIZ(r8)     // Catch: java.lang.Throwable -> L84
            if (r9 != r6) goto L4e
            goto L78
        L4e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L8b
            boolean r0 = r9.booleanValue()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L7a
            r7.next()     // Catch: java.lang.Throwable -> L8b
            android.content.Context r0 = r8.LLIZLLLIL     // Catch: java.lang.Throwable -> L8b
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "animator_duration_scale"
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = android.provider.Settings.Global.getFloat(r2, r1, r0)     // Catch: java.lang.Throwable -> L8b
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r0)     // Catch: java.lang.Throwable -> L8b
            r8.LLILLL = r3     // Catch: java.lang.Throwable -> L8b
            r8.LL = r7     // Catch: java.lang.Throwable -> L8b
            r8.LLILLJJLI = r5     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r3.emit(r0, r8)     // Catch: java.lang.Throwable -> L8b
            if (r0 != r6) goto L41
            goto L79
        L78:
            return r6
        L79:
            return r6
        L7a:
            android.content.ContentResolver r1 = r8.LLILZ
            X.0WX4 r0 = r8.LLILZLL
            r1.unregisterContentObserver(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L84:
            r2 = move-exception
            goto L87
        L86:
            r2 = move-exception
        L87:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L8b
            goto L8d
        L8b:
            r2 = move-exception
            goto L87
        L8d:
            android.content.ContentResolver r1 = r8.LLILZ
            X.0WX4 r0 = r8.LLILZLL
            r1.unregisterContentObserver(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WX3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Float> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

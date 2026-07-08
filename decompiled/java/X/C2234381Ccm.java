package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Ccm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234381Ccm extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C2234371Ccl LLILLJJLI;
    public final /* synthetic */ Throwable LLILLL;
    public final /* synthetic */ Function1<LinkMicCrossLinker, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2234381Ccm(boolean z, C2234371Ccl c2234371Ccl, Throwable th, Function1<? super LinkMicCrossLinker, Unit> function1) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c2234371Ccl;
        this.LLILLL = th;
        this.LLILZ = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
        /*
            r5 = this;
            boolean r0 = r5.LL
            if (r0 != 0) goto Lf
            X.1Ccl r0 = r5.LLILLJJLI
            boolean r0 = r0.LJIIL()
            if (r0 == 0) goto Lf
        Lc:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lf:
            X.1Ccl r4 = r5.LLILLJJLI
            java.lang.Throwable r3 = r5.LLILLL
            kotlin.jvm.functions.Function1<com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker, kotlin.Unit> r2 = r5.LLILZ
            java.lang.Class<kotlin.Unit> r1 = kotlin.Unit.class
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L2b
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L21:
            if (r0 != 0) goto L58
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Unit"
            r1.<init>(r0)
            throw r1
        L2b:
            java.lang.Class<kotlin.Unit> r1 = kotlin.Unit.class
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L37
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L21
        L37:
            java.lang.Class<kotlin.Unit> r1 = kotlin.Unit.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 == r0) goto L58
            java.lang.Class<kotlin.Unit> r1 = kotlin.Unit.class
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L46
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L21
        L46:
            java.lang.Class<kotlin.Unit> r1 = kotlin.Unit.class
            java.lang.Class<java.util.List> r0 = java.util.List.class
            if (r1 != r0) goto L4f
            X.13BV r0 = X.C13BV.INSTANCE
            goto L21
        L4f:
            java.lang.Class<kotlin.Unit> r1 = kotlin.Unit.class
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            if (r1 != r0) goto L68
            kotlin.Unit r0 = kotlin.Unit.LIZ
            goto L21
        L58:
            boolean r0 = r4.LJIIL()
            if (r0 == 0) goto L62
            X.C1304630k3R.LIZIZ(r3)
            goto Lc
        L62:
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker r0 = r4.LIZ
            r2.invoke(r0)
            goto Lc
        L68:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported return type when linker destroyed."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234381Ccm.invoke():java.lang.Object");
    }
}

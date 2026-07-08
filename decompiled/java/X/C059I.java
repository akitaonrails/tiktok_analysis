package X;

import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.059I, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.TextImageForwardResolver$generateConsumeImageList$2$1$1$2", f = "TextImageForwardResolver.kt", l = {854, 859}, m = "invokeSuspend")
public final class C059I extends C09AX implements InterfaceC1631630sYr<List<? extends TextImageTaskInfo>, Boolean, Integer, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public /* synthetic */ int LLILLL;
    public final /* synthetic */ Function1<Integer, Unit> LLILZ;
    public final /* synthetic */ InterfaceC20236714Gf<List<TextImageTaskInfo>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C059I(Function1<? super Integer, Unit> function1, InterfaceC20236714Gf<? super List<TextImageTaskInfo>> interfaceC20236714Gf, InterfaceC1364105Vn<? super C059I> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILZ = function1;
        this.LLILZIL = interfaceC20236714Gf;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "TextImageForwardResolver@7aa9.generateConsumeImageList$2$1$1$2"
            X.C1C7U.LIZ(r10)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r11.LL
            r8 = 0
            r9 = 100
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L31
            if (r0 == r5) goto L59
            if (r0 != r6) goto L92
            java.lang.Object r4 = r11.LLILLJJLI
            X.C155000ia.LIZIZ(r12)
        L1b:
            X.14Gf<java.util.List<com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo>> r0 = r11.LLILZIL
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L2b
            X.14Gf<java.util.List<com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo>> r0 = r11.LLILZIL
            X.C189200o6.m2constructorimpl(r4)
            r0.resumeWith(r4)
        L2b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L31:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r4 = r11.LLILLJJLI
            int r3 = r11.LLILLL
            if (r3 < 0) goto L7f
            if (r3 >= r9) goto L60
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r2 = r11.LLILZ
            if (r2 == 0) goto L60
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.059H r0 = new X.059H
            r0.<init>(r3, r8, r2)
            r11.LLILLJJLI = r4
            r11.LLILLL = r3
            r11.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r11, r1, r0)
            if (r0 != r7) goto L60
            X.C1C7U.LIZIZ(r10)
            return r7
        L59:
            int r3 = r11.LLILLL
            java.lang.Object r4 = r11.LLILLJJLI
            X.C155000ia.LIZIZ(r12)
        L60:
            if (r3 != r9) goto L7d
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r2 = r11.LLILZ
            if (r2 == 0) goto L1b
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.059G r0 = new X.059G
            r0.<init>(r2, r8)
            r11.LLILLJJLI = r4
            r11.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r11, r1, r0)
            if (r0 != r7) goto L1b
            X.C1C7U.LIZIZ(r10)
            return r7
        L7d:
            if (r3 >= 0) goto L2b
        L7f:
            X.14Gf<java.util.List<com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo>> r0 = r11.LLILZIL
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L2b
            X.14Gf<java.util.List<com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo>> r1 = r11.LLILZIL
            X.13BV r0 = X.C13BV.INSTANCE
            X.C189200o6.m2constructorimpl(r0)
            r1.resumeWith(r0)
            goto L2b
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C059I.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(List<? extends TextImageTaskInfo> list, Boolean bool, Integer num, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        bool.booleanValue();
        int iIntValue = num.intValue();
        C059I c059i = new C059I(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c059i.LLILLJJLI = list;
        c059i.LLILLL = iIntValue;
        return c059i.invokeSuspend(Unit.LIZ);
    }
}

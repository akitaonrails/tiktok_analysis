package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.VideoChosenResultFromAddSceneImpl$checkAddValid$1", f = "VideoChosenResultFromAddSceneImpl.kt", l = {136, 137, 138}, m = "invokeSuspend")
public final class C2358209Lw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C536080L0s LLILLL;
    public final /* synthetic */ List<MediaModel> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2358209Lw(C536080L0s c536080L0s, List<? extends MediaModel> list, InterfaceC1364105Vn<? super C2358209Lw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c536080L0s;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2358209Lw c2358209Lw = new C2358209Lw(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2358209Lw.LLILLJJLI = obj;
        return c2358209Lw;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "VideoChosenResultFromAddSceneImpl@77d1.checkAddValid$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r11.LL
            r7 = 3
            r8 = 2
            r9 = 1
            r5 = 0
            if (r0 == 0) goto L20
            if (r0 == r9) goto L4f
            if (r0 == r8) goto L64
            if (r0 != r7) goto L84
            X.C155000ia.LIZIZ(r12)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L20:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r4 = r11.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.09Lx r2 = new X.09Lx
            X.0L0s r1 = r11.LLILLL
            java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r0 = r11.LLILZ
            r2.<init>(r1, r0, r5)
            X.099G r3 = X.C23250099c.LIZIZ(r4, r5, r5, r2, r7)
            X.09Lv r2 = new X.09Lv
            X.0L0s r1 = r11.LLILLL
            java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r0 = r11.LLILZ
            r2.<init>(r1, r0, r5)
            X.099G r1 = X.C23250099c.LIZIZ(r4, r5, r5, r2, r7)
            r11.LLILLJJLI = r1
            r11.LL = r9
            java.lang.Object r0 = r3.LJLIIIL(r11)
            if (r0 != r6) goto L56
            X.C1C7U.LIZIZ(r10)
            return r6
        L4f:
            java.lang.Object r1 = r11.LLILLJJLI
            X.0957 r1 = (X.AnonymousClass0957) r1
            X.C155000ia.LIZIZ(r12)
        L56:
            r11.LLILLJJLI = r5
            r11.LL = r8
            java.lang.Object r12 = r1.LJLIIIL(r11)
            if (r12 != r6) goto L67
            X.C1C7U.LIZIZ(r10)
            return r6
        L64:
            X.C155000ia.LIZIZ(r12)
        L67:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r4 = r12.booleanValue()
            X.08ps r3 = X.C2108108Nr.LIZ
            X.09qD r2 = new X.09qD
            X.0L0s r1 = r11.LLILLL
            java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r0 = r11.LLILZ
            r2.<init>(r1, r4, r0, r5)
            r11.LL = r7
            java.lang.Object r0 = X.C23250099c.LJI(r11, r3, r2)
            if (r0 != r6) goto L1a
            X.C1C7U.LIZIZ(r10)
            return r6
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2358209Lw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

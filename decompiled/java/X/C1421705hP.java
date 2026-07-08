package X;

import com.bytedance.hybrid.spark.roma.RomaGeckoService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05hP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.hybrid.spark.roma.RomaGeckoService$getAccessKeyToChannels$1", f = "RomaGeckoService.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C1421705hP extends C09AW implements Function2<AbstractC1421005hI<? super Pair<? extends String, ? extends String>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ RomaGeckoService LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1421705hP(RomaGeckoService romaGeckoService, InterfaceC1364105Vn<? super C1421705hP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = romaGeckoService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1421705hP c1421705hP = new C1421705hP(this.LLJ, interfaceC1364105Vn);
        c1421705hP.LLIZLLLIL = obj;
        return c1421705hP;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0062 -> B:7:0x0026). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0043 -> B:6:0x0024). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "RomaGeckoService@d102.getAccessKeyToChannels$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r11.LLIZ
            r6 = 0
            r4 = 1
            if (r0 == 0) goto L4b
            if (r0 != r4) goto L70
            int r9 = r11.LLILZLL
            int r8 = r11.LLILZIL
            int r1 = r11.LLILZ
            java.lang.Object r7 = r11.LLILLL
            java.lang.Object r6 = r11.LLILLJJLI
            java.lang.String[] r6 = (java.lang.String[]) r6
            java.lang.Object r3 = r11.LLIZLLLIL
            X.05hI r3 = (X.AbstractC1421005hI) r3
            X.C155000ia.LIZIZ(r12)
        L24:
            int r9 = r9 + 1
        L26:
            if (r9 >= r8) goto L49
            int r0 = r1 + r9
            r2 = r6[r0]
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r7)
            r11.LLIZLLLIL = r3
            r11.LLILLJJLI = r6
            r11.LLILLL = r7
            r11.LLILZ = r1
            r11.LLILZIL = r8
            r11.LLILZLL = r9
            r11.LLIZ = r4
            java.lang.Object r0 = r3.LIZ(r0, r11)
            if (r0 != r5) goto L24
            X.C1C7U.LIZIZ(r10)
            return r5
        L49:
            int r1 = r1 + r8
            goto L5f
        L4b:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r3 = r11.LLIZLLLIL
            X.05hI r3 = (X.AbstractC1421005hI) r3
            com.bytedance.hybrid.spark.roma.RomaGeckoService r0 = r11.LLJ
            com.bytedance.keva.Keva r2 = r0.LIZ
            java.lang.String r1 = "__ak__"
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.String[] r6 = r2.getStringArray(r1, r0)
            r1 = 0
        L5f:
            int r0 = r6.length
            if (r1 >= r0) goto L78
            int r0 = r1 + 1
            r7 = r6[r1]
            int r1 = r0 + 1
            r0 = r6[r0]
            int r8 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            r9 = 0
            goto L26
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L78:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1421705hP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1421005hI<? super Pair<? extends String, ? extends String>> abstractC1421005hI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1421005hI, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

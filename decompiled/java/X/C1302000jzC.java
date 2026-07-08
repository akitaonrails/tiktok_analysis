package X;

import com.bytedance.android.livesdk.impl.revenue.asr.LiveAsrHostWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jzC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.asr.LiveAsrHostWidget$sendSEIMultipleTimes$1", f = "LiveAsrHostWidget.kt", l = {352}, m = "invokeSuspend")
public final class C1302000jzC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public LiveAsrHostWidget LLILZ;
    public InterfaceC769940UIe LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ LiveAsrHostWidget LLJ;
    public final /* synthetic */ InterfaceC769940UIe LLJI;
    public final /* synthetic */ JSONObject LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302000jzC(int i, LiveAsrHostWidget liveAsrHostWidget, InterfaceC769940UIe interfaceC769940UIe, JSONObject jSONObject, InterfaceC1364105Vn<? super C1302000jzC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = i;
        this.LLJ = liveAsrHostWidget;
        this.LLJI = interfaceC769940UIe;
        this.LLJIJIL = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1302000jzC(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0044 -> B:6:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005b -> B:6:0x0021). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            java.lang.String r9 = "LiveAsrHostWidget@a55f.sendSEIMultipleTimes$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r8 = X.C099R.LJFF()
            r4 = r18
            int r0 = r4.LLIZ
            r2 = 1
            if (r0 == 0) goto L76
            if (r0 != r2) goto L8a
            int r3 = r4.LLILLL
            int r0 = r4.LLILLJJLI
            int r7 = r4.LL
            java.lang.Object r12 = r4.LLILZLL
            X.0UIe r6 = r4.LLILZIL
            com.bytedance.android.livesdk.impl.revenue.asr.LiveAsrHostWidget r5 = r4.LLILZ
            X.C155000ia.LIZIZ(r19)
        L21:
            int r3 = r3 + 1
            r2 = 1
        L24:
            if (r3 >= r7) goto L84
            com.bytedance.android.livesdk.livesetting.strategy.GiftGuideASRConfig r1 = r5.LLJJJJ
            int r1 = r1.seiVersion
            if (r1 != r2) goto L61
            X.0jFs r10 = r6.getLiveCore()
            if (r10 == 0) goto L42
            java.lang.String r11 = "live_sei_asr_gift_guide"
            r13 = 1
            r14 = 0
            java.lang.String r17 = "1610665999"
            r15 = r13
            r16 = r14
            int r1 = r10.LJJJLL(r11, r12, r13, r14, r15, r16, r17)
            X.C2286608xc.LJ(r1)
        L42:
            int r1 = r0 + (-1)
            if (r3 >= r1) goto L21
            r4.LLILZ = r5
            r4.LLILZIL = r6
            r4.LLILZLL = r12
            r4.LL = r7
            r4.LLILLJJLI = r0
            r4.LLILLL = r3
            r1 = 1
            r4.LLIZ = r1
            r1 = 100
            java.lang.Object r1 = X.AnonymousClass0958.LIZIZ(r1, r4)
            if (r1 != r8) goto L21
            X.C1C7U.LIZIZ(r9)
            return r8
        L61:
            X.0jFs r10 = r6.getLiveCore()
            if (r10 == 0) goto L42
            java.lang.String r11 = "live_sei_asr_gift_guide"
            r13 = 1
            r14 = 0
            java.lang.String r16 = "1610665999"
            r15 = r13
            int r1 = r10.LJJJJLI(r11, r12, r13, r14, r15, r16)
            X.C2286608xc.LJ(r1)
            goto L42
        L76:
            X.C155000ia.LIZIZ(r19)
            int r0 = r4.LLIZLLLIL
            com.bytedance.android.livesdk.impl.revenue.asr.LiveAsrHostWidget r5 = r4.LLJ
            X.0UIe r6 = r4.LLJI
            org.json.JSONObject r12 = r4.LLJIJIL
            r7 = r0
            r3 = 0
            goto L24
        L84:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1302000jzC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

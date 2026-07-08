package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05T3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.compose.MusicGiftRecordArtworkKt$AnimatedRecordArtwork$1$1", f = "MusicGiftRecordArtwork.kt", l = {120, 121, 128}, m = "invokeSuspend")
public final class C05T3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public float LL;
    public int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05T3(C1677480tko c1677480tko, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = c1677480tko;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05T3(this.LLILZ, interfaceC1364105Vn, this.LLILLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007f -> B:8:0x001b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            java.lang.String r9 = "MusicGiftRecordArtworkKt@837d.AnimatedRecordArtwork$1$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r15.LLILLJJLI
            r8 = 1135869952(0x43b40000, float:360.0)
            r4 = 3
            r3 = 1
            r2 = 2
            if (r0 == 0) goto L85
            if (r0 == r3) goto L48
            if (r0 == r2) goto L6f
            if (r0 != r4) goto L92
            X.C155000ia.LIZIZ(r16)
        L1b:
            X.0tko<java.lang.Float, X.0tkU> r0 = r15.LLILZ
            java.lang.Object r0 = r0.LIZLLL()
            java.lang.Number r0 = (java.lang.Number) r0
            float r7 = r0.floatValue()
            float r7 = r7 % r8
            float r6 = r8 - r7
            float r6 = r6 / r8
            r1 = 1008981770(0x3c23d70a, float:0.01)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = X.C13LZ.LIZLLL(r6, r1, r0)
            X.0tko<java.lang.Float, X.0tkU> r6 = r15.LLILZ
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r7)
            r15.LL = r1
            r15.LLILLJJLI = r3
            java.lang.Object r0 = r6.LJFF(r0, r15)
            if (r0 != r5) goto L4d
            X.C1C7U.LIZIZ(r9)
            return r5
        L48:
            float r1 = r15.LL
            X.C155000ia.LIZIZ(r16)
        L4d:
            X.0tko<java.lang.Float, X.0tkU> r10 = r15.LLILZ
            java.lang.Float r11 = X.C2286608xc.LIZLLL(r8)
            r0 = 12000(0x2ee0, float:1.6816E-41)
            float r0 = (float) r0
            float r0 = r0 * r1
            int r6 = (int) r0
            X.05Y1 r1 = X.C05Y0.LIZLLL
            r13 = 0
            r0 = 0
            X.0tk7 r12 = X.C1671550tbF.LIZLLL(r6, r0, r1, r2)
            r16 = 12
            r15.LLILLJJLI = r2
            r14 = r13
            java.lang.Object r0 = X.C1677480tko.LIZJ(r10, r11, r12, r13, r14, r15, r16)
            if (r0 != r5) goto L72
            X.C1C7U.LIZIZ(r9)
            return r5
        L6f:
            X.C155000ia.LIZIZ(r16)
        L72:
            X.0tko<java.lang.Float, X.0tkU> r1 = r15.LLILZ
            r0 = 0
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r0)
            r15.LLILLJJLI = r4
            java.lang.Object r0 = r1.LJFF(r0, r15)
            if (r0 != r5) goto L1b
            X.C1C7U.LIZIZ(r9)
            return r5
        L85:
            X.C155000ia.LIZIZ(r16)
            boolean r0 = r15.LLILLL
            if (r0 != 0) goto L1b
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05T3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

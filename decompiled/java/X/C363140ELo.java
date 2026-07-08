package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ELo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.track.i2v.I2vTrackGenaraTestComponent$start$1", f = "I2vTrackGenerateTestApi.kt", l = {55}, m = "invokeSuspend")
public final class C363140ELo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public float LL;
    public int LLILLJJLI;
    public final /* synthetic */ C363150ELp LLILLL;
    public final /* synthetic */ NLETrackSlot LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C363140ELo(C363150ELp c363150ELp, NLETrackSlot nLETrackSlot, InterfaceC1364105Vn<? super C363140ELo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c363150ELp;
        this.LLILZ = nLETrackSlot;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C363140ELo(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Path cross not found for [B:10:0x002d, B:8:0x0027], limit reached: 22 */
    /* JADX WARN: Path cross not found for [B:8:0x0027, B:10:0x002d], limit reached: 22 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:6:0x0015). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "I2vTrackGenaraTestComponent@30b3.start$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LLILLJJLI
            r6 = 1
            if (r0 == 0) goto L45
            if (r0 != r6) goto L59
            float r5 = r9.LL
            X.C155000ia.LIZIZ(r10)
        L15:
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r5 = r5 + r0
            X.0ELp r0 = r9.LLILLL
            X.0ELq r0 = r0.Z1()
            X.0ELc r4 = r0.xG2()
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r9.LLILZ
            if (r0 == 0) goto L2d
            java.lang.String r3 = r0.getUUID()
            if (r3 != 0) goto L2f
        L2d:
            java.lang.String r3 = ""
        L2f:
            X.0ELY r2 = new X.0ELY
            r1 = 0
            r0 = 4
            r2.<init>(r1, r5, r0)
            r4.LIZLLL(r3, r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L49
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L45:
            X.C155000ia.LIZIZ(r10)
            r5 = 0
        L49:
            r9.LL = r5
            r9.LLILLJJLI = r6
            r0 = 800(0x320, double:3.953E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r9)
            if (r0 != r7) goto L15
            X.C1C7U.LIZIZ(r8)
            return r7
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363140ELo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fpJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.musicgift.preview.MusicGiftPreviewPlayer$startProgressTicker$1", f = "MusicGiftPreviewPlayer.kt", l = {803}, m = "invokeSuspend")
public final class C1142110fpJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142110fpJ(long j, InterfaceC1364105Vn<? super C1142110fpJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1142110fpJ(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:6:0x0019). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            java.lang.String r15 = "MusicGiftPreviewPlayer@5196.startProgressTicker$1"
            X.C1C7U.LIZ(r15)
            java.lang.Object r7 = X.C099R.LJFF()
            r8 = r22
            int r0 = r8.LLILLJJLI
            r1 = 250(0xfa, double:1.235E-321)
            r6 = 1
            if (r0 == 0) goto L78
            if (r0 != r6) goto L8b
            long r4 = r8.LL
            X.C155000ia.LIZIZ(r23)
        L19:
            long r4 = r4 + r1
            X.0fpG r0 = X.C1142070fpF.LJ
            long r13 = r0.LIZ()
            long r11 = r0.LIZIZ()
            X.0fpF r0 = X.C1142070fpF.LIZ
            r0.getClass()
            long r2 = X.C1142070fpF.LJIJI(r11)
            java.lang.Long r1 = X.C2286608xc.LJFF(r13)
            long r9 = r1.longValue()
            r18 = 0
            int r0 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            r10 = 0
            if (r0 <= 0) goto L75
            long r16 = r1.longValue()
        L40:
            r20 = r2
            long r0 = X.C13LZ.LJFF(r16, r18, r20)
            X.0fpV r9 = new X.0fpV
            r9.<init>(r0, r2)
            X.C1142070fpF.LJJII(r9)
            int r9 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r9 <= 0) goto L5f
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 < 0) goto L72
        L56:
            X.C1142070fpF.LJFF()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r15)
            return r0
        L5f:
            r3 = 0
            if (r9 > 0) goto L6d
            int r0 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r0 > 0) goto L6d
            r1 = 15000(0x3a98, double:7.411E-320)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L6d
            r10 = 1
        L6d:
            if (r3 != 0) goto L56
            if (r10 == 0) goto L72
            goto L56
        L72:
            r1 = 250(0xfa, double:1.235E-321)
            goto L7d
        L75:
            r16 = r4
            goto L40
        L78:
            X.C155000ia.LIZIZ(r23)
            long r4 = r8.LLILLL
        L7d:
            r8.LL = r4
            r8.LLILLJJLI = r6
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r1, r8)
            if (r0 != r7) goto L19
            X.C1C7U.LIZIZ(r15)
            return r7
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1142110fpJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.interfaces.ITemplateMusicService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KtN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.MusicHandler$downloadResource$1", f = "MusicHandler.kt", l = {59}, m = "invokeSuspend")
public final class C531790KtN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ITemplateMusicService LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C532890Kv9 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC531800KtO LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C531790KtN(ITemplateMusicService iTemplateMusicService, String str, C532890Kv9 c532890Kv9, String str2, InterfaceC531800KtO interfaceC531800KtO, InterfaceC1364105Vn<? super C531790KtN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iTemplateMusicService;
        this.LLILLL = str;
        this.LLILZ = c532890Kv9;
        this.LLILZIL = str2;
        this.LLILZLL = interfaceC531800KtO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C531790KtN(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[PHI: r1
      0x006c: PHI (r1v2 int) = (r1v1 int), (r1v4 int), (r1v4 int) binds: [B:30:0x0074, B:24:0x0064, B:26:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "MusicHandler@6ec5.downloadResource$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 1
            if (r0 == 0) goto L77
            if (r0 != r3) goto L8c
            X.C155000ia.LIZIZ(r7)
        L13:
            X.0Ksh r7 = (X.C531370Ksh) r7
            if (r7 == 0) goto L54
            java.lang.String r3 = r7.LIZLLL
            java.lang.Integer r0 = r7.LIZ
            if (r0 == 0) goto L54
            int r0 = r0.intValue()
            if (r0 != 0) goto L54
            if (r3 == 0) goto L54
            int r0 = r3.length()
            if (r0 == 0) goto L54
            X.0Kv9 r1 = r6.LLILZ
            java.lang.String r0 = r6.LLILZIL
            r1.LIZLLL(r0, r3)
            X.0Kv9 r2 = r6.LLILZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "downloadMusicByMusicId success "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.LJFF(r0)
            X.0KtO r1 = r6.LLILZLL
            java.lang.String r0 = r6.LLILZIL
            r1.LJJI(r0, r3)
        L4e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L54:
            X.0KtO r3 = r6.LLILZLL
            java.lang.String r2 = r6.LLILZIL
            if (r7 == 0) goto L72
            java.lang.Integer r0 = r7.LIZ
            if (r0 == 0) goto L72
            int r1 = r0.intValue()
        L62:
            java.lang.Exception r0 = r7.LIZIZ
            if (r0 == 0) goto L6c
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L6e
        L6c:
            java.lang.String r0 = "Download failed"
        L6e:
            r3.onError(r2, r1, r0)
            goto L4e
        L72:
            r1 = -1005(0xfffffffffffffc13, float:NaN)
            if (r7 == 0) goto L6c
            goto L62
        L77:
            X.C155000ia.LIZIZ(r7)
            com.ss.android.ugc.aweme.interfaces.ITemplateMusicService r2 = r6.LLILLJJLI
            java.lang.String r1 = r6.LLILLL
            android.app.Application r0 = X.C0CHQ.LIZ
            r6.LL = r3
            java.lang.Object r7 = r2.LIZJ(r0, r1, r6)
            if (r7 != r4) goto L13
            X.C1C7U.LIZIZ(r5)
            return r4
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C531790KtN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

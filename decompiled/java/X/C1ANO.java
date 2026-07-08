package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1ANO, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiuikit.api.pages.preview.player.CameoPlayerScene$fallbackDownloadAndReplay$1", f = "CameoPlayerScene.kt", l = {321}, m = "invokeSuspend")
public final class C1ANO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1ANM LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1ANO(C1ANM c1anm, int i, String str, InterfaceC1364105Vn<? super C1ANO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1anm;
        this.LLILLL = i;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1ANO(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r5 = "CameoPlayerScene@cabc.fallbackDownloadAndReplay$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r12.LL
            r3 = 1
            if (r0 == 0) goto L62
            if (r0 != r3) goto Lae
            X.C155000ia.LIZIZ(r13)
        L13:
            X.0LN7 r13 = (X.C0LN7) r13
        L15:
            X.0Ld2 r2 = X.C546820LcW.LIZIZ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "fallback download result: "
            r1.<init>(r0)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "CameoPlayerScene"
            r2.LIZ(r0, r1)
            if (r13 == 0) goto L46
            X.1ANM r1 = r12.LLILLJJLI
            T r0 = r13.LIZ
            java.lang.String r0 = (java.lang.String) r0
            r1.LLJLIL = r0
            r1.LLLLLLLZIL(r3)
        L37:
            X.1ANM r0 = r12.LLILLJJLI
            X.0mGW r0 = r0.LLJLILLLLZIIL
            if (r0 == 0) goto L40
            X.C0FNV.LIZ(r0)
        L40:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L46:
            X.1ANM r0 = r12.LLILLJJLI
            java.lang.Object r0 = r0.LLLLIL()
            X.1ANV r0 = (X.C1ANV) r0
            X.0sYq<java.lang.Integer, java.lang.String, java.lang.String, kotlin.Unit> r3 = r0.LJ
            int r0 = r12.LLILLL
            java.lang.Integer r2 = X.C2286608xc.LJ(r0)
            java.lang.String r1 = r12.LLILZ
            X.1ANM r0 = r12.LLILLJJLI
            java.lang.String r0 = r0.LLLLLLIL()
            r3.invoke(r2, r1, r0)
            goto L37
        L62:
            X.C155000ia.LIZIZ(r13)
            X.1ANM r0 = r12.LLILLJJLI
            X.0tQB r0 = r0.LLLLILI()
            STATE r0 = r0.LIZ
            X.1ANT r0 = (X.C1ANT) r0
            X.0LN8 r8 = r0.LJIIL
            if (r8 == 0) goto Lab
            X.1ANM r1 = r12.LLILLJJLI
            X.0LeC r0 = X.C547860LeC.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.aikit.api.common.FileService r6 = X.C547860LeC.LJ()
            X.0tQB r0 = r1.LLLLILI()
            STATE r0 = r0.LIZ
            X.1ANT r0 = (X.C1ANT) r0
            java.lang.String r9 = r0.LIZJ
            X.0tQB r0 = r1.LLLLILI()
            STATE r0 = r0.LIZ
            X.1ANT r0 = (X.C1ANT) r0
            java.lang.String r10 = r0.LJ
            java.lang.String r11 = ".mp4"
            r7 = 3
            X.05YD r2 = r6.LIZ(r7, r8, r9, r10, r11)
            X.1An0 r1 = new X.1An0
            r0 = 0
            r1.<init>(r2, r0)
            r12.LL = r3
            java.lang.Object r13 = X.C09IC.LJIJI(r1, r12)
            if (r13 != r4) goto L13
            X.C1C7U.LIZIZ(r5)
            return r4
        Lab:
            r13 = 0
            goto L15
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ANO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

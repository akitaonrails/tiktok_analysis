package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Sz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.audiodownload.manager.TTSStreamManager$updateCurrentTtsStatus$1", f = "TTSStreamManager.kt", l = {493}, m = "invokeSuspend")
public final class C2376709Sz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2376709Sz(long j, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2376709Sz(this.LLILLL, this.LLILLJJLI, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "TTSStreamManager@c055.updateCurrentTtsStatus$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r6.LL
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L61
            if (r0 != r4) goto Lb5
            X.C155000ia.LIZIZ(r7)
        L14:
            X.09TF r0 = X.C09T7.LJI
            if (r0 == 0) goto L5f
            X.09TL r1 = r0.LJI
        L1a:
            X.09TL r0 = X.C09TL.IDLE
            if (r1 != r0) goto L42
            java.lang.String r1 = r6.LLILLJJLI
            X.09TF r0 = X.C09T7.LJI
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.LIZ
        L26:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3b
            java.lang.String r1 = r6.LLILZ
            X.09TF r0 = X.C09T7.LJI
            if (r0 == 0) goto L34
            java.lang.String r3 = r0.LIZIZ
        L34:
            r0 = 0
            boolean r0 = kotlin.text.u.LJIJI(r1, r3, r0)
            if (r0 != 0) goto L42
        L3b:
            com.ss.android.ugc.aweme.services.audio.ITTSCallback r0 = X.C09T7.LJIIIZ
            if (r0 == 0) goto L42
            r0.onCancel(r4)
        L42:
            java.lang.String r4 = r6.LLILLJJLI
            if (r4 == 0) goto L57
            java.lang.String r3 = r6.LLILZ
            if (r3 == 0) goto L57
            java.lang.String r2 = r6.LLILZIL
            if (r2 == 0) goto L57
            X.09TF r1 = new X.09TF
            r0 = 120(0x78, float:1.68E-43)
            r1.<init>(r4, r3, r2, r0)
            X.C09T7.LJI = r1
        L57:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L5d:
            r0 = r3
            goto L26
        L5f:
            r1 = r3
            goto L1a
        L61:
            X.C155000ia.LIZIZ(r7)
            java.lang.String r0 = r6.LLILLJJLI
            if (r0 == 0) goto L76
            long r0 = r6.LLILLL
            r6.LL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r6)
            if (r0 != r2) goto L14
            X.C1C7U.LIZIZ(r5)
            return r2
        L76:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r2 = X.C09T7.LIZIZ
            r1.append(r2)
            java.lang.String r0 = "updateCurrentTtsStatus stopReading"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZ(r0)
            X.09TF r0 = X.C09T7.LJI
            if (r0 == 0) goto Lb3
            X.09TL r1 = r0.LJI
        L91:
            X.09TL r0 = X.C09TL.IDLE
            if (r1 != r0) goto L9c
            com.ss.android.ugc.aweme.services.audio.ITTSCallback r0 = X.C09T7.LJIIIZ
            if (r0 == 0) goto L9c
            r0.onCancel(r4)
        L9c:
            X.09T7 r0 = X.C09T7.LIZ
            X.11YP r1 = X.C11YP.LIZIZ
            java.lang.String r0 = "stopReading called by outside."
            X.C201955140j.LIZLLL(r1, r2, r0)
            X.01wk r2 = X.C09T7.LIZIZ()
            X.09T4 r1 = new X.09T4
            r1.<init>(r3)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r3, r3, r1, r0)
            goto L57
        Lb3:
            r1 = r3
            goto L91
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2376709Sz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

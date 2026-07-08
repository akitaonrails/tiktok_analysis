package X;

import com.ss.android.ugc.aweme.tako.camera.record.pageui.TakoPhotoPreviewAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NPW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.camera.record.pageui.TakoPhotoPreviewAssem$initListeners$4$1", f = "TakoPhotoPreviewAssem.kt", l = {83}, m = "invokeSuspend")
public final class C0NPW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoPhotoPreviewAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NPW(TakoPhotoPreviewAssem takoPhotoPreviewAssem, InterfaceC1364105Vn<? super C0NPW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoPhotoPreviewAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NPW(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "TakoPhotoPreviewAssem@497f.initListeners$4$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r6.LL
            r4 = 1
            if (r0 == 0) goto L1b
            if (r0 != r4) goto L40
            X.C155000ia.LIZIZ(r7)
        L13:
            if (r7 != 0) goto L48
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L1b:
            X.C155000ia.LIZIZ(r7)
            com.ss.android.ugc.aweme.tako.camera.record.pageui.TakoPhotoPreviewAssem r0 = r6.LLILLJJLI
            com.ss.android.ugc.aweme.tako.vm.TakoRecordFragmentViewModel r0 = r0.ip()
            X.002o r0 = r0.getState()
            X.0NPX r0 = (X.C0NPX) r0
            android.net.Uri r7 = r0.LLILLL
            if (r7 != 0) goto L48
            com.ss.android.ugc.aweme.tako.camera.record.pageui.TakoPhotoPreviewAssem r0 = r6.LLILLJJLI
            com.ss.android.ugc.aweme.tako.vm.TakoRecordFragmentViewModel r0 = r0.ip()
            r6.LL = r4
            java.lang.Object r7 = r0.vQ2(r6)
            if (r7 != r1) goto L13
            X.C1C7U.LIZIZ(r5)
            return r1
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L48:
            com.ss.android.ugc.aweme.tako.camera.record.pageui.TakoPhotoPreviewAssem r0 = r6.LLILLJJLI
            com.ss.android.ugc.aweme.tako.vm.TakoRecordFragmentViewModel r3 = r0.ip()
            android.net.Uri[] r1 = new android.net.Uri[r4]
            r0 = 0
            r1[r0] = r7
            java.util.List r2 = X.C1697810uHb.LJIILJJIL(r1)
            r3.LLIZ = r4
            boolean r0 = r3.LL
            if (r0 == 0) goto L67
            kotlin.jvm.internal.AwS588S0100000_9 r1 = new kotlin.jvm.internal.AwS588S0100000_9
            r0 = 632(0x278, float:8.86E-43)
            r1.<init>(r2, r0)
            r3.setState(r1)
        L67:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NPW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

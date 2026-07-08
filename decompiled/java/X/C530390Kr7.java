package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Kr7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "dmt.av.video.task.LiveRecordingsConfigTask$run$1", f = "LiveRecordingsConfigTask.kt", l = {31, LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C530390Kr7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C530390Kr7(InterfaceC1364105Vn<? super C530390Kr7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C530390Kr7(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r11.LL
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L14
            if (r0 == r1) goto L35
            if (r0 != r3) goto L51
            X.C155000ia.LIZIZ(r12)
        L11:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L14:
            X.C155000ia.LIZIZ(r12)
            X.0Ko7 r0 = com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRepository.LIZ
            r0.getClass()
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRepository> r5 = com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRepository.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRepository r0 = (com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRepository) r0
            if (r0 == 0) goto L11
            r11.LL = r1
            X.01Wa r12 = r0.LJFF()
            if (r12 != r4) goto L38
            return r4
        L35:
            X.C155000ia.LIZIZ(r12)
        L38:
            X.01Wa r12 = (X.InterfaceC346201Wa) r12
            if (r12 == 0) goto L11
            X.0Kr8 r2 = new X.0Kr8
            r0 = 0
            r2.<init>(r0)
            X.09r7 r1 = new X.09r7
            r0 = 0
            r1.<init>(r2, r12, r0)
            r11.LL = r3
            java.lang.Object r0 = X.C09IC.LJI(r1, r11)
            if (r0 != r4) goto L11
            return r4
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C530390Kr7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C530390Kr7(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

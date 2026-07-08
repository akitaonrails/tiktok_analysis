package X;

import android.content.Context;
import com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iXz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionVM$fetchPushSettings$1", f = "DisplayAndCaptionVM.kt", l = {41}, m = "invokeSuspend")
public final class C1246690iXz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ DisplayAndCaptionVM LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1246690iXz(DisplayAndCaptionVM displayAndCaptionVM, Context context, String str, InterfaceC1364105Vn<? super C1246690iXz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = displayAndCaptionVM;
        this.LLILZ = context;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1246690iXz(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r4 = "DisplayAndCaptionVM@7d78.fetchPushSettings$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r11.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L4c
            if (r0 != r2) goto L8a
            java.lang.Object r1 = r11.LL
            X.C155000ia.LIZIZ(r12)
        L15:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 == 0) goto L46
            java.lang.Class<com.tiktok.ef.i18n.service.manager.I18nServiceApi> r5 = com.tiktok.ef.i18n.service.manager.I18nServiceApi.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.tiktok.ef.i18n.service.manager.I18nServiceApi r0 = (com.tiktok.ef.i18n.service.manager.I18nServiceApi) r0
            java.lang.String r2 = ""
            if (r0 == 0) goto L42
            com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi r1 = r0.LIZ()
            if (r1 == 0) goto L42
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            java.lang.String r0 = r1.LJIILJJIL(r0)
            if (r0 != 0) goto L43
        L42:
            r0 = r2
        L43:
            X.C1246730iY3.LIZ(r0, r2)
        L46:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L4c:
            X.C155000ia.LIZIZ(r12)
            com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings r1 = com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager.LJI()     // Catch: java.lang.Throwable -> L57
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L57
            goto L63
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L63:
            com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionVM r7 = r11.LLILLL
            android.content.Context r8 = r11.LLILZ
            java.lang.String r9 = r11.LLILZIL
            boolean r0 = X.C189200o6.m8isSuccessimpl(r1)
            if (r0 == 0) goto L15
            r6 = r1
            com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings r6 = (com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings) r6
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0iY1 r5 = new X.0iY1
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r11.LL = r1
            r11.LLILLJJLI = r2
            java.lang.Object r0 = X.C23250099c.LJI(r11, r0, r5)
            if (r0 != r3) goto L15
            X.C1C7U.LIZIZ(r4)
            return r3
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1246690iXz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

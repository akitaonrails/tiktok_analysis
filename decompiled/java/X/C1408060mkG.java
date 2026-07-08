package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mkG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.privacy.setting.tpsc.account.configable.customitem.dm.DirectMessageRadioItemComponent$1", f = "DirectMessageRadioItemComponent.kt", l = {BaseNotice.CREATOR, 63}, m = "invokeSuspend")
public final class C1408060mkG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C106Y LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408060mkG(C106Y c106y, InterfaceC1364105Vn<? super C1408060mkG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c106y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408060mkG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r5 = "DirectMessageRadioItemComponent@3d0d.<init>$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r12.LL
            r11 = 0
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L43
            if (r0 != r4) goto L5f
            X.C155000ia.LIZIZ(r13)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r13)
            java.lang.Class<com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService> r6 = com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService.class
            r7 = 0
            r10 = 14
            r8 = r7
            r9 = r7
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService r1 = (com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService) r1
            if (r1 == 0) goto L41
            X.106Y r0 = r12.LLILLJJLI
            X.107N r0 = r0.LLJILJILJ
            java.lang.String r0 = r0.LJIIIIZZ
            r12.LL = r2
            java.lang.Object r13 = r1.LJJIJL(r0, r12)
            if (r13 != r3) goto L46
            X.C1C7U.LIZIZ(r5)
            return r3
        L41:
            r13 = r11
            goto L48
        L43:
            X.C155000ia.LIZIZ(r13)
        L46:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
        L48:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0mkH r1 = new X.0mkH
            X.106Y r0 = r12.LLILLJJLI
            r1.<init>(r0, r13, r11)
            r12.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r12, r2, r1)
            if (r0 != r3) goto L17
            X.C1C7U.LIZIZ(r5)
            return r3
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1408060mkG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0HO2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageViewModel$onPrepared$1$1", f = "MixStudioHomePageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0HO2 extends C09AX implements InterfaceC1631630sYr<AbstractC440540HPg, List<? extends C440830HQj>, C437560HDu, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ AbstractC440540HPg LL;
    public final /* synthetic */ MixStudioStatusRepository LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HO2(MixStudioStatusRepository mixStudioStatusRepository, InterfaceC1364105Vn<? super C0HO2> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioStatusRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.String r2 = "MixStudioHomePageViewModel@b729.onPrepared$1$1"
            X.C1C7U.LIZ(r2)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r4)
            X.0HPg r1 = r3.LL
            X.0HO3 r0 = X.C0HO3.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L32
            com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository r0 = r3.LLILLJJLI
            X.05YD r0 = r0.LJFF()
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L32
        L2a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.C1C7U.LIZIZ(r2)
            return r0
        L32:
            r1 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HO2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(AbstractC440540HPg abstractC440540HPg, List<? extends C440830HQj> list, C437560HDu c437560HDu, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C0HO2 c0ho2 = new C0HO2(this.LLILLJJLI, interfaceC1364105Vn);
        c0ho2.LL = abstractC440540HPg;
        return c0ho2.invokeSuspend(Unit.LIZ);
    }
}

package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05Dt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseAiContentFragment$setupMobEnterFlow$1$1", f = "ChooseAiContentFragment.kt", l = {}, m = "invokeSuspend")
public final class C1317905Dt extends C09AX implements InterfaceC1631620sYq<Boolean, Long, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ long LLILLJJLI;

    public C1317905Dt(InterfaceC1364105Vn<? super C1317905Dt> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("ChooseAiContentFragment@d5f4.setupMobEnterFlow$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z2 = this.LL;
        long j = this.LLILLJJLI;
        if (z2 && j > 0) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("ChooseAiContentFragment@d5f4.setupMobEnterFlow$1$1");
        return boolValueOf;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, Long l, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        long jLongValue = l.longValue();
        C1317905Dt c1317905Dt = new C1317905Dt(interfaceC1364105Vn);
        c1317905Dt.LL = zBooleanValue;
        c1317905Dt.LLILLJJLI = jLongValue;
        return c1317905Dt.invokeSuspend(Unit.LIZ);
    }
}

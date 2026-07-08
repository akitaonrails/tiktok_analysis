package X;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0NMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.widget.multi.UserCardSkeletonLoadingWidget$initializeWidgetData$1$2", f = "UserCardSkeletonLoadingWidget.kt", l = {}, m = "invokeSuspend")
public final class C592700NMm extends C09AX implements InterfaceC1631620sYq<Integer, EnumC1889520zGo, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends EnumC1889520zGo>>, Object> {
    public /* synthetic */ int LL;
    public /* synthetic */ EnumC1889520zGo LLILLJJLI;

    public C592700NMm(InterfaceC1364105Vn<? super C592700NMm> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCardSkeletonLoadingWidget@458c.initializeWidgetData$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        Pair pair = new Pair(C2286608xc.LJ(i), this.LLILLJJLI);
        C1C7U.LIZIZ("UserCardSkeletonLoadingWidget@458c.initializeWidgetData$1$2");
        return pair;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Integer num, EnumC1889520zGo enumC1889520zGo, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends EnumC1889520zGo>> interfaceC1364105Vn) {
        int iIntValue = num.intValue();
        C592700NMm c592700NMm = new C592700NMm(interfaceC1364105Vn);
        c592700NMm.LL = iIntValue;
        c592700NMm.LLILLJJLI = enumC1889520zGo;
        return c592700NMm.invokeSuspend(Unit.LIZ);
    }
}

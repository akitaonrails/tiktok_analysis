package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.AccountVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07hY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1932207hY extends C2217421BqW implements Function1<C07UY, Unit> {
    public C1932207hY(Object obj) {
        super(1, obj, AccountVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/account/cell/AccountCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07UY c07uy) {
        C07UY c07uy2 = c07uy;
        AccountVM accountVM = (AccountVM) this.receiver;
        accountVM.getClass();
        if (c07uy2 instanceof C07UX) {
            accountVM.wQ2(((C07UX) c07uy2).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}

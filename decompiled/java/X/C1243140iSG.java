package X;

import com.ss.android.ugc.aweme.account.org.permissions.InvitePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0iSG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243140iSG extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ DialogC1389620mGW LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, String, String, Unit> LLILLL;
    public final /* synthetic */ InvitePageViewModel LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1243140iSG(DialogC1389620mGW dialogC1389620mGW, Function0<Unit> function0, InterfaceC1631620sYq<? super Boolean, ? super String, ? super String, Unit> interfaceC1631620sYq, InvitePageViewModel invitePageViewModel, int i, int i2) {
        super(2);
        this.LL = dialogC1389620mGW;
        this.LLILLJJLI = function0;
        this.LLILLL = interfaceC1631620sYq;
        this.LLILZ = invitePageViewModel;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1243220iSO.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZIL | 1), this.LLILZLL);
        return Unit.LIZ;
    }
}

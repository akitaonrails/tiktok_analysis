package X;

import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05bz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM", f = "FriendsEmptyPageMainSectionVM.kt", l = {371, 381, 386}, m = "updateUIState")
public final class C1388105bz extends AbstractC23140094w {
    public boolean LL;
    public Function1 LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ FriendsEmptyPageMainSectionVM LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1388105bz(FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM, InterfaceC1364105Vn<? super C1388105bz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = friendsEmptyPageMainSectionVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsEmptyPageMainSectionVM@1270.updateUIState$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objZQ2 = this.LLILZ.zQ2(this, null, false);
        C1C7U.LIZIZ("FriendsEmptyPageMainSectionVM@1270.updateUIState$1");
        return objZQ2;
    }
}

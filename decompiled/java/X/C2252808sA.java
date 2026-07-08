package X;

import com.ss.android.ugc.profile.business.profile.info.identifier.page.viewmodel.ProfileIdentifierViewModel;

/* JADX INFO: renamed from: X.08sA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.page.viewmodel.ProfileIdentifierViewModel", f = "ProfileIdentifierViewModel.kt", l = {66}, m = "fetchIdentifierDetails")
public final class C2252808sA extends AbstractC23140094w {
    public Object LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ ProfileIdentifierViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2252808sA(ProfileIdentifierViewModel profileIdentifierViewModel, InterfaceC1364105Vn<? super C2252808sA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = profileIdentifierViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileIdentifierViewModel@fdc2.fetchIdentifierDetails$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZ.vQ2(0L, 0, null, null, this);
        C1C7U.LIZIZ("ProfileIdentifierViewModel@fdc2.fetchIdentifierDetails$1");
        return objVQ2;
    }
}

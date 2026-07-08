package X;

import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.viewmodel.CreatorCareModeNewDesignViewModel;

/* JADX INFO: renamed from: X.05gL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.viewmodel.CreatorCareModeNewDesignViewModel", f = "CreatorCareModeNewDesignViewModel.kt", l = {45}, m = "updateCareModeAndFilterAllParallel-IoAF18A")
public final class C1415105gL extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CreatorCareModeNewDesignViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1415105gL(CreatorCareModeNewDesignViewModel creatorCareModeNewDesignViewModel, InterfaceC1364105Vn<? super C1415105gL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = creatorCareModeNewDesignViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorCareModeNewDesignViewModel@4e58.updateCareModeAndFilterAllParallel$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLJJLI.wQ2(this);
        if (objWQ2 == C099R.LJFF()) {
            C1C7U.LIZIZ("CreatorCareModeNewDesignViewModel@4e58.updateCareModeAndFilterAllParallel$1");
            return objWQ2;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objWQ2);
        C1C7U.LIZIZ("CreatorCareModeNewDesignViewModel@4e58.updateCareModeAndFilterAllParallel$1");
        return c189200o6M1boximpl;
    }
}

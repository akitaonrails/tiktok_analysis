package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.viewmodel.CreatorCareModeNewDesignViewModel;

/* JADX INFO: renamed from: X.05gK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.viewmodel.CreatorCareModeNewDesignViewModel", f = "CreatorCareModeNewDesignViewModel.kt", l = {31, LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "saveSettings-gIAlu-s")
public final class C1415005gK extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CreatorCareModeNewDesignViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1415005gK(CreatorCareModeNewDesignViewModel creatorCareModeNewDesignViewModel, InterfaceC1364105Vn<? super C1415005gK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = creatorCareModeNewDesignViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CreatorCareModeNewDesignViewModel@4e58.saveSettings$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(false, this);
        if (objVQ2 == C099R.LJFF()) {
            C1C7U.LIZIZ("CreatorCareModeNewDesignViewModel@4e58.saveSettings$1");
            return objVQ2;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objVQ2);
        C1C7U.LIZIZ("CreatorCareModeNewDesignViewModel@4e58.saveSettings$1");
        return c189200o6M1boximpl;
    }
}

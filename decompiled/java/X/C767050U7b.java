package X;

import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;

/* JADX INFO: renamed from: X.0U7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel", f = "LiveSmallItemBeautyViewModel.kt", l = {578, 579}, m = "emitError")
public final class C767050U7b extends AbstractC23140094w {
    public C403601ha LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveSmallItemBeautyViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767050U7b(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, InterfaceC1364105Vn<? super C767050U7b> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = liveSmallItemBeautyViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveSmallItemBeautyViewModel@ff2.emitError$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objAQ2 = this.LLILLL.AQ2(this);
        C1C7U.LIZIZ("LiveSmallItemBeautyViewModel@ff2.emitError$1");
        return objAQ2;
    }
}

package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.viewmodel.SinglePropsViewModel;

/* JADX INFO: renamed from: X.0ThH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.viewmodel.SinglePropsViewModel", f = "SinglePropsViewModel.kt", l = {28, 31}, m = "fetchProps")
public final class C753610ThH extends AbstractC23140094w {
    public LifecycleOwner LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SinglePropsViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C753610ThH(SinglePropsViewModel singlePropsViewModel, InterfaceC1364105Vn<? super C753610ThH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = singlePropsViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SinglePropsViewModel@2f4.fetchProps$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLL.vQ2(null, this);
        C1C7U.LIZIZ("SinglePropsViewModel@2f4.fetchProps$1");
        return objVQ2;
    }
}

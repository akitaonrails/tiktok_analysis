package X;

import android.animation.ValueAnimator;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.animation.IAnimationQueueManager;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment;
import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06a4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment$setupCommonViewModel$2$1", f = "BaseQuickChatRoomFragment.kt", l = {523}, m = "invokeSuspend")
public final class C1631006a4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaseQuickChatRoomFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1631006a4(BaseQuickChatRoomFragment baseQuickChatRoomFragment, InterfaceC1364105Vn<? super C1631006a4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseQuickChatRoomFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1631006a4(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long duration;
        C1C7U.LIZ("BaseQuickChatRoomFragment@2598.setupCommonViewModel$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ValueAnimator valueAnimator = this.LLILLJJLI.LLJL;
            if (valueAnimator != null) {
                duration = valueAnimator.getDuration() + 50;
            } else {
                duration = 300;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(duration, this) == objLJFF) {
                C1C7U.LIZIZ("BaseQuickChatRoomFragment@2598.setupCommonViewModel$2$1");
                return objLJFF;
            }
        }
        AssemVMLazy assemVMLazy = this.LLILLJJLI.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BaseQuickChatRoomFragment.LLLLL;
        ChatRoomStreakViewModel chatRoomStreakViewModel = (ChatRoomStreakViewModel) assemVMLazy.getValue();
        chatRoomStreakViewModel.LLJI = true;
        chatRoomStreakViewModel.vQ2(null);
        IAnimationQueueManager iAnimationQueueManager = (IAnimationQueueManager) C1558520qew.LIZ(C1558360qeg.LJFF(this.LLILLJJLI, null), IAnimationQueueManager.class, null);
        if (iAnimationQueueManager != null) {
            iAnimationQueueManager.onPopupOrSheetDismissed(true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseQuickChatRoomFragment@2598.setupCommonViewModel$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

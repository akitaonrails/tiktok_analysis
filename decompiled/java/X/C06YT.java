package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatNoticeStateVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import njp.a;

/* JADX INFO: renamed from: X.06YT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem$applyRequestStateNoticeHiding$1", f = "CommonChatNoticeAssem.kt", l = {446}, m = "invokeSuspend")
public final class C06YT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommonChatNoticeAssem LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06YT(CommonChatNoticeAssem commonChatNoticeAssem, boolean z, InterfaceC1364105Vn<? super C06YT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commonChatNoticeAssem;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06YT(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommonChatNoticeAssem@3038.applyRequestStateNoticeHiding$1");
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
            ChatNoticeStateVM.vQ2(this.LLILLJJLI.Zo(), null, Boolean.valueOf(this.LLILLL), 1);
            if (!this.LLILLL) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CommonChatNoticeAssem@3038.applyRequestStateNoticeHiding$1");
                return unit;
            }
            CommonChatNoticeAssem commonChatNoticeAssem = this.LLILLJJLI;
            this.LL = 1;
            obj = commonChatNoticeAssem.op(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommonChatNoticeAssem@3038.applyRequestStateNoticeHiding$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ChatNoticeStateVM.vQ2(this.LLILLJJLI.Zo(), true, null, 2);
        if (!zBooleanValue) {
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLJJJJJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommonChatNoticeAssem.LLLIIIIL;
            ChatRoomCameraVM chatRoomCameraVM = (ChatRoomCameraVM) assemVMLazy.getValue();
            chatRoomCameraVM.LLIZ = true;
            chatRoomCameraVM.LLIZLLLIL.setValue(C0IBF.FEATURE_STATUS_HIDE);
            chatRoomCameraVM.setStateImmediate(AFwS229S0000000_2.get$arr$(870));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CommonChatNoticeAssem@3038.applyRequestStateNoticeHiding$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.IChatNoticeApiHelper;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.CommonChatNoticeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS151S1100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.068V, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.CommonChatNoticeViewModel$fetchNotice$1", f = "CommonChatNoticeViewModel.kt", l = {218, 220}, m = "invokeSuspend")
public final class C068V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ CommonChatNoticeViewModel LLILLL;
    public final /* synthetic */ EnumC15556067e LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ SessionInfo LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C068V(long j, CommonChatNoticeViewModel commonChatNoticeViewModel, EnumC15556067e enumC15556067e, String str, String str2, SessionInfo sessionInfo, InterfaceC1364105Vn<? super C068V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = commonChatNoticeViewModel;
        this.LLILZ = enumC15556067e;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = sessionInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C068V(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommonChatNoticeViewModel@3b85.fetchNotice$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CommonChatNoticeViewModel@3b85.fetchNotice$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("CommonChatNoticeViewModel@3b85.fetchNotice$1");
                return objLJFF;
            }
        }
        IRemindUsersViewHelper.LIZ.getClass();
        IRemindUsersViewHelper iRemindUsersViewHelperLIZ = C069A.LIZ();
        if (iRemindUsersViewHelperLIZ != null) {
            iRemindUsersViewHelperLIZ.LIZIZ();
        }
        CommonChatNoticeViewModel commonChatNoticeViewModel = this.LLILLL;
        IChatNoticeApiHelper iChatNoticeApiHelper = commonChatNoticeViewModel.LLIZ;
        EnumC15556067e enumC15556067e = this.LLILZ;
        String str = this.LLILZIL;
        String str2 = this.LLILZLL;
        ViewModelKt.getViewModelScope(commonChatNoticeViewModel);
        SessionInfo sessionInfo = this.LLIZ;
        AwS151S1100000_2 awS151S1100000_2 = new AwS151S1100000_2(sessionInfo, this.LLILZIL, 11);
        AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2(this.LLILLL, 219);
        this.LL = 2;
        if (iChatNoticeApiHelper.LIZJ(enumC15556067e, str, str2, sessionInfo, awS151S1100000_2, awS581S0100000_2, this) == objLJFF) {
            C1C7U.LIZIZ("CommonChatNoticeViewModel@3b85.fetchNotice$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CommonChatNoticeViewModel@3b85.fetchNotice$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

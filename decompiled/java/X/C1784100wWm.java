package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.im.b2c.replies.api.QuickReplySaveResponse;
import com.ss.android.ugc.aweme.im.b2c.replies.data.IMQuickReplyManagePageConfig;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReplyContent;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReplyText;
import com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment;
import com.ss.android.ugc.aweme.im.b2c.replies.vm.BusinessQuickReplyPanelVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment$handleSaveQuickReply$1$1", f = "IMQuickReplyManageFragment.kt", l = {383}, m = "invokeSuspend")
public final class C1784100wWm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ IMQuickReply LLILLL;
    public final /* synthetic */ IMQuickReplyManageFragment LLILZ;
    public final /* synthetic */ IMQuickReplyManagePageConfig LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784100wWm(String str, IMQuickReply iMQuickReply, IMQuickReplyManageFragment iMQuickReplyManageFragment, IMQuickReplyManagePageConfig iMQuickReplyManagePageConfig, InterfaceC1364105Vn<? super C1784100wWm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = iMQuickReply;
        this.LLILZ = iMQuickReplyManageFragment;
        this.LLILZIL = iMQuickReplyManagePageConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1784100wWm(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IMQuickReply iMQuickReply;
        C1C7U.LIZ("IMQuickReplyManageFragment@b31d.handleSaveQuickReply$1$1");
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
            IMQuickReplyContent iMQuickReplyContent = new IMQuickReplyContent(new IMQuickReplyText(this.LLILLJJLI));
            IMQuickReply iMQuickReply2 = this.LLILLL;
            if (iMQuickReply2 != null) {
                iMQuickReply = new IMQuickReply(iMQuickReply2.id, iMQuickReply2.type, iMQuickReplyContent, iMQuickReply2.f70default);
            } else {
                iMQuickReply = new IMQuickReply("", 1, iMQuickReplyContent, false);
            }
            BusinessQuickReplyPanelVM businessQuickReplyPanelVMVR = this.LLILZ.VR();
            String str = this.LLILZIL.uid;
            this.LL = 1;
            obj = businessQuickReplyPanelVMVR.yQ2(str, iMQuickReply, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMQuickReplyManageFragment@b31d.handleSaveQuickReply$1$1");
                return objLJFF;
            }
        }
        IMQuickReplyManageFragment iMQuickReplyManageFragment = this.LLILZ;
        iMQuickReplyManageFragment.getClass();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(iMQuickReplyManageFragment);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1784120wWo(iMQuickReplyManageFragment, (QuickReplySaveResponse) obj, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMQuickReplyManageFragment@b31d.handleSaveQuickReply$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

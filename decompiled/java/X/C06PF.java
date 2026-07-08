package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.emoji.common.emojipagev2.EmojiPanelShowingStateVM;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatroomEmojiPanelAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06PF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatroomEmojiPanelAssem$onViewCreated$2", f = "ChatroomEmojiPanelAssem.kt", l = {172}, m = "invokeSuspend")
public final class C06PF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ChatroomEmojiPanelAssem LLILLL;
    public final /* synthetic */ ViewGroup LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06PF(ChatroomEmojiPanelAssem chatroomEmojiPanelAssem, ViewGroup viewGroup, int i, boolean z, InterfaceC1364105Vn<? super C06PF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = chatroomEmojiPanelAssem;
        this.LLILZ = viewGroup;
        this.LLILZIL = i;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06PF c06pf = new C06PF(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c06pf.LLILLJJLI = obj;
        return c06pf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        Fragment fragmentLJI;
        C1C7U.LIZ("ChatroomEmojiPanelAssem@819c.onViewCreated$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            AssemVMLazy assemVMLazy = this.LLILLL.LLJJL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ChatroomEmojiPanelAssem.LLJLLIL;
            InterfaceC346201Wa interfaceC346201Wa = (InterfaceC346201Wa) ((EmojiPanelShowingStateVM) assemVMLazy.getValue()).LLILLJJLI.getValue();
            C1768806wI c1768806wI = new C1768806wI(((MessageListViewModel) ((IIMessageListViewModel) this.LLILLL.LLJL.getValue())).LLIZ, 6);
            C05YW.LIZ.getClass();
            C414301jJ c414301jJ = new C414301jJ(interfaceC346201Wa, C09IC.LJJIJIL(c1768806wI, interfaceC497601wk, C1370905Yd.LIZIZ, ((MessageListViewModel) ((IIMessageListViewModel) this.LLILLL.LLJL.getValue())).LLIZ.getValue()), new C05DN(null));
            C05DM c05dm = new C05DM(null);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (C09IC.LJIJ(c414301jJ, this, c05dm) == objLJFF) {
                C1C7U.LIZIZ("ChatroomEmojiPanelAssem@819c.onViewCreated$2");
                return objLJFF;
            }
        }
        if (C2296808zG.LJI(interfaceC497601wk) && (fragmentLJI = C724240Sb0.LJI(this.LLILLL)) != null && C494501wF.LIZ(fragmentLJI)) {
            if (this.LLILLL.getSupervisor().LLJJIII == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ChatroomEmojiPanelAssem@819c.onViewCreated$2");
                return unit;
            }
            ChatroomEmojiPanelAssem.kp(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("ChatroomEmojiPanelAssem@819c.onViewCreated$2");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("ChatroomEmojiPanelAssem@819c.onViewCreated$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

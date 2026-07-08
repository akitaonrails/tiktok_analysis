package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.im.quickchat.ui.assem.QuickEmojiPanelAssem;
import com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService;
import com.ss.android.ugc.aweme.model.IMSocialAvatarStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HtC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.quickchat.ui.assem.QuickEmojiPanelAssem$subscribeAiMojiData$1", f = "QuickEmojiPanelAssem.kt", l = {456}, m = "invokeSuspend")
public final class C455240HtC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ QuickEmojiPanelAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C455240HtC(QuickEmojiPanelAssem quickEmojiPanelAssem, InterfaceC1364105Vn<? super C455240HtC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = quickEmojiPanelAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C455240HtC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C456970Hvz c456970Hvz;
        C1C7U.LIZ("QuickEmojiPanelAssem@177a.subscribeAiMojiData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IIMSocialAvatarService iIMSocialAvatarServiceKp = this.LLILLJJLI.kp();
            C456260Huq c456260HuqLp = this.LLILLJJLI.lp();
            if (c456260HuqLp != null && (c456970Hvz = c456260HuqLp.LLILLJJLI) != null) {
                str = c456970Hvz.LLILLJJLI;
            } else {
                str = null;
            }
            C05YD<IMSocialAvatarStatus> c05ydLJJLI = iIMSocialAvatarServiceKp.LJJLI(str, false);
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLJJLI, 50);
            this.LL = 1;
            if (c05ydLJJLI.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("QuickEmojiPanelAssem@177a.subscribeAiMojiData$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

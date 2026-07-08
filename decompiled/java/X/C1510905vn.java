package X;

import Y.AgS283S0100000_2;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.emoji.common.emojipagev2.EmojiPanelShowingStateVM;
import com.ss.android.ugc.aweme.im.sticker.basic.panel.BasicStickerPanelAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05vn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.basic.panel.BasicStickerPanelAssem$onViewCreated$3", f = "BasicStickerPanelAssem.kt", l = {132}, m = "invokeSuspend")
public final class C1510905vn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BasicStickerPanelAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1510905vn(BasicStickerPanelAssem basicStickerPanelAssem, InterfaceC1364105Vn<? super C1510905vn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = basicStickerPanelAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1510905vn(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BasicStickerPanelAssem@8f68.onViewCreated$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLJJIII;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BasicStickerPanelAssem.LLJJLIIIJLLLLLLLZ;
            C01S9 c01s9 = (C01S9) ((EmojiPanelShowingStateVM) assemVMLazy.getValue()).LLILLJJLI.getValue();
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 33);
            this.LL = 1;
            if (c01s9.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("BasicStickerPanelAssem@8f68.onViewCreated$3");
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

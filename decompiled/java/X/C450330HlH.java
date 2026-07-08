package X;

import Y.AgS287S0100000_6;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.emoji.emojiPageV2.EmojiPanelBottomPaddingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HlH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.impl.ui.StickerGridPageWithinPowerCell$initView$4$1", f = "StickerGridPageWithinPowerCell.kt", l = {288}, m = "invokeSuspend")
public final class C450330HlH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AssemVMLazy<InterfaceC0148002o, EmojiPanelBottomPaddingVM> LLILLJJLI;
    public final /* synthetic */ C450470HlV LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450330HlH(AssemVMLazy<InterfaceC0148002o, EmojiPanelBottomPaddingVM> assemVMLazy, C450470HlV c450470HlV, InterfaceC1364105Vn<? super C450330HlH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = assemVMLazy;
        this.LLILLL = c450470HlV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C450330HlH(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerGridPageWithinPowerCell@1408.initView$4$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AssemVMLazy<InterfaceC0148002o, EmojiPanelBottomPaddingVM> assemVMLazy = this.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C450470HlV.LJJIIZ;
            C2252321DDq c2252321DDq = ((EmojiPanelBottomPaddingVM) assemVMLazy.getValue()).LLILLJJLI;
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLL, 167);
            this.LL = 1;
            if (c2252321DDq.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("StickerGridPageWithinPowerCell@1408.initView$4$1");
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

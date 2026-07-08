package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.quickchat.ui.assem.QuickEmojiPanelAssem;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Wa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.quickchat.ui.assem.QuickEmojiPanelAssem$showSAStickersPanelRecommendation$3$1", f = "QuickEmojiPanelAssem.kt", l = {}, m = "invokeSuspend")
public final class C1620206Wa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ QuickEmojiPanelAssem LL;
    public final /* synthetic */ List<StickerItem> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1620206Wa(QuickEmojiPanelAssem quickEmojiPanelAssem, List<StickerItem> list, InterfaceC1364105Vn<? super C1620206Wa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = quickEmojiPanelAssem;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1620206Wa(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("QuickEmojiPanelAssem@177a.showSAStickersPanelRecommendation$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        QuickEmojiPanelAssem quickEmojiPanelAssem = this.LL;
        List<StickerItem> list = this.LLILLJJLI;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            for (StickerItem stickerItem : list) {
                quickEmojiPanelAssem.getClass();
                if (QuickEmojiPanelAssem.sp(stickerItem)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        quickEmojiPanelAssem.LLJLLIL = z;
        C455190Ht7 c455190Ht7Op = this.LL.op();
        if (c455190Ht7Op != null) {
            c455190Ht7Op.e0();
        }
        C455190Ht7 c455190Ht7Op2 = this.LL.op();
        if (c455190Ht7Op2 != null) {
            c455190Ht7Op2.setEmojiDataList(this.LLILLJJLI);
        }
        this.LL.ip();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QuickEmojiPanelAssem@177a.showSAStickersPanelRecommendation$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

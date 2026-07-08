package X;

import Y.AgS197S0200000_6;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.sticker.basic.panel.BasicSetStickerPageCell;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hk9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.basic.panel.BasicSetStickerPageCell$onBindItemView$1", f = "BasicStickerPanelAssem.kt", l = {428}, m = "invokeSuspend")
public final class C449630Hk9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BasicSetStickerPageCell LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C450470HlV LLILZ;
    public final /* synthetic */ C444150HbJ LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C449630Hk9(BasicSetStickerPageCell basicSetStickerPageCell, long j, C450470HlV c450470HlV, C444150HbJ c444150HbJ, InterfaceC1364105Vn<? super C449630Hk9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = basicSetStickerPageCell;
        this.LLILLL = j;
        this.LLILZ = c450470HlV;
        this.LLILZIL = c444150HbJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C449630Hk9(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BasicSetStickerPageCell@c9f6.onBindItemView$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            BasicSetStickerPageCell basicSetStickerPageCell = this.LLILLJJLI;
            InterfaceC450290HlD interfaceC450290HlD = basicSetStickerPageCell.LLJILJILJ;
            if (interfaceC450290HlD == null) {
                synchronized (basicSetStickerPageCell) {
                    interfaceC450290HlD = basicSetStickerPageCell.LLJILJILJ;
                    if (interfaceC450290HlD == null) {
                        interfaceC450290HlD = (InterfaceC450290HlD) C1807670x8n.LLLLLZ();
                        basicSetStickerPageCell.LLJILJILJ = interfaceC450290HlD;
                    }
                }
            }
            C05YD<AbstractC450030Hkn<List<SetSticker>>> setStickersFlow = interfaceC450290HlD.getSetStickersFlow(this.LLILLL);
            if (setStickersFlow != null) {
                AgS197S0200000_6 agS197S0200000_6 = new AgS197S0200000_6(this.LLILZ, this.LLILZIL, 21);
                this.LL = 1;
                if (setStickersFlow.collect(agS197S0200000_6, this) == objLJFF) {
                    C1C7U.LIZIZ("BasicSetStickerPageCell@c9f6.onBindItemView$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BasicSetStickerPageCell@c9f6.onBindItemView$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

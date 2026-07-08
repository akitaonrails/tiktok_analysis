package X;

import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.util.IStickerStoreHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HY6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.impl.ui.StickerGridPageWithinPowerCell$onPopupActionClicked$3", f = "StickerGridPageWithinPowerCell.kt", l = {138}, m = "invokeSuspend")
public final class C0HY6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C450470HlV LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ C451030HmP LLILZLL;
    public final /* synthetic */ Integer LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HY6(C450470HlV c450470HlV, Long l, String str, Integer num, C451030HmP c451030HmP, Integer num2, InterfaceC1364105Vn<? super C0HY6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c450470HlV;
        this.LLILLL = l;
        this.LLILZ = str;
        this.LLILZIL = num;
        this.LLILZLL = c451030HmP;
        this.LLIZ = num2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HY6(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        int iIntValue;
        Long setId;
        C1C7U.LIZ("StickerGridPageWithinPowerCell@1408.onPopupActionClicked$3");
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
            IStickerStoreHelper.LIZ.getClass();
            IStickerStoreHelper iStickerStoreHelperLIZ = C0HY9.LIZ();
            if (iStickerStoreHelperLIZ != null) {
                C450550Hld c450550HldLJ = this.LLILLJJLI.LJ();
                Long l = this.LLILLL;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                Long lLJFF = C2286608xc.LJFF(jLongValue);
                String str = this.LLILZ;
                Integer num = this.LLILZIL;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                Integer numLJ = C2286608xc.LJ(iIntValue);
                SetSticker setSticker = this.LLILZLL.LJ;
                if (setSticker != null) {
                    setId = setSticker.getSetId();
                } else {
                    setId = null;
                }
                Integer num2 = this.LLIZ;
                this.LL = 1;
                if (iStickerStoreHelperLIZ.LJFF(c450550HldLJ, lLJFF, str, numLJ, "favourite_tab", setId, num2, null, null, null, false, this) == objLJFF) {
                    C1C7U.LIZIZ("StickerGridPageWithinPowerCell@1408.onPopupActionClicked$3");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerGridPageWithinPowerCell@1408.onPopupActionClicked$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

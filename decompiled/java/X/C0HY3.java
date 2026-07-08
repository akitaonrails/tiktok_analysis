package X;

import com.ss.android.ugc.aweme.util.IStickerStoreHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HY3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.impl.ui.StickerGridPageWithinPowerCell$onPopupActionClicked$2", f = "StickerGridPageWithinPowerCell.kt", l = {124}, m = "invokeSuspend")
public final class C0HY3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C450470HlV LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ Long LLILZLL;
    public final /* synthetic */ Integer LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HY3(C450470HlV c450470HlV, Long l, String str, Integer num, Long l2, Integer num2, InterfaceC1364105Vn<? super C0HY3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c450470HlV;
        this.LLILLL = l;
        this.LLILZ = str;
        this.LLILZIL = num;
        this.LLILZLL = l2;
        this.LLIZ = num2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HY3(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        int iIntValue;
        String string;
        C1C7U.LIZ("StickerGridPageWithinPowerCell@1408.onPopupActionClicked$2");
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
            C450550Hld c450550HldLJ = this.LLILLJJLI.LJ();
            Long l = this.LLILLL;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            String str = this.LLILZ;
            Integer num = this.LLILZIL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            Long l2 = this.LLILZLL;
            if (l2 != null) {
                string = l2.toString();
            } else {
                string = null;
            }
            Integer num2 = this.LLIZ;
            EnumC441530HTb enumC441530HTb = EnumC441530HTb.TOP;
            this.LL = 1;
            if (iStickerStoreHelperLIZ.LIZIZ("favourite_tab", "long_press", c450550HldLJ, jLongValue, str, iIntValue, string, num2, null, null, false, Integer.valueOf(C0HK7.UNKNOWN.getSource()), null, false, null, enumC441530HTb, null, null, false, this) == objLJFF) {
                C1C7U.LIZIZ("StickerGridPageWithinPowerCell@1408.onPopupActionClicked$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerGridPageWithinPowerCell@1408.onPopupActionClicked$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

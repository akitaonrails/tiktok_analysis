package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.share.TakoShareImageShowViewKt$TakoShareImageSharedElementPreview$4$1", f = "TakoShareImageShowView.kt", l = {244}, m = "invokeSuspend")
public final class C1361005Ui extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ InterfaceC1361305Ul LLILLL;
    public final /* synthetic */ TakoContentPreviewItem.Image LLILZ;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ C05P0<Boolean> LLIZ;
    public final /* synthetic */ C05P0<C1683130ttv> LLIZLLLIL;
    public final /* synthetic */ C05P0<C05UQ> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1361005Ui(int i, InterfaceC1361305Ul interfaceC1361305Ul, TakoContentPreviewItem.Image image, C1677480tko<Float, C1677280tkU> c1677480tko, Function0<Unit> function0, C05P0<Boolean> c05p0, C05P0<C1683130ttv> c05p02, C05P0<C05UQ> c05p03, InterfaceC1364105Vn<? super C1361005Ui> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = interfaceC1361305Ul;
        this.LLILZ = image;
        this.LLILZIL = c1677480tko;
        this.LLILZLL = function0;
        this.LLIZ = c05p0;
        this.LLIZLLLIL = c05p02;
        this.LLJ = c05p03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1361005Ui(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05UQ c05uqY8;
        C1683130ttv c1683130ttvAa;
        C1C7U.LIZ("TakoShareImageShowViewKt@b200.TakoShareImageSharedElementPreview$4$1");
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
            if (this.LLILLJJLI > 0 && !this.LLIZ.getValue().booleanValue()) {
                this.LLIZ.setValue(Boolean.TRUE);
                InterfaceC1361305Ul interfaceC1361305Ul = this.LLILLL;
                if (interfaceC1361305Ul != null && (c1683130ttvAa = interfaceC1361305Ul.aa(this.LLILZ.itemUUID)) != null) {
                    this.LLIZLLLIL.setValue(c1683130ttvAa);
                }
                InterfaceC1361305Ul interfaceC1361305Ul2 = this.LLILLL;
                if (interfaceC1361305Ul2 != null && (c05uqY8 = interfaceC1361305Ul2.Y8(this.LLILZ.itemUUID)) != null) {
                    this.LLJ.setValue(c05uqY8);
                }
                InterfaceC1361305Ul interfaceC1361305Ul3 = this.LLILLL;
                if (interfaceC1361305Ul3 != null) {
                    interfaceC1361305Ul3.Of(this.LLILZ.itemUUID, true);
                }
                C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILZIL;
                Float fLIZLLL = C2286608xc.LIZLLL(0.0f);
                C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 0, null, 6);
                this.LL = 1;
                if (C1677480tko.LIZJ(c1677480tko, fLIZLLL, c1677050tk7LIZLLL, null, null, this, 12) == objLJFF) {
                    C1C7U.LIZIZ("TakoShareImageShowViewKt@b200.TakoShareImageSharedElementPreview$4$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TakoShareImageShowViewKt@b200.TakoShareImageSharedElementPreview$4$1");
                return unit;
            }
        }
        this.LLILZLL.invoke();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoShareImageShowViewKt@b200.TakoShareImageSharedElementPreview$4$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

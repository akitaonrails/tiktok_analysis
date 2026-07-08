package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FHW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.text.pro.TextFontCategoryPagerComponent$fetchData$taskOldPanel$1", f = "TextFontCategoryPagerComponent.kt", l = {146}, m = "invokeSuspend")
public final class C0FHW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0FGS>>, Object> {
    public int LL;
    public final /* synthetic */ C0FHS LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FHW(C0FHS c0fhs, InterfaceC1364105Vn<? super C0FHW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0fhs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FHW(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextFontCategoryPagerComponent@2fba.fetchData$taskOldPanel$1");
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
            C0FHS c0fhs = this.LLILLJJLI;
            String str = c0fhs.LLJJI;
            this.LL = 1;
            obj = c0fhs.Z4(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TextFontCategoryPagerComponent@2fba.fetchData$taskOldPanel$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TextFontCategoryPagerComponent@2fba.fetchData$taskOldPanel$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0FGS>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

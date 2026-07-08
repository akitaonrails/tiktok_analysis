package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FHU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.text.pro.TextFontCategoryPagerComponent$fetchData$2", f = "TextFontCategoryPagerComponent.kt", l = {152}, m = "invokeSuspend")
public final class C0FHU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0FHS LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0FHS LLILLL;
    public final /* synthetic */ AnonymousClass0957<List<C0FGS>> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0FHU(C0FHS c0fhs, AnonymousClass0957<? extends List<C0FGS>> anonymousClass0957, boolean z, InterfaceC1364105Vn<? super C0FHU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0fhs;
        this.LLILZ = anonymousClass0957;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FHU(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0FHS c0fhs;
        C1C7U.LIZ("TextFontCategoryPagerComponent@2fba.fetchData$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c0fhs = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c0fhs = this.LLILLL;
            AnonymousClass0957<List<C0FGS>> anonymousClass0957 = this.LLILZ;
            this.LL = c0fhs;
            this.LLILLJJLI = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TextFontCategoryPagerComponent@2fba.fetchData$2");
                return objLJFF;
            }
        }
        c0fhs.F4((List) obj, this.LLILZIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextFontCategoryPagerComponent@2fba.fetchData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

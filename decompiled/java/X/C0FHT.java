package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FHT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.text.pro.TextFontCategoryPagerComponent$fetchData$4", f = "TextFontCategoryPagerComponent.kt", l = {161, 162}, m = "invokeSuspend")
public final class C0FHT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<List<C0FGS>> LLILLL;
    public final /* synthetic */ AnonymousClass0957<List<C0FGS>> LLILZ;
    public final /* synthetic */ C0FHS LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0FHT(AnonymousClass0957<? extends List<C0FGS>> anonymousClass0957, AnonymousClass0957<? extends List<C0FGS>> anonymousClass09572, C0FHS c0fhs, boolean z, InterfaceC1364105Vn<? super C0FHT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass0957;
        this.LLILZ = anonymousClass09572;
        this.LLILZIL = c0fhs;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FHT(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<C0FGS> list;
        C1C7U.LIZ("TextFontCategoryPagerComponent@2fba.fetchData$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    list = (List) this.LL;
                    C155000ia.LIZIZ(obj);
                    C0FHS c0fhs = this.LLILZIL;
                    c0fhs.F4(c0fhs.C5(list, (List) obj), this.LLILZLL);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TextFontCategoryPagerComponent@2fba.fetchData$4");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0957<List<C0FGS>> anonymousClass0957 = this.LLILLL;
            this.LLILLJJLI = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TextFontCategoryPagerComponent@2fba.fetchData$4");
                return objLJFF;
            }
        }
        List<C0FGS> list2 = (List) obj;
        AnonymousClass0957<List<C0FGS>> anonymousClass09572 = this.LLILZ;
        this.LL = list2;
        this.LLILLJJLI = 2;
        Object objLJLIIIL = anonymousClass09572.LJLIIIL(this);
        if (objLJLIIIL == objLJFF) {
            C1C7U.LIZIZ("TextFontCategoryPagerComponent@2fba.fetchData$4");
            return objLJFF;
        }
        list = list2;
        obj = objLJLIIIL;
        C0FHS c0fhs2 = this.LLILZIL;
        c0fhs2.F4(c0fhs2.C5(list, (List) obj), this.LLILZLL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TextFontCategoryPagerComponent@2fba.fetchData$4");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

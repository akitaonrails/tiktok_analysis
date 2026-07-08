package X;

import com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uU5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.StickerResProvider$preload$1$1$1", f = "StickerResProvider.kt", l = {44}, m = "invokeSuspend")
public final class C1705550uU5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1705580uU8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705550uU5(C1705580uU8 c1705580uU8, InterfaceC1364105Vn<? super C1705550uU5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1705580uU8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1705550uU5 c1705550uU5 = new C1705550uU5(this.LLILLL, interfaceC1364105Vn);
        c1705550uU5.LLILLJJLI = obj;
        return c1705550uU5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        List<AssetsLibData.AssetsLibCategory> list;
        AssetsLibData.AssetsLibCategory assetsLibCategory;
        C1C7U.LIZ("StickerResProvider@ef8d.preload$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1705580uU8 c1705580uU8 = this.LLILLL;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = c1705580uU8.LIZIZ(false, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickerResProvider@ef8d.preload$1$1$1");
                return objLJFF;
            }
        }
        AssetsLibData assetsLibData = (AssetsLibData) obj;
        if (assetsLibData != null && (list = assetsLibData.categories) != null && (assetsLibCategory = (AssetsLibData.AssetsLibCategory) C1706490uVb.LIZLLL(0, list)) != null) {
            this.LLILLL.LIZ.put(assetsLibCategory.key, C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1705560uU6(this.LLILLL, assetsLibCategory, null), 3));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StickerResProvider@ef8d.preload$1$1$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StickerResProvider@ef8d.preload$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

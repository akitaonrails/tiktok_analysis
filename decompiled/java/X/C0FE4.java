package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FE4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.common.text.pro.style.TextStyleCategoryPagerComponent$onTextStyleClick$2$effectDeferred$1", f = "TextStyleCategoryPagerComponent.kt", l = {244}, m = "invokeSuspend")
public final class C0FE4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Effect>>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ C0FGO LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FE4(boolean z, Effect effect, C0FGO c0fgo, InterfaceC1364105Vn<? super C0FE4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = effect;
        this.LLILZ = c0fgo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FE4(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("TextStyleCategoryPagerComponent@4920.onTextStyleClick$2$effectDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                c098200Yq = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                c098200Yq = this.LLILLL;
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                C0FDM c0fdmD5 = this.LLILZ.d5();
                if (c0fdmD5 != null) {
                    Effect effect = this.LLILLL;
                    this.LL = 1;
                    c098200Yq = c0fdmD5.LIZIZ(effect, null, this);
                    if (c098200Yq == objLJFF) {
                        C1C7U.LIZIZ("TextStyleCategoryPagerComponent@4920.onTextStyleClick$2$effectDeferred$1");
                        return objLJFF;
                    }
                } else {
                    c098200Yq = new C098200Yq(new RuntimeException("textResourceService is null"));
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("TextStyleCategoryPagerComponent@4920.onTextStyleClick$2$effectDeferred$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Effect>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

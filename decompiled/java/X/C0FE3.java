package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FE3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.common.text.pro.style.TextStyleCategoryPagerComponent$onTextStyleClick$2$fontDeferred$1", f = "TextStyleCategoryPagerComponent.kt", l = {253}, m = "invokeSuspend")
public final class C0FE3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Effect>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Effect LLILZ;
    public final /* synthetic */ C0FGO LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FE3(String str, boolean z, Effect effect, C0FGO c0fgo, InterfaceC1364105Vn<? super C0FE3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = effect;
        this.LLILZIL = c0fgo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FE3(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("TextStyleCategoryPagerComponent@4920.onTextStyleClick$2$fontDeferred$1");
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
            if (this.LLILLJJLI.length() != 0 && !this.LLILLL) {
                C0FDM c0fdmD5 = this.LLILZIL.d5();
                if (c0fdmD5 != null) {
                    String str = this.LLILLJJLI;
                    this.LL = 1;
                    c098200Yq = c0fdmD5.LJ(str, null, this, null);
                    if (c098200Yq == objLJFF) {
                        C1C7U.LIZIZ("TextStyleCategoryPagerComponent@4920.onTextStyleClick$2$fontDeferred$1");
                        return objLJFF;
                    }
                } else {
                    c098200Yq = new C098200Yq(new RuntimeException("textResourceService is null"));
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } else {
                c098200Yq = this.LLILZ;
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
            C1C7U.LIZIZ("TextStyleCategoryPagerComponent@4920.onTextStyleClick$2$fontDeferred$1");
            return c189200o6M1boximpl;
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            c098200Yq = ((Pair) c098200Yq).getSecond();
        }
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6 c189200o6M1boximpl2 = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("TextStyleCategoryPagerComponent@4920.onTextStyleClick$2$fontDeferred$1");
        return c189200o6M1boximpl2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Effect>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

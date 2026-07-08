package X;

import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import eha.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vWO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper$onBind$4$5$4", f = "TextInputHelper.kt", l = {341}, m = "invokeSuspend")
public final class C1745420vWO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ a0 LLILLJJLI;
    public final /* synthetic */ C1745300vWC LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745420vWO(a0 a0Var, C1745300vWC c1745300vWC, InterfaceC1364105Vn<? super C1745420vWO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = a0Var;
        this.LLILLL = c1745300vWC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1745420vWO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        RecyclerView recyclerView;
        C1C7U.LIZ("TextInputHelper@35d4.onBind$4$5$4");
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
            KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LLILLJJLI.LLILLJJLI.LLJLILLLLZIIL;
            if (keyBoardVisibilityUtil != null && !keyBoardVisibilityUtil.LLILZ) {
                C1745300vWC c1745300vWC = this.LLILLL;
                this.LL = 1;
                if (C0H1U.LJ(c1745300vWC, this, true) == objLJFF) {
                    C1C7U.LIZIZ("TextInputHelper@35d4.onBind$4$5$4");
                    return objLJFF;
                }
            }
        }
        ViewParent parent = this.LLILLJJLI.LL.getParent();
        if ((parent instanceof RecyclerView) && (recyclerView = (RecyclerView) parent) != null) {
            recyclerView.smoothScrollBy(0, this.LLILLJJLI.LL.getTop());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextInputHelper@35d4.onBind$4$5$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

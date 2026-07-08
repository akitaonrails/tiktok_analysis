package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS131S0201000_4;
import njp.a;

/* JADX INFO: renamed from: X.0Cks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.common.ui.anim.AdjustableFooterUtilKt$scrollToMessage$1$2", f = "AdjustableFooterUtil.kt", l = {101}, m = "invokeSuspend")
public final class C322680Cks extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ LinearLayoutManager LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C322680Cks(Context context, LinearLayoutManager linearLayoutManager, int i, InterfaceC1364105Vn<? super C322680Cks> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = linearLayoutManager;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322680Cks(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdjustableFooterUtilKt@828d.scrollToMessage$1$2");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("AdjustableFooterUtilKt@828d.scrollToMessage$1$2");
                return objLJFF;
            }
        }
        if (C322700Cku.LIZ(this.LLILLJJLI)) {
            C07GV.LIZ(new AwS131S0201000_4(this.LLILZ, this.LLILLJJLI, this.LLILLL, 5));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdjustableFooterUtilKt@828d.scrollToMessage$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

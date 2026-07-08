package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NZo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.SearchGridSpacingItemDecorationKt$1$onChildViewAttachedToWindow$1", f = "SearchGridSpacingItemDecorationKt.kt", l = {82}, m = "invokeSuspend")
public final class C596100NZo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IAdjustAbility LLILLJJLI;
    public final /* synthetic */ C626210OhH LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596100NZo(IAdjustAbility iAdjustAbility, C626210OhH c626210OhH, View view, InterfaceC1364105Vn<? super C596100NZo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iAdjustAbility;
        this.LLILLL = c626210OhH;
        this.LLILZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596100NZo(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchGridSpacingItemDecorationKt@cfa1.<init>$1$onChildViewAttachedToWindow$1");
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
            AnonymousClass0957<Pair<Boolean, Integer>> anonymousClass0957UX0 = this.LLILLJJLI.uX0();
            if (anonymousClass0957UX0 != null) {
                this.LL = 1;
                obj = anonymousClass0957UX0.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SearchGridSpacingItemDecorationKt@cfa1.<init>$1$onChildViewAttachedToWindow$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SearchGridSpacingItemDecorationKt@cfa1.<init>$1$onChildViewAttachedToWindow$1");
            return unit;
        }
        if (obj != null) {
            C626210OhH c626210OhH = this.LLILLL;
            ((HashMap) c626210OhH.LLILLL.getValue()).put(this.LLILZ, obj);
            c626210OhH.LIZ();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchGridSpacingItemDecorationKt@cfa1.<init>$1$onChildViewAttachedToWindow$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

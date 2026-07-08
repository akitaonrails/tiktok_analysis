package X;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.profile.business.ur.longpress.LongPressAwemeFragment;
import com.ss.android.ugc.ur.longpress.AwemeRouteDetailPageParams;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12Me, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.longpress.LongPressServiceImpl$startActivity$1$fetchFragmentAsync$1", f = "LongPressServiceImpl.kt", l = {170, 172}, m = "invokeSuspend")
public final class C19742612Me extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends LongPressAwemeFragment, ? extends Bundle>>, Object> {
    public Object LL;
    public AwemeRouteDetailPageParams LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ AwemeRouteDetailPageParams LLILZIL;
    public final /* synthetic */ AnonymousClass0957<List<UrlModel>> LLILZLL;
    public final /* synthetic */ C19EG LLIZ;
    public final /* synthetic */ Bundle LLIZLLLIL;
    public final /* synthetic */ int[] LLJ;
    public final /* synthetic */ C11RK<MotionEvent> LLJI;
    public final /* synthetic */ C259800zU<InterfaceC1259330isN> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19742612Me(View view, AwemeRouteDetailPageParams awemeRouteDetailPageParams, AnonymousClass0957<? extends List<? extends UrlModel>> anonymousClass0957, C19EG c19eg, Bundle bundle, int[] iArr, C11RK<MotionEvent> c11rk, C259800zU<InterfaceC1259330isN> c259800zU, InterfaceC1364105Vn<? super C19742612Me> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = view;
        this.LLILZIL = awemeRouteDetailPageParams;
        this.LLILZLL = anonymousClass0957;
        this.LLIZ = c19eg;
        this.LLIZLLLIL = bundle;
        this.LLJ = iArr;
        this.LLJI = c11rk;
        this.LLJIJIL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19742612Me(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<LongPressAwemeFragment, Bundle>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends LongPressAwemeFragment, ? extends Bundle>> interfaceC1364105Vn) {
        return invoke2(interfaceC497601wk, (InterfaceC1364105Vn<? super Pair<LongPressAwemeFragment, Bundle>>) interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x010e  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19742612Me.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

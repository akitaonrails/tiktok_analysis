package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.business.ur.longpress.LongPressServiceImpl;
import com.ss.android.ugc.ur.longpress.AwemeRouteDetailPageParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12Mg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.longpress.LongPressServiceImpl$startActivity$1", f = "LongPressServiceImpl.kt", l = {198, 211, 271}, m = "invokeSuspend")
public final class C19742812Mg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ AwemeRouteDetailPageParams LLILZIL;
    public final /* synthetic */ C19742912Mh LLILZLL;
    public final /* synthetic */ LongPressServiceImpl LLIZ;
    public final /* synthetic */ C19EG LLIZLLLIL;
    public final /* synthetic */ Bundle LLJ;
    public final /* synthetic */ C259800zU<InterfaceC1259330isN> LLJI;
    public final /* synthetic */ AbstractC1387200mCc LLJIJIL;
    public final /* synthetic */ Integer LLJILJIL;
    public final /* synthetic */ Fragment LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19742812Mg(View view, AwemeRouteDetailPageParams awemeRouteDetailPageParams, C19742912Mh c19742912Mh, LongPressServiceImpl longPressServiceImpl, C19EG c19eg, Bundle bundle, C259800zU<InterfaceC1259330isN> c259800zU, AbstractC1387200mCc abstractC1387200mCc, Integer num, Fragment fragment, InterfaceC1364105Vn<? super C19742812Mg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = view;
        this.LLILZIL = awemeRouteDetailPageParams;
        this.LLILZLL = c19742912Mh;
        this.LLIZ = longPressServiceImpl;
        this.LLIZLLLIL = c19eg;
        this.LLJ = bundle;
        this.LLJI = c259800zU;
        this.LLJIJIL = abstractC1387200mCc;
        this.LLJILJIL = num;
        this.LLJILJILJ = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19742812Mg c19742812Mg = new C19742812Mg(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c19742812Mg.LLILLL = obj;
        return c19742812Mg;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c1  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19742812Mg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

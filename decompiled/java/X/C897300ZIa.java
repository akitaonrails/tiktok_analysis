package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tablet.impl.business.feed.TabletFeedImpl$showSwipeDownHint$1", f = "TabletFeedImpl.kt", l = {456}, m = "invokeSuspend")
public final class C897300ZIa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897300ZIa(Fragment fragment, Context context, View view, InterfaceC1364105Vn<? super C897300ZIa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = fragment;
        this.LLILZ = context;
        this.LLILZIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C897300ZIa(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("TabletFeedImpl@4dcc.showSwipeDownHint$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLJJLI;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLL);
            c1389890mGx.LJIIIZ(2131848693);
            c1389890mGx.LJFF(R.raw.icon_lock_fill);
            c1389890mGx.LJII(R.attr.a1h);
            c1389890mGx.LIZLLL(3000L);
            c1389890mGx.LJIIJJI();
            C1616540sAW.LIZ.getClass();
            i = ((Keva) C1616540sAW.LJII.getValue()).getInt("swipe_up_lock_hint", 0);
            if (i < ((Number) C0AVT.LIZ.getValue()).intValue()) {
                this.LL = i;
                this.LLILLJJLI = 1;
                if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                    C1C7U.LIZIZ("TabletFeedImpl@4dcc.showSwipeDownHint$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TabletFeedImpl@4dcc.showSwipeDownHint$1");
            return unit;
        }
        C1383230m6D c1383230m6D = new C1383230m6D(null, 31);
        String string = this.LLILZ.getResources().getString(2131849394);
        C1389920mH0 c1389920mH0 = c1383230m6D.LIZ;
        c1389920mH0.LIZIZ = string;
        c1389920mH0.LJ = 3000L;
        new C1390080mHG(this.LLILZ, this.LLILZIL, c1383230m6D, C2286608xc.LJ(R.raw.icon_info_circle_fill), null, false, true, 32).LJJIIJZLJL();
        C1616540sAW.LIZ.getClass();
        ((Keva) C1616540sAW.LJII.getValue()).storeInt("swipe_up_lock_hint", i + 1);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TabletFeedImpl@4dcc.showSwipeDownHint$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import Y.ACListenerS108S0200000_4;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterPinPageAssem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DO1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterPinPageAssem$onViewCreated$8$2", f = "EnterPinPageAssem.kt", l = {311}, m = "invokeSuspend")
public final class C0DO1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public EnterPinPageAssem LL;
    public UIAssem LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ Long LLILZIL;
    public final /* synthetic */ EnterPinPageAssem LLILZLL;
    public final /* synthetic */ UIAssem LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DO1(Long l, EnterPinPageAssem enterPinPageAssem, UIAssem uIAssem, InterfaceC1364105Vn<? super C0DO1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = l;
        this.LLILZLL = enterPinPageAssem;
        this.LLIZ = uIAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DO1(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnterPinPageAssem enterPinPageAssem;
        UIAssem uIAssem;
        Iterator<Long> it2;
        String string;
        C1C7U.LIZ("EnterPinPageAssem@83fb.onViewCreated$8$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LLILLL;
                uIAssem = this.LLILLJJLI;
                enterPinPageAssem = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (this.LLILZIL.longValue() > jUptimeMillis) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EnterPinPageAssem@83fb.onViewCreated$8$2");
                return unit;
            }
            TuxTextView tuxTextView = this.LLILZLL.LLJJJJLIIL;
            if (tuxTextView != null) {
                C786410Ut5.LJLLLLLL(0, tuxTextView);
            }
            long jLongValue = this.LLILZIL.longValue();
            long j = EnterPinPageAssem.LLLIIIL;
            if (jLongValue + j < jUptimeMillis) {
                TuxTextView tuxTextView2 = this.LLILZLL.LLJJJJLIIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTextColorRes(R.attr.a1r);
                }
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("EnterPinPageAssem@83fb.onViewCreated$8$2");
                return unit2;
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds((this.LLILZIL.longValue() + j) - jUptimeMillis);
            C0DYW.LLILZ.getClass();
            C0DYW c0dyw = new C0DYW(seconds, 1, -1L);
            enterPinPageAssem = this.LLILZLL;
            uIAssem = this.LLIZ;
            it2 = c0dyw.iterator();
        }
        while (it2.hasNext()) {
            long jNextLong = ((AbstractC1902407ck) it2).nextLong();
            TuxTextView tuxTextView3 = enterPinPageAssem.LLJJL;
            if (tuxTextView3 != null) {
                Context context = uIAssem.getContext();
                if (context != null) {
                    string = context.getString(2131846978, C2286608xc.LJFF(jNextLong));
                } else {
                    string = null;
                }
                tuxTextView3.setText(string);
            }
            TuxTextView tuxTextView4 = enterPinPageAssem.LLJJL;
            if (tuxTextView4 != null) {
                C786410Ut5.LJLLLLLL(0, tuxTextView4);
            }
            this.LL = enterPinPageAssem;
            this.LLILLJJLI = uIAssem;
            this.LLILLL = it2;
            this.LLILZ = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("EnterPinPageAssem@83fb.onViewCreated$8$2");
                return objLJFF;
            }
        }
        TuxTextView tuxTextView5 = this.LLILZLL.LLJJL;
        if (tuxTextView5 != null) {
            C786410Ut5.LJLLLLLL(8, tuxTextView5);
        }
        EnterPinPageAssem enterPinPageAssem2 = this.LLILZLL;
        TuxTextView tuxTextView6 = enterPinPageAssem2.LLJJJJLIIL;
        if (tuxTextView6 != null) {
            UIAssem uIAssem2 = this.LLIZ;
            tuxTextView6.setTextColorRes(R.attr.a1r);
            C786410Ut5.h9(tuxTextView6, new ACListenerS108S0200000_4(uIAssem2, enterPinPageAssem2, 7));
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EnterPinPageAssem@83fb.onViewCreated$8$2");
        return unit3;
    }
}

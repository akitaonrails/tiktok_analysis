package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.profile.business.ur.school.addschool.SelectSchoolPageAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cx6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.addschool.SelectSchoolPageAssem$onViewCreated$2$5", f = "SelectSchoolPageAssem.kt", l = {303}, m = "invokeSuspend")
public final class C330260Cx6 extends C09AX implements Function2<C443120HZe<? extends AbstractC1623806Xk<? extends C626160OhC>, ? extends String, ? extends List<Object>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public EnumC330270Cx7 LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SelectSchoolPageAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330260Cx6(SelectSchoolPageAssem selectSchoolPageAssem, InterfaceC1364105Vn<? super C330260Cx6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = selectSchoolPageAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C330260Cx6 c330260Cx6 = new C330260Cx6(this.LLILZ, interfaceC1364105Vn);
        c330260Cx6.LLILLL = obj;
        return c330260Cx6;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C443120HZe<? extends AbstractC1623806Xk<C626160OhC>, String, ? extends List<Object>> c443120HZe, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c443120HZe, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(C443120HZe<? extends AbstractC1623806Xk<? extends C626160OhC>, ? extends String, ? extends List<Object>> c443120HZe, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return invoke2((C443120HZe<? extends AbstractC1623806Xk<C626160OhC>, String, ? extends List<Object>>) c443120HZe, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC330270Cx7 enumC330270Cx7;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        RecyclerView.LayoutManager layoutManager;
        int i;
        int i2;
        int i3;
        int i4;
        C1C7U.LIZ("SelectSchoolPageAssem@2721.onViewCreated$2$5");
        Object objLJFF = C099R.LJFF();
        int i5 = this.LLILLJJLI;
        if (i5 != 0) {
            if (i5 == 1) {
                enumC330270Cx7 = this.LL;
                str = (String) this.LLILLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C443120HZe c443120HZe = (C443120HZe) this.LLILLL;
            Object first = c443120HZe.getFirst();
            str = (String) c443120HZe.getSecond();
            List list = (List) c443120HZe.getThird();
            if (first instanceof C491001vg) {
                enumC330270Cx7 = EnumC330270Cx7.LLILLJJLI;
            } else if (first instanceof C1623706Xj) {
                enumC330270Cx7 = EnumC330270Cx7.LLILLL;
            } else if ((list != null && !list.isEmpty()) || str.length() <= 0) {
                if (str.length() > 0) {
                    enumC330270Cx7 = EnumC330270Cx7.LLILZ;
                } else {
                    enumC330270Cx7 = EnumC330270Cx7.LL;
                }
            } else {
                enumC330270Cx7 = EnumC330270Cx7.LLILZIL;
            }
            if (enumC330270Cx7 == EnumC330270Cx7.LLILLL) {
                this.LLILLL = str;
                this.LL = enumC330270Cx7;
                this.LLILLJJLI = 1;
                if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                    C1C7U.LIZIZ("SelectSchoolPageAssem@2721.onViewCreated$2$5");
                    return objLJFF;
                }
            }
        }
        LinearLayout linearLayout = this.LLILZ.LLJJLIIIJLLLLLLLZ;
        int i6 = 8;
        if (linearLayout != null) {
            if (enumC330270Cx7 == EnumC330270Cx7.LLILLJJLI) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            C786410Ut5.LJLLLLLL(i4, linearLayout);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILZ.LLJJJJ;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            if (enumC330270Cx7 == EnumC330270Cx7.LLILZ) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, viewOnAttachStateChangeListenerC20604515jv2);
        }
        FrameLayout frameLayout = this.LLILZ.LLJJJJJIL;
        if (frameLayout != null) {
            if (enumC330270Cx7 == EnumC330270Cx7.LL) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, frameLayout);
        }
        LinearLayout linearLayout2 = this.LLILZ.LLJJJJLIIL;
        if (linearLayout2 != null) {
            if (enumC330270Cx7 == EnumC330270Cx7.LLILZIL) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, linearLayout2);
        }
        View view = this.LLILZ.LLJJL;
        if (view != null) {
            if (enumC330270Cx7 == EnumC330270Cx7.LLILLL) {
                i6 = 0;
            }
            C786410Ut5.LJLLLLLL(i6, view);
        }
        if (enumC330270Cx7 == EnumC330270Cx7.LLILLJJLI) {
            this.LLILZ.LJLZ();
        } else if (enumC330270Cx7 == EnumC330270Cx7.LLILZ && (viewOnAttachStateChangeListenerC20604515jv = this.LLILZ.LLJJJJ) != null && (layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager()) != null) {
            layoutManager.scrollToPosition(0);
        }
        if (enumC330270Cx7 == EnumC330270Cx7.LLILZIL) {
            AnonymousClass0956 anonymousClass0956 = this.LLILZ.LLLILZJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            SelectSchoolPageAssem selectSchoolPageAssem = this.LLILZ;
            selectSchoolPageAssem.LLLILZJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(selectSchoolPageAssem), null, null, new C330290Cx9(this.LLILZ, str, null), 3);
        } else {
            AnonymousClass0956 anonymousClass09562 = this.LLILZ.LLLILZJ;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            this.LLILZ.LLLILZJ = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SelectSchoolPageAssem@2721.onViewCreated$2$5");
        return unit;
    }
}

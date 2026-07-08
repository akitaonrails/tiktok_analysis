package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XoK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment$bindTwitterName$1", f = "ProfileEditFragment.kt", l = {}, m = "invokeSuspend")
public final class C859900XoK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ ProfileEditFragment LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859900XoK(String str, ProfileEditFragment profileEditFragment, Context context, InterfaceC1364105Vn<? super C859900XoK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = profileEditFragment;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859900XoK(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileEditFragment@18c.bindTwitterName$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C127K c127k = null;
        if (TextUtils.isEmpty(this.LL)) {
            ProfileEditFragment profileEditFragment = this.LLILLJJLI;
            C127K c127k2 = profileEditFragment.LLLI;
            if (c127k2 != null) {
                c127k = c127k2;
            }
            profileEditFragment.pT(c127k, this.LLILLL.getString(2131833264), false);
        } else {
            ProfileEditFragment profileEditFragment2 = this.LLILLJJLI;
            C127K c127k3 = profileEditFragment2.LLLI;
            if (c127k3 != null) {
                c127k = c127k3;
            }
            profileEditFragment2.pT(c127k, this.LL, true);
        }
        Function1 function1 = (Function1) ((LinkedHashMap) this.LLILLJJLI.LLLLIILL).get(C2286608xc.LJ(EnumC1216830hlp.TWITTER.getType()));
        if (function1 != null) {
            function1.invoke(this.LL);
        }
        this.LLILLJJLI.UR(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileEditFragment@18c.bindTwitterName$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

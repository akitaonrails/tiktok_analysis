package X;

import android.content.Context;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS148S0400000_19;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0iZo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment$buildNavBarEnd$1$1$invokeSuspend$$inlined$parseBizData$2", f = "ProfileIdentifierFragment.kt", l = {}, m = "invokeSuspend")
public final class C1247820iZo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileIdentifierFragment LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ ProfileComponents LLILZ;
    public final /* synthetic */ ProfileIdentifierFragment LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1247820iZo(ProfileIdentifierFragment profileIdentifierFragment, Object obj, InterfaceC1364105Vn interfaceC1364105Vn, Context context, ProfileComponents profileComponents, ProfileIdentifierFragment profileIdentifierFragment2) {
        super(2, interfaceC1364105Vn);
        this.LL = profileIdentifierFragment;
        this.LLILLJJLI = obj;
        this.LLILLL = context;
        this.LLILZ = profileComponents;
        this.LLILZIL = profileIdentifierFragment2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1247820iZo(this.LL, this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ, this.LLILZIL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String localIcon;
        C1C7U.LIZ("ProfileIdentifierFragment@f464.buildNavBarEnd$1$1$invokeSuspend$$inlined$parseBizData$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isAdded() && this.LL.getView() != null) {
            BizBaseData bizBaseData = (BizBaseData) this.LLILLJJLI;
            Map<Integer, Integer> map = C1721460utk.LIZ;
            Context context = this.LLILLL;
            Icon icon = bizBaseData.getIcon();
            if (icon != null) {
                localIcon = icon.getLocalIcon();
            } else {
                localIcon = null;
            }
            C698190Ra5 c698190Ra5LIZJ = C1721460utk.LIZJ(context, localIcon, null, this.LLILZ.componentId, "");
            if (c698190Ra5LIZJ != null) {
                C1251150ifB c1251150ifB = new C1251150ifB();
                int i = c698190Ra5LIZJ.LIZ;
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = i;
                c1251150ifB.LIZLLL = true;
                List<Action> list = this.LLILZ.actions;
                if (list != null) {
                    for (Action action : list) {
                        if (Intrinsics.LJFF(action.getType(), "router")) {
                            c1251150ifB.LIZJ(new AwS148S0400000_19(this.LLILZIL, this.LLILLL, action, this.LLILZ, 5));
                        }
                    }
                }
                TuxNavBar tuxNavBar = this.LLILZIL.LLILZLL;
                if (tuxNavBar != null) {
                    tuxNavBar.LIZ(c1251150ifB);
                }
            }
        } else {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZ("ProfileIdentifierPage", "Fragment not attached, skip onResult");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildNavBarEnd$1$1$invokeSuspend$$inlined$parseBizData$2");
        return unit;
    }
}

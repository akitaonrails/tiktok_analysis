package X;

import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import njp.a;

/* JADX INFO: renamed from: X.0Pyv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder$bind$2", f = "SearchUserViewHolder.kt", l = {662}, m = "invokeSuspend")
public final class C662630Pyv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ViewOnClickListenerC662370PyV LLILLJJLI;
    public final /* synthetic */ LifecycleOwner LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C662630Pyv(ViewOnClickListenerC662370PyV viewOnClickListenerC662370PyV, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C662630Pyv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = viewOnClickListenerC662370PyV;
        this.LLILLL = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C662630Pyv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String uid;
        NextLiveData nextLiveData;
        User user;
        String uid2;
        C648540PcC c648540PcC;
        Map<String, Integer> map;
        Integer num;
        C1C7U.LIZ("SearchUserViewHolder@dde6.bind$2");
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
            ViewOnClickListenerC662370PyV viewOnClickListenerC662370PyV = this.LLILLJJLI;
            LifecycleOwner lifecycleOwner = this.LLILLL;
            this.LL = 1;
            User user2 = viewOnClickListenerC662370PyV.LLJL;
            C670070QQb c670070QQb = null;
            if (user2 != null) {
                uid = user2.getUid();
            } else {
                uid = null;
            }
            boolean zEquals = TextUtils.equals(uid, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            if (C1828607Ee.LIZ() && !zEquals) {
                C670070QQb c670070QQb2 = viewOnClickListenerC662370PyV.LLJILLL;
                if (c670070QQb2 == null) {
                    c670070QQb2 = null;
                }
                int visibility = c670070QQb2.getVisibility();
                c670070QQb2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c670070QQb2);
                SearchGlobalViewModel searchGlobalViewModel = (SearchGlobalViewModel) viewOnClickListenerC662370PyV.LLIZLLLIL.getValue();
                if (searchGlobalViewModel != null && (user = viewOnClickListenerC662370PyV.LLJL) != null && (uid2 = user.getUid()) != null && (c648540PcC = (C648540PcC) searchGlobalViewModel.LL.getValue()) != null && (map = c648540PcC.LIZIZ) != null && (num = map.get(uid2)) != null) {
                    int iIntValue = num.intValue();
                    User user3 = viewOnClickListenerC662370PyV.LLJL;
                    if (user3 != null) {
                        user3.setFollowStatus(iIntValue);
                    }
                }
                SearchGlobalViewModel searchGlobalViewModel2 = (SearchGlobalViewModel) viewOnClickListenerC662370PyV.LLIZLLLIL.getValue();
                if (searchGlobalViewModel2 != null && (nextLiveData = searchGlobalViewModel2.LLILLJJLI) != null) {
                    nextLiveData.removeObserver(viewOnClickListenerC662370PyV.LLLIIIL);
                    if (lifecycleOwner != null) {
                        nextLiveData.observe(lifecycleOwner, viewOnClickListenerC662370PyV.LLLIIIL);
                    }
                }
                viewOnClickListenerC662370PyV.S5();
                C670070QQb c670070QQb3 = viewOnClickListenerC662370PyV.LLJILLL;
                if (c670070QQb3 == null) {
                    c670070QQb3 = null;
                }
                c670070QQb3.setFollowClickInterceptor(new C684360Qss(viewOnClickListenerC662370PyV, null));
                C670070QQb c670070QQb4 = viewOnClickListenerC662370PyV.LLJILLL;
                if (c670070QQb4 == null) {
                    c670070QQb4 = null;
                }
                c670070QQb4.setDataChangeListener(new AwS589S0100000_10(viewOnClickListenerC662370PyV, 532));
                C670070QQb c670070QQb5 = viewOnClickListenerC662370PyV.LLJILLL;
                if (c670070QQb5 != null) {
                    c670070QQb = c670070QQb5;
                }
                c670070QQb.setTracker(new AwS554S0100000_10(viewOnClickListenerC662370PyV, 1138));
            } else {
                C670070QQb c670070QQb6 = viewOnClickListenerC662370PyV.LLJILLL;
                if (c670070QQb6 != null) {
                    c670070QQb = c670070QQb6;
                }
                int visibility2 = c670070QQb.getVisibility();
                c670070QQb.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c670070QQb);
            }
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("SearchUserViewHolder@dde6.bind$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchUserViewHolder@dde6.bind$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

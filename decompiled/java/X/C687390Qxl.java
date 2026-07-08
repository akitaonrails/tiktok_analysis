package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.tako.botpage.components.user.TakoUserAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS446S0200000_10;
import njp.a;

/* JADX INFO: renamed from: X.0Qxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.user.TakoUserAssem$bindUser$2", f = "TakoUserAssem.kt", l = {238}, m = "invokeSuspend")
public final class C687390Qxl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoUserAssem LLILLJJLI;
    public final /* synthetic */ User LLILLL;
    public final /* synthetic */ Integer LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C687390Qxl(TakoUserAssem takoUserAssem, User user, Integer num, InterfaceC1364105Vn<? super C687390Qxl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoUserAssem;
        this.LLILLL = user;
        this.LLILZ = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C687390Qxl(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoUserAssem@ce3a.bindUser$2");
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
            Fragment fragmentLJI = C724240Sb0.LJI(this.LLILLJJLI);
            if (fragmentLJI != null && !fragmentLJI.isDetached()) {
                TakoUserAssem takoUserAssem = this.LLILLJJLI;
                User user = this.LLILLL;
                Integer num = this.LLILZ;
                this.LL = 1;
                takoUserAssem.getClass();
                RelationButton relationButton = null;
                if (!TextUtils.equals(user.getUid(), C0XQ7.LJFF().getCurUserId())) {
                    takoUserAssem.sp(user);
                    RelationButton relationButton2 = takoUserAssem.LLL;
                    if (relationButton2 == null) {
                        relationButton2 = null;
                    }
                    relationButton2.setFollowClickInterceptor(new C687380Qxk(user, takoUserAssem, null));
                    RelationButton relationButton3 = takoUserAssem.LLL;
                    if (relationButton3 == null) {
                        relationButton3 = null;
                    }
                    relationButton3.setFollowClickListener(new AwS446S0200000_10(num, takoUserAssem, 8));
                    RelationButton relationButton4 = takoUserAssem.LLL;
                    if (relationButton4 == null) {
                        relationButton4 = null;
                    }
                    relationButton4.setDataChangeListener(new AwS376S0200000_10(user, takoUserAssem, 94));
                    RelationButton relationButton5 = takoUserAssem.LLL;
                    if (relationButton5 == null) {
                        relationButton5 = null;
                    }
                    relationButton5.setTracker(new AwS411S0200000_10(user, takoUserAssem, 69));
                    RelationButton relationButton6 = takoUserAssem.LLL;
                    if (relationButton6 != null) {
                        relationButton = relationButton6;
                    }
                    C786410Ut5.t0(relationButton, 0);
                } else {
                    RelationButton relationButton7 = takoUserAssem.LLL;
                    if (relationButton7 != null) {
                        relationButton = relationButton7;
                    }
                    C786410Ut5.t0(relationButton, 8);
                }
                if (Unit.LIZ == objLJFF) {
                    C1C7U.LIZIZ("TakoUserAssem@ce3a.bindUser$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoUserAssem@ce3a.bindUser$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

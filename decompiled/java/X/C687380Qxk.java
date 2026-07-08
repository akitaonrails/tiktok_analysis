package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tako.botpage.components.user.TakoUserAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS589S0100000_10;
import njp.a;

/* JADX INFO: renamed from: X.0Qxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.user.TakoUserAssem$setupRelationBtn$2", f = "TakoUserAssem.kt", l = {365, 367}, m = "invokeSuspend")
public final class C687380Qxk extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ User LLILLJJLI;
    public final /* synthetic */ TakoUserAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C687380Qxk(User user, TakoUserAssem takoUserAssem, InterfaceC1364105Vn<? super C687380Qxk> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = user;
        this.LLILLL = takoUserAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C687380Qxk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        C1C7U.LIZ("TakoUserAssem@ce3a.setupRelationBtn$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
        } else {
            C155000ia.LIZIZ(obj);
            zBooleanValue = false;
            if (this.LLILLJJLI.getFollowStatus() == C0SY7.UNFOLLOW.getValue() && this.LLILLJJLI.getBlockStatus() == 1) {
                TakoUserAssem takoUserAssem = this.LLILLL;
                this.LL = 1;
                takoUserAssem.getClass();
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                Context context = takoUserAssem.getContext();
                if (context != null) {
                    C1397580mTM c1397580mTM = new C1397580mTM(context);
                    c1397580mTM.LJII = false;
                    c1397580mTM.LIZ(2131857725);
                    C985403tE.LIZ(c1397580mTM, AFwS241S0000000_10.get$arr$(449));
                    c1397580mTM.LIZLLL(new AwS580S0100000_1(c2252611DEt, 488));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                }
                obj = c2252611DEt.LJIJ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TakoUserAssem@ce3a.setupRelationBtn$2");
                    return objLJFF;
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else if (this.LLILLJJLI.getFollowStatus() == C0SY7.FOLLOW_REQUESTED.getValue()) {
                TakoUserAssem takoUserAssem2 = this.LLILLL;
                this.LL = 2;
                takoUserAssem2.getClass();
                C2252611DEt c2252611DEt2 = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt2.LJIJJ();
                if (takoUserAssem2.LLLII) {
                    C189200o6.m2constructorimpl(true);
                    c2252611DEt2.resumeWith(true);
                }
                Context context2 = takoUserAssem2.getContext();
                if (context2 != null) {
                    C1397580mTM c1397580mTM2 = new C1397580mTM(context2);
                    c1397580mTM2.LJII = false;
                    c1397580mTM2.LIZ(2131834789);
                    C985403tE.LIZ(c1397580mTM2, new AwS589S0100000_10(takoUserAssem2, 441));
                    c1397580mTM2.LIZLLL(new AwS580S0100000_1(c2252611DEt2, 489));
                    new C1397510mTF(c1397580mTM2).LIZLLL();
                    takoUserAssem2.LLLII = true;
                }
                obj = c2252611DEt2.LJIJ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TakoUserAssem@ce3a.setupRelationBtn$2");
                    return objLJFF;
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        C1C7U.LIZIZ("TakoUserAssem@ce3a.setupRelationBtn$2");
        return boolValueOf;
    }
}

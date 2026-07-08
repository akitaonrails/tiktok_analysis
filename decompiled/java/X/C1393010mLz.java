package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS3S0800000_21;
import njp.a;

/* JADX INFO: renamed from: X.0mLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.mute.MuteTheirPostsManager$mutePosts$1", f = "MuteTheirPostsManager.kt", l = {130}, m = "invokeSuspend")
public final class C1393010mLz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnumC1393020mM0 LLILLJJLI;
    public final /* synthetic */ User LLILLL;
    public final /* synthetic */ Fragment LLILZ;
    public final /* synthetic */ Activity LLILZIL;
    public final /* synthetic */ C1393190mMH LLILZLL;
    public final /* synthetic */ EnumC1392960mLu LLIZ;
    public final /* synthetic */ View LLIZLLLIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1393010mLz(EnumC1393020mM0 enumC1393020mM0, User user, Fragment fragment, Activity activity, C1393190mMH c1393190mMH, EnumC1392960mLu enumC1392960mLu, View view, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C1393010mLz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC1393020mM0;
        this.LLILLL = user;
        this.LLILZ = fragment;
        this.LLILZIL = activity;
        this.LLILZLL = c1393190mMH;
        this.LLIZ = enumC1392960mLu;
        this.LLIZLLLIL = view;
        this.LLJ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1393010mLz(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1393020mM0 enumC1393020mM0;
        Context context;
        int i;
        int i2;
        Object objLIZIZ = obj;
        C1C7U.LIZ("MuteTheirPostsManager@e4c1.mutePosts$1");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LL;
        if (i3 != 0) {
            if (i3 == 1) {
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            C1392890mLn c1392890mLn = C1392890mLn.LIZ;
            this.LL = 1;
            objLIZIZ = c1392890mLn.LIZIZ(this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("MuteTheirPostsManager@e4c1.mutePosts$1");
                return objLJFF;
            }
        }
        if (((Boolean) objLIZIZ).booleanValue() && (enumC1393020mM0 = this.LLILLJJLI) != EnumC1393020mM0.SKYLIGHT) {
            C1392890mLn c1392890mLn2 = C1392890mLn.LIZ;
            User user = this.LLILLL;
            Fragment fragment = this.LLILZ;
            Activity activity = this.LLILZIL;
            C1393190mMH c1393190mMH = this.LLILZLL;
            EnumC1392960mLu enumC1392960mLu = this.LLIZ;
            View view = this.LLIZLLLIL;
            Function1<Boolean, Unit> function1 = this.LLJ;
            c1392890mLn2.getClass();
            if (fragment == null || (context = fragment.getContext()) == null) {
                context = activity;
            }
            C1610870s1N.LIZ.getClass();
            if (C1610870s1N.LIZIZ()) {
                i = 2131848328;
            } else {
                i = 2131837833;
            }
            if (C1610870s1N.LIZIZ()) {
                i2 = 2131848327;
            } else {
                i2 = 2131837836;
            }
            if (context != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJI(context.getString(i2, C0SE9.LIZ(user, user.getNickname())));
                c1397580mTM.LIZIZ(context.getString(i, C0SE9.LIZ(user, user.getNickname())));
                C985403tE.LIZ(c1397580mTM, new AwS3S0800000_21(activity, view, fragment, c1393190mMH, enumC1393020mM0, enumC1392960mLu, user, function1, 1));
                c1397580mTM.LJ(AFwS229S0000000_2.get$arr$(648));
                new C1397510mTF(c1397580mTM).LIZLLL();
                C1587170rP9.LIZ.getClass();
                C1587170rP9.LJIIJ("show", c1393190mMH);
            }
        } else {
            C1392890mLn c1392890mLn3 = C1392890mLn.LIZ;
            User user2 = this.LLILLL;
            Fragment fragment2 = this.LLILZ;
            Activity activity2 = this.LLILZIL;
            EnumC1393020mM0 enumC1393020mM02 = this.LLILLJJLI;
            EnumC1392960mLu enumC1392960mLu2 = this.LLIZ;
            View view2 = this.LLIZLLLIL;
            Function1<Boolean, Unit> function12 = this.LLJ;
            c1392890mLn3.getClass();
            C1392890mLn.LIZJ(user2, fragment2, activity2, enumC1393020mM02, enumC1392960mLu2, view2, function12);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MuteTheirPostsManager@e4c1.mutePosts$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

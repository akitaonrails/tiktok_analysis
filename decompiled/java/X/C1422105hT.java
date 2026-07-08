package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05hT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper$goWithMovie$1$2", f = "ReplaceMusicWithMovieHelper.kt", l = {168}, m = "invokeSuspend")
public final class C1422105hT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ReplaceMusicWithMovieHelper LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1422105hT(ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper, Aweme aweme, String str, long j, InterfaceC1364105Vn<? super C1422105hT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = replaceMusicWithMovieHelper;
        this.LLILZ = aweme;
        this.LLILZIL = str;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1422105hT c1422105hT = new C1422105hT(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1422105hT.LLILLJJLI = obj;
        return c1422105hT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReplaceMusicWithMovieHelper@8c47.goWithMovie$1$2");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            Activity activity = this.LLILLL.LL;
            if (this.LLILZ == null) {
                C201955140j.LJIIL("dismiss dialog as context/aweme is null");
                ReplaceMusicWithMovieHelper.LIZJ(this.LLILLL);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ReplaceMusicWithMovieHelper@8c47.goWithMovie$1$2");
                return unit;
            }
            if (activity == null) {
                activity = null;
            }
            if (activity.isFinishing()) {
                C201955140j.LJIIL("dismiss dialog as context is finishing");
                ReplaceMusicWithMovieHelper.LIZJ(this.LLILLL);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("ReplaceMusicWithMovieHelper@8c47.goWithMovie$1$2");
                return unit2;
            }
            if (this.LLILZ.getAuthor() == null) {
                C201955140j.LJIIL("dismiss dialog as author is null");
                ReplaceMusicWithMovieHelper.LIZJ(this.LLILLL);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("ReplaceMusicWithMovieHelper@8c47.goWithMovie$1$2");
                return unit3;
            }
            if (AwemeExtKt.getStatusSafety(this.LLILZ) != null) {
                AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(this.LLILZ);
                if (statusSafety != null) {
                    if (statusSafety.isPrivate() && !TextUtils.equals(this.LLILZIL, "from_promote")) {
                        C201955140j.LJIIL("dismiss dialog as it's not from promote");
                        ReplaceMusicWithMovieHelper.LIZJ(this.LLILLL);
                        Unit unit4 = Unit.LIZ;
                        C1C7U.LIZIZ("ReplaceMusicWithMovieHelper@8c47.goWithMovie$1$2");
                        return unit4;
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            if (AwemeExtKt.getStatusSafety(this.LLILZ) != null) {
                AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(this.LLILZ);
                if (statusSafety2 != null) {
                    if (statusSafety2.isDelete()) {
                        ReplaceMusicWithMovieHelper.LIZJ(this.LLILLL);
                        C201955140j.LJIIL("dismiss dialog as status is delete");
                        Unit unit5 = Unit.LIZ;
                        C1C7U.LIZIZ("ReplaceMusicWithMovieHelper@8c47.goWithMovie$1$2");
                        return unit5;
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            C201955140j.LJIIL("moving to updateAwemeSuccessAndNext");
            ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper = this.LLILLL;
            replaceMusicWithMovieHelper.LLJJIJIIJIL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1422005hS(replaceMusicWithMovieHelper, this.LLILZ, this.LLILZLL, null), 3);
            ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper2 = this.LLILLL;
            Aweme aweme = this.LLILZ;
            long j = this.LLILZLL;
            this.LL = 1;
            if (replaceMusicWithMovieHelper2.LJFF(aweme, j, this) == objLJFF) {
                C1C7U.LIZIZ("ReplaceMusicWithMovieHelper@8c47.goWithMovie$1$2");
                return objLJFF;
            }
        }
        Unit unit6 = Unit.LIZ;
        C1C7U.LIZIZ("ReplaceMusicWithMovieHelper@8c47.goWithMovie$1$2");
        return unit6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

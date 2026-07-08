package X;

import android.app.Activity;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06RO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.ShareStreakUtil$shareStreak$1", f = "StreakShareUtil.kt", l = {255}, m = "invokeSuspend")
public final class C06RO extends C09AX implements InterfaceC1631620sYq<Activity, String, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends C1371590lnR>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ Boolean LLILZ;
    public final /* synthetic */ C06RR LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06RO(Boolean bool, C06RR c06rr, boolean z, String str, InterfaceC1364105Vn<? super C06RO> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = bool;
        this.LLILZIL = c06rr;
        this.LLILZLL = z;
        this.LLIZ = str;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ShareStreakUtil@bf84.shareStreak$1");
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
            Activity activity = (Activity) this.LLILLJJLI;
            String str = (String) this.LLILLL;
            C06RY c06ry = C06RY.LIZ;
            Boolean bool = this.LLILZ;
            C06RR c06rr = this.LLILZIL;
            boolean z = this.LLILZLL;
            String str2 = this.LLIZ;
            this.LLILLJJLI = null;
            this.LL = 1;
            obj = c06ry.LIZ(activity, str, bool, c06rr, z, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShareStreakUtil@bf84.shareStreak$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ShareStreakUtil@bf84.shareStreak$1");
        return obj;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Activity activity, String str, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends C1371590lnR>> interfaceC1364105Vn) {
        C06RO c06ro = new C06RO(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c06ro.LLILLJJLI = activity;
        c06ro.LLILLL = str;
        return c06ro.invokeSuspend(Unit.LIZ);
    }
}

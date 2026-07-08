package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.ExposeSharerData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iCb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogVM$getSharerInfoAsync$1", f = "SharedInviteDialogVM.kt", l = {79}, m = "invokeSuspend")
public final class C1233430iCb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ExposeSharerData>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ SharedInviteDialogVM LLILLL;
    public final /* synthetic */ C1233440iCc LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1233430iCb(SharedInviteDialogVM sharedInviteDialogVM, C1233440iCc c1233440iCc, InterfaceC1364105Vn<? super C1233430iCb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = sharedInviteDialogVM;
        this.LLILZ = c1233440iCc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1233430iCb(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ExposeSharerData exposeSharerData;
        String uid;
        User user;
        String str;
        User user2;
        long jElapsedRealtime;
        Object objLJI = obj;
        C1C7U.LIZ("SharedInviteDialogVM@9887.getSharerInfoAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        Integer numLJ = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    jElapsedRealtime = this.LL;
                    C155000ia.LIZIZ(objLJI);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJI);
                SharedInviteDialogVM sharedInviteDialogVM = this.LLILLL;
                C1233440iCc c1233440iCc = this.LLILZ;
                sharedInviteDialogVM.getClass();
                String str2 = c1233440iCc.LJ;
                if (str2 != null) {
                    C1336205Ku.LIZ(false).getAutoMessageTooltipHelper().LJ(str2);
                }
                jElapsedRealtime = SystemClock.elapsedRealtime();
                C1234230iDt c1234230iDt = C1234230iDt.LIZIZ;
                C1233440iCc c1233440iCc2 = this.LLILZ;
                EnumC1234280iDy enumC1234280iDy = EnumC1234280iDy.DEFAULT;
                this.LL = jElapsedRealtime;
                this.LLILLJJLI = 1;
                objLJI = c1234230iDt.LJI(c1233440iCc2, enumC1234280iDy, this);
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("SharedInviteDialogVM@9887.getSharerInfoAsync$1");
                    return objLJFF;
                }
            }
            exposeSharerData = (ExposeSharerData) objLJI;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("@LinkRelation_OldLogic", "get sharer info error", th);
            exposeSharerData = null;
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        this.LLILLL.getClass();
        C1336205Ku.LIZ(false).getAutoMessageTooltipHelper().LIZLLL();
        C1233440iCc c1233440iCc3 = this.LLILZ;
        String str3 = c1233440iCc3.LIZLLL;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        String str5 = c1233440iCc3.LJ;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = c1233440iCc3.LJFF;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = c1233440iCc3.LJII;
        if (str7 != null) {
            str4 = str7;
        }
        EnumC1234280iDy enumC1234280iDy2 = c1233440iCc3.LIZ;
        if (enumC1234280iDy2 == null) {
            enumC1234280iDy2 = EnumC1234280iDy.DEFAULT;
        }
        String str8 = c1233440iCc3.LIZJ;
        String str9 = c1233440iCc3.LJIIIIZZ;
        String str10 = c1233440iCc3.LIZIZ;
        C1233510iCj c1233510iCj = new C1233510iCj(str3, str5, str6, str4, enumC1234280iDy2, str8, str9, str10, c1233440iCc3.LJIIIZ, null, null, null, null, null, null, 65024);
        if (exposeSharerData != null && (user2 = exposeSharerData.sharer) != null) {
            uid = user2.getUid();
        } else {
            uid = null;
        }
        C1951907kj.LIZ(str10, uid);
        if (exposeSharerData != null) {
            user = exposeSharerData.sharer;
        } else {
            user = null;
        }
        if (exposeSharerData != null) {
            str = exposeSharerData.status_msg;
        } else {
            str = null;
        }
        if (exposeSharerData != null) {
            numLJ = C2286608xc.LJ(exposeSharerData.error_code);
        }
        new C2005607tO(c1233510iCj, user, jElapsedRealtime2, str, numLJ).LIZLLL("@LinkRelation_OldLogic");
        C1C7U.LIZIZ("SharedInviteDialogVM@9887.getSharerInfoAsync$1");
        return exposeSharerData;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ExposeSharerData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

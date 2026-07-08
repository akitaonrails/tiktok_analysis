package X;

import android.os.SystemClock;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.ExposeSharerData;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iCd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.link.ReflowSideProcessor$getSharerInfoAsync$sharerInfoDeferred$1", f = "ReflowSideProcessor.kt", l = {246}, m = "invokeSuspend")
public final class C1233450iCd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends User>>, Object> {
    public Object LL;
    public long LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C1233510iCj LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1233450iCd(boolean z, C1233510iCj c1233510iCj, String str, InterfaceC1364105Vn<? super C1233450iCd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = z;
        this.LLILZLL = c1233510iCj;
        this.LLIZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1233450iCd c1233450iCd = new C1233450iCd(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1233450iCd.LLILZ = obj;
        return c1233450iCd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jElapsedRealtime;
        C1233510iCj c1233510iCj;
        String str;
        Throwable th;
        Object obj2;
        Object obj3;
        Object obj4;
        User user;
        String str2;
        String imprId;
        String uid;
        String imprId2;
        Object objLIZ = obj;
        C1C7U.LIZ("ReflowSideProcessor@9181.getSharerInfoAsync$sharerInfoDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        Integer numLJ = null;
        if (i != 0) {
            if (i == 1) {
                jElapsedRealtime = this.LLILLJJLI;
                str = (String) this.LL;
                c1233510iCj = (C1233510iCj) this.LLILZ;
                try {
                    C155000ia.LIZIZ(objLIZ);
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    obj2 = c098200Yq;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            jElapsedRealtime = SystemClock.elapsedRealtime();
            c1233510iCj = this.LLILZLL;
            str = this.LLIZ;
            try {
                this.LLILZ = c1233510iCj;
                this.LL = str;
                this.LLILLJJLI = jElapsedRealtime;
                this.LLILLL = 1;
                objLIZ = C1233470iCf.LIZ(c1233510iCj, C1234230iDt.LIZIZ, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("ReflowSideProcessor@9181.getSharerInfoAsync$sharerInfoDeferred$1");
                    return objLJFF;
                }
            } catch (Throwable th3) {
                th = th3;
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
                obj2 = c098200Yq2;
            }
        }
        ExposeSharerData exposeSharerData = (ExposeSharerData) objLIZ;
        exposeSharerData.checkValid();
        User user2 = exposeSharerData.sharer;
        if (user2 != null) {
            LogPbBean logPbBean = exposeSharerData.logPbBean;
            if (logPbBean != null) {
                imprId2 = logPbBean.getImprId();
            } else {
                imprId2 = null;
            }
            user2.setRequestId(imprId2);
            user2.setRecType("1-4");
            user2.setFriendTypeStr("45");
        }
        if (str != null) {
            GScope gScope = GScope.LL;
            String str3 = c1233510iCj.LIZ;
            String str4 = c1233510iCj.LIZIZ;
            LogPbBean logPbBean2 = exposeSharerData.logPbBean;
            if (logPbBean2 != null) {
                imprId = logPbBean2.getImprId();
            } else {
                imprId = null;
            }
            C1554960qZC.LIZ(gScope, new C1234710iEf(str, str3, str4, imprId), C1234710iEf.class, "link_share_params_key");
            User user3 = exposeSharerData.sharer;
            if (user3 != null) {
                uid = user3.getUid();
            } else {
                uid = null;
            }
            C1951907kj.LIZ(str, uid);
        }
        C189200o6.m2constructorimpl(exposeSharerData);
        obj2 = exposeSharerData;
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        if (C189200o6.m7isFailureimpl(obj2)) {
            obj3 = null;
        } else {
            obj3 = obj2;
        }
        ExposeSharerData exposeSharerData2 = (ExposeSharerData) obj3;
        if (this.LLILZIL) {
            C1233510iCj c1233510iCj2 = this.LLILZLL;
            if (exposeSharerData2 != null) {
                user = exposeSharerData2.sharer;
            } else {
                user = null;
            }
            if (exposeSharerData2 != null) {
                str2 = exposeSharerData2.status_msg;
            } else {
                str2 = null;
            }
            if (exposeSharerData2 != null) {
                numLJ = C2286608xc.LJ(exposeSharerData2.error_code);
            }
            new C2005607tO(c1233510iCj2, user, jElapsedRealtime2, str2, numLJ).LIZLLL("@LinkRelation");
        }
        if (C189200o6.m8isSuccessimpl(obj2)) {
            try {
                User user4 = ((ExposeSharerData) obj2).sharer;
                if (user4 != null) {
                    C189200o6.m2constructorimpl(user4);
                    obj4 = user4;
                } else {
                    "sharer is null".toString();
                    throw new IllegalArgumentException("sharer is null");
                }
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                C098200Yq c098200Yq3 = new C098200Yq(th4);
                C189200o6.m2constructorimpl(c098200Yq3);
                obj4 = c098200Yq3;
            }
        } else {
            C189200o6.m2constructorimpl(obj2);
            obj4 = obj2;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(obj4);
        C1C7U.LIZIZ("ReflowSideProcessor@9181.getSharerInfoAsync$sharerInfoDeferred$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends User>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

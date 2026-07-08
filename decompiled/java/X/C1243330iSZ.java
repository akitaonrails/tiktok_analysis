package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.alias.UserAliasApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iSZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.alias.AliasEditDialogUtil$buildActionGroup$1$1$2", f = "AliasEditDialogUtil.kt", l = {116, 123, 135}, m = "invokeSuspend")
public final class C1243330iSZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ User LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1243310iSX LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1243410iSh LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243330iSZ(User user, String str, InterfaceC1243310iSX interfaceC1243310iSX, String str2, C1243410iSh c1243410iSh, String str3, Context context, InterfaceC1364105Vn<? super C1243330iSZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = user;
        this.LLILLL = str;
        this.LLILZ = interfaceC1243310iSX;
        this.LLILZIL = str2;
        this.LLILZLL = c1243410iSh;
        this.LLIZ = str3;
        this.LLIZLLLIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1243330iSZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objUpdateUserAlias = obj;
        C1C7U.LIZ("AliasEditDialogUtil@41f8.buildActionGroup$1$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1243300iSW c1243300iSW = new C1243300iSW(this.LLILZ, this.LLIZLLLIL, this.LLILZLL, this.LLIZ, e, null);
            this.LL = 3;
            if (C23250099c.LJI(this, abstractC2238408pq, c1243300iSW) == objLJFF) {
                C1C7U.LIZIZ("AliasEditDialogUtil@41f8.buildActionGroup$1$1$2");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    C155000ia.LIZIZ(objUpdateUserAlias);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AliasEditDialogUtil@41f8.buildActionGroup$1$1$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objUpdateUserAlias);
        } else {
            C155000ia.LIZIZ(objUpdateUserAlias);
            String uid = this.LLILLJJLI.getUid();
            String secUid = this.LLILLJJLI.getSecUid();
            String str = this.LLILLL;
            this.LL = 1;
            objUpdateUserAlias = ((UserAliasApi) C1243350iSb.LIZ.getValue()).updateUserAlias(uid, secUid, str, this);
            if (objUpdateUserAlias == objLJFF) {
                C1C7U.LIZIZ("AliasEditDialogUtil@41f8.buildActionGroup$1$1$2");
                return objLJFF;
            }
        }
        ((BaseResponse) objUpdateUserAlias).checkValid();
        if (this.LLILLL.length() != 0) {
            z = false;
        }
        if (!z) {
            C1243370iSd c1243370iSd = C1243370iSd.LIZ;
            String uid2 = this.LLILLJJLI.getUid();
            String str2 = this.LLILLL;
            c1243370iSd.getClass();
            C1243370iSd.LJFF(uid2, str2);
        } else {
            C1243370iSd c1243370iSd2 = C1243370iSd.LIZ;
            String uid3 = this.LLILLJJLI.getUid();
            c1243370iSd2.getClass();
            C1243370iSd.LIZ(uid3);
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
        C1243320iSY c1243320iSY = new C1243320iSY(this.LLILZ, this.LLILZIL, this.LLILLL, this.LLILLJJLI, this.LLILZLL, this.LLIZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq2, c1243320iSY) == objLJFF) {
            C1C7U.LIZIZ("AliasEditDialogUtil@41f8.buildActionGroup$1$1$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AliasEditDialogUtil@41f8.buildActionGroup$1$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

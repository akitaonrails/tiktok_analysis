package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BindService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iDW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel$updateMethod$2$2", f = "TwoStepVerificationActivityViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1234000iDW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TwoStepVerificationActivityViewModel LL;
    public final /* synthetic */ Bundle LLILLJJLI;
    public final /* synthetic */ EnumC1233840iDG LLILLL;
    public final /* synthetic */ User LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1234000iDW(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, Bundle bundle, EnumC1233840iDG enumC1233840iDG, User user, InterfaceC1364105Vn<? super C1234000iDW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = twoStepVerificationActivityViewModel;
        this.LLILLJJLI = bundle;
        this.LLILLL = enumC1233840iDG;
        this.LLILZ = user;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1234000iDW(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZ;
        C1C7U.LIZ("TwoStepVerificationActivityViewModel@3f.updateMethod$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BindService bindServiceLIZIZ = C0XQ5.LIZIZ();
        Context context = this.LL.BQ2().LLILLL;
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        String enterFrom = this.LL.getEnterFrom();
        Bundle bundle = this.LLILLJJLI;
        final TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = this.LL;
        final EnumC1233840iDG enumC1233840iDG = this.LLILLL;
        final User user = this.LLILZ;
        bindServiceLIZIZ.changeUnverifiedEmail(activityLIZ, enterFrom, null, bundle, true, new C0XTR() { // from class: X.0iDX
            @Override // X.C0XTR
            public final void onResult(int i, int i2, Object obj2) {
                C1233790iDB c1233790iDB;
                if (i2 == 1) {
                    Map<EnumC1233840iDG, C1233790iDB> map = twoStepVerificationActivityViewModel.LLILZLL;
                    EnumC1233840iDG enumC1233840iDG2 = enumC1233840iDG;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                    C1233790iDB c1233790iDB2 = (C1233790iDB) linkedHashMap.get(enumC1233840iDG2);
                    if (c1233790iDB2 != null) {
                        c1233790iDB = C1233790iDB.LIZ(c1233790iDB2, true, false, user.getEmail(), false, false, 54);
                    } else {
                        c1233790iDB = new C1233790iDB(true, false, enumC1233840iDG, user.getEmail(), false, false, 50);
                    }
                    linkedHashMap.put(enumC1233840iDG2, c1233790iDB);
                }
                TwoStepVerificationActivityViewModel.xQ2(twoStepVerificationActivityViewModel, 0, null, 6);
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.updateMethod$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import android.content.ContentValues;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS112S1000000_28;
import kotlin.jvm.internal.AwS9S1010000_2;
import njp.a;

/* JADX INFO: renamed from: X.1Ap2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.bytedance.applog.priority.original.AppSession$newSession$success$1", f = "AppSession.kt", l = {77}, m = "invokeSuspend")
public final class C2191021Ap2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C2191171ApH LLILLJJLI;
    public final /* synthetic */ C2190781Aoe LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191021Ap2(C2191171ApH c2191171ApH, C2190781Aoe c2190781Aoe, String str, boolean z, String str2, InterfaceC1364105Vn<? super C2191021Ap2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2191171ApH;
        this.LLILLL = c2190781Aoe;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2191021Ap2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        long jInsert;
        Object objLIZLLL = obj;
        C1C7U.LIZ("AppSession@3330.newSession$success$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(objLIZLLL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZLLL);
            C2191171ApH c2191171ApH = this.LLILLJJLI;
            C2190781Aoe c2190781Aoe = this.LLILLL;
            this.LL = 1;
            objLIZLLL = c2191171ApH.LIZLLL(c2190781Aoe, false);
            if (objLIZLLL == objLJFF) {
                C1C7U.LIZIZ("AppSession@3330.newSession$success$1");
                return objLJFF;
            }
        }
        if (!((Boolean) objLIZLLL).booleanValue()) {
            C2190771Aod c2190771AodLIZ = this.LLILLJJLI.LIZ();
            String str = this.LLILZ;
            boolean z2 = this.LLILZIL;
            String str2 = this.LLILZLL;
            long j = this.LLILLL.LIZLLL;
            c2190771AodLIZ.getClass();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("session_id", str);
                if (z2) {
                    i = 1;
                } else {
                    i = 0;
                }
                contentValues.put("foreground", Integer.valueOf(i));
                contentValues.put("timestamp", Long.valueOf(j));
                if (str2 != null) {
                    contentValues.put("extra_params", str2);
                }
                jInsert = c2190771AodLIZ.LIZIZ().getWritableDatabase().insert("session_launch", null, contentValues);
                if (jInsert < 0) {
                    c2190771AodLIZ.LIZ.LIZIZ("SessionDatabase:insertLaunch", null, new C1130904bb(jInsert, str, z2));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c2190771AodLIZ.LIZ.LIZIZ("SessionDatabase:insertLaunch", th, new AwS9S1010000_2(str, z2, 1));
            }
            if (jInsert >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.LLILLJJLI.LIZ.LIZJ.LIZIZ("AppSession:newSession", null, new AwS112S1000000_28(this.LLILZ, 21));
                C1C7U.LIZIZ("AppSession@3330.newSession$success$1");
                return false;
            }
        }
        C1C7U.LIZIZ("AppSession@3330.newSession$success$1");
        return true;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

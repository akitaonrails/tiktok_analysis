package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.AwemeDetailList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.062Y, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.action.StickerAction$execute$3", f = "StickerAction.kt", l = {105, 110}, m = "invokeSuspend")
public final class C062Y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C238400w2 LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1377760lxO LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ DialogC1389620mGW LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C062Y(C1377760lxO c1377760lxO, Activity activity, long j, DialogC1389620mGW dialogC1389620mGW, Context context, InterfaceC1364105Vn<? super C062Y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1377760lxO;
        this.LLILZ = activity;
        this.LLILZIL = j;
        this.LLILZLL = dialogC1389620mGW;
        this.LLIZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C062Y(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C238400w2 c238400w2;
        AwemeDetailList awemeDetailList;
        Object objLIZLLL = obj;
        C1C7U.LIZ("StickerAction@b9eb.execute$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZLLL);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StickerAction@b9eb.execute$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c238400w2 = this.LL;
            try {
                C155000ia.LIZIZ(objLIZLLL);
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                awemeDetailList = null;
            }
        } else {
            C155000ia.LIZIZ(objLIZLLL);
            c238400w2 = new C238400w2();
            c238400w2.element = SystemClock.elapsedRealtime();
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(this.LLILLL.LL.getAid());
                sbLIZ.append(']');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                this.LL = c238400w2;
                this.LLILLJJLI = 1;
                objLIZLLL = C1477105qL.LIZLLL(strLIZIZ, "", this);
                if (objLIZLLL == objLJFF) {
                    C1C7U.LIZIZ("StickerAction@b9eb.execute$3");
                    return objLJFF;
                }
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                awemeDetailList = null;
            }
        }
        awemeDetailList = (AwemeDetailList) objLIZLLL;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1377790lxR c1377790lxR = new C1377790lxR(awemeDetailList, c238400w2, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, null);
        this.LL = null;
        this.LLILLJJLI = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1377790lxR) == objLJFF) {
            C1C7U.LIZIZ("StickerAction@b9eb.execute$3");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StickerAction@b9eb.execute$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

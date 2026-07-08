package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.AwemeDetailList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.062X, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.action.GifShareAction$execute$videoStickerPanelShowed$1$1", f = "GifShareAction.kt", l = {112, 118}, m = "invokeSuspend")
public final class C062X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C238400w2 LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1377730lxL LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ DialogC1389620mGW LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C062X(C1377730lxL c1377730lxL, Activity activity, DialogC1389620mGW dialogC1389620mGW, long j, Context context, InterfaceC1364105Vn<? super C062X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1377730lxL;
        this.LLILZ = activity;
        this.LLILZIL = dialogC1389620mGW;
        this.LLILZLL = j;
        this.LLIZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C062X(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C238400w2 c238400w2;
        AwemeDetailList awemeDetailList;
        Object objLIZLLL = obj;
        C1C7U.LIZ("GifShareAction@ac5f.execute$videoStickerPanelShowed$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZLLL);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GifShareAction@ac5f.execute$videoStickerPanelShowed$1$1");
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
                    C1C7U.LIZIZ("GifShareAction@ac5f.execute$videoStickerPanelShowed$1$1");
                    return objLJFF;
                }
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                awemeDetailList = null;
            }
        }
        awemeDetailList = (AwemeDetailList) objLIZLLL;
        c238400w2.element = SystemClock.elapsedRealtime() - c238400w2.element;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1377780lxQ c1377780lxQ = new C1377780lxQ(awemeDetailList, this.LLILZ, this.LLILLL, this.LLILZIL, this.LLILZLL, c238400w2, this.LLIZ, null);
        this.LL = null;
        this.LLILLJJLI = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1377780lxQ) == objLJFF) {
            C1C7U.LIZIZ("GifShareAction@ac5f.execute$videoStickerPanelShowed$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GifShareAction@ac5f.execute$videoStickerPanelShowed$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

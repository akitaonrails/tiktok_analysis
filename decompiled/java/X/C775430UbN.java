package X;

import android.content.Context;
import android.view.SurfaceView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS591S0100000_12;
import njp.a;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: renamed from: X.0UbN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$initLiveParamsListenerTTLH$1$1", f = "TTLiveBroadcastView.kt", l = {1319, 1340}, m = "invokeSuspend")
public final class C775430UbN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ TTLiveBroadcastView LLILZ;
    public final /* synthetic */ C259800zU<C769960UIg> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C775430UbN(TTLiveBroadcastView tTLiveBroadcastView, InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = tTLiveBroadcastView;
        this.LLILZIL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C775430UbN c775430UbN = new C775430UbN(this.LLILZ, interfaceC1364105Vn, this.LLILZIL);
        c775430UbN.LLILLL = obj;
        return c775430UbN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        Object obj2;
        long jCurrentTimeMillis2;
        float fLIZ;
        C259800zU<C769960UIg> c259800zU;
        C19EG c19egLIZIZ;
        T t;
        Object obj3 = obj;
        C1C7U.LIZ("TTLiveBroadcastView@6190.initLiveParamsListenerTTLH$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    jCurrentTimeMillis2 = this.LL;
                    c259800zU = (C259800zU) this.LLILLL;
                    C155000ia.LIZIZ(obj3);
                    t = obj3;
                    c259800zU.element = t;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("initLiveParamsListenerTTLH GoLiveManager.createLiveParamsListener: ");
                    sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                    C20441214yg.LIZIZ("TTLiveBroadcastView:", C2188811AlT.LIZIZ(sbLIZ));
                    System.currentTimeMillis();
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TTLiveBroadcastView@6190.initLiveParamsListenerTTLH$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = this.LL;
            C155000ia.LIZIZ(obj3);
            obj2 = obj3;
        } else {
            C155000ia.LIZIZ(obj3);
            Object obj4 = this.LLILLL;
            jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC770130UIx liveCoreInitUtil = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getLiveCoreInitUtil();
            this.LLILLL = obj4;
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            Object objLIZIZ = liveCoreInitUtil.LIZIZ(this);
            obj2 = objLIZIZ;
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("TTLiveBroadcastView@6190.initLiveParamsListenerTTLH$1$1");
                return objLJFF;
            }
        }
        PreScheduleStream preScheduleStream = (PreScheduleStream) obj2;
        if (preScheduleStream != null && preScheduleStream.sdkParams != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initLiveParamsListenerTTLH sdkParams: ");
            sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C20441214yg.LIZIZ("TTLiveBroadcastView", C2188811AlT.LIZIZ(sbLIZ2));
            jCurrentTimeMillis2 = System.currentTimeMillis();
            C1271250jBb c1271250jBb = C1271270jBd.LIZ;
            if (c1271250jBb.LJFF(2)) {
                fLIZ = c1271250jBb.LIZLLL();
            } else {
                C769220UFk c769220UFk = C769220UFk.LIZ;
                int iLJI = C14KS.LJI(this.LLILZ.LL);
                int iLJ = C14KS.LJ(this.LLILZ.LL);
                c769220UFk.getClass();
                fLIZ = C769220UFk.LIZ(iLJI, iLJ);
            }
            c259800zU = this.LLILZIL;
            C775380UbI c775380UbI = C775380UbI.LIZ;
            Context context = this.LLILZ.LL;
            SurfaceView surfaceViewLJIJJLI = null;
            if (context != null) {
                c19egLIZIZ = C1388190mED.LIZIZ(context);
            } else {
                c19egLIZIZ = null;
            }
            SurfaceHolderCallbackC2177741AKu surfaceHolderCallbackC2177741AKu = this.LLILZ.LLJJLIIIJLLLLLLLZ;
            if (surfaceHolderCallbackC2177741AKu != null) {
                surfaceViewLJIJJLI = surfaceHolderCallbackC2177741AKu.LJIJJLI();
            }
            String str = preScheduleStream.sdkParams;
            if (str == null) {
                str = "";
            }
            TTLiveBroadcastView tTLiveBroadcastView = this.LLILZ;
            C19A3 c19a3 = tTLiveBroadcastView.LLILZ;
            AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(tTLiveBroadcastView, 628);
            this.LLILLL = c259800zU;
            this.LL = jCurrentTimeMillis2;
            this.LLILLJJLI = 2;
            Object objLIZ = c775380UbI.LIZ(c19egLIZIZ, surfaceViewLJIJJLI, str, preScheduleStream, fLIZ, c19a3, awS591S0100000_12, this);
            t = objLIZ;
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("TTLiveBroadcastView@6190.initLiveParamsListenerTTLH$1$1");
                return objLJFF;
            }
            c259800zU.element = t;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("initLiveParamsListenerTTLH GoLiveManager.createLiveParamsListener: ");
            sbLIZ3.append(System.currentTimeMillis() - jCurrentTimeMillis2);
            C20441214yg.LIZIZ("TTLiveBroadcastView:", C2188811AlT.LIZIZ(sbLIZ3));
            System.currentTimeMillis();
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TTLiveBroadcastView@6190.initLiveParamsListenerTTLH$1$1");
            return unit2;
        }
        this.LLILZ.LLJZ.LJ(EnumC775440UbO.DEFAULT.getValue());
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TTLiveBroadcastView@6190.initLiveParamsListenerTTLH$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

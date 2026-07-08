package X;

import android.os.SystemClock;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.RawGameDetailHomeResponse$ResponseData;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipMixNetCacheConfig;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z42, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageHost$requestHomeDetail$1", f = "GameDetailMixPageHost.kt", l = {888}, m = "invokeSuspend")
public final class C1881600z42 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1881590z41 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1881600z42(C1881590z41 c1881590z41, InterfaceC1364105Vn<? super C1881600z42> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1881590z41;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1881600z42(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ConcurrentHashMap concurrentHashMap;
        Object obj2;
        Integer num;
        int iIntValue;
        AnonymousClass0984<?> anonymousClass0984;
        Object objLJJII = obj;
        C1C7U.LIZ("GameDetailMixPageHost@9f5f.requestHomeDetail$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    long j = this.LL;
                    C155000ia.LIZIZ(objLJJII);
                    i = j;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJJII);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C1881590z41 c1881590z41 = this.LLILLL;
                this.LL = jElapsedRealtime;
                this.LLILLJJLI = 1;
                objLJJII = c1881590z41.LJJII(this);
                i = jElapsedRealtime;
                if (objLJJII == objLJFF) {
                    C1C7U.LIZIZ("GameDetailMixPageHost@9f5f.requestHomeDetail$1");
                    return objLJFF;
                }
            }
            RawGameDetailHomeResponse$ResponseData rawGameDetailHomeResponse$ResponseData = (RawGameDetailHomeResponse$ResponseData) objLJJII;
            this.LLILLL.LLJJLIIIJLLLLLLLZ = false;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - i;
            C1882380z5I.LJI(C1882380z5I.LJIIIIZZ(this.LLILLL.LJIIIZ()), "home_network_success", true);
            C1882380z5I.LJI(C1882380z5I.LJIIIIZZ(this.LLILLL.LJIIIZ()), "home_network_duration", C2286608xc.LJFF(jElapsedRealtime2));
            if (rawGameDetailHomeResponse$ResponseData != null) {
                this.LLILLL.LJJIFFI(rawGameDetailHomeResponse$ResponseData);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJFF("GameDetailMixPageHost", "requestGameDetailHomeData error", th);
            this.LLILLL.LLJJLIIIJLLLLLLLZ = false;
            C1882380z5I.LJI(C1882380z5I.LJIIIIZZ(this.LLILLL.LJIIIZ()), "home_network_duration", C2286608xc.LJFF(SystemClock.elapsedRealtime() - i));
            C1882380z5I.LJI(C1882380z5I.LJIIIIZZ(this.LLILLL.LJIIIZ()), "home_network_success", false);
            this.LLILLL.LLJLL.postValue(false);
            C1CC2.LIZ("GameDetailMixPageHost.requestGameDetailHomeData", th);
        }
        final C1881590z41 c1881590z412 = this.LLILLL;
        c1881590z412.getClass();
        if (GameLivePartnershipMixNetCacheConfig.INSTANCE.getConfig().enable.contains(Integer.valueOf(c1881590z412.LLJLIL))) {
            C1882410z5L c1882410z5LLJII = c1881590z412.LJII();
            C11HT c11ht = null;
            if (c1882410z5LLJII == null) {
                num = null;
            } else {
                InterfaceC1881340z3c interfaceC1881340z3c = c1882410z5LLJII.LIZ;
                String str = c1882410z5LLJII.LIZIZ;
                if (interfaceC1881340z3c == null) {
                    concurrentHashMap = null;
                } else {
                    Object objLIZ = interfaceC1881340z3c.LJJIIZI().LIZ(str);
                    if (!(objLIZ instanceof ConcurrentHashMap)) {
                        objLIZ = null;
                    }
                    concurrentHashMap = (ConcurrentHashMap) objLIZ;
                }
                if (concurrentHashMap != null) {
                    obj2 = concurrentHashMap.get(Scene.SCENE_SERVICE);
                } else {
                    obj2 = null;
                }
                if (!(obj2 instanceof Integer)) {
                    obj2 = null;
                }
                num = (Integer) obj2;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 99;
            }
            C23219097x c23219097x = (C23219097x) ((C098J) C23218097w.LIZ.getValue()).get(C2098108Jv.LIZ(new C1881940z4a(iIntValue, C1882380z5I.LJFF(c1881590z412.LJII(), "game_id"), C1882380z5I.LJFF(c1881590z412.LJII(), "room_id"), C1882380z5I.LJFF(c1881590z412.LJII(), "ad_id"), C1882380z5I.LJFF(c1881590z412.LJII(), "item_id"), C1882380z5I.LJFF(c1881590z412.LJII(), "author_id"), C1882380z5I.LJFF(c1881590z412.LJII(), "game_tag_id"), C1882380z5I.LJFF(c1881590z412.LJII(), "task_id"), C1882380z5I.LJFF(c1881590z412.LJII(), "promote_task_type"), C1882380z5I.LJFF(c1881590z412.LJII(), "log_extra"), C1882380z5I.LJFF(c1881590z412.LJII(), "extra_params"))));
            if (c23219097x != null && (anonymousClass0984 = c23219097x.LIZ) != null) {
                c11ht = new C11HT(anonymousClass0984);
            }
            if (c11ht != null) {
                ((HashSet) c1881590z412.LLJJL.getValue()).add(c11ht.LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIJZLJL(new C09JN() { // from class: X.0z3z
                    @Override // X.C09JN
                    public final void accept(Object obj3) {
                        String strLJ;
                        C1C7U.LIZ("GameDetailMixPageHost@9f5f.observeRequestingDetailHomeData$1");
                        BaseResponse baseResponse = (BaseResponse) obj3;
                        RawGameDetailHomeResponse$ResponseData rawGameDetailHomeResponse$ResponseData2 = (RawGameDetailHomeResponse$ResponseData) baseResponse.data;
                        if (rawGameDetailHomeResponse$ResponseData2 != null) {
                            C1881590z41 c1881590z413 = c1881590z412;
                            n nVar = rawGameDetailHomeResponse$ResponseData2.data;
                            if (nVar == null || (strLJ = C476770Imp.LJ(nVar)) == null) {
                                strLJ = "{}";
                            }
                            c1881590z413.LLJJJ = new JSONObject(strLJ);
                            c1881590z413.LJJIFFI(rawGameDetailHomeResponse$ResponseData2);
                        } else {
                            c1881590z412.LJIJ(C1881030z37.LIZ(baseResponse.statusCode, baseResponse.LJ.toString()), false);
                        }
                        C1C7U.LIZIZ("GameDetailMixPageHost@9f5f.observeRequestingDetailHomeData$1");
                    }
                }));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameDetailMixPageHost@9f5f.requestHomeDetail$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

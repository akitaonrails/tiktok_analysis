package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.SharedBgEffectApi;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor_tool.EffectGetResponse;

/* JADX INFO: renamed from: X.0Tsu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayEffectHelper$fetchSingleEffectByServer$1", f = "PlayEffectHelper.kt", l = {99}, m = "invokeSuspend")
public final class C760820Tsu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ InterfaceC760840Tsw LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760820Tsu(String str, String str2, InterfaceC760840Tsw interfaceC760840Tsw, InterfaceC1364105Vn<? super C760820Tsu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = interfaceC760840Tsw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C760820Tsu c760820Tsu = new C760820Tsu(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c760820Tsu.LLILLJJLI = obj;
        return c760820Tsu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        Object c098200Yq;
        Object objPutIfAbsent;
        EffectGetResponse.Data data;
        C1C7U.LIZ("PlayEffectHelper@5c03.fetchSingleEffectByServer$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                try {
                    C155000ia.LIZIZ(obj);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            IHostCreativeTool iHostCreativeTool = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class);
            String str = this.LLILZ;
            String str2 = this.LLILLL;
            try {
                C480460Ism.LIZ().getClass();
                SharedBgEffectApi sharedBgEffectApi = (SharedBgEffectApi) C480460Ism.LIZLLL(SharedBgEffectApi.class);
                String ePAccessKey = iHostCreativeTool.getEPAccessKey();
                String ePVersion = iHostCreativeTool.getEPVersion();
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                obj = sharedBgEffectApi.fetchEffectByResourceId(ePAccessKey, str, str2, ePVersion, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PlayEffectHelper@5c03.fetchSingleEffectByServer$1");
                    return objLJFF;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        EffectGetResponse effectGetResponse = (EffectGetResponse) obj;
        if (effectGetResponse != null && (data = effectGetResponse.data) != null) {
            C01GW c01gw = C762030Tur.LIZ;
            String str3 = data.urlPrefix;
            C762030Tur.LIZJ = str3;
            c098200Yq = C762030Tur.LIZIZ(data.effect, str3);
        } else {
            c098200Yq = null;
        }
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        LiveEffect liveEffect = (LiveEffect) c098200Yq;
        if (liveEffect != null) {
            ((ConcurrentHashMap) C762030Tur.LIZ.getValue()).remove(this.LLILLL);
            C762030Tur.LIZ(liveEffect, this.LLILZ);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C760800Tss(this.LLILZIL, liveEffect, null), 2);
        } else {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C762030Tur.LIZ.getValue();
            String str4 = this.LLILLL;
            Object c760830Tsv = concurrentHashMap.get(str4);
            if (c760830Tsv == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str4, (c760830Tsv = new C760830Tsv(System.currentTimeMillis())))) != null) {
                c760830Tsv = objPutIfAbsent;
            }
            ((C760830Tsv) c760830Tsv).LIZIZ++;
            C1DFH c1dfh2 = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C760810Tst(this.LLILZIL, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayEffectHelper@5c03.fetchSingleEffectByServer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import android.os.SystemClock;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vFa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreInterceptor$showLiveWindow$2", f = "StoreInterceptor.kt", l = {669, 681}, m = "invokeSuspend")
public final class C1735000vFa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ SparkActivity LLILLL;
    public final /* synthetic */ StreamUrlStruct LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735000vFa(String str, SparkActivity sparkActivity, StreamUrlStruct streamUrlStruct, String str2, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super C1735000vFa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = sparkActivity;
        this.LLILZ = streamUrlStruct;
        this.LLILZIL = str2;
        this.LLILZLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1735000vFa(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1735010vFb c1735010vFb;
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        boolean z;
        Long lLJIILIIL;
        String strLIZJ;
        SparkFragment sparkFragment;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        Integer numLJ;
        Object kitView;
        LynxView lynxView;
        C1C7U.LIZ("StoreInterceptor@c22c.showLiveWindow$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String name = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    sparkFragment = this.LLILLL.LLJILJIL;
                    if (sparkFragment != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkFragment.LLILLL) != null) {
                        numLJ = C2286608xc.LJ(0);
                        kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
                        if ((kitView instanceof LynxView) && (lynxView = (LynxView) kitView) != null) {
                            lynxView.updateData(C2097908Jt.LIZJ(new Pair("mini_window_on", numLJ)));
                        }
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StoreInterceptor@c22c.showLiveWindow$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1315405Cu c1315405Cu = new C1315405Cu(null);
            this.LL = 1;
            if (C099A.LIZJ(2000L, c1315405Cu, this) == objLJFF) {
                C1C7U.LIZIZ("StoreInterceptor@c22c.showLiveWindow$2");
                return objLJFF;
            }
        }
        String str = this.LLILLJJLI;
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            SparkActivity sparkActivity = this.LLILLL;
            long jLongValue = lLJIILIIL.longValue();
            SparkFragment sparkFragment2 = sparkActivity.LLJILJIL;
            if (sparkFragment2 != null) {
                strLIZJ = C1733740vDY.LIZJ(sparkFragment2, "c29223.d0");
            } else {
                strLIZJ = null;
            }
            c1735010vFb = new C1735010vFb(jLongValue, strLIZJ);
        } else {
            c1735010vFb = null;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = ILiveDependencyService.class.getName();
            if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
        }
        SparkActivity sparkActivity2 = this.LLILLL;
        StreamUrlStruct streamUrlStruct = this.LLILZ;
        String str2 = this.LLILZIL;
        Map<String, ? extends Object> map = this.LLILZLL;
        this.LL = 2;
        if (((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).windowLivePlayProxy(sparkActivity2, streamUrlStruct, c1735010vFb, str2, map, this) == objLJFF) {
            C1C7U.LIZIZ("StoreInterceptor@c22c.showLiveWindow$2");
            return objLJFF;
        }
        sparkFragment = this.LLILLL.LLJILJIL;
        if (sparkFragment != null) {
            numLJ = C2286608xc.LJ(0);
            kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
            if (kitView instanceof LynxView) {
                lynxView.updateData(C2097908Jt.LIZJ(new Pair("mini_window_on", numLJ)));
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoreInterceptor@c22c.showLiveWindow$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

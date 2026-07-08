package X;

import android.os.SystemClock;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nlx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mix.util.PreloadResourceHelper$preloadGeckoByChannel$1", f = "PreloadResourceHelper.kt", l = {}, m = "invokeSuspend")
public final class C603630Nlx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C603630Nlx(List<String> list, InterfaceC1364105Vn<? super C603630Nlx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C603630Nlx(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin2;
        boolean z;
        String name;
        boolean z2;
        String name2;
        C1C7U.LIZ("PreloadResourceHelper@7ea9.preloadGeckoByChannel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = IHybridDependencyService.class.getName();
            if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
        }
        String accessKey = ((IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin).getAccessKey();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin2 = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin2 != null) {
                z = true;
            } else {
                z = false;
            }
            String name4 = IHybridDependencyService.class.getName();
            if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin2 != null) {
                name = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin2.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
        }
        C1551950qUL c1551950qULInitGeckoXMultiClient = ((IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin2).initGeckoXMultiClient();
        for (String str : this.LL) {
            if (C123100dR.LIZ(str)) {
                HashMap map = new HashMap();
                ArrayList arrayList = new ArrayList();
                CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
                targetChannel.channelName = str;
                arrayList.add(targetChannel);
                map.put(accessKey, arrayList);
                if (c1551950qULInitGeckoXMultiClient != null) {
                    c1551950qULInitGeckoXMultiClient.LIZIZ("default", null, map, null);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreloadResourceHelper@7ea9.preloadGeckoByChannel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

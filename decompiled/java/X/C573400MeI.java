package X;

import android.app.Activity;
import android.app.Application;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MeI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573400MeI extends AbstractC573460MeO {
    public final String LIZLLL;

    @Override // X.InterfaceC573280Me6
    public final void LIZ(Object obj) {
        WeakReference<Activity> weakReference;
        Activity activity;
        Activity activity2;
        if (!this.LIZ.LJIIL) {
            AbstractC573460MeO abstractC573460MeO = this.LIZIZ;
            if (abstractC573460MeO != null) {
                abstractC573460MeO.LIZ(obj);
                return;
            }
            return;
        }
        this.LIZJ.LIZIZ();
        C573380MeG c573380MeG = this.LIZ;
        C573060Mdk c573060Mdk = c573380MeG.LIZ;
        if (c573060Mdk != null) {
            c573060Mdk.LJIIJJI = 1;
        }
        WeakReference<Activity> weakReference2 = c573380MeG.LIZIZ;
        InterfaceC1635410sex interfaceC1635410sexCreateMvEffectPlatform = null;
        application = null;
        Application application = null;
        if (weakReference2 == null || weakReference2.get() == null || ((weakReference = this.LIZ.LIZIZ) != null && (activity2 = weakReference.get()) != null && C20622515mp.LJIILIIL(activity2))) {
            long jLIZ = this.LIZJ.LIZ();
            C573380MeG c573380MeG2 = this.LIZ;
            C573060Mdk c573060Mdk2 = c573380MeG2.LIZ;
            if (c573060Mdk2 != null) {
                c573060Mdk2.LIZ = (int) jLIZ;
                c573060Mdk2.LJIIJ = "activity is finish";
                c573060Mdk2.LJIIIZ = 1;
            }
            InterfaceC573490MeR interfaceC573490MeR = c573380MeG2.LIZJ;
            if (interfaceC573490MeR != null) {
                interfaceC573490MeR.onFailed();
                return;
            }
            return;
        }
        C573380MeG c573380MeG3 = this.LIZ;
        if (c573380MeG3.LJI == null) {
            WeakReference<Activity> weakReference3 = c573380MeG3.LIZIZ;
            if (weakReference3 != null && weakReference3.get() != null) {
                C573380MeG c573380MeG4 = this.LIZ;
                EffectService companion = EffectService.Companion.getInstance();
                if (companion != null) {
                    WeakReference<Activity> weakReference4 = this.LIZ.LIZIZ;
                    if (weakReference4 != null && (activity = weakReference4.get()) != null) {
                        application = activity.getApplication();
                    }
                    interfaceC1635410sexCreateMvEffectPlatform = companion.createMvEffectPlatform(application);
                }
                c573380MeG4.LJI = interfaceC1635410sexCreateMvEffectPlatform;
            } else {
                long jLIZ2 = this.LIZJ.LIZ();
                C573380MeG c573380MeG5 = this.LIZ;
                C573060Mdk c573060Mdk3 = c573380MeG5.LIZ;
                if (c573060Mdk3 != null) {
                    c573060Mdk3.LIZ = (int) jLIZ2;
                    c573060Mdk3.LJIIJ = "activity is null";
                    c573060Mdk3.LJIIIZ = 1;
                }
                InterfaceC573490MeR interfaceC573490MeR2 = c573380MeG5.LIZJ;
                if (interfaceC573490MeR2 != null) {
                    interfaceC573490MeR2.onFailed();
                }
            }
        }
        InterfaceC1635410sex interfaceC1635410sex = this.LIZ.LJI;
        if (interfaceC1635410sex != null) {
            interfaceC1635410sex.LJI(this.LIZLLL, false, new C581050Mqd(this, 2));
        }
    }

    public final boolean LIZIZ(EffectChannelResponse effectChannelResponse) {
        if (effectChannelResponse != null && !C580130Mp9.LIZ(effectChannelResponse.getAllCategoryEffects())) {
            ArrayList arrayList = new ArrayList();
            for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
                C1446130njf.LIZ.getClass();
                if (!Intrinsics.LJFF(C1446130njf.LJIIJ(effect, "amazing_mv"), "1")) {
                    MvThemeData mvThemeData = new MvThemeData();
                    mvThemeData.LJI(effect);
                    mvThemeData.urlPrefixList = effectChannelResponse.getUrlPrefix();
                    arrayList.add(mvThemeData);
                }
            }
            if (arrayList.size() <= 0) {
                long jLIZ = this.LIZJ.LIZ();
                C573380MeG c573380MeG = this.LIZ;
                C573060Mdk c573060Mdk = c573380MeG.LIZ;
                if (c573060Mdk != null) {
                    c573060Mdk.LIZ = (int) jLIZ;
                    c573060Mdk.LJIIJ = "mv list is null";
                    c573060Mdk.LJIIIZ = 1;
                }
                InterfaceC573490MeR interfaceC573490MeR = c573380MeG.LIZJ;
                if (interfaceC573490MeR != null) {
                    interfaceC573490MeR.onFailed();
                }
                return false;
            }
            long jLIZ2 = this.LIZJ.LIZ();
            C573060Mdk c573060Mdk2 = this.LIZ.LIZ;
            if (c573060Mdk2 != null) {
                c573060Mdk2.LIZ = (int) jLIZ2;
            }
            AbstractC573460MeO abstractC573460MeO = this.LIZIZ;
            if (abstractC573460MeO != null) {
                abstractC573460MeO.LIZ(arrayList);
            }
            return true;
        }
        long jLIZ3 = this.LIZJ.LIZ();
        C573060Mdk c573060Mdk3 = this.LIZ.LIZ;
        if (c573060Mdk3 != null) {
            c573060Mdk3.LIZ = (int) jLIZ3;
            c573060Mdk3.LJIIJ = "mv list is null";
            c573060Mdk3.LJIIIZ = 1;
        }
        return false;
    }

    public C573400MeI(String str, C573380MeG c573380MeG) {
        super(c573380MeG);
        this.LIZLLL = str;
    }
}

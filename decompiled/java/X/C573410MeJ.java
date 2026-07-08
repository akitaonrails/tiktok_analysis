package X;

import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0MeJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573410MeJ extends AbstractC573460MeO {
    public final String LIZLLL;

    @Override // X.InterfaceC573280Me6
    public final void LIZ(Object obj) {
        InterfaceC1635410sex interfaceC1635410sexCreateMvEffectPlatform;
        Application application;
        Activity activity;
        Activity activity2;
        if (TextUtils.isEmpty(this.LIZ.LJIIJ)) {
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
        WeakReference<Activity> weakReference = c573380MeG.LIZIZ;
        if (weakReference != null && (activity2 = weakReference.get()) != null && C20622515mp.LJIILIIL(activity2)) {
            LIZIZ(obj);
            return;
        }
        C573380MeG c573380MeG2 = this.LIZ;
        if (c573380MeG2.LJI == null) {
            WeakReference<Activity> weakReference2 = c573380MeG2.LIZIZ;
            if (weakReference2 != null && weakReference2.get() != null) {
                C573380MeG c573380MeG3 = this.LIZ;
                EffectService companion = EffectService.Companion.getInstance();
                if (companion != null) {
                    WeakReference<Activity> weakReference3 = this.LIZ.LIZIZ;
                    if (weakReference3 != null && (activity = weakReference3.get()) != null) {
                        application = activity.getApplication();
                    } else {
                        application = null;
                    }
                    interfaceC1635410sexCreateMvEffectPlatform = companion.createMvEffectPlatform(application);
                } else {
                    interfaceC1635410sexCreateMvEffectPlatform = null;
                }
                c573380MeG3.LJI = interfaceC1635410sexCreateMvEffectPlatform;
            } else {
                LIZIZ(obj);
            }
        }
        C573380MeG c573380MeG4 = this.LIZ;
        InterfaceC1635410sex interfaceC1635410sex = c573380MeG4.LJI;
        if (interfaceC1635410sex != null) {
            interfaceC1635410sex.LIZIZ(c573380MeG4.LJIIJ, null, new C581040Mqc(this, obj, 0));
        }
    }

    public final void LIZIZ(Object obj) {
        if (obj instanceof C573380MeG) {
            ((C573380MeG) obj).LJIIL = !TextUtils.isEmpty(this.LIZLLL);
        }
        AbstractC573460MeO abstractC573460MeO = this.LIZIZ;
        if (abstractC573460MeO != null) {
            abstractC573460MeO.LIZ(obj);
        }
    }

    public C573410MeJ(String str, C573380MeG c573380MeG) {
        super(c573380MeG);
        this.LIZLLL = str;
    }
}

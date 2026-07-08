package Y;

import X.C0VSJ;
import X.C1C7U;
import X.C202035143l;
import X.C202043143t;
import X.C2188811AlT;
import X.InterfaceC202028143e;
import com.bytedance.ies.mvp.presenter.MvpPresenter;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes31.dex */
public class ACallableS255S0200000_30 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS255S0200000_30 aCallableS255S0200000_30) {
        C1C7U.LIZ("LegacyMusicFetcher@caed.fetchInternal$1");
        InterfaceC202028143e interfaceC202028143e = (InterfaceC202028143e) aCallableS255S0200000_30.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicFetcher music id is invalid : ");
        sbLIZ.append(((MusicModel) aCallableS255S0200000_30.l1).getId());
        interfaceC202028143e.LIZJ(new C202035143l(5, C2188811AlT.LIZIZ(sbLIZ)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LegacyMusicFetcher@caed.fetchInternal$1");
        return unit;
    }

    public static final Object call$1(ACallableS255S0200000_30 aCallableS255S0200000_30) {
        C1C7U.LIZ("MainThreadMusicDownloadListener@7489.onFailed$1");
        ((C202043143t) aCallableS255S0200000_30.l0).LIZ.LIZJ((C202035143l) aCallableS255S0200000_30.l1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MainThreadMusicDownloadListener@7489.onFailed$1");
        return unit;
    }

    public static final Object call$2(ACallableS255S0200000_30 aCallableS255S0200000_30) {
        C1C7U.LIZ("MvpPresenter@9f7a.executeWithForceTag$1");
        Object objDoWork = ((MvpPresenter) aCallableS255S0200000_30.l1).doWork((Object[]) aCallableS255S0200000_30.l0);
        C1C7U.LIZIZ("MvpPresenter@9f7a.executeWithForceTag$1");
        return objDoWork;
    }

    public static final Object call$3(ACallableS255S0200000_30 aCallableS255S0200000_30) {
        EffectPlatform effectPlatform = (EffectPlatform) aCallableS255S0200000_30.l0;
        Effect effect = (Effect) aCallableS255S0200000_30.l1;
        C0VSJ c0vsj = EffectPlatform.LLILZ;
        effectPlatform.getClass();
        C1C7U.LIZ("EffectPlatform@7ec2.markEffectUsed$1L");
        EffectManager effectManager = effectPlatform.LL.LIZIZ;
        if (effectManager != null && effect != null) {
            effectManager.getEffectPlatform().LJIJJ(effect);
            C1C7U.LIZIZ("EffectPlatform@7ec2.markEffectUsed$1L");
            return null;
        }
        C1C7U.LIZIZ("EffectPlatform@7ec2.markEffectUsed$1L");
        return null;
    }

    public ACallableS255S0200000_30(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

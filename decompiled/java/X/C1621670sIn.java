package X;

import Y.AObserverS121S0300000_3;
import Y.AObserverS168S0200000_3;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.repository.params.FetchMode;
import com.ss.android.ugc.aweme.verify.EffectFullWidthHorizontalCarouselAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.gamora.recorder.sticker.abtest.EnableHCInDuetExperiment;
import kotlin.jvm.internal.AFwS214S0000000_25;
import w1p.a;

/* JADX INFO: renamed from: X.0sIn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1621670sIn {
    public static final C1621670sIn LIZ = new C1621670sIn();

    public static void LIZIZ(InterfaceC1624480sNK interfaceC1624480sNK, Effect effect) {
        if (C0A1P.LIZ()) {
            interfaceC1624480sNK.getStickerRepository().LJIILLIIL().LIZIZ(new C1629340sVA(effect, true, null, 4), true);
        }
    }

    public static void LIZ(ShortVideoContext shortVideoContext, InterfaceC1624480sNK interfaceC1624480sNK, LifecycleOwner lifecycleOwner) {
        Integer num;
        InterfaceC1633140sbI interfaceC1633140sbILJFF = interfaceC1624480sNK.getStickerRepository().LJFF();
        interfaceC1633140sbILJFF.LJIIJ(null, true, true, interfaceC1624480sNK.LJJLIIIJJIZ().LJFF).observe(lifecycleOwner, new AObserverS168S0200000_3(interfaceC1633140sbILJFF, lifecycleOwner, 0));
        if (!EffectFullWidthHorizontalCarouselAB.isEnabled()) {
            return;
        }
        if (EnableHCInDuetExperiment.isDuetInFWHC(shortVideoContext)) {
            num = 2;
        } else {
            num = null;
        }
        LiveData<C1641640sp0<HorizontalEffectsModel>> liveDataLJIIIZ = interfaceC1624480sNK.getStickerRepository().LJFF().LJIIIZ(C539900LFk.LIZLLL(shortVideoContext), false, FetchMode.DEFAULT, num);
        if (a.LIZ().shootingPrefetchFirstEffectEnabled || C0A1P.LIZ()) {
            liveDataLJIIIZ.observe(lifecycleOwner, new AObserverS168S0200000_3(liveDataLJIIIZ, interfaceC1624480sNK, 1));
        }
    }

    public static void LIZJ(ShortVideoContext shortVideoContext, InterfaceC1624480sNK interfaceC1624480sNK, LifecycleOwner lifecycleOwner) {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(54));
        if (EffectFullWidthHorizontalCarouselAB.isEnabled()) {
            interfaceC1624480sNK.getStickerRepository().LJFF().LIZLLL(C539900LFk.LIZLLL(shortVideoContext));
        }
        if (((Boolean) c01gwLIZIZ.getValue()).booleanValue()) {
            LIZ(shortVideoContext, interfaceC1624480sNK, lifecycleOwner);
            return;
        }
        InterfaceC1633140sbI interfaceC1633140sbILJFF = interfaceC1624480sNK.getStickerRepository().LJFF();
        interfaceC1633140sbILJFF.LJIIJ(null, true, true, false).observe(lifecycleOwner, new AObserverS121S0300000_3(interfaceC1633140sbILJFF, interfaceC1624480sNK, lifecycleOwner, 1));
        LIZ(shortVideoContext, interfaceC1624480sNK, lifecycleOwner);
    }
}

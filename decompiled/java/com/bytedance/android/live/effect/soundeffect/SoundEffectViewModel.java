package com.bytedance.android.live.effect.soundeffect;

import X.C0U3Z;
import X.C0U74;
import X.C0VSJ;
import X.C1161920gLG;
import X.C13BV;
import X.C13LP;
import X.C23250099c;
import X.C761100TtM;
import X.C761120TtO;
import X.C761740TuO;
import X.C761960Tuk;
import X.InterfaceC761180TtU;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastEffectManagerOpt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class SoundEffectViewModel extends BaseEffectViewModel<SoundEffect> {
    public final C761960Tuk LLILZ;
    public final C761740TuO LLILZIL;
    public int LLILZLL;
    public final InterfaceC761180TtU LLIZ;
    public final int LLIZLLLIL;
    public boolean LLJ;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILZ.LJ.getValue().removeCallbacksAndMessages(null);
    }

    public final void AQ2(SoundEffect soundEffect) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C761120TtO(soundEffect, this, null), 3);
    }

    public SoundEffectViewModel(C761960Tuk c761960Tuk, C761740TuO c761740TuO) {
        super(c761960Tuk, c761740TuO);
        this.LLILZ = c761960Tuk;
        this.LLILZIL = c761740TuO;
        InterfaceC761180TtU liveStreamSoundPlayer = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getLiveStreamSoundPlayer();
        this.LLIZ = liveStreamSoundPlayer;
        this.LLIZLLLIL = 86400000;
        this.LLJ = true;
        if (liveStreamSoundPlayer != null) {
            liveStreamSoundPlayer.LIZJ();
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C761100TtM(this, null), 3);
    }

    public final void BQ2(List<C0U74<SoundEffect>> list, List<C0U74<SoundEffect>> list2) {
        List list3;
        Object next;
        if (!list2.isEmpty() && !((C0U74) ListProtector.get(list2, 0)).LIZIZ.isEmpty()) {
            List<T> list4 = ((C0U74) ListProtector.get(list2, 0)).LIZIZ;
            C0U74 c0u74 = (C0U74) C13LP.LJJJLL(list);
            if (c0u74 == null || (list3 = c0u74.LIZIZ) == null) {
                list3 = C13BV.INSTANCE;
            }
            for (T t : list4) {
                Iterator it2 = list3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next, t)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                SoundEffect soundEffect = (SoundEffect) next;
                if (LiveBroadcastEffectManagerOpt.enableOptSoundDownload()) {
                    if (soundEffect != null && t.version > soundEffect.version) {
                        this.LLILZIL.getClass();
                        if (C761740TuO.LJIILLIIL(t)) {
                            new C0VSJ(C0U3Z.LIZIZ(t)).delete();
                        }
                    }
                } else if (soundEffect == null || t.version > soundEffect.version) {
                    this.LLILZIL.getClass();
                    if (C761740TuO.LJIILLIIL(t)) {
                        new C0VSJ(C0U3Z.LIZIZ(t)).delete();
                    }
                    this.LLILZIL.LJIILL(t, new AwS378S0200000_12(this, t, 8));
                }
            }
        }
    }
}

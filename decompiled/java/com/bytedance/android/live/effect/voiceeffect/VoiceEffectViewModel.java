package com.bytedance.android.live.effect.voiceeffect;

import X.C23250099c;
import X.C760930Tt5;
import X.C766010U3b;
import X.C766050U3f;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: loaded from: classes13.dex */
public final class VoiceEffectViewModel extends BaseEffectViewModel<LiveEffect> {
    public final C766010U3b LLILZ;

    public VoiceEffectViewModel(C766010U3b c766010U3b, C766050U3f c766050U3f) {
        super(c766010U3b, c766050U3f);
        this.LLILZ = c766010U3b;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C760930Tt5(this, null), 3);
    }
}

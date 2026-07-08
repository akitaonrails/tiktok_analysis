package com.bytedance.android.live.effect.filter.data;

import X.C0U4A;
import X.C23250099c;
import X.C511201yw;
import X.C766060U3g;
import X.InterfaceC761040TtG;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposerFilterViewModel extends BaseEffectViewModel<LiveEffect> {
    public final InterfaceC761040TtG LLILZ;

    public ComposerFilterViewModel(C0U4A c0u4a, C766060U3g c766060U3g) {
        super(c0u4a, c766060U3g);
        this.LLILZ = c0u4a;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C511201yw(this, null), 3);
    }
}

package com.bytedance.android.live.effect.bulletin;

import X.C23250099c;
import X.C396101gN;
import X.C398101gh;
import X.C767360U8g;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: loaded from: classes.dex */
public final class LiveBoardsViewModel extends BaseEffectViewModel<LiveEffect> {
    public final C767360U8g LLILZ;

    public LiveBoardsViewModel(C767360U8g c767360U8g, C398101gh c398101gh) {
        super(c767360U8g, c398101gh);
        this.LLILZ = c767360U8g;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C396101gN(this, null), 3);
    }
}

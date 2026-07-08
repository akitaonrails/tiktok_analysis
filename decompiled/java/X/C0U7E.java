package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0U7E, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U7E extends C0UEN {
    public String LJFF = "";

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final long getEffectId() {
        return 0L;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String getResourceId() {
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final LiveEffect LLJZIJLIL() {
        return new C0U7E();
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final C0U9E LJLIL() {
        return C0U9E.NONE;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String getName() {
        return this.LJFF;
    }
}

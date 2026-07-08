package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0N8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588950N8b extends C0N8Q {
    public final String LIZJ;
    public final String LIZLLL;
    public final /* synthetic */ CommerceVideoDelegateKt LJ;

    @Override // X.C0N8Q
    public final Aweme LIZ() {
        return this.LJ.aweme;
    }

    public C588950N8b(CommerceVideoDelegateKt commerceVideoDelegateKt) {
        this.LJ = commerceVideoDelegateKt;
        this.LIZJ = commerceVideoDelegateKt.eventType;
        Fragment fragment = commerceVideoDelegateKt.fragment;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(commerceVideoDelegateKt.fragment.getClass().getSimpleName());
        sbLIZ.append('_');
        sbLIZ.append(commerceVideoDelegateKt.eventType);
        this.LIZLLL = C2088108Fz.LIZIZ(fragment, C2188811AlT.LIZIZ(sbLIZ));
    }
}

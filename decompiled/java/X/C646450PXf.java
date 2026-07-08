package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl;
import com.ss.android.ugc.aweme.search.source.neo.model.CreationSearchSignalState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PXf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646450PXf extends C09AY implements Function0<C0PCY<CreationSearchSignalState>> {
    public final /* synthetic */ SearchContextAbilityImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C646450PXf(SearchContextAbilityImpl searchContextAbilityImpl) {
        super(0);
        this.LL = searchContextAbilityImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0PCY<CreationSearchSignalState> invoke() {
        C0PY5 c0py5 = new C0PW2<CreationSearchSignalState>() { // from class: X.0PY5
            @Override // X.C0PW2
            public final InterfaceC1618170sD9 LIZ() {
                return new CreationSearchSignalState(null, null, null, null, null, null, null, null, 255, null);
            }
        };
        SearchContextAbilityImpl searchContextAbilityImpl = this.LL;
        LifecycleOwner lifecycleOwner = searchContextAbilityImpl.LLILLL;
        View view = searchContextAbilityImpl.LLILLJJLI;
        Object obj = searchContextAbilityImpl.LL;
        return c0py5.LIZIZ(new C0PWA(8, view, lifecycleOwner, searchContextAbilityImpl.LLILZLL, searchContextAbilityImpl.LLILZ, null, searchContextAbilityImpl.LLILZIL, obj), EnumC646250PWl.GLOBAL);
    }
}

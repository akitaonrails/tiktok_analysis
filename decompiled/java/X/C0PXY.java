package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PXY, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PXY extends C09AY implements Function0<C0PCY<C646370PWx>> {
    public final /* synthetic */ SearchContextAbilityImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PXY(SearchContextAbilityImpl searchContextAbilityImpl) {
        super(0);
        this.LL = searchContextAbilityImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0PCY<C646370PWx> invoke() {
        C646390PWz c646390PWz = new C0PW2<C646370PWx>() { // from class: X.0PWz
            @Override // X.C0PW2
            public final InterfaceC1618170sD9 LIZ() {
                return new C646370PWx(0);
            }
        };
        SearchContextAbilityImpl searchContextAbilityImpl = this.LL;
        LifecycleOwner lifecycleOwner = searchContextAbilityImpl.LLILLL;
        View view = searchContextAbilityImpl.LLILLJJLI;
        Object obj = searchContextAbilityImpl.LL;
        return c646390PWz.LIZIZ(new C0PWA(8, view, lifecycleOwner, searchContextAbilityImpl.LLILZLL, searchContextAbilityImpl.LLILZ, null, searchContextAbilityImpl.LLILZIL, obj), EnumC646250PWl.ITEM);
    }
}

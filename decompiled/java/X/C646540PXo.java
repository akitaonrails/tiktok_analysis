package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646540PXo extends C09AY implements Function0<C0PCY<C652150Pi1>> {
    public final /* synthetic */ SearchContextAbilityImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C646540PXo(SearchContextAbilityImpl searchContextAbilityImpl) {
        super(0);
        this.LL = searchContextAbilityImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0PCY<C652150Pi1> invoke() {
        C0PY1 c0py1 = new C0PW2<C652150Pi1>() { // from class: X.0PY1
            @Override // X.C0PW2
            public final InterfaceC1618170sD9 LIZ() {
                return new C652150Pi1(0);
            }
        };
        SearchContextAbilityImpl searchContextAbilityImpl = this.LL;
        LifecycleOwner lifecycleOwner = searchContextAbilityImpl.LLILLL;
        View view = searchContextAbilityImpl.LLILLJJLI;
        Object obj = searchContextAbilityImpl.LL;
        return c0py1.LIZIZ(new C0PWA(8, view, lifecycleOwner, searchContextAbilityImpl.LLILZLL, searchContextAbilityImpl.LLILZ, null, searchContextAbilityImpl.LLILZIL, obj), EnumC646250PWl.EXTERNAL);
    }
}

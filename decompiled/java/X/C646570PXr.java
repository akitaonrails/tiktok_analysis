package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646570PXr extends C09AY implements Function0<C0PCY<C651130PgN>> {
    public final /* synthetic */ SearchContextAbilityImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C646570PXr(SearchContextAbilityImpl searchContextAbilityImpl) {
        super(0);
        this.LL = searchContextAbilityImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0PCY<C651130PgN> invoke() {
        C0PY4 c0py4 = new C0PW2<C651130PgN>() { // from class: X.0PY4
            @Override // X.C0PW2
            public final InterfaceC1618170sD9 LIZ() {
                return new C651130PgN(0);
            }
        };
        SearchContextAbilityImpl searchContextAbilityImpl = this.LL;
        LifecycleOwner lifecycleOwner = searchContextAbilityImpl.LLILLL;
        View view = searchContextAbilityImpl.LLILLJJLI;
        Object obj = searchContextAbilityImpl.LL;
        return c0py4.LIZIZ(new C0PWA(8, view, lifecycleOwner, searchContextAbilityImpl.LLILZLL, searchContextAbilityImpl.LLILZ, null, searchContextAbilityImpl.LLILZIL, obj), EnumC646250PWl.FRAGMENT);
    }
}

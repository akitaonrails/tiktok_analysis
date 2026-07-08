package X;

import android.content.ComponentCallbacks2;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.198e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214898198e extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ SAFFragmentRootScene LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C214898198e(SAFFragmentRootScene sAFFragmentRootScene) {
        super(0);
        this.LL = sAFFragmentRootScene;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        InterfaceC214897198d interfaceC214897198d;
        ComponentCallbacks2 componentCallbacks2 = this.LL.mActivity;
        return Boolean.valueOf((!(componentCallbacks2 instanceof InterfaceC214897198d) || (interfaceC214897198d = (InterfaceC214897198d) componentCallbacks2) == null) ? false : interfaceC214897198d.isDelegateFragmentManager());
    }
}

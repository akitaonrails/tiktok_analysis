package X;

import com.ss.android.ugc.aweme.footnote.detail.ui.FootNoteSensorConfigProvider;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05ix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1431305ix extends C09AY implements Function1<WeakReference<C704830Rkn>, C1521005xQ> {
    public final /* synthetic */ FootNoteSensorConfigProvider LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1431305ix(FootNoteSensorConfigProvider footNoteSensorConfigProvider) {
        super(1);
        this.LL = footNoteSensorConfigProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1521005xQ invoke(WeakReference<C704830Rkn> weakReference) {
        return new C1521005xQ(this.LL, weakReference);
    }
}

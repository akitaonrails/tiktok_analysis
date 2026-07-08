package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.suggestfollowing.FollowingSuggestConfigProvider;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09ia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2448209ia extends C09AY implements Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<? super VideoItemParams, ? super Map<String, ? extends Object>, ? super InterfaceC1364105Vn<? super AbstractC1387105bp>, ? extends Object>> {
    public final /* synthetic */ FollowingSuggestConfigProvider LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2448209ia(FollowingSuggestConfigProvider followingSuggestConfigProvider) {
        super(1);
        this.LL = followingSuggestConfigProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC1631620sYq<? super VideoItemParams, ? super Map<String, ? extends Object>, ? super InterfaceC1364105Vn<? super AbstractC1387105bp>, ? extends Object> invoke(WeakReference<C704830Rkn> weakReference) {
        return new C0OVL(this.LL, weakReference);
    }
}

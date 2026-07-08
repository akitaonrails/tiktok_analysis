package X;

import com.ss.android.ugc.aweme.api.component.tag.AdAvatarTagProvider;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05jf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1435705jf extends C09AY implements Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<? super VideoItemParams, ? super Map<String, ? extends Object>, ? super InterfaceC1364105Vn<? super AbstractC1387105bp>, ? extends Object>> {
    public final /* synthetic */ AdAvatarTagProvider LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1435705jf(AdAvatarTagProvider adAvatarTagProvider) {
        super(1);
        this.LL = adAvatarTagProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC1631620sYq<? super VideoItemParams, ? super Map<String, ? extends Object>, ? super InterfaceC1364105Vn<? super AbstractC1387105bp>, ? extends Object> invoke(WeakReference<C704830Rkn> weakReference) {
        this.LL.getClass();
        return new C707210Rod("high_tag_ads_text_and_avatars");
    }
}

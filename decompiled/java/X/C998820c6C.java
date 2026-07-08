package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdCardWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0c6C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998820c6C extends C09AY implements Function0<ViewGroup> {
    public final /* synthetic */ AdCardWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C998820c6C(AdCardWidget adCardWidget) {
        super(0);
        this.LL = adCardWidget;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, android.view.ViewGroup] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ViewGroup invoke() {
        return this.LL.findViewById(R.id.chm);
    }
}

package X;

import com.bytedance.android.livesdk.chatroom.api.SpotlightItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JbK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495120JbK extends C09AY implements Function1<SpotlightItem, Boolean> {
    public C495120JbK() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(SpotlightItem spotlightItem) {
        return Boolean.valueOf(spotlightItem.isPinned);
    }
}

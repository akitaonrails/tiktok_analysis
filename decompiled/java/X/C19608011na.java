package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.sticker.core.article.IArticleStickerComponentService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11na, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19608011na extends C09AY implements Function0<IArticleStickerComponentService> {
    public C19608011na() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.article.IArticleStickerComponentService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IArticleStickerComponentService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IArticleStickerComponentService.class, false, false, false, 14, null);
    }
}

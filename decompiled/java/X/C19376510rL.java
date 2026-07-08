package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10rL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19376510rL extends C09AY implements Function0<I18nManagerServiceApi> {
    public C19376510rL() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final I18nManagerServiceApi invoke() {
        return PluggableExtentionKt.pluggableSpi$default(I18nManagerServiceApi.class, false, false, false, 14, null);
    }
}

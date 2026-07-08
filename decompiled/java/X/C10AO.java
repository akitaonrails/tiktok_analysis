package X;

import com.ss.android.ugc.aweme.subscription.network.models.SubscriptionPhotoPreviewSettingsRequest;
import com.ss.android.ugc.aweme.subscription.network.models.SubscriptionPhotoPreviewSettingsResponse;
import com.ss.android.ugc.aweme.subscription.network.models.SubscriptionsPreviewSettingsRequest;
import com.ss.android.ugc.aweme.subscription.network.models.SubscriptionsPreviewSettingsResponse;

/* JADX INFO: renamed from: X.10AO, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public interface C10AO {
    public static final C0CQS LIZ = C0CQS.LIZ;

    @InterfaceC1501240pAY("/tiktok/v1/m10n/subscription/sop/update_preview_settings")
    AbstractC19484711Kz<SubscriptionPhotoPreviewSettingsResponse> LIZ(@C040I SubscriptionPhotoPreviewSettingsRequest subscriptionPhotoPreviewSettingsRequest);

    @InterfaceC1501240pAY("/tiktok/v1/m10n/subscription/sov/update_preview_settings")
    AbstractC19484711Kz<SubscriptionsPreviewSettingsResponse> LIZIZ(@C040I SubscriptionsPreviewSettingsRequest subscriptionsPreviewSettingsRequest);
}

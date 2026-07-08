package X;

import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: X.0Wma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833340Wma {
    public static final Feature LIZ;
    public static final Feature LIZIZ;

    static {
        new Feature("cancel_target_direct_transfer", 1L);
        new Feature("delete_credential", 1L);
        new Feature("delete_device_public_key", 1L);
        new Feature("get_or_generate_device_public_key", 1L);
        new Feature("get_passkeys", 1L);
        new Feature("update_passkey", 1L);
        LIZ = new Feature("is_user_verifying_platform_authenticator_available_for_credential", 1L);
        LIZIZ = new Feature("is_user_verifying_platform_authenticator_available", 1L);
        new Feature("privileged_api_list_credentials", 2L);
        new Feature("start_target_direct_transfer", 1L);
        new Feature("first_party_api_get_link_info", 1L);
        new Feature("zero_party_api_register", 3L);
        new Feature("zero_party_api_sign", 3L);
        new Feature("zero_party_api_list_discoverable_credentials", 2L);
        new Feature("zero_party_api_authenticate_passkey", 1L);
        new Feature("zero_party_api_register_passkey", 1L);
        new Feature("zero_party_api_register_passkey_with_sync_account", 1L);
        new Feature("zero_party_api_get_hybrid_client_registration_pending_intent", 1L);
        new Feature("zero_party_api_get_hybrid_client_sign_pending_intent", 1L);
        new Feature("get_browser_hybrid_client_sign_pending_intent", 1L);
        new Feature("get_browser_hybrid_client_registration_pending_intent", 1L);
        new Feature("privileged_authenticate_passkey", 1L);
        new Feature("privileged_register_passkey_with_sync_account", 1L);
        new Feature("zero_party_api_get_privileged_hybrid_client_registration_pending_intent", 1L);
        new Feature("zero_party_api_get_privileged_hybrid_client_sign_pending_intent", 1L);
    }
}

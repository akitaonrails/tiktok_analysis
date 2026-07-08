package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.11aX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19527111aX {
    public final HashMap<String, String> LIZ = new HashMap<>();

    public C19527111aX() {
        LIZ("pp_data_key_error_code", "pp_data_key_error_code");
        LIZ("pp_data_key_error_msg", "pp_data_key_error_msg");
        LIZ("pp_data_key_error_handler", "pp_data_key_error_handler");
        LIZ("pp_data_key_error_extra", "pp_data_key_error_extra");
        LIZ("pp_data_key_error_source", "pp_data_key_error_source");
        LIZ("pp_data_key_original_file_size", "pp_data_key_original_file_size");
        LIZ("pp_data_key_extract_file_size", "pp_data_key_extract_file_size");
        LIZ("pp_data_key_download_file_size", "pp_data_key_download_file_size");
    }

    public final String LIZIZ(String str) {
        return this.LIZ.get(str);
    }

    public final void LIZ(String str, String str2) {
        this.LIZ.put(str, str2);
    }
}

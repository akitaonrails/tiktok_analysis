package X;

import android.content.Intent;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0L7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537920L7u {
    public static C537930L7v LIZ(Intent intent) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("arg_data_process_items");
        ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("arg_data_all_items");
        ArrayList parcelableArrayListExtra3 = intent.getParcelableArrayListExtra("arg_data_text_items");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            return new C537930L7v(parcelableArrayListExtra, parcelableArrayListExtra2, parcelableArrayListExtra3);
        }
        return null;
    }
}

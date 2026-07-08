package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.036u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7902036u {
    public static boolean LIZ(ReminderButton reminderButton, ReminderButton reminderButton2) {
        if (Intrinsics.LJFF(reminderButton2, reminderButton) || reminderButton2 == null || reminderButton == null) {
            return false;
        }
        return !Intrinsics.LJFF(ReminderButton.LIZ(reminderButton2), ReminderButton.LIZ(reminderButton2));
    }
}

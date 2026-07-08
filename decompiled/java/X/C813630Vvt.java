package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.graphics.drawable.Icon;

/* JADX INFO: renamed from: X.0Vvt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C813630Vvt {
    public static Notification.CallStyle LIZIZ(Person person, PendingIntent pendingIntent) {
        return Notification.CallStyle.forOngoingCall(person, pendingIntent);
    }

    public static Notification.CallStyle LIZLLL(Notification.CallStyle callStyle, int i) {
        return callStyle.setAnswerButtonColorHint(i);
    }

    public static Notification.Action.Builder LJ(Notification.Action.Builder builder, boolean z) {
        return builder.setAuthenticationRequired(z);
    }

    public static Notification.CallStyle LJFF(Notification.CallStyle callStyle, int i) {
        return callStyle.setDeclineButtonColorHint(i);
    }

    public static Notification.CallStyle LJI(Notification.CallStyle callStyle, boolean z) {
        return callStyle.setIsVideo(z);
    }

    public static Notification.CallStyle LJII(Notification.CallStyle callStyle, Icon icon) {
        return callStyle.setVerificationIcon(icon);
    }

    public static Notification.CallStyle LJIIIIZZ(Notification.CallStyle callStyle, CharSequence charSequence) {
        return callStyle.setVerificationText(charSequence);
    }

    public static Notification.CallStyle LIZ(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
    }

    public static Notification.CallStyle LIZJ(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
    }
}

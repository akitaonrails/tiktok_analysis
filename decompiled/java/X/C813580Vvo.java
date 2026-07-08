package X;

import android.app.Notification;
import android.app.Person;

/* JADX INFO: renamed from: X.0Vvo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C813580Vvo {
    public static Notification.Builder LIZ(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Notification.Action.Builder LIZIZ(Notification.Action.Builder builder, int i) {
        return builder.setSemanticAction(i);
    }
}

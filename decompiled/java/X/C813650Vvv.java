package X;

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;

/* JADX INFO: renamed from: X.0Vvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C813650Vvv {
    public static Parcelable LIZIZ(Person person) {
        return person;
    }

    public static Notification.Builder LIZ(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }
}

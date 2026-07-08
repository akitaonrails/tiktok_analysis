package X;

import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: renamed from: X.0VyV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C815250VyV {
    public static C815260VyW LIZ(Person person) {
        IconCompat iconCompatLIZIZ;
        C815290VyZ c815290VyZ = new C815290VyZ();
        c815290VyZ.LIZ = person.getName();
        if (person.getIcon() != null) {
            iconCompatLIZIZ = IconCompat.LIZIZ(person.getIcon());
        } else {
            iconCompatLIZIZ = null;
        }
        c815290VyZ.LIZIZ = iconCompatLIZIZ;
        c815290VyZ.LIZJ = person.getUri();
        c815290VyZ.LIZLLL = person.getKey();
        c815290VyZ.LJ = person.isBot();
        c815290VyZ.LJFF = person.isImportant();
        return new C815260VyW(c815290VyZ);
    }

    public static Person LIZIZ(C815260VyW c815260VyW) {
        Person.Builder name = new Person.Builder().setName(c815260VyW.LIZ);
        IconCompat iconCompat = c815260VyW.LIZIZ;
        Icon iconLJFF = null;
        if (iconCompat != null) {
            iconCompat.getClass();
            iconLJFF = C815270VyX.LJFF(iconCompat, null);
        }
        return name.setIcon(iconLJFF).setUri(c815260VyW.LIZJ).setKey(c815260VyW.LIZLLL).setBot(c815260VyW.LJ).setImportant(c815260VyW.LJFF).build();
    }
}

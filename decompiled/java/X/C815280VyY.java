package X;

import android.os.PersistableBundle;

/* JADX INFO: renamed from: X.0VyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C815280VyY {
    public static C815260VyW LIZ(PersistableBundle persistableBundle) {
        C815290VyZ c815290VyZ = new C815290VyZ();
        c815290VyZ.LIZ = persistableBundle.getString("name");
        c815290VyZ.LIZJ = persistableBundle.getString("uri");
        c815290VyZ.LIZLLL = persistableBundle.getString("key");
        c815290VyZ.LJ = persistableBundle.getBoolean("isBot");
        c815290VyZ.LJFF = persistableBundle.getBoolean("isImportant");
        return new C815260VyW(c815290VyZ);
    }

    public static PersistableBundle LIZIZ(C815260VyW c815260VyW) {
        String string;
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = c815260VyW.LIZ;
        if (charSequence != null) {
            string = charSequence.toString();
        } else {
            string = null;
        }
        persistableBundle.putString("name", string);
        persistableBundle.putString("uri", c815260VyW.LIZJ);
        persistableBundle.putString("key", c815260VyW.LIZLLL);
        persistableBundle.putBoolean("isBot", c815260VyW.LJ);
        persistableBundle.putBoolean("isImportant", c815260VyW.LJFF);
        return persistableBundle;
    }
}

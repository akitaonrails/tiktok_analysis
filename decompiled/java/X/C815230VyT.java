package X;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0VyT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815230VyT {
    public Context LIZ;
    public String LIZIZ;
    public Intent[] LIZJ;
    public ComponentName LIZLLL;
    public CharSequence LJ;
    public CharSequence LJFF;
    public CharSequence LJI;
    public IconCompat LJII;
    public C815260VyW[] LJIIIIZZ;
    public Set<String> LJIIIZ;
    public C813680Vvy LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;
    public PersistableBundle LJIILIIL;

    public final ShortcutInfo LIZIZ() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.LIZ, this.LIZIZ).setShortLabel(this.LJ).setIntents(this.LIZJ);
        IconCompat iconCompat = this.LJII;
        if (iconCompat != null) {
            Context context = this.LIZ;
            iconCompat.getClass();
            intents.setIcon(C815270VyX.LJFF(iconCompat, context));
        }
        if (!TextUtils.isEmpty(this.LJFF)) {
            intents.setLongLabel(this.LJFF);
        }
        if (!TextUtils.isEmpty(this.LJI)) {
            intents.setDisabledMessage(this.LJI);
        }
        ComponentName componentName = this.LIZLLL;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.LJIIIZ;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.LJIIL);
        PersistableBundle persistableBundle = this.LJIILIIL;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C815260VyW[] c815260VyWArr = this.LJIIIIZZ;
            if (c815260VyWArr != null && c815260VyWArr.length > 0) {
                int length = c815260VyWArr.length;
                Person[] personArr = new Person[length];
                for (int i = 0; i < length; i++) {
                    C815260VyW c815260VyW = this.LJIIIIZZ[i];
                    c815260VyW.getClass();
                    personArr[i] = C815250VyV.LIZIZ(c815260VyW);
                }
                intents.setPersons(personArr);
            }
            C813680Vvy c813680Vvy = this.LJIIJ;
            if (c813680Vvy != null) {
                intents.setLocusId(c813680Vvy.LIZIZ);
            }
            intents.setLongLived(this.LJIIJJI);
        } else {
            if (this.LJIILIIL == null) {
                this.LJIILIIL = new PersistableBundle();
            }
            C815260VyW[] c815260VyWArr2 = this.LJIIIIZZ;
            if (c815260VyWArr2 != null && c815260VyWArr2.length > 0) {
                this.LJIILIIL.putInt("extraPersonCount", c815260VyWArr2.length);
                int i2 = 0;
                while (i2 < this.LJIIIIZZ.length) {
                    PersistableBundle persistableBundle2 = this.LJIILIIL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("extraPerson_");
                    int i3 = i2 + 1;
                    sbLIZ.append(i3);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C815260VyW c815260VyW2 = this.LJIIIIZZ[i2];
                    c815260VyW2.getClass();
                    persistableBundle2.putPersistableBundle(strLIZIZ, C815280VyY.LIZIZ(c815260VyW2));
                    i2 = i3;
                }
            }
            C813680Vvy c813680Vvy2 = this.LJIIJ;
            if (c813680Vvy2 != null) {
                this.LJIILIIL.putString("extraLocusId", c813680Vvy2.LIZ);
            }
            this.LJIILIIL.putBoolean("extraLongLived", this.LJIIJJI);
            intents.setExtras(this.LJIILIIL);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            intents.setExcludedFromSurfaces(0);
        }
        return intents.build();
    }

    public static List<C815230VyT> LIZ(Context context, List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C815240VyU(context, it2.next()).LIZ());
        }
        return arrayList;
    }
}

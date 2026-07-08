package X;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0VyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C815240VyU {
    public final C815230VyT LIZ;

    public final C815230VyT LIZ() {
        if (TextUtils.isEmpty(this.LIZ.LJ)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        C815230VyT c815230VyT = this.LIZ;
        Intent[] intentArr = c815230VyT.LIZJ;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return c815230VyT;
    }

    public C815240VyU(Context context, ShortcutInfo shortcutInfo) {
        C815260VyW[] c815260VyWArr;
        String string;
        C815230VyT c815230VyT = new C815230VyT();
        this.LIZ = c815230VyT;
        c815230VyT.LIZ = context;
        c815230VyT.LIZIZ = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        c815230VyT.LIZJ = (Intent[]) Arrays.copyOf(intents, intents.length);
        c815230VyT.LIZLLL = shortcutInfo.getActivity();
        c815230VyT.LJ = shortcutInfo.getShortLabel();
        c815230VyT.LJFF = shortcutInfo.getLongLabel();
        c815230VyT.LJI = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        c815230VyT.LJIIIZ = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        C813680Vvy c813680Vvy = null;
        if (extras != null && extras.containsKey("extraPersonCount")) {
            int i = extras.getInt("extraPersonCount");
            c815260VyWArr = new C815260VyW[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("extraPerson_");
                int i3 = i2 + 1;
                sbLIZ.append(i3);
                c815260VyWArr[i2] = C815280VyY.LIZ(extras.getPersistableBundle(C2188811AlT.LIZIZ(sbLIZ)));
                i2 = i3;
            }
        } else {
            c815260VyWArr = null;
        }
        c815230VyT.LJIIIIZZ = c815260VyWArr;
        C815230VyT c815230VyT2 = this.LIZ;
        shortcutInfo.getUserHandle();
        c815230VyT2.getClass();
        C815230VyT c815230VyT3 = this.LIZ;
        shortcutInfo.getLastChangedTimestamp();
        c815230VyT3.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            C815230VyT c815230VyT4 = this.LIZ;
            shortcutInfo.isCached();
            c815230VyT4.getClass();
        }
        C815230VyT c815230VyT5 = this.LIZ;
        shortcutInfo.isDynamic();
        c815230VyT5.getClass();
        C815230VyT c815230VyT6 = this.LIZ;
        shortcutInfo.isPinned();
        c815230VyT6.getClass();
        C815230VyT c815230VyT7 = this.LIZ;
        shortcutInfo.isDeclaredInManifest();
        c815230VyT7.getClass();
        C815230VyT c815230VyT8 = this.LIZ;
        shortcutInfo.isImmutable();
        c815230VyT8.getClass();
        C815230VyT c815230VyT9 = this.LIZ;
        shortcutInfo.isEnabled();
        c815230VyT9.getClass();
        C815230VyT c815230VyT10 = this.LIZ;
        shortcutInfo.hasKeyFieldsOnly();
        c815230VyT10.getClass();
        C815230VyT c815230VyT11 = this.LIZ;
        if (i4 >= 29) {
            if (shortcutInfo.getLocusId() != null) {
                LocusId locusId = shortcutInfo.getLocusId();
                C08IF.LIZLLL(locusId, "locusId cannot be null");
                String id = locusId.getId();
                if (!TextUtils.isEmpty(id)) {
                    c813680Vvy = new C813680Vvy(id);
                } else {
                    throw new IllegalArgumentException("id cannot be empty");
                }
            }
        } else {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                c813680Vvy = new C813680Vvy(string);
            }
        }
        c815230VyT11.LJIIJ = c813680Vvy;
        this.LIZ.LJIIL = shortcutInfo.getRank();
        this.LIZ.LJIILIIL = shortcutInfo.getExtras();
    }

    public C815240VyU(Context context, String str) {
        C815230VyT c815230VyT = new C815230VyT();
        this.LIZ = c815230VyT;
        c815230VyT.LIZ = context;
        c815230VyT.LIZIZ = str;
    }
}

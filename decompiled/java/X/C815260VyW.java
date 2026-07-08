package X;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: renamed from: X.0VyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815260VyW {
    public final CharSequence LIZ;
    public final IconCompat LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final Bundle LIZ() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJIJIIJI(bundle2, "name", this.LIZ);
        IconCompat iconCompat = this.LIZIZ;
        if (iconCompat != null) {
            bundle = new Bundle();
            switch (iconCompat.LIZ) {
                case -1:
                    C786410Ut5.LJJIJL(bundle, "obj", (Parcelable) iconCompat.LIZIZ);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    C786410Ut5.LJJIJL(bundle, "obj", (Bitmap) iconCompat.LIZIZ);
                    break;
                case 2:
                case 4:
                case 6:
                    C786410Ut5.LJJJI("obj", (String) iconCompat.LIZIZ, bundle);
                    break;
                case 3:
                    C786410Ut5.LJJIJ(bundle, "obj", (byte[]) iconCompat.LIZIZ);
                    break;
            }
            bundle.putInt("type", iconCompat.LIZ);
            bundle.putInt("int1", iconCompat.LJ);
            bundle.putInt("int2", iconCompat.LJFF);
            C786410Ut5.LJJJI("string1", iconCompat.LJIIIZ, bundle);
            ColorStateList colorStateList = iconCompat.LJI;
            if (colorStateList != null) {
                C786410Ut5.LJJIJL(bundle, "tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.LJII;
            if (mode != IconCompat.LJIIJ) {
                C786410Ut5.LJJJI("tint_mode", mode.name(), bundle);
            }
        } else {
            bundle = null;
        }
        C786410Ut5.LJJIIZI(bundle2, bundle, "icon");
        C786410Ut5.LJJJI("uri", this.LIZJ, bundle2);
        C786410Ut5.LJJJI("key", this.LIZLLL, bundle2);
        bundle2.putBoolean("isBot", this.LJ);
        bundle2.putBoolean("isImportant", this.LJFF);
        return bundle2;
    }

    public final int hashCode() {
        String str = this.LIZLLL;
        return str != null ? str.hashCode() : Objects.hash(this.LIZ, this.LIZJ, Boolean.valueOf(this.LJ), Boolean.valueOf(this.LJFF));
    }

    public C815260VyW(C815290VyZ c815290VyZ) {
        this.LIZ = c815290VyZ.LIZ;
        this.LIZIZ = c815290VyZ.LIZIZ;
        this.LIZJ = c815290VyZ.LIZJ;
        this.LIZLLL = c815290VyZ.LIZLLL;
        this.LJ = c815290VyZ.LJ;
        this.LJFF = c815290VyZ.LJFF;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C815260VyW)) {
            return false;
        }
        C815260VyW c815260VyW = (C815260VyW) obj;
        String str = this.LIZLLL;
        String str2 = c815260VyW.LIZLLL;
        if (str == null && str2 == null) {
            if (!Objects.equals(Objects.toString(this.LIZ), Objects.toString(c815260VyW.LIZ)) || !Objects.equals(this.LIZJ, c815260VyW.LIZJ) || !Objects.equals(Boolean.valueOf(this.LJ), Boolean.valueOf(c815260VyW.LJ)) || !Objects.equals(Boolean.valueOf(this.LJFF), Boolean.valueOf(c815260VyW.LJFF))) {
                return false;
            }
            return true;
        }
        return Objects.equals(str, str2);
    }
}

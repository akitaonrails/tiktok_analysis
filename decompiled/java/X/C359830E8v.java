package X;

import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0E8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359830E8v {
    public static C361980EHc LIZ(C19EG c19eg) {
        C361970EHb c361970EHb = new C361970EHb();
        c361970EHb.LIZ = c19eg.getString(2131833429);
        c361970EHb.LIZLLL = new AwS549S0100000_5(c19eg, 1339);
        c361970EHb.LJ = "bottom_item_edit_adjust";
        return c361970EHb.LIZ();
    }

    public static C361980EHc LIZIZ(C19EG c19eg) {
        C361970EHb c361970EHb = new C361970EHb();
        c361970EHb.LIZ = c19eg.getString(2131825354);
        c361970EHb.LIZLLL = new AwS549S0100000_5(c19eg, 1387);
        c361970EHb.LJ = "bottom_item_edit_ai_create";
        return c361970EHb.LIZ();
    }

    public static C361980EHc LIZJ(C19EG c19eg, boolean z, boolean z2) {
        int i;
        String str;
        C419910GdJ c419910GdJ;
        if (z2) {
            i = 2131825363;
        } else {
            i = 2131825492;
        }
        String string = c19eg.getString(i);
        String str2 = "bottom_item_edit_ai_extend_modify";
        if (z2) {
            str = "bottom_item_edit_ai_extend_modify";
        } else {
            str = "bottom_item_edit_ai_extend";
        }
        if (z2) {
            c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_ai_video;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ.LJFF = true;
        } else {
            c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_ai_extend;
            c419910GdJ.LJFF = true;
        }
        if (!z) {
            C361970EHb c361970EHb = new C361970EHb();
            c361970EHb.LIZ = string;
            c361970EHb.LIZLLL = new AwS406S0200000_5(c419910GdJ, c19eg, 145);
            c361970EHb.LJ = str;
            return c361970EHb.LIZ();
        }
        if (!z2) {
            str2 = "ai_extend";
        }
        C361970EHb c361970EHb2 = new C361970EHb();
        c361970EHb2.LIZ = string;
        c361970EHb2.LIZLLL = new AwS406S0200000_5(c419910GdJ, c19eg, 146);
        c361970EHb2.LJ = str2;
        return c361970EHb2.LIZ();
    }

    public static List LIZLLL(C19EG c19eg, boolean z, boolean z2, boolean z3, int i) {
        String str;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        String str2 = null;
        if ((i & 2) != 0) {
            str = "bottom_item_edit_ai_image";
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = "bottom_item_edit_ai_video";
        }
        if ((i & 8) != 0) {
            z6 = false;
        }
        if ((i & 16) != 0) {
            z5 = false;
        }
        if ((i & 32) != 0) {
            z4 = false;
        }
        return C359870E8z.LIZ(c19eg, str, str2, z6, z5, z4);
    }
}

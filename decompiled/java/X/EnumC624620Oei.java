package X;

import android.content.Context;
import android.content.res.Resources;
import com.zhiliaoapp.musically.R;
import kotlin.text.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Oei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC624620Oei {
    public static final C624610Oeh Companion;
    public static final EnumC624620Oei DOWNLOADED;
    public static final /* synthetic */ EnumC624620Oei[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC624620Oei PAUSE;
    public static final EnumC624620Oei RESUME;
    public static final EnumC624620Oei UNINITIALIZED;
    public final int LL;
    public final C419910GdJ LLILLJJLI;

    public static InterfaceC2044707zh<EnumC624620Oei> getEntries() {
        return LLILZ;
    }

    static {
        C419910GdJ c419910GdJ = new C419910GdJ();
        Integer numValueOf = Integer.valueOf(R.attr.ee);
        c419910GdJ.LJ = numValueOf;
        c419910GdJ.LIZ = R.raw.icon_pause_fill1;
        EnumC624620Oei enumC624620Oei = new EnumC624620Oei("RESUME", 0, 2131838529, c419910GdJ);
        RESUME = enumC624620Oei;
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LJ = numValueOf;
        c419910GdJ2.LIZ = R.raw.icon_tick_fill;
        EnumC624620Oei enumC624620Oei2 = new EnumC624620Oei("DOWNLOADED", 1, 2131838531, c419910GdJ2);
        DOWNLOADED = enumC624620Oei2;
        C419910GdJ c419910GdJ3 = new C419910GdJ();
        c419910GdJ3.LJ = numValueOf;
        c419910GdJ3.LIZ = R.raw.icon_arrow_down_to_line_bold;
        EnumC624620Oei enumC624620Oei3 = new EnumC624620Oei("UNINITIALIZED", 2, 2131838530, c419910GdJ3);
        UNINITIALIZED = enumC624620Oei3;
        C419910GdJ c419910GdJ4 = new C419910GdJ();
        c419910GdJ4.LJ = numValueOf;
        c419910GdJ4.LIZ = R.raw.icon_arrow_down_to_line_bold;
        EnumC624620Oei enumC624620Oei4 = new EnumC624620Oei("PAUSE", 3, 2131838530, c419910GdJ4);
        PAUSE = enumC624620Oei4;
        EnumC624620Oei[] enumC624620OeiArr = {enumC624620Oei, enumC624620Oei2, enumC624620Oei3, enumC624620Oei4};
        LLILLL = enumC624620OeiArr;
        LLILZ = new C2254308sP(enumC624620OeiArr);
        Companion = new C624610Oeh();
    }

    public static EnumC624620Oei[] values() {
        return (EnumC624620Oei[]) LLILLL.clone();
    }

    public final C419910GdJ getIcon() {
        return this.LLILLJJLI;
    }

    public final int getTitle() {
        return this.LL;
    }

    public static EnumC624620Oei valueOf(String str) {
        return (EnumC624620Oei) C08FF.LIZ(EnumC624620Oei.class, str);
    }

    public EnumC624620Oei(String str, int i, int i2, C419910GdJ c419910GdJ) {
        this.LL = i2;
        this.LLILLJJLI = c419910GdJ;
    }

    public final String getSubtitle(Context context, int i, EnumC624770Oex enumC624770Oex, boolean z, int i2) {
        String string;
        Resources resources;
        String quantityString;
        String strLJJIFFI;
        Resources resources2;
        String quantityString2;
        String strLJJIFFI2;
        int i3 = C624660Oem.LIZ[ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        if (context == null) {
                            return null;
                        }
                        return context.getString(2131838598);
                    }
                    throw new C1954807lC();
                }
                if (!C624670Oen.LIZIZ()) {
                    return null;
                }
                if (enumC624770Oex == EnumC624770Oex.PAUSE_STORAGE) {
                    if (context == null) {
                        return null;
                    }
                    return context.getString(2131838600);
                }
                if (z) {
                    if (enumC624770Oex == EnumC624770Oex.PAUSE_NOT_WIFI) {
                        if (context == null) {
                            return null;
                        }
                        return context.getString(2131838601);
                    }
                    if (enumC624770Oex == EnumC624770Oex.PAUSE_NO_NETWORK) {
                        if (context == null) {
                            return null;
                        }
                        return context.getString(2131838601);
                    }
                } else {
                    if (enumC624770Oex == EnumC624770Oex.PAUSE_NOT_WIFI) {
                        if (context == null) {
                            return null;
                        }
                        return context.getString(2131838601);
                    }
                    if (enumC624770Oex == EnumC624770Oex.PAUSE_NO_NETWORK) {
                        if (context == null) {
                            return null;
                        }
                        return context.getString(2131838601);
                    }
                }
                if (!enumC624770Oex.canResume() || context == null) {
                    return null;
                }
                return context.getString(2131838601);
            }
            EnumC624640Oek.Companion.getClass();
            for (EnumC624640Oek enumC624640Oek : EnumC624640Oek.values()) {
                if (enumC624640Oek.getCount() == i) {
                    if (C624670Oen.LIZLLL()) {
                        if (context != null && (resources = context.getResources()) != null && (quantityString = resources.getQuantityString(2131755441, 2)) != null && (strLJJIFFI = u.LJJIFFI(quantityString, "%1$s", String.valueOf(enumC624640Oek.getMinutes()), false)) != null) {
                            return strLJJIFFI;
                        }
                        return "";
                    }
                    if (C624670Oen.LIZJ()) {
                        if (context != null && (resources2 = context.getResources()) != null && (quantityString2 = resources2.getQuantityString(2131755442, 2)) != null && (strLJJIFFI2 = u.LJJIFFI(quantityString2, "%1$s", String.valueOf(enumC624640Oek.getCount()), false)) != null) {
                            return strLJJIFFI2;
                        }
                        return "";
                    }
                }
            }
            return null;
        }
        if (context == null || (string = context.getString(2131838586)) == null) {
            return null;
        }
        return u.LJJIFFI(string, "%1$s", String.valueOf(i2), false);
    }
}

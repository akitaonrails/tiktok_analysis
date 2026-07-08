package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0yJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852810yJb {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(267));

    public static int LIZ(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2022028570) {
                if (iHashCode != -1995355099) {
                    if (iHashCode == 244856480) {
                        str.equals("draw_image");
                        return R.raw.icon_camera_beauty_magic;
                    }
                    return R.raw.icon_camera_beauty_magic;
                }
                if (!str.equals("convert_style")) {
                    return R.raw.icon_camera_beauty_magic;
                }
                return R.raw.icon_convert;
            }
            if (!str.equals("edit_image")) {
                return R.raw.icon_camera_beauty_magic;
            }
            return R.raw.icon_image_brush;
        }
        return R.raw.icon_camera_beauty_magic;
    }

    public static int LIZJ(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2022028570) {
                if (iHashCode != -1995355099) {
                    if (iHashCode == 244856480 && str.equals("draw_image")) {
                        return 3001;
                    }
                    return 0;
                }
                if (str.equals("convert_style")) {
                    return 3002;
                }
                return 0;
            }
            if (str.equals("edit_image")) {
                return 3003;
            }
            return 0;
        }
        return 0;
    }

    public static String LIZLLL(Integer num) {
        if (num != null) {
            if (num.intValue() == 3003) {
                return "edit_image";
            }
            if (num.intValue() == 3001) {
                return "draw_image";
            }
            if (num.intValue() == 3002) {
                return "convert_style";
            }
            return null;
        }
        return null;
    }

    public static String LIZIZ(Context context, String str) {
        int i;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2022028570) {
                if (iHashCode != -1995355099) {
                    if (iHashCode == 244856480 && str.equals("draw_image")) {
                        i = 2131849629;
                    }
                } else if (str.equals("convert_style")) {
                    i = 2131849631;
                }
            } else {
                str.equals("edit_image");
            }
            i = 2131849630;
        } else {
            i = 2131849630;
        }
        return context.getString(i);
    }
}

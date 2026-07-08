package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.07d4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC1904407d4 {
    public static final String LIZ = "com.zhiliao.musically.livewallpaper";
    public static final Uri LIZIZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("com.zhiliao.musically.livewallpaper");
        sbLIZ.append(".wallpaperplugincaller");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("content://");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("/");
        sbLIZ2.append("START_WALL_PAPER");
        LIZIZ = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ2));
    }
}

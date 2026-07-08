package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.0t6I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652360t6I {
    public static C20498315Iv LIZ(String str, Bundle bundle, String str2, String str3, boolean z, boolean z2, UrlModel urlModel, int i, String str4, MusicModel musicModel, boolean z3, String str5, String str6, int i2) {
        boolean z4;
        String str7 = str5;
        boolean z5 = z3;
        boolean z6 = z2;
        if ((i2 & 512) != 0) {
            z6 = false;
        }
        if ((i2 & 1024) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((32768 & i2) != 0) {
            z5 = false;
        }
        String str8 = "";
        if ((65536 & i2) != 0) {
            str7 = "";
        }
        if ((i2 & 131072) == 0) {
            str8 = str6;
        }
        return new C20498315Iv(str, 2, true, false, bundle, str2, str3, z, false, false, z6, z4, str4, urlModel, i, null, null, musicModel, z5, str7, str8);
    }
}

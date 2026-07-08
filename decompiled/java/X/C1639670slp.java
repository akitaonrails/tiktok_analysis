package X;

import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0slp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1639670slp {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final ToolsUrlModel LJFF;
    public final List<String> LJI;
    public final String LJII;
    public final Uri LJIIIIZZ;
    public final String LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1639670slp)) {
            return false;
        }
        C1639670slp c1639670slp = (C1639670slp) obj;
        if (Intrinsics.LJFF(this.LIZ, c1639670slp.LIZ) && TextUtils.equals(this.LIZLLL, c1639670slp.LIZLLL)) {
            return true;
        }
        return false;
    }

    public C1639670slp(String str, String str2, String str3, String str4, String str5, ToolsUrlModel toolsUrlModel, List<String> list, String str6, Uri uri, String str7) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = toolsUrlModel;
        this.LJI = list;
        this.LJII = str6;
        this.LJIIIIZZ = uri;
        this.LJIIIZ = str7;
    }
}

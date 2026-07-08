package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cqI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1027400cqI extends AbstractC1027370cqF {
    @Override // X.InterfaceC1027390cqH
    public final boolean LIZIZ() {
        C1027460cqO c1027460cqO = C1027460cqO.LIZIZ;
        c1027460cqO.LJI("ad_lynx_download_JumpMarketHandler_doHandle", "begin", String.valueOf(LJ().LIZ.LIZJ));
        String str = LJ().LIZJ.LIZ;
        if (TextUtils.isEmpty(str)) {
            c1027460cqO.LJI("ad_lynx_download_JumpMarketHandler_doHandle", "empty_url", String.valueOf(LJ().LIZ.LIZJ));
            return false;
        }
        Uri uri = UriProtector.parse(str);
        String scheme = uri.getScheme();
        String lowerCase = scheme != null ? scheme.toLowerCase(Locale.getDefault()) : null;
        if (TextUtils.isEmpty(lowerCase)) {
            c1027460cqO.LJI("ad_lynx_download_JumpMarketHandler_doHandle", "empty_schema", String.valueOf(LJ().LIZ.LIZJ));
            return false;
        }
        if (Intrinsics.LJFF("market", lowerCase)) {
            c1027460cqO.LJI("ad_lynx_download_JumpMarketHandler_doHandle", "jumpMarket", String.valueOf(LJ().LIZ.LIZJ));
            return c1027460cqO.LJIIJ(LIZLLL(), str, uri, LJ());
        }
        c1027460cqO.LJI("ad_lynx_download_JumpMarketHandler_doHandle", "fail", String.valueOf(LJ().LIZ.LIZJ));
        return false;
    }

    @Override // X.InterfaceC1027390cqH
    public final boolean LIZ() {
        return !TextUtils.isEmpty(LJ().LIZJ.LIZ);
    }
}

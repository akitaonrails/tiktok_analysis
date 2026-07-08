package X;

import Y.ARunnableS123S0100000_23;
import android.content.Context;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.easteregg.core.config.Settings;
import com.tiktok.forestx.RequestParamsX;
import java.util.Collections;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS602S0100000_23;

/* JADX INFO: renamed from: X.0pvK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530240pvK implements InterfaceC663570Q1b<C050D> {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(576));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(204));
    public final int LIZJ = 3;

    @Override // X.InterfaceC663570Q1b
    public final Integer LIZ() {
        return Integer.valueOf(this.LIZJ);
    }

    @Override // X.InterfaceC663570Q1b
    public final C050E getData() {
        final boolean zLIZJ = LIZJ();
        return new C050E(zLIZJ) { // from class: X.050D
            public final boolean LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C050D) && this.LIZ == ((C050D) obj).LIZ;
            }

            public final int hashCode() {
                return C786410Ut5.Z2(this.LIZ);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EasterEggData(available=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = zLIZJ;
            }
        };
    }

    public final boolean LIZJ() {
        Long l;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Settings settingsLIZ = C1530250pvL.LIZ();
        long jLongValue = (settingsLIZ == null || (l = settingsLIZ.preloadIntervalMillis) == null) ? C1530250pvL.LIZ : l.longValue();
        long j = ((Keva) this.LIZ.getValue()).getLong("easter_egg_lynx_timestamp", -1L);
        long j2 = ((Keva) this.LIZ.getValue()).getLong("easter_egg_video_timestamp", -1L);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Validity result, Lynx(");
        long j3 = jElapsedRealtime - j;
        sbLIZ.append(j3 < jLongValue);
        sbLIZ.append("), Video(");
        long j4 = jElapsedRealtime - j2;
        sbLIZ.append(j4 < jLongValue);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        return j >= 0 && j2 >= 0 && jElapsedRealtime >= j && jElapsedRealtime >= j2 && j3 < jLongValue && j4 < jLongValue;
    }

    public final void LIZLLL() {
        Integer num;
        String str;
        String str2;
        Settings settingsLIZ = C1530250pvL.LIZ();
        if (settingsLIZ == null || (num = settingsLIZ.enabled) == null || num.intValue() != 1) {
            return;
        }
        C01GW<C1075480e5q> c01gw = C1075480e5q.LIZIZ;
        if (C1075530e5v.LIZIZ().LIZIZ(C1533850q19.class, "hybridkit_default_bid") == null) {
            return;
        }
        String strLIZ = C1553670qX7.LIZ();
        Settings settingsLIZ2 = C1530250pvL.LIZ();
        if (settingsLIZ2 == null || (str = settingsLIZ2.resourceChannel) == null) {
            str = "";
        }
        Settings settingsLIZ3 = C1530250pvL.LIZ();
        if (settingsLIZ3 == null || (str2 = settingsLIZ3.lynxTemplateChannel) == null) {
            str2 = "";
        }
        if (strLIZ.length() == 0 || str.length() == 0 || str2.length() == 0 || LIZJ()) {
            return;
        }
        C1530260pvM c1530260pvM = (C1530260pvM) this.LIZIZ.getValue();
        if (c1530260pvM.LIZJ != null && System.currentTimeMillis() - c1530260pvM.LIZJ.longValue() < c1530260pvM.LIZ && c1530260pvM.LIZIZ) {
            return;
        }
        c1530260pvM.LIZIZ = true;
        c1530260pvM.LIZJ = Long.valueOf(System.currentTimeMillis());
        if (C1535630q41.LJJIII) {
            C1532680pzG.LIZ.getClass();
            C1532950pzh c1532950pzh = C1532680pzG.LJJ;
            RequestParamsX requestParamsX = new RequestParamsX(null, null, 3, null);
            requestParamsX.accessKey = strLIZ;
            requestParamsX.fetcherSequence = Collections.singletonList("gecko");
            requestParamsX.waitGeckoUpdate = true;
            requestParamsX.channel = str2;
            requestParamsX.source = "SearchEasterEgg";
            requestParamsX.bundle = "/";
            c1532950pzh.LIZ("", requestParamsX, new AwS602S0100000_23(this, 70));
            RequestParamsX requestParamsX2 = new RequestParamsX(null, null, 3, null);
            requestParamsX2.accessKey = strLIZ;
            requestParamsX2.fetcherSequence = Collections.singletonList("gecko");
            requestParamsX2.waitGeckoUpdate = true;
            requestParamsX2.channel = str;
            requestParamsX2.source = "SearchEasterEgg";
            requestParamsX2.bundle = "/";
            c1532950pzh.LIZ("", requestParamsX2, new AwS602S0100000_23(this, 71));
            return;
        }
        C1533850q19 c1533850q19 = (C1533850q19) C1075530e5v.LIZIZ().LIZIZ(C1533850q19.class, "hybridkit_default_bid");
        if (c1533850q19 != null) {
            RequestParams requestParams = new RequestParams(null, 1, null);
            requestParams.accessKey = strLIZ;
            requestParams.fetcherSequence = Collections.singletonList("gecko");
            requestParams.waitGeckoUpdate = true;
            requestParams.channel = str2;
            requestParams.bundle = "/";
            requestParams.supportDirectory = true;
            requestParams.needLocalFile = Boolean.TRUE;
            c1533850q19.fetchResourceAsyncIfNeed("", requestParams, new AwS602S0100000_23(this, 72));
        }
        C1533850q19 c1533850q192 = (C1533850q19) C1075530e5v.LIZIZ().LIZIZ(C1533850q19.class, "hybridkit_default_bid");
        if (c1533850q192 != null) {
            RequestParams requestParams2 = new RequestParams(null, 1, null);
            requestParams2.accessKey = strLIZ;
            requestParams2.fetcherSequence = Collections.singletonList("gecko");
            requestParams2.waitGeckoUpdate = true;
            requestParams2.channel = str;
            requestParams2.bundle = "/";
            requestParams2.supportDirectory = true;
            requestParams2.needLocalFile = Boolean.TRUE;
            c1533850q192.fetchResourceAsyncIfNeed("", requestParams2, new AwS602S0100000_23(this, 73));
        }
    }

    @Override // X.InterfaceC663570Q1b
    public final void LIZIZ(Context context, Fragment fragment, SearchResultParam searchResultParam) {
        if (!C665020Q6q.LIZ(searchResultParam)) {
            C823050WQl.LIZJ().execute(new ARunnableS123S0100000_23(this, 149));
        } else {
            LIZLLL();
        }
    }
}

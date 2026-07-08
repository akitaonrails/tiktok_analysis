package X;

import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N22, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N22 implements C0N8J {
    public static final C0N23 LIZJ(Aweme aweme) {
        final String strLIZ;
        long videoLength;
        String fetchFrom;
        final String aid = aweme.getAid();
        final String uniqueId = null;
        if (aid == null || (strLIZ = C587350N1x.LIZ(aweme)) == null) {
            return null;
        }
        AwemeRawAd awemeRawAdLIZIZ = C587350N1x.LIZIZ(aweme);
        if (awemeRawAdLIZIZ != null) {
            uniqueId = awemeRawAdLIZIZ.getUniqueId();
        }
        String str = "";
        if (uniqueId == null) {
            uniqueId = "";
        }
        AwemeRawAd awemeRawAdLIZIZ2 = C587350N1x.LIZIZ(aweme);
        if (awemeRawAdLIZIZ2 != null && (fetchFrom = awemeRawAdLIZIZ2.getFetchFrom()) != null) {
            str = fetchFrom;
        }
        C0N23 c0n23 = new C0N23(aid, strLIZ, uniqueId) { // from class: X.0MxU
            public final String LIZJ;
            public final String LIZLLL;
            public final String LJ;
            public final String LJFF;
            public final String LJI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C585300MxU)) {
                    return false;
                }
                C585300MxU c585300MxU = (C585300MxU) obj;
                return Intrinsics.LJFF(this.LIZJ, c585300MxU.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c585300MxU.LIZLLL) && Intrinsics.LJFF(this.LJ, c585300MxU.LJ);
            }

            public final int hashCode() {
                return (((this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("StdMeasId(");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(this.LJI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C0N23
            public final String LIZ() {
                return this.LJI;
            }

            @Override // X.C0N23
            public final String LIZIZ() {
                return this.LJFF;
            }

            {
                this.LIZJ = aid;
                this.LIZLLL = strLIZ;
                this.LJ = uniqueId;
                this.LJFF = aid;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('@');
                sbLIZ.append(aid);
                sbLIZ.append('@');
                sbLIZ.append(strLIZ);
                sbLIZ.append('@');
                sbLIZ.append(uniqueId);
                this.LJI = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('@');
                sbLIZ2.append(aid);
                sbLIZ2.append('@');
                sbLIZ2.append(strLIZ);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        };
        c0n23.LIZ = str;
        Video video = aweme.getVideo();
        if (video != null) {
            videoLength = video.getVideoLength();
        } else {
            videoLength = -1;
        }
        c0n23.LIZIZ = videoLength;
        return c0n23;
    }

    public static final boolean LJ(Aweme aweme) {
        boolean zIsAdTraffic;
        AwemeRawAd awemeRawAdLIZIZ;
        boolean zIsAdTraffic2;
        Boolean bool;
        C01GW c01gw = C2264471DkD.LJIIIIZZ;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            zIsAdTraffic = C587350N1x.LIZJ(aweme);
        } else {
            zIsAdTraffic = AwemeExtKt.isAdTraffic(aweme);
        }
        boolean z = false;
        if (!zIsAdTraffic || (awemeRawAdLIZIZ = C587350N1x.LIZIZ(aweme)) == null) {
            return false;
        }
        String strLIZIZ = C2088108Fz.LIZIZ(awemeRawAdLIZIZ, "standard_measurable_scope");
        Object reusableExtraParam = awemeRawAdLIZIZ.getReusableExtraParam(strLIZIZ);
        if ((reusableExtraParam instanceof Boolean) && (bool = (Boolean) reusableExtraParam) != null) {
            return bool.booleanValue();
        }
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            zIsAdTraffic2 = C587350N1x.LIZJ(aweme);
        } else {
            zIsAdTraffic2 = AwemeExtKt.isAdTraffic(aweme);
        }
        if (zIsAdTraffic2 && aweme.getAwemeType() == 0 && !C1017070cZd.LLIZLLLIL(aweme) && ((((Boolean) c01gw.getValue()).booleanValue() || !AwemeExtKt.isPseudoAd(aweme)) && !C0N2E.LIZ(aweme) && !C583160Mu2.LIZIZ(aweme) && !C1017070cZd.LJLJLJ(aweme) && !C1017070cZd.LLIIIZ(aweme))) {
            z = true;
        }
        awemeRawAdLIZIZ.addReusableExtraParam(strLIZIZ, Boolean.valueOf(z));
        return z;
    }

    @Override // X.C0N8J
    public final C0N23 LIZ(Object obj) {
        C0N23 c0n23LIZJ;
        Aweme aweme = (Aweme) obj;
        if (aweme == null || !LJ(aweme) || (c0n23LIZJ = LIZJ(aweme)) == null || ((ConcurrentHashMap) C585270MxR.LIZ).get(c0n23LIZJ) == null) {
            return null;
        }
        return c0n23LIZJ;
    }

    public final boolean LIZLLL(Object obj) {
        boolean zLJ = LJ((Aweme) obj);
        MeasurementDependencyModules.LIZ.getClass();
        C04TF.LIZ().isDebug();
        return zLJ;
    }

    public final void LJFF(Object obj) {
        Aweme aweme = (Aweme) obj;
        C0N23 c0n23LIZJ = LIZJ(aweme);
        if (c0n23LIZJ != null) {
            MeasurementDependencyModules.LIZ.getClass();
            C04TF.LIZ().isDebug();
            ((ConcurrentHashMap) C585270MxR.LIZ).put(c0n23LIZJ, aweme);
            C2264471DkD c2264471DkD = C2264471DkD.LIZ;
        }
    }

    @Override // X.C0N8J
    public final /* bridge */ /* synthetic */ C0N23 LIZIZ(Object obj, String str) {
        return null;
    }
}

package X;

import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N21, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N21 implements C0N8J {
    public static final /* synthetic */ int LIZ = 0;

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
        C0N23 c0n23 = new C0N23(aid, strLIZ, uniqueId) { // from class: X.0MxV
            public final String LIZJ;
            public final String LIZLLL;
            public final String LJ;
            public final String LJFF;
            public final String LJI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C585310MxV)) {
                    return false;
                }
                C585310MxV c585310MxV = (C585310MxV) obj;
                return Intrinsics.LJFF(this.LIZJ, c585310MxV.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c585310MxV.LIZLLL) && Intrinsics.LJFF(this.LJ, c585310MxV.LJ);
            }

            public final int hashCode() {
                return (((this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GeneralSearchMeasId(");
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
        AwemeRawAd awemeRawAdLIZIZ;
        Boolean bool;
        boolean z = false;
        if (!C584980Mwy.LIZ(aweme) || (awemeRawAdLIZIZ = C587350N1x.LIZIZ(aweme)) == null) {
            return false;
        }
        String strLIZIZ = C2088108Fz.LIZIZ(awemeRawAdLIZIZ, "general_search_measurable_scope");
        Object reusableExtraParam = awemeRawAdLIZIZ.getReusableExtraParam(strLIZIZ);
        if ((reusableExtraParam instanceof Boolean) && (bool = (Boolean) reusableExtraParam) != null) {
            return bool.booleanValue();
        }
        if (C584980Mwy.LIZ(aweme) && !AwemeExtKt.isSearchPreciseAd(aweme) && !C1010120cOQ.LJJIFFI(aweme) && aweme.getAwemeType() == 0 && !C1017070cZd.LLIZLLLIL(aweme) && ((((Boolean) C2264471DkD.LJIIIIZZ.getValue()).booleanValue() || !C1017070cZd.LJIIL(aweme)) && !C0N2E.LIZ(aweme) && !C583160Mu2.LIZIZ(aweme) && !C1017070cZd.LJLJLJ(aweme) && !C1017070cZd.LLIIIZ(aweme))) {
            z = true;
        }
        awemeRawAdLIZIZ.addReusableExtraParam(strLIZIZ, Boolean.valueOf(z));
        return z;
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
            ((ConcurrentHashMap) C585290MxT.LIZ).put(c0n23LIZJ, aweme);
        }
    }

    @Override // X.C0N8J
    /* JADX INFO: renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public final C0N23 LIZ(Aweme aweme) {
        C0N23 c0n23LIZJ;
        if (aweme == null || !LJ(aweme) || (c0n23LIZJ = LIZJ(aweme)) == null || ((ConcurrentHashMap) C585290MxT.LIZ).get(c0n23LIZJ) == null) {
            return null;
        }
        return c0n23LIZJ;
    }

    @Override // X.C0N8J
    public final /* bridge */ /* synthetic */ C0N23 LIZIZ(Object obj, String str) {
        return null;
    }
}

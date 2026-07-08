package X;

import com.bytedance.android.livesdk.livesetting.other.LiveSurveyFeaturesSetting;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0IxV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483390IxV implements InterfaceC483370IxT {
    public static final C483390IxV LIZ = new C483390IxV();
    public static final Keva LIZIZ = Keva.getRepo("repo_live_survey_feature");
    public static final List<InterfaceC483400IxW> LIZJ;
    public static final HashSet<String> LIZLLL;
    public static long LJ;
    public static final HashSet<Long> LJFF;
    public static long LJI;
    public static final HashSet<Long> LJII;
    public static long LJIIIIZZ;

    static {
        ArrayList arrayList = new ArrayList();
        LiveSurveyFeaturesSetting liveSurveyFeaturesSetting = LiveSurveyFeaturesSetting.INSTANCE;
        if (liveSurveyFeaturesSetting.enableGlobalSurvey()) {
            arrayList.add(C483440Ixa.LIZ);
        }
        if (liveSurveyFeaturesSetting.enableFullScreenSurvey()) {
            arrayList.add(C483420IxY.LIZ);
        }
        if (liveSurveyFeaturesSetting.enableLightSurvey()) {
            arrayList.add(C483430IxZ.LIZ);
        }
        LIZJ = arrayList;
        LIZLLL = new HashSet<>();
        LJFF = new HashSet<>();
        LJII = new HashSet<>();
    }

    public static final void LJIIIZ() {
        LJII.clear();
        LJIIIIZZ = 0L;
    }

    @Override // X.InterfaceC483370IxT
    public final void LIZ() {
        Iterator<InterfaceC483400IxW> it2 = LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    @Override // X.InterfaceC483370IxT
    public final Set<String> LJI() {
        return LIZLLL;
    }

    public static void LJIIIIZZ(long j) {
        LJI += j;
        LJIIIIZZ += j;
        Iterator it2 = ((ArrayList) LIZJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC483400IxW) it2.next()).LJ(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
    }

    @Override // X.InterfaceC483370IxT
    public final void LIZIZ(String str) {
        Iterator it2 = ((ArrayList) LIZJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC483400IxW) it2.next()).LIZIZ(str);
        }
    }

    @Override // X.InterfaceC483370IxT
    public final void LIZLLL(String str) {
        Iterator it2 = ((ArrayList) LIZJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC483400IxW) it2.next()).LIZLLL(str);
        }
    }

    @Override // X.InterfaceC483370IxT
    public final void LJ(String str) {
        LIZLLL.add(str);
    }

    @Override // X.InterfaceC483370IxT
    public final void LJFF(long j) {
        LJ += j;
    }

    @Override // X.InterfaceC483370IxT
    public final void LIZJ(long j, boolean z) {
        Iterator<InterfaceC483400IxW> it2 = LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT), z);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    @Override // X.InterfaceC483370IxT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> LJII(java.util.List<java.lang.String> r10, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends java.lang.Object> r11) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C483390IxV.LJII(java.util.List, kotlin.jvm.functions.Function1):java.util.Map");
    }
}

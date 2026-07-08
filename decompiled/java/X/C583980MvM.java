package X;

import com.ss.android.ugc.aweme.ab.DynamicPullStreamConfig;

/* JADX INFO: renamed from: X.0MvM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C583980MvM {
    public static final DynamicPullStreamConfig LIZ = new DynamicPullStreamConfig(0, 0, 0, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C583990MvN());

    public static DynamicPullStreamConfig LIZJ() {
        return (DynamicPullStreamConfig) LIZIZ.getValue();
    }

    public static final boolean LIZ() {
        return LIZJ().startType == 1 || LIZJ().startType == 3;
    }

    public static final boolean LIZIZ() {
        return LIZJ().startType == 2 || LIZJ().startType == 3;
    }
}

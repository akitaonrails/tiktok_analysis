package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;

/* JADX INFO: renamed from: X.0INd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465470INd {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public boolean LIZLLL;

    public C465470INd(LiveCoreSDKData.Quality quality) {
        String str = quality.name;
        String str2 = quality.sdkKey;
        Integer numValueOf = Integer.valueOf(quality.level);
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = numValueOf;
    }
}

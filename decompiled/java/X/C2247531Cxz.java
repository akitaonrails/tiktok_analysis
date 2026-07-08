package X;

import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;

/* JADX INFO: renamed from: X.1Cxz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2247531Cxz {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[DataSource.ScaleType.values().length];
        iArr[DataSource.ScaleType.ScaleToFill.ordinal()] = 1;
        iArr[DataSource.ScaleType.ScaleAspectFitCenter.ordinal()] = 2;
        iArr[DataSource.ScaleType.ScaleAspectFill.ordinal()] = 3;
        iArr[DataSource.ScaleType.TopFill.ordinal()] = 4;
        iArr[DataSource.ScaleType.BottomFill.ordinal()] = 5;
        iArr[DataSource.ScaleType.LeftFill.ordinal()] = 6;
        iArr[DataSource.ScaleType.RightFill.ordinal()] = 7;
        iArr[DataSource.ScaleType.TopFit.ordinal()] = 8;
        iArr[DataSource.ScaleType.BottomFit.ordinal()] = 9;
        iArr[DataSource.ScaleType.LeftFit.ordinal()] = 10;
        iArr[DataSource.ScaleType.RightFit.ordinal()] = 11;
        LIZ = iArr;
    }
}

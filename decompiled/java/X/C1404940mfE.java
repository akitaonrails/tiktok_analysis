package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.StoryUploadPageEntranceType;

/* JADX INFO: renamed from: X.0mfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404940mfE {

    @C040H
    public final CreativeInfo LIZ;

    @C040H
    public final int LIZIZ;

    @C040H
    public final String LIZJ;

    @C040H
    public final String LIZLLL;

    @C040H
    public final String LJ;

    @C040H
    public StoryUploadPageEntranceType LJFF;

    @C040H
    public String LJI;

    public C1404940mfE(CreativeInfo creativeInfo, int i, String str, String str2, String str3, int i2) {
        i = (i2 & 2) != 0 ? -1 : i;
        str = (i2 & 4) != 0 ? "" : str;
        str2 = (i2 & 8) != 0 ? "" : str2;
        str3 = (i2 & 16) != 0 ? "" : str3;
        this.LIZ = creativeInfo;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = null;
        this.LJI = null;
    }
}

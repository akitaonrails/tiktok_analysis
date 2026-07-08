package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0oPD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471890oPD {
    public final int LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final Float LJI;
    public final Float LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final Boolean LJIIJJI;

    public final String toString() {
        StringBuilder sb = new StringBuilder("DubbedInfoModel{mediaType=");
        sb.append(this.LIZ);
        sb.append(", bitrate=");
        sb.append(this.LIZLLL);
        sb.append(", languageCode=");
        sb.append(this.LJ);
        sb.append(", infoId=");
        sb.append(this.LJFF);
        sb.append(", loudness=");
        sb.append(this.LJI);
        sb.append(", peak=");
        sb.append(this.LJII);
        sb.append(", fileKey=");
        sb.append(this.LJIIIIZZ);
        sb.append(", format=");
        sb.append(this.LJIIIZ);
        sb.append(", volumeInfo=");
        sb.append(this.LJIIJ);
        sb.append(", isDubbedAudio=");
        sb.append(this.LJIIJJI);
        sb.append(", url=");
        sb.append(this.LIZIZ);
        sb.append(", playUrls=");
        List<String> list = this.LIZJ;
        sb.append(list != null ? C13LP.LJJLIIIJ(list, null, null, null, 0, null, new Function1() { // from class: X.0oPE
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ",";
            }
        }, 31) : null);
        sb.append('}');
        return sb.toString();
    }

    public C1471890oPD(int i, String str, List<String> list, Integer num, String str2, int i2, Float f, Float f2, String str3, String str4, String str5, Boolean bool) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = num;
        this.LJ = str2;
        this.LJFF = i2;
        this.LJI = f;
        this.LJII = f2;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = str4;
        this.LJIIJ = str5;
        this.LJIIJJI = bool;
    }
}

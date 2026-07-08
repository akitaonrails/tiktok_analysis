package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0VcM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801520VcM {
    public long LIZ;
    public String LIZIZ;
    public long LIZJ;
    public String LIZLLL;
    public String LJ;
    public EnumC1527250pqV LJFF;
    public long LJI;
    public byte[] LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadItem{id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", syncId='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", business=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", did='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", uid='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", bucket=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", data=");
        sbLIZ.append(Arrays.toString(this.LJII));
        sbLIZ.append(", md5='");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append('\'');
        sbLIZ.append(", msg_id='");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

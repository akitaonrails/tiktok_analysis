package X;

import com.tencent.wcdb.database.SQLiteConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Zk3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908210Zk3 {
    public long LIZ;
    public long LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public ArrayList<Object> LJ;
    public boolean LJFF;
    public Exception LJI;
    public int LJII;
    public int LJIIIIZZ;

    static {
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    }

    public final void LIZ(StringBuilder sb) {
        String str;
        sb.append(this.LIZJ);
        if (this.LJFF) {
            sb.append(" took ");
            sb.append(this.LIZIZ - this.LIZ);
            sb.append("ms");
        } else {
            sb.append(" started ");
            sb.append(System.currentTimeMillis() - this.LIZ);
            sb.append("ms ago");
        }
        sb.append(" - ");
        if (!this.LJFF) {
            str = "running";
        } else if (this.LJI != null) {
            str = "failed";
        } else {
            str = "succeeded";
        }
        sb.append(str);
        if (this.LIZLLL != null) {
            sb.append(", sql=\"");
            sb.append(SQLiteConnection.LJIIZILJ.matcher(this.LIZLLL).replaceAll(" "));
            sb.append("\"");
        }
        if (this.LJIIIIZZ > 0) {
            sb.append(", tid=");
            sb.append(this.LJIIIIZZ);
        }
        Exception exc = this.LJI;
        if (exc != null && exc.getMessage() != null) {
            sb.append(", exception=\"");
            sb.append(this.LJI.getMessage());
            sb.append("\"");
        }
    }
}

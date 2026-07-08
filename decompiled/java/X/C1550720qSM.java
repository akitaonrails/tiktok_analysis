package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0qSM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550720qSM {
    public long LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public int LJ;
    public final boolean LJFF;

    public C1550720qSM(long j, String str, int i) {
        String str2;
        if ((i & 4) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        str = (i & 8) != 0 ? CardStruct.IStatusCode.DEFAULT : str;
        this.LIZ = j;
        this.LIZIZ = false;
        this.LIZJ = str2;
        this.LIZLLL = str;
        this.LJ = 0;
        this.LJFF = false;
    }
}

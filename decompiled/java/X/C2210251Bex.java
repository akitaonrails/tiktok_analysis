package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1Bex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2210251Bex {
    public final /* synthetic */ C2209891BeN LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ long LIZJ;

    public /* synthetic */ C2210251Bex(C2209891BeN c2209891BeN, int i, long j) {
        this.LIZ = c2209891BeN;
        this.LIZIZ = i;
        this.LIZJ = j;
    }

    public final List LIZ(List list) {
        C2209891BeN c2209891BeN = this.LIZ;
        int i = this.LIZIZ;
        long j = this.LIZJ;
        c2209891BeN.getClass();
        ArrayList<C2209881BeM> arrayList = (ArrayList) list;
        for (C2209881BeM c2209881BeM : arrayList) {
            c2209881BeM.LJJII();
            c2209881BeM.LLLL = true;
        }
        arrayList.removeAll(c2209891BeN.LJIIJ(i, j, list).LIZ);
        return list;
    }
}

package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0jtv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1298730jtv {
    public final int LIZ;
    public final String LIZIZ;
    public final EnumC1298710jtt LIZJ;
    public InterfaceC1311410kEN LIZLLL;
    public long LJ = System.currentTimeMillis();
    public long LJFF;

    public ArrayList<Object> LIZ() {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(this.LIZIZ);
        arrayList.add(Integer.valueOf(this.LIZJ.ordinal()));
        arrayList.add(Integer.valueOf(this.LIZ));
        arrayList.add(Long.valueOf(this.LJ));
        arrayList.add(Long.valueOf(this.LJFF));
        return arrayList;
    }

    public C1298730jtv(int i, String str, EnumC1298710jtt enumC1298710jtt) {
        this.LIZ = -1;
        this.LIZIZ = "";
        this.LIZJ = EnumC1298710jtt.kNone;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = enumC1298710jtt;
    }
}

package X;

/* JADX INFO: renamed from: X.12yr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19932712yr implements Comparable<C19932712yr> {
    public final Object LL;
    public final InterfaceC19930912yZ LLILLJJLI;
    public final C19939112zt LLILLL;

    @Override // java.lang.Comparable
    public final int compareTo(C19932712yr c19932712yr) {
        Object field;
        C19939112zt c19939112zt;
        C19939112zt c19939112zt2;
        C19932712yr c19932712yr2 = c19932712yr;
        InterfaceC19930912yZ interfaceC19930912yZ = this.LLILLJJLI;
        Object field2 = null;
        if (interfaceC19930912yZ != null && (c19939112zt2 = this.LLILLL) != null) {
            field = interfaceC19930912yZ.getField(c19939112zt2);
        } else {
            field = null;
        }
        InterfaceC19930912yZ interfaceC19930912yZ2 = c19932712yr2.LLILLJJLI;
        if (interfaceC19930912yZ2 != null && (c19939112zt = c19932712yr2.LLILLL) != null) {
            field2 = interfaceC19930912yZ2.getField(c19939112zt);
        }
        if (field == null) {
            if (field2 != null) {
                return -1;
            }
            return 0;
        }
        if (field2 == null) {
            return 1;
        }
        int i = C19937912zh.LIZ[this.LLILLL.LJIJJ().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return ((String) field).compareTo((String) field2);
                    }
                    return 0;
                }
                return ((Integer) field).compareTo((Integer) field2);
            }
            return ((Long) field).compareTo((Long) field2);
        }
        return ((Boolean) field).compareTo((Boolean) field2);
    }

    public C19932712yr(C19939112zt c19939112zt, Object obj) {
        if (obj instanceof InterfaceC19930912yZ) {
            this.LLILLJJLI = (InterfaceC19930912yZ) obj;
        } else {
            this.LL = obj;
        }
        this.LLILLL = c19939112zt.LJIJJLI().LJIIZILJ("key");
    }
}

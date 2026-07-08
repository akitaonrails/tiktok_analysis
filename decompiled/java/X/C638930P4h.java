package X;

/* JADX INFO: renamed from: X.0P4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C638930P4h implements C0XTR {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C0XTR
    public final void onResult(int i, int i2, Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, i, i2, obj);
                break;
            case 1:
                onResult$1(this, i, i2, obj);
                break;
        }
    }

    public C638930P4h(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onResult$0(C638930P4h c638930P4h, int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            ((C632290Or5) c638930P4h.l0).LIZLLL((InterfaceC602360Nju) c638930P4h.l1);
        }
    }

    public static final void onResult$1(C638930P4h c638930P4h, int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            ((C634800Ov8) c638930P4h.l0).LIZLLL((InterfaceC634810Ov9) c638930P4h.l1);
        }
    }
}

package X;

/* JADX INFO: renamed from: X.0kxS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339360kxS implements InterfaceC1143790fs1 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1143790fs1
    public final void onFinish(boolean z) {
        switch (this.$t) {
            case 0:
                onFinish$0(this, z);
                break;
            case 1:
                onFinish$1(this, z);
                break;
            case 2:
                onFinish$2(this, z);
                break;
        }
    }

    public C1339360kxS(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFinish$0(C1339360kxS c1339360kxS, boolean z) {
        if (!z) {
            ((C1337410kuJ) c1339360kxS.l0).LJII = false;
            C20441214yg.LJ("WeakContainerComponent", "Failed to load LOP weak container lottie");
        } else {
            ((C1337410kuJ) c1339360kxS.l0).LJII = true;
        }
    }

    public static final void onFinish$1(C1339360kxS c1339360kxS, boolean z) {
        if (!z) {
            ((C1337420kuK) c1339360kxS.l0).LJII = false;
            C20441214yg.LJ("WeakContainerComponent", "Failed to load LOP weak container lottie");
        } else {
            ((C1337420kuK) c1339360kxS.l0).LJII = true;
        }
    }

    public static final void onFinish$2(C1339360kxS c1339360kxS, boolean z) {
        if (!z) {
            ((C1337400kuI) c1339360kxS.l0).LJII = false;
            C20441214yg.LJ("WeakContainerComponent", "Failed to load LOP weak container lottie");
        } else {
            ((C1337400kuI) c1339360kxS.l0).LJII = true;
        }
    }
}

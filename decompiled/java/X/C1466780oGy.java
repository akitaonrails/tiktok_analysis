package X;

/* JADX INFO: renamed from: X.0oGy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466780oGy implements C092O {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.C092O
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(C1466780oGy c1466780oGy, Object obj) {
        ((C1409900mnE) c1466780oGy.l0).LLLLIL().LIZ.invoke(Boolean.valueOf(c1466780oGy.z1));
        ((C1409900mnE) c1466780oGy.l0).getClass();
    }

    public static final void accept$1(C1466780oGy c1466780oGy, Object obj) {
        ((C1421180n5Q) c1466780oGy.l0).LLLLIL().LIZ.invoke(Boolean.valueOf(c1466780oGy.z1));
    }

    public static final void accept$2(C1466780oGy c1466780oGy, Object obj) {
        C1453280nvC c1453280nvC = (C1453280nvC) c1466780oGy.l0;
        c1453280nvC.LLJJJ = false;
        if (!c1466780oGy.z1) {
            C19A3 c19a3 = (C19A3) c1453280nvC.mParentScene;
            if (c19a3 != null) {
                c19a3.hide(c1453280nvC);
            }
            C1456140nzo.LIZIZ(((C1453280nvC) c1466780oGy.l0).LLLIL(), true, false, false, false, 12);
            ((C1453280nvC) c1466780oGy.l0).LLLIL().vW1().setValue(C1452730nuJ.LIZ());
        }
    }

    public C1466780oGy(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}

package X;

import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoModeLastImageHintAssem;

/* JADX INFO: renamed from: X.0Sye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C738900Sye implements InterfaceC21641019mi {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void LIZIZ$0(C738900Sye c738900Sye, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    public static final void LIZIZ$1(C738900Sye c738900Sye, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    public static final void LIZIZ$2(C738900Sye c738900Sye, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    @Override // X.InterfaceC21641019mi
    public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, interfaceC1844880y6o);
                break;
            case 1:
                LIZ$1(this, interfaceC1844880y6o);
                break;
            case 2:
                LIZ$2(this, interfaceC1844880y6o);
                break;
        }
    }

    @Override // X.InterfaceC21641019mi
    public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, interfaceC1844880y6o);
                break;
            case 1:
                LIZIZ$1(this, interfaceC1844880y6o);
                break;
            case 2:
                LIZIZ$2(this, interfaceC1844880y6o);
                break;
        }
    }

    public static final void LIZ$0(C738900Sye c738900Sye, InterfaceC1844880y6o interfaceC1844880y6o) {
        C786410Ut5.LLLLLLZ((C12P4) c738900Sye.l0, 8);
        ((PhotoModeLastImageHintAssem) c738900Sye.l1).ip().RQ2(false);
    }

    public static final void LIZ$1(C738900Sye c738900Sye, InterfaceC1844880y6o interfaceC1844880y6o) {
        ((C21647019ng) c738900Sye.l0).LJI(true);
        ((C21647019ng) c738900Sye.l1).LJI(true);
    }

    public static final void LIZ$2(C738900Sye c738900Sye, InterfaceC1844880y6o interfaceC1844880y6o) {
        C786410Ut5.LLLLLLZ((C12P4) c738900Sye.l0, 8);
        ((PhotoModeLastImageHintAssem) c738900Sye.l1).ip().RQ2(false);
    }

    public C738900Sye(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

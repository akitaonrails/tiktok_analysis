package X;

import com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521950KdV implements InterfaceC1585190rLx {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1585190rLx
    public final void p1(String str, String str2) {
        switch (this.$t) {
            case 0:
                p1$0(this, str, str2);
                break;
            case 1:
                p1$1(this, str, str2);
                break;
            case 2:
                p1$2(this, str, str2);
                break;
        }
    }

    public C521950KdV(LiveIconGenerator liveIconGenerator, int i) {
        this.$t = i;
        this.l0 = liveIconGenerator;
    }

    public static final void p1$0(C521950KdV c521950KdV, String str, String str2) {
        InterfaceC486260J5c interfaceC486260J5c;
        InterfaceC486260J5c interfaceC486260J5c2 = ((LiveIconGenerator) c521950KdV.l0).LLJI;
        if (interfaceC486260J5c2 != null) {
            C0J5V c0j5v = (C0J5V) interfaceC486260J5c2;
            if (str2 != null) {
                c0j5v.LLIZLLLIL = str2;
                if (!Intrinsics.LJFF(str2, "HOME")) {
                    C0J71 c0j71 = c0j5v.LLILZIL;
                    if (c0j71 != null) {
                        c0j71.LLZZ();
                    }
                    C0J71 c0j712 = c0j5v.LLILZIL;
                    if (c0j712 != null) {
                        c0j712.LIZIZ(c0j5v.LLJI);
                    }
                    c0j5v.LLILZIL = null;
                }
            }
        }
        if (Intrinsics.LJFF(str2, "HOME") && (interfaceC486260J5c = ((LiveIconGenerator) c521950KdV.l0).LLJI) != null) {
            ((C0J5V) interfaceC486260J5c).LJIIIZ();
        }
    }

    public static final void p1$1(C521950KdV c521950KdV, String str, String str2) {
        C0J5C c0j5c = ((LiveIconGenerator) c521950KdV.l0).LLJIJIL;
        if (c0j5c != null) {
            C0J58 c0j58 = (C0J58) c0j5c;
            c0j58.LLILZIL = str2;
            if (!Intrinsics.LJFF(str2, "HOME")) {
                C0J71 c0j71 = c0j58.LLJILJILJ;
                if (c0j71 != null) {
                    c0j71.LLZZ();
                }
                C0J71 c0j712 = c0j58.LLJILJILJ;
                if (c0j712 != null) {
                    c0j712.LIZIZ(c0j58.LLJILJIL);
                }
                c0j58.LLJILJILJ = null;
            }
        }
    }

    public static final void p1$2(C521950KdV c521950KdV, String str, String str2) {
        C0J5H c0j5h = ((LiveIconGenerator) c521950KdV.l0).LLJILJIL;
        if (c0j5h != null) {
            c0j5h.LJII = str2;
            if (!Intrinsics.LJFF(str2, "HOME")) {
                C0J71 c0j71 = c0j5h.LIZLLL;
                if (c0j71 != null) {
                    c0j71.LLZZ();
                }
                c0j5h.LIZLLL = null;
                C0J71 c0j712 = c0j5h.LJI;
                if (c0j712 != null) {
                    c0j712.LLZZ();
                }
                c0j5h.LJI = null;
                return;
            }
            if (str == null || Intrinsics.LJFF(str, "HOME")) {
                return;
            }
            c0j5h.LJ();
        }
    }
}

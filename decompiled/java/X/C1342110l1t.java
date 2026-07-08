package X;

import android.content.Context;
import com.bytedance.lighten.loader.SmartImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0l1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342110l1t {
    public final SmartImageView LIZ;
    public final SmartImageView LIZIZ;
    public boolean LIZLLL;
    public final List<C21647019ng> LIZJ = new ArrayList();
    public final C01GW LJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(1));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(2));

    public C1342110l1t(SmartImageView smartImageView, C0GZN c0gzn) {
        this.LIZ = smartImageView;
        this.LIZIZ = c0gzn;
    }

    public static Pair LIZ(final SmartImageView smartImageView, final SmartImageView smartImageView2, C0HU6 c0hu6, C0HU6 c0hu62, long j) {
        Context context = smartImageView.getContext();
        EnumC19746112Nn enumC19746112Nn = EnumC19746112Nn.SPRING;
        C21647019ng c21647019ng = new C21647019ng(context, smartImageView, new C19746312Np(enumC19746112Nn, c0hu6, C1697810uHb.LJIIJJI(new C19746412Nq("scaleX", new C0HIW(1.0f, 0.8f)), new C19746412Nq("scaleY", new C0HIX(1.0f, 0.8f)), new C19746412Nq("rotationY", new C07Y0(0.0f, 90.0f)))), false);
        final C21647019ng c21647019ng2 = new C21647019ng(smartImageView2.getContext(), smartImageView2, new C19746312Np(enumC19746112Nn, c0hu62, C1697810uHb.LJIIJJI(new C19746412Nq("scaleX", new C0HIW(0.8f, 1.0f)), new C19746412Nq("scaleY", new C0HIX(0.8f, 1.0f)), new C19746412Nq("rotationY", new C07Y0(90.0f, 0.0f)))), false);
        c21647019ng.LIZJ("rotationY", new InterfaceC21641019mi() { // from class: X.0l1s
            @Override // X.InterfaceC21641019mi
            public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
            }

            @Override // X.InterfaceC21641019mi
            public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                C786410Ut5.LJLLLLLL(8, smartImageView);
                C786410Ut5.LJLLLLLL(0, smartImageView2);
                c21647019ng2.LJI(true);
            }
        });
        c21647019ng.LIZLLL(j);
        return new Pair(c21647019ng, c21647019ng2);
    }
}

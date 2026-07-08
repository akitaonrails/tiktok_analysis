package X;

import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1A6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174131A6x {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIILJJIL;
    public final C1807680x8o LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 31));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 22));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 26));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 24));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS577S0100000_33(this, 25));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 23));
    public volatile C1807840x94 LJII;
    public volatile C1A72 LJIIIIZZ;
    public volatile C2174121A6w LJIIIZ;
    public volatile C2174151A6z LJIIJ;
    public volatile C1A74 LJIIJJI;
    public volatile C2174141A6y LJIIL;
    public volatile C1A70 LJIILIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C2174131A6x.class, "commonKnitFactory", "getCommonKnitFactory()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/di/IMEditCommonComponent$Factory;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C2174131A6x.class, "editorKnitFactory", "getEditorKnitFactory()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/editor/IMEditEditorKnitComponent$Factory;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C2174131A6x.class, "toolbarKnitFactory", "getToolbarKnitFactory()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/toolbar/IMEditToolbarKnitComponent$Factory;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C2174131A6x.class, "visibilityCommKnitFactory", "getVisibilityCommKnitFactory()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/panel/IMEditVisibilityCommKnitComponent$Factory;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C2174131A6x.class, "filterKnitFactory", "getFilterKnitFactory()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/filter/IMEditFilterKnitComponent$Factory;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C2174131A6x.class, "gestureKnitFactory", "getGestureKnitFactory()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/gesture/IMEditGestureKnitComponent$Factory;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C2174131A6x.class, "exitAndSendKnitFactory", "getExitAndSendKnitFactory()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/exit/IMEditExitAndSendKnitComponent$Factory;", 0);
        c09r3.getClass();
        LJIILJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    public final C1807840x94 LIZ() {
        C1807840x94 c1807840x94 = this.LJII;
        if (c1807840x94 == null) {
            synchronized (this) {
                c1807840x94 = this.LJII;
                if (c1807840x94 == null) {
                    C1807840x94 c1807840x942 = new C1807840x94(this.LIZ);
                    this.LJII = c1807840x942;
                    return c1807840x942;
                }
            }
        }
        return c1807840x94;
    }

    public final C2174141A6y LIZIZ() {
        C2174141A6y c2174141A6y = this.LJIIL;
        if (c2174141A6y == null) {
            synchronized (this) {
                c2174141A6y = this.LJIIL;
                if (c2174141A6y == null) {
                    C2174141A6y c2174141A6y2 = new C2174141A6y(LIZ());
                    this.LJIIL = c2174141A6y2;
                    return c2174141A6y2;
                }
            }
        }
        return c2174141A6y;
    }

    public final C2174151A6z LIZJ() {
        C2174151A6z c2174151A6z = this.LJIIJ;
        if (c2174151A6z == null) {
            synchronized (this) {
                c2174151A6z = this.LJIIJ;
                if (c2174151A6z == null) {
                    C2174151A6z c2174151A6z2 = new C2174151A6z();
                    this.LJIIJ = c2174151A6z2;
                    return c2174151A6z2;
                }
            }
        }
        return c2174151A6z;
    }

    public C2174131A6x(C1807680x8o c1807680x8o) {
        this.LIZ = c1807680x8o;
    }
}

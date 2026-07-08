package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0YDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870600YDi extends AbstractC866690XzH<InterfaceC870610YDj> implements InterfaceC870610YDj {
    public final String LLILLL;
    public final int[] LLILZ;
    public final int LLILZIL;
    public final List<C869590Y9l> LLILZLL;
    public final boolean LLIZ;
    public volatile InterfaceC870610YDj LLIZLLLIL;
    public volatile C0YED LLJ;

    @Override // X.InterfaceC870610YDj
    public final void LJI() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("unregister"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJI();
        }
    }

    @Override // X.InterfaceC870610YDj
    public final void LJII() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("initMessageList"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJII();
        }
    }

    @Override // X.InterfaceC870610YDj
    public final List<C869590Y9l> LJIIIIZZ() {
        ArrayList arrayList = new ArrayList();
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMessageListSync"));
        return c0yedLIZIZ != null ? LLLJ(c0yedLIZIZ).LJIIIIZZ() : arrayList;
    }

    @Override // X.InterfaceC870610YDj
    public final void LJJIII() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("loadOlderMessageList"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJJIII();
        }
    }

    @Override // X.InterfaceC870610YDj
    public final void LJJJI() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("loadNewerMessageList"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJJJI();
        }
    }

    @Override // X.InterfaceC870610YDj
    public final void LJJJIL(InterfaceC868420Y4y interfaceC868420Y4y) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("register"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJJJIL(interfaceC868420Y4y);
        }
    }

    @Override // X.AbstractC866690XzH
    public final InterfaceC870610YDj LLLJ(C0YED c0yed) {
        InterfaceC870610YDj interfaceC870610YDj = this.LLIZLLLIL;
        if (interfaceC870610YDj != null && this.LLJ == c0yed) {
            return interfaceC870610YDj;
        }
        InterfaceC870610YDj interfaceC870610YDjLJIIIZ = c0yed.LJIJI().LJIIIZ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ);
        this.LLIZLLLIL = interfaceC870610YDjLJIIIZ;
        this.LLJ = c0yed;
        return interfaceC870610YDjLJIIIZ;
    }

    public C870600YDi(C0YEF c0yef, String str, int[] iArr, int i, List list, boolean z) {
        super(c0yef, "MsgBrowserModelProxy");
        this.LLILLL = str;
        this.LLILZ = iArr;
        this.LLILZIL = i;
        this.LLILZLL = list;
        this.LLIZ = z;
    }
}

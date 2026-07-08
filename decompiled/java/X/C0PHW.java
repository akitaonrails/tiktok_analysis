package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0PHW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PHW extends C0PHY<C0PHW> {
    public final String LIZ;
    public final C0PHT LIZIZ;
    public final C0PHX LIZJ;
    public C0PHW LIZLLL;
    public C0PHW LJ;
    public C0PHW LJFF;

    public final C0PHW LIZJ() {
        C0PHX c0phxLIZLLL = this.LIZJ.LIZLLL();
        c0phxLIZLLL.LJ();
        List<C0PHW> list = c0phxLIZLLL.LJIIJJI;
        C0PHX c0phx = this.LIZJ;
        c0phx.LJ();
        return (C0PHW) ListProtector.get(list, ((ArrayList) c0phx.LJIIJJI).indexOf(this));
    }

    public final Aweme LIZLLL() {
        Object obj;
        HashMap<String, Object> map;
        HashMap<String, Object> map2;
        C0PHX c0phx = this.LIZJ;
        c0phx.LJ();
        String str = c0phx.LJIIIZ;
        C0P7A c0p7a = this.LIZIZ.LJIIIZ;
        String str2 = this.LIZ;
        C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(Aweme.class));
        Object obj2 = null;
        if (c640970PCd == null || (map2 = c640970PCd.LIZIZ) == null) {
            obj = null;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(str);
            obj = map2.get(C2188811AlT.LIZIZ(sbLIZ));
        }
        Aweme aweme = (Aweme) obj;
        if (aweme != null) {
            return aweme;
        }
        C0PHX c0phx2 = this.LIZJ;
        C0P7A c0p7a2 = c0phx2.LIZ.LJIIIZ;
        c0phx2.LJ();
        String str3 = c0phx2.LJIIIZ;
        C640970PCd c640970PCd2 = c0p7a2.LIZ.get(C13LE.LIZ(Aweme.class));
        if (c640970PCd2 != null && (map = c640970PCd2.LIZ) != null) {
            obj2 = map.get(str3);
        }
        return (Aweme) obj2;
    }

    public final C0PHW LJ() {
        Object obj;
        HashMap<String, Object> map;
        HashMap<String, Object> map2;
        C0PHX c0phx = this.LIZJ;
        c0phx.LJ();
        String str = c0phx.LJIIIZ;
        C0P7A c0p7a = this.LIZIZ.LJIIIZ;
        String str2 = this.LIZ;
        C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(C0PHW.class));
        Object obj2 = null;
        if (c640970PCd == null || (map2 = c640970PCd.LIZIZ) == null) {
            obj = null;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(str);
            obj = map2.get(C2188811AlT.LIZIZ(sbLIZ));
        }
        C0PHW c0phw = (C0PHW) obj;
        if (c0phw != null) {
            return c0phw;
        }
        C0PHX c0phx2 = this.LIZJ;
        C0P7A c0p7a2 = c0phx2.LIZ.LJIIIZ;
        c0phx2.LJ();
        String str3 = c0phx2.LJIIIZ;
        C640970PCd c640970PCd2 = c0p7a2.LIZ.get(C13LE.LIZ(C0PHW.class));
        if (c640970PCd2 != null && (map = c640970PCd2.LIZ) != null) {
            obj2 = map.get(str3);
        }
        return (C0PHW) obj2;
    }

    public final C0PHW LJFF() {
        Object obj;
        HashMap<String, Object> map;
        HashMap<String, Object> map2;
        C0PHX c0phx = this.LIZJ;
        c0phx.LJ();
        String str = c0phx.LJIIIZ;
        C0P7A c0p7a = this.LIZIZ.LJIIIZ;
        String str2 = this.LIZ;
        C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(C0PHW.class));
        Object obj2 = null;
        if (c640970PCd == null || (map2 = c640970PCd.LIZIZ) == null) {
            obj = null;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(str);
            obj = map2.get(C2188811AlT.LIZIZ(sbLIZ));
        }
        C0PHW c0phw = (C0PHW) obj;
        if (c0phw != null) {
            return c0phw;
        }
        C0PHX c0phx2 = this.LIZJ;
        C0P7A c0p7a2 = c0phx2.LIZ.LJIIIZ;
        c0phx2.LJ();
        String str3 = c0phx2.LJIIIZ;
        C640970PCd c640970PCd2 = c0p7a2.LIZ.get(C13LE.LIZ(C0PHW.class));
        if (c640970PCd2 != null && (map = c640970PCd2.LIZ) != null) {
            obj2 = map.get(str3);
        }
        return (C0PHW) obj2;
    }

    @Override // X.C0PHY
    /* JADX INFO: renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public final C0PHW LIZ() {
        C0PHW c0phw;
        C0PHW c0phw2 = this.LIZLLL;
        if (c0phw2 != null) {
            return c0phw2;
        }
        C0PHX c0phx = this.LIZJ;
        if (c0phx == null) {
            return null;
        }
        while (true) {
            c0phx = c0phx.LIZLLL;
            if (c0phx == null) {
                return null;
            }
            c0phx.LJ();
            List<C0PHW> list = c0phx.LJIIJJI;
            if (list != null && (c0phw = (C0PHW) C13LP.LJJJLL(list)) != null) {
                return c0phw;
            }
        }
    }

    @Override // X.C0PHY
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final C0PHW LIZIZ() {
        C0PHW c0phw;
        C0PHW c0phw2 = this.LJ;
        if (c0phw2 != null) {
            return c0phw2;
        }
        C0PHX c0phx = this.LIZJ;
        if (c0phx == null) {
            return null;
        }
        while (true) {
            c0phx = c0phx.LJ;
            if (c0phx == null) {
                return null;
            }
            c0phx.LJ();
            List<C0PHW> list = c0phx.LJIIJJI;
            if (list != null && (c0phw = (C0PHW) C13LP.LJJLIIIJL(list)) != null) {
                return c0phw;
            }
        }
    }

    public final void LJIIIIZZ(C0PHW c0phw) {
        C0PHX c0phx = this.LIZJ;
        c0phx.LJ();
        String str = c0phx.LJIIIZ;
        C0P7A c0p7a = this.LIZIZ.LJIIIZ;
        String str2 = this.LIZ;
        C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(C0PHW.class));
        if (c640970PCd == null) {
            c640970PCd = new C640970PCd();
            c0p7a.LIZ.put(C13LE.LIZ(C0PHW.class), c640970PCd);
        }
        if (c0phw == null) {
            HashMap<String, Object> map = c640970PCd.LIZIZ;
            if (map != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(str);
                map.remove(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        HashMap<String, Object> map2 = c640970PCd.LIZIZ;
        if (map2 == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append(str);
        map2.put(C2188811AlT.LIZIZ(sbLIZ2), c0phw);
    }

    public final void LJIIIZ(C0PHW c0phw) {
        C0PHX c0phx = this.LIZJ;
        c0phx.LJ();
        String str = c0phx.LJIIIZ;
        C0P7A c0p7a = this.LIZIZ.LJIIIZ;
        String str2 = this.LIZ;
        C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(C0PHW.class));
        if (c640970PCd == null) {
            c640970PCd = new C640970PCd();
            c0p7a.LIZ.put(C13LE.LIZ(C0PHW.class), c640970PCd);
        }
        if (c0phw == null) {
            HashMap<String, Object> map = c640970PCd.LIZIZ;
            if (map != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(str);
                map.remove(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        HashMap<String, Object> map2 = c640970PCd.LIZIZ;
        if (map2 == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append(str);
        map2.put(C2188811AlT.LIZIZ(sbLIZ2), c0phw);
    }

    public C0PHW(String str, C0PHT c0pht, C0PHX c0phx) {
        this.LIZ = str;
        this.LIZIZ = c0pht;
        this.LIZJ = c0phx;
    }
}

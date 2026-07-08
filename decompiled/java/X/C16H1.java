package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.16H1, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16H1 extends AbstractC1552040qUU {
    public final int $t;

    @Override // X.AbstractC1552040qUU
    public final void LJI(int i, Throwable th, Map map) {
        switch (this.$t) {
            case 0:
                LJI$0(this, i, th, map);
                break;
            case 1:
                LJI$1(this, i, th, map);
                break;
            default:
                super.LJI(i, th, map);
                break;
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJII(Throwable th, Map map) {
        switch (this.$t) {
            case 0:
                LJII$0(this, th, map);
                break;
            case 1:
                LJII$1(this, th, map);
                break;
            default:
                super.LJII(th, map);
                break;
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIIIZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2, C1551680qTu c1551680qTu) {
        switch (this.$t) {
            case 0:
                LJIIIZ$0(this, map, map2, c1551680qTu);
                break;
            case 1:
                LJIIIZ$1(this, map, map2, c1551680qTu);
                break;
            default:
                super.LJIIIZ(map, map2, c1551680qTu);
                break;
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
        if (this.$t != 0) {
            super.LJIJ(updatePackage, th);
        } else {
            LJIJ$0(this, updatePackage, th);
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIL(long j, UpdatePackage updatePackage) {
        switch (this.$t) {
            case 0:
                LJIL$0(this, j, updatePackage);
                break;
            case 1:
                LJIL$1(this, j, updatePackage);
                break;
            default:
                super.LJIL(j, updatePackage);
                break;
        }
    }

    public C16H1(int i) {
        this.$t = i;
    }

    public static final void LJII$0(C16H1 c16h1, Throwable th, Map map) {
        String string;
        C20573515ev.LJIIJJI = false;
        C20573515ev c20573515ev = C20573515ev.LIZ;
        if (th == null || (string = th.toString()) == null) {
            string = "";
        }
        c20573515ev.getClass();
        C20573515ev.LIZ(0, string);
    }

    public static final void LJII$1(C16H1 c16h1, Throwable th, Map map) {
        String string;
        C20573515ev.LJFF = false;
        C20573515ev c20573515ev = C20573515ev.LIZ;
        if (th == null || (string = th.toString()) == null) {
            string = "";
        }
        c20573515ev.getClass();
        C20573515ev.LIZ(0, string);
    }

    public static final void LJIJ$0(C16H1 c16h1, UpdatePackage updatePackage, Throwable th) {
        String string;
        C20573515ev c20573515ev = C20573515ev.LIZ;
        if (th == null || (string = th.toString()) == null) {
            string = "";
        }
        c20573515ev.getClass();
        C20573515ev.LIZ(0, string);
    }

    public static final void LJIL$0(C16H1 c16h1, long j, UpdatePackage updatePackage) {
        String channel;
        C20573515ev c20573515ev = C20573515ev.LIZ;
        if (updatePackage == null || (channel = updatePackage.getChannel()) == null) {
            channel = "live_normal";
        }
        long j2 = C20573515ev.LJIIIZ;
        c20573515ev.getClass();
        C20573515ev.LIZJ(channel, j2, "onCheckServerVersionSuccess", true, false);
    }

    public static final void LJIL$1(C16H1 c16h1, long j, UpdatePackage updatePackage) {
        boolean z;
        if (updatePackage != null) {
            if (!TextUtils.isEmpty(updatePackage.getChannel())) {
                ArrayList<String> arrayList = C20573515ev.LJII;
                if (arrayList != null) {
                    arrayList.remove(updatePackage.getChannel());
                }
                C20573515ev c20573515ev = C20573515ev.LIZ;
                String channel = updatePackage.getChannel();
                if (channel == null) {
                    channel = "";
                }
                ArrayList<String> arrayList2 = C20573515ev.LJII;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    z = false;
                } else {
                    z = true;
                }
                long j2 = C20573515ev.LIZLLL;
                c20573515ev.getClass();
                C20573515ev.LIZJ(channel, j2, "onUpdateSuccess", false, z);
            }
            ArrayList<String> arrayList3 = C20573515ev.LJII;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                C20573515ev.LJI = null;
                C20573515ev.LJ = true;
            }
        }
    }

    public static final void LJI$0(C16H1 c16h1, int i, Throwable th, Map map) {
        if (i == 601) {
            C20573515ev.LJIIJJI = false;
        }
        C20573515ev c20573515ev = C20573515ev.LIZ;
        String string = th.toString();
        if (string == null) {
            string = "";
        }
        c20573515ev.getClass();
        C20573515ev.LIZ(i, string);
    }

    public static final void LJI$1(C16H1 c16h1, int i, Throwable th, Map map) {
        if (i == 601) {
            C20573515ev.LJFF = false;
        }
        C20573515ev c20573515ev = C20573515ev.LIZ;
        String string = th.toString();
        if (string == null) {
            string = "";
        }
        c20573515ev.getClass();
        C20573515ev.LIZ(i, string);
    }

    public static final void LJIIIZ$0(C16H1 c16h1, Map map, Map map2, C1551680qTu c1551680qTu) {
        if (((HashMap) map2).isEmpty()) {
            C20573515ev c20573515ev = C20573515ev.LIZ;
            long j = C20573515ev.LJIIIZ;
            c20573515ev.getClass();
            C20573515ev.LIZJ("live_normal", j, "onCheckServerVersionSuccess", true, true);
            C20573515ev.LJIIJ = true;
            return;
        }
        C20573515ev.LJIIL = c1551680qTu;
    }

    public static final void LJIIIZ$1(C16H1 c16h1, Map map, Map map2, C1551680qTu c1551680qTu) {
        String string;
        if (((HashMap) map2).isEmpty()) {
            C20573515ev c20573515ev = C20573515ev.LIZ;
            ArrayList<String> arrayList = C20573515ev.LJII;
            if (arrayList == null || (string = arrayList.toString()) == null) {
                string = "";
            }
            long j = C20573515ev.LIZLLL;
            c20573515ev.getClass();
            C20573515ev.LIZJ(string, j, "onCheckServerVersionSuccess", true, true);
            C20573515ev.LJ = true;
            ArrayList<String> arrayList2 = C20573515ev.LJII;
            if (arrayList2 != null) {
                arrayList2.clear();
                return;
            }
            return;
        }
        C20573515ev.LJI = c1551680qTu;
    }
}

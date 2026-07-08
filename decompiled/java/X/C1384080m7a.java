package X;

import com.ss.android.ugc.aweme.repo.DanmakuStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1384080m7a {
    public static final C1384080m7a LIZ = new C1384080m7a();

    public static C1384300m7w LIZ() {
        C1384300m7w c1384300m7w = new C1384300m7w();
        c1384300m7w.LJFF = C1384840m8o.LIZ ? 20005 : 20002;
        c1384300m7w.LJIILIIL = EnumC1384130m7f.NORMAL;
        c1384300m7w.LJ = 1001;
        return c1384300m7w;
    }

    public static C1384300m7w LIZIZ(DanmakuStruct danmakuStruct) {
        long diggCount;
        C1384300m7w c1384300m7wLIZ = LIZ();
        c1384300m7wLIZ.t1(danmakuStruct.getDanmakuID());
        c1384300m7wLIZ.LJIILIIL = EnumC1384130m7f.NORMAL;
        c1384300m7wLIZ.LIZIZ = danmakuStruct.getText();
        String itemId = danmakuStruct.getItemId();
        if (itemId == null) {
            itemId = "";
        }
        c1384300m7wLIZ.LJIJ = itemId;
        c1384300m7wLIZ.LIZLLL = danmakuStruct.getOffsetTime();
        c1384300m7wLIZ.LJIIZILJ = danmakuStruct.getUserId();
        boolean zLJFF = Intrinsics.LJFF(danmakuStruct.getUserId(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        if (zLJFF != c1384300m7wLIZ.LJIILJJIL) {
            c1384300m7wLIZ.LJIILJJIL = zLJFF;
            c1384300m7wLIZ.LJIIJ = true;
        }
        if (danmakuStruct.getHasDigged() && ((int) danmakuStruct.getDiggCount()) <= 0) {
            diggCount = 1;
        } else {
            diggCount = danmakuStruct.getDiggCount();
        }
        c1384300m7wLIZ.LJIIL = diggCount;
        c1384300m7wLIZ.LJJI = danmakuStruct.getHasDigged();
        return c1384300m7wLIZ;
    }

    public static C1384300m7w LIZJ(C1361010lWN c1361010lWN) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1384300m7w c1384300m7wLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fake_");
        sbLIZ.append(jCurrentTimeMillis);
        c1384300m7wLIZ.t1(C2188811AlT.LIZIZ(sbLIZ));
        c1384300m7wLIZ.LJIILIIL = EnumC1384130m7f.NORMAL;
        c1384300m7wLIZ.LIZJ = jCurrentTimeMillis;
        c1384300m7wLIZ.LIZIZ = c1361010lWN.LIZJ;
        String aid = c1361010lWN.LIZ.getAid();
        if (aid == null) {
            aid = "";
        }
        c1384300m7wLIZ.LJIJ = aid;
        c1384300m7wLIZ.LJIIZILJ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (true != c1384300m7wLIZ.LJIILJJIL) {
            c1384300m7wLIZ.LJIILJJIL = true;
            c1384300m7wLIZ.LJIIJ = true;
        }
        c1384300m7wLIZ.LIZLLL = c1361010lWN.LIZIZ;
        return c1384300m7wLIZ;
    }
}

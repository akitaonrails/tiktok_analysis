package X;

import Y.AfS156S0200000_21;
import Y.AfS190S0100000_21;
import Y.AkS327S0200000_21;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.model.IDanmakuData;
import com.ss.android.ugc.aweme.repo.DanmakuApi;
import com.ss.android.ugc.aweme.repo.DanmakuDeleteResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS305S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0m7F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383870m7F {
    public final Aweme LIZ;
    public final DanmakuApi LIZIZ;
    public final String LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public final Map<IDanmakuData, C1361030lWP> LJFF = new LinkedHashMap();
    public final List<IDanmakuData> LJI = new ArrayList();
    public final List<C1383960m7O> LJII = new ArrayList();
    public final AFwS305S0000000_21 LJIIIIZZ = AFwS305S0000000_21.get$arr$(73);
    public final List<C1383950m7N> LJIIIZ = new ArrayList();
    public long LJIIJ = -1;
    public final String LJIIJJI;
    public final long LJIIL;
    public C1383920m7K LJIILIIL;
    public final C1383920m7K LJIILJJIL;
    public final C11NJ LJIILL;

    public static void LIZ(IDanmakuData iDanmakuData) {
        C009F c009f;
        String strX1 = iDanmakuData.x1();
        if (strX1 != null) {
            DanmakuApi danmakuApi = DanmakuApi.LIZ;
            String aid = iDanmakuData.getAid();
            if (iDanmakuData.u1()) {
                c009f = C009F.DIGG;
            } else {
                c009f = C009F.UNDIGG;
            }
            danmakuApi.getClass();
            DanmakuApi.LIZIZ.diggDanmaku(aid, strX1, c009f.ordinal()).LJL(C11S5.LIZ()).LJJLJ();
        }
    }

    public final void LIZLLL(IDanmakuData iDanmakuData) {
        C1383960m7O next;
        List<IDanmakuData> list;
        List<IDanmakuData> list2;
        Iterator<C1383960m7O> it2 = this.LJII.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C1383960m7O c1383960m7O = next;
                long j = c1383960m7O.LIZ;
                long j2 = c1383960m7O.LIZIZ;
                long jY1 = iDanmakuData.y1();
                if (j <= jY1 && jY1 < j2) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1383960m7O c1383960m7O2 = next;
        if (c1383960m7O2 != null && (list = c1383960m7O2.LIZJ) != null) {
            int i = 0;
            for (IDanmakuData iDanmakuData2 : list) {
                if (!Intrinsics.LJFF(iDanmakuData, iDanmakuData2) && !Intrinsics.LJFF(iDanmakuData2.x1(), iDanmakuData.x1())) {
                    i++;
                } else {
                    if (i >= 0) {
                        if (c1383960m7O2 != null && (list2 = c1383960m7O2.LIZJ) != null) {
                            ListProtector.remove(list2, i);
                        }
                        this.LIZLLL = true;
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void LIZIZ(IDanmakuData iDanmakuData, InterfaceC1383970m7P interfaceC1383970m7P) {
        EnumC1997007s0 enumC1997007s0;
        C11NZ c11nzLJJJJZ;
        if (iDanmakuData.q1()) {
            enumC1997007s0 = EnumC1997007s0.DANMAKU_AUTHOR;
        } else {
            enumC1997007s0 = EnumC1997007s0.VIDEO_AUTHOR;
        }
        String strX1 = iDanmakuData.x1();
        if (strX1 != null && strX1.length() > 0 && !a0.LJJIIZI(strX1, "fake_", false)) {
            DanmakuApi danmakuApi = this.LIZIZ;
            int value = enumC1997007s0.getValue();
            danmakuApi.getClass();
            c11nzLJJJJZ = DanmakuApi.LIZIZ.deleteDanmaku(strX1, value);
        } else if (((LinkedHashMap) this.LJFF).get(iDanmakuData) != null) {
            ((ArrayList) this.LJI).add(iDanmakuData);
            c11nzLJJJJZ = C11NZ.LJIJJLI((InterfaceC1478005qU) ((LinkedHashMap) this.LJFF).get(iDanmakuData)).LJJJ(new AkS327S0200000_21(enumC1997007s0, this, 4), false);
        } else {
            DanmakuDeleteResponse danmakuDeleteResponse = new DanmakuDeleteResponse();
            danmakuDeleteResponse.status_code = 1;
            c11nzLJJJJZ = C11NZ.LJJJJZ(danmakuDeleteResponse);
        }
        LIZLLL(iDanmakuData);
        this.LJIILL.LIZ(c11nzLJJJJZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS190S0100000_21(interfaceC1383970m7P, 22)));
    }

    public final C11JN LJ(C1361010lWN c1361010lWN, IDanmakuData iDanmakuData) {
        DanmakuApi.LIZ.getClass();
        return DanmakuApi.LIZIZ.createDanmaku(c1361010lWN.LIZ.getAid(), c1361010lWN.LIZIZ, c1361010lWN.LIZJ.toString(), c1361010lWN.LIZLLL).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIL(new AfS156S0200000_21(this, iDanmakuData, 20)).LJJIJIIJI(new AfS156S0200000_21(this, iDanmakuData, 21)).LJJIJIIJIL(new AfS156S0200000_21(this, iDanmakuData, 22));
    }

    public C1383870m7F(Aweme aweme, DanmakuApi danmakuApi, String str) {
        long duration;
        Video video;
        String aid;
        this.LIZ = aweme;
        this.LIZIZ = danmakuApi;
        this.LIZJ = str;
        this.LJIIJJI = (aweme == null || (aid = aweme.getAid()) == null) ? "" : aid;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            duration = video.getDuration();
        } else {
            duration = 0;
        }
        this.LJIIL = Math.max(duration, 0L);
        ArrayList arrayList = new ArrayList();
        EnumC1384040m7W enumC1384040m7W = EnumC1384040m7W.RESET;
        this.LJIILIIL = new C1383920m7K(arrayList, enumC1384040m7W);
        this.LJIILJJIL = new C1383920m7K(new ArrayList(), enumC1384040m7W);
        this.LJIILL = new C11NJ();
    }

    public final void LIZJ(final long j, final boolean z, final boolean z2) {
        final long j2;
        long j3;
        long j4 = this.LJ;
        if (j4 <= 0) {
            j2 = 0;
        } else {
            j2 = j - (j % j4);
        }
        for (C1383950m7N c1383950m7N : (ArrayList) this.LJIIIZ) {
            long j5 = c1383950m7N.LIZ;
            if (j2 < c1383950m7N.LIZIZ && j5 <= j2) {
                return;
            }
        }
        long j6 = this.LJ;
        if (j6 > 0) {
            j3 = j6 + j2;
        } else {
            j3 = Long.MAX_VALUE;
        }
        final C1383950m7N c1383950m7N2 = new C1383950m7N(j2, j3);
        ((ArrayList) this.LJIIIZ).add(c1383950m7N2);
        DanmakuApi danmakuApi = this.LIZIZ;
        String str = this.LJIIJJI;
        danmakuApi.getClass();
        this.LJIILL.LIZ(DanmakuApi.LIZIZ.getDanmaku(str, j2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJI(new AfS156S0200000_21(this, c1383950m7N2, 18)).LJJLJLI(new C09JN() { // from class: X.0m7G
            /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r22) {
                /*
                    Method dump skipped, instruction units count: 370
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1383880m7G.accept(java.lang.Object):void");
            }
        }));
    }
}

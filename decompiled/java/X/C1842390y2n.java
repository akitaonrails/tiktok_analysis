package X;

import com.bytedance.android.livesdk.livesetting.rank.LiveRankEntranceSplitSetting;
import com.bytedance.android.livesdk.model.message.RankUpdate;
import com.bytedance.android.livesdk.model.message.RankUpdateMessage;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3Response;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS236S0300000_27;

/* JADX INFO: renamed from: X.0y2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842390y2n {
    public final DataChannel LIZ;
    public final InterfaceC1842850y3X LIZIZ;
    public InterfaceC1842800y3S LIZLLL;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public String LJIIJ;
    public final C1842970y3j LIZJ = new Object() { // from class: X.0y3j
    };
    public final List<C1842380y2m> LJ = new ArrayList();
    public final List<C1842380y2m> LJFF = new ArrayList();
    public final List<C1842380y2m> LJI = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r6 = this;
            java.util.List<X.0y2m> r0 = r6.LJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r5 = r0.iterator()
        L8:
            boolean r0 = r5.hasNext()
            r3 = 1
            if (r0 == 0) goto L67
            java.lang.Object r2 = r5.next()
            X.0y2m r2 = (X.C1842380y2m) r2
            X.0xEo r0 = r2.LIZIZ
            int[] r1 = X.C1811410xEp.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r3) goto L64
            r4 = 2
            if (r1 == r4) goto L61
            r0 = 3
            if (r1 == r0) goto L2e
            r0 = 4
            if (r1 == r0) goto L2e
            r0 = 5
            if (r1 == r0) goto L2e
            goto L8
        L2e:
            java.util.List<X.0y2q> r0 = r2.LIZJ
            java.util.Iterator r2 = r0.iterator()
        L34:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8
            java.lang.Object r0 = r2.next()
            X.0y2q r0 = (X.C1842420y2q) r0
            X.0xEq r1 = X.EnumC1811400xEo.Companion
            X.0xDD r0 = r0.LIZ
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = r0.LIZIZ
            int r0 = r0.group_type
            r1.getClass()
            X.0xEo r0 = X.C1811420xEq.LIZ(r0)
            int[] r1 = X.C1811410xEp.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r3) goto L5e
            if (r0 != r4) goto L34
            r6.LJIIIIZZ = r3
            goto L34
        L5e:
            r6.LJII = r3
            goto L34
        L61:
            r6.LJIIIIZZ = r3
            goto L8
        L64:
            r6.LJII = r3
            goto L8
        L67:
            X.0y3S r0 = r6.LIZLLL
            if (r0 == 0) goto L84
            boolean r1 = r6.LJIIIZ
            boolean r2 = r6.LJII
            if (r2 != 0) goto Lac
            boolean r0 = r6.LJIIIIZZ
            if (r0 != 0) goto Lac
            r0 = 0
        L76:
            if (r1 == r0) goto Laa
            r1 = 1
        L79:
            if (r2 != 0) goto L80
            boolean r0 = r6.LJIIIIZZ
            if (r0 != 0) goto L80
            r3 = 0
        L80:
            r6.LJIIIZ = r3
            if (r1 == 0) goto L98
        L84:
            X.0y3j r2 = r6.LIZJ
            boolean r1 = r6.LJII
            boolean r0 = r6.LJIIIIZZ
            r2.getClass()
            if (r1 != 0) goto La4
            if (r0 != 0) goto La4
            X.0y2o r0 = new X.0y2o
            r0.<init>()
        L96:
            r6.LIZLLL = r0
        L98:
            X.0y3S r2 = r6.LIZLLL
            if (r2 == 0) goto La3
            java.util.List<X.0y2m> r1 = r6.LJ
            java.util.List<X.0y2m> r0 = r6.LJFF
            r2.LIZ(r1, r0)
        La3:
            return
        La4:
            X.0y2p r0 = new X.0y2p
            r0.<init>(r1)
            goto L96
        Laa:
            r1 = 0
            goto L79
        Lac:
            r0 = 1
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1842390y2n.LIZJ():void");
    }

    public final void LIZIZ(RankUpdateMessage rankUpdateMessage) {
        C20441214yg.LIZIZ("Ranking Entrance Unification", "handleGeneralUpdateEntranceInfoIM");
        C20441214yg.LIZIZ("Ranking Entrance Unification", "handleIMForUnifiedEntrance");
        Object obj = null;
        int i = 0;
        if (LiveRankEntranceSplitSetting.INSTANCE.isSplitEnabled()) {
            List<RankUpdate> list = rankUpdateMessage.updates;
            if (list != null && !list.isEmpty()) {
                Iterator<RankUpdate> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next().rankType == RankTypeV2.LJJIIJZLJL.type) {
                        Iterator it3 = ((ArrayList) this.LJ).iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Object next = it3.next();
                            if (((C1842380y2m) next).LIZIZ == EnumC1811400xEo.ENTRANCE2) {
                                obj = next;
                                break;
                            }
                        }
                        C1842380y2m c1842380y2m = (C1842380y2m) obj;
                        if (c1842380y2m != null) {
                            c1842380y2m.LJ(rankUpdateMessage);
                            return;
                        }
                        return;
                    }
                }
            }
            Iterator it4 = ((ArrayList) this.LJ).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next2 = it4.next();
                if (((C1842380y2m) next2).LIZIZ == EnumC1811400xEo.ENTRANCE1) {
                    obj = next2;
                    break;
                }
            }
            C1842380y2m c1842380y2m2 = (C1842380y2m) obj;
            if (c1842380y2m2 == null) {
                return;
            }
            c1842380y2m2.LJ(rankUpdateMessage);
            return;
        }
        for (Object obj2 : (ArrayList) this.LJ) {
            int i2 = i + 1;
            if (i >= 0) {
                ((C1842380y2m) obj2).LJ(rankUpdateMessage);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0y3j] */
    public C1842390y2n(DataChannel dataChannel, InterfaceC1842850y3X interfaceC1842850y3X) {
        String str;
        this.LIZ = dataChannel;
        this.LIZIZ = interfaceC1842850y3X;
        String str2 = "";
        this.LJIIJ = "";
        if (dataChannel != null && (str = (String) dataChannel.gg0(C1082810eHf.class)) != null) {
            str2 = str;
        }
        this.LJIIJ = str2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, X.0y2m] */
    public static final void LIZ(C1842390y2n c1842390y2n, EnumC1811400xEo enumC1811400xEo, List<RankEntranceV3Response.EntranceGroup> list) {
        C259800zU c259800zU = new C259800zU();
        C1809330xBT.LIZ(c1842390y2n.LJ, new AwS236S0300000_27(enumC1811400xEo, (EnumC1811400xEo) c259800zU, (C259800zU<C1842380y2m>) list, (List<RankEntranceV3Response.EntranceGroup>) 34));
        if (c259800zU.element == 0) {
            ?? c1842380y2m = new C1842380y2m();
            c259800zU.element = c1842380y2m;
            c1842380y2m.LIZJ(enumC1811400xEo, list);
        }
        T t = c259800zU.element;
        if (t != 0) {
            ((ArrayList) c1842390y2n.LJ).add(t);
        }
    }
}

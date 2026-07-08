package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkReceiveEnlargeMessageEvent;
import com.bytedance.android.live.liveinteract.api.ZoomedPositionsUpdateEvent;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aSQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935720aSQ implements InterfaceC945510aiD {
    public final DataChannel LIZ;
    public final Function2<List<C935810aSZ>, List<C935770aSV>, Unit> LIZIZ;
    public final int LIZJ = 1;
    public final Function2<Long, String, Unit> LIZLLL;
    public final InterfaceC302401Fe LJ;
    public final InterfaceC927510aFB LJFF;
    public final C01GW LJI;

    @Override // X.InterfaceC945510aiD
    public final void LIZ() {
        List<C935770aSV> arrayList;
        LinkPlayerInfo linkPlayerInfo;
        User user;
        LinkPlayerInfo linkPlayerInfo2;
        User user2;
        LinkPlayerInfo linkPlayerInfo3;
        User user3;
        Function2<List<C935810aSZ>, List<C935770aSV>, Unit> function2 = this.LIZIZ;
        List<C935810aSZ> listLIZJ = LIZJ();
        if (this.LJFF == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            InterfaceC302401Fe interfaceC302401Fe = this.LJ;
            AbstractC928510aGn abstractC928510aGnLIZ = interfaceC302401Fe != null ? interfaceC302401Fe.LIZ() : null;
            C918060Zzw.LIZ.getClass();
            long id = 0;
            if (C918060Zzw.LIZ(true)) {
                List<PosIdentity> listLIZIZ = this.LJFF.LIZIZ();
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
                for (PosIdentity posIdentity : listLIZIZ) {
                    arrayList2.add(posIdentity.type == 1 ? new C935770aSV((abstractC928510aGnLIZ == null || (linkPlayerInfo3 = (LinkPlayerInfo) abstractC928510aGnLIZ.LJFF(posIdentity.value)) == null || (user3 = linkPlayerInfo3.mUser) == null) ? 0L : user3.getId(), posIdentity.value) : new C935770aSV(0L, posIdentity.value));
                }
                arrayList = new ArrayList<>(arrayList2);
            } else {
                String strLJIILIIL = this.LJFF.LJIILIIL();
                if (strLJIILIIL != null) {
                    C935770aSV[] c935770aSVArr = new C935770aSV[1];
                    c935770aSVArr[0] = new C935770aSV((abstractC928510aGnLIZ == null || (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ.LJFF(strLJIILIIL)) == null || (user = linkPlayerInfo.mUser) == null) ? 0L : user.getId(), strLJIILIIL);
                    arrayList = C1697810uHb.LJIILJJIL(c935770aSVArr);
                } else {
                    arrayList = new ArrayList<>();
                }
            }
            String strLJIILL = this.LJFF.LJIILL();
            if (strLJIILL != null && this.LJFF.LJIL(strLJIILL) != EnumC920250a3T.CAN_ZOOM_TO_MAX) {
                Iterator<C935770aSV> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C935770aSV next = it2.next();
                    if (Intrinsics.LJFF(next.LIZIZ, strLJIILL)) {
                        if (next == null) {
                            break;
                        }
                    }
                }
                if (abstractC928510aGnLIZ != null && (linkPlayerInfo2 = (LinkPlayerInfo) abstractC928510aGnLIZ.LJFF(strLJIILL)) != null && (user2 = linkPlayerInfo2.mUser) != null) {
                    id = user2.getId();
                }
                arrayList.add(new C935770aSV(id, strLJIILL));
            }
        }
        function2.invoke(listLIZJ, arrayList);
    }

    @Override // X.InterfaceC945510aiD
    public final List<C935810aSZ> LIZJ() {
        AbstractC928510aGn abstractC928510aGnLIZ;
        List<LinkPlayerInfo> listLJJIII;
        Map<Long, Long> mapLIZIZ;
        Long l;
        InterfaceC302401Fe interfaceC302401Fe = this.LJ;
        if (interfaceC302401Fe == null || (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) == null || (listLJJIII = abstractC928510aGnLIZ.LJJIII()) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJIII, 10));
        for (LinkPlayerInfo linkPlayerInfo : listLJJIII) {
            InterfaceC938250aWV interfaceC938250aWVLIZ = C927810aFf.LIZ();
            arrayList.add(new C935810aSZ(linkPlayerInfo, (interfaceC938250aWVLIZ == null || (mapLIZIZ = ((C941600abu) interfaceC938250aWVLIZ).LIZIZ()) == null || (l = mapLIZIZ.get(Long.valueOf(linkPlayerInfo.mUser.getId()))) == null) ? 0L : l.longValue()));
        }
        return arrayList;
    }

    @Override // X.InterfaceC945510aiD
    public final void onCreate() {
        InterfaceC302401Fe interfaceC302401Fe = this.LJ;
        if (interfaceC302401Fe != null) {
            interfaceC302401Fe.LJJIJIL((C935730aSR) this.LJI.getValue());
        }
        DataChannel dataChannel = this.LIZ;
        dataChannel.CQ2(LinkReceiveEnlargeMessageEvent.class, this, new C935750aST(this));
        dataChannel.CQ2(ZoomedPositionsUpdateEvent.class, this, new C935740aSS(this));
        System.currentTimeMillis();
    }

    @Override // X.InterfaceC945510aiD
    public final void onDestroy() {
        InterfaceC302401Fe interfaceC302401Fe = this.LJ;
        if (interfaceC302401Fe != null) {
            interfaceC302401Fe.LJJIIJ((C935730aSR) this.LJI.getValue());
        }
        this.LIZ.zQ2(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        X.C766270U4b.LJIIJJI(X.C497740JfY.LJIJI(2131853914));
        r2 = r6.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        r2.invoke(-3L, "Up to 2 spots can be expanded at the same time");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        return true;
     */
    @Override // X.InterfaceC945510aiD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(java.util.List<X.C935770aSV> r7) {
        /*
            r6 = this;
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            boolean r0 = r7.isEmpty()
            r5 = 0
            if (r0 == 0) goto La
            return r5
        La:
            X.0Zzw r0 = X.C918060Zzw.LIZ
            r0.getClass()
            r4 = 1
            boolean r0 = X.C918060Zzw.LIZ(r4)
            if (r0 == 0) goto L6a
            X.0aFB r0 = r6.LJFF
            if (r0 == 0) goto L20
            java.util.List r2 = r0.LIZIZ()
            if (r2 != 0) goto L22
        L20:
            X.13BV r2 = X.C13BV.INSTANCE
        L22:
            java.lang.Object r0 = X.C13LP.LJJJLL(r7)
            X.0aSV r0 = (X.C935770aSV) r0
            r3 = 0
            if (r0 == 0) goto L2d
            java.lang.String r3 = r0.LIZIZ
        L2d:
            int r1 = r2.size()
            int r0 = r6.LIZJ
            if (r1 <= r0) goto L6a
            java.util.Iterator r2 = r2.iterator()
        L39:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r1 = r2.next()
            r0 = r1
            tikcast.linkmic.common.PosIdentity r0 = (tikcast.linkmic.common.PosIdentity) r0
            java.lang.String r0 = r0.value
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L39
            if (r1 != 0) goto L6a
        L50:
            r0 = 2131853914(0x7f11825a, float:1.9341488E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            X.C766270U4b.LJIIJJI(r0)
            kotlin.jvm.functions.Function2<java.lang.Long, java.lang.String, kotlin.Unit> r2 = r6.LIZLLL
            if (r2 == 0) goto L69
            r0 = -3
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "Up to 2 spots can be expanded at the same time"
            r2.invoke(r1, r0)
        L69:
            return r4
        L6a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C935720aSQ.LIZIZ(java.util.List):boolean");
    }

    public C935720aSQ(DataChannel dataChannel, C945470ai9 c945470ai9, Function2 function2) {
        InterfaceC302401Fe interfaceC302401Fe;
        this.LIZ = dataChannel;
        this.LIZIZ = c945470ai9;
        this.LIZLLL = function2;
        C948450amx c948450amx = C948450amx.LIZIZ;
        Object objLJIIIZ = c948450amx.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (objLJIIIZ instanceof InterfaceC302401Fe) {
            interfaceC302401Fe = (InterfaceC302401Fe) objLJIIIZ;
        } else {
            interfaceC302401Fe = null;
        }
        this.LJ = interfaceC302401Fe;
        Object objLJIIIZ2 = c948450amx.LJIIIZ("ZOOM_SERVICE");
        this.LJFF = objLJIIIZ2 instanceof InterfaceC927510aFB ? (InterfaceC927510aFB) objLJIIIZ2 : null;
        this.LJI = C452501pT.LIZIZ(new C935760aSU(this));
    }
}

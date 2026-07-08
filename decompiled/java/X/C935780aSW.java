package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aSW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935780aSW implements InterfaceC945510aiD {
    public final Function2<List<C935810aSZ>, List<C935770aSV>, Unit> LIZ;
    public final InterfaceC302401Fe LIZIZ;
    public final C01GW LIZJ;

    @Override // X.InterfaceC945510aiD
    public final boolean LIZIZ(List<C935770aSV> list) {
        return false;
    }

    @Override // X.InterfaceC945510aiD
    public final void LIZ() {
        this.LIZ.invoke(LIZJ(), C13BV.INSTANCE);
    }

    @Override // X.InterfaceC945510aiD
    public final List<C935810aSZ> LIZJ() {
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        InterfaceC302401Fe interfaceC302401Fe = this.LIZIZ;
        if (interfaceC302401Fe == null || (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) == null || (listLJJIII = abstractC928510aGnLIZ.LJJIII()) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList<LinkPlayerInfo> arrayList = new ArrayList();
        for (Object obj : listLJJIII) {
            User user = ((LinkPlayerInfo) obj).mUser;
            Long lValueOf = user != null ? Long.valueOf(user.getId()) : null;
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (!Intrinsics.LJFF(lValueOf, (room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) ? null : Long.valueOf(room.getOwnerUserId()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (LinkPlayerInfo linkPlayerInfo : arrayList) {
            InterfaceC938250aWV interfaceC938250aWVLIZ = C927810aFf.LIZ();
            arrayList2.add(new C935810aSZ(linkPlayerInfo, interfaceC938250aWVLIZ != null ? ((C941600abu) interfaceC938250aWVLIZ).LIZLLL(linkPlayerInfo.mUser.getId()) : 0L));
        }
        return arrayList2;
    }

    @Override // X.InterfaceC945510aiD
    public final void onCreate() {
        InterfaceC302401Fe interfaceC302401Fe = this.LIZIZ;
        if (interfaceC302401Fe != null) {
            interfaceC302401Fe.LJJIJIL((C935790aSX) this.LIZJ.getValue());
        }
    }

    @Override // X.InterfaceC945510aiD
    public final void onDestroy() {
        InterfaceC302401Fe interfaceC302401Fe = this.LIZIZ;
        if (interfaceC302401Fe != null) {
            interfaceC302401Fe.LJJIIJ((C935790aSX) this.LIZJ.getValue());
        }
    }

    public C935780aSW(C945480aiA c945480aiA) {
        InterfaceC302401Fe interfaceC302401Fe;
        this.LIZ = c945480aiA;
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (objLJIIIZ instanceof InterfaceC302401Fe) {
            interfaceC302401Fe = (InterfaceC302401Fe) objLJIIIZ;
        } else {
            interfaceC302401Fe = null;
        }
        this.LIZIZ = interfaceC302401Fe;
        this.LIZJ = C452501pT.LIZIZ(new C935800aSY(this));
    }
}

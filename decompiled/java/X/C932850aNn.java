package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.receiverselection.SendTargetSelectionDialog;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0aNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.receiverselection.SendTargetSelectionDialog$onCreate$1", f = "SendTargetSelectionDialog.kt", l = {}, m = "invokeSuspend")
public final class C932850aNn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SendTargetSelectionDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C932850aNn(SendTargetSelectionDialog sendTargetSelectionDialog, InterfaceC1364105Vn<? super C932850aNn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sendTargetSelectionDialog;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C932850aNn(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        User owner;
        Long lValueOf;
        InterfaceC2262081DgM currentUser;
        InterfaceC2262081DgM currentUser2;
        C1C7U.LIZ("SendTargetSelectionDialog@19e7.onCreate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C923380a8W> listLJIIIIZZ = C1128450fTH.LJIIIIZZ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIIIZZ, 10));
        for (C923380a8W c923380a8W : listLJIIIIZZ) {
            IInteractService iInteractService = C1128450fTH.LIZ;
            User userPt1 = C1128450fTH.LIZ.Pt1(C2286608xc.LJFF(c923380a8W.LIZ));
            if (userPt1 == null) {
                userPt1 = new User();
                userPt1.setId(c923380a8W.LIZ);
                userPt1.setIdStr(String.valueOf(c923380a8W.LIZ));
                String str = c923380a8W.LIZLLL;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                userPt1.setNickName(str);
                String str3 = c923380a8W.LJFF;
                if (str3 != null) {
                    str2 = str3;
                }
                userPt1.setDisplayId(str2);
                userPt1.setAvatarThumb(c923380a8W.LJ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fallback cohost guest user for gift selector, uid=");
                sbLIZ.append(c923380a8W.LIZ);
                sbLIZ.append(", roomId=");
                sbLIZ.append(c923380a8W.LIZJ);
                sbLIZ.append(", linkmicId=");
                sbLIZ.append(c923380a8W.LIZIZ);
                C20441214yg.LJIIL("SendTargetSelectionDialog", C2188811AlT.LIZIZ(sbLIZ));
            }
            arrayList.add(userPt1);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LL.dataChannel);
        Object obj2 = null;
        if (roomLJJLIIIIJ == null || (owner = roomLJJLIIIIJ.getOwner()) == null) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room roomLJJLI = C500260Jjc.LJJLI();
            if (roomLJJLI != null) {
                owner = roomLJJLI.getOwner();
            } else {
                owner = null;
            }
        }
        SendTargetSelectionDialog sendTargetSelectionDialog = this.LL;
        IInteractService iInteractService2 = C1128450fTH.LIZ;
        sendTargetSelectionDialog.LLILZIL = C1128450fTH.LJJ(sendTargetSelectionDialog.dataChannel);
        if (owner == null) {
            C20441214yg.LJ("SendTargetSelectionDialog", "currentAnchor is null ");
            this.LL.dismiss();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SendTargetSelectionDialog@19e7.onCreate$1");
            return unit;
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser == null || (currentUser2 = interfaceC500940JkiUser.getCurrentUser()) == null || currentUser2.getId() != owner.getId()) {
            arrayList2.add(owner);
        }
        this.LL.LLILZ = C2286608xc.LJFF(owner.getId());
        if (!arrayList2.isEmpty()) {
            SendTargetSelectionDialog sendTargetSelectionDialog2 = this.LL;
            sendTargetSelectionDialog2.getClass();
            InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
            if (interfaceC500940JkiUser2 != null && (currentUser = interfaceC500940JkiUser2.getCurrentUser()) != null) {
                lValueOf = Long.valueOf(currentUser.getId());
            } else {
                lValueOf = null;
            }
            List listLJJJJLI = C13LP.LJJJJLI(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : (ArrayList) listLJJJJLI) {
                long id = ((User) obj3).getId();
                if (lValueOf == null || id != lValueOf.longValue()) {
                    arrayList3.add(obj3);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                long id2 = ((User) next).getId();
                Long l = sendTargetSelectionDialog2.LLILZ;
                if (l != null && id2 == l.longValue()) {
                    obj2 = next;
                    if (next != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            if (obj4 != obj2) {
                                arrayList4.add(obj4);
                            }
                        }
                        arrayList3 = arrayList4;
                    }
                }
            }
            ArrayList arrayList5 = new ArrayList(arrayList3.size() + 1);
            if (obj2 != null) {
                arrayList5.add(obj2);
            }
            arrayList5.addAll(arrayList3);
            sendTargetSelectionDialog2.LLILLL = arrayList5;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SendTargetSelectionDialog@19e7.onCreate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

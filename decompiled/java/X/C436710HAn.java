package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem$showVideoRain$1$3$1$1$1$1$onPlayEnd$1", f = "EasterEggForShareAssem.kt", l = {}, m = "invokeSuspend")
public final class C436710HAn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EasterEggForShareAssem LL;
    public final /* synthetic */ List<C0NPA> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436710HAn(EasterEggForShareAssem easterEggForShareAssem, List<C0NPA> list, InterfaceC1364105Vn<? super C436710HAn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = easterEggForShareAssem;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436710HAn(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        List<C0VNS> listLJI;
        C1C7U.LIZ("EasterEggForShareAssem@d88a.showVideoRain$1$3$1$1$1$1$onPlayEnd$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SessionInfo sessionInfoJo = this.LL.Jo();
        if (sessionInfoJo != null) {
            List<C0NPA> list = this.LLILLJJLI;
            EasterEggForShareAssem easterEggForShareAssem = this.LL;
            IRecentGidsService iRecentGidsService = (IRecentGidsService) PluggableExtentionKt.pluggableSpi$default(IRecentGidsService.class, false, false, false, 14, null);
            if (iRecentGidsService != null && (listLJI = iRecentGidsService.LJI()) != null) {
                arrayList = new ArrayList();
                Iterator<C0VNS> it2 = listLJI.iterator();
                while (it2.hasNext()) {
                    String str = it2.next().LIZ;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C0NPA> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().LIZLLL);
            }
            boolean z = false;
            if (!arrayList2.isEmpty()) {
                Iterator it4 = arrayList2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (!arrayList.contains(it4.next())) {
                        z = true;
                        break;
                    }
                }
            }
            ChatRoomFakeMsgOperatorAbility chatRoomFakeMsgOperatorAbility = (ChatRoomFakeMsgOperatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(easterEggForShareAssem), ChatRoomFakeMsgOperatorAbility.class, null);
            if (chatRoomFakeMsgOperatorAbility != null) {
                C1684506ih c1684506ih = new C1684506ih();
                c1684506ih.LIZ(sessionInfoJo);
                c1684506ih.LIZLLL(45);
                c1684506ih.LIZJ(easterEggForShareAssem.getContext());
                c1684506ih.LJI.LIZIZ(C1687006j6.LIZ, new C1687106j7(EnumC1686906j5.VIDEO_RAIN, z));
                chatRoomFakeMsgOperatorAbility.yl2(c1684506ih, null);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showVideoRain$1$3$1$1$1$1$onPlayEnd$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

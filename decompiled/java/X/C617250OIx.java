package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0OIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617250OIx extends C09AY implements Function1<C0OKY, Unit> {
    public final /* synthetic */ InboxEntranceFunction LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ BulletinProfileViewModel LLILLL;
    public final /* synthetic */ C617220OIu LLILZ;
    public final /* synthetic */ C118300cf LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C617250OIx(int i, BulletinProfileViewModel bulletinProfileViewModel, C617220OIu c617220OIu, InboxEntranceFunction inboxEntranceFunction, String str, C118300cf c118300cf) {
        super(1);
        this.LL = inboxEntranceFunction;
        this.LLILLJJLI = i;
        this.LLILLL = bulletinProfileViewModel;
        this.LLILZ = c617220OIu;
        this.LLILZIL = c118300cf;
        this.LLILZLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0OKY c0oky) {
        int i;
        String string;
        C617220OIu c617220OIu;
        InboxEntranceFunction inboxEntranceFunction;
        C0OKY c0oky2 = c0oky;
        InboxEntranceFunction inboxEntranceFunction2 = this.LL;
        if (this.LLILLJJLI == 1) {
            i = 0;
        } else {
            i = 1;
        }
        InboxEntranceFunction inboxEntranceFunctionCopy = inboxEntranceFunction2.copy(inboxEntranceFunction2.name, inboxEntranceFunction2.functionType, i, inboxEntranceFunction2.iconModel);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : c0oky2.LLJJ) {
            if ((interfaceC1891350zJl instanceof C617220OIu) && (inboxEntranceFunction = (c617220OIu = (C617220OIu) interfaceC1891350zJl).LL) != null && inboxEntranceFunction.functionType == inboxEntranceFunctionCopy.functionType) {
                arrayList.add(C617220OIu.LIZ(c617220OIu, inboxEntranceFunctionCopy));
            } else {
                arrayList.add(interfaceC1891350zJl);
            }
        }
        this.LLILLL.setState(new AwS588S0100000_9(arrayList, (List<InterfaceC1891350zJl>) 230));
        C1440005kM.LIZ(new C1902940zcS(this.LLILZ.LLILLJJLI, this.LL.functionType, this.LLILZIL.element, this.LLILZLL));
        if (this.LL.functionType == C0ORP.PIN.getType()) {
            C620050OTr c620050OTr = C620050OTr.LIZ;
            Long l = this.LLILLL.LLILLJJLI;
            if (l != null) {
                string = l.toString();
            } else {
                string = null;
            }
            C620050OTr.LIZ(c620050OTr, string, "channel_pin", C2097908Jt.LIZJ(new Pair("pin_to_inbox", Integer.valueOf(this.LLILZIL.element))));
        }
        return Unit.LIZ;
    }
}

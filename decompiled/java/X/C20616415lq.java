package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS575S0100000_31;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.15lq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20616415lq {
    public final InterfaceC497601wk LIZ;
    public final String LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function2<IMContact, Fragment, Unit> LIZLLL;
    public final Fragment LJ;
    public final C1231704rr LJFF;
    public volatile EnumC20616515lr LJI;
    public AnonymousClass0956 LJII;
    public C20618015m6 LJIIIIZZ;

    public C20616415lq() {
        throw null;
    }

    public final boolean LIZ() {
        IMMediaPublishEvent<?> iMMediaPublishEvent;
        IMContact iMContact;
        Function2<IMContact, Fragment, Unit> function2;
        String str;
        AnonymousClass0956 anonymousClass0956;
        if (this.LJI != EnumC20616515lr.SENDING) {
            return true;
        }
        AnonymousClass0956 anonymousClass09562 = this.LJII;
        if ((anonymousClass09562 != null && anonymousClass09562.isActive()) && (anonymousClass0956 = this.LJII) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C1431840nMc c1431840nMc = (C1431840nMc) EventBus.LIZLLL().LJFF(C1431840nMc.class);
        if (c1431840nMc == null || (iMMediaPublishEvent = c1431840nMc.LIZ) == null) {
            this.LJFF.LIZIZ();
            return false;
        }
        IMMediaPublishEvent iMMediaPublishEventCopyWithSessionId = iMMediaPublishEvent.copyWithSessionId(this.LIZIZ);
        C13DA c13da = new C13DA();
        C20618015m6 c20618015m6 = this.LJIIIIZZ;
        c13da.put("is_search", (c20618015m6 == null || (str = c20618015m6.LLILZLL) == null || str.length() == 0) ? CardStruct.IStatusCode.DEFAULT : "1");
        iMMediaPublishEventCopyWithSessionId.copyWithMobMapAdded(c13da.build()).post();
        C20618015m6 c20618015m62 = this.LJIIIIZZ;
        if (c20618015m62 != null && (iMContact = c20618015m62.LLJ) != null && (function2 = this.LIZLLL) != null) {
            function2.invoke(iMContact, this.LJ);
        }
        return true;
    }

    public C20616415lq(InterfaceC497601wk interfaceC497601wk, String str, AwS575S0100000_31 awS575S0100000_31, Function2 function2, Fragment fragment) {
        C1231704rr c1231704rr = new C1231704rr("ContactSelectSend", null, 6);
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = str;
        this.LIZJ = awS575S0100000_31;
        this.LIZLLL = function2;
        this.LJ = fragment;
        this.LJFF = c1231704rr;
        this.LJI = EnumC20616515lr.NOT_SEND;
    }
}

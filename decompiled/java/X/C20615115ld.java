package X;

import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS49S2100000_31;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.15ld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20615115ld {
    public final InterfaceC497601wk LIZ;
    public final String LIZIZ;
    public final Function1<EnumC20615215le, Unit> LIZJ;
    public final boolean LIZLLL;
    public volatile EnumC20615215le LJ = EnumC20615215le.NOT_SENT;
    public AnonymousClass0956 LJFF;

    public final void LIZ() {
        IMMediaPublishEvent iMMediaPublishEventCopyWithMobMapAdded;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Sending message to ");
        sbLIZ.append(this.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        EnumC20615215le enumC20615215le = EnumC20615215le.SENT;
        this.LJ = enumC20615215le;
        this.LIZJ.invoke(enumC20615215le);
        C912070ZqH.LIZIZ.LJIILIIL().LIZ();
        C1431840nMc c1431840nMc = (C1431840nMc) EventBus.LIZLLL().LJFF(C1431840nMc.class);
        if (c1431840nMc == null || (iMMediaPublishEventCopyWithMobMapAdded = c1431840nMc.LIZ) == null) {
            EnumC20615215le enumC20615215le2 = EnumC20615215le.NOT_SENT;
            this.LJ = enumC20615215le2;
            this.LIZJ.invoke(enumC20615215le2);
            return;
        }
        if (C20622315mn.LIZ() && (iMMediaPublishEventCopyWithMobMapAdded instanceof IMMediaPublishEvent.DMRecordMediaPublishEvent)) {
            IMMediaPublishEvent.DMRecordMediaPublishEvent dMRecordMediaPublishEvent = (IMMediaPublishEvent.DMRecordMediaPublishEvent) iMMediaPublishEventCopyWithMobMapAdded;
            String str = dMRecordMediaPublishEvent.getMobMap().get("content_source");
            if (str == null || str.length() == 0) {
                BaseShortVideoContext editModel = dMRecordMediaPublishEvent.getEditModel();
                String strLJIILIIL = C1428470nHB.LJIILIIL(editModel instanceof VideoPublishEditModel ? (VideoPublishEditModel) editModel : null);
                if (strLJIILIIL.length() > 0) {
                    iMMediaPublishEventCopyWithMobMapAdded = dMRecordMediaPublishEvent.copyWithMobMapAdded(C2097908Jt.LIZJ(new Pair("content_source", strLJIILIIL)));
                }
            }
        }
        iMMediaPublishEventCopyWithMobMapAdded.copyWithSessionId(this.LIZIZ).post();
    }

    public C20615115ld(InterfaceC497601wk interfaceC497601wk, String str, AwS49S2100000_31 awS49S2100000_31, boolean z) {
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = str;
        this.LIZJ = awS49S2100000_31;
        this.LIZLLL = z;
    }
}

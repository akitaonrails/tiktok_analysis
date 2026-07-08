package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.TextHeaderPlayContent;

/* JADX INFO: renamed from: X.01Eu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC301401Eu implements InterfaceC301701Ex {
    public final DataChannel LIZ;
    public TextHeaderPlayContent LIZIZ;
    public final CopyOnWriteArrayList<InterfaceC301801Ey> LIZJ = new CopyOnWriteArrayList<>();
    public boolean LIZLLL;
    public final C301601Ew LJ;

    public abstract String LJ();

    public abstract void LJFF();

    public void LJI() {
        IMessageManager iMessageManager;
        C301601Ew c301601Ew = this.LJ;
        c301601Ew.getClass();
        C972080bP4.LIZLLL("destroy", "TextHeaderMessageChannel", 2);
        try {
            DataChannel dataChannel = c301601Ew.LIZ;
            if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
                return;
            }
            iMessageManager.removeMessageListener((OnIMMessageListener) c301601Ew.LIZJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("TextHeaderMessageChannel", e);
        }
    }

    public AbstractC301401Eu(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LJ = new C301601Ew(dataChannel, this);
    }

    @Override // X.InterfaceC301701Ex
    public final void LIZ(TextHeaderPlayContent textHeaderPlayContent) {
        LIZLLL(textHeaderPlayContent, "onRecordReviewMessageReceived");
    }

    @Override // X.InterfaceC301701Ex
    public final void LIZIZ(TextHeaderPlayContent textHeaderPlayContent) {
        LIZLLL(textHeaderPlayContent, "onRecordUpdateMessageReceived");
    }

    @Override // X.InterfaceC301701Ex
    public final void LIZJ(TextHeaderPlayContent textHeaderPlayContent) {
        LIZLLL(textHeaderPlayContent, "onRecordEndMessageReceived");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(webcast.data.multi_guest_play.TextHeaderPlayContent r7, java.lang.String r8) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L2c
            long r0 = r7.version
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r0 == 0) goto L2c
            webcast.data.multi_guest_play.TextHeaderPlayContent r0 = r6.LIZIZ
            if (r0 == 0) goto L29
            long r3 = r0.version
        L11:
            long r1 = r7.version
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L2c
        L17:
            webcast.data.multi_guest_play.TextHeaderPlayContent r0 = r6.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 == 0) goto L5c
            java.lang.String r1 = r6.LJ()
            java.lang.String r0 = "return as content is the same"
            X.C20441214yg.LIZIZ(r1, r0)
            return
        L29:
            r3 = 0
            goto L11
        L2c:
            java.lang.String r0 = "parse_sei"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 != 0) goto L17
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ignore update source:"
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = " version:"
            r2.append(r0)
            if (r7 == 0) goto L4d
            long r0 = r7.version
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L4d:
            r2.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r0 = r6.LJ()
            X.C20441214yg.LIZIZ(r0, r1)
            return
        L5c:
            r6.LJII(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC301401Eu.LIZLLL(webcast.data.multi_guest_play.TextHeaderPlayContent, java.lang.String):void");
    }

    public final void LJII(TextHeaderPlayContent textHeaderPlayContent, String str) {
        String strLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateContent source:");
        sbLIZ.append(str);
        sbLIZ.append(" content=");
        if (textHeaderPlayContent != null) {
            strLIZJ = C1516000pYM.LIZJ(textHeaderPlayContent);
        } else {
            strLIZJ = null;
        }
        sbLIZ.append(strLIZJ);
        C20441214yg.LIZIZ(LJ(), C2188811AlT.LIZIZ(sbLIZ));
        this.LIZLLL = Intrinsics.LJFF(str, "memory");
        this.LIZIZ = textHeaderPlayContent;
        Iterator<InterfaceC301801Ey> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(textHeaderPlayContent);
        }
    }
}

package X;

import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0a2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C919850a2p {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJI;
    public final DataChannel LIZ;
    public final C304201Fw LIZIZ;
    public final C304201Fw LIZJ;
    public final List<PosIdentity> LIZLLL;
    public final List<PosIdentity> LJ;
    public final C919840a2o LJFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C919850a2p.class, "linkMessageCenter", "getLinkMessageCenter()Lcom/bytedance/android/live/liveinteract/platform/core/message/LinkMessageCenter;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C919850a2p.class, "anchorUserManager", "getAnchorUserManager()Lcom/bytedance/android/live/liveinteract/multiguestv3/service/usermanage/common/IAnchorUserManager;", 0);
        c09r3.getClass();
        LJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.01vb, X.0a2o] */
    public C919850a2p(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        C304201Fw c304201Fw = new C304201Fw("LINK_MESSAGE_CENTER");
        this.LIZIZ = c304201Fw;
        this.LIZJ = new C304201Fw("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        this.LIZLLL = new ArrayList();
        this.LJ = new ArrayList();
        ?? r1 = new InterfaceC919860a2q() { // from class: X.0a2o
            /* JADX WARN: Removed duplicated region for block: B:175:0x02a9  */
            /* JADX WARN: Removed duplicated region for block: B:234:0x03b6  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x00f4  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0111  */
            @Override // X.InterfaceC919860a2q
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void K(com.bytedance.android.livesdk.model.message.LinkScreenChangeMessage r17, boolean r18) {
                /*
                    Method dump skipped, instruction units count: 953
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C919840a2o.K(com.bytedance.android.livesdk.model.message.LinkScreenChangeMessage, boolean):void");
            }
        };
        this.LJFF = r1;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJI;
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) c304201Fw.LIZ();
        if (linkMessageCenter != 0) {
            linkMessageCenter.LIZ(r1);
        }
    }
}

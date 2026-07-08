package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;

/* JADX INFO: renamed from: X.06ss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1747606ss implements InterfaceC1757106uP {
    @Override // X.InterfaceC1757106uP
    public C869590Y9l LIZ(C0Y8T c0y8t, C1736606r6 c1736606r6, FakeMsgContent fakeMsgContent) {
        if (c0y8t != null) {
            C869680Y9u c869680Y9u = new C869680Y9u(CastLongProtector.parseLong(C461720I8s.LIZIZ()), C461720I8s.LIZ());
            c869680Y9u.msgType(fakeMsgContent.getMsgType());
            c869680Y9u.content(GsonProtectorUtils.toJson(C09EF.LIZ, fakeMsgContent));
            C869590Y9l c869590Y9lBuild = c869680Y9u.build();
            c869590Y9lBuild.setMsgStatus(5);
            c869590Y9lBuild.setConversationId(c0y8t.getConversationId());
            c869590Y9lBuild.setConversationShortId(c0y8t.getConversationShortId());
            c869590Y9lBuild.setConversationType(c0y8t.getConversationType());
            c869590Y9lBuild.setIndexInConversationV2(-1L);
            return c869590Y9lBuild;
        }
        return null;
    }
}

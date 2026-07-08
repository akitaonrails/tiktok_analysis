package X;

import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;

/* JADX INFO: renamed from: X.06sh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1746506sh implements InterfaceC1757106uP {
    @Override // X.InterfaceC1757106uP
    public final C869590Y9l LIZ(C0Y8T c0y8t, C1736606r6 c1736606r6, FakeMsgContent fakeMsgContent) {
        C1747106sn c1747106sn;
        String str;
        String str2;
        if (!(fakeMsgContent instanceof C1747106sn) || (str = (c1747106sn = (C1747106sn) fakeMsgContent).LLILLJJLI) == null || str.length() == 0 || (str2 = c1736606r6.LIZJ) == null || str2.length() == 0 || c0y8t == null) {
            return null;
        }
        long jLongValue = 0;
        C869680Y9u c869680Y9u = new C869680Y9u(0L, "");
        c869680Y9u.msgType(c1747106sn.LL);
        c869680Y9u.scene(c1747106sn.LLILZ);
        c869680Y9u.content(c1747106sn.LLILLJJLI);
        c869680Y9u.createdAt(c1747106sn.LLILLL);
        C869590Y9l c869590Y9lBuild = c869680Y9u.build();
        c869590Y9lBuild.setUuid(str2);
        c869590Y9lBuild.setMsgStatus(5);
        c869590Y9lBuild.setSvrStatus(0);
        c869590Y9lBuild.setReadStatus(c1747106sn.LLILZIL);
        c869590Y9lBuild.setConversationId(c0y8t.getConversationId());
        c869590Y9lBuild.setConversationShortId(c0y8t.getConversationShortId());
        c869590Y9lBuild.setConversationType(c0y8t.getConversationType());
        C869590Y9l c869590Y9l = c1736606r6.LJ;
        if (c869590Y9l != null) {
            jLongValue = Long.valueOf(c869590Y9l.getIndex() + 1).longValue();
        }
        c869590Y9lBuild.setIndex(jLongValue);
        c869590Y9lBuild.setIndexInConversationV2(-1L);
        return c869590Y9lBuild;
    }
}

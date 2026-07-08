package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;

/* JADX INFO: renamed from: X.06gm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1672606gm {
    public final SystemContent LIZ;
    public final C0ZQZ<TuxTextView> LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final C869590Y9l LJ;
    public final C1622306Wv LJFF;
    public final IMUser LJI;
    public final SessionInfo LJII;

    public C1672606gm(SystemContent systemContent, C0ZQZ<TuxTextView> c0zqz, int i, int i2, C869590Y9l c869590Y9l, C1622306Wv c1622306Wv, IMUser iMUser, SessionInfo sessionInfo) {
        this.LIZ = systemContent;
        this.LIZIZ = c0zqz;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = c869590Y9l;
        this.LJFF = c1622306Wv;
        this.LJI = iMUser;
        this.LJII = sessionInfo;
    }

    public /* synthetic */ C1672606gm(SystemContent systemContent, C0ZQZ c0zqz, int i, int i2, C869590Y9l c869590Y9l, C1622306Wv c1622306Wv, IMUser iMUser, SessionInfo sessionInfo, int i3) {
        this(systemContent, c0zqz, (i3 & 4) != 0 ? C1671406ga.LIZ() : i, (i3 & 8) != 0 ? 0 : i2, c869590Y9l, (i3 & 32) != 0 ? null : c1622306Wv, iMUser, sessionInfo);
    }
}

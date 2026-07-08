package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.06sT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1745106sT {
    public static final /* synthetic */ int LJ = 0;
    public final SessionInfo LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final Set<String> LIZLLL = new LinkedHashSet();

    public C1745106sT(SessionInfo sessionInfo) {
        this.LIZ = sessionInfo;
    }

    public final void LIZ(long j, Exception exc) {
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1745006sS(j, this, exc, null), 3);
    }
}

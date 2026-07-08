package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventPrepareData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06QD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06QD implements InterfaceC1728106pj {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIIIZZ;
    public final SessionInfo LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final C1231704rr LIZLLL;
    public final C054G LJ;
    public final C01GW LJFF;
    public int LJI;
    public volatile C1598406Nq LJII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C06QD.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LJIIIIZZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1728106pj
    public final void LIZJ(Function1<? super StorySocialEventPrepareData, Unit> function1) {
    }

    @Override // X.InterfaceC1728106pj
    public final void cancel(boolean z) {
    }

    @Override // X.InterfaceC1728106pj
    public final void LIZ(Context context, Function0<Unit> function0) {
        this.LIZLLL.LIZIZ();
        C23250099c.LIZLLL(this.LJ, null, null, new C06QC(this, true, null), 3);
    }

    @Override // X.InterfaceC1728106pj
    public final void LIZIZ(Function0<Unit> function0, Function1<? super Boolean, Unit> function1) {
        this.LIZLLL.LIZIZ();
        C23250099c.LIZLLL(this.LJ, null, null, new C06QC(this, false, null), 3);
    }

    public C06QD(SessionInfo sessionInfo, int i, boolean z) {
        C1231704rr c1231704rr = new C1231704rr("PostToStory", null, 6);
        this.LIZ = sessionInfo;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = c1231704rr;
        C1598406Nq c1598406Nq = this.LJII;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LJII;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LJII = c1598406Nq;
                }
            }
        }
        this.LJ = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        this.LJFF = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(97));
        this.LJI = -1;
    }
}

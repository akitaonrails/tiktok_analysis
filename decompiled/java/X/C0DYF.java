package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0DYF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DYF implements C0DYB {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIIIZZ;
    public final HashMap<String, Aweme> LIZ;
    public C0DYH LIZIZ;
    public Long LIZJ;
    public final List<Aweme> LIZLLL;
    public boolean LJ;
    public int LJFF;
    public boolean LJI;
    public volatile C09U0 LJII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0DYF.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LJIIIIZZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C09U0 LIZJ() {
        C09U0 c09u0 = this.LJII;
        if (c09u0 == null) {
            synchronized (this) {
                c09u0 = this.LJII;
                if (c09u0 == null) {
                    C09U0 c09u02 = (C09U0) C1807670x8n.p();
                    this.LJII = c09u02;
                    return c09u02;
                }
            }
        }
        return c09u0;
    }

    @Override // X.C0DYB
    public final List<Aweme> getAwemeList() {
        return this.LIZLLL;
    }

    @Override // X.C0DYB
    public final boolean getHasMore() {
        return this.LJ;
    }

    public C0DYF(List<? extends Aweme> list) {
        HashMap<String, Aweme> map = new HashMap<>();
        for (Aweme aweme : list) {
            map.put(aweme.getAid(), aweme);
        }
        this.LIZ = map;
        this.LIZLLL = new ArrayList();
        this.LJ = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    @Override // X.C0DYB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>> r11) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DYF.LIZ(X.05Vn):java.lang.Object");
    }

    public final void LIZIZ(List<? extends Aweme> list) {
        if (list != null) {
            for (Aweme aweme : list) {
                String aid = aweme.getAid();
                if (aid != null) {
                    this.LIZ.put(aid, aweme);
                }
            }
        }
    }
}

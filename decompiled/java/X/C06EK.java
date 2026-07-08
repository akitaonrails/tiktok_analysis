package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;

/* JADX INFO: renamed from: X.06EK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06EK implements C066X {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIILL;
    public final C06ET LIZ;
    public final String LIZIZ;
    public final StreakData LIZJ;
    public final StreakPetData LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final Long LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public InterfaceC1541990qEH LJIIJ;
    public boolean LJIIJJI;
    public final String LJIIL = C1505805uy.LIZ();
    public final C054G LJIILIIL;
    public volatile C1598406Nq LJIILJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C06EK.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LJIILL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0170  */
    @Override // X.C066X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.content.Context r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06EK.LIZ(android.content.Context, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(boolean r28, X.InterfaceC1364105Vn<? super java.lang.String> r29) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06EK.LIZIZ(boolean, X.05Vn):java.lang.Object");
    }

    public C06EK(C06ET c06et, String str, StreakData streakData, StreakPetData streakPetData, String str2, String str3, String str4, Long l, String str5, String str6) {
        this.LIZ = c06et;
        this.LIZIZ = str;
        this.LIZJ = streakData;
        this.LIZLLL = streakPetData;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = l;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = str6;
        C1598406Nq c1598406Nq = this.LJIILJJIL;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LJIILJJIL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LJIILJJIL = c1598406Nq;
                }
            }
        }
        this.LJIILIIL = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
    }
}

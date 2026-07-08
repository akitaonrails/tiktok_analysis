package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.06Dd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1571106Dd {
    public static final C1571206De LJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJFF;
    public static final C1571106Dd LJI;
    public final Keva LIZ;
    public final C054G LIZIZ;
    public final CopyOnWriteArraySet<InterfaceC1572006Dm> LIZJ;
    public volatile C1598406Nq LIZLLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.06De] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1571106Dd.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LJFF = new InterfaceC2217461Bqa[]{c2217381BqS};
        LJ = new Object() { // from class: X.06De
        };
        LJI = new C1571106Dd(0);
    }

    public C1571106Dd() {
        this(0);
    }

    public C1571106Dd(int i) {
        this.LIZ = Keva.getRepo("streak_pet_fe_data_repository");
        C1598406Nq c1598406Nq = this.LIZLLL;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LIZLLL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LIZLLL = c1598406Nq;
                }
            }
        }
        this.LIZIZ = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        this.LIZJ = new CopyOnWriteArraySet<>();
    }
}

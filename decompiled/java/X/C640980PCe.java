package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0PCe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640980PCe {
    public static final C640980PCe LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public volatile C09U0 LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C640980PCe.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LIZIZ = new C640980PCe();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.0PHW, java.lang.Object] */
    public final Object LIZ(C0PHX c0phx, List<? extends Aweme> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            ?? c0phw = new C0PHW(aid, c0phx.LIZ, c0phx);
            C0PHX c0phx2 = c0phw.LIZJ;
            c0phx2.LJ();
            String str = c0phx2.LJIIIZ;
            C0P7A c0p7a = c0phw.LIZIZ.LJIIIZ;
            String str2 = c0phw.LIZ;
            C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(Aweme.class));
            if (c640970PCd == null) {
                c640970PCd = new C640970PCd();
                c0p7a.LIZ.put(C13LE.LIZ(Aweme.class), c640970PCd);
            }
            HashMap<String, Object> map = c640970PCd.LIZIZ;
            if (map != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(str);
                map.put(C2188811AlT.LIZIZ(sbLIZ), aweme);
            }
            arrayList.add(c0phw);
            C0PHW c0phw2 = (C0PHW) c259800zU2.element;
            if (c0phw2 != null) {
                c0phw2.LIZLLL = c0phw;
                c0phw.LJ = c0phw2;
            }
            c259800zU2.element = c0phw;
            if (c259800zU.element == 0) {
                c259800zU.element = c0phw;
            }
        }
        C09U0 c09u0 = this.LIZ;
        if (c09u0 == null) {
            synchronized (this) {
                c09u0 = this.LIZ;
                if (c09u0 == null) {
                    c09u0 = (C09U0) C1807670x8n.p();
                    this.LIZ = c09u0;
                }
            }
        }
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, c09u0.LIZJ, new C640990PCf(c0phx, c259800zU, arrayList, c259800zU2, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}

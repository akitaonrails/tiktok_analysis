package X;

import Y.AfS192S0100000_23;
import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.profile.model.User;
import com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStream;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513160pTm implements InterfaceC2259871Dcn {
    public static final C1513160pTm LIZ = new C1513160pTm();
    public static volatile String LIZIZ;
    public static final CopyOnWriteArrayList<InterfaceC1513190pTp> LIZJ;

    static {
        String uid;
        User curUser = C0XQ7.LJFF().getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            uid = "";
        }
        LIZIZ = uid;
        LIZJ = new CopyOnWriteArrayList<>();
        C0XQ7.LJFF().LJJIFFI(new InterfaceC427710Gpt() { // from class: X.0pTn
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i, User user, User user2) {
                String uid2;
                C1513160pTm c1513160pTm = C1513160pTm.LIZ;
                if (user2 == null || (uid2 = user2.getUid()) == null) {
                    uid2 = "";
                }
                c1513160pTm.getClass();
                String str = C1513160pTm.LIZIZ;
                if (!Intrinsics.LJFF(str, uid2)) {
                    C1513160pTm.LIZIZ = uid2;
                    Iterator<InterfaceC1513190pTp> it2 = C1513160pTm.LIZJ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(str, uid2);
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC2259871Dcn
    public final Gson LJIIIZ() {
        C1227904rF.LIZ.getClass();
        return C1227904rF.LIZLLL();
    }

    @Override // X.InterfaceC2259871Dcn
    public final Keva LJIIIIZZ() {
        return C0R1F.LIZ();
    }

    @Override // X.InterfaceC2259871Dcn
    public final C0XEN LIZIZ() {
        return C0XEN.LJIIIIZZ;
    }

    public static final void LJIIJJI(Runnable runnable) {
        C1906580ziK.LIZJ().LIZ().LJLLLLLL(new AfS192S0100000_23(runnable, 4));
    }

    @Override // X.InterfaceC2259871Dcn
    public final boolean LIZ(Object obj) {
        if ((obj instanceof InterfaceC805220ViK) && ((InterfaceC805220ViK) obj).LIZIZ() == EnumC1910390zoT.CepResult) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC2259871Dcn
    public final Object LIZJ(Object obj) {
        if (obj instanceof InterfaceC805220ViK) {
            return ((InterfaceC805220ViK) obj).LIZJ();
        }
        return null;
    }

    @Override // X.InterfaceC2259871Dcn
    public final Object[] LJ(Object obj) {
        if (obj instanceof InterfaceC805220ViK) {
            return ((InterfaceC805220ViK) obj).LIZ();
        }
        return null;
    }

    @Override // X.InterfaceC2259871Dcn
    public final void LJFF(C1513200pTq c1513200pTq) {
        LIZJ.addIfAbsent(c1513200pTq);
    }

    @Override // X.InterfaceC2259871Dcn
    public final boolean LJI(Object obj) {
        return obj instanceof InterfaceC805220ViK;
    }

    @Override // X.InterfaceC2259871Dcn
    public final boolean LJII(Object obj) {
        if ((obj instanceof InterfaceC805220ViK) && ((InterfaceC805220ViK) obj).LIZIZ() == EnumC1910390zoT.CelResult) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC2259871Dcn
    public final boolean LJIIJ(Object obj) {
        if ((obj instanceof InterfaceC805220ViK) && Intrinsics.LJFF(((InterfaceC805220ViK) obj).LIZJ(), Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC2259871Dcn
    public final void LIZLLL(String str, JSONObject jSONObject) {
        ITTMEventStream iTTMEventStream = C829790Wgr.LIZ;
        if (iTTMEventStream != null) {
            iTTMEventStream.emitEventToCaiEventStream(str, jSONObject);
        }
    }
}

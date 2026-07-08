package X;

import android.os.MessageQueue;
import com.bytedance.keva.Keva;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.autocut.s;

/* JADX INFO: renamed from: X.0n2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419550n2n implements MessageQueue.IdleHandler {
    public static final C1419550n2n LL = new C1419550n2n();

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        s sVar = s.LIZ;
        s.LJ = (C11JF) C11IR.LL.LJL(C11S5.LIZIZ).LJJZ(new C09JN() { // from class: X.0n2o
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("AutoCutHelper@27e4.preInit$1$1");
                C1C7U.LIZIZ("AutoCutHelper@27e4.preInit$1$1");
            }
        }, new C09JN() { // from class: X.0n2p
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("AutoCutHelper@27e4.preInit$1$2");
                C1C7U.LIZIZ("AutoCutHelper@27e4.preInit$1$2");
            }
        }, new InterfaceC781210Ukh() { // from class: X.0n2m
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                if (s.LJI == null) {
                    s sVar2 = s.LIZ;
                    s.LJI = Keva.getRepo("repo_auto_cut");
                }
                Keva keva = s.LJI;
                if ((keva == null || !keva.getBoolean("is_auto_cut_inited", false)) && TTNetInit.getEffectiveConnectionType() < 6) {
                    return;
                }
                C1419810n3D.LIZJ(null);
            }
        });
        return false;
    }
}

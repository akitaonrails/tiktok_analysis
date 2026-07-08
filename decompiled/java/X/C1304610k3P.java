package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicTrackerTraceSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.concurrent.ThreadFactory;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0k3P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304610k3P implements InterfaceC927230aEj {
    public static final C1304610k3P LIZ = new C1304610k3P();
    public static final C054G LIZIZ;
    public static final C099G LIZJ;
    public static final boolean LIZLLL;

    static {
        C054G c054gLIZ = C2296808zG.LIZ(new C2232408os(C786410Ut5.i4(new ThreadFactory() { // from class: X.0k3S
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new BPEAThread(runnable, "TrackerThread");
            }
        })).plus(C2296908zH.LIZ()));
        LIZIZ = c054gLIZ;
        LIZLLL = C1304630k3R.LIZIZ && LinkMicTrackerTraceSetting.INSTANCE.enable();
        LIZJ = C23250099c.LIZIZ(c054gLIZ, null, null, new C313870CSb(null), 3);
    }

    @Override // X.InterfaceC927230aEj
    public final void LIZ(C945340ahw c945340ahw) {
        String idStr;
        String string;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        InterfaceC315080CWs interfaceC315080CWs = null;
        if (room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = null;
        }
        if (LIZLLL) {
            string = C13LQ.LJJL(new Throwable().getStackTrace(), new IntRange(2, 8)).toString();
        } else {
            string = null;
        }
        if (idStr != null && !a0.LJJJIL(idStr)) {
            C474500IjA c474500IjA = c945340ahw.LIZ;
            InterfaceC474510IjB interfaceC474510IjB = c474500IjA.LIZ;
            if (interfaceC474510IjB instanceof InterfaceC315080CWs) {
                interfaceC315080CWs = (InterfaceC315080CWs) interfaceC474510IjB;
            }
            C1304590k3N c1304590k3N = new C1304590k3N(Mp4ScreenVideoLoadTimeout.CONTROL, c945340ahw, string, idStr, interfaceC315080CWs);
            if (interfaceC474510IjB != null) {
                interfaceC474510IjB.LJIJ(c1304590k3N);
            }
            c474500IjA.LIZ();
            return;
        }
        C966350bFp.LIZ.LIZ(c945340ahw);
    }

    @Override // X.InterfaceC927230aEj
    public final void LIZIZ(C927240aEk c927240aEk) {
        String idStr;
        String string;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (idStr = room.getIdStr()) != null) {
            if (LIZLLL) {
                string = C13LQ.LJJL(new Throwable().getStackTrace(), new IntRange(2, 8)).toString();
            } else {
                string = null;
            }
            C23250099c.LIZIZ(LIZIZ, null, null, new C1304600k3O(null, c927240aEk, string, idStr), 3);
        }
    }

    @Override // X.InterfaceC927230aEj
    public final void LIZJ(C927240aEk c927240aEk) {
        String idStr;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (idStr = room.getIdStr()) != null) {
            C23250099c.LIZIZ(LIZIZ, null, null, new C1304620k3Q(null, c927240aEk, idStr), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Pair<java.lang.Boolean, java.lang.Boolean>> r8) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1304610k3P.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014a  */
    /* JADX WARN: Type inference failed for: r0v40, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJ(X.InterfaceC315080CWs r10, X.C945340ahw r11, java.lang.String r12, java.lang.String r13, java.util.Map r14, X.InterfaceC1364105Vn r15) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1304610k3P.LJ(X.0CWs, X.0ahw, java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }
}

package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import kotlin.jvm.internal.AwS133S1100000_19;

/* JADX INFO: renamed from: X.0j3P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266170j3P implements InterfaceC863600XuI {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC863600XuI
    public final void LIZIZ(C0YMW c0ymw) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c0ymw);
                break;
            case 1:
                LIZIZ$1(this, c0ymw);
                break;
            case 2:
                LIZIZ$2(this, c0ymw);
                break;
        }
    }

    @Override // X.InterfaceC863600XuI
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
            case 2:
                onSuccess$2(this, obj);
                break;
        }
    }

    public C1266170j3P(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(C1266170j3P c1266170j3P, C0YMW c0ymw) {
        C1230060i7A c1230060i7A = (C1230060i7A) c1266170j3P.l0;
        C913630Zsn.LJIIJJI.LJJIJL(c1230060i7A.LIZ, c1230060i7A.LJFF, c1230060i7A.LJI, new AwS133S1100000_19(c1230060i7A, c1230060i7A.LIZ.getString(2131835079), 23));
    }

    public static final void LIZIZ$1(C1266170j3P c1266170j3P, C0YMW c0ymw) {
        Throwable runtimeException;
        InterfaceC2329309At interfaceC2329309At = (InterfaceC2329309At) c1266170j3P.l0;
        if (c0ymw == null || (runtimeException = c0ymw.getThrowable()) == null) {
            runtimeException = new RuntimeException("createSingleConversation() failed with no errors");
        }
        interfaceC2329309At.tryOnError(runtimeException);
    }

    public static final void LIZIZ$2(C1266170j3P c1266170j3P, C0YMW c0ymw) {
        Throwable runtimeException;
        int status;
        InterfaceC2329309At interfaceC2329309At = (InterfaceC2329309At) c1266170j3P.l0;
        if (c0ymw == null || (runtimeException = c0ymw.getThrowable()) == null) {
            runtimeException = new RuntimeException("createSingleConversation() failed with no errors");
        }
        interfaceC2329309At.tryOnError(runtimeException);
        IIMChatDetailAnalytics iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class);
        if (iIMChatDetailAnalytics != null) {
            if (c0ymw != null) {
                status = c0ymw.getStatus();
            } else {
                status = -1;
            }
            iIMChatDetailAnalytics.LIZJ(status, null, "private", null, "private", null, "private_chat", null, null, null, false, C0I0B.LJFF.LIZIZ());
        }
    }

    public static final void onSuccess$0(C1266170j3P c1266170j3P, Object obj) {
        if (obj != null) {
            C1230440i7m c1230440i7m = C1230440i7m.LIZJ;
            C1230060i7A c1230060i7A = (C1230060i7A) c1266170j3P.l0;
            Context context = c1230060i7A.LIZ;
            C1229500i6G c1229500i6G = c1230060i7A.LJFF;
            String str = c1230060i7A.LJI;
            c1230440i7m.getClass();
            C1230440i7m.LJ(context, c1229500i6G, str);
            C1230060i7A c1230060i7A2 = (C1230060i7A) c1266170j3P.l0;
            InterfaceC1229620i6S interfaceC1229620i6S = c1230060i7A2.LJIIJJI;
            if (interfaceC1229620i6S != null) {
                interfaceC1229620i6S.LIZIZ(c1230060i7A2.LJI);
                return;
            }
            return;
        }
        C1230060i7A c1230060i7A3 = (C1230060i7A) c1266170j3P.l0;
        C913630Zsn.LJIIJJI.LJJIJL(c1230060i7A3.LIZ, c1230060i7A3.LJFF, c1230060i7A3.LJI, new AwS133S1100000_19(c1230060i7A3, c1230060i7A3.LIZ.getString(2131835079), 23));
    }

    public static final void onSuccess$1(C1266170j3P c1266170j3P, Object obj) {
        ((InterfaceC2329309At) c1266170j3P.l0).onSuccess(obj);
    }

    public static final void onSuccess$2(C1266170j3P c1266170j3P, Object obj) {
        C0Y8T c0y8t = (C0Y8T) obj;
        ((InterfaceC2329309At) c1266170j3P.l0).onSuccess(c0y8t);
        IIMChatDetailAnalytics iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class);
        if (iIMChatDetailAnalytics != null) {
            iIMChatDetailAnalytics.LIZJ(0, c0y8t, "private", null, "private", null, "private_chat", null, null, null, false, C0I0B.LJFF.LIZIZ());
        }
    }
}

package X;

import Y.ACallableS245S0200000_13;
import Y.ACallableS29S0100100_13;
import android.os.CancellationSignal;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0VIr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795550VIr implements InterfaceC593180NOi {
    public final AbstractC796540VMm LIZIZ;
    public final C0P49 LIZJ;
    public final C0VMD LIZLLL = new C0VMD();
    public final C854550Xfh LJ;
    public final C854550Xfh LJFF;

    public C795550VIr(AbstractC796540VMm abstractC796540VMm) {
        this.LIZIZ = abstractC796540VMm;
        this.LIZJ = new C0P49(this, abstractC796540VMm, 0);
        this.LJ = new C854550Xfh(abstractC796540VMm, 15);
        this.LJFF = new C854550Xfh(abstractC796540VMm, 16);
    }

    @Override // X.InterfaceC593180NOi
    public final Object LIZ(String str, InterfaceC1364105Vn<? super C0NPC> interfaceC1364105Vn) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM AWEME_MESSAGE_KV WHERE MSG_UUID = ? LIMIT 1");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        return C824670WWr.LIZIZ(this.LIZIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 4), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC593180NOi
    public final Object LIZJ(List<String> list, InterfaceC1364105Vn<? super List<C0NPC>> interfaceC1364105Vn) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM AWEME_MESSAGE_KV WHERE MSG_UUID IN (");
        int size = list.size();
        C0VIY.LIZ(sb, size);
        sb.append(")");
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(size, sb.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                c0vn5LIZLLL.LLD(i);
            } else {
                c0vn5LIZLLL.LJIILIIL(i, str);
            }
            i++;
        }
        return C824670WWr.LIZIZ(this.LIZIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 6), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC593180NOi
    public final Object LIZLLL(List<String> list, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return C824670WWr.LIZJ(this.LIZIZ, new ACallableS245S0200000_13(this, list, 8), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC593180NOi
    public final Object LJFF(long j, C593270NOr c593270NOr) {
        return C824670WWr.LIZJ(this.LIZIZ, new ACallableS29S0100100_13(this, j, 3), c593270NOr);
    }

    @Override // X.InterfaceC593180NOi
    public final Object LJI(long j, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return C824670WWr.LIZJ(this.LIZIZ, new ACallableS29S0100100_13(this, j, 0), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC593180NOi
    public final Object LJII(List list, C593280NOs c593280NOs) {
        return C824670WWr.LIZJ(this.LIZIZ, new ACallableS245S0200000_13(this, list, 48), c593280NOs);
    }

    @Override // X.InterfaceC593180NOi
    public final Object LJIIIIZZ(List<String> list, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return C824670WWr.LIZJ(this.LIZIZ, new ACallableS245S0200000_13(this, list, 7), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC593180NOi
    public final Object LJIIJ(C0NPC c0npc, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C824670WWr.LIZJ(this.LIZIZ, new ACallableS245S0200000_13(this, c0npc, 9), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC593180NOi
    public final Object LJ(String str, long j, long j2, InterfaceC1364105Vn<? super List<C593110NOb>> interfaceC1364105Vn) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "\n        SELECT MSG_UUID, MSG_ID, AWEME_ID, CREATE_TIME\n        FROM AWEME_MESSAGE_KV\n        WHERE CONVERSATION_ID = ?\n        AND HAS_CONSUMED_FOR_VIDEO_RAIN_EFFECT = 0\n        AND (? - CREATE_TIME) <= ?\n        ORDER BY CREATE_TIME ASC\n    ");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        return C824670WWr.LIZIZ(this.LIZIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 5), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC593180NOi
    public final Object LJIIIZ(String str, long j, long j2, InterfaceC1364105Vn<? super List<C0NPC>> interfaceC1364105Vn) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "SELECT * FROM AWEME_MESSAGE_KV WHERE CONVERSATION_ID = ? AND (? - CREATE_TIME) <= ? ORDER BY CREATE_TIME DESC");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        return C824670WWr.LIZIZ(this.LIZIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 10), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC593180NOi
    public final Object LJIIJJI(String str, long j, long j2, InterfaceC1364105Vn<? super List<C593200NOk>> interfaceC1364105Vn) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "SELECT MSG_UUID, SENDER_IS_MYSELF, AWEME_ID, CREATE_TIME FROM AWEME_MESSAGE_KV WHERE CONVERSATION_ID = ? AND HAS_CONSUMED_FOR_EXPLOSION_EFFECT = 0 AND (? - CREATE_TIME) <=? ORDER BY CREATE_TIME ASC                        ");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        return C824670WWr.LIZIZ(this.LIZIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 3), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC593180NOi
    public final Object LIZIZ(final long j, final long j2, final String str, final String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C0WX0.LIZIZ(this.LIZIZ, new Function1() { // from class: X.0NOv
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C795550VIr c795550VIr = this.LL;
                c795550VIr.getClass();
                return C593290NOt.LIZ(c795550VIr, str, str2, j, j2, (InterfaceC1364105Vn) obj);
            }
        }, interfaceC1364105Vn);
    }

    public final Object LJIIL(long j, long j2, String str, String str2, C593300NOu c593300NOu) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(4, "SELECT * FROM AWEME_MESSAGE_KV WHERE CONVERSATION_ID = ? AND AWEME_ID = ? AND HAS_CONSUMED_FOR_EXPLOSION_EFFECT = 0 AND (? - CREATE_TIME) <= ? ORDER BY CREATE_TIME ASC");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        if (str2 == null) {
            c0vn5LIZLLL.LLD(2);
        } else {
            c0vn5LIZLLL.LJIILIIL(2, str2);
        }
        c0vn5LIZLLL.LJIJ(3, j);
        c0vn5LIZLLL.LJIJ(4, j2);
        return C824670WWr.LIZIZ(this.LIZIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 49), c593300NOu);
    }
}

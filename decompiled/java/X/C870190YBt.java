package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0YBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870190YBt extends AbstractC866690XzH<C0YE8> implements C0YE8 {
    public C870190YBt(C0YEF c0yef) {
        super(c0yef, "HandlerCenterProxy");
    }

    @Override // X.C0YE8
    public final void LJLL(C0Y3I c0y3i) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("triggerResendMsgProperty"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIIIIZZ.LJFF.LIZ().LJLL(c0y3i);
        }
    }

    @Override // X.AbstractC866690XzH
    public final C0YE8 LLLJ(C0YED c0yed) {
        return c0yed.LJIIIIZZ.LJFF.LIZ();
    }

    @Override // X.C0YE8
    public final void LJIILIIL(Map<Long, String> map, InterfaceC863600XuI<List<C869590Y9l>> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMessageTextByIds"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIIIIZZ.LJFF.LIZ().LJIILIIL(map, interfaceC863600XuI);
        } else {
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.C0YE8
    public final void LJJLIIIJJI(long j, C0YEB c0yeb) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("reportUnreadCount"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIIIIZZ.LJFF.LIZ().LJJLIIIJJI(j, c0yeb);
        } else {
            c0yeb.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.C0YE8
    public final void LLJJJIL(C0Y3I c0y3i, String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("triggerResendMsgProperty"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIIIIZZ.LJFF.LIZ().LLJJJIL(c0y3i, str);
        }
    }

    @Override // X.C0YE8
    public final void LLJILJILJ(InterfaceC863600XuI interfaceC863600XuI, String str, List list) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("refreshMessagesByIds"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIIIIZZ.LJFF.LIZ().LLJILJILJ(interfaceC863600XuI, str, list);
        } else {
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }
}

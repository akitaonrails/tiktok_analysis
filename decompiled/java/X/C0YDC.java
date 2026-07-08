package X;

import com.bytedance.im.core.proto.ConversationParticipantReadIndex;
import java.util.List;

/* JADX INFO: renamed from: X.0YDC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YDC extends AbstractC866690XzH<C0YDF> implements C0YDF {
    @Override // X.C0YDF
    public final void LJJJJZI() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("updateNetReadInfo"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LIZIZ().LJJJJZI();
        }
    }

    @Override // X.C0YDF
    public final void LLLIIII() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("loadAllConReadInfo"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LIZIZ().LLLIIII();
        }
    }

    @Override // X.C0YDF
    public final void clean() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("clean"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LIZIZ().clean();
        }
    }

    public C0YDC(C0YEF c0yef) {
        super(c0yef, "ConvReadInfoHelperProxy");
    }

    @Override // X.C0YDF
    public final void LLIIIJ(List<ConversationParticipantReadIndex> list) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("updateReadInfo"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LIZIZ().LLIIIJ(list);
        }
    }

    @Override // X.C0YDF
    public final List<C870400YCo> LLL(String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getConReadInfo"));
        if (c0yedLIZIZ == null) {
            return null;
        }
        return c0yedLIZIZ.LJIJI().LIZIZ().LLL(str);
    }

    @Override // X.AbstractC866690XzH
    public final C0YDF LLLJ(C0YED c0yed) {
        return c0yed.LJIJI().LIZIZ();
    }

    @Override // X.C0YDF
    public final void LLIILZL(String str, List list) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("updateNetReadInfo"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LIZIZ().LLIILZL("message_model", list);
        }
    }
}

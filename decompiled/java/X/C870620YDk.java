package X;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0YDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870620YDk extends AbstractC866690XzH<InterfaceC870630YDl> implements InterfaceC870630YDl {
    public final EnumC871430YGn LLILLL;
    public volatile InterfaceC870630YDl LLILZ;
    public volatile C0YED LLILZIL;

    @Override // X.InterfaceC870630YDl
    public final List<String> LJJJLL() {
        C13BV c13bv = C13BV.INSTANCE;
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getAllConversationId"));
        return c0yedLIZIZ != null ? LLLJ(c0yedLIZIZ).LJJJLL() : c13bv;
    }

    @Override // X.InterfaceC870630YDl
    public final Pair<List<C0Y8T>, Boolean> LLLILZLLLI() {
        Pair<List<C0Y8T>, Boolean> pair = new Pair<>(C13BV.INSTANCE, Boolean.FALSE);
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getLoadedConversationsWithHasMore"));
        return c0yedLIZIZ != null ? LLLJ(c0yedLIZIZ).LLLILZLLLI() : pair;
    }

    @Override // X.InterfaceC870630YDl
    public final void clear() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("clear"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).clear();
        }
    }

    @Override // X.InterfaceC870630YDl
    public final boolean isLoading() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("isLoading"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return LLLJ(c0yedLIZIZ).isLoading();
    }

    @Override // X.InterfaceC870630YDl
    public final void LLJJ(List<String> list) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("batchDeleteById"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLJJ(list);
        }
    }

    @Override // X.InterfaceC870630YDl
    public final void LLJJJJ(C0Y9E c0y9e) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("unregister"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLJJJJ(c0y9e);
        }
    }

    @Override // X.InterfaceC870630YDl
    public final void LLJLILLLLZIIL(C878600YdO c878600YdO) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("register"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLJLILLLLZIIL(c878600YdO);
        }
    }

    @Override // X.AbstractC866690XzH
    public final InterfaceC870630YDl LLLJ(C0YED c0yed) {
        InterfaceC870630YDl interfaceC870630YDl = this.LLILZ;
        if (interfaceC870630YDl != null && this.LLILZIL == c0yed) {
            return interfaceC870630YDl;
        }
        InterfaceC870630YDl interfaceC870630YDlLJIIZILJ = c0yed.LJIJI().LJIIZILJ(this.LLILLL);
        this.LLILZ = interfaceC870630YDlLJIIZILJ;
        this.LLILZIL = c0yed;
        return interfaceC870630YDlLJIIZILJ;
    }

    public C870620YDk(C0YEF c0yef, EnumC871430YGn enumC871430YGn) {
        super(c0yef, "MsgReqConvModelProxy");
        this.LLILLL = enumC871430YGn;
    }

    @Override // X.InterfaceC870630YDl
    public final Object LJJJ(List<String> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJJJ;
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("batchMarkRead"));
        if (c0yedLIZIZ != null && (objLJJJ = LLLJ(c0yedLIZIZ).LJJJ(list, interfaceC1364105Vn)) == C099R.LJFF()) {
            return objLJJJ;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC870630YDl
    public final void LJLJLJ(int i, C869380Y8q c869380Y8q) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("loadMessageRequestWithQuery"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJLJLJ(i, c869380Y8q);
        }
    }

    @Override // X.InterfaceC870630YDl
    public final void LJLJLLL(String str, C873950YQf c873950YQf, Set<String> set) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("refreshConvsSimInfoWithKvTableQueryInfo"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJLJLLL(str, c873950YQf, set);
        }
    }
}

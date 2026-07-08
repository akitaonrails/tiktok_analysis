package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OxK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C636160OxK<ITEM> implements InterfaceC636240OxS<ITEM> {
    public final Function2<EnumC329800CwM, InterfaceC1364105Vn<? super Unit>, Object> LL;
    public final C05P0 LLILLJJLI;
    public final C05P0 LLILLL;
    public final C05P0 LLILZ;
    public final C05P0 LLILZIL;

    @Override // X.InterfaceC636240OxS
    public final List<ITEM> getListItemState() {
        return (List) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC636240OxS
    public final AbstractC636210OxP getLoadLatestState() {
        return (AbstractC636210OxP) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC636240OxS
    public final AbstractC636210OxP getLoadMoreState() {
        return (AbstractC636210OxP) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC636240OxS
    public final AbstractC636210OxP getRefreshState() {
        return (AbstractC636210OxP) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC636240OxS
    public final boolean LIZ() {
        AbstractC636210OxP loadLatestState = getLoadLatestState();
        if (loadLatestState instanceof C636170OxL) {
            return ((C636170OxL) loadLatestState).LIZIZ;
        }
        if (loadLatestState instanceof C636180OxM) {
            return true;
        }
        if (loadLatestState instanceof C636220OxQ) {
            return false;
        }
        if (!(loadLatestState instanceof C636250OxT)) {
            throw new C1954807lC();
        }
        AbstractC636210OxP refreshState = getRefreshState();
        return refreshState instanceof C636170OxL ? ((C636170OxL) refreshState).LIZIZ : refreshState instanceof C636180OxM;
    }

    @Override // X.InterfaceC636240OxS
    public final C636260OxU LIZIZ() {
        return getLoadMoreState() instanceof C636250OxT ? new C636260OxU(EnumC329800CwM.REFRESH, getRefreshState()) : new C636260OxU(EnumC329800CwM.NEXT, getLoadMoreState());
    }

    @Override // X.InterfaceC636240OxS
    public final boolean LIZLLL() {
        AbstractC636210OxP loadMoreState = getLoadMoreState();
        if (loadMoreState instanceof C636170OxL) {
            return ((C636170OxL) loadMoreState).LIZ;
        }
        if (loadMoreState instanceof C636180OxM) {
            return true;
        }
        if (loadMoreState instanceof C636220OxQ) {
            return false;
        }
        if (!(loadMoreState instanceof C636250OxT)) {
            throw new C1954807lC();
        }
        AbstractC636210OxP refreshState = getRefreshState();
        return refreshState instanceof C636170OxL ? ((C636170OxL) refreshState).LIZ : refreshState instanceof C636180OxM;
    }

    @Override // X.InterfaceC636240OxS
    public final C636260OxU LJ() {
        return getLoadLatestState() instanceof C636250OxT ? new C636260OxU(EnumC329800CwM.REFRESH, getRefreshState()) : new C636260OxU(EnumC329800CwM.PREV, getLoadLatestState());
    }

    @Override // X.InterfaceC636240OxS
    public final Function2<EnumC329800CwM, InterfaceC1364105Vn<? super Unit>, Object> LIZJ() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C636160OxK(Function2<? super EnumC329800CwM, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2) {
        this.LL = function2;
        C636250OxT c636250OxT = C636250OxT.LIZ;
        this.LLILLJJLI = C20028913Yh.LJI(c636250OxT);
        this.LLILLL = C20028913Yh.LJI(c636250OxT);
        this.LLILZ = C20028913Yh.LJI(c636250OxT);
        this.LLILZIL = C20028913Yh.LJI(C13BV.INSTANCE);
    }
}

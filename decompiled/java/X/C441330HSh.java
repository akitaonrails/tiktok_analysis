package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioSticker;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HSh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl$updateResultsId$3$1", f = "MixStudioStatusRepoImpl.kt", l = {837}, m = "invokeSuspend")
public final class C441330HSh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MixStudioStatusRepoImpl LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ MixStudioSticker LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ List<MixStudioSticker> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441330HSh(MixStudioStatusRepoImpl mixStudioStatusRepoImpl, int i, long j, boolean z, MixStudioSticker mixStudioSticker, int i2, List<MixStudioSticker> list, InterfaceC1364105Vn<? super C441330HSh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = mixStudioStatusRepoImpl;
        this.LLILZ = i;
        this.LLILZIL = j;
        this.LLILZLL = z;
        this.LLIZ = mixStudioSticker;
        this.LLIZLLLIL = i2;
        this.LLJ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C441330HSh c441330HSh = new C441330HSh(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c441330HSh.LLILLJJLI = obj;
        return c441330HSh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean z;
        C441500HSy c441500HSy;
        StickerItem stickerItem;
        Long l;
        StickerBase stickerBase;
        C1C7U.LIZ("MixStudioStatusRepoImpl@50f0.updateResultsId$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                MixStudioStatusRepoImpl mixStudioStatusRepoImpl = this.LLILLL;
                int i2 = this.LLILZ;
                List listSingletonList = Collections.singletonList(C2286608xc.LJFF(this.LLILZIL));
                this.LL = 1;
                mixStudioStatusRepoImpl.getClass();
                obj = C2296808zG.LJ(new C0HSP(mixStudioStatusRepoImpl, i2, listSingletonList, null), this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MixStudioStatusRepoImpl@50f0.updateResultsId$3$1");
                    return objLJFF;
                }
            }
            c098200Yq = (List) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        MixStudioStatusRepoImpl mixStudioStatusRepoImpl2 = this.LLILLL;
        boolean z2 = this.LLILZLL;
        MixStudioSticker mixStudioSticker = this.LLIZ;
        int i3 = this.LLIZLLLIL;
        int i4 = 0;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            List list = (List) c098200Yq;
            C1910890zpH c1910890zpHLJIJJLI = mixStudioStatusRepoImpl2.LJIJJLI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[sticker] polling sticker results ");
            sbLIZ.append(list);
            c1910890zpHLJIJJLI.LIZ("TaskStatusRepo", C2188811AlT.LIZIZ(sbLIZ));
            if (list != null && (stickerItem = (StickerItem) ListProtector.get(list, 0)) != null) {
                C440830HQj c440830HQj = new C440830HQj(stickerItem, z2, MixStudioStatusRepoImpl.LJIJ(mixStudioSticker), mixStudioSticker.staticTaskId);
                InterfaceC332260D0u<List<C440830HQj>> interfaceC332260D0uLJJII = mixStudioStatusRepoImpl2.LJJII();
                interfaceC332260D0uLJJII.setValue(C13LP.LJLILLLLZI(c440830HQj, interfaceC332260D0uLJJII.getValue()));
                if (mixStudioStatusRepoImpl2.LJJII().getValue().size() > i3) {
                    if (mixStudioStatusRepoImpl2.LJJIFFI().getValue() == null) {
                        C1910890zpH c1910890zpHLJIJJLI2 = mixStudioStatusRepoImpl2.LJIJJLI();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[quick send] set new quick send to ");
                        StickerItem stickerItem2 = ((C440830HQj) ListProtector.get(mixStudioStatusRepoImpl2.LJJII().getValue(), i3)).LIZ;
                        if (stickerItem2 != null && (stickerBase = stickerItem2.stickerBase) != null) {
                            l = stickerBase.id;
                        } else {
                            l = null;
                        }
                        sbLIZ2.append(l);
                        c1910890zpHLJIJJLI2.LIZ("TaskStatusRepo", C2188811AlT.LIZIZ(sbLIZ2));
                        mixStudioStatusRepoImpl2.LJJIFFI().setValue(((C440830HQj) ListProtector.get(mixStudioStatusRepoImpl2.LJJII().getValue(), i3)).LIZ);
                    }
                    mixStudioStatusRepoImpl2.LJIIIZ.put(MixStudioStatusRepoImpl.LJIJI(), Boolean.TRUE);
                }
            }
        }
        MixStudioStatusRepoImpl mixStudioStatusRepoImpl3 = this.LLILLL;
        List<MixStudioSticker> list2 = this.LLJ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int size = mixStudioStatusRepoImpl3.LJJIII().getValue().size();
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<MixStudioSticker> it2 = list2.iterator();
                i4 = 0;
                while (it2.hasNext()) {
                    if (it2.next().status == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && (i4 = i4 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            if (size == i4 && mixStudioStatusRepoImpl3.LJJII().getValue().isEmpty()) {
                mixStudioStatusRepoImpl3.LJJIIJ().setValue(C440550HPh.LIZ);
                if (thM5exceptionOrNullimpl instanceof C0XIR) {
                    c441500HSy = new C441500HSy(EnumC441390HSn.DM_STICKER_FETCH, EnumC441430HSr.NETWORK_EXCEPTION);
                } else if (thM5exceptionOrNullimpl instanceof SocketTimeoutException) {
                    c441500HSy = new C441500HSy(EnumC441390HSn.DM_STICKER_FETCH, EnumC441430HSr.TIMEOUT);
                } else if (thM5exceptionOrNullimpl instanceof IOException) {
                    c441500HSy = new C441500HSy(EnumC441390HSn.DM_STICKER_FETCH, EnumC441430HSr.NETWORK_EXCEPTION);
                } else {
                    c441500HSy = new C441500HSy(EnumC441390HSn.DM_STICKER_FETCH, EnumC441430HSr.SERVER_ERROR);
                }
                mixStudioStatusRepoImpl3.LJIIL = c441500HSy;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioStatusRepoImpl@50f0.updateResultsId$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerVariant;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioSticker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0HSO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl$updateResultsId$2$1", f = "MixStudioStatusRepoImpl.kt", l = {814}, m = "invokeSuspend")
public final class C0HSO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MixStudioStatusRepoImpl LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ MixStudioSticker LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HSO(MixStudioStatusRepoImpl mixStudioStatusRepoImpl, int i, long j, MixStudioSticker mixStudioSticker, InterfaceC1364105Vn<? super C0HSO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = mixStudioStatusRepoImpl;
        this.LLILZ = i;
        this.LLILZIL = j;
        this.LLILZLL = mixStudioSticker;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HSO c0hso = new C0HSO(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0hso.LLILLJJLI = obj;
        return c0hso;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        StickerItem stickerItem;
        List<C440830HQj> value;
        ArrayList arrayList;
        Long l;
        Long l2;
        C1C7U.LIZ("MixStudioStatusRepoImpl@50f0.updateResultsId$2$1");
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
                    C1C7U.LIZIZ("MixStudioStatusRepoImpl@50f0.updateResultsId$2$1");
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
        MixStudioSticker mixStudioSticker = this.LLILZLL;
        MixStudioStatusRepoImpl mixStudioStatusRepoImpl2 = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            List list = (List) c098200Yq;
            boolean z = false;
            if (list != null) {
                stickerItem = (StickerItem) C13LP.LJJJLZIJ(0, list);
            } else {
                stickerItem = null;
            }
            String str = mixStudioSticker.staticTaskId;
            if (stickerItem != null && str != null) {
                Integer num = stickerItem.stickerVariant;
                StickerVariant.Companion.getClass();
                if (num != null && num.intValue() == 2) {
                    z = true;
                }
                C440790HQf c440790HQf = new C440790HQf(z);
                InterfaceC332260D0u<List<C440830HQj>> interfaceC332260D0uLJJII = mixStudioStatusRepoImpl2.LJJII();
                do {
                    value = interfaceC332260D0uLJJII.getValue();
                    List<C440830HQj> list2 = value;
                    arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    for (C440830HQj c440830HQj : list2) {
                        StickerBase stickerBase = c440830HQj.LIZ.stickerBase;
                        if (stickerBase != null) {
                            l = stickerBase.id;
                        } else {
                            l = null;
                        }
                        StickerBase stickerBase2 = stickerItem.stickerBase;
                        if (stickerBase2 != null) {
                            l2 = stickerBase2.id;
                        } else {
                            l2 = null;
                        }
                        if (Intrinsics.LJFF(l, l2)) {
                            c440830HQj = new C440830HQj(stickerItem, c440830HQj.LIZIZ, c440790HQf, c440830HQj.LIZLLL);
                        }
                        arrayList.add(c440830HQj);
                    }
                } while (!interfaceC332260D0uLJJII.compareAndSet(value, arrayList));
                IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJII(stickerItem, true);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioStatusRepoImpl@50f0.updateResultsId$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

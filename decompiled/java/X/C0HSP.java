package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerImage;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerVariantItem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HSP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl$getStickerByID$2", f = "MixStudioStatusRepoImpl.kt", l = {949, 966}, m = "invokeSuspend")
public final class C0HSP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends StickerItem>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MixStudioStatusRepoImpl LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ List<Long> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HSP(MixStudioStatusRepoImpl mixStudioStatusRepoImpl, int i, List<Long> list, InterfaceC1364105Vn<? super C0HSP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = mixStudioStatusRepoImpl;
        this.LLILZ = i;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HSP c0hsp = new C0HSP(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0hsp.LLILLJJLI = obj;
        return c0hsp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        int type;
        StickerImage stickerImage;
        ?? SingletonList;
        Object obj2;
        C1C7U.LIZ("MixStudioStatusRepoImpl@50f0.getStickerByID$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    Object obj3 = this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    obj2 = obj3;
                    C1C7U.LIZIZ("MixStudioStatusRepoImpl@50f0.getStickerByID$2");
                    return obj2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            InterfaceC447740Hh6 interfaceC447740Hh6 = (InterfaceC447740Hh6) this.LLILLL.LJIIJ.getValue();
            if (this.LLILZ == 1) {
                type = EnumC451180Hme.AISELF_STICKER.getType();
            } else {
                type = EnumC451180Hme.AIMOJI_STICKER_STATIC.getType();
            }
            List<Long> list = this.LLILZIL;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = interfaceC447740Hh6.LJIIIZ(type, list, this, null);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MixStudioStatusRepoImpl@50f0.getStickerByID$2");
                return objLJFF;
            }
        }
        List list2 = (List) obj;
        obj2 = list2;
        if (list2 != null) {
            StickerItem stickerItem = (StickerItem) ListProtector.get(list2, 0);
            obj2 = list2;
            if (stickerItem != null) {
                MixStudioStatusRepoImpl mixStudioStatusRepoImpl = this.LLILLL;
                List<StickerVariantItem> list3 = stickerItem.stickerVariantItems;
                if (list3 != null) {
                    SingletonList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    Iterator<StickerVariantItem> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        SingletonList.add(it2.next().image);
                    }
                } else {
                    StickerBase stickerBase = stickerItem.stickerBase;
                    if (stickerBase != null) {
                        stickerImage = stickerBase.image;
                    } else {
                        stickerImage = null;
                    }
                    SingletonList = Collections.singletonList(stickerImage);
                }
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(SingletonList, 10));
                Iterator it3 = SingletonList.iterator();
                while (it3.hasNext()) {
                    arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C0HTU((StickerImage) it3.next(), mixStudioStatusRepoImpl, null), 3));
                }
                this.LLILLJJLI = list2;
                this.LL = 2;
                obj2 = list2;
                if (C1D9F.LIZ(arrayList, this) == objLJFF) {
                    C1C7U.LIZIZ("MixStudioStatusRepoImpl@50f0.getStickerByID$2");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("MixStudioStatusRepoImpl@50f0.getStickerByID$2");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends StickerItem>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

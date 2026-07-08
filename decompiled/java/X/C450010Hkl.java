package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hkl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.impl.ui.StickerGridPageWithinPowerCell$loadMoreListenerWithStickerRepo$1$1", f = "StickerGridPageWithinPowerCell.kt", l = {480, 488}, m = "invokeSuspend")
public final class C450010Hkl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C013C LL;
    public C013C LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C450470HlV LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450010Hkl(C450470HlV c450470HlV, InterfaceC1364105Vn<? super C450010Hkl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c450470HlV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C450010Hkl(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C013C c013c;
        C013C c013c2;
        ?? arrayList;
        C1C7U.LIZ("StickerGridPageWithinPowerCell@1408.loadMoreListenerWithStickerRepo$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StickerGridPageWithinPowerCell@1408.loadMoreListenerWithStickerRepo$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c013c2 = this.LLILLJJLI;
            c013c = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            c013c = new C013C();
            c013c2 = new C013C();
            InterfaceC450290HlD interfaceC450290HlDLJIIIZ = this.LLILZ.LJIIIZ();
            this.LL = c013c;
            this.LLILLJJLI = c013c2;
            this.LLILLL = 1;
            obj = interfaceC450290HlDLJIIIZ.loadMoreFavouriteStickers(null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickerGridPageWithinPowerCell@1408.loadMoreListenerWithStickerRepo$1$1");
                return objLJFF;
            }
        }
        AbstractC450030Hkn abstractC450030Hkn = (AbstractC450030Hkn) obj;
        if (abstractC450030Hkn instanceof C450040Hko) {
            c013c.element = true;
            C450040Hko c450040Hko = (C450040Hko) abstractC450030Hkn;
            c013c2.element = c450040Hko.LIZIZ;
            Iterable iterable = (Iterable) c450040Hko.LIZ;
            arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C450730Hlv((StickerItem) it2.next()));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C450020Hkm c450020Hkm = new C450020Hkm(c013c, this.LLILZ, arrayList, c013c2, null);
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c450020Hkm) == objLJFF) {
            C1C7U.LIZIZ("StickerGridPageWithinPowerCell@1408.loadMoreListenerWithStickerRepo$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StickerGridPageWithinPowerCell@1408.loadMoreListenerWithStickerRepo$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

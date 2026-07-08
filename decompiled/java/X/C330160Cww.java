package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerListViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerListViewModel$enableMusicSticker$1", f = "InfoStickerListViewModel.kt", l = {227, 241}, m = "invokeSuspend")
public final class C330160Cww extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InfoStickerListViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330160Cww(InfoStickerListViewModel infoStickerListViewModel, boolean z, InterfaceC1364105Vn<? super C330160Cww> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = infoStickerListViewModel;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330160Cww(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        C1C7U.LIZ("InfoStickerListViewModel@dce1.enableMusicSticker$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Collection collection = (Collection) this.LLILLJJLI.LL.getValue();
            if (collection != null) {
                arrayList = new ArrayList(collection);
            } else {
                arrayList = new ArrayList();
            }
            if (this.LLILLL) {
                List<Pair<Integer, Effect>> list = this.LLILLJJLI.LLJJI;
                if (!list.isEmpty()) {
                    InfoStickerListViewModel infoStickerListViewModel = this.LLILLJJLI;
                    for (Pair<Integer, Effect> pair : list) {
                        ListProtector.add(arrayList, pair.getFirst().intValue(), pair.getSecond());
                    }
                    ((ArrayList) infoStickerListViewModel.LLJJI).clear();
                    C1DFH c1dfh = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                    C330170Cwx c330170Cwx = new C330170Cwx(infoStickerListViewModel, arrayList, null);
                    this.LL = 1;
                    if (C23250099c.LJI(this, abstractC2238408pq, c330170Cwx) == objLJFF) {
                        C1C7U.LIZIZ("InfoStickerListViewModel@dce1.enableMusicSticker$1");
                        return objLJFF;
                    }
                }
            } else {
                InfoStickerListViewModel infoStickerListViewModel2 = this.LLILLJJLI;
                int i2 = 0;
                for (Object obj2 : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        if (!infoStickerListViewModel2.LLILZLL.invoke((Effect) obj2).booleanValue()) {
                            ((ArrayList) infoStickerListViewModel2.LLJJI).add(new Pair(C2286608xc.LJ(i2), obj2));
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                List<Pair<Integer, Effect>> list2 = this.LLILLJJLI.LLJJI;
                if (true ^ list2.isEmpty()) {
                    InfoStickerListViewModel infoStickerListViewModel3 = this.LLILLJJLI;
                    Iterator<Pair<Integer, Effect>> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.remove(it2.next().getSecond());
                    }
                    C1DFH c1dfh2 = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
                    C330180Cwy c330180Cwy = new C330180Cwy(infoStickerListViewModel3, arrayList, null);
                    this.LL = 2;
                    if (C23250099c.LJI(this, abstractC2238408pq2, c330180Cwy) == objLJFF) {
                        C1C7U.LIZIZ("InfoStickerListViewModel@dce1.enableMusicSticker$1");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InfoStickerListViewModel@dce1.enableMusicSticker$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

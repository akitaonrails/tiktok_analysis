package X;

import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01yZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel$downloadStoredBeautyList$1", f = "LiveSmallItemBeautyViewModel.kt", l = {616, 617}, m = "invokeSuspend")
public final class C508901yZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveSmallItemBeautyViewModel LLILLJJLI;
    public final /* synthetic */ List<LiveEffect> LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C508901yZ(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, List<? extends LiveEffect> list, int i, InterfaceC1364105Vn<? super C508901yZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveSmallItemBeautyViewModel;
        this.LLILLL = list;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C508901yZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveSmallItemBeautyViewModel@ff2.downloadStoredBeautyList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveSmallItemBeautyViewModel@ff2.downloadStoredBeautyList$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC510701yr interfaceC510701yr = this.LLILLJJLI.LLILZ;
            List<LiveEffect> list = this.LLILLL;
            this.LL = 1;
            if (interfaceC510701yr.LJII(list) == objLJFF) {
                C1C7U.LIZIZ("LiveSmallItemBeautyViewModel@ff2.downloadStoredBeautyList$1");
                return objLJFF;
            }
        }
        C2252331DDr c2252331DDr = this.LLILLJJLI.LLILLL;
        final List<LiveEffect> list2 = this.LLILLL;
        final int i2 = this.LLILZ;
        AbstractC401801hI abstractC401801hI = new AbstractC401801hI(list2, i2) { // from class: X.00u3
            public final List<LiveEffect> LIZ;
            public final int LIZIZ;

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C226100u3)) {
                    return false;
                }
                C226100u3 c226100u3 = (C226100u3) obj2;
                return Intrinsics.LJFF(this.LIZ, c226100u3.LIZ) && this.LIZIZ == c226100u3.LIZIZ;
            }

            public final int hashCode() {
                return (this.LIZ.hashCode() * 31) + this.LIZIZ;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BeautyDownloaded(beautyList=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", type=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = list2;
                this.LIZIZ = i2;
            }
        };
        this.LL = 2;
        if (c2252331DDr.emit(abstractC401801hI, this) == objLJFF) {
            C1C7U.LIZIZ("LiveSmallItemBeautyViewModel@ff2.downloadStoredBeautyList$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveSmallItemBeautyViewModel@ff2.downloadStoredBeautyList$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

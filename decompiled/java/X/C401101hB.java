package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01hB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchFavoriteEffect$1", f = "StickerEffectViewModel.kt", l = {219, 229, 231, 234}, m = "invokeSuspend")
public final class C401101hB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Pair LL;
    public int LLILLJJLI;
    public final /* synthetic */ StickerEffectViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C401101hB(StickerEffectViewModel stickerEffectViewModel, InterfaceC1364105Vn<? super C401101hB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = stickerEffectViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C401101hB(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        C1C7U.LIZ("StickerEffectViewModel@d809.fetchFavoriteEffect$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2252331DDr c2252331DDr = this.LLILLL.LLILLL;
            AbstractC401801hI abstractC401801hI = new AbstractC401801hI() { // from class: X.00u4
                public final boolean LIZ = true;
                public final String LIZIZ = "fetchFavoriteEffect failed";

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C226200u4)) {
                        return false;
                    }
                    C226200u4 c226200u4 = (C226200u4) obj2;
                    return this.LIZ == c226200u4.LIZ && Intrinsics.LJFF(this.LIZIZ, c226200u4.LIZIZ);
                }

                public final int hashCode() {
                    return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FetchFavoriteError(noAvailableData=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", errorMsg=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            };
            this.LL = null;
            this.LLILLJJLI = 4;
            if (c2252331DDr.emit(abstractC401801hI, this) == objLJFF) {
                C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchFavoriteEffect$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchFavoriteEffect$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pair = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            StickerEffectViewModel stickerEffectViewModel = this.LLILLL;
            stickerEffectViewModel.LLJJ.getClass();
            Integer numValueOf = Integer.valueOf(C767760U9u.LIZJ);
            stickerEffectViewModel.LLJJ.getClass();
            pair = new Pair(numValueOf, C767760U9u.LIZ("favorite"));
            InterfaceC401501hF interfaceC401501hF = this.LLILLL.LLILZ;
            Map<String, String> map = (Map) pair.getSecond();
            this.LL = pair;
            this.LLILLJJLI = 1;
            obj = interfaceC401501hF.LJJIIJZLJL(map, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchFavoriteEffect$1");
                return objLJFF;
            }
        }
        C771050UMl c771050UMl = (C771050UMl) obj;
        if (c771050UMl.LIZIZ != 0) {
            C0UC4 c0uc4 = C0UC4.LIZ;
            HashMap map2 = new HashMap();
            for (T t : ((C0U74) c771050UMl.LIZIZ).LIZIZ) {
                map2.put(C2286608xc.LJFF(t.getEffectId()), C2286608xc.LJFF(t.LIZIZ));
            }
            C0UC4.LJJIII.putAll(map2);
            C767760U9u c767760U9u = this.LLILLL.LLJJ;
            int iIntValue = ((Number) pair.getFirst()).intValue();
            c767760U9u.getClass();
            C767760U9u.LIZJ(iIntValue, "favorite");
            C2252331DDr c2252331DDr2 = this.LLILLL.LLILLL;
            C401301hD c401301hD = new C401301hD((C0U74) c771050UMl.LIZIZ);
            this.LL = null;
            this.LLILLJJLI = 2;
            if (c2252331DDr2.emit(c401301hD, this) == objLJFF) {
                C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchFavoriteEffect$1");
                return objLJFF;
            }
        } else {
            C2252331DDr c2252331DDr3 = this.LLILLL.LLILLL;
            AbstractC401801hI abstractC401801hI2 = new AbstractC401801hI() { // from class: X.00u4
                public final boolean LIZ = true;
                public final String LIZIZ = "fetchFavoriteEffect failed";

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C226200u4)) {
                        return false;
                    }
                    C226200u4 c226200u4 = (C226200u4) obj2;
                    return this.LIZ == c226200u4.LIZ && Intrinsics.LJFF(this.LIZIZ, c226200u4.LIZIZ);
                }

                public final int hashCode() {
                    return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FetchFavoriteError(noAvailableData=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", errorMsg=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            };
            this.LL = null;
            this.LLILLJJLI = 3;
            if (c2252331DDr3.emit(abstractC401801hI2, this) == objLJFF) {
                C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchFavoriteEffect$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchFavoriteEffect$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

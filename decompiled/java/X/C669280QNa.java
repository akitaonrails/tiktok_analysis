package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.search.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.middle.preload.SugInputTracker$handleInputDebounce$3", f = "SugInputTracker.kt", l = {267}, m = "invokeSuspend")
public final class C669280QNa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CharSequence LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C669280QNa(CharSequence charSequence, InterfaceC1364105Vn<? super C669280QNa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = charSequence;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C669280QNa(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        float f;
        C1C7U.LIZ("SugInputTracker@89a0.handleInputDebounce$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long jLongValue = ((Number) C271040Ajm.LIZ.getValue()).longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("SugInputTracker@89a0.handleInputDebounce$3");
                return objLJFF;
            }
        }
        C0QH7 c0qh7 = C0QNZ.LIZ;
        C0QNZ.LJIIIIZZ = C669340QNg.LJ;
        C669330QNf c669330QNf = C0QNZ.LJIIIIZZ;
        if (c669330QNf != null) {
            CharSequence charSequence = this.LLILLJJLI;
            double dLIZJ = C669290QNb.LIZJ(C669290QNb.LIZ(c669330QNf, C0QNZ.LJIIJ));
            C669290QNb.LIZIZ();
            double[] dArr = C669290QNb.LIZ;
            if (dArr.length >= 6) {
                if (Math.abs(dLIZJ) <= Double.MAX_VALUE) {
                    f = (float) dLIZJ;
                } else {
                    f = -1.0f;
                }
                C669310QNd.LIZ(new C669320QNe(f, (float) dArr[0], (float) dArr[1], (float) dArr[2], (float) dArr[3], (float) dArr[4], (float) dArr[5], 1, -1));
            }
            String strValueOf = String.valueOf(charSequence);
            if (((Number) C0A09.LIZ.getValue()).floatValue() > 0.0f && dLIZJ > ((Number) r2.getValue()).floatValue()) {
                ArrayList arrayList = (ArrayList) C0QNZ.LJII;
                if (!arrayList.contains(strValueOf)) {
                    C0QH7 c0qh72 = C0QNZ.LIZ;
                    if (c0qh72 != null) {
                        BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew = ((C0QM0) c0qh72).LIZ;
                        baseDiscoverAndSearchFragmentNew.getClass();
                        if (!TextUtils.isEmpty(strValueOf)) {
                            SearchResultParam searchResultParamGS = baseDiscoverAndSearchFragmentNew.gS(strValueOf, false);
                            C0POX.LIZ.getClass();
                            searchResultParamGS.setPrefetchId(C0POX.LIZJ());
                            searchResultParamGS.setPrefetchType("manual_ahead");
                            searchResultParamGS.setSugIntentPrefetch(Boolean.TRUE);
                            C1ER1.LIZIZ.LLJJJJLIIL(baseDiscoverAndSearchFragmentNew.getActivity(), baseDiscoverAndSearchFragmentNew, searchResultParamGS);
                        }
                    }
                    arrayList.add(strValueOf);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SugInputTracker@89a0.handleInputDebounce$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

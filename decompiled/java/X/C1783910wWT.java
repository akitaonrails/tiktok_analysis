package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.PcsIndustrySelectFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wWT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.PcsIndustrySelectFragment$observeLoadStatus$1", f = "PcsIndustrySelectFragment.kt", l = {166}, m = "invokeSuspend")
public final class C1783910wWT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PcsIndustrySelectFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783910wWT(PcsIndustrySelectFragment pcsIndustrySelectFragment, InterfaceC1364105Vn<? super C1783910wWT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsIndustrySelectFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1783910wWT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsIndustrySelectFragment@36b5.observeLoadStatus$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951 = this.LLILLJJLI.NR().LLILZIL;
            final PcsIndustrySelectFragment pcsIndustrySelectFragment = this.LLILLJJLI;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0wY3
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    View viewFindViewById;
                    boolean z;
                    C1781540wSe next;
                    Object obj3;
                    String strValueOf;
                    String string;
                    View view = pcsIndustrySelectFragment.getView();
                    Integer numValueOf = null;
                    if (view != null) {
                        viewFindViewById = view.findViewById(R.id.nlo);
                    } else {
                        viewFindViewById = null;
                    }
                    if (obj2 instanceof C1410950mov) {
                        if (viewFindViewById != null) {
                            C500260Jjc.LLFFF(viewFindViewById);
                        }
                        C1390410mHn c1390410mHn = pcsIndustrySelectFragment.LLJIJIL;
                        if (c1390410mHn != null) {
                            c1390410mHn.LIZJ();
                        }
                    } else if (obj2 instanceof C1410940mou) {
                        C1390410mHn c1390410mHn2 = pcsIndustrySelectFragment.LLJIJIL;
                        if (c1390410mHn2 != null) {
                            c1390410mHn2.LIZLLL();
                        }
                        if (viewFindViewById != null) {
                            C500260Jjc.LJIILIIL(viewFindViewById);
                        }
                        PcsIndustrySelectFragment pcsIndustrySelectFragment2 = pcsIndustrySelectFragment;
                        C1784900wY4 c1784900wY4 = pcsIndustrySelectFragment2.LLJI;
                        if (c1784900wY4 != null) {
                            C1784660wXg state = pcsIndustrySelectFragment2.NR().getState();
                            if (state.LLIZLLLIL != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            Iterator<C1781540wSe> it2 = state.LLILLJJLI.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (next.LIZ == state.LLIZLLLIL) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            C1781540wSe c1781540wSe = next;
                            if (c1781540wSe != null) {
                                numValueOf = Integer.valueOf(c1781540wSe.LJFF);
                            }
                            C474500IjA c474500IjALIZ = c1784900wY4.LIZ(state, "livesdk_upsell_content_topic_select_page_show");
                            String str = "1";
                            if (state.LLILZLL) {
                                obj3 = "1";
                            } else {
                                obj3 = CardStruct.IStatusCode.DEFAULT;
                            }
                            c474500IjALIZ.LJJII(obj3, "is_editable");
                            if (!z) {
                                str = CardStruct.IStatusCode.DEFAULT;
                            }
                            c474500IjALIZ.LJJII(str, "has_selected_industry");
                            String str2 = "";
                            if (!z) {
                                strValueOf = "";
                            } else {
                                strValueOf = String.valueOf(state.LLIZLLLIL);
                            }
                            c474500IjALIZ.LJJII(strValueOf, "industry_id");
                            if (numValueOf != null && (string = numValueOf.toString()) != null) {
                                str2 = string;
                            }
                            c474500IjALIZ.LJJII(str2, "topic_level");
                            c474500IjALIZ.LIZ();
                        }
                    } else {
                        C1390410mHn c1390410mHn3 = pcsIndustrySelectFragment.LLJIJIL;
                        if (c1390410mHn3 != null) {
                            c1390410mHn3.LIZLLL();
                        }
                        if (viewFindViewById != null) {
                            C500260Jjc.LJIILIIL(viewFindViewById);
                        }
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (anonymousClass0951.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("PcsIndustrySelectFragment@36b5.observeLoadStatus$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

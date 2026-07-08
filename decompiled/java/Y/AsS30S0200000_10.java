package Y;

import X.AbstractC1585810rMx;
import X.AbstractC683590Qrd;
import X.AnonymousClass0750;
import X.C013C;
import X.C01GW;
import X.C01V2;
import X.C0PCF;
import X.C0PCO;
import X.C0PCY;
import X.C0PFV;
import X.C0PQC;
import X.C0PR1;
import X.C0PRC;
import X.C0Q3E;
import X.C0VWN;
import X.C0VWW;
import X.C13BV;
import X.C1DWH;
import X.C2187451AjH;
import X.C287840BPy;
import X.C290410BZv;
import X.C641510PEf;
import X.C644140POi;
import X.C645130PSd;
import X.C652750Piz;
import X.C664570Q4x;
import X.C664580Q4y;
import X.C682890QqV;
import X.C798360VTm;
import X.C823050WQl;
import X.InterfaceC1602960roc;
import X.InterfaceC648350Pbt;
import X.InterfaceC652740Piy;
import X.InterfaceC683010Qqh;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public class AsS30S0200000_10 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 1:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 3:
                LJJIIJ$2(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS30S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LJJIIJ$0(AsS30S0200000_10 asS30S0200000_10, RecyclerView recyclerView, int i) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        C652750Piz c652750Piz = (C652750Piz) asS30S0200000_10.l0;
        ArrayList<RecyclerView.ViewHolder> arrayListLIZ = C652750Piz.LIZ((C01GW) asS30S0200000_10.l1);
        c652750Piz.getClass();
        Map mapLIZJ = C652750Piz.LIZJ(arrayListLIZ);
        InterfaceC652740Piy interfaceC652740PiyLIZIZ = ((C652750Piz) asS30S0200000_10.l0).LIZJ.LIZIZ(recyclerView, i, mapLIZJ.keySet());
        if (interfaceC652740PiyLIZIZ != null && (searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) mapLIZJ.get(interfaceC652740PiyLIZIZ)) != null) {
            ((C652750Piz) asS30S0200000_10.l0).LIZIZ(searchServiceCenter$AutoPlayAbility);
        }
    }

    public static final void LJJIIJ$1(AsS30S0200000_10 asS30S0200000_10, RecyclerView recyclerView, int i) {
        InterfaceC1602960roc interfaceC1602960rocLIZIZ;
        String str;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        C01V2.LIZIZ = 1;
        int i2 = 0;
        if (i != 0) {
            if (i == 1) {
                C664580Q4y.LIZ();
                C0VWW.LJI("search_result_scrolling");
                AbstractC683590Qrd abstractC683590Qrd = (AbstractC683590Qrd) asS30S0200000_10.l0;
                if (abstractC683590Qrd instanceof C645130PSd) {
                    InterfaceC1602960roc interfaceC1602960rocLIZIZ2 = C0VWN.LIZIZ("search_mix_feed_list");
                    if (interfaceC1602960rocLIZIZ2 != null) {
                        interfaceC1602960rocLIZIZ2.LIZ("lynx_count", String.valueOf(((C645130PSd) abstractC683590Qrd).LLJJIJIL));
                    }
                    InterfaceC1602960roc interfaceC1602960rocLIZIZ3 = C0VWN.LIZIZ("search_mix_feed_list");
                    if (interfaceC1602960rocLIZIZ3 != null) {
                        interfaceC1602960rocLIZIZ3.LIZ("position", String.valueOf(((C645130PSd) abstractC683590Qrd).LLJJJIL));
                    }
                    InterfaceC1602960roc interfaceC1602960rocLIZIZ4 = C0VWN.LIZIZ("search_mix_feed_list");
                    if (interfaceC1602960rocLIZIZ4 != null) {
                        ISearchContextAbility iSearchContextAbilityLIZ = C0Q3E.LIZ((RecyclerView) asS30S0200000_10.l1);
                        if (iSearchContextAbilityLIZ == null || (c0pcyPh1 = iSearchContextAbilityLIZ.Ph1()) == null || (c0prc = (C0PRC) c0pcyPh1.LIZJ()) == null || (str = c0prc.LLILLL) == null) {
                            str = "";
                        }
                        interfaceC1602960rocLIZIZ4.LIZ("search_id", str);
                    }
                    if (C287840BPy.LIZ() && (interfaceC1602960rocLIZIZ = C0VWN.LIZIZ("search_mix_feed_list")) != null) {
                        C645130PSd c645130PSd = (C645130PSd) abstractC683590Qrd;
                        interfaceC1602960rocLIZIZ.LIZ("lynx_cards_type", c645130PSd.LLJJJ);
                        if (c645130PSd.LLJJIJIL > 0) {
                            i2 = 1;
                        }
                        interfaceC1602960rocLIZIZ.LJIIJJI(Integer.valueOf(i2), "has_lynx_card");
                    }
                }
                C0PFV.LIZ.getClass();
                if (C0PFV.LIZIZ()) {
                    C0PFV.LIZJ();
                }
                C0PQC.LIZ.getClass();
                if (C0PQC.LIZ().enableScrollJit) {
                    C0PQC.LIZ();
                    int i3 = C2187451AjH.LIZ;
                }
                if (C290410BZv.LIZ()) {
                    AtomicBoolean atomicBoolean = C0PR1.LIZ;
                    if (!atomicBoolean.get()) {
                        atomicBoolean.set(true);
                        ((C798360VTm) C0PR1.LJI.getValue()).LIZ();
                    }
                    C644140POi.LIZ = "search_result_scrolling";
                    C644140POi.LIZIZ = "";
                    return;
                }
                return;
            }
            return;
        }
        C0PFV.LIZ.getClass();
        if (C0PFV.LIZIZ()) {
            C0PFV.LIZLLL();
        }
        if (C290410BZv.LIZ()) {
            if (C0PR1.LIZ.get()) {
                ((C798360VTm) C0PR1.LJI.getValue()).LIZ();
            }
            if (C287840BPy.LIZ()) {
                AbstractC683590Qrd abstractC683590Qrd2 = (AbstractC683590Qrd) asS30S0200000_10.l0;
                if (abstractC683590Qrd2 instanceof C645130PSd) {
                    C644140POi.LIZIZ = ((C645130PSd) abstractC683590Qrd2).LLJJJ;
                }
            }
            if (C290410BZv.LIZ()) {
                C823050WQl.LIZIZ().execute(new ARunnableS110S0100000_10((Object) null, 125));
            }
        }
        C0VWW.LIZIZ("search_result_scrolling");
        if (((Number) AnonymousClass0750.LIZ.getValue()).longValue() <= 0) {
            return;
        }
        C664570Q4x.LJFF.getValue().LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0PCO] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.0PCO] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0PCO] */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.0PBc, X.0PBe] */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.0PBc, X.0PBe] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0Pbt] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0Pbt] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.13BV] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void LJJIIJ$2(AsS30S0200000_10 asS30S0200000_10, RecyclerView recyclerView, int i) {
        ?? arrayList;
        if (i == 0 && C641510PEf.LIZIZ(((C0PCO) asS30S0200000_10.l0).LLILLJJLI, ((C013C) asS30S0200000_10.l1).element)) {
            RecyclerView recyclerView2 = ((C0PCO) asS30S0200000_10.l0).LLILLJJLI;
            if (recyclerView2 == null) {
                arrayList = C13BV.INSTANCE;
            } else {
                List<Integer> listLIZ = C641510PEf.LIZ(recyclerView2);
                if (listLIZ.isEmpty()) {
                    arrayList = C13BV.INSTANCE;
                } else {
                    arrayList = new ArrayList();
                    Iterator<Integer> it2 = listLIZ.iterator();
                    while (it2.hasNext()) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(it2.next().intValue());
                        if (viewHolderFindViewHolderForAdapterPosition != null && (viewHolderFindViewHolderForAdapterPosition instanceof InterfaceC648350Pbt)) {
                            arrayList.add(new Pair(viewHolderFindViewHolderForAdapterPosition, viewHolderFindViewHolderForAdapterPosition));
                        }
                    }
                }
            }
            ((C0PCO) asS30S0200000_10.l0).LJ(arrayList);
            ((C0PCO) asS30S0200000_10.l0).getClass();
            ?? LIZLLL = C0PCO.LIZLLL(arrayList);
            RecyclerView.ViewHolder viewHolder = null;
            if (LIZLLL != 0) {
                C0PCO c0pco = (C0PCO) asS30S0200000_10.l0;
                c0pco.LL.LIZIZ();
                RecyclerView recyclerView3 = c0pco.LLILLJJLI;
                if (LIZLLL instanceof RecyclerView.ViewHolder) {
                    viewHolder = (RecyclerView.ViewHolder) LIZLLL;
                }
                C0PCF.LIZJ(recyclerView3, viewHolder);
                c0pco.LL.LIZLLL(LIZLLL);
                return;
            }
            ?? LIZIZ = ((C0PCO) asS30S0200000_10.l0).LIZIZ(arrayList);
            if (LIZIZ != 0) {
                C0PCO c0pco2 = (C0PCO) asS30S0200000_10.l0;
                c0pco2.LL.LIZIZ();
                RecyclerView recyclerView4 = c0pco2.LLILLJJLI;
                if (LIZIZ instanceof RecyclerView.ViewHolder) {
                    viewHolder = (RecyclerView.ViewHolder) LIZIZ;
                }
                C0PCF.LIZJ(recyclerView4, viewHolder);
                c0pco2.LL.LIZLLL(LIZIZ);
                return;
            }
            List<InterfaceC648350Pbt> listLIZ2 = ((C0PCO) asS30S0200000_10.l0).LIZ(arrayList);
            C0PCO c0pco3 = (C0PCO) asS30S0200000_10.l0;
            if (!((ArrayList) listLIZ2).isEmpty()) {
                c0pco3.LL.LIZIZ();
                c0pco3.Q1(listLIZ2, null);
            }
        }
    }

    public static final void LJJIIZI$0(AsS30S0200000_10 asS30S0200000_10, RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        C682890QqV c682890QqV = (C682890QqV) asS30S0200000_10.l0;
        if (c682890QqV.LIZJ) {
            return;
        }
        c682890QqV.LIZJ = true;
        ((InterfaceC683010Qqh) asS30S0200000_10.l1).h7();
    }

    public static final void LJJIIZI$1(AsS30S0200000_10 asS30S0200000_10, RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        C652750Piz c652750Piz = (C652750Piz) asS30S0200000_10.l0;
        if (c652750Piz.LJI) {
            ArrayList<RecyclerView.ViewHolder> arrayListLIZ = C652750Piz.LIZ((C01GW) asS30S0200000_10.l1);
            c652750Piz.getClass();
            Map mapLIZJ = C652750Piz.LIZJ(arrayListLIZ);
            C1DWH c1dwh = ((C652750Piz) asS30S0200000_10.l0).LIZJ;
            mapLIZJ.keySet();
            c1dwh.LIZ();
        }
    }
}

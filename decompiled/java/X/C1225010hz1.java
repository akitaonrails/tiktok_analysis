package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS103S0201000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0hz1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225010hz1 extends C1225700i08 {
    public final C1225030hz3 LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
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
    @Override // X.C1225700i08, X.InterfaceC1224490hyB
    public final void LJIJ(C1224590hyL c1224590hyL) {
        ?? arrayList;
        String str;
        Function1<List<C1224840hyk>, String> function1;
        C1224780hye c1224780hyeLJIILLIIL;
        List<C1224840hyk> list;
        super.LJIJ(c1224590hyL);
        if (c1224590hyL.LJ || !c1224590hyL.LIZIZ || c1224590hyL.LIZ != EnumC1227730i3P.MAIN) {
            return;
        }
        Context context = (Context) this.LLILZIL.getValue();
        InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
        if (interfaceC1226510i1R != null) {
            C1224780hye c1224780hyeLJIILLIIL2 = interfaceC1226510i1R.LJIILLIIL();
            String strInvoke = null;
            list = null;
            List<C1224840hyk> list2 = null;
            strInvoke = null;
            if (c1224780hyeLJIILLIIL2 != null && (list = c1224780hyeLJIILLIIL2.LIZIZ) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C1224840hyk> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LLILZ);
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            C894390Z6v c894390Z6v = (C894390Z6v) this.LLILZLL.getValue();
            if (c894390Z6v != null && (function1 = c894390Z6v.LIZ) != null) {
                InterfaceC1226510i1R interfaceC1226510i1R2 = this.LLILLJJLI.LLILLL;
                if (interfaceC1226510i1R2 != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R2.LJIILLIIL()) != null) {
                    list2 = c1224780hyeLJIILLIIL.LIZIZ;
                }
                strInvoke = function1.invoke(list2);
            }
            String str2 = "";
            if (strInvoke == null) {
                strInvoke = "";
            }
            int iLJFF = C1461005nk.LIZ.LJFF(Long.valueOf(C461720I8s.LIZJ()), (String) this.LLIZLLLIL.getValue());
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJI(strInvoke);
            C894390Z6v c894390Z6v2 = (C894390Z6v) this.LLILZLL.getValue();
            if (c894390Z6v2 != null && (str = c894390Z6v2.LIZIZ) != null) {
                str2 = str;
            }
            c1397580mTM.LIZIZ(str2);
            C985403tE.LIZ(c1397580mTM, new AwS103S0201000_19(this, (C1225010hz1) arrayList, (List<String>) iLJFF, 9));
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    @Override // X.C1225700i08, X.InterfaceC1224250hxn
    public final void LJJJ(C1224790hyf c1224790hyf) {
        InterfaceC1226510i1R interfaceC1226510i1R;
        List<C1224840hyk> list = c1224790hyf.LIZIZ;
        if (list != null && (interfaceC1226510i1R = this.LL.LIZ) != null) {
            interfaceC1226510i1R.LJIIJJI(new C1224600hyM(EnumC1227730i3P.MAIN, Boolean.valueOf(!list.isEmpty()), (String) ((Function1) this.LLIZ.getValue()).invoke(Integer.valueOf(list.size())), (Boolean) null, 24), false);
        }
    }

    public C1225010hz1(C1225000hz0 c1225000hz0, AbstractC1225770i0F abstractC1225770i0F) {
        super(abstractC1225770i0F, c1225000hz0);
        this.LLILZ = new C1225030hz3(abstractC1225770i0F);
        this.LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(abstractC1225770i0F, 3159));
        this.LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(c1225000hz0, 3161));
        this.LLIZ = C452501pT.LIZIZ(new AwS420S0200000_19(c1225000hz0, abstractC1225770i0F, 179));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(c1225000hz0, 3160));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJJJ(List<String> list, Map<String, String> map) {
        C866530Xz1 c866530Xz1LIZIZ;
        String str = (String) this.LLIZLLLIL.getValue();
        if (str != null) {
            c866530Xz1LIZIZ = C0YNP.LIZIZ(str);
        } else {
            c866530Xz1LIZIZ = 0;
        }
        C1226140i0q.LIZJ(this.LLILLJJLI, EnumC1227730i3P.MAIN, true);
        if (c866530Xz1LIZIZ != 0) {
            c866530Xz1LIZIZ.LJIIL(list, map, new InterfaceC867020Xzo<List<? extends C0YAE>>() { // from class: X.0hz2
                @Override // X.InterfaceC867020Xzo
                public final void LIZ(C868810Y6l<List<? extends C0YAE>> c868810Y6l) {
                    Integer numValueOf;
                    int size;
                    C19EG activity;
                    C742250T9r c742250T9r = c868810Y6l.LIZJ;
                    List<? extends C0YAE> list2 = c868810Y6l.LIZ;
                    C0YMW c0ymw = c868810Y6l.LIZIZ;
                    C0Z6O c0z6o = C0Z6O.LIZIZ;
                    String str2 = (String) this.LIZ.LLIZLLLIL.getValue();
                    if (c0ymw != null) {
                        numValueOf = Integer.valueOf(c0ymw.getCode());
                    } else {
                        numValueOf = null;
                    }
                    c0z6o.LIZ(str2, c742250T9r, numValueOf);
                    C1226140i0q.LIZJ(this.LIZ.LLILLJJLI, EnumC1227730i3P.MAIN, false);
                    if (c0ymw == null) {
                        if (list2 != null) {
                            size = list2.size();
                        } else {
                            size = 0;
                        }
                        String strLJ = C20642515q3.LJ(2131755192, size, String.valueOf(size));
                        InterfaceC1226510i1R interfaceC1226510i1R = this.LIZ.LL.LIZ;
                        if (interfaceC1226510i1R != null && (activity = interfaceC1226510i1R.getActivity()) != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(activity);
                            c1389890mGx.LIZ(true);
                            c1389890mGx.LJIIJ(strLJ);
                            c1389890mGx.LJIIJJI();
                        }
                        InterfaceC1226510i1R interfaceC1226510i1R2 = this.LIZ.LL.LIZ;
                        if (interfaceC1226510i1R2 != null) {
                            interfaceC1226510i1R2.LJIILL(C343970De7.LIZ, null);
                        }
                    }
                }

                @Override // X.InterfaceC867020Xzo
                public final void LIZIZ(C0Y00 c0y00) {
                    C742250T9r c742250T9r = c0y00.LIZIZ;
                    C0YMW c0ymw = c0y00.LIZ;
                    C0Z6O.LIZIZ.LIZ((String) this.LIZ.LLIZLLLIL.getValue(), c742250T9r, Integer.valueOf(C1232370iAt.LIZIZ(c0ymw)));
                    IIMErrorUtils.LIZ.getClass();
                    IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
                    if (iIMErrorUtilsLIZ != null) {
                        C0I0B.LJFF.LIZJ();
                        iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
                    }
                    C1226140i0q.LIZJ(this.LIZ.LLILLJJLI, EnumC1227730i3P.MAIN, false);
                }
            });
        }
    }
}

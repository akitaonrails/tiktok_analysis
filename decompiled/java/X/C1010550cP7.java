package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cP7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010550cP7 extends C1010600cPC implements InterfaceC655350PnB {
    public final InterfaceC1010560cP8 LLIZLLLIL;
    public final SearchAdEventLogger LLJ;
    public final C1011580cQm LLJI;
    public final C1009960cOA LLJIJIL;
    public C0Q1G LLJILJIL;
    public final C1010670cPJ LLJILJILJ;
    public boolean LLJILLL;

    @Override // X.C1010600cPC
    public final void LJJI() {
    }

    @Override // X.C1010600cPC
    public final C1010640cPG LJJIFFI() {
        return new C1010640cPG(this.LLJI, new C1010630cPF(false, C2097908Jt.LIZJ(new Pair(EnumC1010840cPa.BREAK, Boolean.FALSE)), null, null));
    }

    @Override // X.InterfaceC655350PnB
    public final void NJ1() {
        int i = C2510609se.LIZ;
        SearchAdEventLogger searchAdEventLogger = this.LLJ;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LJIJJLI, new AwS595S0100000_16(this, 361));
    }

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
    @Override // X.C1010600cPC, X.C0PPF
    public final void bind() {
        super.bind();
        SearchAdEventLogger searchAdEventLogger = this.LLJ;
        Object[] objArr = new Object[4];
        objArr[0] = this.LLIZLLLIL.getAweme();
        objArr[1] = new C1002920cCo(C00CE.IS_DIRECT_LIVE);
        InterfaceC1010560cP8 interfaceC1010560cP8 = this.LLIZLLLIL;
        objArr[2] = interfaceC1010560cP8;
        Aweme aweme = interfaceC1010560cP8.getAweme();
        objArr[3] = aweme != null ? C1010120cOQ.LJIIIIZZ(aweme) : null;
        searchAdEventLogger.withContext(objArr);
        C1011580cQm c1011580cQm = this.LLJI;
        if (c1011580cQm != null) {
            c1011580cQm.LIZLLL(EnumC1011130cQ3.CTA_CLICK, new AwS560S0100000_16(this, 906));
        }
    }

    @Override // X.C1010600cPC, X.C0PPF
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C622570ObP c622570ObPLJIILJJIL = this.LLIZLLLIL.LJIILJJIL();
        SearchAdEventLogger searchAdEventLogger = this.LLJ;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LIZIZ, new AwS595S0100000_16(this, 362));
        if (c622570ObPLJIILJJIL != null) {
            C625790Ogb.LIZ();
            LJIIIZ(c622570ObPLJIILJJIL.LJIILIIL);
        }
    }

    @Override // X.C1010600cPC, X.C0PPF
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C1009960cOA c1009960cOA = this.LLJIJIL;
        if (c1009960cOA != null) {
            c1009960cOA.LIZIZ = false;
        }
        SearchAdEventLogger searchAdEventLogger = this.LLJ;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LIZJ);
        C622570ObP c622570ObPLJIILJJIL = this.LLIZLLLIL.LJIILJJIL();
        if (c622570ObPLJIILJJIL != null) {
            C1011700cQy.LIZ(this, c622570ObPLJIILJJIL);
        }
    }

    @Override // X.InterfaceC1011690cQx
    public final boolean LJIJJLI() {
        return this.LLJILLL;
    }

    @Override // X.C1010600cPC
    public final /* bridge */ /* synthetic */ InterfaceC1010250cOd LJJ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC1010250cOd Mh() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC655290Pn5
    public final C0Q1G getClickType() {
        return this.LLJILJIL;
    }

    @Override // X.C1010600cPC, X.InterfaceC660150Puv
    public final InterfaceC1011430cQX vQ0() {
        return this.LLJI;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0cPJ] */
    public C1010550cP7(C655360PnC c655360PnC) {
        C19EG c19egLIZIZ;
        C1011580cQm c1011580cQm;
        C1007860cKm c1007860cKmLJIILIIL;
        super(c655360PnC);
        this.LLIZLLLIL = c655360PnC;
        SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger();
        this.LLJ = searchAdEventLogger;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        ViewGroup itemView = c655360PnC.getItemView();
        Context context = c655360PnC.getContext();
        C1009960cOA c1009960cOALIZ = null;
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(itemView, c19egLIZIZ);
        if (lifecycleOwnerLJIJI != null) {
            c1011580cQm = new C1011580cQm(lifecycleOwnerLJIJI);
        } else {
            c1011580cQm = null;
        }
        this.LLJI = c1011580cQm;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        if (interfaceC657510PqfLIZLLL != null && (c1007860cKmLJIILIIL = interfaceC657510PqfLIZLLL.LJIILIIL()) != null) {
            c1009960cOALIZ = c1007860cKmLJIILIIL.LIZ(c655360PnC.LIZIZ);
        }
        this.LLJIJIL = c1009960cOALIZ;
        C1010580cPA c1010580cPA = new C1010580cPA(c655360PnC.getItemView(), null, EnumC658110Prd.LIVE_AD, c1011580cQm, searchAdEventLogger, this.LLILZ, c655360PnC);
        this.LLJILJIL = C0Q1G.OTHER;
        final C1010580cPA c1010580cPALIZ = C1010580cPA.LIZ(c1010580cPA, c655360PnC.LIZLLL());
        this.LLJILJILJ = new AbstractC1010700cPM(c1010580cPALIZ) { // from class: X.0cPJ
            public ViewGroup LLILZIL;

            @Override // X.AbstractC1010700cPM
            public final void LIZIZ() {
                ArrayList arrayList = (ArrayList) this.LLILLL;
                arrayList.add(new C1010150cOT(this.LL));
                arrayList.add(new C1010510cP3(this.LL));
            }

            @Override // X.AbstractC1010700cPM
            public final void LIZJ() {
                ViewGroup viewGroup = this.LL.LIZIZ;
                if (viewGroup != null) {
                    C1009940cO8.LJI(viewGroup);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" param.slotView = ");
                    sbLIZ.append(this.LL.LIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2510609se.LIZ;
                    View viewLIZJ = C1009940cO8.LIZJ(viewGroup.getContext(), viewGroup);
                    this.LLILZIL = viewLIZJ instanceof ViewGroup ? (ViewGroup) viewLIZJ : null;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("inflate bottom componentGroupView = ");
                    sbLIZ2.append(this.LLILZIL);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        };
    }

    @Override // X.InterfaceC1011690cQx
    public final void LJIIIZ(boolean z) {
        this.LLJILLL = z;
    }

    @Override // X.C1010600cPC
    public final void LJJII(List<AbstractC1010700cPM> list) {
        ViewGroup viewGroupLIZLLL;
        super.LJJII(list);
        if (!C1010120cOQ.LJJIJ(this.LLIZLLLIL.getAweme())) {
            ((ArrayList) list).add(this.LLJILJILJ);
            return;
        }
        if (((Boolean) C07AB.LIZ.getValue()).booleanValue() && (viewGroupLIZLLL = this.LLIZLLLIL.LIZLLL()) != null) {
            C1009940cO8.LIZ(viewGroupLIZLLL);
        }
        ViewGroup viewGroupLIZLLL2 = this.LLIZLLLIL.LIZLLL();
        if (viewGroupLIZLLL2 != null) {
            C786410Ut5.LJLZ(8, viewGroupLIZLLL2);
        }
        View viewLIZIZ = this.LLIZLLLIL.LIZIZ();
        if (viewLIZIZ == null) {
            return;
        }
        C426750GoL.LJIIIZ(viewLIZIZ, null, null, null, 0, false, 23);
    }

    @Override // X.InterfaceC655350PnB
    public final void MM2(EnumC655370PnD enumC655370PnD) {
        String strLJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLiveCardClick clickFrom ");
        sbLIZ.append(enumC655370PnD);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        this.LLJILJIL = C0Q1G.LIVE_COVER;
        int i2 = C655380PnE.LIZ[enumC655370PnD.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                SearchAdEventLogger searchAdEventLogger = this.LLJ;
                C1009980cOC.LIZ.getClass();
                searchAdEventLogger.logAd(C1009980cOC.LJIJJ);
            } else {
                throw new C1954807lC();
            }
        } else {
            SearchAdEventLogger searchAdEventLogger2 = this.LLJ;
            C1009980cOC.LIZ.getClass();
            searchAdEventLogger2.logAd(C1009980cOC.LJIILLIIL);
        }
        Aweme aweme = this.LLIZLLLIL.getAweme();
        if (C1010120cOQ.LJJIJL(aweme) && C1010120cOQ.LJIJ(aweme) && (strLJFF = C1010120cOQ.LJFF(aweme)) != null && strLJFF.length() != 0) {
            C1004580cFU c1004580cFU = this.LLILZ;
            c1004580cFU.LJIIIZ = strLJFF;
            c1004580cFU.LJIIJ = true;
            ViewGroup itemView = this.LLIZLLLIL.getItemView();
            if (itemView != null) {
                this.LLILZ.LJIIJJI = BtmSDK.INSTANCE.createJumpSourceBtmToken("c55236.d0", PageFinder.via((View) itemView), null);
            }
        }
    }

    @Override // X.C1010600cPC, X.InterfaceC658610PsR
    public final void Ms(InterfaceC1010450cOx interfaceC1010450cOx) {
        C19EG c19egLIZIZ;
        super.Ms(interfaceC1010450cOx);
        SAFHelper sAFHelper = SAFHelper.LIZ;
        ViewGroup itemView = this.LLIZLLLIL.getItemView();
        Context context = this.LLIZLLLIL.getContext();
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        sAFHelper.getClass();
        C1009940cO8.LIZIZ(interfaceC1010450cOx, SAFHelper.LJIJI(itemView, c19egLIZIZ), C2097608Jq.LJIIIIZZ(new Pair(C1010930cPj.LIZ, new AwS417S0200000_16(this, interfaceC1010450cOx, 102)), new Pair(C1010900cPg.LIZ, AFwS204S0000000_16.get$arr$(481))));
    }
}

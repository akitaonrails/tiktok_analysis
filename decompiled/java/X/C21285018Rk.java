package X;

import Y.ACListenerS134S0200000_32;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import avg.f;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Rk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21285018Rk extends C21284618Rg<InterfaceC21285318Rn, C21285518Rp> implements InterfaceC1141530foN {
    public C21285118Rl LLJIJIL;

    @Override // X.C21284618Rg, X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        return new C1400390mXt(null, null, null, new AwS560S0100000_16(this, 694), null, 23);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C21285018Rk();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.ANCHOR_MOVIETOK.getTYPE();
    }

    @Override // X.C21284618Rg
    public final void LJJIJIIJI(C21285518Rp c21285518Rp) {
        Boolean boolValueOf;
        LJJIJ(new AwS398S0200000_32(c21285518Rp, (C21285518Rp) this, (C21284618Rg<InterfaceC21284718Rh, C21285518Rp>) 75));
        LJJIJIL().LJIIIIZZ(this.LLJIJIL);
        C1548820qPI.LJIIIIZZ("collect", this);
        String strLJIILJJIL = LJJIJIL().LJIILJJIL(this.LLIZ);
        boolean zLIZ = LJJIJIL().LIZ(this.LLIZ);
        c21285518Rp.setId(strLJIILJJIL);
        if (LJJIJIL().LJIILLIIL(strLJIILJJIL) != null) {
            boolValueOf = LJJIJIL().LJIILLIIL(strLJIILJJIL);
        } else {
            boolValueOf = Boolean.valueOf(zLIZ);
        }
        if (boolValueOf != null) {
            c21285518Rp.LJ(boolValueOf.booleanValue());
        }
        this.LLJIJIL = new C21285118Rl(c21285518Rp);
        LJJIJIL().LJIILIIL(this.LLJIJIL);
        C1548820qPI.LIZLLL("collect", this);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String id;
        InterfaceC1107590evd interfaceC1107590evd;
        String string;
        S s = this.LLJI;
        if (s != 0 && (id = s.getId()) != null) {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            String string2 = null;
            if (interfaceC1107590evd2 != null) {
                string2 = interfaceC1107590evd2.getString("movieID");
            }
            if (Intrinsics.LJFF(id, string2) && (interfaceC1107590evd = c262100zr.LIZIZ) != null && (string = interfaceC1107590evd.getString("interactionType")) != null) {
                if (string.equals("favorite")) {
                    C21285118Rl c21285118Rl = this.LLJIJIL;
                    if (c21285118Rl != null) {
                        c21285118Rl.LIZ(id, true);
                    }
                    LJJIJIL().LJIIL(Boolean.TRUE, id);
                    return;
                }
                if (!string.equals("cancel_favorite")) {
                    return;
                }
                C21285118Rl c21285118Rl2 = this.LLJIJIL;
                if (c21285118Rl2 != null) {
                    c21285118Rl2.LIZ(id, false);
                }
                LJJIJIL().LJIIL(Boolean.FALSE, id);
            }
        }
    }

    @Override // X.C21284618Rg, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        super.p1(c2344009Gk);
        if (LJIIZILJ().isAd()) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", LJIIZILJ().getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("movie_anchor", "refer");
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // X.C21284618Rg, X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        super.LJJJLL(view, c2344009Gk);
        if (LJIIZILJ().isAd()) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", LJIIZILJ().getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("movie_anchor", "refer");
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJIL(C712520RxC c712520RxC, InterfaceC705550Rlx interfaceC705550Rlx, InterfaceC1050330dRH interfaceC1050330dRH) {
        LJJIJIL().LJII(this.LLIZ);
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
    @Override // X.C21284618Rg, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        boolean z;
        double dOptDouble;
        String strValueOf;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        View view = null;
        if (anchorCommonStruct != null) {
            int iOptInt = 0;
            S s = (S) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cyv, null, false);
            this.LLJI = s;
            if (s != 0) {
                z = s.LLIZ;
            } else {
                z = false;
            }
            s.setCollected(z);
            LJJIJIIJI(s);
            s.setButtonOnClickListener(new AwS433S0200000_32(viewGroup, this, 46));
            View.OnClickListener aCListenerS134S0200000_32 = new ACListenerS134S0200000_32(this, c2344009Gk, 15);
            if (C1848410yCV.LIZ) {
                aCListenerS134S0200000_32 = new f(aCListenerS134S0200000_32);
            }
            View.OnClickListener aVar = new a(aCListenerS134S0200000_32);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(s);
            }
            s.setOnClickListener(aVar);
            try {
                JSONObject jSONObject = new JSONObject(anchorCommonStruct.getExtra());
                iOptInt = jSONObject.optInt("year", 0);
                dOptDouble = jSONObject.optDouble("imdb_rating", 0.0d);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                dOptDouble = 0.0d;
            }
            if (C444960Hcc.LIZIZ() && dOptDouble > 0.0d && iOptInt != 0) {
                C1360520lVa c1360520lVa = new C1360520lVa();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((double) ((int) (dOptDouble * ((double) 10)))) / 10.0d);
                sbLIZ.append(" IMDb · ");
                sbLIZ.append(iOptInt);
                c1360520lVa.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                strValueOf = c1360520lVa.LIZ.toString();
            } else if (dOptDouble > 0.0d) {
                if (iOptInt != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(iOptInt);
                    sbLIZ2.append(" · IMDb ");
                    sbLIZ2.append(((double) ((int) (dOptDouble * ((double) 10)))) / 10.0d);
                    strValueOf = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("IMDb ");
                    sbLIZ3.append(((double) ((int) (dOptDouble * ((double) 10)))) / 10.0d);
                    strValueOf = C2188811AlT.LIZIZ(sbLIZ3);
                }
            } else if (iOptInt != 0) {
                strValueOf = String.valueOf(iOptInt);
            } else {
                strValueOf = "";
            }
            s.setSubTitle(strValueOf);
            viewGroup.addView(s);
            view = s;
            if (LJIIZILJ().isAd()) {
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", LJIIZILJ().getAwemeRawAd());
                c1022820ciuLIZLLL.LIZJ("movie_anchor", "refer");
                c1022820ciuLIZLLL.LJII();
                view = s;
            }
        }
        return view;
    }
}

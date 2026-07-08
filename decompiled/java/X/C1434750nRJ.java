package X;

import com.ss.android.ugc.aweme.editpost.EditPostResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.wavepublish.experiment.EnableParallelPublishSchedulerV2Exp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nRJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434750nRJ implements InterfaceC1433580nPQ {
    public final C1433530nPL LIZ;
    public final InterfaceC1434300nQa LIZIZ;
    public volatile C1D80 LIZJ;
    public final C1434970nRf LIZLLL;
    public final C1434960nRe LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS566S0100000_22(this, 972));

    @Override // X.InterfaceC1433580nPQ
    public final void LJI() {
    }

    @Override // X.InterfaceC1433580nPQ
    public final boolean LJIILLIIL() {
        return false;
    }

    @Override // X.InterfaceC1433580nPQ
    public final boolean LJIJ() {
        return true;
    }

    @Override // X.InterfaceC1433580nPQ
    public final void reStart() {
    }

    @Override // X.InterfaceC1433580nPQ
    public final void LJIILL(C1433230nOr c1433230nOr) {
        if (this.LIZJ != null) {
            C1D80 c1d80 = this.LIZJ;
            if (c1d80 == null) {
                c1d80 = null;
            }
            c1d80.LIZIZ(c1433230nOr);
        }
    }

    @Override // X.InterfaceC1433580nPQ
    public final void LJIIZILJ(final AbstractC1433570nPP abstractC1433570nPP) {
        C1D82 c1d82 = new C1D82(AFwS210S0000000_22.get$arr$(396), EnumC1434770nRL.AUTH_KEY);
        C1D82 c1d822 = new C1D82(new AwS566S0100000_22(this, 971), EnumC1434770nRL.COVER_TEXT_UPLOAD);
        C1D82 c1d823 = new C1D82(AFwS210S0000000_22.get$arr$(399), EnumC1434770nRL.EDIT_POST);
        C1D82 c1d824 = new C1D82(AFwS210S0000000_22.get$arr$(398), EnumC1434770nRL.CUSTOM_COVER_UPLOAD);
        C1440550naf c1440550naf = new C1440550naf("EditPostPublisher", (C1D82[]) Arrays.copyOf(new C1D82[]{c1d82}, 1));
        c1440550naf.LIZIZ = this.LIZ.LIZIZ;
        ArrayList arrayList = (ArrayList) c1440550naf.LIZLLL;
        arrayList.add(this.LIZLLL);
        arrayList.add(this.LJ);
        arrayList.add(new C1404570med(this.LIZ.LIZIZ));
        if (C568750MSj.LIZIZ(this.LJ.LIZ)) {
            arrayList.add(this.LJFF.getValue());
        }
        arrayList.add(this.LIZIZ);
        c1440550naf.LJFF = EnableParallelPublishSchedulerV2Exp.LIZ().enable;
        c1440550naf.LJ = C1435270nS9.LIZ();
        this.LIZIZ.LJFF();
        c1440550naf.LJIIIIZZ = new C1435280nSA(C1434840nRS.LJ());
        this.LIZJ = c1440550naf.LIZ();
        c1d822.LIZ(c1d82);
        if (!C1428470nHB.LJJZZI(this.LJ.LIZ) && (C1447250nlT.LIZ() || C1447250nlT.LIZLLL())) {
            c1d824.LIZ(c1d82);
            c1d823.LIZ(c1d822, c1d824, c1d82);
        } else if (C568750MSj.LIZIZ(this.LJ.LIZ)) {
            C1D82 c1d825 = new C1D82(AFwS210S0000000_22.get$arr$(397), EnumC1434770nRL.COMPILE);
            c1d825.LJIIJ = C1433780nPk.LIZ;
            C1D82 c1d826 = new C1D82(AFwS210S0000000_22.get$arr$(400), EnumC1434770nRL.UPLOAD);
            c1d826.LJIIJ = C1433780nPk.LIZIZ;
            c1d825.LIZ(c1d82);
            c1d826.LIZ(c1d825);
            c1d826.LIZ(c1d82);
            c1d823.LIZ(c1d825);
            c1d823.LIZ(c1d826);
            c1d823.LIZ(c1d82);
        } else {
            c1d823.LIZ(c1d822, c1d82);
        }
        C1D80 c1d80 = this.LIZJ;
        C1D80 c1d802 = null;
        if (c1d80 == null) {
            c1d80 = null;
        }
        C1D80 c1d803 = this.LIZJ;
        if (c1d803 == null) {
            c1d803 = null;
        }
        final String str = c1d803.LJIIJ;
        c1d80.LIZ(new AbstractC1446660nkW(str, abstractC1433570nPP) { // from class: X.0nQs
            public final AbstractC1433570nPP LJ;
            public final Object LJFF;
            public C1434970nRf LJI;
            public InterfaceC1434300nQa LJII;

            {
                super(2, str);
                this.LJ = abstractC1433570nPP;
                this.LJFF = str;
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
                Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next instanceof C1434970nRf) {
                        if (next != null) {
                            this.LJI = (C1434970nRf) next;
                            Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                if (next2 instanceof InterfaceC1434300nQa) {
                                    if (next2 != null) {
                                        this.LJII = (InterfaceC1434300nQa) next2;
                                        return;
                                    }
                                }
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                        }
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
                AbstractC1433570nPP abstractC1433570nPP2 = this.LJ;
                C1433600nPS c1433600nPS = C1433600nPS.LIZ;
                C1434970nRf c1434970nRf = this.LJI;
                if (c1434970nRf == null) {
                    c1434970nRf = null;
                }
                abstractC1433570nPP2.onFinish(c1433600nPS, null, c1434970nRf.LIZ);
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) throws JSONException {
                int code;
                InterfaceC1434300nQa interfaceC1434300nQa = this.LJII;
                if (interfaceC1434300nQa == null) {
                    interfaceC1434300nQa = null;
                }
                C1434450nQp c1434450nQpLJI = interfaceC1434300nQa.LJI();
                if (c1435220nS4.getCode() != 0) {
                    code = c1435220nS4.getCode();
                } else {
                    code = 1147;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_code", c1435220nS4.getCode());
                jSONObject.put("error_msg", c1435220nS4.toString());
                c1434450nQpLJI.getClass();
                C1637890six.LJ("edit_post_save_error_rate", code, jSONObject);
                AbstractC1433570nPP abstractC1433570nPP2 = this.LJ;
                String strValueOf = String.valueOf(c1435220nS4.getCode());
                String string = c1435220nS4.getNodeTag().toString();
                C1434340nQe c1434340nQe = C1434330nQd.Companion;
                int code2 = c1435220nS4.getCode();
                c1434340nQe.getClass();
                C1433450nPD c1433450nPD = new C1433450nPD(new C1433270nOv(strValueOf, string, C1434340nQe.LIZ(code2), c1435220nS4.getT(), null, c1435220nS4.getCode()));
                C1434970nRf c1434970nRf = this.LJI;
                if (c1434970nRf == null) {
                    c1434970nRf = null;
                }
                abstractC1433570nPP2.onFinish(c1433450nPD, null, c1434970nRf.LIZ);
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) throws JSONException {
                Iterator<Object> it2 = ((C1404610meh) obj2).LIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next instanceof EditPostResponse) {
                        if (next != null) {
                            EditPostResponse editPostResponse = (EditPostResponse) next;
                            InterfaceC1434300nQa interfaceC1434300nQa = this.LJII;
                            if (interfaceC1434300nQa == null) {
                                interfaceC1434300nQa = null;
                            }
                            C1434450nQp c1434450nQpLJI = interfaceC1434300nQa.LJI();
                            int i3 = editPostResponse.statusCode;
                            JSONObject jSONObject = new JSONObject();
                            if (editPostResponse.statusCode != 0) {
                                jSONObject.put("status_msg", editPostResponse.statusMsg);
                                jSONObject.put("error_msg", editPostResponse.errorMsg);
                                jSONObject.put("biz_error_code", editPostResponse.bizErrorCode);
                            }
                            c1434450nQpLJI.getClass();
                            C1637890six.LJ("edit_post_save_error_rate", i3, jSONObject);
                            AbstractC1433570nPP abstractC1433570nPP2 = this.LJ;
                            C492380JSq c492380JSq = new C492380JSq(editPostResponse);
                            C1434970nRf c1434970nRf = this.LJI;
                            if (c1434970nRf == null) {
                                c1434970nRf = null;
                            }
                            abstractC1433570nPP2.onFinish(c492380JSq, null, c1434970nRf.LIZ);
                            return;
                        }
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.editpost.EditPostResponse");
            }
        });
        C1D80 c1d804 = this.LIZJ;
        if (c1d804 != null) {
            c1d802 = c1d804;
        }
        c1d802.LJII();
        if (C568750MSj.LIZIZ(this.LJ.LIZ)) {
            ((C1405220mfg) this.LJFF.getValue()).LIZLLL(EnumC1404590mef.RE_EDIT_IMAGE);
        }
    }

    public C1434750nRJ(C1433530nPL c1433530nPL, C1434310nQb c1434310nQb) {
        this.LIZ = c1433530nPL;
        this.LIZIZ = c1434310nQb;
        this.LIZLLL = new C1434970nRf(c1433530nPL.LIZ);
        this.LJ = new C1434960nRe((VideoPublishEditModel) c1433530nPL.LIZ.editModel);
    }
}

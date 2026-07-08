package X;

import Y.ACListenerS124S0200000_21;
import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.api.activestatus.IActiveStatusObserverProducer;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363960lb8 extends RecyclerView.ViewHolder implements InterfaceC1363770lap {
    public static final /* synthetic */ int LLJJJJ = 0;
    public SharePanelViewModel LL;
    public final InterfaceC1362600lYw LLILLJJLI;
    public final boolean LLILLL;
    public final InterfaceC897330ZId LLILZ;
    public final C1841350y17 LLILZIL;
    public final C197039127h LLILZLL;
    public final TextView LLIZ;
    public final SmartAvatarImageView LLIZLLLIL;
    public final ConstraintLayout LLJ;
    public IMContact LLJI;
    public int LLJIJIL;
    public C427920GqE LLJILJIL;
    public boolean LLJILJILJ;
    public final C1362940lZU LLJILLL;
    public final C0ZE7 LLJJ;
    public final C1361580lXI LLJJI;
    public boolean LLJJIII;
    public final C01GW LLJJIJI;
    public AnonymousClass0956 LLJJIJIIJIL;
    public AnonymousClass0956 LLJJIJIL;
    public final C054G LLJJJ;
    public final C0ZHC LLJJJIL;

    static {
        new C1363460laK();
    }

    @Override // X.InterfaceC1363770lap
    public final void onAttachedToWindow() {
        String strLJIIIZ;
        String strLIZJ;
        InterfaceC897330ZId interfaceC897330ZId;
        IMUser iMUser;
        HashMap<String, String> map = new HashMap<>();
        ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
        Object objValueOf = "";
        if (contactFeatureLIZ == null || (strLJIIIZ = contactFeatureLIZ.LJIIIZ(this.LLJI)) == null) {
            strLJIIIZ = "";
        }
        map.put("to_user_id", strLJIIIZ);
        map.put("rank_index", String.valueOf(this.LLJIJIL));
        IMContact iMContact = this.LLJI;
        map.put("icon_type", iMContact instanceof IMUser ? "private" : iMContact instanceof IMConversation ? "group" : "");
        IMContact iMContact2 = this.LLJI;
        if (iMContact2 instanceof IMUser) {
            C1364620lcC.LIZ.getClass();
            strLIZJ = C1364620lcC.LIZJ(iMContact2, "");
        } else {
            strLIZJ = "";
        }
        map.put("share_relation_type", strLIZJ);
        map.put("panel_source", "long_press");
        IMContact iMContact3 = this.LLJI;
        if ((iMContact3 instanceof IMUser) && (iMUser = (IMUser) iMContact3) != null) {
            objValueOf = Integer.valueOf(iMUser.getFollowStatus());
        }
        map.put("share_follow_status", objValueOf.toString());
        InterfaceC1362600lYw interfaceC1362600lYw = this.LLILLJJLI;
        if (interfaceC1362600lYw != null) {
            interfaceC1362600lYw.LIZLLL(map);
        }
        if (C595800NYk.LIZ().imitateLiveDataInShareScenario || (interfaceC897330ZId = this.LLILZ) == null) {
            return;
        }
        interfaceC897330ZId.LIZIZ(true, this.LLJJJIL);
    }

    @Override // X.InterfaceC1363770lap
    public final void onDetachedFromWindow() {
        InterfaceC897330ZId interfaceC897330ZId;
        if (C595800NYk.LIZ().imitateLiveDataInShareScenario || (interfaceC897330ZId = this.LLILZ) == null) {
            return;
        }
        interfaceC897330ZId.LJIIJ(this.LLJJJIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N5(C427920GqE c427920GqE) {
        int followStatus;
        IMUser iMUser;
        this.LLJILJIL = c427920GqE;
        C2201941BFw c2201941BFw = IMUser.Companion;
        if ((c427920GqE instanceof IMUser) && (iMUser = (IMUser) c427920GqE) != null) {
            followStatus = iMUser.getFollowStatus();
        } else {
            followStatus = -1;
        }
        c2201941BFw.getClass();
        boolean z = true;
        boolean z2 = !C2201941BFw.LIZLLL(followStatus);
        if (!this.LL.LLJJJ || !z2) {
            z = false;
        }
        this.LLJILJILJ = z;
    }

    public final void R5(boolean z) {
        int i;
        C197039127h c197039127h = this.LLILZLL;
        Context context = this.itemView.getContext();
        if (z) {
            i = 2131847379;
        } else {
            i = 2131847371;
        }
        c197039127h.setText(context.getText(i));
        this.LLILZLL.setEnabled(!z);
        this.LLILZLL.setClickable(!z);
        this.LLJ.setClickable(!z);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r5, X.C429270GsP r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L44
            boolean r0 = X.C429290GsR.LIZ(r6)
            r3 = 1
            if (r0 != r3) goto L44
        L9:
            X.0GqE r0 = r4.LLJILJIL
            if (r0 == 0) goto L10
            r0.setActivityStatus(r6)
        L10:
            X.0ZE7 r0 = r4.LLJJ
            if (r0 == 0) goto L42
            X.0ZE7 r0 = r0.LIZ()
        L18:
            X.C897490ZIt.LIZJ(r4, r5, r0)
            boolean r0 = r5 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMUser
            if (r0 == 0) goto L33
            r0 = r5
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r0
            r0.setActive(r3)
            android.view.View r2 = r4.itemView
            java.lang.String r1 = r5.getUid()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.C0ZJ7.LIZIZ(r2, r1, r0)
        L32:
            return
        L33:
            boolean r0 = r5 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation
            if (r0 == 0) goto L32
            com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation r5 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation) r5
            r5.setActive(r3)
            android.view.View r0 = r4.itemView
            X.C0ZJ7.LIZ(r0)
            return
        L42:
            r0 = 0
            goto L18
        L44:
            r3 = 0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1363960lb8.P5(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact, X.0GsP):void");
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [X.0ZHC] */
    public C1363960lb8(View view, SharePanelViewModel sharePanelViewModel, InterfaceC1362600lYw interfaceC1362600lYw, InterfaceC897330ZId interfaceC897330ZId) {
        C0ZE7 activityStatusParams;
        Bundle bundle;
        super(view);
        this.LL = sharePanelViewModel;
        this.LLILLJJLI = interfaceC1362600lYw;
        this.LLILLL = false;
        this.LLILZ = interfaceC897330ZId;
        this.LLJILLL = new C1362940lZU(sharePanelViewModel, interfaceC1362600lYw);
        InterfaceC1363370laB interfaceC1363370laB = this.LL.LLIZLLLIL;
        String string = null;
        if (interfaceC1363370laB != null && (activityStatusParams = interfaceC1363370laB.getActivityStatusParams()) != null) {
            activityStatusParams.LJFF = "long_press_panel";
        } else {
            activityStatusParams = null;
        }
        this.LLJJ = activityStatusParams;
        this.LLJJI = new C1361580lXI();
        C1841350y17 c1841350y17 = (C1841350y17) view.findViewById(R.id.sp_);
        this.LLILZIL = c1841350y17;
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.cuv);
        this.LLILZLL = c197039127h;
        this.LLIZ = (TextView) view.findViewById(R.id.p0w);
        this.LLIZLLLIL = (SmartAvatarImageView) view.findViewById(R.id.biz);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.l3l);
        this.LLJ = constraintLayout;
        N5((C427920GqE) view.findViewById(R.id.a6g));
        c197039127h.setButtonVariant(1);
        C786410Ut5.LLLLLLJ(c197039127h, 0);
        C786410Ut5.LLLLZ(c1841350y17, 8);
        C2211751BhN.LIZ(view, this.LLJJI);
        AwS387S0200000_21 awS387S0200000_21 = new AwS387S0200000_21(this, view, 98);
        c1841350y17.setClickable(false);
        C786410Ut5.U8(c197039127h, new ACListenerS155S0100000_21(awS387S0200000_21, 261));
        C786410Ut5.Y7(constraintLayout, new ACListenerS155S0100000_21(awS387S0200000_21, 261));
        SharePackage sharePackage = this.LL.LL;
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            string = bundle.getString("panel_source");
        }
        int iLIZLLL = C1369210ljb.LIZLLL(string);
        C01GW c01gw = C1367480lgo.LIZ;
        if (C1367480lgo.LIZIZ(this.LL.LL) && iLIZLLL == 1) {
            C786410Ut5.U8(c197039127h, new ACListenerS124S0200000_21(view, this, 90));
            C786410Ut5.Y7(constraintLayout, new ACListenerS124S0200000_21(view, this, 91));
            c197039127h.setButtonVariant(0);
            c197039127h.setWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78)));
            c197039127h.setMinTextSize(9.0f);
        }
        this.LLJJIJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1575));
        this.LLJJJ = C2296808zG.LIZ(this.LL.LLJL.LL.plus(C2108208Ns.LIZ));
        this.LLJJJIL = new C0NYY() { // from class: X.0ZHC
            @Override // X.C0NYY
            public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                String strLJIIIZ;
                IMContact iMContact = this.LL.LLJI;
                if (iMContact == null) {
                    return Unit.LIZ;
                }
                ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
                if (contactFeatureLIZ != null) {
                    strLJIIIZ = contactFeatureLIZ.LJIIIZ(iMContact);
                } else {
                    strLJIIIZ = null;
                }
                if (!map.containsKey(strLJIIIZ)) {
                    return Unit.LIZ;
                }
                C429270GsP c429270GsPLIZIZ = C896480ZEw.LIZIZ(map.get(strLJIIIZ));
                boolean zLIZ = C429290GsR.LIZ(c429270GsPLIZIZ);
                C1363960lb8 c1363960lb8 = this.LL;
                if (c1363960lb8.LLJJIII == zLIZ) {
                    return Unit.LIZ;
                }
                c1363960lb8.LLJJIII = zLIZ;
                c1363960lb8.P5(iMContact, c429270GsPLIZIZ);
                return Unit.LIZ;
            }
        };
    }

    public final void I5(IMContact iMContact, int i, boolean z, boolean z2, SharePanelViewModel sharePanelViewModel, InterfaceC497601wk interfaceC497601wk, C05YD c05yd, int i2) {
        float f;
        AbstractC595720NYc abstractC595720NYcLJ;
        C0NZ5 c0nz5;
        C595660NXw c595660NXw;
        AnonymousClass0956 anonymousClass0956LIZ;
        View viewLJLLLL;
        C427920GqE c427920GqE;
        this.LLJI = iMContact;
        this.LLJJI.LIZ(iMContact, "SHARE_PANEL", new AwS422S0200000_21(iMContact, this, 126));
        this.LLJIJIL = i;
        this.LL = sharePanelViewModel;
        iMContact.displayPosition = i2;
        String displayName = iMContact.getDisplayName();
        if (displayName == null) {
            displayName = C1364100lbM.LIZ("");
        }
        if (iMContact instanceof IMUser) {
            this.LLIZ.setText(C1243240iSQ.LIZJ(C1243240iSQ.LIZ, (IMUser) iMContact, displayName));
        } else {
            this.LLIZ.setText(displayName);
        }
        R5(z);
        this.LLILZIL.setChecked(z2);
        View view = this.itemView;
        if (this.LLJILJILJ) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.T4(view, f);
        ((IDMAvatarLoader) this.LLJJIJI.getValue()).LJ(iMContact, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
        this.LLJILLL.LIZLLL = iMContact;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (C896370ZEl.LIZ() && this.LLJILJIL == null) {
            ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.a5t);
            if (viewStub != null) {
                viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            } else {
                viewLJLLLL = null;
            }
            if (viewLJLLLL instanceof C427920GqE) {
                c427920GqE = (C427920GqE) viewLJLLLL;
            } else {
                c427920GqE = null;
            }
            N5(c427920GqE);
        }
        C0ZJ7.LIZ(this.itemView);
        IActiveStatusObserverProducer.LIZ.getClass();
        IActiveStatusObserverProducer iActiveStatusObserverProducerLIZ = C1362550lYr.LIZ();
        if (iActiveStatusObserverProducerLIZ != null) {
            abstractC595720NYcLJ = iActiveStatusObserverProducerLIZ.LJ(iMContact);
        } else {
            abstractC595720NYcLJ = null;
        }
        if (C595800NYk.LIZ().imitateLiveDataInShareScenario) {
            AnonymousClass0956 anonymousClass0956 = this.LLJJIJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            InterfaceC897330ZId interfaceC897330ZId = this.LLILZ;
            if (interfaceC897330ZId != null && abstractC595720NYcLJ != null) {
                c0nz5 = new C0NZ5(interfaceC897330ZId, abstractC595720NYcLJ);
                c595660NXw = (C595660NXw) c0nz5.LIZJ.getValue();
            } else {
                c0nz5 = null;
                c595660NXw = null;
            }
            P5(iMContact, C896480ZEw.LIZIZ(c595660NXw));
            if (c0nz5 != null) {
                anonymousClass0956LIZ = c0nz5.LIZ(this.LLJJJ, new C882140Yj6(this, iMContact, null));
            } else {
                anonymousClass0956LIZ = null;
            }
            this.LLJJIJIL = anonymousClass0956LIZ;
        } else {
            InterfaceC897380ZIi.LIZIZ.getClass();
            C595660NXw c595660NXwLIZIZ = C897370ZIh.LIZ().LIZIZ(abstractC595720NYcLJ);
            this.LLJJIII = C896480ZEw.LIZJ(c595660NXwLIZIZ);
            P5(iMContact, C896480ZEw.LIZIZ(c595660NXwLIZIZ));
        }
        AnonymousClass0956 anonymousClass09562 = this.LLJJIJIIJIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        if (interfaceC497601wk != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C323600CmM(c05yd, this, null), 3);
        }
        this.LLJJIJIIJIL = anonymousClass0956LIZLLL;
    }
}

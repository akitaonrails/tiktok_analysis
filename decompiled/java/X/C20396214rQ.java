package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookPolymerizationDialog;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookUEOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestPlayToolListUiOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14rQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20396214rQ extends C09AY implements Function0<C1117360fBO> {
    public final /* synthetic */ PlaybookPolymerizationDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20396214rQ(PlaybookPolymerizationDialog playbookPolymerizationDialog) {
        super(0);
        this.LL = playbookPolymerizationDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1117360fBO invoke() {
        C1117360fBO c1117360fBO = new C1117360fBO();
        final PlaybookPolymerizationDialog playbookPolymerizationDialog = this.LL;
        c1117360fBO.LLLI(C20390914qZ.class, new C20398514rn(playbookPolymerizationDialog.FS(), EnumC992490bvz.RECOMMENDATIONS_TYPE, playbookPolymerizationDialog.LLJZIJLIL, 8));
        if (MultiGuestPlayToolListUiOptSetting.INSTANCE.isEnable()) {
            final PlaybookAnchorViewModel playbookAnchorViewModel = playbookPolymerizationDialog.LLL;
            final DataChannel dataChannel = playbookPolymerizationDialog.LLJZIJLIL;
            c1117360fBO.LLLI(C20408114tL.class, new AbstractC960460b6K<C20408114tL, C937220aUq>(playbookAnchorViewModel, playbookPolymerizationDialog, dataChannel, playbookPolymerizationDialog) { // from class: X.0aUs
                public final PlaybookAnchorViewModel LIZIZ;
                public final LifecycleOwner LIZJ;
                public final DataChannel LIZLLL;
                public final InterfaceC937090aUd LJ;

                @Override // X.C0J8P
                public final void LJFF(RecyclerView.ViewHolder viewHolder) {
                    viewHolder.getClass();
                }

                @Override // X.C0J8P
                public final void LJI(RecyclerView.ViewHolder viewHolder) {
                    viewHolder.getClass();
                }

                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    return new C937220aUq(C786410Ut5.Td(layoutInflater, R.layout.hba, viewGroup, false), this.LIZIZ, this.LIZLLL, this.LIZJ, this.LJ);
                }

                {
                    this.LIZIZ = playbookAnchorViewModel;
                    this.LIZJ = playbookPolymerizationDialog;
                    this.LIZLLL = dataChannel;
                    this.LJ = playbookPolymerizationDialog;
                }
            });
        } else {
            final PlaybookAnchorViewModel playbookAnchorViewModel2 = playbookPolymerizationDialog.LLL;
            final DataChannel dataChannel2 = playbookPolymerizationDialog.LLJZIJLIL;
            c1117360fBO.LLLI(C20408114tL.class, new AbstractC960460b6K<C20408114tL, C937020aUW>(playbookAnchorViewModel2, playbookPolymerizationDialog, dataChannel2, playbookPolymerizationDialog) { // from class: X.0aUZ
                public final PlaybookAnchorViewModel LIZIZ;
                public final LifecycleOwner LIZJ;
                public final DataChannel LIZLLL;
                public final InterfaceC937090aUd LJ;

                @Override // X.C0J8P
                public final void LJFF(RecyclerView.ViewHolder viewHolder) {
                    C937020aUW c937020aUW = (C937020aUW) viewHolder;
                    c937020aUW.V5();
                    c937020aUW.U5();
                    c937020aUW.T5();
                    c937020aUW.W5();
                }

                @Override // X.C0J8P
                public final void LJI(RecyclerView.ViewHolder viewHolder) {
                    viewHolder.getClass();
                }

                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    return new C937020aUW(C786410Ut5.Td(layoutInflater, R.layout.h_g, viewGroup, false), this.LIZIZ, this.LIZLLL, this.LIZJ, this.LJ);
                }

                {
                    this.LIZIZ = playbookAnchorViewModel2;
                    this.LIZJ = playbookPolymerizationDialog;
                    this.LIZLLL = dataChannel2;
                    this.LJ = playbookPolymerizationDialog;
                }
            });
        }
        final PlaybookAnchorViewModel playbookAnchorViewModel3 = playbookPolymerizationDialog.LLL;
        final DataChannel dataChannel3 = playbookPolymerizationDialog.LLJZIJLIL;
        final C20394514r9 c20394514r9FS = playbookPolymerizationDialog.FS();
        final EnumC20429714wp enumC20429714wp = playbookPolymerizationDialog.HS() ? EnumC20429714wp.MULTI_GUEST_FUN_KIT : EnumC20429714wp.MULTI_GUEST_ICON;
        c1117360fBO.LLLI(C20390514qV.class, new AbstractC960460b6K<C20390514qV, C20398214rk>(playbookAnchorViewModel3, playbookPolymerizationDialog, dataChannel3, c20394514r9FS, enumC20429714wp) { // from class: X.14rY
            public final PlaybookAnchorViewModel LIZIZ;
            public final LifecycleOwner LIZJ;
            public final DataChannel LIZLLL;
            public final InterfaceC20406814t8 LJ;
            public final EnumC20429714wp LJFF;

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C20398214rk(C786410Ut5.Td(layoutInflater, R.layout.h_f, viewGroup, false), this.LIZIZ, this.LIZLLL, this.LIZJ, this.LJ, true, this.LJFF);
            }

            {
                this.LIZIZ = playbookAnchorViewModel3;
                this.LIZJ = playbookPolymerizationDialog;
                this.LIZLLL = dataChannel3;
                this.LJ = c20394514r9FS;
                this.LJFF = enumC20429714wp;
            }
        });
        if (MultiGuestPlaybookUEOptSetting.INSTANCE.isEnable()) {
            c1117360fBO.LLLI(C1890520zIQ.class, new AbstractC960460b6K<C1890520zIQ, C1890490zIN>() { // from class: X.0zIO
                @Override // X.C0J8P
                public final void LJFF(RecyclerView.ViewHolder viewHolder) {
                    C500260Jjc.LJLJLJ(viewHolder.itemView, true);
                }

                @Override // X.C0J8P
                public final void LJI(RecyclerView.ViewHolder viewHolder) {
                    C500260Jjc.LJLJLJ(viewHolder.itemView, false);
                }

                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    return new AbstractC960470b6L<C1890520zIQ>(C786410Ut5.Td(layoutInflater, R.layout.h_i, viewGroup, false)) { // from class: X.0zIN
                        {
                            int i;
                            super(view);
                            View view = this.itemView;
                            Context context = view.getContext();
                            if (C500260Jjc.LJJIL() && C960203pA.LIZIZ(view.getContext())) {
                                i = R.attr.ezk;
                            } else {
                                i = R.attr.ext;
                            }
                            view.setBackgroundColor(C20736316Cj.LIZIZ(i, context));
                        }

                        @Override // X.AbstractC960470b6L
                        public final void I5(int i, Object obj) {
                            C1890520zIQ c1890520zIQ = (C1890520zIQ) obj;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onBindViewHolder: ");
                            sbLIZ.append(c1890520zIQ);
                            C20441214yg.LIZIZ("PlaybookPolymerizationLoadingViewBinder", C2188811AlT.LIZIZ(sbLIZ));
                            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                            layoutParams.height = c1890520zIQ.LIZ;
                            C786410Ut5.W5(this.itemView, layoutParams);
                        }
                    };
                }
            });
            c1117360fBO.LLLI(C20407814tI.class, new C20402314sP(playbookPolymerizationDialog.FS(), false));
            c1117360fBO.LLLI(C1890550zIT.class, new C1890540zIS(false));
        }
        if (playbookPolymerizationDialog.HS()) {
            c1117360fBO.LLLI(C20408214tM.class, new AbstractC960460b6K<C20408214tM, C949690aox>(playbookPolymerizationDialog, playbookPolymerizationDialog) { // from class: X.0aoy
                public final InterfaceC937090aUd LIZIZ;
                public final LifecycleOwner LIZJ;

                {
                    this.LIZIZ = playbookPolymerizationDialog;
                    this.LIZJ = playbookPolymerizationDialog;
                }

                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    return new C949690aox(C786410Ut5.Td(layoutInflater, R.layout.h_h, viewGroup, false), this.LIZIZ, this.LIZJ);
                }
            });
        }
        return c1117360fBO;
    }
}

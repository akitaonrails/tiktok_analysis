package X;

import Y.ACListenerS116S0200000_12;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.profile.service.ILiveProfileService;
import com.bytedance.android.live.usermanage.model.AdminUserBean;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.moderator.ModeratorListChannel;
import com.bytedance.android.livesdk.usercard.TryModeLiveProfileDialog;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0Tc5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C750390Tc5 extends AbstractC749630Tar implements InterfaceC749850TbD {
    public C1099610eil LL;
    public C16F5 LLILLJJLI;
    public C16F5 LLILLL;
    public ConstraintLayout LLILZ;
    public View LLILZIL;
    public TextView LLILZLL;
    public TextView LLIZ;
    public final Context LLIZLLLIL;
    public C750740Tce LLJ;
    public final long LLJI;
    public final long LLJIJIL;
    public final boolean LLJILJIL;
    public final String LLJILJILJ;
    public final DataChannel LLJILLL;
    public final List<C750740Tce> LLJJ;
    public EnumC748580TYa LLJJI;
    public final boolean LLJJIII;
    public LiveIconView LLJJIJI;
    public final ACListenerS147S0100000_12 LLJJIJIIJIL;

    @Override // X.InterfaceC749850TbD
    public final void Xa(int i) {
    }

    @Override // X.InterfaceC749850TbD
    public final void gx(int i, Exception exc) {
    }

    @Override // X.InterfaceC749850TbD
    public final void il(AdminUserBean adminUserBean, Exception exc) {
    }

    public final int I5() {
        List list = (List) this.LLJILLL.gg0(ModeratorListChannel.class);
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void L5() {
        if (this.LLJ == null) {
            return;
        }
        if (C500260Jjc.LJJJIL(this.LLJILLL)) {
            TryModeLiveProfileDialog tryModeLiveProfileDialogHG1 = ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).HG1(this.LLJ.LIZ, null);
            FragmentManager fragmentManager = (FragmentManager) this.LLJILLL.gg0(C748880TZe.class);
            if (fragmentManager != null) {
                tryModeLiveProfileDialogHG1.NR(fragmentManager);
                return;
            }
            return;
        }
        if (C500260Jjc.LJJIJLIJ() || C500260Jjc.LJIJJLI(this.LLJILLL) || C500260Jjc.LJIJJ(this.LLJILLL)) {
            HashMap map = new HashMap();
            C750740Tce c750740Tce = this.LLJ;
            map.put("sec_user_id", c750740Tce != null ? c750740Tce.LIZIZ : "");
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openUserProfilePage(this.LLJ.LIZ, map);
            return;
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(this.LLJ.LIZ);
        if (this.LLJJIII) {
            userProfileEvent.mSource = "multi_guest_panel";
        } else {
            userProfileEvent.mSource = "unknown";
        }
        userProfileEvent.clickModule = "moderator_setting";
        userProfileEvent.mReportType = "report_user";
        C784440Upu.LIZ().LIZIZ(userProfileEvent);
    }

    @Override // X.InterfaceC749850TbD
    public final void Rk(Exception exc) {
        C786410Ut5.LL(0, this.LLILZ);
        C786410Ut5.LJLLLLLL(8, this.LLILZIL);
        C501540Jlg.LIZJ(this.LLIZLLLIL, exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC749630Tar
    public final <T> void V2(T t) {
        EnumC748580TYa enumC748580TYa;
        if (t instanceof C750740Tce) {
            C750740Tce c750740Tce = (C750740Tce) t;
            this.LLJ = c750740Tce;
            ImageModel imageModel = c750740Tce.LJ;
            if (imageModel != null) {
                C0JSS.LJII(this.LL, imageModel);
            } else {
                this.LL.setImageResource(R.drawable.el_);
            }
            if (this.LLJILJIL) {
                boolean z = this.LLJ.LJII;
                if ("moderator_panel".equals(this.LLJILJILJ)) {
                    enumC748580TYa = EnumC748580TYa.MODERATOR_LIST;
                } else {
                    enumC748580TYa = EnumC748580TYa.MANAGE_MODERATOR;
                }
                this.LLJJI = enumC748580TYa;
                if (enumC748580TYa == EnumC748580TYa.MODERATOR_LIST) {
                    if (z) {
                        LiveIconView liveIconView = this.LLJJIJI;
                        if (liveIconView != null) {
                            C786410Ut5.LLJJIJIL(liveIconView, 0);
                        }
                        ConstraintLayout constraintLayout = this.LLILZ;
                        if (constraintLayout != null) {
                            C786410Ut5.LL(8, constraintLayout);
                        }
                        C1570050qxX.LIZ(this.LLJJIJIIJIL, this.itemView);
                    } else {
                        LiveIconView liveIconView2 = this.LLJJIJI;
                        if (liveIconView2 != null) {
                            C786410Ut5.LLJJIJIL(liveIconView2, 8);
                        }
                        ConstraintLayout constraintLayout2 = this.LLILZ;
                        if (constraintLayout2 != null) {
                            C786410Ut5.LL(0, constraintLayout2);
                            N5(this.LLILLJJLI, true);
                            N5(this.LLILLL, z);
                            this.LLILZ.setSelected(true);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("isAdmin: ");
                            sbLIZ.append(this.LLJ.LJII);
                            sbLIZ.append(", name: ");
                            sbLIZ.append(this.LLJ.LIZJ);
                            C20441214yg.LIZIZ("AdminMonitor#click", C2188811AlT.LIZIZ(sbLIZ));
                            C1570050qxX.LIZ(this.LLJJIJIIJIL, this.LLILZ);
                        }
                    }
                } else {
                    LiveIconView liveIconView3 = this.LLJJIJI;
                    if (liveIconView3 != null) {
                        C786410Ut5.LLJJIJIL(liveIconView3, 8);
                    }
                    ConstraintLayout constraintLayout3 = this.LLILZ;
                    if (constraintLayout3 != null) {
                        C786410Ut5.LL(0, constraintLayout3);
                        boolean z2 = !z;
                        N5(this.LLILLJJLI, z2);
                        N5(this.LLILLL, z);
                        if (z) {
                            C786410Ut5.Y7(this.LLILZ, new ACListenerS116S0200000_12(this, enumC748580TYa, 100));
                        } else {
                            C1570050qxX.LIZ(this.LLJJIJIIJIL, this.LLILZ);
                        }
                        this.LLILZ.setSelected(z2);
                    }
                }
            }
            C786410Ut5.H8(this.LL, new ACListenerS147S0100000_12(this, 471));
            TextView textView = this.LLIZ;
            if (textView != null) {
                C786410Ut5.T7(textView, new ACListenerS147S0100000_12(this, 472));
                if (this.LLJJI == EnumC748580TYa.MODERATOR_LIST) {
                    TextView textView2 = this.LLIZ;
                    C750740Tce c750740Tce2 = this.LLJ;
                    textView2.setText(C0KVU.LIZIZ(c750740Tce2.LIZLLL, c750740Tce2.LIZJ));
                } else {
                    TextView textView3 = this.LLIZ;
                    C750740Tce c750740Tce3 = this.LLJ;
                    textView3.setText(C0KVU.LIZIZ(c750740Tce3.LIZLLL, c750740Tce3.LIZJ));
                }
            }
            TextView textView4 = this.LLILZLL;
            if (textView4 != null) {
                C786410Ut5.T7(textView4, new ACListenerS147S0100000_12(this, 473));
                String str = this.LLJ.LJIIJ;
                if (str != null && !str.isEmpty()) {
                    this.LLILZLL.setText(str);
                } else {
                    this.LLILZLL.setText(this.LLJ.LIZJ);
                }
            }
        }
    }

    public static void N5(C16F5 c16f5, boolean z) {
        if (c16f5 != null) {
            if (z) {
                C786410Ut5.LJLLLLLL(0, c16f5);
            } else {
                C786410Ut5.LJLLLLLL(4, c16f5);
            }
        }
    }

    @Override // X.InterfaceC749850TbD
    public final void OO(long j, boolean z) {
        List<C750740Tce> list;
        C786410Ut5.LJLLLLLL(8, this.LLILZIL);
        C786410Ut5.LL(0, this.LLILZ);
        this.LLJ.LJII = z;
        C784440Upu.LIZ().LIZIZ(new C749730Tb1(j));
        if (this.LLJJI == EnumC748580TYa.MANAGE_MODERATOR && !z && (list = (List) this.LLJILLL.gg0(ModeratorListChannel.class)) != null) {
            for (C750740Tce c750740Tce : list) {
                if (c750740Tce.LIZ == j) {
                    list.remove(c750740Tce);
                    return;
                }
            }
        }
    }

    public C750390Tc5(DataChannel dataChannel, View view, String str, long j, long j2, boolean z, List<C750740Tce> list, boolean z2) {
        super(0, view);
        this.LLJJIJIIJIL = new ACListenerS147S0100000_12(this, 474);
        this.LLIZLLLIL = view.getContext();
        this.LLJI = j;
        this.LLJILJIL = z;
        this.LLJIJIL = j2;
        this.LLJILLL = dataChannel;
        this.LLJILJILJ = str;
        this.LLJJIII = z2;
        this.LLJJ = list;
        this.LLILZ = (ConstraintLayout) view.findViewById(R.id.a3w);
        this.LLILLL = (C16F5) view.findViewById(R.id.t5w);
        this.LL = (C1099610eil) view.findViewById(R.id.jjh);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.goi);
        this.LLILZIL = view.findViewById(R.id.dbc);
        this.LLILZLL = (TextView) view.findViewById(R.id.user_tag);
        this.LLIZ = (TextView) view.findViewById(R.id.user_name);
        this.LLJJIJI = (LiveIconView) view.findViewById(R.id.tk9);
    }
}

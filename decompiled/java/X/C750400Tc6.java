package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.ImageModel;
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

/* JADX INFO: renamed from: X.0Tc6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C750400Tc6 extends AbstractC749630Tar implements InterfaceC749850TbD {
    public C1099610eil LL;
    public TextView LLILLJJLI;
    public View LLILLL;
    public C16FS LLILZ;
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
        List list;
        DataChannel dataChannel = this.LLJILLL;
        if (dataChannel == null || (list = (List) dataChannel.gg0(ModeratorListChannel.class)) == null) {
            return 0;
        }
        return list.size();
    }

    public final void L5() {
        FragmentManager fragmentManager;
        if (this.LLJ == null) {
            return;
        }
        if (C500260Jjc.LJJJIL(this.LLJILLL)) {
            TryModeLiveProfileDialog tryModeLiveProfileDialogHG1 = ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).HG1(this.LLJ.LIZ, null);
            DataChannel dataChannel = this.LLJILLL;
            if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
                return;
            }
            tryModeLiveProfileDialogHG1.NR(fragmentManager);
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
        C786410Ut5.LLIL(this.LLILLJJLI, 0);
        C786410Ut5.LJLLLLLL(8, this.LLILZIL);
        C501540Jlg.LIZJ(this.LLIZLLLIL, exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC749630Tar
    public final <T> void V2(T t) {
        EnumC748580TYa enumC748580TYa;
        int i;
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
                TextView textView = this.LLILLJJLI;
                if (textView != null) {
                    C786410Ut5.LLIL(textView, 8);
                }
                C16FS c16fs = this.LLILZ;
                if (c16fs != null) {
                    C786410Ut5.LLJJJ(c16fs, 8);
                }
                boolean z = this.LLJ.LJII;
                if ("moderator_panel".equals(this.LLJILJILJ)) {
                    enumC748580TYa = EnumC748580TYa.MODERATOR_LIST;
                } else {
                    enumC748580TYa = EnumC748580TYa.MANAGE_MODERATOR;
                }
                this.LLJJI = enumC748580TYa;
                if (!C500260Jjc.LJJJIL(this.LLJILLL)) {
                    if (this.LLJJI != EnumC748580TYa.MODERATOR_LIST && z) {
                        View view = this.LLILLL;
                        if (view != null) {
                            C786410Ut5.LJLLLLLL(0, view);
                        }
                        TextView textView2 = this.LLILLJJLI;
                        if (textView2 != null) {
                            C786410Ut5.LLIL(textView2, 0);
                            this.LLILLJJLI.setText(2131843852);
                            this.LLILLJJLI.setBackground(C800330VaR.LIZIZ(this.LLIZLLLIL, R.drawable.dow));
                            this.LLILLJJLI.setTextColor(C497740JfY.LIZLLL(R.attr.ewy, this.LLIZLLLIL));
                            C786410Ut5.T7(this.LLILLJJLI, new ACListenerS147S0100000_12(this, 467));
                        }
                    } else {
                        C786410Ut5.LLJJJ(this.LLILZ, 0);
                        C16FS c16fs2 = this.LLILZ;
                        if (z) {
                            i = 2131843152;
                        } else {
                            i = 2131843126;
                        }
                        c16fs2.setText(i);
                        C1570050qxX.LIZ(new ACListenerS147S0100000_12(this, 466), this.LLILZ);
                    }
                }
            }
            C786410Ut5.H8(this.LL, new ACListenerS147S0100000_12(this, 468));
            TextView textView3 = this.LLIZ;
            if (textView3 != null) {
                C786410Ut5.T7(textView3, new ACListenerS147S0100000_12(this, 469));
                if (this.LLJJI == EnumC748580TYa.MODERATOR_LIST) {
                    TextView textView4 = this.LLIZ;
                    C750740Tce c750740Tce2 = this.LLJ;
                    textView4.setText(C0KVU.LIZIZ(c750740Tce2.LIZLLL, c750740Tce2.LIZJ));
                } else {
                    this.LLIZ.setText(this.LLJ.LIZLLL);
                }
            }
            TextView textView5 = this.LLILZLL;
            if (textView5 != null) {
                C786410Ut5.T7(textView5, new ACListenerS147S0100000_12(this, 470));
                if (this.LLJJI == EnumC748580TYa.MODERATOR_LIST) {
                    this.LLILZLL.setText(this.LLJ.LJIIJ);
                } else {
                    this.LLILZLL.setText(this.LLJ.LIZJ);
                }
            }
        }
    }

    @Override // X.InterfaceC749850TbD
    public final void OO(long j, boolean z) {
        DataChannel dataChannel;
        List<C750740Tce> list;
        C786410Ut5.LJLLLLLL(8, this.LLILZIL);
        this.LLJ.LJII = z;
        C784440Upu.LIZ().LIZIZ(new C749730Tb1(j));
        if (this.LLJJI == EnumC748580TYa.MANAGE_MODERATOR && !z && (dataChannel = this.LLJILLL) != null && (list = (List) dataChannel.gg0(ModeratorListChannel.class)) != null) {
            for (C750740Tce c750740Tce : list) {
                if (c750740Tce.LIZ == j) {
                    list.remove(c750740Tce);
                    return;
                }
            }
        }
    }

    public C750400Tc6(DataChannel dataChannel, View view, String str, long j, long j2, boolean z, List<C750740Tce> list, boolean z2) {
        super(0, view);
        this.LLIZLLLIL = view.getContext();
        this.LLJI = j;
        this.LLJILJIL = z;
        this.LLJIJIL = j2;
        this.LLJILLL = dataChannel;
        this.LLJILJILJ = str;
        this.LLJJIII = z2;
        this.LLJJ = list;
        this.LL = (C1099610eil) view.findViewById(R.id.jjh);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.db0);
        this.LLILLL = view.findViewById(R.id.db9);
        this.LLILZ = (C16FS) view.findViewById(R.id.goi);
        this.LLILZIL = view.findViewById(R.id.dbc);
        this.LLILZLL = (TextView) view.findViewById(R.id.user_tag);
        this.LLIZ = (TextView) view.findViewById(R.id.user_name);
    }
}

package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.api.game.GameLivePhoneCameraLinkType;
import com.bytedance.android.livesdk.game.broadcast.fragment.GamePhoneCameraWiredFragment;
import com.bytedance.android.livesdk.game.broadcast.service.ForegroundMirrorCastService;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.common.applog.AppLog;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0TLP, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TLP extends AbstractC21673619ry<C0TLQ> {
    public final View LL;
    public int LLILLJJLI;
    public final DataChannel LLILLL;
    public final List<C0TLR> LLILZ = C1697810uHb.LJIIJJI(new C0TLR(C497740JfY.LJIJI(2131853610)), new C0TLR(C497740JfY.LJIJI(2131853609)));

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return 2;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        boolean z;
        C0TLQ c0tlq = (C0TLQ) viewHolder;
        C0TLR c0tlr = (C0TLR) C13LP.LJJJLZIJ(i, c0tlq.LL.LLILZ);
        if (c0tlr != null) {
            View viewFindViewById = c0tlq.itemView.findViewById(R.id.dle);
            final C0TLP c0tlp = c0tlq.LL;
            final C127K c127k = (C127K) viewFindViewById;
            c127k.setTitle(c0tlr.LIZ);
            if (i == 0) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_wifi;
                c419910GdJ.LJ = Integer.valueOf(R.attr.ey7);
                c127k.setIcon(c419910GdJ);
            } else {
                c127k.setIcon(new AwS591S0100000_12(c127k, 761));
            }
            final AnonymousClass1278 anonymousClass1278 = new AnonymousClass1278(c127k.getContext());
            if (c0tlp.LLILLJJLI == i) {
                z = true;
            } else {
                z = false;
            }
            anonymousClass1278.LJIILJJIL(z);
            anonymousClass1278.LJIILLIIL(new CompoundButton.OnCheckedChangeListener() { // from class: X.0TJ2
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    Object obj;
                    C19EG c19egLIZ;
                    FragmentManager supportFragmentManager;
                    C19EH c19ehLJIIJ;
                    C19EG c19egLIZ2;
                    FragmentManager supportFragmentManager2;
                    if (this.LL.LLILLJJLI != i && anonymousClass1278.LJIILIIL()) {
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_phone_camera_connect_page_action");
                        c474500IjALIZ.LJJII("click", "action");
                        c474500IjALIZ.LJJII(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId(), "device_id");
                        String str = "wireless";
                        if (i == 0) {
                            obj = "wireless";
                        } else {
                            obj = "wired";
                        }
                        c474500IjALIZ.LJJII(obj, "click_type");
                        if (i == 0) {
                            str = "wired";
                        }
                        c474500IjALIZ.LJJII(str, "show_page");
                        c474500IjALIZ.LIZ();
                        C0TLP c0tlp2 = this.LL;
                        int i2 = i;
                        c0tlp2.LLILLJJLI = i2;
                        DataChannel dataChannel = c0tlp2.LLILLL;
                        if (dataChannel != null) {
                            dataChannel.zW(GameLivePhoneCameraLinkType.class, Integer.valueOf(i2));
                        }
                        if (i == 0) {
                            Context context = c127k.getContext();
                            if (context != null && (c19egLIZ2 = C1124140fMK.LIZ(context)) != null && (supportFragmentManager2 = c19egLIZ2.getSupportFragmentManager()) != null) {
                                supportFragmentManager2.LJLLILLLL();
                            }
                            String str2 = TuxSheet._pnsPageId;
                            C1391190mJ3.LJ(this.LL.LL, C343970De7.LIZ);
                        } else {
                            if (C744020TGm.LIZLLL || ForegroundMirrorCastService.isCreate()) {
                                C744020TGm.LJIIIZ(true);
                            }
                            Context context2 = c127k.getContext();
                            if (context2 != null && (c19egLIZ = C1124140fMK.LIZ(context2)) != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
                                DataChannel dataChannel2 = this.LL.LLILLL;
                                GamePhoneCameraWiredFragment gamePhoneCameraWiredFragment = new GamePhoneCameraWiredFragment();
                                gamePhoneCameraWiredFragment.setArguments(null);
                                gamePhoneCameraWiredFragment.LLJILJIL = dataChannel2;
                                c19ehLJIIJ.LIZIZ(R.id.iiv, gamePhoneCameraWiredFragment);
                                c19ehLJIIJ.LJII(null);
                                c19ehLJIIJ.LJIIIZ();
                            }
                            String str3 = TuxSheet._pnsPageId;
                            C1391190mJ3.LJ(this.LL.LL, C343970De7.LIZ);
                        }
                        this.LL.notifyDataSetChanged();
                    }
                }
            });
            c127k.setAccessory(anonymousClass1278);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0TLQ c0tlq = new C0TLQ(this, C500260Jjc.LJIILL(R.layout.gnk, viewGroup, false));
        try {
            View view = c0tlq.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0tlq.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0tlq.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0TLQ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0tlq.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0tlq.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0TLQ.class.getName();
        return c0tlq;
    }

    public C0TLP(View view, int i, DataChannel dataChannel) {
        this.LL = view;
        this.LLILLJJLI = i;
        this.LLILLL = dataChannel;
    }
}

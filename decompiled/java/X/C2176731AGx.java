package X;

import Y.ACListenerS135S0200000_33;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.setting.LiveCenterNativePageRenew;
import com.bytedance.android.livesdk.broadcast.setting.LiveViolationsDetailedAppealSchemeSetting;
import com.bytedance.android.livesdk.dataChannel.LiveCenterPerceptionAppealChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCenterUpdateAppealChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterStructureOpt;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS28S0200100_12;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.AppealInfo;
import webcast.data.RealtimeViolationRecord;

/* JADX INFO: renamed from: X.1AGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176731AGx extends AbstractC476660Ime {
    public final C16F5 LL;
    public final LiveIconView LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;
    public final ViewGroup LLIZLLLIL;
    public final /* synthetic */ C2176721AGw LLJ;

    @Override // X.AbstractC476660Ime
    public final void L5(long j) {
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 != null) {
            c16f5.setText(C963140bAe.LJIIL(j));
        }
    }

    public final void N5(final RealtimeViolationRecord realtimeViolationRecord) {
        final AppealInfo appealInfo;
        int i;
        int iLIZIZ;
        int iLIZIZ2;
        Drawable drawableLJIIJ = null;
        if (realtimeViolationRecord != null && (appealInfo = realtimeViolationRecord.appealInfo) != null && appealInfo.showAppeal) {
            LiveCenterStructureOpt liveCenterStructureOpt = LiveCenterStructureOpt.INSTANCE;
            int i2 = 2131844160;
            if (liveCenterStructureOpt.isEnable()) {
                int i3 = appealInfo.appealStatus;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            C500260Jjc.LLFFF(this.LLILZLL);
                            C500260Jjc.LJIILIIL(this.LLIZ);
                            C16F5 c16f5 = this.LLILZLL;
                            if (c16f5 != null) {
                                c16f5.setText(C497740JfY.LJIJI(2131844160));
                            }
                            C16F5 c16f52 = this.LLILZLL;
                            if (c16f52 != null) {
                                if (appealInfo.appealStatus == 0) {
                                    iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.ezq, this.LLJ.LL);
                                } else {
                                    iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.ezy, this.LLJ.LL);
                                }
                                c16f52.setTextColor(iLIZIZ2);
                            }
                        } else {
                            C500260Jjc.LLFFF(this.LLIZ);
                            C500260Jjc.LJIILIIL(this.LLILZLL);
                            C16F5 c16f53 = this.LLIZ;
                            if (c16f53 != null) {
                                c16f53.setText(C497740JfY.LJIJI(2131844161));
                            }
                        }
                    } else {
                        C500260Jjc.LLFFF(this.LLIZ);
                        C500260Jjc.LJIILIIL(this.LLILZLL);
                        C16F5 c16f54 = this.LLIZ;
                        if (c16f54 != null) {
                            c16f54.setText(C497740JfY.LJIJI(2131844164));
                        }
                    }
                } else {
                    C500260Jjc.LLFFF(this.LLILZLL);
                    C500260Jjc.LJIILIIL(this.LLIZ);
                    C16F5 c16f55 = this.LLILZLL;
                    if (c16f55 != null) {
                        c16f55.setText(C497740JfY.LJIJI(2131844162));
                    }
                    C16F5 c16f56 = this.LLILZLL;
                    if (c16f56 != null) {
                        if (appealInfo.appealStatus == 0) {
                            iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezq, this.LLJ.LL);
                        } else {
                            iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezy, this.LLJ.LL);
                        }
                        c16f56.setTextColor(iLIZIZ);
                    }
                }
            } else {
                if (!liveCenterStructureOpt.isEnable()) {
                    C500260Jjc.LLFFF(this.LLILZLL);
                }
                C16F5 c16f57 = this.LLILZLL;
                if (c16f57 != null) {
                    int i4 = appealInfo.appealStatus;
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                i2 = 2131844161;
                            }
                        } else {
                            i2 = 2131844164;
                        }
                    } else {
                        i2 = 2131844162;
                    }
                    c16f57.setText(i2);
                }
                C16F5 c16f58 = this.LLILZLL;
                if (c16f58 != null) {
                    int i5 = appealInfo.appealStatus;
                    if (i5 != 0) {
                        if (i5 == 1) {
                            drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.dln);
                        }
                    } else {
                        drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.dlm);
                    }
                    c16f58.setBackground(drawableLJIIJ);
                }
                if (appealInfo.appealStatus == 0) {
                    i = R.attr.exp;
                } else {
                    i = R.attr.c9l;
                }
                C16F5 c16f59 = this.LLILZLL;
                if (c16f59 != null) {
                    c16f59.setTextColor(C20736316Cj.LIZIZ(i, this.LLJ.LL));
                }
            }
            C16F5 c16f510 = this.LLILZLL;
            if (c16f510 != null) {
                final C2176721AGw c2176721AGw = this.LLJ;
                C786410Ut5.l8(c16f510, new View.OnClickListener() { // from class: X.1AGy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String str;
                        PunishEventInfo punishEventInfo = realtimeViolationRecord.punishInfo;
                        if (punishEventInfo != null && (str = punishEventInfo.punishId) != null) {
                            final long j = CastLongProtector.parseLong(str);
                            if (appealInfo.appealStatus == 0) {
                                C12OY.LJIILLIIL(C12OY.LIZ, c2176721AGw.LLILLJJLI, C1AH3.PUNISH.getReportName(), "click", null, 0, null, null, 120);
                                c2176721AGw.LLLI(realtimeViolationRecord);
                                if (appealInfo.hostCenterAppealType == 1) {
                                    String schema = LiveViolationsDetailedAppealSchemeSetting.getSchema();
                                    C2176721AGw c2176721AGw2 = c2176721AGw;
                                    ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(c2176721AGw2.LL, schema, new AwS28S0200100_12(c2176721AGw2, j, realtimeViolationRecord, 2));
                                    final RealtimeViolationRecord realtimeViolationRecord2 = realtimeViolationRecord;
                                    final C2176721AGw c2176721AGw3 = c2176721AGw;
                                    final C2176731AGx c2176731AGx = this;
                                    C1548820qPI.LIZLLL("punish_pre_appeal_finish", new InterfaceC1141530foN() { // from class: X.1AGz
                                        @Override // X.InterfaceC1141530foN
                                        public final void mh2(C262100zr c262100zr) {
                                            String string;
                                            DataChannel dataChannel;
                                            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                                            if (interfaceC1107590evd != null && interfaceC1107590evd.getInt("finishType") == 1) {
                                                InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                                                if (interfaceC1107590evd2 != null) {
                                                    string = interfaceC1107590evd2.getString("punish_id");
                                                } else {
                                                    string = null;
                                                }
                                                if (Intrinsics.LJFF(string, String.valueOf(j))) {
                                                    AppealInfo appealInfo2 = realtimeViolationRecord2.appealInfo;
                                                    if (appealInfo2 != null) {
                                                        appealInfo2.appealStatus = 1;
                                                    }
                                                    if (LiveCenterStructureOpt.INSTANCE.isEnable() && (dataChannel = c2176721AGw3.LLILLJJLI) != null) {
                                                        dataChannel.zW(LiveCenterUpdateAppealChannel.class, realtimeViolationRecord2);
                                                    }
                                                    c2176731AGx.N5(realtimeViolationRecord2);
                                                }
                                            }
                                            C1548820qPI.LJIIIIZZ("punish_pre_appeal_finish", this);
                                        }
                                    });
                                    return;
                                }
                                DataChannel dataChannel = c2176721AGw.LLILLJJLI;
                                if (dataChannel == null) {
                                    return;
                                }
                                dataChannel.zW(LiveCenterPerceptionAppealChannel.class, realtimeViolationRecord);
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        LiveCenterStructureOpt liveCenterStructureOpt2 = LiveCenterStructureOpt.INSTANCE;
        if (liveCenterStructureOpt2.isEnable()) {
            C500260Jjc.LJIILIIL(this.LLILZLL);
            C500260Jjc.LJIILIIL(this.LLIZ);
        } else {
            if (liveCenterStructureOpt2.isEnable()) {
                return;
            }
            C500260Jjc.LJIILIIL(this.LLILZLL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2176731AGx(C2176721AGw c2176721AGw, View view) {
        super(view);
        this.LLJ = c2176721AGw;
        this.LL = (C16F5) view.findViewById(R.id.vzo);
        this.LLILLJJLI = (LiveIconView) view.findViewById(R.id.warning_icon);
        this.LLILLL = (C16F5) view.findViewById(R.id.f12);
        this.LLILZ = (C16F5) view.findViewById(R.id.title);
        this.LLILZIL = (C16F5) view.findViewById(R.id.sut);
        this.LLILZLL = (C16F5) view.findViewById(R.id.b6u);
        this.LLIZ = (C16F5) view.findViewById(R.id.b6t);
        this.LLIZLLLIL = (ViewGroup) view.findViewById(R.id.yat);
    }

    @Override // X.AbstractC476660Ime
    public final void I5(AbstractC476660Ime abstractC476660Ime, RealtimeViolationRecord realtimeViolationRecord) {
        C16F5 c16f5 = this.LLILZLL;
        if (c16f5 != null) {
            C786410Ut5.l8(c16f5, new ACListenerS135S0200000_33(realtimeViolationRecord, this.LLJ, 9));
        }
        realtimeViolationRecord.status = 1;
        if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
            ViewGroup viewGroup = this.LLIZLLLIL;
            if (viewGroup != null) {
                viewGroup.setEnabled(false);
            }
            LiveIconView liveIconView = this.LLILLJJLI;
            if (liveIconView != null) {
                liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.ezt, this.LLJ.LL));
            }
            C16F5 c16f52 = this.LLILLL;
            if (c16f52 != null) {
                c16f52.setTextColor(C20736316Cj.LIZIZ(R.attr.ezs, this.LLJ.LL));
            }
            C16F5 c16f53 = this.LLILZ;
            if (c16f53 != null) {
                c16f53.setTextColor(C20736316Cj.LIZIZ(R.attr.ezs, this.LLJ.LL));
            }
        } else {
            this.itemView.setBackground(this.LLJ.LLLFZ(LiveCenterNativePageRenew.INSTANCE.getFinishedPunishBg()));
            LiveIconView liveIconView2 = this.LLILLJJLI;
            if (liveIconView2 != null) {
                liveIconView2.setIconTint(C20736316Cj.LIZIZ(R.attr.c9m, this.LLJ.LL));
            }
            C16F5 c16f54 = this.LLILLL;
            if (c16f54 != null) {
                c16f54.setTextColor(C20736316Cj.LIZIZ(R.attr.c9m, this.LLJ.LL));
            }
        }
        C16F5 c16f55 = this.LLILLL;
        if (c16f55 != null) {
            c16f55.setText(2131844166);
        }
        this.LLJ.LLILZ.remove(abstractC476660Ime);
        this.LLJ.getClass();
        C2176721AGw.LLLII(realtimeViolationRecord, abstractC476660Ime, true);
    }
}

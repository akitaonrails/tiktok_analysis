package X;

import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.setting.LiveCenterNativePageRenew;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterStructureOpt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import webcast.data.AppealInfo;
import webcast.data.RealtimeViolationRecord;

/* JADX INFO: renamed from: X.1AGw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176721AGw extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final Context LL;
    public final DataChannel LLILLJJLI;
    public List<RealtimeViolationRecord> LLILLL;
    public final Map<AbstractC476660Ime, RealtimeViolationRecord> LLILZ = new LinkedHashMap();
    public BPEAHandler LLILZIL;
    public ARunnableS107S0100000_7 LLILZLL;
    public final LayoutInflater LLIZ;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(simpleDateFormat.getCalendar().getTimeZone());
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<RealtimeViolationRecord> list = this.LLILLL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final Drawable LLLFZ(int i) {
        if (LiveCenterNativePageRenew.INSTANCE.isEnable()) {
            return C800330VaR.LIZIZ(C1834150xpV.LJII(this.LL), i);
        }
        return C800330VaR.LIZIZ(this.LL, i);
    }

    public final void LLLI(RealtimeViolationRecord realtimeViolationRecord) {
        String str;
        int i;
        AppealInfo appealInfo;
        PunishEventInfo punishEventInfo;
        PunishEventInfo punishEventInfo2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_appeal_click");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        String str2 = null;
        if (realtimeViolationRecord != null && (punishEventInfo2 = realtimeViolationRecord.punishInfo) != null) {
            str = punishEventInfo2.punishType;
        } else {
            str = null;
        }
        c474500IjALIZ.LJJII(str, "violation_type");
        if (realtimeViolationRecord != null && (punishEventInfo = realtimeViolationRecord.punishInfo) != null) {
            str2 = punishEventInfo.punishId;
        }
        c474500IjALIZ.LJJII(str2, "record_id");
        if (realtimeViolationRecord != null && (appealInfo = realtimeViolationRecord.appealInfo) != null) {
            i = appealInfo.hostCenterAppealType;
        } else {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "appeal_type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        C19719512Dh.LIZJ(this.LLILZ).remove(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        RealtimeViolationRecord realtimeViolationRecord;
        C2176731AGx c2176731AGx;
        Boolean boolValueOf;
        int i2;
        Integer num;
        int i3;
        List<RealtimeViolationRecord> list = this.LLILLL;
        if (list != null && (realtimeViolationRecord = (RealtimeViolationRecord) ListProtector.get(list, i)) != null) {
            if ((viewHolder instanceof C2176731AGx) && (c2176731AGx = (C2176731AGx) viewHolder) != null) {
                C16F5 c16f5 = c2176731AGx.LLILZ;
                if (c16f5 != null) {
                    c16f5.setText(realtimeViolationRecord.title);
                }
                C16F5 c16f52 = c2176731AGx.LLILZIL;
                if (c16f52 != null) {
                    c16f52.setText(realtimeViolationRecord.reason);
                }
                C16F5 c16f53 = c2176731AGx.LL;
                if (c16f53 != null) {
                    c16f53.setText(realtimeViolationRecord.issueTimeText);
                }
                C16F5 c16f54 = c2176731AGx.LLILZLL;
                AppealInfo appealInfo = realtimeViolationRecord.appealInfo;
                if (appealInfo != null) {
                    boolValueOf = Boolean.valueOf(appealInfo.showAppeal);
                } else {
                    boolValueOf = null;
                }
                C500260Jjc.LJLJLJ(c16f54, C500260Jjc.LJJJI(boolValueOf));
                c2176731AGx.N5(realtimeViolationRecord);
                this.LLILZ.remove(c2176731AGx);
                if (realtimeViolationRecord.status == 0 && ((i2 = realtimeViolationRecord.type) == 1 || i2 == 3 || realtimeViolationRecord.endTime - (C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) > 0)) {
                    int iIntValue = 0;
                    LLLII(realtimeViolationRecord, viewHolder, false);
                    int i4 = realtimeViolationRecord.type;
                    if (i4 == 2) {
                        int iLIZ = (int) (((realtimeViolationRecord.endTime - (C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))) / ((long) 86400)) + 1);
                        if (iLIZ > 1) {
                            C16F5 c16f55 = c2176731AGx.LLILLL;
                            if (c16f55 != null) {
                                c16f55.setText(C497740JfY.LJIIL(2131755596, iLIZ, Integer.valueOf(iLIZ)));
                            }
                        } else {
                            this.LLILZ.put(c2176731AGx, realtimeViolationRecord);
                        }
                    } else if (i4 == 3) {
                        C16F5 c16f56 = c2176731AGx.LLILLL;
                        if (c16f56 != null) {
                            c16f56.setText(2131855628);
                        }
                    } else {
                        PunishEventInfo punishEventInfo = realtimeViolationRecord.punishInfo;
                        if (punishEventInfo != null && (num = punishEventInfo.punishTypeId) != null && num.intValue() == 64 && realtimeViolationRecord.endTime == 0) {
                            C16F5 c16f57 = c2176731AGx.LLILLL;
                            if (c16f57 != null) {
                                c16f57.setText(2131855628);
                            }
                        } else {
                            C16F5 c16f58 = c2176731AGx.LLILLL;
                            if (c16f58 != null) {
                                c16f58.setText(2131844165);
                            }
                        }
                    }
                    if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                        C16F5 c16f59 = c2176731AGx.LLILZ;
                        if (c16f59 != null) {
                            c16f59.setTextColor(C20736316Cj.LIZIZ(R.attr.ezv, this.LL));
                        }
                        c2176731AGx.itemView.setBackground(null);
                        ViewGroup viewGroup = c2176731AGx.LLIZLLLIL;
                        if (viewGroup != null) {
                            viewGroup.setEnabled(true);
                        }
                    } else {
                        c2176731AGx.itemView.setBackground(LLLFZ(LiveCenterNativePageRenew.INSTANCE.getOnGoingPunishBg()));
                        int i5 = realtimeViolationRecord.iconType;
                        if (i5 > 0) {
                            LiveIconView liveIconView = c2176731AGx.LLILLJJLI;
                            if (liveIconView != null) {
                                switch (i5) {
                                    case BdTuring.TYPE_EMAIL /* 11 */:
                                        i3 = R.attr.dtc;
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                    default:
                                        i3 = R.attr.cy5;
                                        break;
                                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                        i3 = R.attr.e99;
                                        break;
                                    case 14:
                                        i3 = R.attr.ei6;
                                        break;
                                    case 15:
                                        i3 = R.attr.efe;
                                        break;
                                    case 16:
                                        i3 = R.attr.czy;
                                        break;
                                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                        i3 = R.attr.eao;
                                        break;
                                    case 19:
                                        i3 = R.attr.e4i;
                                        break;
                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                        i3 = R.attr.cze;
                                        break;
                                }
                                liveIconView.setIconAttr(i3);
                            }
                        } else {
                            LiveIconView liveIconView2 = c2176731AGx.LLILLJJLI;
                            if (liveIconView2 != null) {
                                liveIconView2.setIconAttr(R.attr.dn8);
                            }
                        }
                    }
                    LiveIconView liveIconView3 = c2176731AGx.LLILLJJLI;
                    if (liveIconView3 != null) {
                        liveIconView3.setIconTint(C20736316Cj.LIZIZ(R.attr.ezv, liveIconView3.getContext()));
                    }
                    C16F5 c16f510 = c2176731AGx.LLILLL;
                    if (c16f510 != null) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ezv, this.LL);
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        }
                        c16f510.setTextColor(iIntValue);
                    }
                } else {
                    c2176731AGx.I5((AbstractC476660Ime) viewHolder, realtimeViolationRecord);
                }
            }
            if (i == getItemCount() - 1 && this.LLILZIL == null) {
                BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
                this.LLILZIL = bPEAHandler;
                ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(this, 183);
                this.LLILZLL = aRunnableS107S0100000_7;
                C786410Ut5.LJJZZIII(bPEAHandler, aRunnableS107S0100000_7);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C2176731AGx c2176731AGx = new C2176731AGx(this, C786410Ut5.Td(this.LLIZ, LiveCenterNativePageRenew.INSTANCE.getPunishItemLayoutId(), viewGroup, false));
        try {
            View view = c2176731AGx.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c2176731AGx.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c2176731AGx.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C2176731AGx.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c2176731AGx.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c2176731AGx.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C2176731AGx.class.getName();
        return c2176731AGx;
    }

    public C2176721AGw(Context context, DataChannel dataChannel, List<RealtimeViolationRecord> list) {
        this.LL = context;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = list;
        this.LLIZ = C1834150xpV.LIZJ(C786410Ut5.ne(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLLII(webcast.data.RealtimeViolationRecord r5, androidx.recyclerview.widget.RecyclerView.ViewHolder r6, boolean r7) {
        /*
            java.lang.String r0 = "livesdk_violation_record_card"
            X.0IjA r3 = X.C0IJT.LIZ(r0)
            if (r7 == 0) goto La1
            java.lang.String r1 = "grey"
        La:
            java.lang.String r0 = "card_color"
            r3.LJJII(r1, r0)
            com.bytedance.android.livesdk.model.message.PunishEventInfo r0 = r5.punishInfo
            r2 = 0
            if (r0 == 0) goto L9e
            java.lang.String r1 = r0.punishId
        L16:
            java.lang.String r0 = "record_id"
            r3.LJJII(r1, r0)
            com.bytedance.android.livesdk.model.message.PunishEventInfo r0 = r5.punishInfo
            if (r0 == 0) goto L9c
            java.lang.String r1 = r0.punishType
        L21:
            java.lang.String r0 = "violation_type"
            r3.LJJII(r1, r0)
            com.bytedance.android.livesdk.model.message.PunishEventInfo r0 = r5.punishInfo
            if (r0 == 0) goto L9a
            java.lang.String r1 = r0.punishReason
        L2c:
            java.lang.String r0 = "violation_reason"
            r3.LJJII(r1, r0)
            int r0 = r6.getBindingAdapterPosition()
            r4 = 1
            int r0 = r0 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "client_order"
            r3.LJJII(r1, r0)
            if (r7 == 0) goto L97
            java.lang.String r1 = "restriction_end"
        L45:
            java.lang.String r0 = "restriction_status"
            r3.LJJII(r1, r0)
            webcast.data.AppealInfo r0 = r5.appealInfo
            if (r0 == 0) goto L54
            boolean r0 = r0.showAppeal
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L54:
            boolean r0 = X.C500260Jjc.LJJIJIIJIL(r2)
            if (r0 != 0) goto L94
            webcast.data.AppealInfo r0 = r5.appealInfo
            if (r0 == 0) goto L94
            int r0 = r0.appealStatus
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L94
            int r0 = r2.intValue()
            if (r0 != r4) goto L77
            java.lang.String r1 = "appeal_in_progress"
        L6e:
            java.lang.String r0 = "appeal_status"
            r3.LJJII(r1, r0)
            r3.LIZ()
            return
        L77:
            int r1 = r2.intValue()
            r0 = 3
            if (r1 != r0) goto L81
            java.lang.String r1 = "appeal_not_approved"
            goto L6e
        L81:
            int r0 = r2.intValue()
            if (r0 != 0) goto L8a
            java.lang.String r1 = "appeal"
            goto L6e
        L8a:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L94
            java.lang.String r1 = "appeal_approved"
            goto L6e
        L94:
            java.lang.String r1 = "no_appeal"
            goto L6e
        L97:
            java.lang.String r1 = "restriction"
            goto L45
        L9a:
            r1 = r2
            goto L2c
        L9c:
            r1 = r2
            goto L21
        L9e:
            r1 = r2
            goto L16
        La1:
            java.lang.String r1 = "red"
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2176721AGw.LLLII(webcast.data.RealtimeViolationRecord, androidx.recyclerview.widget.RecyclerView$ViewHolder, boolean):void");
    }

    public final void LLLIIIIL(long j, List list, boolean z) {
        if (LiveCenterStructureOpt.INSTANCE.isEnable() && z) {
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    RealtimeViolationRecord realtimeViolationRecord = (RealtimeViolationRecord) obj;
                    if (realtimeViolationRecord.endTime <= 0 || System.currentTimeMillis() - (realtimeViolationRecord.endTime * 1000) <= j) {
                        arrayList.add(obj);
                    }
                }
                list = new ArrayList(arrayList);
            } else {
                list = null;
            }
        }
        this.LLILLL = list;
        notifyDataSetChanged();
    }
}

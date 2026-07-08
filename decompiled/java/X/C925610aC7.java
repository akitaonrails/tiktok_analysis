package X;

import Y.AObjectS358S0100000_15;
import Y.AcS496S0100000_15;
import Y.AfS172S0100000_3;
import Y.AfS1S0510000_15;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multihost.event.CoHostPunishPermissionChannel;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS2S0420000_15;

/* JADX INFO: renamed from: X.0aC7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925610aC7 {
    public static boolean LIZIZ;
    public static final C929920aJ4 LIZ = new C929920aJ4();
    public static final C11NJ LIZJ = new C11NJ();

    public static void LIZLLL(DataChannel dataChannel, boolean z) {
        boolean z2;
        C914590ZuL c914590ZuL;
        if (dataChannel != null && (c914590ZuL = (C914590ZuL) dataChannel.gg0(CoHostPunishPermissionChannel.class)) != null) {
            z2 = c914590ZuL.LIZ;
        } else {
            z2 = false;
        }
        if (z2 == z) {
            return;
        }
        if (z) {
            if (dataChannel != null) {
                dataChannel.zW(CoHostPunishPermissionChannel.class, new C914590ZuL(true, 2));
            }
        } else {
            if (dataChannel == null) {
                return;
            }
            dataChannel.zW(CoHostPunishPermissionChannel.class, new C914590ZuL(false, 3));
        }
    }

    public static void LIZJ(PerceptionDialogInfo perceptionDialogInfo, PunishEventInfo punishEventInfo, String str, String str2, boolean z, boolean z2) {
        String str3;
        boolean z3;
        Object obj;
        String str4;
        LiveMode streamType;
        if (punishEventInfo != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_violation_popup");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(str, "action_type");
            c474500IjALIZ.LJJII("anchor", "user_type");
            if (z2) {
                str3 = "offlive_invite";
            } else if (z) {
                str3 = "apply_cohost";
            } else {
                str3 = "live";
            }
            c474500IjALIZ.LJJII(str3, "scene_type");
            c474500IjALIZ.LJJII(punishEventInfo.punishId, "record_id");
            c474500IjALIZ.LJJII(punishEventInfo.punishType, "violation_type");
            c474500IjALIZ.LJJII(punishEventInfo.punishReason, "violation_reason");
            c474500IjALIZ.LJJII(Long.valueOf(punishEventInfo.violationUid), "violation_anchor_id");
            c474500IjALIZ.LJJII(str2, "click_tab");
            c474500IjALIZ.LJJII(punishEventInfo.duration, "period");
            if (perceptionDialogInfo != null && perceptionDialogInfo.scene == 11) {
                z3 = true;
            } else {
                z3 = false;
            }
            String str5 = "1";
            if (z3) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(obj, "is_appeal_button");
            String strLIZ = null;
            if (perceptionDialogInfo != null) {
                str4 = perceptionDialogInfo.violationDetailUrl;
            } else {
                str4 = null;
            }
            if (TextUtils.isEmpty(str4)) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str5, "is_detail_button");
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null && (streamType = room.getStreamType()) != null) {
                strLIZ = C354201Zc.LIZ(streamType);
            }
            c474500IjALIZ.LJJII(strLIZ, "live_type");
            c474500IjALIZ.LJJII(punishEventInfo.showReason, "show_reason");
            c474500IjALIZ.LIZ();
        }
    }

    public static void LIZ(DataChannel dataChannel, long j, Function1 function1, Function1 function12, Function0 function0, boolean z, Context context) {
        C11NJ c11nj = LIZJ;
        c11nj.LJ();
        C480460Ism.LIZ().getClass();
        c11nj.LIZ(((CoHostApi) C480460Ism.LIZLLL(CoHostApi.class)).requestViolation(16, j).LJFF(new C0UO0()).LJJIIZ(new AfS1S0510000_15(z, function1, function12, context, dataChannel, function0, 1), new AfS172S0100000_3(function0, 69)));
    }

    public static void LJ(Context context, final PerceptionDialogInfo perceptionDialogInfo, final PunishEventInfo punishEventInfo, final Function1 function1, final Function1 function12, final boolean z, final boolean z2) {
        if (perceptionDialogInfo != null && perceptionDialogInfo.title != null) {
            if (context == null) {
                C20441214yg.LJIIIZ("multi_co_host_violation", "activityContext is null");
            }
            final Context contextLJJIIZI = C520010KaN.LJJIIZI(context, true);
            if (contextLJJIIZI == null) {
                return;
            }
            C929920aJ4 c929920aJ4 = LIZ;
            boolean z3 = LIZIZ;
            ((LinkedList) c929920aJ4.LIZ).add(new Observer() { // from class: X.0aJR
                /* JADX WARN: Type inference failed for: r1v3, types: [T, android.app.Dialog, com.bytedance.android.live.design.app.LiveDialog] */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Spannable spannableLJIILIIL;
                    Spannable spannableLJIILIIL2;
                    Spannable spannableLJIILIIL3;
                    Spannable spannableLJIILIIL4;
                    ((Number) obj).intValue();
                    Spannable spannable = C1133830fbx.LIZ;
                    Text text = perceptionDialogInfo.title;
                    if (text != null) {
                        Context context2 = contextLJJIIZI;
                        spannableLJIILIIL = C1133830fbx.LJIILIIL(text, text.defaultPattern);
                        C786410Ut5.o2(spannableLJIILIIL, new ForegroundColorSpan(C446980Hfs.LIZ(context2, R.color.da)), 0, spannableLJIILIIL.length(), 18);
                    } else {
                        spannableLJIILIIL = spannable;
                    }
                    Text text2 = perceptionDialogInfo.subTitle;
                    if (text2 != null) {
                        Context context3 = contextLJJIIZI;
                        spannableLJIILIIL2 = C1133830fbx.LJIILIIL(text2, text2.defaultPattern);
                        C1119920fFW.LJIIIZ(context3, spannableLJIILIIL2, 0, spannableLJIILIIL2.length(), 33, 6);
                    } else {
                        spannableLJIILIIL2 = spannable;
                    }
                    Text text3 = perceptionDialogInfo.adviceActionText;
                    if (text3 != null) {
                        Context context4 = contextLJJIIZI;
                        spannableLJIILIIL3 = C1133830fbx.LJIILIIL(text3, text3.defaultPattern);
                        C786410Ut5.o2(spannableLJIILIIL3, new ForegroundColorSpan(C446980Hfs.LIZ(context4, R.color.f569bc)), 0, spannableLJIILIIL3.length(), 18);
                        C1119920fFW.LJ(context4, spannableLJIILIIL3, 0, spannableLJIILIIL3.length(), 33, 6, 500);
                    } else {
                        spannableLJIILIIL3 = spannable;
                    }
                    int iLIZ = C446980Hfs.LIZ(contextLJJIIZI, R.color.df);
                    Text text4 = perceptionDialogInfo.defaultActionText;
                    if (text4 != null) {
                        Context context5 = contextLJJIIZI;
                        spannableLJIILIIL4 = C1133830fbx.LJIILIIL(text4, text4.defaultPattern);
                        C786410Ut5.o2(spannableLJIILIIL4, new ForegroundColorSpan(iLIZ), 0, spannableLJIILIIL4.length(), 18);
                        C1119920fFW.LJ(context5, spannableLJIILIIL4, 0, spannableLJIILIIL4.length(), 33, 6, 400);
                    } else {
                        spannableLJIILIIL4 = spannable;
                    }
                    final C259800zU c259800zU = new C259800zU();
                    if (spannableLJIILIIL3 == spannable && spannableLJIILIIL4 == spannable) {
                        C925610aC7.LIZ.LIZ();
                        return;
                    }
                    C782110Um9 c782110Um9 = new C782110Um9(contextLJJIIZI);
                    c782110Um9.LJIIIZ(spannableLJIILIIL2);
                    c782110Um9.LJFF(R.drawable.eps);
                    c782110Um9.LJIILL = false;
                    if (spannableLJIILIIL3 != spannable) {
                        final PunishEventInfo punishEventInfo2 = punishEventInfo;
                        final PerceptionDialogInfo perceptionDialogInfo2 = perceptionDialogInfo;
                        final boolean z4 = z;
                        final boolean z5 = z2;
                        final Function1<Integer, Unit> function13 = function1;
                        c782110Um9.LJIILL(spannableLJIILIIL3, new InterfaceC743640TFa() { // from class: X.0a6r
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                C925610aC7.LIZJ(perceptionDialogInfo2, punishEventInfo2, "click", "suggest_tab", z4, z5);
                                LiveDialog liveDialog2 = c259800zU.element;
                                if (liveDialog2 != null) {
                                    liveDialog2.dismiss();
                                    C785410UrT.LIZ(liveDialog2);
                                }
                                Function1<Integer, Unit> function14 = function13;
                                if (function14 != null) {
                                    function14.invoke(Integer.valueOf(perceptionDialogInfo2.scene));
                                }
                            }
                        });
                    }
                    AwS2S0420000_15 awS2S0420000_15 = new AwS2S0420000_15(punishEventInfo, (PunishEventInfo) perceptionDialogInfo, (PerceptionDialogInfo) z, z2, (boolean) c259800zU, (C259800zU<LiveDialog>) function12, (Function1<? super Integer, Unit>) 0);
                    if (spannableLJIILIIL4 != spannable && spannableLJIILIIL3 != spannable) {
                        c782110Um9.LJIILLIIL(spannableLJIILIIL4, new AcS496S0100000_15(awS2S0420000_15, 59));
                    } else if (spannableLJIILIIL4 != spannable) {
                        c782110Um9.LJIIJJI(spannableLJIILIIL4, new AcS496S0100000_15(awS2S0420000_15, 60));
                    }
                    ?? r1 = (T) c782110Um9.LIZ();
                    c259800zU.element = r1;
                    PunishEventInfo punishEventInfo3 = punishEventInfo;
                    PerceptionDialogInfo perceptionDialogInfo3 = perceptionDialogInfo;
                    boolean z6 = z;
                    boolean z7 = z2;
                    if (spannableLJIILIIL != spannable) {
                        r1.setTitle(spannableLJIILIIL);
                    }
                    r1.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.0aC8
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            C925610aC7.LIZIZ = false;
                            C925610aC7.LIZ.LIZ();
                        }
                    });
                    C786410Ut5.E4(r1);
                    C925610aC7.LIZIZ = true;
                    C925610aC7.LIZJ(perceptionDialogInfo3, punishEventInfo3, "show", "", z6, z7);
                }
            });
            if (!z3) {
                c929920aJ4.LIZ();
            }
        }
    }

    public static void LJFF(DataChannel dataChannel, PerceptionMessage perceptionMessage, boolean z, boolean z2, Function1 function1, AObjectS358S0100000_15 aObjectS358S0100000_15, Context context) {
        Integer num;
        if (perceptionMessage == null) {
            return;
        }
        PunishEventInfo punishEventInfo = perceptionMessage.publicEventInfo;
        boolean z3 = false;
        if (punishEventInfo != null && (num = punishEventInfo.punishTypeId) != null && num.intValue() == 70 && dataChannel != null) {
            PerceptionDialogInfo perceptionDialogInfo = perceptionMessage.dialog;
            if (perceptionDialogInfo != null && perceptionDialogInfo.scene == 21) {
                z3 = true;
            }
            dataChannel.zW(IsViewerLimitedStatusChannel.class, Boolean.valueOf(true ^ z3));
        }
        PerceptionDialogInfo perceptionDialogInfo2 = perceptionMessage.dialog;
        if (perceptionDialogInfo2 == null) {
            return;
        }
        C07NE.LJIILJJIL.getClass();
        if (!C07ND.LIZIZ.contains(Integer.valueOf(perceptionDialogInfo2.scene))) {
            return;
        }
        LJ(context, perceptionDialogInfo2, perceptionMessage.publicEventInfo, function1, aObjectS358S0100000_15, z, z2);
    }
}

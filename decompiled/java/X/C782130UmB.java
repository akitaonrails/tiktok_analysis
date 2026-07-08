package X;

import Y.AObjectS162S0000000_12;
import Y.AcS495S0100000_12;
import Y.AcS83S0400000_12;
import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.room.CopyRightDialogShowOrDismissEvent;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UmB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782130UmB {
    public static final AtomicInteger LIZ = new AtomicInteger(100);

    public static final void LIZ(PerceptionDialogInfo perceptionDialogInfo, PunishEventInfo punishEventInfo, String str, String str2, boolean z, boolean z2) {
        String str3;
        String str4;
        String str5;
        String str6;
        LiveMode streamType;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_violation_popup");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "action_type");
        if (z) {
            str3 = "anchor";
        } else {
            str3 = "user";
        }
        c474500IjALIZ.LJJII(str3, "user_type");
        if (z) {
            str4 = "live";
        } else if (z2) {
            str4 = "apply_guest";
        } else {
            str4 = "guest";
        }
        c474500IjALIZ.LJJII(str4, "scene_type");
        c474500IjALIZ.LJJII(punishEventInfo.punishId, "record_id");
        c474500IjALIZ.LJJII(punishEventInfo.punishType, "violation_type");
        c474500IjALIZ.LJJII(punishEventInfo.punishReason, "violation_reason");
        c474500IjALIZ.LJJII(Long.valueOf(punishEventInfo.violationUid), "violation_anchor_id");
        c474500IjALIZ.LJJII(str2, "click_tab");
        c474500IjALIZ.LJJII(punishEventInfo.duration, "period");
        String strLIZ = null;
        if (perceptionDialogInfo != null) {
            str5 = perceptionDialogInfo.violationDetailUrl;
        } else {
            str5 = null;
        }
        if (!TextUtils.isEmpty(str5)) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str6, "is_detail_button");
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (streamType = room.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LJJII(punishEventInfo.punishPerceptionCode, "perception_code");
        c474500IjALIZ.LJJII(punishEventInfo.showReason, "show_reason");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZJ(final PerceptionDialogInfo perceptionDialogInfo, final Context context, final LifecycleOwner lifecycleOwner, final InterfaceC777420Uea interfaceC777420Uea, final Function2<? super Context, ? super PerceptionDialogInfo, Unit> function2, final Function2<? super Context, ? super PerceptionDialogInfo, Unit> function22, final Function2<? super String, ? super String, Unit> function23, final DataChannel dataChannel) {
        if (interfaceC777420Uea != null) {
            interfaceC777420Uea.addToShow(LIZ.getAndDecrement(), lifecycleOwner, new Observer() { // from class: X.0Um2
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r14v0 */
                /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r14v2, types: [boolean] */
                /* JADX WARN: Type inference failed for: r14v3 */
                /* JADX WARN: Type inference failed for: r17v3 */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    int i;
                    Spannable spannable;
                    Spannable spannableLJIILIIL;
                    Spannable spannableLJIILIIL2;
                    Spannable spannableLJIILIIL3;
                    C782110Um9 c782110Um9;
                    Text text;
                    String str;
                    Text text2;
                    String str2;
                    Text text3;
                    String str3;
                    Text text4;
                    Text text5;
                    ((Number) obj).intValue();
                    Context context2 = context;
                    PerceptionDialogInfo perceptionDialogInfo2 = perceptionDialogInfo;
                    Function2<Context, PerceptionDialogInfo, Unit> function24 = function2;
                    Function2<Context, PerceptionDialogInfo, Unit> function25 = function22;
                    Function2<String, String, Unit> function26 = function23;
                    ?? r14 = 0;
                    if (perceptionDialogInfo2 != null && context2 != null) {
                        Spannable spannable2 = C1133830fbx.LIZ;
                        if (perceptionDialogInfo2 != null && perceptionDialogInfo2.title != null && 1 != 0) {
                            if (perceptionDialogInfo2 != null) {
                                text4 = perceptionDialogInfo2.title;
                                text5 = perceptionDialogInfo2.title;
                            } else {
                                text4 = null;
                                text5 = null;
                            }
                            Spannable spannableLJIILIIL4 = C1133830fbx.LJIILIIL(text4, text5.defaultPattern);
                            C786410Ut5.o2(spannableLJIILIIL4, new ForegroundColorSpan(C446980Hfs.LIZ(context2, R.color.da)), 0, spannableLJIILIIL4.length(), 18);
                            i = 18;
                            spannable = spannable2;
                            C1119920fFW.LJ(context2, spannableLJIILIIL4, 0, spannableLJIILIIL4.length(), 33, 2, OppoPermissionPopupMaskDelayExp.DEFAULT);
                            spannable2 = spannableLJIILIIL4;
                        } else {
                            i = 18;
                            spannable = spannable2;
                        }
                        if (perceptionDialogInfo2 != null && perceptionDialogInfo2.subTitle != null) {
                            if (perceptionDialogInfo2 != null) {
                                text3 = perceptionDialogInfo2.subTitle;
                                Text text6 = perceptionDialogInfo2.subTitle;
                                if (text6 != null) {
                                    str3 = text6.defaultPattern;
                                }
                                spannableLJIILIIL = C1133830fbx.LJIILIIL(text3, str3);
                                context2 = context2;
                                r14 = 0;
                                C1119920fFW.LJIIIZ(context2, spannableLJIILIIL, 0, spannableLJIILIIL.length(), 33, 6);
                            } else {
                                text3 = null;
                            }
                            str3 = null;
                            spannableLJIILIIL = C1133830fbx.LJIILIIL(text3, str3);
                            context2 = context2;
                            r14 = 0;
                            C1119920fFW.LJIIIZ(context2, spannableLJIILIIL, 0, spannableLJIILIIL.length(), 33, 6);
                        } else {
                            spannableLJIILIIL = spannable;
                        }
                        if (perceptionDialogInfo2 != null && perceptionDialogInfo2.adviceActionText != null) {
                            if (perceptionDialogInfo2 != null) {
                                text2 = perceptionDialogInfo2.adviceActionText;
                                Text text7 = perceptionDialogInfo2.adviceActionText;
                                if (text7 != null) {
                                    str2 = text7.defaultPattern;
                                }
                                spannableLJIILIIL2 = C1133830fbx.LJIILIIL(text2, str2);
                                C786410Ut5.o2(spannableLJIILIIL2, new ForegroundColorSpan(C446980Hfs.LIZ(context2, R.color.f569bc)), r14, spannableLJIILIIL2.length(), i);
                                C1119920fFW.LJ(context2, spannableLJIILIIL2, r14, spannableLJIILIIL2.length(), 33, 6, 500);
                            } else {
                                text2 = null;
                            }
                            str2 = null;
                            spannableLJIILIIL2 = C1133830fbx.LJIILIIL(text2, str2);
                            C786410Ut5.o2(spannableLJIILIIL2, new ForegroundColorSpan(C446980Hfs.LIZ(context2, R.color.f569bc)), r14, spannableLJIILIIL2.length(), i);
                            C1119920fFW.LJ(context2, spannableLJIILIIL2, r14, spannableLJIILIIL2.length(), 33, 6, 500);
                        } else {
                            spannableLJIILIIL2 = spannable;
                        }
                        int iLIZ = C446980Hfs.LIZ(context2, R.color.df);
                        if (perceptionDialogInfo2 != null && perceptionDialogInfo2.defaultActionText != null) {
                            if (perceptionDialogInfo2 != null) {
                                text = perceptionDialogInfo2.defaultActionText;
                                Text text8 = perceptionDialogInfo2.defaultActionText;
                                if (text8 != null) {
                                    str = text8.defaultPattern;
                                }
                                spannableLJIILIIL3 = C1133830fbx.LJIILIIL(text, str);
                                C786410Ut5.o2(spannableLJIILIIL3, new ForegroundColorSpan(iLIZ), r14, spannableLJIILIIL3.length(), i);
                                C1119920fFW.LJ(context2, spannableLJIILIIL3, r14 == true ? 1 : 0, spannableLJIILIIL3.length(), 33, 6, 400);
                            } else {
                                text = null;
                            }
                            str = null;
                            spannableLJIILIIL3 = C1133830fbx.LJIILIIL(text, str);
                            C786410Ut5.o2(spannableLJIILIIL3, new ForegroundColorSpan(iLIZ), r14, spannableLJIILIIL3.length(), i);
                            C1119920fFW.LJ(context2, spannableLJIILIIL3, r14 == true ? 1 : 0, spannableLJIILIIL3.length(), 33, 6, 400);
                        } else {
                            spannableLJIILIIL3 = spannable;
                        }
                        if (!Intrinsics.LJFF(spannableLJIILIIL2, spannable) && !Intrinsics.LJFF(spannableLJIILIIL3, spannable)) {
                            c782110Um9 = new C782110Um9(context2);
                            if (!Intrinsics.LJFF(spannable2, spannable)) {
                                c782110Um9.LIZJ = spannable2;
                            }
                            c782110Um9.LJIIIZ(spannableLJIILIIL);
                            c782110Um9.LJIILL(spannableLJIILIIL2, new AcS83S0400000_12(context2, perceptionDialogInfo2, function24, function26, 0));
                            c782110Um9.LJIILLIIL(spannableLJIILIIL3, new AcS83S0400000_12(context2, perceptionDialogInfo2, function26, function25, 1));
                            c782110Um9.LJIILL = r14;
                        } else if (Intrinsics.LJFF(spannableLJIILIIL2, spannable) && !Intrinsics.LJFF(spannableLJIILIIL3, spannable)) {
                            C786410Ut5.o2(spannableLJIILIIL3, new ForegroundColorSpan(C446980Hfs.LIZ(context2, R.color.da)), r14, spannableLJIILIIL3.length(), 18);
                            Context context3 = context2;
                            ?? r142 = r14;
                            C1119920fFW.LJ(context3, spannableLJIILIIL3, r142 == true ? 1 : 0, spannableLJIILIIL3.length(), 33, 6, 500);
                            c782110Um9 = new C782110Um9(context3);
                            c782110Um9.LJIIIZ(spannableLJIILIIL);
                            if (!Intrinsics.LJFF(spannable2, spannable)) {
                                c782110Um9.LIZJ = spannable2;
                            }
                            c782110Um9.LJIIJJI(spannableLJIILIIL3, new AcS495S0100000_12(function26, 59));
                            c782110Um9.LJIILL = r142;
                        }
                        PerceptionDialogInfo perceptionDialogInfo3 = perceptionDialogInfo;
                        DataChannel dataChannel2 = dataChannel;
                        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                        InterfaceC777420Uea interfaceC777420Uea2 = interfaceC777420Uea;
                        Function2<String, String, Unit> function27 = function23;
                        Integer numLIZ = C1770906wd.LIZ(perceptionDialogInfo3.iconType);
                        if (numLIZ != null) {
                            c782110Um9.LJFF(numLIZ.intValue());
                        }
                        c782110Um9.LJIJ = new DialogInterfaceOnDismissListenerC786080UsY(interfaceC777420Uea2, 32);
                        LiveDialog liveDialogLIZ = c782110Um9.LIZ();
                        C786410Ut5.E4(liveDialogLIZ);
                        if (perceptionDialogInfo3.scene == 7 && dataChannel2 != null) {
                            dataChannel2.BQ2(lifecycleOwner2, CopyRightDialogShowOrDismissEvent.class, new C5183020f(liveDialogLIZ, 210));
                        }
                        interfaceC777420Uea2.addDialogToManager(liveDialogLIZ);
                        if (function27 != null) {
                            function27.invoke("show", "");
                            return;
                        }
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("show perception dialog failed.. ");
                    sbLIZ.append(perceptionDialogInfo);
                    C20441214yg.LJIIL("UserViolation", C2188811AlT.LIZIZ(sbLIZ));
                }
            });
        }
    }

    public static void LIZLLL(PerceptionDialogInfo perceptionDialogInfo, Context context, LifecycleOwner lifecycleOwner, InterfaceC777420Uea interfaceC777420Uea, Function2 function2, Function2 function22, Function2 function23, int i) {
        if ((i & 8) != 0) {
            function2 = new AObjectS162S0000000_12(0);
        }
        if ((i & 16) != 0) {
            function22 = new AObjectS162S0000000_12(1);
        }
        if ((i & 32) != 0) {
            function23 = null;
        }
        LIZJ(perceptionDialogInfo, context, lifecycleOwner, interfaceC777420Uea, function2, function22, function23, null);
    }
}

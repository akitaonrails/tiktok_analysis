package X;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.touchpoint.api.interfaces.INetworkApi;
import com.bytedance.touchpoint.api.model.ReferralWidgetResponse;
import com.bytedance.touchpoint.core.appwidget.ReferralWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849840yEo {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(237));

    public static int[] LIZIZ(Context context) {
        int[] appWidgetIds;
        try {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            if (appWidgetManager == null || (appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) ReferralWidget.class))) == null) {
                return new int[0];
            }
            return appWidgetIds;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new int[0];
        }
    }

    public static void LIZJ(final Context context) {
        final Integer numValueOf;
        final int[] iArrLIZIZ = LIZIZ(context);
        if (iArrLIZIZ.length != 0 && (numValueOf = Integer.valueOf(R.layout.fwm)) != null && iArrLIZIZ.length != 0) {
            C15O7.LIZIZ(new Callable() { // from class: X.0yEn
                public final /* synthetic */ String LLILLL = "IncentiveWidget";

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    AbstractC1896090zRP abstractC1896090zRP;
                    INetworkApi iNetworkApiLIZJ;
                    ListenableFuture<ReferralWidgetResponse> referralAppWidgetInfo;
                    C1C7U.LIZ("ReferralWidgetManager@fe14.update$1");
                    C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                    C1849780yEi c1849780yEi = (C1849780yEi) c1619720sFe.LIZ(LSPassThroughRecordSizeConfig.DEFAULT);
                    ReferralWidgetResponse referralWidgetResponse = null;
                    if (!(c1849780yEi != null ? c1849780yEi.LJ() : false) || ((abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0)) != null && abstractC1896090zRP.LJJIJ())) {
                        C15O7.LIZIZ(new CallableC520450Kb5(numValueOf.intValue(), context, this.LLILLL, iArrLIZIZ), C15O7.LJIIIIZZ, null);
                    } else {
                        try {
                            String str = this.LLILLL;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("request_type", "referral");
                            linkedHashMap.put("widget_type", str);
                            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
                            if (interfaceC1897260zTILIZIZ != null) {
                                interfaceC1897260zTILIZIZ.LIZ("widget_request", linkedHashMap);
                            }
                            C01GW c01gw = C1849840yEo.LIZ;
                            if (System.currentTimeMillis() - ((Keva) c01gw.getValue()).getLong("referral_widget_request_time", 0L) >= 300000) {
                                InterfaceC1897260zTI interfaceC1897260zTILIZIZ2 = c1619720sFe.LIZIZ();
                                if (interfaceC1897260zTILIZIZ2 != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ2.LIZJ()) != null && (referralAppWidgetInfo = iNetworkApiLIZJ.getReferralAppWidgetInfo()) != null) {
                                    referralWidgetResponse = referralAppWidgetInfo.get();
                                }
                                ((Keva) c01gw.getValue()).storeLong("referral_widget_request_time", System.currentTimeMillis());
                                C1849840yEo.LIZ(context, numValueOf.intValue(), this.LLILLL, iArrLIZIZ, referralWidgetResponse);
                                C1849750yEf.LIZIZ(this.LLILLL);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ReferralWidgetManager@fe14.update$1");
                    return unit;
                }
            }, C15O7.LJI, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    public static void LIZ(Context context, int i, String str, int[] iArr, ReferralWidgetResponse referralWidgetResponse) {
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        List<ReferralWidgetResponse.TaskInfo> list;
        String str6;
        PendingIntent pendingIntentLIZJ;
        int iLIZ;
        int color;
        int iLIZ2;
        int color2;
        int iLIZ3;
        int color3;
        String str7;
        String str8;
        String str9;
        int i2;
        int i3;
        String str10;
        PendingIntent pendingIntentLIZJ2;
        if (referralWidgetResponse == null || ((referralWidgetResponse.widgetSimple == null && referralWidgetResponse.widgetList == null) || (!Intrinsics.LJFF(referralWidgetResponse.widgetViewType, "widget_simple") && !Intrinsics.LJFF(referralWidgetResponse.widgetViewType, "widget_list")))) {
            C15O7.LIZIZ(new CallableC520450Kb5(i, context, str, iArr), C15O7.LJIIIIZZ, null);
            return;
        }
        int length = iArr.length;
        ?? r3 = 0;
        int i4 = 0;
        while (i4 < length) {
            int i5 = iArr[i4];
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i);
            String str11 = referralWidgetResponse.widgetViewType;
            if (Intrinsics.LJFF(str11, "widget_simple")) {
                remoteViews.setViewVisibility(R.id.vbk, r3);
                remoteViews.setViewVisibility(R.id.msr, 8);
                remoteViews.setViewVisibility(R.id.fj1, 8);
                remoteViews.setViewVisibility(R.id.pc3, 8);
                ReferralWidgetResponse.WidgetSimple widgetSimple = referralWidgetResponse.widgetSimple;
                if (widgetSimple != null) {
                    str7 = widgetSimple.title;
                } else {
                    str7 = null;
                }
                remoteViews.setTextViewText(R.id.tv_title, str7);
                ReferralWidgetResponse.WidgetSimple widgetSimple2 = referralWidgetResponse.widgetSimple;
                if (widgetSimple2 != null) {
                    str8 = widgetSimple2.displayReward;
                } else {
                    str8 = null;
                }
                remoteViews.setTextViewText(R.id.ziw, str8);
                ReferralWidgetResponse.WidgetSimple widgetSimple3 = referralWidgetResponse.widgetSimple;
                if (widgetSimple3 != null) {
                    str9 = widgetSimple3.progressDesc;
                } else {
                    str9 = null;
                }
                remoteViews.setTextViewText(R.id.tv_progress_desc, str9);
                ReferralWidgetResponse.WidgetSimple widgetSimple4 = referralWidgetResponse.widgetSimple;
                if (widgetSimple4 != null) {
                    i2 = widgetSimple4.pointsTotal;
                    i3 = widgetSimple4.pointsEarned;
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                remoteViews.setProgressBar(R.id.s8q, i2, i3, r3);
                C01U6.LIZIZ(new AwS428S0200000_27(context, remoteViews, 54));
                ReferralWidgetResponse.WidgetSimple widgetSimple5 = referralWidgetResponse.widgetSimple;
                if (widgetSimple5 == null || (str10 = widgetSimple5.jumpLink) == null) {
                    str10 = "";
                }
                C1849780yEi c1849780yEi = (C1849780yEi) C1619720sFe.LIZ.LIZ(LSPassThroughRecordSizeConfig.DEFAULT);
                if (c1849780yEi != null && (pendingIntentLIZJ2 = c1849780yEi.LIZJ(context, str, str10)) != null) {
                    remoteViews.setOnClickPendingIntent(R.id.vbk, pendingIntentLIZJ2);
                }
            } else if (Intrinsics.LJFF(str11, "widget_list")) {
                remoteViews.setViewVisibility(R.id.vbk, 8);
                remoteViews.setViewVisibility(R.id.fj1, 8);
                remoteViews.setViewVisibility(R.id.pc3, 8);
                remoteViews.setViewVisibility(R.id.msr, r3);
                C01U6.LIZIZ(new AwS428S0200000_27(context, remoteViews, 55));
                ReferralWidgetResponse.WidgetList widgetList = referralWidgetResponse.widgetList;
                if (widgetList != null) {
                    str2 = widgetList.title;
                } else {
                    str2 = null;
                }
                remoteViews.setTextViewText(R.id.ge2, str2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                ReferralWidgetResponse.WidgetList widgetList2 = referralWidgetResponse.widgetList;
                if (widgetList2 != null) {
                    str3 = widgetList2.pointsEarned;
                } else {
                    str3 = null;
                }
                sbLIZ.append(str3);
                sbLIZ.append('/');
                ReferralWidgetResponse.WidgetList widgetList3 = referralWidgetResponse.widgetList;
                if (widgetList3 != null) {
                    str4 = widgetList3.pointsTotal;
                } else {
                    str4 = null;
                }
                sbLIZ.append(str4);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                ReferralWidgetResponse.WidgetList widgetList4 = referralWidgetResponse.widgetList;
                if (widgetList4 != null) {
                    str5 = widgetList4.pointsEarned;
                } else {
                    str5 = null;
                }
                if (strLIZIZ != null && strLIZIZ.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                CharSequence charSequence = strLIZIZ;
                charSequence = strLIZIZ;
                if (!z && str5 != null) {
                    charSequence = strLIZIZ;
                    if (str5.length() != 0) {
                        boolean zLJJIIZI = a0.LJJIIZI(strLIZIZ, str5, r3);
                        charSequence = strLIZIZ;
                        if (zLJJIIZI) {
                            int iLJJJ = a0.LJJJ(strLIZIZ, str5, r3, r3, 6);
                            int length2 = str5.length() + iLJJJ;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            C786410Ut5.q2(spannableStringBuilder.append((CharSequence) strLIZIZ), new ForegroundColorSpan(ColorProtector.parseColor("#FFBB35")), iLJJJ, length2, 33);
                            charSequence = spannableStringBuilder;
                        }
                    }
                }
                remoteViews.setTextViewText(R.id.e3q, charSequence);
                ReferralWidgetResponse.WidgetList widgetList5 = referralWidgetResponse.widgetList;
                if (widgetList5 != null) {
                    list = widgetList5.taskList;
                } else {
                    list = null;
                }
                if (list != null && (!list.isEmpty())) {
                    remoteViews.setViewVisibility(R.id.xe0, 0);
                    remoteViews.setTextViewText(R.id.xei, ((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 0)).taskName);
                    remoteViews.setTextViewText(R.id.e3c, ((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 0)).points);
                    if (((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 0)).taskStatus == 0) {
                        iLIZ = C0SVC.LIZ(R.attr.j4, context);
                    } else {
                        iLIZ = C0SVC.LIZ(R.attr.j_, context);
                    }
                    remoteViews.setInt(R.id.xei, "setTextColor", iLIZ);
                    if (((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 0)).taskStatus == 0) {
                        color = ColorProtector.parseColor("#FFBB35");
                    } else {
                        color = ColorProtector.parseColor("#80FFBB35");
                    }
                    remoteViews.setInt(R.id.e3c, "setTextColor", color);
                    if (list.size() >= 2) {
                        remoteViews.setViewVisibility(R.id.xe1, 0);
                        remoteViews.setTextViewText(R.id.xej, ((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 1)).taskName);
                        remoteViews.setTextViewText(R.id.e3d, ((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 1)).points);
                        if (((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 1)).taskStatus == 0) {
                            iLIZ3 = C0SVC.LIZ(R.attr.j4, context);
                        } else {
                            iLIZ3 = C0SVC.LIZ(R.attr.j_, context);
                        }
                        remoteViews.setInt(R.id.xej, "setTextColor", iLIZ3);
                        if (((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 1)).taskStatus == 0) {
                            color3 = ColorProtector.parseColor("#FFBB35");
                        } else {
                            color3 = ColorProtector.parseColor("#80FFBB35");
                        }
                        remoteViews.setInt(R.id.e3d, "setTextColor", color3);
                    } else {
                        remoteViews.setViewVisibility(R.id.xe1, 4);
                    }
                    if (list.size() >= 3) {
                        remoteViews.setViewVisibility(R.id.xe2, 0);
                        remoteViews.setTextViewText(R.id.xek, ((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 2)).taskName);
                        remoteViews.setTextViewText(R.id.e3e, ((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 2)).points);
                        if (((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 2)).taskStatus == 0) {
                            iLIZ2 = C0SVC.LIZ(R.attr.j4, context);
                        } else {
                            iLIZ2 = C0SVC.LIZ(R.attr.j_, context);
                        }
                        remoteViews.setInt(R.id.xek, "setTextColor", iLIZ2);
                        if (((ReferralWidgetResponse.TaskInfo) ListProtector.get(list, 2)).taskStatus == 0) {
                            color2 = ColorProtector.parseColor("#FFBB35");
                        } else {
                            color2 = ColorProtector.parseColor("#80FFBB35");
                        }
                        remoteViews.setInt(R.id.e3e, "setTextColor", color2);
                        remoteViews.setImageViewResource(R.id.kfx, R.drawable.di_);
                    } else {
                        remoteViews.setViewVisibility(R.id.xe2, 4);
                    }
                } else {
                    remoteViews.setViewVisibility(R.id.xe0, 4);
                    remoteViews.setViewVisibility(R.id.xe1, 4);
                    remoteViews.setViewVisibility(R.id.xe2, 4);
                }
                ReferralWidgetResponse.WidgetList widgetList6 = referralWidgetResponse.widgetList;
                if (widgetList6 == null || (str6 = widgetList6.jumpLink) == null) {
                    str6 = "";
                }
                C1849780yEi c1849780yEi2 = (C1849780yEi) C1619720sFe.LIZ.LIZ(LSPassThroughRecordSizeConfig.DEFAULT);
                if (c1849780yEi2 != null && (pendingIntentLIZJ = c1849780yEi2.LIZJ(context, str, str6)) != null) {
                    remoteViews.setOnClickPendingIntent(R.id.msr, pendingIntentLIZJ);
                }
            }
            AppWidgetManager.getInstance(context).updateAppWidget(i5, remoteViews);
            i4++;
            r3 = 0;
        }
    }
}

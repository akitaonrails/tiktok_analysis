package X;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.widget.api.IAppWidgetApi;
import com.ss.android.ugc.aweme.widget.model.AppWidgetStruct;
import com.ss.android.ugc.aweme.widget.model.ChallengeStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0y0X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.widget.utils.AppWidgetUpdateUtil$update$1", f = "AppWidgetUpdateUtil.kt", l = {}, m = "invokeSuspend")
public final class C1840990y0X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ int[] LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;
    public final /* synthetic */ Function1<Exception, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1840990y0X(Context context, int[] iArr, Function1<? super Boolean, Unit> function1, Function1<? super Exception, Unit> function12, InterfaceC1364105Vn<? super C1840990y0X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = iArr;
        this.LLILLL = function1;
        this.LLILZ = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1840990y0X(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<ChallengeStruct> challengeStructList;
        AppWidgetStruct appWidgetStructLIZ;
        Intent intentLJIIIZ;
        PendingIntent pendingIntentLJ;
        C1C7U.LIZ("AppWidgetUpdateUtil@ead6.update$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = "";
        if (C10EU.LJIILIIL()) {
            C1841010y0Z.LIZ.getClass();
            Context context = this.LL;
            int[] iArr = this.LLILLJJLI;
            if (iArr != null) {
                for (int i : iArr) {
                    RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.r3);
                    remoteViews.setImageViewResource(R.id.lyi, R.drawable.c6m);
                    remoteViews.setTextViewText(R.id.tv_topic, context.getResources().getString(R.string.drk));
                    remoteViews.setTextViewText(R.id.tv_trending, context.getResources().getString(R.string.drg));
                    remoteViews.setTextViewText(R.id.tv_view_count, "");
                    C1841010y0Z.LIZ.getClass();
                    IAppWidgetService iAppWidgetService = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
                    if (iAppWidgetService != null && (intentLJIIIZ = iAppWidgetService.LJIIIZ(context, "hashtag_s")) != null) {
                        intentLJIIIZ.putExtra("extra_jump_type", 3);
                        IAppWidgetService iAppWidgetService2 = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
                        if (iAppWidgetService2 != null && (pendingIntentLJ = iAppWidgetService2.LJ(context, 5, intentLJIIIZ)) != null) {
                            remoteViews.setOnClickPendingIntent(R.id.tqy, pendingIntentLJ);
                            remoteViews.setOnClickPendingIntent(R.id.lym, pendingIntentLJ);
                        }
                    }
                    AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
                }
            }
            Function1<Boolean, Unit> function1 = this.LLILLL;
            if (function1 != null) {
                function1.invoke(true);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AppWidgetUpdateUtil@ead6.update$1");
            return unit;
        }
        C1841010y0Z.LIZ.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1841000y0Y c1841000y0Y = C1841000y0Y.LIZ;
        long j = jCurrentTimeMillis - C1841000y0Y.LIZIZ().getLong("keva_key_last_cache_time", 0L);
        if (j > 0 && j < C1841010y0Z.LIZIZ && (appWidgetStructLIZ = c1841000y0Y.LIZ()) != null) {
            int[] iArr2 = this.LLILLJJLI;
            Context context2 = this.LL;
            for (int i2 : iArr2) {
                C1841010y0Z.LIZ.getClass();
                C1841010y0Z.LIZ(context2, i2, appWidgetStructLIZ);
            }
            Function1<Boolean, Unit> function12 = this.LLILLL;
            if (function12 != null) {
                function12.invoke(true);
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AppWidgetUpdateUtil@ead6.update$1");
            return unit2;
        }
        try {
            if (((Boolean) C07AW.LIZ.getValue()).booleanValue()) {
                C19266210Yy.LIZIZ.LIZIZ();
            }
            IAppWidgetService iAppWidgetService3 = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
            if (iAppWidgetService3 != null) {
                iAppWidgetService3.LJI("hashtag", "hashtag_s");
            }
            AppWidgetStruct appWidgetStruct = ((IAppWidgetApi) C1387705bv.LIZ.getValue()).fetchChallenge(1, C1841000y0Y.LIZIZ().getLong("keva_key_request_cursor", 0L), 4).execute().LIZIZ;
            C1841000y0Y.LIZIZ().storeLong("keva_key_last_cache_time", System.currentTimeMillis());
            C1841000y0Y.LIZJ = appWidgetStruct;
            C1841000y0Y.LIZIZ().storeString("keva_key_cache_data", GsonProtectorUtils.toJson(new Gson(), appWidgetStruct));
            C1841000y0Y.LIZIZ().storeLong("keva_key_request_cursor", appWidgetStruct.getCursor());
            List<ChallengeStruct> challengeStructList2 = appWidgetStruct.getChallengeStructList();
            if (challengeStructList2 != null && !challengeStructList2.isEmpty()) {
                int[] iArr3 = this.LLILLJJLI;
                Context context3 = this.LL;
                for (int i3 : iArr3) {
                    C1841010y0Z.LIZ.getClass();
                    C1841010y0Z.LIZ(context3, i3, appWidgetStruct);
                }
            } else {
                Function1<Exception, Unit> function13 = this.LLILZ;
                if (function13 != null) {
                    function13.invoke(new RuntimeException("Empty widget data, " + appWidgetStruct));
                }
            }
            IAppWidgetService iAppWidgetService4 = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
            if (iAppWidgetService4 != null) {
                iAppWidgetService4.LJIIJ(1, 0, "hashtag", "hashtag_s", "");
            }
            Function1<Boolean, Unit> function14 = this.LLILLL;
            if (function14 != null) {
                function14.invoke(true);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            IAppWidgetService iAppWidgetService5 = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
            if (iAppWidgetService5 != null) {
                int iLIZIZ = C1498560p6E.LIZIZ(e, null);
                String message = e.getMessage();
                if (message != null) {
                    str = message;
                }
                iAppWidgetService5.LJIIJ(0, iLIZIZ, "hashtag", "hashtag_s", str);
            }
            AppWidgetStruct appWidgetStructLIZ2 = C1841000y0Y.LIZ.LIZ();
            if (1 <= j && j < C1841010y0Z.LIZJ && appWidgetStructLIZ2 != null && (challengeStructList = appWidgetStructLIZ2.getChallengeStructList()) != null && !challengeStructList.isEmpty()) {
                C1841010y0Z.LIZ.getClass();
                int[] iArr4 = this.LLILLJJLI;
                Context context4 = this.LL;
                for (int i4 : iArr4) {
                    C1841010y0Z.LIZ.getClass();
                    C1841010y0Z.LIZ(context4, i4, appWidgetStructLIZ2);
                }
            } else {
                Function1<Exception, Unit> function15 = this.LLILZ;
                if (function15 != null) {
                    function15.invoke(e);
                }
            }
            Function1<Boolean, Unit> function16 = this.LLILLL;
            if (function16 != null) {
                function16.invoke(true);
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AppWidgetUpdateUtil@ead6.update$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

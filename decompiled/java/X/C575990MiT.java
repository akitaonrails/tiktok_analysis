package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeAfterCreationFeedbackMobParams;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeBannerMobParams;
import com.ss.android.ugc.aweme.creative.model.photomode.inspiration.InspirationInfo;
import com.ss.android.ugc.aweme.router.UploadActionInterceptor;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.gamora.recorder.AddYoursAvatarHelper;
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0MiT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.router.UploadActionInterceptor$onInterceptRoute$1$1", f = "UploadActionInterceptor.kt", l = {}, m = "invokeSuspend")
public final class C575990MiT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ UploadActionInterceptor LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Bundle LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C575990MiT(Context context, boolean z, UploadActionInterceptor uploadActionInterceptor, String str, String str2, String str3, String str4, Bundle bundle, InterfaceC1364105Vn<? super C575990MiT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = z;
        this.LLILLL = uploadActionInterceptor;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = bundle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C575990MiT(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJIILIIL;
        Object c098200Yq;
        C1C7U.LIZ("UploadActionInterceptor@7bd5.onInterceptRoute$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Activity activityLIZ = C1388190mED.LIZ(this.LL);
        if (activityLIZ != null) {
            boolean z = this.LLILLJJLI;
            UploadActionInterceptor uploadActionInterceptor = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            String str3 = this.LLILZLL;
            String str4 = this.LLIZ;
            Bundle bundle = this.LLIZLLLIL;
            if (z) {
                C577580Ml2.LIZ.LJI();
            }
            if (!C1533950q1J.LJ(str3)) {
                str3 = str4;
            }
            uploadActionInterceptor.getClass();
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.shootWay(str);
            builder.enterFrom(str2);
            builder.enterMethod(str3);
            boolean z2 = true;
            if (C577580Ml2.LIZ.LIZIZ()) {
                String string = bundle.getString("shoot_perf_session_id");
                if (string != null) {
                    builder.shootPerfSessionId(string);
                }
                long j = bundle.getLong("open_time", 0L);
                if (j > 0) {
                    builder.openTime(j);
                }
                Long lValueOf = Long.valueOf(bundle.getLong("shoot_native_recv_ts", 0L));
                if (lValueOf.longValue() > 0) {
                    builder.shootNativeRecvTs(lValueOf.longValue());
                }
                String string2 = bundle.getString("inspiration_enter_from");
                if (string2 != null) {
                    builder.inspirationEnterFrom(string2);
                }
                String string3 = bundle.getString("inspiration_enter_method");
                if (string3 != null) {
                    builder.inspirationEnterMethod(string3);
                }
            }
            if (bundle.containsKey("extra_landing_back")) {
                builder.landingBack(bundle.getBoolean("extra_landing_back"));
            }
            if (bundle.containsKey("extra_back_url")) {
                builder.backUrl(bundle.getString("extra_back_url"));
            }
            if (bundle.containsKey("extra_back_by_clear_top")) {
                builder.backByClearTop(bundle.getBoolean("extra_back_by_clear_top"));
            }
            if (bundle.containsKey("is_landing_search_before")) {
                builder.isLandingSearchBefore(bundle.getBoolean("is_landing_search_before"));
            }
            if (bundle.containsKey("info_photo_boosted_feedback_h5_enter_method") || bundle.containsKey("info_photo_boosted_feedback_h5_shoot_position")) {
                PhotoModeAfterCreationFeedbackMobParams photoModeAfterCreationFeedbackMobParams = new PhotoModeAfterCreationFeedbackMobParams(bundle.getString("info_photo_boosted_feedback_h5_enter_method"), bundle.getString("info_photo_boosted_feedback_h5_shoot_position"));
                builder.photoModeAfterFeedbackMobParams(photoModeAfterCreationFeedbackMobParams);
                C786410Ut5.LJJIJL(bundle, "photo_mode_after_creation_feedback_mob_params", photoModeAfterCreationFeedbackMobParams);
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("shoot_way", str);
                C1403110mcH.LIZ(c0lab, photoModeAfterCreationFeedbackMobParams);
                C20684815ws.LJIILLIIL("shoot", c0lab.LIZ);
            }
            if (!Intrinsics.LJFF(str, "educate_phase_iii") && !Intrinsics.LJFF(str, "educate_phase_iii_feedback")) {
                z2 = false;
            }
            if (z2) {
                builder.photoModeBannerMobParams(new PhotoModeBannerMobParams(bundle.getString("category_name"), bundle.getString("ay_topic_id"), bundle.getString("camera_session_id"), bundle.getString("enter_from"), bundle.getString("shoot_enter_from"), Integer.valueOf(bundle.getInt("topic_type")), bundle.getString("debuginfo"), bundle.getString("search_topic_id")));
                String string4 = bundle.getString("extra_log_params");
                if (string4 != null) {
                    try {
                        C1227904rF c1227904rF = C1227904rF.LIZ;
                        Type type = new TypeToken<HashMap<String, String>>() { // from class: X.04Z8
                        }.getType();
                        c1227904rF.getClass();
                        builder.extraLogParams((HashMap) C1227904rF.LIZJ(string4, type));
                        c098200Yq = builder;
                        C189200o6.m2constructorimpl(builder);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C189200o6.m1boximpl(c098200Yq);
                }
                builder.setSearchExtra(bundle.getString("search_extra"));
                InspirationInfo inspirationInfo = (InspirationInfo) bundle.getParcelable("add_yours_inspiration_info");
                if (inspirationInfo != null) {
                    builder.inspirationInfo(inspirationInfo);
                }
            }
            if (C304900BxI.LIZ() && bundle.containsKey("ay_topic_id")) {
                String string5 = bundle.getString("ay_topic_id");
                if (string5 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(string5)) != null) {
                    AddYoursAvatarHelper.LIZ(lLJIILIIL.longValue(), new C576000MiU(builder, bundle, uploadActionInterceptor, activityLIZ, str));
                } else {
                    bundle.remove("ay_topic_id");
                    bundle.remove("ay_topic_text");
                    bundle.remove("ay_enter_method");
                    UploadActionInterceptor.LIZ(activityLIZ, str, bundle, builder.build());
                }
            } else if (C304900BxI.LIZ() && bundle.containsKey("ay_topic_text")) {
                AddYoursStickerStruct addYoursStickerStruct = new AddYoursStickerStruct(null, null, bundle.getString("ay_topic_text"), 0, null, null, null, null, null, System.currentTimeMillis(), 14.0f, Boolean.FALSE, null, 0);
                String string6 = bundle.getString("ay_enter_method");
                if (string6 == null) {
                    string6 = "H5";
                }
                builder.addYoursStickerParam(new AddYourRecordParam(addYoursStickerStruct, false, false, null, null, string6, null, true, false, null, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, true, false));
                UploadActionInterceptor.LIZ(activityLIZ, str, bundle, builder.build());
            } else {
                UploadActionInterceptor.LIZ(activityLIZ, str, bundle, builder.build());
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UploadActionInterceptor@7bd5.onInterceptRoute$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

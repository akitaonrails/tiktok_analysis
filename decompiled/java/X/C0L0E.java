package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.TemplateCompareData;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;

/* JADX INFO: renamed from: X.0L0E, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L0E {
    public static final C0L0E LIZ = new C0L0E();

    public static void LIZ(Activity activity, ShortVideoContext shortVideoContext, C19A3 c19a3) {
        PUgcTemplateData pUgcTemplateData;
        PUgcTemplateData pUgcTemplateData2;
        if (c19a3 != null) {
            if (C545820Lau.LJ(c19a3)) {
                return;
            }
        } else if (activity.isFinishing()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("key_support_flag", 6);
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putLong("Key_min_duration", C566050MHz.LIZIZ());
        bundle.putInt("key_photo_select_min_count", 1);
        C533730KwV.LIZ.getClass();
        bundle.putInt("key_photo_select_max_count", C533730KwV.LJIIIZ());
        bundle.putInt("key_video_select_min_count", 1);
        bundle.putInt("key_video_select_max_count", C533730KwV.LJIIIZ());
        bundle.putInt("key_choose_scene", 38);
        bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
        if (shortVideoContext != null) {
            CreativeModel creativeModel = shortVideoContext.creativeModel;
            if (creativeModel != null && (pUgcTemplateData2 = creativeModel.pugcTemplateData) != null) {
                pUgcTemplateData2.isFromCreateTemplate = true;
            }
            CreativeModel creativeModel2 = shortVideoContext.creativeModel;
            if (creativeModel2 != null && (pUgcTemplateData = creativeModel2.pugcTemplateData) != null && !TextUtils.isEmpty(creativeModel2.productPath) && !TextUtils.isEmpty(shortVideoContext.creativeModel.successFlag) && !TextUtils.isEmpty(shortVideoContext.creativeModel.failFlag)) {
                CreativeModel creativeModel3 = shortVideoContext.creativeModel;
                String str = creativeModel3.productPath;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = creativeModel3.successFlag;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = creativeModel3.failFlag;
                if (str4 != null) {
                    str2 = str4;
                }
                pUgcTemplateData.templateCompareData = new TemplateCompareData(str, str3, str2);
            }
        }
        C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
        String str5 = MvChoosePhotoActivity._pnsPageId;
        C0L0F.LIZJ(activity, bundle, 1, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:15|(1:17)|18|(2:21|19)|85|22|(1:24)(1:48)|25|(1:27)(16:(0)(1:(1:(1:43))(1:(0)))|(1:30)|(2:32|(1:34))|35|83|49|52|(1:79)(1:56)|57|(1:59)(3:71|(1:73)(1:78)|(1:77))|60|(1:62)|63|(1:65)(1:(1:69)(1:70))|66|67)|28|(0)|(0)|35|83|49|52|(2:54|79)(0)|57|(0)(0)|60|(0)|63|(0)(0)|66|67) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0138, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        X.C189200o6.m2constructorimpl(new X.C098200Yq(r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(android.app.Activity r15, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r16, com.ss.android.ugc.aweme.cutsame.CutsameDataItem r17, boolean r18, X.EnumC538340L9k r19) {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L0E.LIZIZ(android.app.Activity, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, com.ss.android.ugc.aweme.cutsame.CutsameDataItem, boolean, X.0L9k):void");
    }
}

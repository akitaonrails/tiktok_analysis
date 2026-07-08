package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PhotoModeTemplateData;
import com.ss.android.ugc.aweme.creative.model.publish.FollowUpPublishTrackerModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0L1E, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L1E implements InterfaceC522520KeQ {
    public final C19EG LL;
    public CreativeDialogWrapper LLILLL;
    public final WeakReference<Activity> LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public boolean LLJ;
    public long LLILLJJLI = -1;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(373));
    public String LLIZLLLIL = "";

    @Override // X.InterfaceC522520KeQ
    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
    }

    @Override // X.InterfaceC522520KeQ
    public final void LJJLIIIJJIZ() {
    }

    public C0L1E(C19EG c19eg) {
        this.LL = c19eg;
        this.LLILZIL = new WeakReference<>(this.LL);
    }

    public final void LIZLLL(ShortVideoContext shortVideoContext) {
        LJI(2, shortVideoContext);
        C0CNO.LIZLLL(0L, new AwS552S0100000_8(this, 903));
    }

    public final void LJI(int i, ShortVideoContext shortVideoContext) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZIZ(System.currentTimeMillis() - this.LLILZLL, "time_elapsed");
        c0lab.LIZ(this.LLIZ, "pic_cnt");
        c0lab.LIZ(0, "video_cnt");
        c0lab.LJ("is_from_editor_pro", CardStruct.IStatusCode.DEFAULT);
        c0lab.LIZ(0, "total_import_duration");
        c0lab.LIZ(0, "is_use_sound_sync");
        c0lab.LIZ(0, "is_ugc_template_from_anchor");
        c0lab.LIZ(0, "is_music_pre_download_success");
        c0lab.LIZ(2, "stage");
        c0lab.LJ("creation_id", shortVideoContext.creativeInfo.getCreationId());
        c0lab.LIZ(1, "is_photo_template_from_anchor");
        if (this.LLILLJJLI > 0) {
            c0lab.LIZIZ(System.currentTimeMillis() - this.LLILLJJLI, "interval_click_next");
        }
        C20684815ws.LJIILLIIL("tools_performance_pre_cut_opt_process", c0lab.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC522520KeQ
    public final void LIZ(int i, int i2, Intent intent) {
        String str;
        boolean z;
        this.LLILZLL = System.currentTimeMillis();
        this.LLILLJJLI = intent.getLongExtra("extra_start_enter_edit_page", -1L);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        int i3 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            ShortVideoContext shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
            if (shortVideoContext == null) {
                return;
            }
            C528230Knd c528230KndLIZ = C523870Kgb.LIZ(intent);
            String str2 = "multi_photo";
            if (parcelableArrayListExtra.size() > 1) {
                str = "multiple_content";
            } else {
                str = "single_content";
            }
            int size = parcelableArrayListExtra.size();
            String str3 = "photo";
            if (parcelableArrayListExtra.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            String strLIZ = C525670KjV.LIZ(parcelableArrayListExtra);
            String str4 = "";
            if (strLIZ == null) {
                strLIZ = "";
            }
            new C528210Knb(shortVideoContext, str2, str, i3, size, str3, z, strLIZ, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, parcelableArrayListExtra, c528230KndLIZ, 3840).LIZ();
            this.LLIZ = parcelableArrayListExtra.size();
            String str5 = shortVideoContext.creativeModel.photoModeTemplateData.templateId;
            if (str5 != null) {
                str4 = str5;
            }
            this.LLIZLLLIL = str4;
            LJI(0, shortVideoContext);
            if (this.LLILLL == null) {
                C19576911iZ c19576911iZ = C19576911iZ.LIZ;
                C19EG c19eg = this.LL;
                CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
                creativeLoadingDialogBuilder.showProgress(false);
                this.LLILLL = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(c19eg, 1023, creativeLoadingDialogBuilder);
            }
            CreativeDialogWrapper creativeDialogWrapper = this.LLILLL;
            if (creativeDialogWrapper != null) {
                creativeDialogWrapper.delayShow(C19576911iZ.LIZ());
            }
            CreativeModel creativeModel = shortVideoContext.creativeModel;
            FollowUpPublishTrackerModel followUpPublishTrackerModel = creativeModel.followUpPublishTrackerModel;
            followUpPublishTrackerModel.followUpFirstItemId = C1443560nfW.LJI;
            followUpPublishTrackerModel.followUpItemIdGroups = C1443560nfW.LJII;
            followUpPublishTrackerModel.followUpPromoId = C1443560nfW.LJIIJJI;
            PhotoModeTemplateData photoModeTemplateData = creativeModel.photoModeTemplateData;
            C19EG c19eg2 = this.LL;
            String str6 = photoModeTemplateData.templateId;
            if (str6 != null && str6.length() != 0) {
                C23250099c.LIZLLL((InterfaceC497601wk) this.LLILZ.getValue(), null, null, new C567920MPe(this, shortVideoContext, parcelableArrayListExtra, c19eg2, str6, null), 3);
                return;
            } else {
                LIZLLL(shortVideoContext);
                return;
            }
        }
        C201955140j.LJIIZILJ("selectedMediaData is invalid when onChosenResult invoked in PhotoModeChooseResultImpl");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r29, java.lang.String r30, X.InterfaceC1364105Vn<? super X.C443120HZe<java.lang.Boolean, ? extends com.bytedance.ies.nle.editor_jni.NLETemplateModel, java.lang.Long>> r31) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L1E.LIZJ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LJ(int i, String str, long j, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("template_id", this.LLIZLLLIL);
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("shoot_way", str);
        c0lab.LIZ(this.LLIZ, "pic_cnt");
        c0lab.LIZ(0, "video_cnt");
        c0lab.LIZ(i, "error_code");
        c0lab.LJ("error_msg", str2);
        C20684815ws.LJIILLIIL("photo_template_import_material", c0lab.LIZ);
    }

    public static void LJFF(C0L1E c0l1e, String str, int i, String str2, String str3, int i2) {
        int i3 = 0;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        if ((i2 & 8) != 0) {
            i3 = 1;
        }
        if ((i2 & 16) != 0) {
            str3 = "";
        }
        if (!c0l1e.LLJ) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("shoot_way", str);
            c0lab.LJ("template_id", c0l1e.LLIZLLLIL);
            c0lab.LIZIZ(System.currentTimeMillis() - c0l1e.LLILZLL, "duration");
            c0lab.LIZ(i, "error_code");
            c0lab.LJ("error_msg", str2);
            c0lab.LJ("server_log_id", str3);
            c0lab.LIZ(i3, "final_status");
            C20684815ws.LJIILLIIL("photo_template_next_concat", c0lab.LIZ);
            c0l1e.LLJ = true;
        }
    }
}

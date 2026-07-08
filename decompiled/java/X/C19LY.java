package X;

import android.widget.CompoundButton;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS44S0010000_32;
import lth.o;

/* JADX INFO: renamed from: X.19LY, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LY implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void onCheckedChanged$5(C19LY c19ly, CompoundButton compoundButton, boolean z) {
        ((Function2) c19ly.l0).invoke(compoundButton, Boolean.valueOf(z));
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                break;
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                break;
            case 6:
                onCheckedChanged$6(this, compoundButton, z);
                break;
            case 7:
                onCheckedChanged$7(this, compoundButton, z);
                break;
            case 8:
                onCheckedChanged$8(this, compoundButton, z);
                break;
        }
    }

    public C19LY(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C19LY c19ly, CompoundButton compoundButton, boolean z) {
        ((AnonymousClass1920) c19ly.l0).k5(z);
    }

    public static final void onCheckedChanged$1(C19LY c19ly, CompoundButton compoundButton, boolean z) {
        int i;
        ((C214722191k) c19ly.l0).P4(z);
        Keva repo = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME");
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        repo.storeInt("USER_HD_VIDEO_SWITCH_SETTING", i);
        o.LJIIJ.getClass();
        SharePrefCache.inst().hasShowHighQualityVideoTips().LJ(Boolean.TRUE);
        C0CHQ.LIZ().getPublishService().LJJJIL();
        C1433920nPy.LIZ("high_quality_setting_changed");
        ((C214722191k) c19ly.l0).i3(new AwS44S0010000_32(z, 3));
    }

    public static final void onCheckedChanged$2(C19LY c19ly, CompoundButton compoundButton, boolean z) {
        ((C214724191m) c19ly.l0).P4().creativeModel.privacySettingModel.allowVisualSearch = z;
        ((C214724191m) c19ly.l0).T4("click");
        ((C214724191m) c19ly.l0).i3(new AwS44S0010000_32(z, 8));
    }

    public static final void onCheckedChanged$3(C19LY c19ly, CompoundButton compoundButton, boolean z) {
        ((C214720191i) c19ly.l0).i3(new AwS44S0010000_32(z, 9));
        ((C214720191i) c19ly.l0).LLJIJIL = true;
        C214824195i c214824195i = C214824195i.LIZIZ;
        c214824195i.LJIJJ(z);
        c214824195i.LJIJ(z);
    }

    public static final void onCheckedChanged$4(C19LY c19ly, CompoundButton compoundButton, boolean z) {
        int i;
        String str;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        ((C192I) c19ly.l0).T4().creativeModel.privacySettingModel.contentReusePermission = i;
        C0CHQ.LIZ().LJJIIZI().LJJJJLI();
        C0CHQ.LIZ().LJJIIZI().LJIILIIL(i);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("creation_id", ((C192I) c19ly.l0).T4().getCreationId());
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c0lab.LJ("value", str);
        C20684815ws.LJIILLIIL("toggle_post_reuse_content_settings", c0lab.LIZ);
        ((C192I) c19ly.l0).i3(new AwS44S0010000_32(z, 10));
    }

    public static final void onCheckedChanged$6(C19LY c19ly, CompoundButton compoundButton, boolean z) {
        String str = "on";
        if (((AnonymousClass1942) c19ly.l0).Z4()) {
            ((AnonymousClass1942) c19ly.l0).O4().creativeModel.photoModeTemplateData.enablePublishAsTemplate = z;
            ((AnonymousClass1942) c19ly.l0).O4().creativeModel.photoModeTemplateData.postAsTemplateCheckedByUser = z;
            C194K c194k = new Object() { // from class: X.194K
            };
            VideoPublishEditModel videoPublishEditModelO4 = ((AnonymousClass1942) c19ly.l0).O4();
            c194k.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", videoPublishEditModelO4.getCreationId());
            c0lab.LJ("enter_from", "video_post_page");
            c0lab.LJ("shoot_way", videoPublishEditModelO4.mShootWay);
            if (!z) {
                str = "off";
            }
            c0lab.LJ("to_status", str);
            C20684815ws.LJIILLIIL("switch_post_as_template", c0lab.LIZ);
        } else {
            ((AnonymousClass1942) c19ly.l0).O4().creativeModel.ugcTemplateData.enablePublishAsTemplate = z;
            C19225210Je c19225210Je = C19225210Je.LIZ;
            VideoPublishEditModel videoPublishEditModelO42 = ((AnonymousClass1942) c19ly.l0).O4();
            c19225210Je.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("creation_id", videoPublishEditModelO42.getCreationId());
            c2344009Gk.LJIIIIZZ("enter_from", videoPublishEditModelO42.getEnterFrom());
            c2344009Gk.LJIIIIZZ("shoot_way", videoPublishEditModelO42.mShootWay);
            c2344009Gk.LJIIIIZZ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModelO42));
            if (!z) {
                str = "off";
            }
            c2344009Gk.LJIIIIZZ("to_status", str);
            C20684815ws.LJIILLIIL("click_post_template", c2344009Gk.LIZ);
            Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeBoolean("select_publish_with_template_anchor", z);
            Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeBoolean("select_publish_with_template_anchor_clicked", true);
            ((AnonymousClass1942) c19ly.l0).P4().xz();
        }
        ((AnonymousClass1942) c19ly.l0).i3(new AwS44S0010000_32(z, 13));
    }

    public static final void onCheckedChanged$7(C19LY c19ly, CompoundButton compoundButton, boolean z) {
        String str;
        C1436290nTn.LIZ.storeBoolean("has_water_mark", z);
        C0CHQ.LIZ().getPublishService().LJJJIL();
        C1433920nPy.LIZ("check_save_local_without_watermark");
        if (z) {
            str = "with_watermark";
        } else {
            str = "without_watermark";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", ((C214726191o) c19ly.l0).O4().getCreationId());
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("shoot_way", ((C214726191o) c19ly.l0).O4().mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(((C214726191o) c19ly.l0).O4()));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(((C214726191o) c19ly.l0).O4()));
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(((C214726191o) c19ly.l0).O4()));
        c0lab.LJ("to_status", str);
        c0lab.LIZ(((C214726191o) c19ly.l0).O4().creativeModel.commonMobModel.originVideoCount, "video_cnt");
        c0lab.LIZ(((C214726191o) c19ly.l0).O4().creativeModel.commonMobModel.originPhotoCount, "pic_cnt");
        C20684815ws.LJIILLIIL("click_post_save_watermark_option", c0lab.LIZ);
        ((C214726191o) c19ly.l0).i3(new AwS44S0010000_32(z, 16));
    }

    public static final void onCheckedChanged$8(C19LY c19ly, CompoundButton compoundButton, boolean z) {
        String str;
        String str2;
        C1436290nTn.LIZ.storeBoolean("has_water_mark", !z);
        C0CHQ.LIZ().getPublishService().LJJJIL();
        C1433920nPy.LIZ("check_save_local_without_watermark");
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", ((C214727191p) c19ly.l0).O4().getCreationId());
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("to_status", str);
        c0lab.LJ("shoot_way", ((C214727191p) c19ly.l0).O4().mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(((C214727191p) c19ly.l0).O4()));
        C20684815ws.LJIILLIIL("click_save_without_watermark", c0lab.LIZ);
        if (z) {
            str2 = "without_watermark";
        } else {
            str2 = "with_watermark";
        }
        C0LAB c0lab2 = new C0LAB();
        c0lab2.LJ("creation_id", ((C214727191p) c19ly.l0).O4().getCreationId());
        c0lab2.LJ("enter_from", "video_post_page");
        c0lab2.LJ("shoot_way", ((C214727191p) c19ly.l0).O4().mShootWay);
        c0lab2.LJ("content_source", C1428470nHB.LJIILIIL(((C214727191p) c19ly.l0).O4()));
        c0lab2.LJ("content_type", C1428470nHB.LJIILL(((C214727191p) c19ly.l0).O4()));
        c0lab2.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(((C214727191p) c19ly.l0).O4()));
        c0lab2.LJ("to_status", str2);
        c0lab2.LIZ(((C214727191p) c19ly.l0).O4().creativeModel.commonMobModel.originVideoCount, "video_cnt");
        c0lab2.LIZ(((C214727191p) c19ly.l0).O4().creativeModel.commonMobModel.originPhotoCount, "pic_cnt");
        C20684815ws.LJIILLIIL("click_post_save_watermark_option", c0lab2.LIZ);
        ((C214727191p) c19ly.l0).i3(new AwS44S0010000_32(z, 17));
    }
}

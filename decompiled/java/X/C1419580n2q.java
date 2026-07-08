package X;

import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.LandingModel;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419580n2q {
    public static final C1419580n2q LIZ = new C1419580n2q();
    public static long LIZIZ = -1;

    public static void LIZ(ShortVideoContext shortVideoContext) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", "mv_shoot_page");
        C20684815ws.LJIILLIIL("click_create_template", c0lab.LIZ);
    }

    public static void LJIIL(ShortVideoContext shortVideoContext, CutsameDataItem cutsameDataItem) {
        String str;
        String strLIZLLL;
        EnumC1412640mre enumC1412640mreLIZJ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("last_group_id", shortVideoContext.creativeModel.groupId);
        c0lab.LIZ(0, "dual_camera_support");
        c0lab.LJ("template_dispatch_type", "schema_event");
        if (cutsameDataItem != null) {
            str = cutsameDataItem.templateId;
        } else {
            str = null;
        }
        c0lab.LJ("tt_template_id", str);
        if (cutsameDataItem != null && (enumC1412640mreLIZJ = C1412660mrg.LIZJ(cutsameDataItem.templateType)) != null) {
            strLIZLLL = C1412630mrd.LIZLLL(enumC1412640mreLIZJ);
        } else {
            strLIZLLL = null;
        }
        c0lab.LJ("tt_template_type", strLIZLLL);
        C1440340naK.LIZ(c0lab, shortVideoContext.creativeModel.propFromGroupModel);
        String str2 = shortVideoContext.creativeModel.groupId;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
        String creationId = shortVideoContext.getCreationId();
        String str4 = shortVideoContext.shootWay;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = shortVideoContext.enterFrom;
        if (str5 != null) {
            str3 = str5;
        }
        iRecordMobService.LIZIZ(new C1449410nox(creationId, str4, str3, str2, str2, null, null, null, 224), c0lab, null);
    }

    public static void LIZLLL(ShortVideoContext shortVideoContext, String str, TemplateCategoryData templateCategoryData) {
        long jCurrentTimeMillis;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(shortVideoContext.creativeModel.isFromEditTab ? 1 : 0, "is_from_edit_tab");
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", "mv_shoot_page");
        c0lab.LJ("click_method", str);
        if (templateCategoryData != null) {
            c0lab.LJ("tab_name", templateCategoryData.name);
            c0lab.LJ("category_key", templateCategoryData.key);
        }
        if (LIZIZ > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - LIZIZ;
        } else {
            jCurrentTimeMillis = -1;
        }
        c0lab.LIZIZ(jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("exit_mv_shoot_page", c0lab.LIZ);
    }

    public static void LIZIZ(ShortVideoContext shortVideoContext, TemplateCategoryData templateCategoryData, TemplateCategoryData templateCategoryData2, String str) {
        String str2;
        String str3;
        LandingModel landingModel;
        String str4;
        if (templateCategoryData != null) {
            str2 = templateCategoryData.key;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, templateCategoryData2.key)) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", "mv_shoot_page");
        String str5 = "by_default";
        if (templateCategoryData == null || (str3 = templateCategoryData.name) == null) {
            str3 = "by_default";
        }
        c0lab.LJ("from_tab", str3);
        c0lab.LJ("to_tab", templateCategoryData2.name);
        c0lab.LJ("click_method", str);
        if (templateCategoryData != null && (str4 = templateCategoryData.key) != null) {
            str5 = str4;
        }
        c0lab.LJ("from_category_key", str5);
        c0lab.LJ("to_category_key", templateCategoryData2.key);
        c0lab.LIZ(shortVideoContext.creativeModel.isFromEditTab ? 1 : 0, "is_from_edit_tab");
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        if (creativeModel != null && (landingModel = creativeModel.landingModel) != null && landingModel.defaultLandingCreateTab) {
            c0lab.LJ("createtab_landing_type", "default");
        }
        C20684815ws.LJIILLIIL("click_mv_sub_tab", c0lab.LIZ);
    }

    public static void LIZJ(ShortVideoContext shortVideoContext, int i, C1419590n2r c1419590n2r, TemplateCategoryData templateCategoryData) {
        String str;
        String strLIZLLL;
        s sVar = s.LIZ;
        Asset asset = c1419590n2r.LIZ;
        sVar.getClass();
        CutsameDataItem cutsameDataItemLJJLIIIJLJLI = s.LJJLIIIJLJLI(asset);
        if (cutsameDataItemLJJLIIIJLJLI == null) {
            return;
        }
        if (Intrinsics.LJFF(shortVideoContext.creativeModel.templateSchemaData.schemaTag, "template_schema")) {
            str = shortVideoContext.shootWay;
        } else {
            str = "mv_shoot_page";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", str);
        c0lab.LIZ(i, "impr_position");
        EnumC1412640mre enumC1412640mreLIZJ = C1412660mrg.LIZJ(cutsameDataItemLJJLIIIJLJLI.templateType);
        if (enumC1412640mreLIZJ != null) {
            strLIZLLL = C1412630mrd.LIZLLL(enumC1412640mreLIZJ);
        } else {
            strLIZLLL = null;
        }
        c0lab.LJ("tt_template_type", strLIZLLL);
        c0lab.LJ("mv_id", cutsameDataItemLJJLIIIJLJLI.templateId);
        c0lab.LJ("mv_name", cutsameDataItemLJJLIIIJLJLI.title);
        c0lab.LJ("is_cache_template", C1402490mbH.LIZ(c1419590n2r.LIZIZ));
        if (templateCategoryData != null) {
            c0lab.LJ("tab_name", templateCategoryData.name);
            c0lab.LJ("category_key", templateCategoryData.key);
        }
        C20684815ws.LJIILLIIL("enter_mv_preview_page", c0lab.LIZ);
    }

    public static void LJ(ShortVideoContext shortVideoContext, C1419590n2r c1419590n2r, TemplateCategoryData templateCategoryData, InterfaceC1422310n7F interfaceC1422310n7F) {
        Asset asset;
        String strLIZLLL;
        if (c1419590n2r != null && (asset = c1419590n2r.LIZ) != null) {
            s.LIZ.getClass();
            CutsameDataItem cutsameDataItemLJJLIIIJLJLI = s.LJJLIIIJLJLI(asset);
            if (cutsameDataItemLJJLIIIJLJLI != null) {
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", shortVideoContext.getCreationId());
                c0lab.LJ("shoot_way", shortVideoContext.shootWay);
                c0lab.LJ("enter_from", "mv_preview_page");
                EnumC1412640mre enumC1412640mreLIZJ = C1412660mrg.LIZJ(cutsameDataItemLJJLIIIJLJLI.templateType);
                if (enumC1412640mreLIZJ != null) {
                    strLIZLLL = C1412630mrd.LIZLLL(enumC1412640mreLIZJ);
                } else {
                    strLIZLLL = null;
                }
                c0lab.LJ("tt_template_type", strLIZLLL);
                c0lab.LJ("mv_id", cutsameDataItemLJJLIIIJLJLI.templateId);
                c0lab.LJ("mv_name", cutsameDataItemLJJLIIIJLJLI.title);
                c0lab.LJ("is_cache_template", C1402490mbH.LIZ(c1419590n2r.LIZIZ));
                if (templateCategoryData != null) {
                    c0lab.LJ("tab_name", templateCategoryData.name);
                    c0lab.LJ("category_key", templateCategoryData.key);
                }
                if (interfaceC1422310n7F != null) {
                    interfaceC1422310n7F.d91(c0lab, templateCategoryData, null, c1419590n2r, "exit_mv_preview_page");
                }
                C20684815ws.LJIILLIIL("exit_mv_preview_page", c0lab.LIZ);
            }
        }
    }

    public static final void LJIILJJIL(String str, TemplateCategoryData templateCategoryData, String str2, String str3) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", str3);
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("enter_method", str);
        if (templateCategoryData != null) {
            c0lab.LJ("tab_name", templateCategoryData.name);
            c0lab.LJ("category_key", templateCategoryData.key);
        }
        C20684815ws.LJIILLIIL("tool_performance_template_loadmore", c0lab.LIZ);
    }

    public static final void LJIILL(String str, TemplateCategoryData templateCategoryData, String str2, String str3, boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", str3);
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("enter_method", str);
        c0lab.LJFF("is_preload_by_side", z);
        if (templateCategoryData != null) {
            c0lab.LJ("tab_name", templateCategoryData.name);
            c0lab.LJ("category_key", templateCategoryData.key);
        }
        C20684815ws.LJIILLIIL("tool_performance_template_refresh", c0lab.LIZ);
    }

    public static void LJIIIIZZ(ShortVideoContext shortVideoContext, int i, int i2, C1419590n2r c1419590n2r, TemplateCategoryData templateCategoryData, InterfaceC1422310n7F interfaceC1422310n7F) {
        String str;
        String strLIZLLL;
        s sVar = s.LIZ;
        Asset asset = c1419590n2r.LIZ;
        sVar.getClass();
        CutsameDataItem cutsameDataItemLJJLIIIJLJLI = s.LJJLIIIJLJLI(asset);
        if (cutsameDataItemLJJLIIIJLJLI == null) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        if (i != 0) {
            if (i != 1) {
                str = "";
            } else {
                str = "mv_preview_page";
            }
        } else {
            str = "mv_shoot_page";
        }
        c0lab.LJ("enter_from", str);
        c0lab.LIZ(i2, "impr_position");
        EnumC1412640mre enumC1412640mreLIZJ = C1412660mrg.LIZJ(cutsameDataItemLJJLIIIJLJLI.templateType);
        if (enumC1412640mreLIZJ != null) {
            strLIZLLL = C1412630mrd.LIZLLL(enumC1412640mreLIZJ);
        } else {
            strLIZLLL = null;
        }
        c0lab.LJ("tt_template_type", strLIZLLL);
        c0lab.LJ("mv_id", cutsameDataItemLJJLIIIJLJLI.templateId);
        c0lab.LJ("mv_name", cutsameDataItemLJJLIIIJLJLI.title);
        c0lab.LJ("is_cache_template", C1402490mbH.LIZ(c1419590n2r.LIZIZ));
        c0lab.LIZ(cutsameDataItemLJJLIIIJLJLI.maxMediaSize, "clips");
        c0lab.LJ("template_tags", cutsameDataItemLJJLIIIJLJLI.templateTag);
        c0lab.LIZIZ(cutsameDataItemLJJLIIIJLJLI.usageAmount, "follow_publish_cnt");
        c0lab.LJ("template_tags", cutsameDataItemLJJLIIIJLJLI.templateTag);
        c0lab.LIZLLL(c1419590n2r.LIZ.getBusiness_extra().getAsset_from(), "asset_from");
        c0lab.LJ("ai_template_func_list", cutsameDataItemLJJLIIIJLJLI.aiTemplateFuncList);
        c0lab.LIZ(cutsameDataItemLJJLIIIJLJLI.isAICreteTemplate ? 1 : 0, "is_ai_create_template");
        C0MJO.LIZIZ(shortVideoContext.creativeModel, c0lab);
        if (templateCategoryData != null) {
            c0lab.LJ("tab_name", templateCategoryData.name);
            c0lab.LJ("category_key", templateCategoryData.key);
        }
        if (interfaceC1422310n7F != null) {
            interfaceC1422310n7F.d91(c0lab, templateCategoryData, Integer.valueOf(i2), c1419590n2r, "mv_show");
        }
        C20684815ws.LJIILLIIL("mv_show", c0lab.LIZ);
    }

    public static void LJIIIZ(String str, String str2, String str3, String str4, boolean z, long j, int i) {
        int i2;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", str3);
        c0lab.LJ("shoot_way", str2);
        if (z) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        c0lab.LIZ(i2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i, "error_code");
        c0lab.LJ("error_msg", str);
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(1, "enter_scene");
        c0lab.LJ("log_id", str4);
        C20684815ws.LJIILLIIL("tool_performance_template_tab_fetch_categories", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b A[PHI: r6
      0x006b: PHI (r6v5 java.lang.String) = (r6v2 java.lang.String), (r6v6 java.lang.String) binds: [B:14:0x001c, B:11:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(X.C1419580n2q r6, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r7, long r8, com.ss.android.ugc.effectmanager.effect.model.net.AssetItemResponse r10, java.lang.String r11, com.ss.android.ugc.effectmanager.common.task.ExceptionResult r12, int r13) {
        /*
            r0 = r13 & 4
            r4 = 0
            if (r0 == 0) goto L6
            r10 = r4
        L6:
            r0 = r13 & 16
            if (r0 == 0) goto Lb
            r12 = r4
        Lb:
            r6.getClass()
            if (r10 == 0) goto L16
            java.lang.String r6 = r10.getLogId()
            if (r6 != 0) goto L6b
        L16:
            if (r12 == 0) goto L69
            java.lang.String r6 = r12.getLogId()
        L1c:
            if (r10 != 0) goto L6b
            r3 = 1
        L1f:
            if (r12 == 0) goto L67
            int r2 = r12.getErrorCode()
            java.lang.String r1 = r12.getMsg()
            if (r1 != 0) goto L2d
        L2b:
            java.lang.String r1 = ""
        L2d:
            X.09Gk r5 = new X.09Gk
            r5.<init>()
            java.lang.String r0 = "status"
            r5.LIZJ(r3, r0)
            java.lang.String r0 = "error_code"
            r5.LIZJ(r2, r0)
            java.lang.String r0 = "error_msg"
            r5.LJIIIIZZ(r0, r1)
            java.lang.String r0 = "log_id"
            r5.LJIIIIZZ(r0, r6)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r8
            int r1 = (int) r2
            java.lang.String r0 = "duration"
            r5.LIZJ(r1, r0)
            if (r7 == 0) goto L55
            java.lang.String r4 = r7.shootWay
        L55:
            java.lang.String r0 = "shoot_way"
            r5.LJIIIIZZ(r0, r4)
            java.lang.String r0 = "template_id"
            r5.LJIIIIZZ(r0, r11)
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.LIZ
            java.lang.String r0 = "tool_performance_preview_template_fetch_item"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L67:
            r2 = 0
            goto L2b
        L69:
            r6 = r4
            goto L1c
        L6b:
            int r3 = r10.getStatus_code()
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1419580n2q.LJIIJJI(X.0n2q, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, long, com.ss.android.ugc.effectmanager.effect.model.net.AssetItemResponse, java.lang.String, com.ss.android.ugc.effectmanager.common.task.ExceptionResult, int):void");
    }

    public static void LJIILIIL(ShortVideoContext shortVideoContext, String str, int i, C1419590n2r c1419590n2r, TemplateCategoryData templateCategoryData, boolean z, InterfaceC1422310n7F interfaceC1422310n7F) {
        String strLIZLLL;
        LandingModel landingModel;
        s sVar = s.LIZ;
        Asset asset = c1419590n2r.LIZ;
        sVar.getClass();
        CutsameDataItem cutsameDataItemLJJLIIIJLJLI = s.LJJLIIIJLJLI(asset);
        if (cutsameDataItemLJJLIIIJLJLI == null) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", str);
        c0lab.LIZ(i, "impr_position");
        EnumC1412640mre enumC1412640mreLIZJ = C1412660mrg.LIZJ(cutsameDataItemLJJLIIIJLJLI.templateType);
        if (enumC1412640mreLIZJ != null) {
            strLIZLLL = C1412630mrd.LIZLLL(enumC1412640mreLIZJ);
        } else {
            strLIZLLL = null;
        }
        c0lab.LJ("tt_template_type", strLIZLLL);
        c0lab.LJ("mv_id", cutsameDataItemLJJLIIIJLJLI.templateId);
        c0lab.LJ("mv_name", cutsameDataItemLJJLIIIJLJLI.title);
        c0lab.LIZ(cutsameDataItemLJJLIIIJLJLI.maxMediaSize, "clips");
        c0lab.LIZ(shortVideoContext.creativeModel.isFromEditTab ? 1 : 0, "is_from_edit_tab");
        c0lab.LJ("template_tags", cutsameDataItemLJJLIIIJLJLI.templateTag);
        c0lab.LJ("is_cache_template", C1402490mbH.LIZ(c1419590n2r.LIZIZ));
        c0lab.LIZLLL(c1419590n2r.LIZ.getBusiness_extra().getAsset_from(), "asset_from");
        c0lab.LIZ(cutsameDataItemLJJLIIIJLJLI.isAICreteTemplate ? 1 : 0, "is_ai_create_template");
        c0lab.LJ("ai_template_func_list", cutsameDataItemLJJLIIIJLJLI.aiTemplateFuncList);
        C0MJO.LIZIZ(shortVideoContext.creativeModel, c0lab);
        if (templateCategoryData != null) {
            c0lab.LJ("tab_name", templateCategoryData.name);
            c0lab.LJ("category_key", templateCategoryData.key);
        }
        c0lab.LIZIZ(cutsameDataItemLJJLIIIJLJLI.usageAmount, "follow_publish_cnt");
        c0lab.LIZ(z ? 1 : 0, "is_click_use_template");
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        if (creativeModel != null && (landingModel = creativeModel.landingModel) != null && landingModel.defaultLandingCreateTab) {
            c0lab.LJ("createtab_landing_type", "default");
        }
        if (interfaceC1422310n7F != null) {
            interfaceC1422310n7F.d91(c0lab, templateCategoryData, Integer.valueOf(i), c1419590n2r, "select_mv");
        }
        C20684815ws.LJIILLIIL("select_mv", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILLIIL(X.C1419580n2q r6, java.lang.String r7, long r8, com.ss.android.ugc.effectmanager.effect.model.net.AssetItemResponse r10, java.lang.String r11, com.ss.android.ugc.effectmanager.common.task.ExceptionResult r12, int r13) {
        /*
            r0 = r13 & 4
            r5 = 0
            if (r0 == 0) goto L6
            r10 = r5
        L6:
            r0 = r13 & 16
            if (r0 == 0) goto Lb
            r12 = r5
        Lb:
            r6.getClass()
            if (r10 == 0) goto L61
            java.lang.String r0 = r10.getLogId()
            if (r0 == 0) goto L61
            r5 = r0
        L17:
            int r3 = r10.getStatus_code()
        L1b:
            if (r12 == 0) goto L5f
            int r2 = r12.getErrorCode()
            java.lang.String r1 = r12.getMsg()
            if (r1 != 0) goto L29
        L27:
            java.lang.String r1 = ""
        L29:
            X.09Gk r4 = new X.09Gk
            r4.<init>()
            java.lang.String r0 = "status"
            r4.LIZJ(r3, r0)
            java.lang.String r0 = "error_code"
            r4.LIZJ(r2, r0)
            java.lang.String r0 = "error_msg"
            r4.LJIIIIZZ(r0, r1)
            java.lang.String r0 = "log_id"
            r4.LJIIIIZZ(r0, r5)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r8
            int r1 = (int) r2
            java.lang.String r0 = "duration"
            r4.LIZJ(r1, r0)
            java.lang.String r0 = "shoot_way"
            r4.LJIIIIZZ(r0, r7)
            java.lang.String r0 = "template_id"
            r4.LJIIIIZZ(r0, r11)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "tool_performance_use_template_fetch_item"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L5f:
            r2 = 0
            goto L27
        L61:
            if (r12 == 0) goto L67
            java.lang.String r5 = r12.getLogId()
        L67:
            if (r10 != 0) goto L17
            r3 = 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1419580n2q.LJIILLIIL(X.0n2q, java.lang.String, long, com.ss.android.ugc.effectmanager.effect.model.net.AssetItemResponse, java.lang.String, com.ss.android.ugc.effectmanager.common.task.ExceptionResult, int):void");
    }

    public static final void LJFF(int i, CutsameDataItem cutsameDataItem, long j, Integer num, String str, String str2, int i2, int i3) {
        String strLIZLLL;
        EnumC1412640mre enumC1412640mreLIZIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZLLL(num, "error_code");
        c0lab.LJ("error_msg", str);
        c0lab.LIZIZ(j, "duration");
        String str3 = null;
        if (cutsameDataItem != null && (enumC1412640mreLIZIZ = cutsameDataItem.LIZIZ()) != null) {
            strLIZLLL = C1412630mrd.LIZLLL(enumC1412640mreLIZIZ);
        } else {
            strLIZLLL = null;
        }
        c0lab.LJ("template_type", strLIZLLL);
        if (cutsameDataItem != null) {
            str3 = cutsameDataItem.templateId;
        }
        c0lab.LJ("template_id", str3);
        c0lab.LJ("url", str2);
        c0lab.LIZ(i2, "enter_scene");
        c0lab.LIZ(i3, "impr_position");
        C20684815ws.LJIILLIIL("tool_performance_mv_cover_image_load_state", c0lab.LIZ);
    }

    public static void LJII(ShortVideoContext shortVideoContext, String str, int i, C1419590n2r c1419590n2r, TemplateCategoryData templateCategoryData, long j, boolean z, InterfaceC1422310n7F interfaceC1422310n7F) {
        String strLIZLLL;
        s sVar = s.LIZ;
        Asset asset = c1419590n2r.LIZ;
        sVar.getClass();
        CutsameDataItem cutsameDataItemLJJLIIIJLJLI = s.LJJLIIIJLJLI(asset);
        if (cutsameDataItemLJJLIIIJLJLI == null) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", str);
        c0lab.LIZ(i, "impr_position");
        EnumC1412640mre enumC1412640mreLIZJ = C1412660mrg.LIZJ(cutsameDataItemLJJLIIIJLJLI.templateType);
        if (enumC1412640mreLIZJ != null) {
            strLIZLLL = C1412630mrd.LIZLLL(enumC1412640mreLIZJ);
        } else {
            strLIZLLL = null;
        }
        c0lab.LJ("tt_template_type", strLIZLLL);
        c0lab.LJ("mv_id", cutsameDataItemLJJLIIIJLJLI.templateId);
        c0lab.LJ("mv_name", cutsameDataItemLJJLIIIJLJLI.title);
        c0lab.LIZ(cutsameDataItemLJJLIIIJLJLI.maxMediaSize, "clips");
        c0lab.LJ("template_tags", cutsameDataItemLJJLIIIJLJLI.templateTag);
        c0lab.LJ("is_cache_template", C1402490mbH.LIZ(c1419590n2r.LIZIZ));
        c0lab.LIZLLL(c1419590n2r.LIZ.getBusiness_extra().getAsset_from(), "asset_from");
        c0lab.LJ("ai_template_func_list", cutsameDataItemLJJLIIIJLJLI.aiTemplateFuncList);
        if (templateCategoryData != null) {
            c0lab.LJ("tab_name", templateCategoryData.name);
            c0lab.LJ("category_key", templateCategoryData.key);
        }
        c0lab.LIZIZ(cutsameDataItemLJJLIIIJLJLI.usageAmount, "follow_publish_cnt");
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(!z ? 1 : 0, "is_sound_on");
        if (interfaceC1422310n7F != null) {
            interfaceC1422310n7F.d91(c0lab, templateCategoryData, Integer.valueOf(i), c1419590n2r, "mv_play");
        }
        C20684815ws.LJIILLIIL("mv_play", c0lab.LIZ);
    }

    public static final void LJI(int i, InterfaceC1419170n2B interfaceC1419170n2B, long j, int i2, String str, String str2, int i3, boolean z, int i4) {
        String strLIZLLL;
        EnumC1412640mre enumC1412640mreLIZIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i2, "error_code");
        c0lab.LJ("error_msg", str);
        c0lab.LIZIZ(j, "duration");
        String mvId = null;
        if (interfaceC1419170n2B != null && (enumC1412640mreLIZIZ = interfaceC1419170n2B.LIZIZ()) != null) {
            strLIZLLL = C1412630mrd.LIZLLL(enumC1412640mreLIZIZ);
        } else {
            strLIZLLL = null;
        }
        c0lab.LJ("template_type", strLIZLLL);
        if (interfaceC1419170n2B != null) {
            mvId = interfaceC1419170n2B.getMvId();
        }
        c0lab.LJ("template_id", mvId);
        c0lab.LIZ(i3, "enter_scene");
        c0lab.LJ("from", "loki");
        if (!C299160Bo2.LIZ()) {
            c0lab.LJ("url", str2);
            c0lab.LIZ(z ? 1 : 0, "useCache");
        }
        c0lab.LIZ(i4, "impr_position");
        C20684815ws.LJIILLIIL("tool_performance_mv_cover_video_load_state", c0lab.LIZ);
    }

    public static void LJIIJ(boolean z, int i, String str, long j, TemplateCategoryData templateCategoryData, boolean z2, int i2, int i3, String str2, String str3, String str4) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", str3);
        c0lab.LJ("shoot_way", str2);
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i, "error_code");
        c0lab.LJ("error_msg", str);
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("category", templateCategoryData.key);
        c0lab.LIZ(i2, "cursor");
        c0lab.LIZ(i3, "count");
        c0lab.LIZ(1, "enter_scene");
        c0lab.LJ("log_id", str4);
        c0lab.LJFF("is_preload", z2);
        C20684815ws.LJIILLIIL("tool_performance_template_tab_fetch_templates", c0lab.LIZ);
    }
}

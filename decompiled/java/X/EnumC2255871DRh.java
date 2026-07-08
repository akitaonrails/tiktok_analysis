package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1DRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2255871DRh {
    public static final EnumC2255871DRh CLICK_POST;
    public static final EnumC2255871DRh CLICK_PROP_ENTRANCE;
    public static final C2255881DRi Companion;
    public static final EnumC2255871DRh EDIT_ENTER;
    public static final EnumC2255871DRh EXIT_AFTER_EDIT_WITHOUT_POST;
    public static final EnumC2255871DRh EXIT_WITHOUT_EDIT;
    public static final EnumC2255871DRh EXIT_WITHOUT_RECORD;
    public static final /* synthetic */ EnumC2255871DRh[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC2255871DRh POST_ENTER;
    public static final EnumC2255871DRh PROP_CLICK;
    public static final EnumC2255871DRh PUBLISH_FAIL;
    public static final EnumC2255871DRh PUBLISH_FINISH;
    public static final EnumC2255871DRh RECORD_VIDEO;
    public static final EnumC2255871DRh RETRY_PUBLISH;
    public static final EnumC2255871DRh RETURN_TO_EDIT_FROM_POST;
    public static final EnumC2255871DRh SAVE_DRAFT;
    public static final EnumC2255871DRh SAVE_LOCAL_CLICK;
    public static final EnumC2255871DRh SAVE_LOCAL_ERROR;
    public static final EnumC2255871DRh SHOOT;
    public static final EnumC2255871DRh SHOOT_ENTER;
    public static final Map<String, EnumC2255871DRh> TRACKER_EVENT_MAP;
    public static final EnumC2255871DRh UPLOAD_ENTRANCE_CLICK;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2255871DRh> getEntries() {
        return LLILZ;
    }

    public final List<String> getFeatureNames() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append("_7d");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LL);
        sbLIZ2.append("_14d");
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(this.LL);
        sbLIZ3.append("_s0");
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(this.LL);
        sbLIZ4.append("_s1");
        return C1697810uHb.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), C2188811AlT.LIZIZ(sbLIZ2), C2188811AlT.LIZIZ(sbLIZ3), C2188811AlT.LIZIZ(sbLIZ4));
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [X.1DRi] */
    static {
        EnumC2255871DRh enumC2255871DRh = new EnumC2255871DRh("SHOOT", 0, "shoot", "shoot");
        SHOOT = enumC2255871DRh;
        EnumC2255871DRh enumC2255871DRh2 = new EnumC2255871DRh("SHOOT_ENTER", 1, "shoot_enter", "enter_video_shoot_page");
        SHOOT_ENTER = enumC2255871DRh2;
        EnumC2255871DRh enumC2255871DRh3 = new EnumC2255871DRh("RECORD_VIDEO", 2, "record_video", "record_video");
        RECORD_VIDEO = enumC2255871DRh3;
        EnumC2255871DRh enumC2255871DRh4 = new EnumC2255871DRh("CLICK_PROP_ENTRANCE", 3, "click_prop_entrance", "click_prop_entrance");
        CLICK_PROP_ENTRANCE = enumC2255871DRh4;
        EnumC2255871DRh enumC2255871DRh5 = new EnumC2255871DRh("PROP_CLICK", 4, "prop_click", "prop_click");
        PROP_CLICK = enumC2255871DRh5;
        EnumC2255871DRh enumC2255871DRh6 = new EnumC2255871DRh("SAVE_DRAFT", 5, "save_draft", "save_draft");
        SAVE_DRAFT = enumC2255871DRh6;
        EnumC2255871DRh enumC2255871DRh7 = new EnumC2255871DRh("EDIT_ENTER", 6, "edit_enter", "enter_video_edit_page");
        EDIT_ENTER = enumC2255871DRh7;
        EnumC2255871DRh enumC2255871DRh8 = new EnumC2255871DRh("POST_ENTER", 7, "post_enter", "enter_video_post_page");
        POST_ENTER = enumC2255871DRh8;
        EnumC2255871DRh enumC2255871DRh9 = new EnumC2255871DRh("UPLOAD_ENTRANCE_CLICK", 8, "upload_entrance_click", "click_upload_entrance");
        UPLOAD_ENTRANCE_CLICK = enumC2255871DRh9;
        EnumC2255871DRh enumC2255871DRh10 = new EnumC2255871DRh("CLICK_POST", 9, "click_post", "performance_publish_click");
        CLICK_POST = enumC2255871DRh10;
        EnumC2255871DRh enumC2255871DRh11 = new EnumC2255871DRh("SAVE_LOCAL_CLICK", 10, "save_local_click", "click_save_local_on_edit_page");
        SAVE_LOCAL_CLICK = enumC2255871DRh11;
        EnumC2255871DRh enumC2255871DRh12 = new EnumC2255871DRh("PUBLISH_FINISH", 11, "publish_finish", "publish_finish");
        PUBLISH_FINISH = enumC2255871DRh12;
        EnumC2255871DRh enumC2255871DRh13 = new EnumC2255871DRh("PUBLISH_FAIL", 12, "publish_fail", "publish_fail");
        PUBLISH_FAIL = enumC2255871DRh13;
        EnumC2255871DRh enumC2255871DRh14 = new EnumC2255871DRh("RETRY_PUBLISH", 13, "retry_publish", null);
        RETRY_PUBLISH = enumC2255871DRh14;
        EnumC2255871DRh enumC2255871DRh15 = new EnumC2255871DRh("SAVE_LOCAL_ERROR", 14, "save_local_error", "click_save_local_error");
        SAVE_LOCAL_ERROR = enumC2255871DRh15;
        EnumC2255871DRh enumC2255871DRh16 = new EnumC2255871DRh("EXIT_WITHOUT_RECORD", 15, "exit_without_record", null);
        EXIT_WITHOUT_RECORD = enumC2255871DRh16;
        EnumC2255871DRh enumC2255871DRh17 = new EnumC2255871DRh("EXIT_WITHOUT_EDIT", 16, "exit_without_edit", null);
        EXIT_WITHOUT_EDIT = enumC2255871DRh17;
        EnumC2255871DRh enumC2255871DRh18 = new EnumC2255871DRh("EXIT_AFTER_EDIT_WITHOUT_POST", 17, "exit_after_edit_without_post", null);
        EXIT_AFTER_EDIT_WITHOUT_POST = enumC2255871DRh18;
        EnumC2255871DRh enumC2255871DRh19 = new EnumC2255871DRh("RETURN_TO_EDIT_FROM_POST", 18, "return_to_edit_from_post", "post_page_back_to_edit");
        RETURN_TO_EDIT_FROM_POST = enumC2255871DRh19;
        EnumC2255871DRh[] enumC2255871DRhArr = {enumC2255871DRh, enumC2255871DRh2, enumC2255871DRh3, enumC2255871DRh4, enumC2255871DRh5, enumC2255871DRh6, enumC2255871DRh7, enumC2255871DRh8, enumC2255871DRh9, enumC2255871DRh10, enumC2255871DRh11, enumC2255871DRh12, enumC2255871DRh13, enumC2255871DRh14, enumC2255871DRh15, enumC2255871DRh16, enumC2255871DRh17, enumC2255871DRh18, enumC2255871DRh19};
        LLILLL = enumC2255871DRhArr;
        LLILZ = new C2254308sP(enumC2255871DRhArr);
        Companion = new Object() { // from class: X.1DRi
        };
        EnumC2255871DRh[] enumC2255871DRhArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC2255871DRh enumC2255871DRh20 : enumC2255871DRhArrValues) {
            String str = enumC2255871DRh20.LLILLJJLI;
            if (str != null) {
                arrayList.add(new Pair(str, enumC2255871DRh20));
            }
        }
        TRACKER_EVENT_MAP = C2097608Jq.LJIILLIIL(arrayList);
    }

    public static EnumC2255871DRh[] values() {
        return (EnumC2255871DRh[]) LLILLL.clone();
    }

    public final String getStorageKey() {
        return this.LL;
    }

    public final String getTrackerEvent() {
        return this.LLILLJJLI;
    }

    public static EnumC2255871DRh valueOf(String str) {
        return (EnumC2255871DRh) C08FF.LIZ(EnumC2255871DRh.class, str);
    }

    public EnumC2255871DRh(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}

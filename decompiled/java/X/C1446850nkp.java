package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.ab.CreateTabTemplateRectUriSettingsData;

/* JADX INFO: renamed from: X.0nkp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446850nkp {
    public static final CreateTabTemplateRectUriSettingsData LIZ = new CreateTabTemplateRectUriSettingsData(false, "");
    public static CreateTabTemplateRectUriSettingsData LIZIZ;

    public static final CreateTabTemplateRectUriSettingsData LIZ() {
        CreateTabTemplateRectUriSettingsData createTabTemplateRectUriSettingsData = LIZIZ;
        if (createTabTemplateRectUriSettingsData != null) {
            return createTabTemplateRectUriSettingsData;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        CreateTabTemplateRectUriSettingsData createTabTemplateRectUriSettingsData2 = LIZ;
        CreateTabTemplateRectUriSettingsData createTabTemplateRectUriSettingsData3 = (CreateTabTemplateRectUriSettingsData) settingsManagerLIZLLL.LJIIIIZZ("create_tab_template_rect_uri_config", CreateTabTemplateRectUriSettingsData.class, createTabTemplateRectUriSettingsData2);
        LIZIZ = createTabTemplateRectUriSettingsData3;
        return createTabTemplateRectUriSettingsData3 != null ? createTabTemplateRectUriSettingsData3 : createTabTemplateRectUriSettingsData2;
    }
}

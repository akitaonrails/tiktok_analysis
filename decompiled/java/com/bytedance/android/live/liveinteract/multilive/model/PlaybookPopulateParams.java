package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybookPopulateParams {

    @C09CT("base_on_online_template_content")
    public boolean baseOnOnlineTemplateContent;

    @C09CT("function_name_to_params_map")
    public Map<String, String> functionNameToParamsMap = new LinkedHashMap();

    @C09CT("playbook_content_id")
    public long playbookContentId;

    @C09CT("playbook_id")
    public long playbookId;
}

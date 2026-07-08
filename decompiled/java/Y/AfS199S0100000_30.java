package Y;

import X.AbstractC20694715yT;
import X.C09JN;
import X.C13LP;
import X.C1416990myf;
import X.C15438062q;
import X.C1C7U;
import X.C20696015yg;
import X.C532330KuF;
import X.C533070KvR;
import com.ss.android.ugc.aweme.resource.CategoryData;
import com.ss.android.ugc.aweme.resource.CategoryResp;
import com.ss.android.ugc.aweme.resource.DataListInfo;
import com.ss.android.ugc.aweme.resource.TemplateAuthor;
import com.ss.android.ugc.aweme.resource.TemplateCover;
import com.ss.android.ugc.aweme.resource.TemplateInfo;
import com.ss.android.ugc.aweme.resource.VideoTemplateInfoExt;
import com.ss.android.ugc.aweme.resource.VideoTemplateVideoInfo;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM;
import com.ss.android.ugc.aweme.setting.serverpush.compose.unlogin.PushSettingsUnLoginVM;
import com.ss.android.ugc.aweme.setting.serverpush.model.NotificationSettings;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public class AfS199S0100000_30 implements C09JN {
    public final int $t;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) throws Throwable {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public AfS199S0100000_30(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS199S0100000_30 afS199S0100000_30, Object obj) {
        C1C7U.LIZ("PushSettingsLoginVM@db7f.sendRequest$3");
        List<C20696015yg> list = (List) obj;
        ((PushSettingsLoginVM) afS199S0100000_30.l0).setState(new AwS609S0100000_30(list, (List<C20696015yg>) 82));
        PushSettingsLoginVM pushSettingsLoginVM = (PushSettingsLoginVM) afS199S0100000_30.l0;
        for (C20696015yg c20696015yg : list) {
            ConcurrentHashMap<String, HashSet<String>> concurrentHashMap = pushSettingsLoginVM.LLILLL;
            String str = c20696015yg.LIZ;
            List<AbstractC20694715yT> list2 = c20696015yg.LIZIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<AbstractC20694715yT> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getUniqueId());
            }
            concurrentHashMap.put(str, C13LP.LLIFFJFJJ(arrayList));
        }
        C1C7U.LIZIZ("PushSettingsLoginVM@db7f.sendRequest$3");
    }

    public static final void accept$1(AfS199S0100000_30 afS199S0100000_30, Object obj) {
        C1C7U.LIZ("PushSettingsUnLoginVM@2a0b.requestUnLoginPushSettings$2");
        NotificationSettings notificationSettings = (NotificationSettings) obj;
        ((PushSettingsUnLoginVM) afS199S0100000_30.l0).setState(new AwS609S0100000_30(notificationSettings, 352));
        PushSettingsUnLoginVM.LLILZLL = notificationSettings;
        C1C7U.LIZIZ("PushSettingsUnLoginVM@2a0b.requestUnLoginPushSettings$2");
    }

    public static final void accept$2(AfS199S0100000_30 afS199S0100000_30, Object obj) throws Throwable {
        DataListInfo dataListInfo;
        List<TemplateInfo> list;
        String str;
        String str2;
        String str3;
        String str4;
        TemplateAuthor templateAuthor;
        VideoTemplateVideoInfo videoTemplateVideoInfo;
        C1C7U.LIZ("TemplateFetcher@4ce9.requestTemplateDetail$3");
        CategoryResp categoryResp = (CategoryResp) obj;
        if (categoryResp.status_code == 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            CategoryData categoryData = categoryResp.data;
            if (categoryData != null && (dataListInfo = categoryData.dataInfos) != null && (list = dataListInfo.template) != null) {
                for (TemplateInfo templateInfo : list) {
                    String strValueOf = String.valueOf(templateInfo.templateId);
                    VideoTemplateInfoExt videoTemplateInfoExt = templateInfo.videoTemplateExt;
                    String str5 = null;
                    if (videoTemplateInfoExt != null && (videoTemplateVideoInfo = videoTemplateInfoExt.videoInfo) != null) {
                        str = videoTemplateVideoInfo.url;
                    } else {
                        str = null;
                    }
                    String str6 = templateInfo.md5;
                    Long lValueOf = Long.valueOf(templateInfo.provider);
                    TemplateCover templateCover = templateInfo.cover;
                    if (templateCover != null) {
                        str2 = templateCover.url;
                    } else {
                        str2 = null;
                    }
                    String str7 = templateInfo.title;
                    VideoTemplateInfoExt videoTemplateInfoExt2 = templateInfo.videoTemplateExt;
                    if (videoTemplateInfoExt2 != null && (templateAuthor = videoTemplateInfoExt2.authorInfo) != null) {
                        str3 = templateAuthor.nickName;
                    } else {
                        str3 = null;
                    }
                    String str8 = templateInfo.extra;
                    if (videoTemplateInfoExt2 != null) {
                        str4 = videoTemplateInfoExt2.nleSummary;
                        str5 = videoTemplateInfoExt2.recommendMusic;
                    } else {
                        str4 = null;
                    }
                    C532330KuF c532330KuF = new C532330KuF(str, str6, lValueOf, str2, str7, str3, str8, str4, str5, 1536);
                    C1416990myf.LIZ.getClass();
                    C533070KvR c533070KvR = (C533070KvR) C1416990myf.LIZJ.getValue();
                    if (!c533070KvR.LIZ.containsKey(strValueOf)) {
                        c533070KvR.LIZ.put(strValueOf, c532330KuF);
                    }
                    linkedHashMap.put(strValueOf, c532330KuF);
                }
            }
            ((Function1) afS199S0100000_30.l0).invoke(linkedHashMap);
            C1C7U.LIZIZ("TemplateFetcher@4ce9.requestTemplateDetail$3");
            return;
        }
        throw new Throwable("net fail");
    }

    public static final void accept$3(AfS199S0100000_30 afS199S0100000_30, Object obj) {
        C1C7U.LIZ("PushSettingsUnLoginVM@2a0b.requestUnLoginPushSettings$3");
        ((PushSettingsUnLoginVM) afS199S0100000_30.l0).setState(AFwS274S0000000_30.get$arr$(351));
        C1C7U.LIZIZ("PushSettingsUnLoginVM@2a0b.requestUnLoginPushSettings$3");
    }
}

package X;

import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateDynamicTask;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0YcZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC878090YcZ {
    void LIZ(List<? extends IMContact> list, SendMessageTemplateTask sendMessageTemplateTask, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, InterfaceC878050YcV interfaceC878050YcV, boolean z, List<RichTextInfo> list2);

    void LIZIZ(List<? extends IMContact> list, SendMessageTemplateDynamicTask sendMessageTemplateDynamicTask, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, InterfaceC878050YcV interfaceC878050YcV);

    SharePackage LIZJ(SendMessageTemplateTask sendMessageTemplateTask);

    SendMessageTemplateTask LIZLLL(int i, String str, String str2, SendMessageEventParcel sendMessageEventParcel);
}

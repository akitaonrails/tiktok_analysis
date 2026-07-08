package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.textbox.ShareTextBoxViewModel;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ld4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365160ld4 extends C09AY implements Function1<Serializable, Unit> {
    public final /* synthetic */ ShareTextBoxViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ BaseContent LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365160ld4(ShareTextBoxViewModel shareTextBoxViewModel, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, BaseContent baseContent, boolean z) {
        super(1);
        this.LL = shareTextBoxViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = map;
        this.LLILZ = map2;
        this.LLILZIL = map3;
        this.LLILZLL = baseContent;
        this.LLIZ = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Serializable serializable) {
        IMConversation iMConversationLJII;
        Serializable serializable2 = serializable;
        this.LL.DQ2(false);
        if (serializable2 != null && (serializable2 instanceof C0Y8T)) {
            IMConversation[] iMConversationArr = new IMConversation[1];
            IIMContactUtilService.LIZ.getClass();
            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
            if (iIMContactUtilServiceLIZ != null && (iMConversationLJII = iIMContactUtilServiceLIZ.LJII((C0Y8T) serializable2)) != null) {
                iMConversationArr[0] = iMConversationLJII;
                List<? extends IMContact> listLJIILJJIL = C1697810uHb.LJIILJJIL(iMConversationArr);
                this.LL.LL.extras.putBoolean("is_new_group", true);
                ShareTextBoxViewModel shareTextBoxViewModel = this.LL;
                if (shareTextBoxViewModel.LL.sendMessageTemplateTask != null) {
                    String str = this.LLILLJJLI;
                    Map<String, String> linkedHashMap = this.LLILLL;
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap<>();
                    }
                    shareTextBoxViewModel.CQ2(listLJIILJJIL, str, linkedHashMap, this.LLILZ, this.LLILZIL);
                } else {
                    String str2 = this.LLILLJJLI;
                    BaseContent baseContent = this.LLILZLL;
                    Map<String, String> map = this.LLILZIL;
                    Map<String, String> linkedHashMap2 = this.LLILLL;
                    if (linkedHashMap2 == null) {
                        linkedHashMap2 = new LinkedHashMap<>();
                    }
                    shareTextBoxViewModel.BQ2(listLJIILJJIL, str2, baseContent, map, linkedHashMap2, this.LLILZ, this.LLIZ);
                }
            }
        }
        return Unit.LIZ;
    }
}

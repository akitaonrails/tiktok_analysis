package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.sharepanel.api.service.IIMShareOpenService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.otherpage.share.api.ShareMessageResponse;
import com.ss.android.ugc.aweme.tako.share.panel.TakoBatchMessageSharePackage;
import com.ss.android.ugc.aweme.tako.share.panel.TakoBatchShareModel;
import com.ss.android.ugc.aweme.tako.share.panel.TakoShareConfiguration;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS59S1300000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0m5j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382930m5j extends C09AY implements Function1<ShareMessageResponse, Unit> {
    public final /* synthetic */ C259800zU<DialogC1389620mGW> LL;
    public final /* synthetic */ C12F5 LLILLJJLI;
    public final /* synthetic */ TakoMultipleSelectVM LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ InterfaceC665370Q7z LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1382930m5j(C259800zU<DialogC1389620mGW> c259800zU, C12F5 c12f5, TakoMultipleSelectVM takoMultipleSelectVM, String str, Map<String, String> map, View view, InterfaceC665370Q7z interfaceC665370Q7z) {
        super(1);
        this.LL = c259800zU;
        this.LLILLJJLI = c12f5;
        this.LLILLL = takoMultipleSelectVM;
        this.LLILZ = str;
        this.LLILZIL = map;
        this.LLILZLL = view;
        this.LLIZ = interfaceC665370Q7z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ShareMessageResponse shareMessageResponse) throws JSONException {
        int size;
        BaseTemplate baseTemplateLIZIZ;
        ShareMessageResponse shareMessageResponse2 = shareMessageResponse;
        DialogC1389620mGW dialogC1389620mGW = this.LL.element;
        if (dialogC1389620mGW != null) {
            C0FNV.LIZ(dialogC1389620mGW);
        }
        List<C326880Cre> listDQ2 = null;
        this.LL.element = null;
        if (Intrinsics.LJFF(C12FB.LIZ, this.LLILLJJLI)) {
            if (C298810BnT.LIZ()) {
                Activity activityLIZ = C1388190mED.LIZ(this.LLILLJJLI.LL);
                if (activityLIZ != null) {
                    TakoMultipleSelectVM takoMultipleSelectVM = this.LLILLL;
                    if (takoMultipleSelectVM != null && (listDQ2 = takoMultipleSelectVM.DQ2()) != null) {
                        size = listDQ2.size();
                    } else {
                        size = 0;
                    }
                    String strLIZ = C12FB.LIZ(this.LLILLL, this.LLILZ);
                    String str = shareMessageResponse2.dmMsgContent;
                    final C1383000m5q c1383000m5q = new C1383000m5q(activityLIZ, this.LLILZLL, this.LLILZIL, strLIZ, this.LLILLL, this.LLIZ, size);
                    Map<String, String> map = this.LLILZIL;
                    AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this.LLILLL, 1532);
                    String str2 = "";
                    if (C298810BnT.LIZ()) {
                        String string = UUID.randomUUID().toString();
                        final TakoBatchShareModel takoBatchShareModel = new TakoBatchShareModel(new C1382950m5l(string, size, "", null, null));
                        C1370940lmO c1370940lmOLJIIIIZZ = new AbstractC1377610lx9(takoBatchShareModel) { // from class: X.0m5k
                            public final TakoBatchShareModel LIZ;

                            @Override // X.AbstractC1377630lxB
                            public final String LIZJ() {
                                return "tako";
                            }

                            @Override // X.AbstractC1377630lxB
                            public final String LIZ() {
                                String str3 = this.LIZ.takoBatchShareInfo.shareDescStr;
                                return str3 == null ? "" : str3;
                            }

                            @Override // X.AbstractC1377630lxB
                            public final String LIZIZ() {
                                return this.LIZ.takoBatchShareInfo.shareId;
                            }

                            @Override // X.AbstractC1377630lxB
                            public final Bundle LJFF() {
                                Bundle bundle = new Bundle();
                                C786410Ut5.LJJJI("tako_batch_share_id", this.LIZ.takoBatchShareInfo.shareId, bundle);
                                bundle.putInt("tako_batch_msg_count", this.LIZ.takoBatchShareInfo.messageCount);
                                return bundle;
                            }

                            @Override // X.AbstractC1377630lxB
                            public final String LJI() {
                                String str3 = this.LIZ.takoBatchShareInfo.shareTitleStr;
                                return str3 == null ? "" : str3;
                            }

                            @Override // X.AbstractC1377630lxB
                            public final String LJII() {
                                return this.LIZ.takoBatchShareInfo.sharePageUrl;
                            }

                            @Override // X.AbstractC1377630lxB
                            public final ShareModel LJ() {
                                return this.LIZ;
                            }

                            {
                                this.LIZ = takoBatchShareModel;
                            }
                        }.LJIIIIZZ();
                        if (str != null && (baseTemplateLIZIZ = C2241931Cox.LIZIZ(2000, str)) != null) {
                            Pair[] pairArr = new Pair[2];
                            String str3 = map.get("process_id");
                            if (str3 == null) {
                                str3 = "";
                            }
                            pairArr[0] = new Pair("tako_process_id", str3);
                            pairArr[1] = new Pair("tako_message_id", strLIZ);
                            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                            String str4 = map.get("enter_from");
                            if (str4 == null) {
                                str4 = "";
                            }
                            String str5 = map.get("enter_method");
                            if (str5 == null) {
                                str5 = "";
                            }
                            c1370940lmOLJIIIIZZ.LJIIIIZZ = new SendMessageTemplateTask("tako_prompts_share_optimize", baseTemplateLIZIZ, new SendMessageEventParcel(str4, null, null, str5, null, C08JS.LIZLLL(mapLJIIIIZZ), 22), null, false, 24);
                        }
                        TakoBatchMessageSharePackage takoBatchMessageSharePackage = new TakoBatchMessageSharePackage(c1370940lmOLJIIIIZZ);
                        takoBatchMessageSharePackage.shareId = string;
                        takoBatchMessageSharePackage.renderedLongImage = null;
                        takoBatchMessageSharePackage.selectedMessages = listDQ2;
                        takoBatchMessageSharePackage.commonParams = map;
                        takoBatchMessageSharePackage.mobMessageId = strLIZ;
                        takoBatchMessageSharePackage.onDmSendSuccess = awS565S0100000_21;
                        C786410Ut5.LJJJI("enter_from", "message_history", takoBatchMessageSharePackage.extras);
                        Bundle bundle = takoBatchMessageSharePackage.extras;
                        String str6 = map.get("enter_from");
                        if (str6 == null) {
                            str6 = "";
                        }
                        C786410Ut5.LJJJI("enter_from", str6, bundle);
                        Bundle bundle2 = takoBatchMessageSharePackage.extras;
                        String str7 = map.get("enter_method");
                        if (str7 == null) {
                            str7 = "";
                        }
                        C786410Ut5.LJJJI("enter_method", str7, bundle2);
                        Bundle bundle3 = takoBatchMessageSharePackage.extras;
                        String str8 = map.get("process_id");
                        if (str8 == null) {
                            str8 = "";
                        }
                        C786410Ut5.LJJJI("process_id", str8, bundle3);
                        Bundle bundle4 = takoBatchMessageSharePackage.extras;
                        String str9 = map.get("tako_session_id");
                        if (str9 == null) {
                            str9 = "";
                        }
                        C786410Ut5.LJJJI("tako_session_id", str9, bundle4);
                        Bundle bundle5 = takoBatchMessageSharePackage.extras;
                        String str10 = map.get("tako_chat_id");
                        if (str10 == null) {
                            str10 = "";
                        }
                        C786410Ut5.LJJJI("tako_chat_id", str10, bundle5);
                        C786410Ut5.LJJJI("tako_message_id", strLIZ, takoBatchMessageSharePackage.extras);
                        C1382840m5a.LIZ.put(takoBatchMessageSharePackage, Collections.singletonList(new InterfaceC1370310llN(c1383000m5q) { // from class: X.0hbh
                            public final Function2<Context, BaseSharePackage, Unit> LL;

                            @Override // X.InterfaceC1370310llN
                            public final float LIZLLL() {
                                return -1.0f;
                            }

                            @Override // X.InterfaceC1370310llN
                            public final void LJI() {
                            }

                            @Override // X.InterfaceC1370310llN
                            public final int LJII() {
                                return R.raw.icon_image_alt_1_fill;
                            }

                            @Override // X.InterfaceC1370310llN
                            public final int LJIIIIZZ() {
                                return R.raw.icon_image_alt_1_fill;
                            }

                            @Override // X.InterfaceC1370310llN
                            public final boolean LJIIIZ() {
                                return false;
                            }

                            @Override // X.InterfaceC1370310llN
                            public final Integer LJIILJJIL() {
                                return null;
                            }

                            @Override // X.InterfaceC1370310llN
                            public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                            }

                            @Override // X.InterfaceC1370310llN
                            public final int LJIJJLI() {
                                return 0;
                            }

                            @Override // X.InterfaceC1370310llN
                            public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                            }

                            @Override // X.InterfaceC1370310llN
                            public final void LJJIJ(ImageView imageView, View view, int i) {
                            }

                            @Override // X.InterfaceC1370310llN
                            public final Integer LJJIJIIJIL() {
                                return null;
                            }

                            @Override // X.InterfaceC1370310llN
                            public final boolean LJJIL() {
                                return true;
                            }

                            @Override // X.InterfaceC1370310llN
                            public final String LJJIZ() {
                                return "";
                            }

                            @Override // X.InterfaceC1370310llN
                            public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                            }

                            @Override // X.InterfaceC1370310llN
                            public final void LJJJJI(BaseSharePackage baseSharePackage) {
                            }

                            @Override // X.InterfaceC1370310llN
                            public final Integer LJJJJIZL() {
                                return null;
                            }

                            @Override // X.InterfaceC1370310llN
                            public final boolean LJJJJL() {
                                return false;
                            }

                            @Override // X.InterfaceC1370450llb
                            public final int LJJJJLI() {
                                return 100;
                            }

                            @Override // X.InterfaceC1370310llN
                            public final boolean LJJJLZIJ() {
                                return false;
                            }

                            @Override // X.InterfaceC1370310llN
                            public final int LJJLIIIJJIZ() {
                                return 2131822540;
                            }

                            @Override // X.InterfaceC1370310llN
                            public final boolean LJJLIIIJL() {
                                return false;
                            }

                            @Override // X.InterfaceC1370310llN
                            public final boolean enable() {
                                return true;
                            }

                            @Override // X.InterfaceC1370310llN
                            public final String key() {
                                return "tako_share_create_image";
                            }

                            @Override // X.InterfaceC1370310llN
                            public final String label() {
                                return "";
                            }

                            @Override // X.InterfaceC1370310llN
                            public final int LJIIJJI() {
                                return !enable() ? 1 : 0;
                            }

                            @Override // X.InterfaceC1370310llN
                            public final C0M7Z LJIIJ() {
                                return C0M7Z.ShareButton;
                            }

                            @Override // X.InterfaceC1370310llN
                            public final EnumC1216710hld LJJJZ() {
                                return EnumC1216710hld.NORMAL;
                            }

                            {
                                this.LL = c1383000m5q;
                            }

                            @Override // X.InterfaceC1370310llN
                            public final void LJIJJ(TextView textView) {
                                C1370320llO.LJ(this, textView);
                            }

                            @Override // X.InterfaceC1370310llN
                            public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                                return C1370320llO.LIZJ(enumC1369720lkQ);
                            }

                            @Override // X.InterfaceC1370310llN
                            public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                                this.LL.invoke(context, baseSharePackage);
                            }

                            @Override // X.InterfaceC1370310llN
                            public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                                C1370320llO.LIZ(this, view, baseSharePackage);
                            }

                            @Override // X.InterfaceC1370310llN
                            public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                                C1370320llO.LIZIZ(this, view, baseSharePackage);
                            }

                            @Override // X.InterfaceC1370310llN
                            public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                                C1370320llO.LIZLLL(context, baseSharePackage, this);
                            }
                        }));
                        C621180OYa.LIZ.LJIIZILJ(takoBatchMessageSharePackage, activityLIZ, TakoShareConfiguration.LLILLJJLI);
                    }
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    String str11 = this.LLILZIL.get("enter_from");
                    String str12 = this.LLILZIL.get("enter_method");
                    String str13 = this.LLILZIL.get("process_id");
                    String str14 = this.LLILZIL.get("tako_session_id");
                    if (str14 != null) {
                        str2 = str14;
                    }
                    C1862330yYx.LJLJI(c1862330yYx, str11, str12, str13, "share", strLIZ, null, null, null, null, null, null, null, null, str2, this.LLILZIL.get("tako_chat_id"), 40928);
                }
            } else {
                IIMShareOpenService iIMShareOpenService = (IIMShareOpenService) PluggableExtentionKt.pluggableSpi$default(IIMShareOpenService.class, false, false, false, 14, null);
                if (iIMShareOpenService != null) {
                    String str15 = shareMessageResponse2.dmMsgContent;
                    AwS59S1300000_21 awS59S1300000_21 = new AwS59S1300000_21(this.LLILLJJLI, (C12F5) this.LLILZIL, (Map<String, String>) this.LLILLL, (TakoMultipleSelectVM) this.LLILZ, (String) 5);
                    final TakoMultipleSelectVM takoMultipleSelectVM2 = this.LLILLL;
                    iIMShareOpenService.LIZ(2, "tako_prompts_share_optimize", str15, awS59S1300000_21, new InterfaceC1378430lyT() { // from class: X.0m5n
                        @Override // X.InterfaceC1378430lyT
                        public final void LIZ(int i) {
                            TakoMultipleSelectVM takoMultipleSelectVM3;
                            if (i == 0 && (takoMultipleSelectVM3 = takoMultipleSelectVM2) != null) {
                                takoMultipleSelectVM3.AQ2();
                            }
                        }
                    }, null);
                }
            }
        }
        return Unit.LIZ;
    }
}

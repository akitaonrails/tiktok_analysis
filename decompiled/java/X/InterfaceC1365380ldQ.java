package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.BaseHeader;
import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.sharepanel.api.model.ScreenShotShareContent;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.liveevent.LiveEventGuestShareDialog;
import com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreContactsContentFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.GroupSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveEventSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ldQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC1365380ldQ {
    boolean LIZ(String str);

    void LIZIZ(Context context, Bundle bundle);

    void LIZJ(List<? extends C869590Y9l> list);

    boolean LIZLLL(View view, C869590Y9l c869590Y9l);

    String LJ(EnumC896890ZGl enumC896890ZGl);

    void LJFF(C869590Y9l c869590Y9l);

    BaseContent.ReferenceSceneType LJI(EnumC896890ZGl enumC896890ZGl, C0ZH0 c0zh0);

    void LJII(String str, User user, C0Y8T c0y8t, Aweme aweme, String str2, EnumC896890ZGl enumC896890ZGl, String str3, C0ZH0 c0zh0, String str4, Function1<? super CharSequence, Unit> function1);

    void LJIIIIZZ(C869590Y9l c869590Y9l);

    boolean LJIIIZ(ScreenShotShareContent screenShotShareContent);

    DialogC1366380lf2 LJIIJ(Activity activity, InterfaceC1365250ldD interfaceC1365250ldD, SharePackage sharePackage, BaseContent baseContent, Map map, Map map2, Map map3, boolean z, boolean z2, boolean z3, boolean z4, Function0 function0);

    C1723906p3 LJIIJJI();

    int LJIIL(int i, String str);

    void LJIILIIL(List list, GroupSharePackage groupSharePackage, String str);

    boolean LJIILJJIL(C19EG c19eg, String str, C1366620lfQ c1366620lfQ);

    void LJIILL(String str, IMUser iMUser, IMContact iMContact, Aweme aweme, String str2, EnumC896890ZGl enumC896890ZGl, String str3, C0ZH0 c0zh0, String str4, boolean z, InterfaceC714750S1x interfaceC714750S1x, Function1<? super CharSequence, Unit> function1, Map<String, String> map, FeatureAttachmentContent featureAttachmentContent, BaseHeader baseHeader);

    Map<String, String> LJIILLIIL(Aweme aweme, String str, String str2, String str3, String str4, BaseContent.ReferenceSceneType referenceSceneType, InterfaceC714750S1x interfaceC714750S1x, Map<String, String> map);

    AttachmentTypeComponent LJIIZILJ(EnumC896890ZGl enumC896890ZGl, C0ZH0 c0zh0);

    void LJIJ(long j, String str);

    void LJIJI(boolean z);

    void LJIJJ(String str, StickerTemplate stickerTemplate, User user, Aweme aweme, String str2, String str3, String str4, Boolean bool, boolean z, BaseContent.ReferenceSceneType referenceSceneType, String str5, InterfaceC714750S1x interfaceC714750S1x, Map map, InterfaceC1361990lXx interfaceC1361990lXx);

    LiveEventGuestShareDialog LJIJJLI(Activity activity, LiveEventSharePackage liveEventSharePackage, String str, long j, Pair pair);

    void LJIL(Context context, View view, C1365870leD c1365870leD);

    DialogC1369410ljv LJJ(Activity activity);

    void LJJI(List<String> list);

    void LJJIFFI(String str);

    void LJJII(C19EG c19eg, String str);

    boolean LJJIII();

    void LJJIIJ();

    void LJJIIJZLJL(Fragment fragment, C1365870leD c1365870leD, int i);

    void LJJIIZ(Fragment fragment, C1365870leD c1365870leD);

    void LJJIIZI();

    void LJJIJ(TextContent textContent, TextContent textContent2, SharePackage sharePackage);

    void LJJIJIIJI(List<? extends IMContact> list);

    void LJJIJIIJIL(SharePackage sharePackage, String str, List<? extends IMContact> list, Map<String, String> map, boolean z, InterfaceC1362600lYw interfaceC1362600lYw);

    void LJJIJIL(Context context, IMContact iMContact, SharePackage sharePackage, C0U3R<Boolean> c0u3r);

    List<C1723206ow> LJJIJL();

    void LJJIJLIJ(InterfaceC1362600lYw interfaceC1362600lYw, SharePackage sharePackage, String str, List list);

    void LJJIL(String str, Aweme aweme, String str2, String str3, Map map, C896860ZGi c896860ZGi);

    void LJJIZ(Context context, List list, SharePackage sharePackage, C740840T4g c740840T4g);

    void LJJJ(SharePackage sharePackage, String str, List<? extends IMContact> list, InterfaceC1362600lYw interfaceC1362600lYw, int i, BaseContent baseContent, Map<String, String> map, Map<String, String> map2, boolean z, Integer num, Map<String, ? extends List<RichTextInfo>> map3);

    void LJJJI(String str, User user, Aweme aweme, String str2, EnumC896890ZGl enumC896890ZGl, String str3, C0ZH0 c0zh0, String str4, boolean z, Map<String, String> map, Function1<? super CharSequence, Unit> function1);

    void LJJJIL(String str, IMUser iMUser, Aweme aweme, String str2, EnumC896890ZGl enumC896890ZGl, String str3, C0ZH0 c0zh0, String str4, boolean z, InterfaceC714750S1x interfaceC714750S1x, Function1<? super CharSequence, Unit> function1, Map<String, String> map, FeatureAttachmentContent featureAttachmentContent, BaseHeader baseHeader);

    C1365120ld0 LJJJJ(Context context, MutableLiveData mutableLiveData, ShareMoreContactsContentFragment shareMoreContactsContentFragment, C1368660lii c1368660lii, SharePackage sharePackage, BaseContent baseContent, Map map, Map map2, Set set, boolean z, boolean z2, Fragment fragment, View view, boolean z3, boolean z4);

    AttachmentComponent LJJJJI(Aweme aweme, AttachmentTypeComponent attachmentTypeComponent, User user);

    InterfaceC1368700lim LJJJJIZL();

    boolean LJJJJJ(int i, String str);

    void LJJJJJL(List<String> list);

    boolean LJJJJL(View view, AwemeCardTemplate awemeCardTemplate);

    void LJJJJLI(SharePackage sharePackage, IMContact iMContact);

    void LJJJJLL(C0Y8T c0y8t, Aweme aweme, C896870ZGj c896870ZGj, Boolean bool, String str, String str2, String str3, String str4, String str5, boolean z);

    DialogC1389100mFg LJJJJZ(Activity activity, SharePackage sharePackage, C1365460ldY c1365460ldY, Set set, boolean z, InterfaceC1365250ldD interfaceC1365250ldD, boolean z2, C1214170hhX c1214170hhX, boolean z3, boolean z4, boolean z5, boolean z6, Boolean bool, boolean z7, boolean z8, boolean z9, String str);

    void LJJJJZI(List list, String str, SharePackage sharePackage, Map map, Map map2, String str2, C1365050lct c1365050lct, InterfaceC1362600lYw interfaceC1362600lYw, List list2);

    void LJJJLIIL(C19EG c19eg, C1372780lpM c1372780lpM);
}

package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.strategybridge.LightInteractionMetaData;
import com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.LightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZM4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZM4 implements InterfaceC893150Z2b, ILightInteractionPlatformService {
    public static final C0ZM4 LLILLJJLI = new C0ZM4();
    public final /* synthetic */ LightInteractionManager LL = LightInteractionManager.LLJILLL;

    @Override // X.InterfaceC913290ZsF
    public final void LIZ() {
        this.LL.LIZ();
    }

    @Override // X.C0Z9X
    public final InterfaceC892560Yzu LIZJ() {
        this.LL.LIZJ();
        return C898150ZLh.LL;
    }

    @Override // X.InterfaceC912670ZrF
    public final BaseContent.ReferenceVideo LIZLLL(Aweme aweme) {
        return this.LL.LIZLLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final InterfaceC1707406mO LJ() {
        return this.LL.LJ();
    }

    @Override // X.InterfaceC894810Z8l
    public final C0Z8Z LJFF() {
        return this.LL.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final String LJI(C869590Y9l c869590Y9l) {
        return this.LL.LJI(c869590Y9l);
    }

    @Override // X.C0Z9X
    public final String LJII(String str) {
        return this.LL.LJII(str);
    }

    @Override // X.InterfaceC912670ZrF
    public final AttachmentComponent LJIIIZ(Aweme aweme, User user, EnumC462090IAd enumC462090IAd) {
        return this.LL.LJIIIZ(aweme, user, enumC462090IAd);
    }

    @Override // X.InterfaceC1513805wG
    public final boolean LJIIJ() {
        return this.LL.LJIIJ();
    }

    @Override // X.InterfaceC894800Z8k
    public final void LJIILIIL(String str, EnumC1696906kh enumC1696906kh) {
        this.LL.LJIILIIL(str, enumC1696906kh);
    }

    @Override // X.InterfaceC1513605wE
    public final boolean LJIILL(String str) {
        return this.LL.LJIILL(str);
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final void LJIILLIIL(Context context) {
        this.LL.LJIILLIIL(context);
    }

    @Override // X.C0Z9X
    public final InterfaceC1357410lQZ LJIIZILJ(String str) {
        return this.LL.LJIIZILJ(str);
    }

    @Override // X.C0Z9J
    public final void LJIJI(String str, boolean z) {
        this.LL.LJIJI(str, z);
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final boolean LJIJJLI() {
        return this.LL.LJIJJLI();
    }

    @Override // X.C0Z9Y
    public final C0Z9K LJJI() {
        return this.LL.LJJI();
    }

    @Override // X.InterfaceC894800Z8k
    public final void LJJII(String str, EnumC1696906kh enumC1696906kh, long j) {
        this.LL.LJJII(str, enumC1696906kh, j);
    }

    @Override // X.InterfaceC1513605wE
    public final void LJJIII(List<String> list) {
        this.LL.LJJIII(list);
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final long LJJIIJ(User user) {
        return this.LL.LJJIIJ(user);
    }

    @Override // X.InterfaceC896150ZDp
    public final String LJJIIJZLJL(String str, String str2) {
        return this.LL.LJJIIJZLJL(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final LightInteractionCommonResource LJJIIZI(String str) {
        return this.LL.LJJIIZI(str);
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final Pair<LightInteractionEntryConf, Integer> LJJIJIIJI(LightInteractionMetaData lightInteractionMetaData, InterfaceC1707406mO interfaceC1707406mO) {
        return this.LL.LJJIJIIJI(lightInteractionMetaData, interfaceC1707406mO);
    }

    @Override // X.C0Z9X
    public final InterfaceC892560Yzu LJJIJIIJIL(LifecycleOwner lifecycleOwner) {
        return this.LL.LJJIJIIJIL(lifecycleOwner);
    }

    @Override // X.InterfaceC1513805wG
    public final boolean LJJIJL() {
        return this.LL.LJJIJL();
    }

    @Override // X.InterfaceC1513805wG
    public final boolean LJJIL() {
        return this.LL.LJJIL();
    }

    @Override // X.C0ZEG
    public final boolean LJJIZ(String str, RelationButton relationButton, String str2, Map map, String str3, User user, String str4, boolean z, AttachmentComponent attachmentComponent, Integer num, Serializable serializable, LifecycleOwner lifecycleOwner, Function0 function0) {
        return this.LL.LJJIZ(str, relationButton, str2, map, str3, user, str4, z, attachmentComponent, num, serializable, lifecycleOwner, function0);
    }

    @Override // X.InterfaceC1513805wG
    public final boolean LJJJ() {
        return this.LL.LJJJ();
    }

    @Override // X.C0Z9Y
    public final C0ICM LJJJIL() {
        return this.LL.LJJJIL();
    }

    @Override // X.InterfaceC912670ZrF
    public final AttachmentComponent LJJJJ(Serializable serializable, EnumC462090IAd enumC462090IAd) {
        return this.LL.LJJJJ(serializable, enumC462090IAd);
    }

    @Override // X.InterfaceC1357440lQc
    public final boolean LJJJJI(User user) {
        return this.LL.LJJJJI(user);
    }

    @Override // X.C0Z9Y
    public final InterfaceC893150Z2b LJJJJIZL() {
        return this.LL.LJJJJIZL();
    }

    @Override // X.InterfaceC896150ZDp
    public final InterfaceC1411705fn LJJJJJ() {
        return this.LL.LJJJJJ();
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final boolean LJJJJJL(C869590Y9l c869590Y9l) {
        return this.LL.LJJJJJL(c869590Y9l);
    }

    @Override // X.InterfaceC913290ZsF
    public final void LJJJJL() {
        this.LL.LJJJJL();
    }

    @Override // X.C0ZEG
    public final boolean LJJJJLI(String str, String str2, String str3, String str4, String str5) {
        return this.LL.LJJJJLI(str, str2, str3, str4, str5);
    }

    @Override // X.C0ZEG
    public final void LJJJJLL(String str, String str2, Context context, boolean z, String str3, Map<String, String> map, View view) {
        this.LL.LJJJJLL(str, str2, context, false, str3, map, view);
    }

    @Override // X.InterfaceC1513605wE
    public final InterfaceC19330810jy LJJJJZ() {
        return this.LL.LJJJJZ();
    }

    @Override // X.InterfaceC1513605wE
    public final Object LJJJLIIL(long j, String str, AbstractC23140094w abstractC23140094w) {
        return this.LL.LJJJLIIL(j, str, abstractC23140094w);
    }

    @Override // X.InterfaceC1513805wG
    public final boolean LJJJLL() {
        return this.LL.LJJJLL();
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final LightInteractionCommonResource LJJJLZIJ(C869590Y9l c869590Y9l) {
        return this.LL.LJJJLZIJ(c869590Y9l);
    }

    @Override // X.InterfaceC894800Z8k
    public final void LJJJZ(String str, EnumC1696906kh enumC1696906kh, C0C97 c0c97, String str2, long j) {
        this.LL.LJJJZ(str, enumC1696906kh, c0c97, str2, j);
    }

    @Override // X.InterfaceC1513605wE
    public final void LJJL(long j, String str, String str2) {
        this.LL.LJJL(j, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final Object LJJLI(String str, String str2, String str3, Map<String, String> map, ReferenceInfo referenceInfo, AttachmentComponent attachmentComponent, Serializable serializable, Integer num, C0YTK c0ytk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return this.LL.LJJLI(str, str2, str3, map, referenceInfo, attachmentComponent, serializable, num, c0ytk, interfaceC1364105Vn);
    }

    @Override // X.C0ZEG
    public final boolean LJJLIIIIJ() {
        return this.LL.LJJLIIIIJ();
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final void LJJLIIIJILLIZJL(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, ReferenceInfo referenceInfo, AttachmentComponent attachmentComponent, Serializable serializable, Integer num, C0YTK c0ytk, BaseHeaderComponent baseHeaderComponent) {
        this.LL.LJJLIIIJILLIZJL(str, str2, str3, map, map2, referenceInfo, attachmentComponent, serializable, num, c0ytk, baseHeaderComponent);
    }

    @Override // X.C0ZEG
    public final String LJJLIIIJJI(String str) {
        return this.LL.LJJLIIIJJI(str);
    }

    @Override // X.C0ZEG
    public final boolean LJJLIIIJJIZ() {
        return this.LL.LJJLIIIJJIZ();
    }

    @Override // X.InterfaceC1513805wG
    public final int LJJLIIIJLJLI() {
        return this.LL.LJJLIIIJLJLI();
    }

    @Override // X.C0Z9X
    public final String LJJLIIIJLLLLLLLZ(Boolean bool) {
        return this.LL.LJJLIIIJLLLLLLLZ(bool);
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final void LJJLIIJ(long j, String str) {
        this.LL.LJJLIIJ(j, str);
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final long LJJLIL(String str) {
        return this.LL.LJJLIL(str);
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final String LJJLJLI(Long l, Long l2) {
        return this.LL.LJJLJLI(l, l2);
    }

    @Override // X.C0Z9X
    public final String LJIIL(C869590Y9l c869590Y9l) {
        return this.LL.LLILZLL.LJIIL(c869590Y9l);
    }

    @Override // X.C0Z9X
    public final String LJJIIZ(C869590Y9l c869590Y9l) {
        return this.LL.LLILZLL.LJJIIZ(c869590Y9l);
    }

    @Override // X.InterfaceC893150Z2b
    public final AbstractViewOnClickListenerC894730Z8d LJJLIIIJL(Context context, LifecycleOwner lifecycleOwner) {
        C898300ZLw c898300ZLw = new C898300ZLw(context, null, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c898300ZLw);
        c898300ZLw.setLayoutParams(layoutParams);
        if (lifecycleOwner != null) {
            c898300ZLw.LL = C898170ZLj.LL.LJJIJIIJIL(lifecycleOwner);
        }
        return c898300ZLw;
    }

    @Override // X.InterfaceC893150Z2b
    public final String LJJLJ(String str, String str2, boolean z) {
        LightInteractionCommonResource lightInteractionCommonResourceLJJIIZI = LJJIIZI(str);
        if (lightInteractionCommonResourceLJJIIZI == null || Intrinsics.LJFF(lightInteractionCommonResourceLJJIIZI.getMessageType(), String.valueOf(EnumC868450Y5b.LEGACY_MESSAGE_TYPE_TEXT.getValue()))) {
            return null;
        }
        if (z) {
            String senderPreviewHintText = lightInteractionCommonResourceLJJIIZI.getSenderPreviewHintText();
            if (senderPreviewHintText != null) {
                Object[] objArr = new Object[1];
                if (str2 == null) {
                    str2 = "";
                }
                objArr[0] = str2;
                String strJ4 = C786410Ut5.j4(senderPreviewHintText, Arrays.copyOf(objArr, 1));
                if (strJ4 != null && C123100dR.LIZ(strJ4)) {
                    return strJ4;
                }
            }
        } else {
            String receiverPreviewHintText = lightInteractionCommonResourceLJJIIZI.getReceiverPreviewHintText();
            if (receiverPreviewHintText != null) {
                Object[] objArr2 = new Object[1];
                if (str2 == null) {
                    str2 = "";
                }
                objArr2[0] = str2;
                String strJ42 = C786410Ut5.j4(receiverPreviewHintText, Arrays.copyOf(objArr2, 1));
                if (strJ42 != null && C123100dR.LIZ(strJ42)) {
                    return strJ42;
                }
            }
        }
        return null;
    }
}

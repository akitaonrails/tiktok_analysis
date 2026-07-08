package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.lightinteract.api.model.AlphaVideoFileModel;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.strategybridge.LightInteractionMetaData;
import com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.LightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZM5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZM5 implements C0ICM, ILightInteractionPlatformService, C0ICL {
    public static final C0ZM5 LLILLL = new C0ZM5();
    public static final Map<String, AlphaVideoFileModel.Item> LLILZ = new ConcurrentHashMap();
    public final /* synthetic */ LightInteractionManager LL = LightInteractionManager.LLJILLL;
    public final /* synthetic */ C0ZM6 LLILLJJLI = C0ZM6.LL;

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

    @Override // X.C0ICL
    public final BaseTemplate LJIIIIZZ(C869590Y9l c869590Y9l, AttachmentComponent attachmentComponent, String str, String str2) {
        return this.LLILLJJLI.LJIIIIZZ(c869590Y9l, attachmentComponent, str, str2);
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

    @Override // X.C0ICL
    public final C0ZCV LJJJI(C869590Y9l c869590Y9l, GifContent gifContent) {
        return this.LLILLJJLI.LJJJI(c869590Y9l, gifContent);
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

    @Override // X.C0ICM
    public final String LIZIZ(String str) {
        String quoteText;
        LightInteractionCommonResource lightInteractionCommonResourceLJJIIZI = LJJIIZI(str);
        if (lightInteractionCommonResourceLJJIIZI == null || Intrinsics.LJFF(lightInteractionCommonResourceLJJIIZI.getMessageType(), String.valueOf(EnumC868450Y5b.LEGACY_MESSAGE_TYPE_TEXT.getValue())) || (quoteText = lightInteractionCommonResourceLJJIIZI.getQuoteText()) == null || !C123100dR.LIZ(quoteText)) {
            return null;
        }
        return quoteText;
    }

    @Override // X.C0Z9X
    public final String LJIIL(C869590Y9l c869590Y9l) {
        return this.LL.LLILZLL.LJIIL(c869590Y9l);
    }

    @Override // X.C0ICM
    public final C0ZFQ LJIL(C869590Y9l c869590Y9l) {
        return new C0ZFQ(c869590Y9l);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    @Override // X.C0ICM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C0ZMC
            if (r0 == 0) goto L5b
            r4 = r6
            X.0ZMC r4 = (X.C0ZMC) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L4d
            if (r0 != r1) goto L73
            X.C155000ia.LIZIZ(r3)
        L22:
            java.util.Map r3 = (java.util.Map) r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L31:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource r0 = (com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource) r0
            java.lang.String r0 = r0.getGeckoAnimationChannel()
            if (r0 == 0) goto L31
            r2.add(r0)
            goto L31
        L4d:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager r0 = com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager.LLJILLL
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJJLL(r4)
            if (r3 != r2) goto L22
            return r2
        L5b:
            X.0ZMC r4 = new X.0ZMC
            r4.<init>(r5, r6)
            goto L12
        L61:
            java.util.Set r1 = X.C13LP.LLIIJI(r2)
            X.06QM r0 = com.ss.android.ugc.aweme.im.saas.host.api.feature.interaction.InteractionFeature.LIZ
            com.ss.android.ugc.aweme.im.saas.host.api.feature.interaction.InteractionFeature r0 = r0.LIZ()
            if (r0 == 0) goto L70
            r0.LIZJ(r1)
        L70:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L73:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZM5.LJJ(X.05Vn):java.lang.Object");
    }

    @Override // X.C0Z9X
    public final String LJJIIZ(C869590Y9l c869590Y9l) {
        return this.LL.LLILZLL.LJJIIZ(c869590Y9l);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x017d A[PHI: r3
      0x017d: PHI (r3v14 com.ss.android.ugc.aweme.im.lightinteract.api.model.AlphaVideoFileModel$Item) = 
      (r3v9 com.ss.android.ugc.aweme.im.lightinteract.api.model.AlphaVideoFileModel$Item)
      (r3v13 com.ss.android.ugc.aweme.im.lightinteract.api.model.AlphaVideoFileModel$Item)
     binds: [B:58:0x013c, B:69:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0ICM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIL(X.C869590Y9l r19, kotlin.jvm.internal.AwS90S0110000_2 r20) {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZM5.LJJIJIL(X.0Y9l, kotlin.jvm.internal.AwS90S0110000_2):void");
    }

    @Override // X.C0ICM
    public final boolean LJJLIIIJ(C869590Y9l c869590Y9l, View view) {
        LightInteractionCommonResource lightInteractionCommonResourceLJJIIZI;
        C0ZFQ c0zfq = new C0ZFQ(c869590Y9l);
        String strLJI = LJI(c869590Y9l);
        if (strLJI == null || (lightInteractionCommonResourceLJJIIZI = LJJIIZI(strLJI)) == null || !c0zfq.LIZJ()) {
            return false;
        }
        C0I9R c0i9r = C0I9R.LIZIZ;
        c0i9r.LIZ.getClass();
        C0ZM8.LIZIZ(view, lightInteractionCommonResourceLJJIIZI);
        c0i9r.LIZ.getClass();
        C0ZM8.LIZ(lightInteractionCommonResourceLJJIIZI, c869590Y9l);
        new C0ZFQ(c869590Y9l).LJ();
        return true;
    }

    @Override // X.C0ICM
    public final C460290I3f LJIJ(String str, String str2, boolean z) {
        LightInteractionCommonResource lightInteractionCommonResourceLJJIIZI = LJJIIZI(str);
        if (lightInteractionCommonResourceLJJIIZI == null) {
            return null;
        }
        if (z) {
            String quoteTopReceiver = lightInteractionCommonResourceLJJIIZI.getQuoteTopReceiver();
            if (quoteTopReceiver == null) {
                return null;
            }
            if (str2 == null) {
                str2 = "";
            }
            return new C460290I3f(quoteTopReceiver, Collections.singletonList(str2));
        }
        String quoteTopSender = lightInteractionCommonResourceLJJIIZI.getQuoteTopSender();
        if (quoteTopSender == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return new C460290I3f(quoteTopSender, Collections.singletonList(str2));
    }

    @Override // X.C0ICM
    public final void LJJIJ(long j, long j2, C869590Y9l c869590Y9l) {
        boolean z;
        C0ZFQ c0zfq = new C0ZFQ(c869590Y9l);
        boolean z2 = true;
        if (c869590Y9l.getIndex() > j) {
            z = true;
        } else {
            z = false;
        }
        if (c869590Y9l.getIndex() <= j2) {
            z2 = false;
        }
        boolean zLIZ = c0zfq.LIZ();
        if (z && z2 && zLIZ) {
            c0zfq.LJFF();
        }
    }

    @Override // X.C0ICM
    public final boolean LJJIFFI(boolean z, C869590Y9l c869590Y9l, Size size, C444350Hbd c444350Hbd, C0ICP c0icp) {
        LightInteractionCommonResource lightInteractionCommonResourceLJJIIZI;
        C0ZFQ c0zfq = new C0ZFQ(c869590Y9l);
        String strLJI = LJI(c869590Y9l);
        boolean z2 = false;
        if (strLJI == null || (lightInteractionCommonResourceLJJIIZI = LJJIIZI(strLJI)) == null) {
            return false;
        }
        if (!c0zfq.LIZJ()) {
            C0I9Q.LIZIZ.getClass();
            return C0I9Q.LIZJ(size, c869590Y9l, c444350Hbd, c0icp, lightInteractionCommonResourceLJJIIZI);
        }
        C0I9Q c0i9q = C0I9Q.LIZIZ;
        c0i9q.getClass();
        if (!C0I9Q.LIZ(size, c869590Y9l, c444350Hbd, c0icp, lightInteractionCommonResourceLJJIIZI)) {
            return false;
        }
        c0i9q.LIZ.getClass();
        C0ZM8.LIZIZ(c444350Hbd, lightInteractionCommonResourceLJJIIZI);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            z2 = true;
        }
        c0i9q.getClass();
        C0I9Q.LIZIZ(lightInteractionCommonResourceLJJIIZI, c444350Hbd, z, z2);
        c0i9q.LIZ.getClass();
        C0ZM8.LIZ(lightInteractionCommonResourceLJJIIZI, c869590Y9l);
        new C0ZFQ(c869590Y9l).LJ();
        return true;
    }

    @Override // X.C0ICM
    public final boolean LJJIJLIJ(boolean z, C869590Y9l c869590Y9l, Size size, RemoteImageView remoteImageView, C0ICN c0icn) {
        LightInteractionCommonResource lightInteractionCommonResourceLJJIIZI;
        boolean z2 = false;
        if (c869590Y9l == null) {
            return false;
        }
        C0ZFQ c0zfq = new C0ZFQ(c869590Y9l);
        String strLJI = LJI(c869590Y9l);
        if (strLJI == null || (lightInteractionCommonResourceLJJIIZI = LJJIIZI(strLJI)) == null) {
            return false;
        }
        if (!c0zfq.LIZJ()) {
            C0I9Q.LIZIZ.getClass();
            return C0I9Q.LIZJ(size, c869590Y9l, remoteImageView, c0icn, lightInteractionCommonResourceLJJIIZI);
        }
        C0I9Q c0i9q = C0I9Q.LIZIZ;
        c0i9q.getClass();
        if (!C0I9Q.LIZ(size, c869590Y9l, remoteImageView, null, lightInteractionCommonResourceLJJIIZI)) {
            return false;
        }
        c0i9q.LIZ.getClass();
        C0ZM8.LIZIZ(remoteImageView, lightInteractionCommonResourceLJJIIZI);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            z2 = true;
        }
        c0i9q.getClass();
        C0I9Q.LIZIZ(lightInteractionCommonResourceLJJIIZI, remoteImageView, z, z2);
        c0i9q.LIZ.getClass();
        C0ZM8.LIZ(lightInteractionCommonResourceLJJIIZI, c869590Y9l);
        new C0ZFQ(c869590Y9l).LJ();
        return true;
    }
}

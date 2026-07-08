package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS72S1300000_2;

/* JADX INFO: renamed from: X.06jh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1690706jh extends C06OD<C06OO> {
    public final Context LLILLL;
    public final SessionInfo LLILZ;
    public final Function0<Unit> LLILZIL;
    public Class<?> LLILZLL;
    public C06ME LLIZ;

    @Override // X.C06OD
    public final void LIZLLL() {
        Class<?> cls = this.LLILZLL;
        if (cls != null) {
            PopupManager.LIZJ(cls);
        }
    }

    @Override // X.C06OD
    public final Object LJI(C06OO c06oo) {
        String str;
        boolean z;
        PopupInstanceConfig popupInstanceConfig;
        PopupInstanceConfig popupInstanceConfig2;
        UrlModel avatarThumb;
        List<String> urlList;
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJ = C069P.LIZ().LJ().LJ(this.LLILZ.getSingleChatFromUserId(), null);
        if (iMUserLJ != null && (avatarThumb = iMUserLJ.getAvatarThumb()) != null && (urlList = avatarThumb.getUrlList()) != null) {
            str = (String) C13LP.LJJJLL(urlList);
        } else {
            str = null;
        }
        C1917290zzb c1917290zzb = new C1917290zzb(null, "notification_page", null, "dm_streak", str, null, null, null, null, 8165);
        this.LLIZ = new C06ME();
        C1675106hB.LIZ.getClass();
        if (C1675106hB.LIZ().variant == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (ChannelsAuthRefactorExp.INSTANCE.enabled()) {
                UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("dm_streak");
                unifiedAuthPopupConfigLIZJ.setSceneId("dm_streak_popup_variant");
                unifiedAuthPopupConfigLIZJ.setEnterFrom("notification_page");
                unifiedAuthPopupConfigLIZJ.setAvatar(str);
                List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
                if (list != null && (!list.isEmpty()) && (popupInstanceConfig2 = (PopupInstanceConfig) ListProtector.get(list, 0)) != null) {
                    popupInstanceConfig2.setPopupCombinationType(1);
                }
                this.LLILZLL = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(this.LLILLL, new C10DS() { // from class: X.06jn
                    @Override // X.C10DS
                    public final void LIZ(String str2) {
                    }

                    @Override // X.C10DS
                    public final void onShow(int i) {
                    }

                    @Override // X.C10DS
                    public final void LIZIZ(int i, AbstractC343940De4 abstractC343940De4) {
                        C06ME c06me = this.LIZ.LLIZ;
                        if (c06me != null) {
                            c06me.LLZLI();
                        }
                    }
                }, unifiedAuthPopupConfigLIZJ);
            } else {
                this.LLILZLL = C19212010Ec.LIZJ.LJFF(this.LLILLL, c1917290zzb, new InterfaceC1917380zzk() { // from class: X.06jo
                    @Override // X.InterfaceC1917380zzk
                    public final void LIZ(AbstractC343940De4 abstractC343940De4) {
                        C06ME c06me = this.LIZ.LLIZ;
                        if (c06me != null) {
                            c06me.LLZLI();
                        }
                    }
                });
            }
        }
        if (C1675106hB.LIZJ()) {
            this.LLILZIL.invoke();
        }
        if (C1675106hB.LIZ().variant == 3) {
            if (C1679506ht.LIZ.LJI() < 2) {
                if (ChannelsAuthRefactorExp.INSTANCE.enabled()) {
                    UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ2 = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("dm_streak");
                    unifiedAuthPopupConfigLIZJ2.setSceneId("dm_streak_popup_variant");
                    unifiedAuthPopupConfigLIZJ2.setEnterFrom("notification_page");
                    unifiedAuthPopupConfigLIZJ2.setAvatar(str);
                    List<PopupInstanceConfig> list2 = unifiedAuthPopupConfigLIZJ2.popupInstances;
                    if (list2 != null && (!list2.isEmpty()) && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list2, 0)) != null) {
                        popupInstanceConfig.setPopupCombinationType(1);
                    }
                    this.LLILZLL = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(this.LLILLL, new C10DS() { // from class: X.06jp
                        @Override // X.C10DS
                        public final void LIZ(String str2) {
                        }

                        @Override // X.C10DS
                        public final void onShow(int i) {
                        }

                        @Override // X.C10DS
                        public final void LIZIZ(int i, AbstractC343940De4 abstractC343940De4) {
                            C06ME c06me = this.LIZ.LLIZ;
                            if (c06me != null) {
                                c06me.LLZLI();
                            }
                        }
                    }, unifiedAuthPopupConfigLIZJ2);
                } else {
                    this.LLILZLL = C19212010Ec.LIZJ.LJFF(this.LLILLL, c1917290zzb, new InterfaceC1917380zzk() { // from class: X.06jq
                        @Override // X.InterfaceC1917380zzk
                        public final void LIZ(AbstractC343940De4 abstractC343940De4) {
                            C06ME c06me = this.LIZ.LLIZ;
                            if (c06me != null) {
                                c06me.LLZLI();
                            }
                        }
                    });
                }
            } else {
                this.LLILZIL.invoke();
            }
        }
        if (this.LLILZLL == null) {
            return null;
        }
        C1679506ht c1679506ht = C1679506ht.LIZ;
        c1679506ht.LIZLLL().storeLong(C1679506ht.LJIIIIZZ("key_last_popup_display_timestamp"), System.currentTimeMillis());
        c1679506ht.LJII();
        return this.LLIZ;
    }

    @Override // X.C06OD
    public final Object LJII(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean z;
        C1679506ht c1679506ht = C1679506ht.LIZ;
        if (c1679506ht.LIZ() && c1679506ht.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public C1690706jh(Context context, C909290Zln c909290Zln, AwS72S1300000_2 awS72S1300000_2) {
        super(EnumC1596306Mv.STREAK_REMIND_PERMISSION);
        this.LLILLL = context;
        this.LLILZ = c909290Zln;
        this.LLILZIL = awS72S1300000_2;
    }
}

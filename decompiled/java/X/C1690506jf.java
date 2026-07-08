package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06jf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1690506jf extends C06O6<C06OO> {
    public final C1600706On LLILZ;
    public final C01GW LLILZIL;
    public final C06ME LLILZLL;
    public final Set<EnumC1596306Mv> LLIZ;
    public final Set<C067L> LLIZLLLIL;
    public Class<?> LLJ;

    @Override // X.C06O6
    public final boolean LIZLLL() {
        C1675106hB.LIZ.getClass();
        return C1675106hB.LIZIZ() && !this.LLILZ.LJII;
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return (C067K) this.LLILZIL.getValue();
    }

    public final void LJIIL() {
        C1634706af c1634706af;
        String strLIZIZ;
        C1600706On c1600706On = this.LLILZ;
        SessionInfo sessionInfo = c1600706On.LJI;
        Context context = c1600706On.LIZJ;
        if (context == null) {
            return;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("streaks_inline_push_uuid_");
        sbLIZ.append(strValueOf);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        String singleChatFromUserId = sessionInfo.getSingleChatFromUserId();
        if (singleChatFromUserId != null) {
            Keva kevaLIZLLL = C1679506ht.LIZ.LIZLLL();
            String strLJIIIIZZ = C1679506ht.LJIIIIZZ("key_last_inline_msg_uuid");
            if (strLJIIIIZZ != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLJIIIIZZ);
                sbLIZ2.append('_');
                sbLIZ2.append(singleChatFromUserId);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                strLIZIZ = null;
            }
            kevaLIZLLL.storeString(strLIZIZ, strLIZIZ2);
        }
        C1679506ht c1679506ht = C1679506ht.LIZ;
        c1679506ht.LIZLLL().storeLong(C1679506ht.LJIIIIZZ("key_last_inline_msg_display_timestamp"), System.currentTimeMillis());
        c1679506ht.LJII();
        InterfaceC1634606ae interfaceC1634606ae = this.LLILZ.LJIIJJI;
        if (!(interfaceC1634606ae instanceof C1634706af) || (c1634706af = (C1634706af) interfaceC1634606ae) == null) {
            return;
        }
        C1684506ih c1684506ih = new C1684506ih();
        c1684506ih.LIZ(sessionInfo);
        c1684506ih.LIZJ = strLIZIZ2;
        c1684506ih.LIZLLL(23);
        c1684506ih.LIZJ(context);
        ChatRoomFakeMsgOperatorAbility value = c1634706af.LJIILLIIL.getValue();
        if (value != null) {
            value.yl2(c1684506ih, null);
        }
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLIZLLLIL;
    }

    public C1690506jf(C1600706On c1600706On) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1178));
        this.LLILZLL = new C06ME();
        this.LLIZ = Collections.singleton(EnumC1596306Mv.STREAK_REMIND_PERMISSION);
        this.LLIZLLLIL = Collections.singleton(C067L.SINGLE);
    }

    @Override // X.C06O6
    public final void LJIIIZ(C06OO c06oo) {
        Class<?> cls = this.LLJ;
        if (cls != null) {
            PopupManager.LIZJ(cls);
        }
        this.LLJ = null;
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn<? super C06OJ> interfaceC1364105Vn) {
        if (c06oo.LIZ.isDebugMode()) {
            return C06OI.LIZ;
        }
        C1679506ht c1679506ht = C1679506ht.LIZ;
        if (!c1679506ht.LIZ()) {
            return new C06OH("DMPush last shown check");
        }
        if (!c1679506ht.LIZIZ()) {
            return new C06OH("Frequency control");
        }
        return C06OI.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // X.C06O6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C06OO r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1690506jf.LJIIJ(X.06OO, X.05Vn):java.lang.Object");
    }

    public final void LJIILIIL(Context context, String str, C1917290zzb c1917290zzb) {
        UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ;
        PopupInstanceConfig popupInstanceConfig;
        if (ChannelsAuthRefactorExp.INSTANCE.enabled()) {
            IUniAuthGuidePopupApi iUniAuthGuidePopupApi = (IUniAuthGuidePopupApi) PluggableExtentionKt.pluggableSpiForReal(IUniAuthGuidePopupApi.class);
            if (iUniAuthGuidePopupApi != null && (unifiedAuthPopupConfigLIZJ = iUniAuthGuidePopupApi.LIZJ("dm_streak")) != null) {
                unifiedAuthPopupConfigLIZJ.setSceneId("dm_streak_popup_variant");
                unifiedAuthPopupConfigLIZJ.setEnterFrom("notification_page");
                unifiedAuthPopupConfigLIZJ.setAvatar(str);
                List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
                Class clsLIZLLL = null;
                if (list != null && (!list.isEmpty()) && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, 0)) != null) {
                    popupInstanceConfig.setPopupCombinationType(1);
                }
                IUniAuthGuidePopupApi iUniAuthGuidePopupApi2 = (IUniAuthGuidePopupApi) PluggableExtentionKt.pluggableSpiForReal(IUniAuthGuidePopupApi.class);
                if (iUniAuthGuidePopupApi2 != null) {
                    clsLIZLLL = iUniAuthGuidePopupApi2.LIZLLL(context, new C10DS() { // from class: X.06jl
                        @Override // X.C10DS
                        public final void LIZ(String str2) {
                        }

                        @Override // X.C10DS
                        public final void onShow(int i) {
                        }

                        @Override // X.C10DS
                        public final void LIZIZ(int i, AbstractC343940De4 abstractC343940De4) {
                            this.LIZ.LLILZLL.LLZLI();
                        }
                    }, unifiedAuthPopupConfigLIZJ);
                }
                this.LLJ = clsLIZLLL;
                return;
            }
            return;
        }
        this.LLJ = C19212010Ec.LIZJ.LJFF(context, c1917290zzb, new InterfaceC1917380zzk() { // from class: X.06jm
            @Override // X.InterfaceC1917380zzk
            public final void LIZ(AbstractC343940De4 abstractC343940De4) {
                this.LIZ.LLILZLL.LLZLI();
            }
        });
    }
}

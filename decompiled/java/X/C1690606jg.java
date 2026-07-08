package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.pushguide.PushGuideFeature;
import com.ss.android.ugc.aweme.services.IDMPushInlineMsgManager;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06jg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1690606jg extends C06O6<C06AI> {
    public final C1600706On LLILZ;
    public final C01GW LLILZIL;
    public final Set<C067L> LLILZLL;
    public final Set<EnumC1596306Mv> LLIZ;
    public Class<?> LLIZLLLIL;

    @Override // X.C06O6
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return (C067K) this.LLILZIL.getValue();
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLILZLL;
    }

    public C1690606jg(C1600706On c1600706On) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1314));
        this.LLILZLL = C13LQ.LJLIIL(new C067L[]{C067L.SINGLE, C067L.BUSINESS, C067L.GROUP});
        this.LLIZ = Collections.singleton(EnumC1596306Mv.OUT_PUSH_GUIDE_POPUP);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(X.InterfaceC1364105Vn r15) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1690606jg.LJIIL(X.05Vn):java.lang.Object");
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
        C06AI c06ai = (C06AI) c06oo;
        C1600706On c1600706On = this.LLILZ;
        SessionInfo sessionInfo = c1600706On.LJI;
        Context context = c1600706On.LIZJ;
        if (context == null) {
            return new C06OH("Missing context");
        }
        if (c06ai.LIZ.isDebugMode()) {
            return C06OI.LIZ;
        }
        if (sessionInfo.isQuickChat()) {
            return new C06OH("Is quick chat");
        }
        if (C824390WVp.LIZJ(context)) {
            return new C06OH("Notification already enabled");
        }
        PushGuideFeature pushGuideFeatureLIZ = PushGuideFeature.LIZ.LIZ();
        if (pushGuideFeatureLIZ != null && pushGuideFeatureLIZ.LJIIL(context)) {
            IDMPushInlineMsgManager inst = IDMPushInlineMsgManager.Companion.getInst();
            if (inst != null && inst.checkUnifiedFreCtl()) {
                if (!sessionInfo.isFriendChat()) {
                    return new C06OH("Not friends chat");
                }
                IMUser singleChatFromUser = sessionInfo.getSingleChatFromUser();
                if (singleChatFromUser != null && singleChatFromUser.getFollowStatus() == 2) {
                    if (c06ai.LIZJ != 2) {
                        return new C06OH("Not send message");
                    }
                    if (!C1679506ht.LIZ.LIZJ()) {
                        return new C06OH("Streaks push check");
                    }
                    return C06OI.LIZ;
                }
                return new C06OH("Not follow each other");
            }
            return new C06OH("Blocked by frequency control");
        }
        return new C06OH("Cannot show dialog");
    }

    @Override // X.C06O6
    public final /* bridge */ /* synthetic */ Object LJIIJ(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
        return LJIIL(interfaceC1364105Vn);
    }
}

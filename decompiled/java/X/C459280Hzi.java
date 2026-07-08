package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.TryEffectMobViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.IMMediaServiceInternalBridge;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Hzi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C459280Hzi implements C0IBX {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final TryEffectMobViewModel LIZJ;
    public final C869590Y9l LIZLLL;
    public final SessionInfo LJ;
    public final String LJFF;
    public C099G LJI;

    @Override // X.C0IBX
    public final int getType() {
        return 2;
    }

    @Override // X.C0IBX
    public final Integer LIZ() {
        return Integer.valueOf(R.raw.icon_camera_fill);
    }

    @Override // X.C0IBX
    public final Integer LIZJ() {
        return 2131831021;
    }

    @Override // X.C0IBX
    public final Integer LJ() {
        return Integer.valueOf(R.attr.ej);
    }

    @Override // X.C0IBX
    public final void LIZLLL(C197039127h c197039127h) {
        Activity activityLIZ = C1388190mED.LIZ(this.LIZ);
        if (activityLIZ == null) {
            return;
        }
        String conversationId = this.LJ.getConversationId();
        int chatType = this.LJ.getChatType();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LIZIZ);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C459270Hzh(this, activityLIZ, conversationId, chatType, null), 2);
    }

    @Override // X.C0IBX
    public final void LJFF(C197039127h c197039127h) {
        List listLJJLIIIJ;
        String str = null;
        this.LJI = C23250099c.LIZIZ(LifecycleOwnerKt.getLifecycleScope(this.LIZIZ), C0PEM.LIZJ, null, new C459290Hzj(this, null), 2);
        TryEffectMobViewModel tryEffectMobViewModel = this.LIZJ;
        long msgId = this.LIZLLL.getMsgId();
        SessionInfo sessionInfo = this.LJ;
        C0IBF c0ibf = C0IBF.FEATURE_STATUS_SHOW;
        String str2 = this.LJFF;
        if (!tryEffectMobViewModel.LL.contains(Long.valueOf(msgId))) {
            tryEffectMobViewModel.LL.add(Long.valueOf(msgId));
            if (str2 != null && (listLJJLIIIJ = a0.LJJLIIIJ(str2, new char[]{','}, false, 0, 6)) != null && (true ^ listLJJLIIIJ.isEmpty())) {
                str = (String) ListProtector.get(listLJJLIIIJ, 0);
            }
            IMMediaServiceInternalBridge iMMediaServiceInternalBridgeLIZ = IMMediaServiceInternalBridge.LIZ.LIZ();
            if (iMMediaServiceInternalBridgeLIZ != null) {
                iMMediaServiceInternalBridgeLIZ.LJIIIIZZ(sessionInfo, c0ibf, "try_effect", str, null, C0I0B.LJFF.LIZIZ());
            }
        }
    }

    public C459280Hzi(Context context, LifecycleOwner lifecycleOwner, TryEffectMobViewModel tryEffectMobViewModel, C869590Y9l c869590Y9l, SessionInfo sessionInfo, String str) {
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = tryEffectMobViewModel;
        this.LIZLLL = c869590Y9l;
        this.LJ = sessionInfo;
        this.LJFF = str;
    }
}

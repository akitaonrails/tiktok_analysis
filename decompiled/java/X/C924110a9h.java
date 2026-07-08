package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0a9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924110a9h extends C944360agM {
    public final long LL;
    public final int LLILLJJLI;
    public final MultiGuestDataHolder LLILLL;
    public final InterfaceC917640ZzG LLILZ;
    public final DataChannel LLILZIL;
    public final Function0<Context> LLILZLL;
    public volatile WeakReference<LiveDialog> LLIZ;

    /* JADX WARN: Removed duplicated region for block: B:150:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x031f A[PHI: r5
      0x031f: PHI (r5v16 java.lang.String) = (r5v15 java.lang.String), (r5v17 java.lang.String) binds: [B:166:0x031a, B:168:0x031d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[PHI: r11
      0x0091: PHI (r11v1 java.lang.Long) = (r11v0 java.lang.Long), (r11v8 java.lang.Long) binds: [B:32:0x008e, B:17:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C944360agM, X.InterfaceC944650agp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJL(com.bytedance.android.livesdk.model.message.LinkMessage r24) {
        /*
            Method dump skipped, instruction units count: 1521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C924110a9h.LJJLIIIJL(com.bytedance.android.livesdk.model.message.LinkMessage):void");
    }

    public final void LIZ(LinkListUser linkListUser, boolean z, String str, boolean z2) {
        String str2;
        long id;
        User user;
        InterfaceC917640ZzG interfaceC917640ZzG = this.LLILZ;
        String strLIZIZ = null;
        if (interfaceC917640ZzG != null) {
            if (linkListUser != null && (user = linkListUser.user) != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            strLIZIZ = interfaceC917640ZzG.LIZIZ(id);
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        MultiGuestDataHolder multiGuestDataHolder = this.LLILLL;
        c930480aJy.getClass();
        int iLIZLLL = C930480aJy.LIZLLL(linkListUser, multiGuestDataHolder);
        int iLIZIZ = C930480aJy.LIZIZ(linkListUser, this.LLILLL);
        if (z) {
            str2 = "check";
        } else {
            str2 = "normal";
        }
        C922800a7a.LJ(iLIZLLL, iLIZIZ, strLIZIZ, str, str2, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C924110a9h(long j, int i, MultiGuestDataHolder multiGuestDataHolder, InterfaceC917640ZzG interfaceC917640ZzG, DataChannel dataChannel, Function0<? extends Context> function0) {
        this.LL = j;
        this.LLILLJJLI = i;
        this.LLILLL = multiGuestDataHolder;
        this.LLILZ = interfaceC917640ZzG;
        this.LLILZIL = dataChannel;
        this.LLILZLL = function0;
    }
}

package X;

import android.content.Context;
import com.bytedance.common.wschannel.MainProcessMsg;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0WJs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821300WJs implements InterfaceC821360WJy {
    public C821320WJu LIZ;
    public final InterfaceC810750VrF LIZIZ;
    public final InterfaceC821120WJa LIZJ;
    public final Context LIZLLL;
    public SsWsApp LJ;
    public C0XE1 LJFF;
    public final AtomicBoolean LJI;
    public final ConcurrentHashMap<Integer, Boolean> LJII;

    public final void LIZJ() {
        this.LIZJ.LIZIZ(this.LIZ.LIZ, this.LIZLLL);
        this.LJI.set(true);
    }

    public final void LIZ(C821320WJu c821320WJu) {
        if (c821320WJu.LIZ == this.LIZ.LIZ) {
            if (this.LJI.get()) {
                return;
            }
            this.LIZ = c821320WJu;
            SsWsApp ssWsAppLIZ = C821310WJt.LIZ(c821320WJu);
            this.LJ = ssWsAppLIZ;
            this.LIZJ.LIZJ(this.LIZLLL, ssWsAppLIZ);
            return;
        }
        throw new IllegalArgumentException("channelId isn't the same");
    }

    public final void LIZIZ(WsChannelMsg wsChannelMsg, InterfaceC821350WJx interfaceC821350WJx) {
        if (wsChannelMsg.channelId == this.LIZ.LIZ) {
            if (this.LJI.get()) {
                if (interfaceC821350WJx != null) {
                    interfaceC821350WJx.LIZ();
                    return;
                }
                return;
            }
            this.LIZJ.LIZLLL(this.LIZLLL, new MainProcessMsg(wsChannelMsg, interfaceC821350WJx));
            return;
        }
        throw new IllegalArgumentException("channelId isn't the same");
    }

    public C821300WJs(Context context, C821320WJu c821320WJu, InterfaceC810750VrF interfaceC810750VrF) {
        C0WJW c0wjw = C821310WJt.LIZ;
        this.LJI = new AtomicBoolean(false);
        this.LJII = new ConcurrentHashMap<>();
        this.LIZLLL = context;
        this.LIZJ = c0wjw;
        this.LIZ = c821320WJu;
        this.LIZIZ = interfaceC810750VrF;
        this.LJ = C821310WJt.LIZ(c821320WJu);
    }
}

package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.lang.ref.WeakReference;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0xvC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1837680xvC extends AbstractC1837710xvF {
    public final TemplateInfo LJI;
    public final long LJII;
    public final C1837830xvR LJIIIIZZ;

    @Override // X.InterfaceC1837810xvP
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1837810xvP
    public final void LJ() {
    }

    public static final int LJIIJJI() {
        User owner;
        FollowInfo followInfo;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null) {
            return -1;
        }
        return (int) followInfo.getFollowStatus();
    }

    @Override // X.InterfaceC1837810xvP
    public final Long LIZIZ() {
        TemplateInfo templateInfo = this.LJI;
        if (templateInfo != null) {
            return Long.valueOf(templateInfo.usdPriceAmountMicros);
        }
        return null;
    }

    @Override // X.InterfaceC1837810xvP
    public final String getCurrencyCode() {
        String str;
        TemplateInfo templateInfo = this.LJI;
        return (templateInfo == null || (str = templateInfo.currency) == null) ? "" : str;
    }

    @Override // X.InterfaceC1837810xvP
    public final String getIapId() {
        String str;
        TemplateInfo templateInfo = this.LJI;
        return (templateInfo == null || (str = templateInfo.iapId) == null) ? "" : str;
    }

    @Override // X.InterfaceC1837810xvP
    public final String getTemplateId() {
        String str;
        TemplateInfo templateInfo = this.LJI;
        return (templateInfo == null || (str = templateInfo.id) == null) ? "" : str;
    }

    @Override // X.InterfaceC1837810xvP
    public final EnumC1618120sD4 LIZ() {
        return EnumC1618120sD4.ONETIME;
    }

    @Override // X.InterfaceC1837170xuN
    public final C1837830xvR LIZJ() {
        return this.LJIIIIZZ;
    }

    public final String LJIIJ() {
        return this.LIZIZ;
    }

    public C1837680xvC(TemplateInfo templateInfo, long j, WeakReference weakReference, long j2, long j3, long j4, String str) {
        super(weakReference, j2, j3, j4, str);
        this.LJI = templateInfo;
        this.LJII = j;
        this.LJIIIIZZ = new C1837830xvR();
    }
}

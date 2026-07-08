package X;

import android.util.LruCache;
import com.bytedance.android.livesdk.model.message.OecLiveBillboardMessage;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.SeaLiveContextAbility;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0vCn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733270vCn {
    public final ISeaLiveContextAbility LIZ;
    public final LruCache<String, Unit> LIZIZ = new LruCache<>(50);
    public final Map<String, C13IQ<? extends AbstractC1136060ffY>> LIZJ = C2097608Jq.LJIIIIZZ(new Pair("webcastOecLiveShoppingMessage", C13LE.LIZ(ECommerceMessage.class)), new Pair("webcastOecLiveBillboardMessage", C13LE.LIZ(OecLiveBillboardMessage.class)));
    public final Set<String> LIZLLL = C13LQ.LJLIIL(new String[]{"webcastOecLiveShoppingMessage", "webcastOecLiveBillboardMessage"});

    public C1733270vCn(SeaLiveContextAbility seaLiveContextAbility) {
        this.LIZ = seaLiveContextAbility;
    }

    public final boolean LIZ(String str) {
        boolean z;
        synchronized (this.LIZIZ) {
            try {
                if (this.LIZIZ.get(str) == null) {
                    this.LIZIZ.put(str, Unit.LIZ);
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final void LIZJ(IMessage iMessage) {
        if (!C288780BTo.LIZ()) {
            return;
        }
        InterfaceC600380Ngi interfaceC600380NgiCm0 = this.LIZ.Cm0();
        for (String str : this.LIZLLL) {
            C13IQ<? extends AbstractC1136060ffY> c13iq = this.LIZJ.get(str);
            if (c13iq != null && Intrinsics.LJFF(C13LE.LIZ(iMessage.getClass()), c13iq)) {
                if (LIZ(String.valueOf(iMessage.getMessageId()))) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ecLiveImMsgEvent_");
                sbLIZ.append(str);
                interfaceC600380NgiCm0.LIZJ(this.LIZ, new C599020NeW(C2188811AlT.LIZIZ(sbLIZ), C2097908Jt.LIZJ(new Pair("message", C1741890vQh.LJIIIIZZ(iMessage))), null, 12));
                return;
            }
        }
    }

    public final void LIZIZ(EnumC1733330vCt enumC1733330vCt, C1525630pnt c1525630pnt) {
        if (C288780BTo.LIZ()) {
            InterfaceC600380Ngi interfaceC600380NgiCm0 = this.LIZ.Cm0();
            String str = c1525630pnt.LIZLLL;
            if (str != null && !LIZ(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ecLiveByteSyncEvent_");
                sbLIZ.append(enumC1733330vCt.getServerId());
                interfaceC600380NgiCm0.LIZJ(this.LIZ, new C599020NeW(C2188811AlT.LIZIZ(sbLIZ), C2097908Jt.LIZJ(new Pair("message", new String(c1525630pnt.LIZ, Charsets.UTF_8))), null, 12));
            }
        }
    }
}

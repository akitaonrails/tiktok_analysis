package X;

import Y.ARunnableS2S1301000_26;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnterRoomSuccessMsgOptExp;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveAsyncHandlerDealExp;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveOptStreamJumpExp;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerMessageOptSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1700410uLn implements InterfaceC1700420uLo {
    public final /* synthetic */ AbstractC1700380uLk LL;

    public C1700410uLn(AbstractC1700380uLk abstractC1700380uLk) {
        this.LL = abstractC1700380uLk;
    }

    @Override // X.InterfaceC1700420uLo
    public final boolean LJJIL(EnumC1700470uLt enumC1700470uLt) {
        InterfaceC1700420uLo interfaceC1700420uLo = this.LL.LLILZ;
        if (interfaceC1700420uLo != null) {
            return interfaceC1700420uLo.LJJIL(enumC1700470uLt);
        }
        return false;
    }

    @Override // X.InterfaceC1700420uLo
    public final void LJIILJJIL(EnumC1700470uLt enumC1700470uLt, int i, Object obj) {
        LiveOptStreamJumpExp liveOptStreamJumpExp = LiveOptStreamJumpExp.INSTANCE;
        if (liveOptStreamJumpExp.isEnable() && enumC1700470uLt == EnumC1700470uLt.RENDERING_START) {
            AbstractC1700380uLk abstractC1700380uLk = this.LL;
            if (!abstractC1700380uLk.LLIZLLLIL) {
                abstractC1700380uLk.LLIZLLLIL = true;
            }
        }
        String string = UUID.randomUUID().toString();
        ARunnableS2S1301000_26 aRunnableS2S1301000_26 = new ARunnableS2S1301000_26(i, obj, enumC1700470uLt, this, string, 0);
        if (!LivePlayerMessageOptSetting.INSTANCE.disableRenderMessageOpt() && (enumC1700470uLt == EnumC1700470uLt.RENDERING_START || enumC1700470uLt == EnumC1700470uLt.PREPARED)) {
            this.LL.LIZIZ(aRunnableS2S1301000_26);
            this.LL.getClass();
            if (enumC1700470uLt == EnumC1700470uLt.RENDERING_START && LiveEnterRoomSuccessMsgOptExp.INSTANCE.enableCoreMsgSentNotify()) {
                ConcurrentHashSet<String> concurrentHashSet = C465930IOx.LIZ;
                ConcurrentHashSet<String> concurrentHashSet2 = C465930IOx.LIZ;
                if (!concurrentHashSet2.contains(string)) {
                    concurrentHashSet2.add(string);
                    if (!concurrentHashSet2.isEmpty()) {
                        Iterator<C0IJS> it2 = C465930IOx.LIZIZ.iterator();
                        while (it2.hasNext()) {
                            try {
                                it2.next().LIZ(true);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (enumC1700470uLt == EnumC1700470uLt.TEXTURE_RENDER_DRAW_FRAME) {
            this.LL.LLJIJIL.add(enumC1700470uLt);
            if (LiveAsyncHandlerDealExp.INSTANCE.isEnable()) {
                C786410Ut5.LJL(this.LL.LLILLL, aRunnableS2S1301000_26);
                return;
            } else {
                C786410Ut5.LJL(this.LL.LLILLJJLI, aRunnableS2S1301000_26);
                return;
            }
        }
        if (enumC1700470uLt == EnumC1700470uLt.SEI_UPDATE) {
            if (liveOptStreamJumpExp.isEnable()) {
                AbstractC1700380uLk abstractC1700380uLk2 = this.LL;
                if (!abstractC1700380uLk2.LLIZLLLIL && !abstractC1700380uLk2.LLJ && (((obj instanceof String) && ((String) obj).contains("app_data")) || ((obj instanceof JSONObject) && ((JSONObject) obj).opt("app_data") != null))) {
                    this.LL.LIZIZ(aRunnableS2S1301000_26);
                    this.LL.LLJ = true;
                    return;
                }
            }
            InterfaceC1700420uLo interfaceC1700420uLo = this.LL.LLILZ;
            if (interfaceC1700420uLo == null) {
                return;
            }
            interfaceC1700420uLo.LJIILJJIL(enumC1700470uLt, i, obj);
            return;
        }
        if (liveOptStreamJumpExp.isEnable() && enumC1700470uLt == EnumC1700470uLt.VIDEO_SIZE_CHANGED) {
            AbstractC1700380uLk abstractC1700380uLk3 = this.LL;
            if (!abstractC1700380uLk3.LLIZLLLIL && !abstractC1700380uLk3.LLJI) {
                abstractC1700380uLk3.LIZIZ(aRunnableS2S1301000_26);
                this.LL.LLJI = true;
                return;
            }
        }
        C786410Ut5.LJJZZIII(this.LL.LLILLJJLI, aRunnableS2S1301000_26);
    }
}

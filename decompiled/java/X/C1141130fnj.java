package X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.live.render.engine.sticker.StickerFirstFrameExtra;
import com.bytedance.live.render.engine.sticker.StickerLoadFailExtra;
import com.bytedance.live.render.engine.sticker.StickerResource;
import com.bytedance.live.render.engine.sticker.TtlhReceiveExtra;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fnj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141130fnj implements InterfaceC1137750fiH, Handler.Callback {
    public final InterfaceC1141520foM LL;
    public final LiveEffect LLILLJJLI;
    public final Map<String, String> LLILLL;
    public final Function1<Class<?>, Object> LLILZ;
    public final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper(), this);
    public LiveEffect LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public InterfaceC1140870fnJ LLJI;

    public final String LIZLLL() {
        String panel;
        LiveEffect liveEffect = this.LLILZLL;
        return (liveEffect == null || (panel = liveEffect.getPanel()) == null) ? "" : panel;
    }

    public final String LJ() {
        Set<Integer> set = C769930UId.LIZ;
        LiveEffect liveEffect = this.LLILZLL;
        return C769930UId.LIZ(liveEffect != null ? liveEffect.getPanel() : null);
    }

    public final void LJI(boolean z) {
        String str;
        String str2;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, String> map = this.LLILLL;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_effect_enable_replay", str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gift_sticker_first_frame_anomaly");
            if (C1141290fnz.LJ()) {
                str2 = "_anchor";
            } else {
                str2 = "_guest";
            }
            sbLIZ.append(str2);
            LJFF(C2188811AlT.LIZIZ(sbLIZ), linkedHashMap);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1137750fiH
    public final void LJJIJIIJI(String str) {
        InterfaceC1140870fnJ interfaceC1140870fnJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCallRenderCommand: currPanel = ");
        sbLIZ.append(LIZLLL());
        sbLIZ.append(", callbackEffectPanel = ");
        sbLIZ.append(str);
        C1141240fnu.LIZLLL("StickerRenderManager_ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(LIZLLL(), str) && (interfaceC1140870fnJ = this.LLJI) != null) {
            interfaceC1140870fnJ.LJIIIIZZ(EnumC1138990fkH.STICKER);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x02dc  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r12) {
        /*
            Method dump skipped, instruction units count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1141130fnj.handleMessage(android.os.Message):boolean");
    }

    public static boolean LIZ(LiveEffect liveEffect, String str) {
        Object c098200Yq;
        if (liveEffect == null) {
            return false;
        }
        try {
            StickerResource stickerResource = ((StickerFirstFrameExtra) C19748512Ol.LIZIZ.LJII(str, StickerFirstFrameExtra.class)).resourceAdded.get(0);
            String str2 = stickerResource.path;
            String str3 = stickerResource.msgId;
            if (TextUtils.isEmpty(str3) || C1141150fnl.LIZIZ(str3, str2, liveEffect)) {
                return false;
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return true;
    }

    public static boolean LIZIZ(LiveEffect liveEffect, String str) {
        Object c098200Yq;
        if (liveEffect == null) {
            return false;
        }
        try {
            StickerLoadFailExtra stickerLoadFailExtra = (StickerLoadFailExtra) C19748512Ol.LIZIZ.LJII(str, StickerLoadFailExtra.class);
            String str2 = stickerLoadFailExtra.path;
            String str3 = stickerLoadFailExtra.msgId;
            if (TextUtils.isEmpty(str3) || C1141150fnl.LIZIZ(str3, str2, liveEffect)) {
                return false;
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return true;
    }

    public static boolean LIZJ(LiveEffect liveEffect, String str) {
        Object c098200Yq;
        if (liveEffect == null) {
            return false;
        }
        try {
            if (C1141150fnl.LIZ(liveEffect, (TtlhReceiveExtra) C19748512Ol.LIZIZ.LJII(str, TtlhReceiveExtra.class))) {
                return false;
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return true;
    }

    public static void LJFF(String str, Map map) {
        Unit unit;
        InterfaceC1862007Ra interfaceC1862007Ra = (InterfaceC1862007Ra) C2043807zY.LIZ(InterfaceC1862007Ra.class);
        if (interfaceC1862007Ra != null) {
            interfaceC1862007Ra.LIZ(str, map);
        }
        try {
            InterfaceC1141190fnp interfaceC1141190fnp = (InterfaceC1141190fnp) C2043807zY.LIZ(InterfaceC1141190fnp.class);
            if (interfaceC1141190fnp != null) {
                interfaceC1141190fnp.monitorEvent(str, new JSONObject(map), new JSONObject(), new JSONObject());
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public C1141130fnj(InterfaceC1141520foM interfaceC1141520foM, LiveEffect liveEffect, Map map, AwS596S0100000_17 awS596S0100000_17) {
        this.LL = interfaceC1141520foM;
        this.LLILLJJLI = liveEffect;
        this.LLILLL = map;
        this.LLILZ = awS596S0100000_17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (kotlin.text.a0.LJJIIZI(r13, "effect_gift_game", false) != false) goto L50;
     */
    @Override // X.InterfaceC1137750fiH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessageReceived(int r10, int r11, int r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1141130fnj.onMessageReceived(int, int, int, java.lang.String):void");
    }
}

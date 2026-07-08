package X;

import com.bytedance.android.live.effect.StickerSelectChannel;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767770U9v implements C0UAF {
    public static final C767770U9v LIZ = new C767770U9v();

    public static final LiveEffect LIZIZ() {
        Integer numLIZIZ = InterfaceC772190UQv.X3.LIZIZ();
        if (numLIZIZ == null || numLIZIZ.intValue() != 0) {
            return null;
        }
        return (LiveEffect) C13LP.LJJJLL(C0UA1.LIZ().qr("livebackground"));
    }

    public static final LiveEffect LJFF() {
        List<LiveEffect> listQr;
        LiveEffect liveEffect;
        C0U59 c0u59;
        Integer numLIZIZ = InterfaceC772190UQv.X3.LIZIZ();
        if (numLIZIZ == null || numLIZIZ.intValue() != 0 || (listQr = C0UA1.LIZ().qr("livebackground")) == null || (liveEffect = (LiveEffect) C13LP.LJJJLL(listQr)) == null) {
            return null;
        }
        C0U58 c0u58 = C0U5U.LJ;
        if (c0u58 != null) {
            c0u58.LJ(null);
        }
        C0U58 c0u582 = C0U5U.LJ;
        if (c0u582 != null) {
            c0u582.LIZ();
        }
        WeakReference<C0U59> weakReference = C0UA4.LIZIZ;
        if (weakReference != null && (c0u59 = weakReference.get()) != null) {
            c0u59.LIZ(liveEffect, null);
        }
        return liveEffect;
    }

    public static final List<LiveEffect> LIZ() {
        C0U78 c0u78LIZ = C0UA1.LIZ();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c0u78LIZ.qr(C0UD4.LIZIZ));
        arrayList.addAll(c0u78LIZ.qr("livebackground"));
        arrayList.addAll(c0u78LIZ.qr("livegame"));
        arrayList.addAll(c0u78LIZ.qr("tiktok_live_boards"));
        arrayList.addAll(c0u78LIZ.qr(C0UD4.LIZLLL));
        return arrayList;
    }

    public static boolean LIZLLL() {
        if (C13LP.LJJJLL(C0UA1.LIZ().qr("livebackground")) == null) {
            return false;
        }
        Integer numLIZIZ = InterfaceC772190UQv.X3.LIZIZ();
        return numLIZIZ == null || numLIZIZ.intValue() != 0;
    }

    public static boolean LJ() {
        Integer numLIZIZ;
        return (C13LP.LJJJLL(C0UA1.LIZ().qr("livebackground")) == null || (numLIZIZ = InterfaceC772190UQv.X3.LIZIZ()) == null || numLIZIZ.intValue() != 0) ? false : true;
    }

    public static LiveEffect LIZJ(String str) {
        C0U78 c0u78LIZ = C0UA1.LIZ();
        if (Intrinsics.LJFF(str, "livebackground")) {
            Integer numLIZIZ = InterfaceC772190UQv.X3.LIZIZ();
            if (numLIZIZ != null && numLIZIZ.intValue() == 0) {
                return (LiveEffect) C13LP.LJJJLL(c0u78LIZ.qr("livebackground"));
            }
            return null;
        }
        return (LiveEffect) C13LP.LJJJLL(c0u78LIZ.qr(str));
    }

    public static LiveEffect LJI(DataChannel dataChannel) {
        LiveEffect liveEffect;
        C0UA6 c0ua6;
        C0U78 c0u78LIZ = C0UA1.LIZ();
        String str = C0UD4.LIZIZ;
        List<LiveEffect> listQr = c0u78LIZ.qr(str);
        if (listQr == null || (liveEffect = (LiveEffect) C13LP.LJJJLL(listQr)) == null) {
            return null;
        }
        if (dataChannel != null) {
            dataChannel.zW(StickerSelectChannel.class, ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).createEffectByType(EnumC767550U8z.NONE));
        }
        C0UFI.LJI.lr(str);
        WeakReference<C0UA6> weakReference = C0UA4.LIZ;
        if (weakReference != null && (c0ua6 = weakReference.get()) != null) {
            c0ua6.LIZ(liveEffect, null);
        }
        return liveEffect;
    }
}

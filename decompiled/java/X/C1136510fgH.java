package X;

import com.bytedance.android.livesdk.livesetting.gift.GiftStickerComposerPreloadSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: renamed from: X.0fgH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136510fgH {
    static {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            iHostAppContext.isOffline();
        }
    }

    public static final boolean LIZ() {
        return GiftStickerComposerPreloadSetting.INSTANCE.isEnable() && C1138350fjF.LJ();
    }

    public static final void LIZIZ(DataChannel dataChannel, C1136560fgM c1136560fgM, String str, C1136560fgM c1136560fgM2, LiveEffect liveEffect) {
        InterfaceC1137650fi7 interfaceC1137650fi7;
        LiveEffect.StickerSDKExtra stickerSDKExtra;
        if (c1136560fgM2.LJJIJL) {
            return;
        }
        if (c1136560fgM != null && c1136560fgM.LJFF == c1136560fgM2.LJFF && (stickerSDKExtra = c1136560fgM2.LJJII) != null && stickerSDKExtra.enableReplay && C1136390fg5.LIZIZ(c1136560fgM, c1136560fgM2)) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Long.valueOf(c1136560fgM2.LJFF));
        Iterator<Long> it2 = c1136560fgM2.LIZLLL().iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(it2.next());
        }
        Iterator<Long> it3 = c1136560fgM2.LJ().iterator();
        while (it3.hasNext()) {
            linkedHashSet.add(it3.next());
        }
        if (!linkedHashSet.isEmpty()) {
            Iterator it4 = linkedHashSet.iterator();
            while (it4.hasNext()) {
                if (C1138640fji.LIZLLL(((Number) it4.next()).longValue()) == null) {
                    return;
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Long.valueOf(c1136560fgM2.LJFF), null);
        Iterator<Long> it5 = c1136560fgM2.LIZLLL().iterator();
        while (it5.hasNext()) {
            linkedHashMap.put(it5.next(), 2);
        }
        if (!linkedHashMap.isEmpty()) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!C1138640fji.LJII((Integer) entry.getValue(), (Long) entry.getKey())) {
                    return;
                }
            }
        }
        C1141900foy.LIZ.getClass();
        if (C1141900foy.LIZ(c1136560fgM2.LJFF, null)) {
            for (Long l : c1136560fgM2.LIZLLL()) {
                C1141900foy c1141900foy = C1141900foy.LIZ;
                long jLongValue = l.longValue();
                c1141900foy.getClass();
                if (!C1141900foy.LIZ(jLongValue, 2)) {
                    return;
                }
            }
            if (liveEffect == null) {
                liveEffect = C1136390fg5.LJII(c1136560fgM2, dataChannel);
            }
            if (liveEffect.getFilePath().length() == 0) {
                C1138360fjG c1138360fjGLIZLLL = C1140890fnL.LIZLLL();
                long j = c1136560fgM2.LJFF;
                c1138360fjGLIZLLL.getClass();
                String strLJIIIIZZ = C1138630fjh.LJIIIIZZ(j, null);
                c1136560fgM2.LJII = strLJIIIIZZ;
                liveEffect.setFilePath(strLJIIIIZZ);
            }
            WeakReference<InterfaceC1137650fi7> weakReference = C1137660fi8.LLILLJJLI;
            if (weakReference != null && (interfaceC1137650fi7 = weakReference.get()) != null && interfaceC1137650fi7.LIZJ(liveEffect)) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadEffect ");
            sbLIZ.append(str);
            sbLIZ.append(" fail");
            C20441214yg.LJ("StickerEffectComposerPreloader_gift_sticker", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.effect.LiveEffectNewEffectReverseSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectNewEffectReverseTimeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0U8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767340U8e {
    public final String LIZ;
    public final String LIZIZ;

    public static Iterable LIZIZ(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) iterable) {
            LiveEffect liveEffect = (LiveEffect) obj;
            LiveEffectNewEffectReverseSetting liveEffectNewEffectReverseSetting = LiveEffectNewEffectReverseSetting.INSTANCE;
            if (!liveEffectNewEffectReverseSetting.enable() || (liveEffectNewEffectReverseSetting.enable() && liveEffect.LJLLLLLL() < LiveEffectNewEffectReverseTimeSetting.INSTANCE.getValue())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final C0U74<LiveEffect> LIZ(FetchFavoriteListResponse fetchFavoriteListResponse) {
        List<Effect> effects;
        List<Effect> collectEffects = null;
        if (fetchFavoriteListResponse != null) {
            effects = fetchFavoriteListResponse.getEffects();
            collectEffects = fetchFavoriteListResponse.getCollectEffects();
        } else {
            effects = null;
        }
        return LIZJ(effects, collectEffects);
    }

    public C767340U8e(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect> LIZJ(java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> r10, java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> r11) {
        /*
            r9 = this;
            java.lang.String r0 = "Sticker"
            X.C770170UJb.LIZJ(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "performing sticker convert. panel: "
            r1.append(r0)
            java.lang.String r0 = r9.LIZIZ
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = ""
            X.C770170UJb.LIZLLL = r0
            r5 = 10
            r4 = 1
            if (r10 == 0) goto L5f
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = X.C15438062q.LJIJJ(r10, r5)
            r7.<init>(r0)
            java.util.Iterator r6 = r10.iterator()
            r3 = 0
        L2d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r6.next()
            int r2 = r3 + 1
            if (r3 < 0) goto L5a
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r1 = X.C0UEO.LIZLLL(r0)
            java.lang.String r0 = r9.LIZ
            r1.LLJLIL(r0)
            java.lang.String r0 = r9.LIZIZ
            r1.LJIIJJI(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.LJJLI(r0)
            X.C767250U7v.LIZIZ(r4, r1)
            r7.add(r1)
            r3 = r2
            goto L2d
        L5a:
            X.C1697810uHb.LJIJI()
            r0 = 0
            throw r0
        L5f:
            X.13BV r6 = X.C13BV.INSTANCE
            goto L70
        L62:
            java.lang.Iterable r0 = LIZIZ(r7)
            java.util.List r0 = X.C0U7C.LIZLLL(r0)
            java.util.List r6 = X.C13LP.LLIIII(r0)
            if (r6 == 0) goto L5f
        L70:
            if (r11 == 0) goto La0
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = X.C15438062q.LJIJJ(r11, r5)
            r3.<init>(r0)
            java.util.Iterator r2 = r11.iterator()
        L7f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r1 = X.C0UEO.LIZLLL(r0)
            java.lang.String r0 = r9.LIZ
            r1.LLJLIL(r0)
            java.lang.String r0 = r9.LIZIZ
            r1.LJIIJJI(r0)
            X.C767250U7v.LIZIZ(r4, r1)
            r3.add(r1)
            goto L7f
        La0:
            X.13BV r7 = X.C13BV.INSTANCE
            goto Lad
        La3:
            java.lang.Iterable r0 = LIZIZ(r3)
            java.util.List r7 = X.C13LP.LLIIII(r0)
            if (r7 == 0) goto La0
        Lad:
            java.lang.String r0 = r9.LIZIZ
            X.C0U7C.LJIIZILJ(r6, r7, r0)
            X.0U74 r0 = new X.0U74
            java.lang.String r1 = r9.LIZ
            java.lang.String r2 = r9.LIZIZ
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            r8 = 128(0x80, float:1.8E-43)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C767340U8e.LIZJ(java.util.List, java.util.List):X.0U74");
    }
}

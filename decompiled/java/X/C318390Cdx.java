package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Cdx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C318390Cdx {
    public static final boolean LIZJ(Effect effect) {
        MobileEffect mobileEffect;
        if (effect == null) {
            return false;
        }
        if (effect instanceof MobileEffect) {
            mobileEffect = (MobileEffect) effect;
        } else {
            mobileEffect = null;
        }
        if (mobileEffect != null) {
            if (mobileEffect.getFromType() != 4) {
                return false;
            }
            return true;
        }
        String extra = effect.getExtra();
        if (extra != null && extra.length() != 0) {
            try {
                C1446130njf.LIZ.getClass();
                JSONObject jSONObjectLJII = C1446130njf.LJII(effect);
                if (jSONObjectLJII != null) {
                    if (jSONObjectLJII.optInt("extra_from_type", -1) == 4) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return false;
    }

    public static final Map LIZ(ShortVideoContext shortVideoContext, Map map) {
        if (!C19719512Dh.LJII(map)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            map = linkedHashMap;
        }
        if (shortVideoContext == null) {
            return map;
        }
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("creation_id", shortVideoContext.getCreationId());
        String str = shortVideoContext.enterFrom;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("enter_from", str);
        pairArr[2] = new Pair("is_photo_mode", shortVideoContext.LJJIJIL());
        String str3 = shortVideoContext.shootWay;
        if (str3 != null) {
            str2 = str3;
        }
        pairArr[3] = new Pair("shoot_way", str2);
        pairArr[4] = new Pair("shoot_tab_name", shortVideoContext.LJIJJLI());
        map.putAll(C2097608Jq.LJIIIIZZ(pairArr));
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect r13, java.lang.String r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            boolean r0 = r15 instanceof X.C318290Cdn
            if (r0 == 0) goto La8
            r5 = r15
            X.0Cdn r5 = (X.C318290Cdn) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La8
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L4f
            if (r0 == r3) goto L89
            if (r0 != r4) goto Lb8
            java.lang.Object r2 = r5.LLILLJJLI
            com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo r2 = (com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo) r2
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect r13 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L2b:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r2.getDraftPath()
            r1.append(r0)
            r0 = 47
            r1.append(r0)
            java.lang.String r0 = r2.getEffectPath()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            int r0 = r1.length()
            if (r0 != 0) goto Laf
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4f:
            X.C155000ia.LIZIZ(r1)
            if (r14 == 0) goto Lc3
            int r0 = r14.length()
            if (r0 == 0) goto Lc3
            if (r13 != 0) goto L5f
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5f:
            java.lang.Class<com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService> r7 = com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService.class
            r8 = 0
            r11 = 14
            r12 = 0
            r9 = r8
            r10 = r8
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService r0 = (com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService) r0
            if (r0 == 0) goto Lc0
            X.0Cdk r0 = r0.draftService()
            if (r0 == 0) goto Lc0
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0Cdj r1 = new X.0Cdj
            r1.<init>(r0, r14, r12)
            r5.LL = r13
            r5.LLILLJJLI = r0
            r5.LLILZ = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r6) goto L92
            return r6
        L89:
            java.lang.Object r0 = r5.LLILLJJLI
            X.0Cdk r0 = (X.InterfaceC318260Cdk) r0
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect r13 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L92:
            com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo r1 = (com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo) r1
            if (r1 != 0) goto L99
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L99:
            r5.LL = r13
            r5.LLILLJJLI = r1
            r5.LLILZ = r4
            kotlin.Unit r0 = r0.LJIIIZ(r1)
            if (r0 != r6) goto La6
            return r6
        La6:
            r2 = r1
            goto L2b
        La8:
            X.0Cdn r5 = new X.0Cdn
            r5.<init>(r15)
            goto L12
        Laf:
            r13.updateDraftPath(r1)
            X.C1446840nko.LIZ(r13)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lb8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lc3:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C318390Cdx.LIZIZ(com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect, java.lang.String, X.05Vn):java.lang.Object");
    }
}

package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.tako.experiment.TakoPerfImageMobModel;
import com.ss.android.ugc.aweme.tako.experiment.TakoPerfImageMobModelList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kvo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338340kvo implements InterfaceC658750Psf {
    public final String LL;
    public final Map<String, String> LLILLJJLI;
    public final AtomicBoolean LLILLL;
    public final AtomicBoolean LLILZ;
    public final C1338350kvp LLILZIL;

    @Override // X.InterfaceC658750Psf
    public final void Ck(JSONObject jSONObject) {
        C1338350kvp c1338350kvp;
        try {
            boolean z = false;
            if (((Boolean) C0AXR.LIZ.getValue()).booleanValue() && !this.LLILZ.compareAndSet(false, true)) {
                return;
            }
            C01GW c01gw = C217400se.LIZ;
            if (((Number) c01gw.getValue()).intValue() > 0 && AbstractC19994813Le.Default.nextInt(100) < ((Number) c01gw.getValue()).intValue() && (c1338350kvp = this.LLILZIL) != null) {
                c1338350kvp.LIZ(jSONObject);
            }
            if (jSONObject.optBoolean("isSuccess")) {
                z = true;
            }
            LIZ(z, jSONObject, this.LL, this.LLILLJJLI, true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC658750Psf
    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
        try {
            if (((Boolean) C0AXR.LIZ.getValue()).booleanValue() && !this.LLILLL.compareAndSet(false, true)) {
                return;
            }
            LIZ(z, jSONObject, this.LL, this.LLILLJJLI, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, X.0kvs] */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, X.0kvs, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1338340kvo(android.view.View r7, java.lang.String r8, java.lang.String r9, java.util.Map r10) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1338340kvo.<init>(android.view.View, java.lang.String, java.lang.String, java.util.Map):void");
    }

    public /* synthetic */ C1338340kvo(String str, Map map, TuxIconView tuxIconView, int i) {
        this((i & 4) != 0 ? null : tuxIconView, (i & 1) != 0 ? "" : str, (String) null, map);
    }

    public static void LIZ(boolean z, JSONObject jSONObject, String str, Map map, boolean z2) {
        TakoPerfImageMobModel next;
        int i;
        int iOptInt;
        boolean z3;
        boolean z4;
        Integer numValueOf;
        TakoPerfImageMobModel next2;
        Iterator<TakoPerfImageMobModel> it2 = ((TakoPerfImageMobModelList) C07OA.LIZIZ.getValue()).list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.scene, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TakoPerfImageMobModel takoPerfImageMobModel = next;
        if (takoPerfImageMobModel == null) {
            Iterator<TakoPerfImageMobModel> it3 = ((TakoPerfImageMobModelList) C07OA.LIZIZ.getValue()).list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.LJFF(next2.scene, LivePreviewCTASmartDisplayManager.DEFAULT)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            takoPerfImageMobModel = next2;
        }
        if (takoPerfImageMobModel != null) {
            i = takoPerfImageMobModel.sample;
        } else {
            i = 128;
        }
        int iLJ = C13LZ.LJ(i, 0, 128);
        boolean z5 = true;
        if (iLJ == 128 || (iLJ != 0 && ((int) (System.currentTimeMillis() & 127)) < iLJ)) {
            if (jSONObject != null) {
                iOptInt = jSONObject.optInt("from");
            } else {
                iOptInt = 0;
            }
            if (!z2 && takoPerfImageMobModel != null && takoPerfImageMobModel.full) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && takoPerfImageMobModel != null && (numValueOf = Integer.valueOf(takoPerfImageMobModel.level)) != null && (numValueOf.intValue() != 1 ? !(numValueOf.intValue() != 2 ? numValueOf.intValue() != 0 || iOptInt > 0 : iOptInt < 0 || iOptInt >= 3) : iOptInt != 1)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z3 && !z4) {
                z5 = false;
            }
            try {
                SettingsManager.LIZLLL().getClass();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
            if (!SettingsManager.LIZ("tako_enable_image_record", false)) {
                if (!z5) {
                    return;
                }
            }
            C1333890kod.LIZ.getClass();
            C23250099c.LIZLLL(C1333890kod.LIZIZ, null, null, new C1334260kpE(z, jSONObject, str, map, z2, null), 3);
        }
    }
}

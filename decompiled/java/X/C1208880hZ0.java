package X;

import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.slash.component.compose.SlashComposeComponentModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hZ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208880hZ0 implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$0(X.C1208880hZ0 r7) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1208880hZ0.run$0(X.0hZ0):void");
    }

    public static final void run$1(C1208880hZ0 c1208880hZ0) {
        ((Function0) c1208880hZ0.l0).invoke();
    }

    public static final void run$10(C1208880hZ0 c1208880hZ0) {
        ((Function0) c1208880hZ0.l0).invoke();
    }

    public static final void run$11(C1208880hZ0 c1208880hZ0) {
        RavenFragment ravenFragment = (RavenFragment) c1208880hZ0.l0;
        ravenFragment.LLJILJILJ++;
        ravenFragment.JS().getOperator().refresh();
    }

    public static final void run$12(C1208880hZ0 c1208880hZ0) {
        InterfaceC1181380gqe interfaceC1181380gqe = (InterfaceC1181380gqe) c1208880hZ0.l0;
        if (interfaceC1181380gqe != null) {
            interfaceC1181380gqe.onSuccess(null);
        }
    }

    public static final void run$13(C1208880hZ0 c1208880hZ0) {
        PoiListApi.PoiDetailResponse poiDetailResponseLIZIZ;
        C1185420gxA c1185420gxA = (C1185420gxA) c1208880hZ0.l0;
        C1180620gpQ c1180620gpQ = c1185420gxA.LLILLL;
        Integer numValueOf = null;
        if (c1180620gpQ != null) {
            poiDetailResponseLIZIZ = C1183670guL.LIZIZ(c1180620gpQ);
        } else {
            poiDetailResponseLIZIZ = null;
        }
        C1180620gpQ c1180620gpQ2 = ((C1185420gxA) c1208880hZ0.l0).LLILLL;
        if (c1180620gpQ2 != null) {
            numValueOf = Integer.valueOf(c1180620gpQ2.status_code);
        }
        c1185420gxA.LJJIFFI(poiDetailResponseLIZIZ, numValueOf, false);
    }

    public static final void run$2(C1208880hZ0 c1208880hZ0) {
        ((C09AJ) c1208880hZ0.l0).onComplete();
    }

    public static final void run$3(C1208880hZ0 c1208880hZ0) {
        ((C09AJ) c1208880hZ0.l0).onComplete();
    }

    public static final void run$4(C1208880hZ0 c1208880hZ0) {
        ((C09AJ) c1208880hZ0.l0).onComplete();
    }

    public static final void run$5(C1208880hZ0 c1208880hZ0) {
        InterfaceC1160790gJR interfaceC1160790gJR = (InterfaceC1160790gJR) c1208880hZ0.l0;
        if (interfaceC1160790gJR != null) {
            interfaceC1160790gJR.onSuccess();
        }
    }

    public static final void run$6(C1208880hZ0 c1208880hZ0) {
        InterfaceC1160790gJR interfaceC1160790gJR = (InterfaceC1160790gJR) c1208880hZ0.l0;
        if (interfaceC1160790gJR != null) {
            interfaceC1160790gJR.onSuccess();
        }
    }

    public static final void run$7(C1208880hZ0 c1208880hZ0) {
        InterfaceC1160790gJR interfaceC1160790gJR = (InterfaceC1160790gJR) c1208880hZ0.l0;
        if (interfaceC1160790gJR != null) {
            interfaceC1160790gJR.onSuccess();
        }
    }

    public static final void run$8(C1208880hZ0 c1208880hZ0) {
        InterfaceC1160790gJR interfaceC1160790gJR = (InterfaceC1160790gJR) c1208880hZ0.l0;
        if (interfaceC1160790gJR != null) {
            interfaceC1160790gJR.onSuccess();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$9(C1208880hZ0 c1208880hZ0) {
        Object c098200Yq;
        n nVar;
        AbstractC1180290got abstractC1180290got = (AbstractC1180290got) c1208880hZ0.l0;
        abstractC1180290got.getClass();
        T t = 0;
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            SlashComposeComponentModel slashComposeComponentModel = abstractC1180290got.LLILLJJLI;
            if (slashComposeComponentModel != null) {
                nVar = slashComposeComponentModel.bizData;
            } else {
                nVar = null;
            }
            Class<?> clsLJJIFFI = abstractC1180290got.LJJIFFI();
            c1227904rF.getClass();
            c098200Yq = C1227904rF.LIZ(nVar, clsLJJIFFI);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            t = c098200Yq;
        }
        abstractC1180290got.LLILLL = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1208880hZ0(Object obj, RavenFragment<Object> ravenFragment) {
        this.$t = ravenFragment;
        this.l0 = obj;
    }
}

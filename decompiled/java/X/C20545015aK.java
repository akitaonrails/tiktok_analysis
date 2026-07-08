package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.model.FeedLynxOverlayConfig;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.15aK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.timelock.FeedLynxPreloader$prepare$1", f = "FeedLynxPreloader.kt", l = {}, m = "invokeSuspend")
public final class C20545015aK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C20545015aK(InterfaceC1364105Vn<? super C20545015aK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20545015aK(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final String str;
        C1C7U.LIZ("FeedLynxPreloader@b814.prepare$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20544915aJ.LIZ.getClass();
        FeedLynxOverlayConfig feedLynxOverlayConfig = C20544915aJ.LIZLLL;
        if (feedLynxOverlayConfig != null && (str = feedLynxOverlayConfig.lynxSchema) != null && (!a0.LJJJIL(str))) {
            EnumC20545715aR enumC20545715aR = C20544915aJ.LIZJ;
            EnumC20545715aR enumC20545715aR2 = EnumC20545715aR.LLILLJJLI;
            if (enumC20545715aR != enumC20545715aR2 && ((C20544915aJ.LIZJ != EnumC20545715aR.LLILLL || !Intrinsics.LJFF(C20544915aJ.LJFF, str) || C20544915aJ.LJ == null) && (C20544915aJ.LIZJ != EnumC20545715aR.LLILZ || C20544915aJ.LJII <= 0 || System.currentTimeMillis() - C20544915aJ.LJII >= Mp4ScreenVideoLoadTimeout.CONTROL))) {
                C20544915aJ.LIZIZ();
                C20544915aJ.LJFF = str;
                AbstractC1542200qEc abstractC1542200qEc = new AbstractC1542200qEc() { // from class: X.15aQ
                    @Override // X.AbstractC1537870q7d
                    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                        C23250099c.LIZLLL(C20544915aJ.LIZIZ, null, null, new C20545415aO(str, null), 3);
                    }

                    @Override // X.AbstractC1537870q7d
                    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str2, C1542120qEU c1542120qEU) {
                        C23250099c.LIZLLL(C20544915aJ.LIZIZ, null, null, new C20545515aP(null), 3);
                    }
                };
                C20544915aJ.LIZJ(enumC20545715aR2, "prepare");
                try {
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    SparkContext sparkContext = new SparkContext();
                    sparkContext.LJJLIIJ(str);
                    sparkContext.LJJJJZI(abstractC1542200qEc);
                    C1541950qED.LIZJ.getClass();
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(contextLIZ, sparkContext).LIZ(false);
                    C20544915aJ.LJ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    new C5182020e(e, 158);
                    C20544915aJ.LIZ("lynx_create_failed");
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedLynxPreloader@b814.prepare$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C20545015aK(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

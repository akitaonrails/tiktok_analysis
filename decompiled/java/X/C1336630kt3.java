package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kt3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336630kt3 implements InterfaceC1329405Ie<C048000Fi> {
    public final C0Z7Y LIZ;
    public final ConcurrentLinkedQueue<C048000Fi> LIZIZ = new ConcurrentLinkedQueue<>();
    public final ConcurrentHashMap<String, C048000Fi> LIZJ = new ConcurrentHashMap<>();
    public final AtomicInteger LIZLLL = new AtomicInteger(0);
    public final C01GW LJ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(61));
    public final C054G LJFF = C2296808zG.LIZ(C0PEM.LIZJ);
    public final String LJI = "image";

    @Override // X.InterfaceC1329405Ie
    public final void release() {
    }

    @Override // X.InterfaceC1329405Ie
    public final void reset() {
    }

    public final void LIZLLL() {
        final C048000Fi c048000FiPoll;
        String str;
        InterfaceC1335605Ko interfaceC1335605KoLIZIZ;
        while (this.LIZLLL.get() < this.LIZ.LIZ && (!this.LIZIZ.isEmpty()) && (c048000FiPoll = this.LIZIZ.poll()) != null) {
            if (!this.LIZJ.containsKey(c048000FiPoll.LIZ)) {
                this.LIZJ.put(c048000FiPoll.LIZ, c048000FiPoll);
                this.LIZLLL.incrementAndGet();
                try {
                    Map<String, Object> map = c048000FiPoll.LIZLLL;
                    Object obj = map != null ? map.get("CACHE_SPACE") : null;
                    String str2 = obj instanceof String ? (String) obj : null;
                    Map<String, Object> map2 = c048000FiPoll.LIZLLL;
                    Object obj2 = map2 != null ? map2.get("URL") : null;
                    if (!(obj2 instanceof String) || (str = (String) obj2) == null || str.length() == 0) {
                        LIZJ(c048000FiPoll.LIZ);
                    } else {
                        InterfaceC1326920kdO interfaceC1326920kdOLJIILL = str2 != null ? (InterfaceC1326920kdO) C1328130kfL.LJIILIIL().LJIIIZ().get(str2) : C1328130kfL.LJIILIIL().LJIILL();
                        Uri uri = UriProtector.parse(str);
                        if (uri != null && uri.isHierarchical()) {
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "x-expires");
                            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                                IMHostApi.LIZ.getClass();
                                IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
                                long jLongValue = 0;
                                long jLIZIZ = iMHostApiLIZ != null ? iMHostApiLIZ.LIZIZ() : 0L;
                                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                                    try {
                                        Long lValueOf = Long.valueOf(CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
                                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 10) {
                                            jLIZIZ /= (long) LSPassThroughRecordSizeConfig.DEFAULT;
                                        }
                                        if (lValueOf != null) {
                                            jLongValue = lValueOf.longValue();
                                        }
                                    } catch (NumberFormatException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                                if (jLIZIZ > jLongValue) {
                                    LIZJ(c048000FiPoll.LIZ);
                                }
                            }
                        }
                        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
                        if (str2 != null) {
                            c1325700kbQLIZLLL.LJIJI = str2;
                        }
                        C1325710kbR c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
                        C592490NLr c592490NLrLIZ = C1324810kZz.LJI().LIZ(c1325710kbRLIZ, null);
                        if (interfaceC1326920kdOLJIILL == null || !interfaceC1326920kdOLJIILL.LJII(c592490NLrLIZ)) {
                            C0HWE<Void> c0hwe = new C0HWE<Void>() { // from class: X.0kt6
                                @Override // X.C0HWE
                                public final void LJ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                                    InterfaceC1335605Ko interfaceC1335605KoLIZIZ2;
                                    IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class);
                                    if (iIMPreloadService != null && (interfaceC1335605KoLIZIZ2 = iIMPreloadService.LIZIZ()) != null) {
                                        interfaceC1335605KoLIZIZ2.onFailed(c048000FiPoll.LIZ);
                                    }
                                    this.LIZ.LIZJ(c048000FiPoll.LIZ);
                                }

                                @Override // X.C0HWE
                                public final void LJFF(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                                    InterfaceC1335605Ko interfaceC1335605KoLIZIZ2;
                                    IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class);
                                    if (iIMPreloadService != null && (interfaceC1335605KoLIZIZ2 = iIMPreloadService.LIZIZ()) != null) {
                                        interfaceC1335605KoLIZIZ2.LIZJ(c048000FiPoll.LIZ);
                                    }
                                    this.LIZ.LIZJ(c048000FiPoll.LIZ);
                                }
                            };
                            IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class);
                            if (iIMPreloadService != null && (interfaceC1335605KoLIZIZ = iIMPreloadService.LIZIZ()) != null) {
                                interfaceC1335605KoLIZIZ.LIZIZ(c048000FiPoll.LIZ, this.LJI);
                            }
                            AbstractC1321260kUG abstractC1321260kUGLJIJ = ((C1325540kbA) this.LJ.getValue()).LJIJ(c1325710kbRLIZ, c048000FiPoll.LIZ);
                            abstractC1321260kUGLJIJ.LIZJ(c0hwe, C823050WQl.LIZLLL());
                            C23250099c.LIZLLL(this.LJFF, null, null, new C1336640kt4(this, c048000FiPoll, abstractC1321260kUGLJIJ, null), 3);
                        } else {
                            LIZJ(c048000FiPoll.LIZ);
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    LIZJ(c048000FiPoll.LIZ);
                }
            }
        }
    }

    @Override // X.InterfaceC1329405Ie
    public final String LIZIZ() {
        return this.LJI;
    }

    public C1336630kt3(C0Z7Y c0z7y) {
        this.LIZ = c0z7y;
    }

    @Override // X.InterfaceC1329405Ie
    public final void LIZ(List<C048000Fi> list) {
        C23250099c.LIZLLL(this.LJFF, null, null, new C1336650kt5(list, this, null), 3);
    }

    public final void LIZJ(String str) {
        if (this.LIZJ.containsKey(str)) {
            this.LIZJ.remove(str);
            this.LIZLLL.decrementAndGet();
        }
        LIZLLL();
    }

    @Override // X.InterfaceC1329405Ie
    public final void LJJIIJ(String str) {
        InterfaceC1335605Ko interfaceC1335605KoLIZIZ;
        IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class);
        if (iIMPreloadService != null && (interfaceC1335605KoLIZIZ = iIMPreloadService.LIZIZ()) != null) {
            interfaceC1335605KoLIZIZ.LIZ(str);
        }
        if (this.LIZJ.remove(str) == null) {
            for (C048000Fi c048000Fi : this.LIZIZ) {
                if (Intrinsics.LJFF(c048000Fi.LIZ, str)) {
                    if (c048000Fi == null) {
                        return;
                    }
                }
            }
            return;
        }
        this.LIZLLL.decrementAndGet();
    }
}

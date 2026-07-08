package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckRequest;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.pcs.course.api.network.IPcsCourseApi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840490xzj extends C09AY implements InterfaceC1685420txc<EnumC1840510xzl, Boolean, List<? extends Pair<? extends String, ? extends Integer>>, Integer, String, Unit> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1840490xzj(String str, long j) {
        super(5);
        this.LL = str;
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(EnumC1840510xzl enumC1840510xzl, Boolean bool, List<? extends Pair<? extends String, ? extends Integer>> list, Integer num, String str) {
        Pair pair;
        PreCheckResult preCheckResult;
        List<? extends Pair<? extends String, ? extends Integer>> list2 = list;
        num.intValue();
        InterfaceC1840520xzm interfaceC1840520xzm = (InterfaceC1840520xzm) ((LinkedHashMap) C1851770yHv.LIZLLL).get(this.LL);
        int i = C1840500xzk.LIZ[enumC1840510xzl.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C1851770yHv.LIZJ.remove(this.LL);
                if (interfaceC1840520xzm != null) {
                    interfaceC1840520xzm.LIZIZ();
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            if (list2 != null && (!list2.isEmpty())) {
                C1851770yHv c1851770yHv = C1851770yHv.LIZ;
                String str2 = this.LL;
                c1851770yHv.getClass();
                Boolean bool2 = null;
                if (list2 != null) {
                    Iterator<? extends Pair<? extends String, ? extends Integer>> it2 = list2.iterator();
                    do {
                        if (it2.hasNext()) {
                            Pair<? extends String, ? extends Integer> next = it2.next();
                            C1851770yHv c1851770yHv2 = C1851770yHv.LIZ;
                            String first = next.getFirst();
                            c1851770yHv2.getClass();
                            try {
                                PreCheckRequest preCheckRequest = new PreCheckRequest(str2, 6, C13BV.INSTANCE, first);
                                IPcsCourseApi.LIZ.getClass();
                                pair = new Pair(C490870JMv.LIZIZ.getValue().preCheckMusic(preCheckRequest).execute().LIZIZ, null);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                pair = new Pair(null, e.getMessage());
                            }
                            preCheckResult = (PreCheckResult) pair.getFirst();
                            if (preCheckResult != null) {
                                if (preCheckResult.unavailableReasons != null) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            bool2 = Boolean.TRUE;
                            break;
                        }
                    } while (preCheckResult.unavailableReasonsV1 == 0);
                    bool2 = Boolean.FALSE;
                }
                if (Intrinsics.LJFF(bool2, Boolean.TRUE)) {
                    if (interfaceC1840520xzm != null) {
                        interfaceC1840520xzm.LIZ();
                    }
                } else if (Intrinsics.LJFF(bool2, Boolean.FALSE)) {
                    if (interfaceC1840520xzm != null) {
                        interfaceC1840520xzm.LIZJ();
                    }
                } else if (interfaceC1840520xzm != null) {
                    interfaceC1840520xzm.LIZIZ();
                }
            }
            C1851770yHv.LIZJ.remove(this.LL);
            C1851770yHv.LIZLLL.remove(this.LL);
        }
        return Unit.LIZ;
    }
}

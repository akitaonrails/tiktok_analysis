package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.05M8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter$warmUpFromKevaAsync$1", f = "SocialThoughtDataCenter.kt", l = {}, m = "invokeSuspend")
public final class C05M8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05M8(String str, InterfaceC1364105Vn<? super C05M8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05M8 c05m8 = new C05M8(this.LLILLJJLI, interfaceC1364105Vn);
        c05m8.LL = obj;
        return c05m8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object c098200Yq2;
        C1C7U.LIZ("SocialThoughtDataCenter@2a15.warmUpFromKevaAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LLILLJJLI;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("social_thought_dc_");
            sbLIZ.append(str);
            Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
            Set<String> allKey = repo.getAllKey();
            if (allKey != null) {
                C08QT c08qt = new C08QT(C09RB.LJIIIZ(new C1939607ik(allKey), AFwS229S0000000_2.get$arr$(498)));
                while (c08qt.hasNext()) {
                    String str2 = (String) c08qt.next();
                    String strLJJJJZ = a0.LJJJJZ("thought_", str2);
                    if (strLJJJJZ.length() != 0 && !SocialThoughtDataCenter.LIZIZ.containsKey(strLJJJJZ)) {
                        Object obj2 = null;
                        try {
                            c098200Yq = repo.getString(str2, null);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        String str3 = (String) c098200Yq;
                        if (str3 != null) {
                            try {
                                c098200Yq2 = (ThoughtInfo) SocialThoughtDataCenter.LIZ.getValue().LJII(str3, ThoughtInfo.class);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                c098200Yq2 = new C098200Yq(th2);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            }
                            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                                obj2 = c098200Yq2;
                            }
                            ThoughtInfo thoughtInfo = (ThoughtInfo) obj2;
                            if (thoughtInfo != null && !thoughtInfo.isExpired()) {
                                String str4 = thoughtInfo.authorUid;
                                if (str4 != null && str4.length() != 0 && !Intrinsics.LJFF(thoughtInfo.authorUid, strLJJJJZ)) {
                                    try {
                                        repo.erase(str2);
                                        C189200o6.m2constructorimpl(Unit.LIZ);
                                    } catch (Throwable th3) {
                                        TryCatchGuardChecker.doCheck(th3);
                                        C189200o6.m2constructorimpl(new C098200Yq(th3));
                                    }
                                } else {
                                    SocialThoughtDataCenter.LIZIZ.put(strLJJJJZ, thoughtInfo);
                                    InterfaceC332260D0u<ThoughtInfo> interfaceC332260D0u = SocialThoughtDataCenter.LIZJ.get(strLJJJJZ);
                                    if (interfaceC332260D0u != null) {
                                        interfaceC332260D0u.setValue(thoughtInfo);
                                    }
                                }
                            } else {
                                try {
                                    repo.erase(str2);
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (Throwable th4) {
                                    TryCatchGuardChecker.doCheck(th4);
                                    C189200o6.m2constructorimpl(new C098200Yq(th4));
                                }
                            }
                        }
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            C189200o6.m2constructorimpl(new C098200Yq(th5));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtDataCenter@2a15.warmUpFromKevaAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Y03, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationExtensionManager$getSettingPersistentExtDecoded$$inlined$scopedIO$1", f = "DefaultConversationExtensionManager.kt", l = {}, m = "invokeSuspend")
public final class C0Y03 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Map<Integer, ? extends Object>>>, Object> {
    public final /* synthetic */ C0Y01 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y03(InterfaceC1364105Vn interfaceC1364105Vn, C0Y01 c0y01, String str, Map map) {
        super(2, interfaceC1364105Vn);
        this.LL = c0y01;
        this.LLILLJJLI = str;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Y03(interfaceC1364105Vn, this.LL, this.LLILLJJLI, this.LLILLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Map<Integer, ? extends Object>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0Y6Q c0y6qLIZIZ;
        ByteString bizSettingPersistentExtraRaw;
        C1C7U.LIZ("DefaultConversationExtensionManager@ecdd.getSettingPersistentExtDecoded$$inlined$scopedIO$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C0Y8T c0y8tLJIL = this.LL.LIZ.LJIL(this.LLILLJJLI);
            if (c0y8tLJIL == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Conversation not found: ");
                sbLIZ.append(this.LLILLJJLI);
                c0y6qLIZIZ = C865670Xxd.LIZIZ(new C0YPY(-1017, C2188811AlT.LIZIZ(sbLIZ), null, null));
            } else {
                C0Y8W settingInfo = c0y8tLJIL.getSettingInfo();
                if (settingInfo != null) {
                    bizSettingPersistentExtraRaw = settingInfo.getBizSettingPersistentExtraRaw();
                } else {
                    bizSettingPersistentExtraRaw = null;
                }
                ConcurrentHashMap<String, C0Y0A> concurrentHashMap = this.LL.LJI;
                if (bizSettingPersistentExtraRaw != null && bizSettingPersistentExtraRaw.size() != 0 && !this.LLILLL.isEmpty()) {
                    C0Y0A c0y0a = concurrentHashMap.get(this.LLILLJJLI);
                    if (c0y0a != null && Intrinsics.LJFF(c0y0a.LIZ, bizSettingPersistentExtraRaw)) {
                        c0y6qLIZIZ = C865670Xxd.LIZJ(c0y0a.LIZIZ);
                    } else {
                        Map mapLIZIZ = C0YVP.LIZIZ(this.LLILLL, bizSettingPersistentExtraRaw);
                        if (mapLIZIZ == null) {
                            c0y6qLIZIZ = C865670Xxd.LIZJ(null);
                        } else {
                            concurrentHashMap.put(this.LLILLJJLI, new C0Y0A(mapLIZIZ, bizSettingPersistentExtraRaw));
                            c0y6qLIZIZ = C865670Xxd.LIZJ(mapLIZIZ);
                        }
                    }
                } else {
                    c0y6qLIZIZ = C865670Xxd.LIZJ(null);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BizConvExt decode failed for conversation ");
            sbLIZ2.append(this.LLILLJJLI);
            sbLIZ2.append(": ");
            sbLIZ2.append(th.getMessage());
            c0y6qLIZIZ = C865670Xxd.LIZIZ(new C0YPY(-1, C2188811AlT.LIZIZ(sbLIZ2), th));
        }
        C1C7U.LIZIZ("DefaultConversationExtensionManager@ecdd.getSettingPersistentExtDecoded$$inlined$scopedIO$1");
        return c0y6qLIZIZ;
    }
}

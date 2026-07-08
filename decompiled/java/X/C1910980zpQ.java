package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import com.ss.android.ugc.tools.chat.common.save.AiChatFileServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import njp.a;

/* JADX INFO: renamed from: X.0zpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.common.save.AiChatFileServiceImpl$createDownloadFlow$1", f = "AiChatFileServiceImpl.kt", l = {149}, m = "invokeSuspend")
public final class C1910980zpQ extends C09AX implements Function2<C094D<? super InterfaceC1157570gEF<? extends String>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ AiChatFileServiceImpl LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1910980zpQ(String str, String str2, int i, AiChatFileServiceImpl aiChatFileServiceImpl, InterfaceC1364105Vn<? super C1910980zpQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = i;
        this.LLILZLL = aiChatFileServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1910980zpQ c1910980zpQ = new C1910980zpQ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1910980zpQ.LLILLJJLI = obj;
        return c1910980zpQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2454409ja cache;
        C1C7U.LIZ("AiChatFileServiceImpl@d993.createDownloadFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C094D c094d = (C094D) this.LLILLJJLI;
            String strLIZJ = C08HM.LIZJ(this.LLILLL);
            C882400YjW.LIZ.getClass();
            C882400YjW.LIZ();
            C883250Ykt c883250Ykt = C883250Ykt.LL;
            String path = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.AI_CHAT, String.valueOf(C461720I8s.LIZJ()), true).getPath();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZJ);
            sbLIZ.append(this.LLILZ);
            final String absolutePath = new C0VSJ(path, C2188811AlT.LIZIZ(sbLIZ)).getAbsolutePath();
            if (C570490MZb.LJ(absolutePath)) {
                c094d.LJIIIIZZ(new C1157450gE3(absolutePath, EnumC1156000gBi.CACHE));
                IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
                if (iAiChatFeatureService != null && (cache = iAiChatFeatureService.getCache()) != null) {
                    cache.LJ(absolutePath);
                }
                c094d.LJIIJJI(null);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AiChatFileServiceImpl@d993.createDownloadFlow$1");
                return unit;
            }
            c094d.LJIIIIZZ(new C1157580gEG(0));
            InterfaceC1385405bY interfaceC1385405bYLIZLLL = C0CHQ.LIZ().LIZLLL();
            final String str = this.LLILLL;
            final int i2 = this.LLILZIL;
            final AiChatFileServiceImpl aiChatFileServiceImpl = this.LLILZLL;
            interfaceC1385405bYLIZLLL.downloadFile(str, path, strLIZJ, i2, new C13UW() { // from class: X.0zpP
                @Override // X.C13UW
                public final void LIZLLL(String str2, String str3) {
                    InterfaceC2454409ja cache2;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("downloadFile onSuccess ");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(str3);
                    C21290818Tq.LIZJ("AiChatFileServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
                    AiChatFileServiceImpl aiChatFileServiceImpl2 = aiChatFileServiceImpl;
                    String str4 = absolutePath;
                    int i3 = i2;
                    aiChatFileServiceImpl2.getClass();
                    boolean z = false;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            break;
                        }
                        if (C2354709Kn.LJIL(str3, str4)) {
                            z = true;
                            break;
                        }
                        i4++;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("downloadFile renameDownloadedFile ");
                    sbLIZ3.append(z);
                    C21290818Tq.LIZJ("AiChatFileServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
                    if (z) {
                        c094d.LJIIIIZZ(new C1157450gE3(absolutePath, EnumC1156000gBi.NETWORK));
                        IAiChatFeatureService iAiChatFeatureService2 = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
                        if (iAiChatFeatureService2 != null && (cache2 = iAiChatFeatureService2.getCache()) != null) {
                            cache2.LJ(absolutePath);
                        }
                        c094d.LJIIJJI(null);
                        return;
                    }
                    aiChatFileServiceImpl.LIZIZ.remove(str2);
                    c094d.LJIIIIZZ(new C1155990gBh(new RuntimeException("renameFile failed"), 2));
                    c094d.LJIIJJI(null);
                }

                @Override // X.C13UW
                public final void LIZ(Exception exc, Integer num, String str2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("downloadFile onFailed ");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(num);
                    C21290818Tq.LIZIZ("AiChatFileServiceImpl", C2188811AlT.LIZIZ(sbLIZ2), exc);
                    aiChatFileServiceImpl.LIZIZ.remove(str);
                    C094D<InterfaceC1157570gEF<String>> c094d2 = c094d;
                    if (exc == null) {
                        exc = new IllegalStateException(str2);
                    }
                    c094d2.LJIIIIZZ(new C1155990gBh(num, exc));
                    c094d.LJIIJJI(null);
                }

                @Override // X.C13UW
                public final void LIZIZ(int i3, long j, long j2) {
                    c094d.LJIIIIZZ(new C1157580gEG(i3));
                }
            });
            AFwS217S0000000_28 aFwS217S0000000_28 = AFwS217S0000000_28.get$arr$(794);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS217S0000000_28, this) == objLJFF) {
                C1C7U.LIZIZ("AiChatFileServiceImpl@d993.createDownloadFlow$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AiChatFileServiceImpl@d993.createDownloadFlow$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super InterfaceC1157570gEF<? extends String>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

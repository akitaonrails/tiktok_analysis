package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.GetGoLIVEAnchorPlaybookResp;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play._Playbook_ProtoDecoder;

/* JADX INFO: renamed from: X.0UOG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.playbook.PlaybookViewModel$preloadPlayBook$2", f = "PlaybookViewModel.kt", l = {134}, m = "invokeSuspend")
public final class C0UOG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0UP6>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0UPF LLILZ;
    public final /* synthetic */ C259800zU<String> LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UOG(C0UPF c0upf, C259800zU<String> c259800zU, C259800zU<String> c259800zU2, C259800zU<String> c259800zU3, InterfaceC1364105Vn<? super C0UOG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c0upf;
        this.LLILZIL = c259800zU;
        this.LLILZLL = c259800zU2;
        this.LLIZ = c259800zU3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0UOG c0uog = new C0UOG(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c0uog.LLILLL = obj;
        return c0uog;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C0UPF c0upf;
        long jCurrentTimeMillis;
        Playbook playbookLIZLLL;
        String str;
        Map<String, String> map;
        String str2;
        String str3;
        byte[] bArr;
        Object objLIZJ = obj;
        C1C7U.LIZ("PlaybookViewModel@e436.preloadPlayBook$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        String str4 = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    jCurrentTimeMillis = this.LL;
                    c0upf = (C0UPF) this.LLILLL;
                    C155000ia.LIZIZ(objLIZJ);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLIZJ);
                c0upf = this.LLILZ;
                C259800zU<String> c259800zU = this.LLILZIL;
                C259800zU<String> c259800zU2 = this.LLILZLL;
                C259800zU<String> c259800zU3 = this.LLIZ;
                C20441214yg.LIZIZ("PlayBookViewModel", "preloadPlayBook, start fetchEffectList");
                C781270Ukn.LJI().getLiveEffectController().LIZLLL(Collections.singletonList(c0upf.LIZIZ), null);
                Unit unit = Unit.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preloadPlayBook, fetchEffectList: ");
                sbLIZ.append(unit);
                C20441214yg.LIZIZ("PlayBookViewModel", C2188811AlT.LIZIZ(sbLIZ));
                jCurrentTimeMillis = System.currentTimeMillis();
                String str5 = c259800zU.element;
                String str6 = c259800zU2.element;
                String str7 = c259800zU3.element;
                this.LLILLL = c0upf;
                this.LL = jCurrentTimeMillis;
                this.LLILLJJLI = 1;
                objLIZJ = c0upf.LIZJ(str5, str6, str7, this);
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("PlaybookViewModel@e436.preloadPlayBook$2");
                    return objLJFF;
                }
            }
            GetGoLIVEAnchorPlaybookResp.Data data = (GetGoLIVEAnchorPlaybookResp.Data) objLIZJ;
            c0upf.LJIIJ = System.currentTimeMillis() - jCurrentTimeMillis;
            if (data != null && (bArr = data.playBookData) != null) {
                C1516680pZS c1516680pZS = new C1516680pZS();
                c1516680pZS.LJIIL(new C1506330pIl(bArr));
                playbookLIZLLL = _Playbook_ProtoDecoder.LIZLLL(c1516680pZS);
            } else {
                playbookLIZLLL = null;
            }
            if (playbookLIZLLL != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("preloadPlayBook, playBook: ");
                sbLIZ2.append(playbookLIZLLL);
                C20441214yg.LIZIZ("PlayBookViewModel", C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("playBook flowstr: ");
                PlaybookContent playbookContent = playbookLIZLLL.content;
                if (playbookContent != null) {
                    str = playbookContent.flowStr;
                } else {
                    str = null;
                }
                sbLIZ3.append(str);
                C20441214yg.LIZIZ("PlayBookViewModel", C2188811AlT.LIZIZ(sbLIZ3));
                if (data == null) {
                    map = null;
                } else {
                    map = data.functionNameToParamsMap;
                }
                String str8 = c0upf.LIZIZ;
                if (data != null) {
                    str2 = data.playBookTitle;
                } else {
                    str2 = null;
                }
                if (data != null) {
                    str3 = data.jumpGoliveButtonText;
                } else {
                    str3 = null;
                }
                if (data != null) {
                    str4 = data.jumpViewPlaybooksButtonText;
                }
                c098200Yq = new C0UP6(playbookLIZLLL, new C0UOI(str2, str3, str4), str8, map, null);
            } else {
                C20441214yg.LIZIZ("PlayBookViewModel", "preloadPlayBook, playBook is null");
                c098200Yq = new C0UP6(null, null, c0upf.LIZIZ, null, new Throwable() { // from class: X.0UOH
                });
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C0UPF c0upf2 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LIZIZ("PlayBookViewModel", "preloadPlayBook, error: " + thM5exceptionOrNullimpl.getMessage());
            c098200Yq = new C0UP6(null, null, c0upf2.LIZIZ, null, thM5exceptionOrNullimpl);
        }
        C1C7U.LIZIZ("PlaybookViewModel@e436.preloadPlayBook$2");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0UP6> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

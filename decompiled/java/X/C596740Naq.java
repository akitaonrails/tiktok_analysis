package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest;
import com.ss.android.ugc.aweme.tako.ccl.model.api.FeedConfigArg;
import com.ss.android.ugc.aweme.tako.ccl.model.api.PlaySpeed;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Naq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl$onCommandReceived$2$1$1", f = "TakoClientAgentServiceImpl.kt", l = {192}, m = "invokeSuspend")
public final class C596740Naq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AgentCommandRequest LLILLL;
    public final /* synthetic */ AbstractC596640Nag LLILZ;
    public final /* synthetic */ InterfaceC596800Naw LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ TakoClientAgentServiceImpl LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596740Naq(AgentCommandRequest agentCommandRequest, AbstractC596640Nag abstractC596640Nag, InterfaceC596800Naw interfaceC596800Naw, long j, TakoClientAgentServiceImpl takoClientAgentServiceImpl, InterfaceC1364105Vn<? super C596740Naq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = agentCommandRequest;
        this.LLILZ = abstractC596640Nag;
        this.LLILZIL = interfaceC596800Naw;
        this.LLILZLL = j;
        this.LLIZ = takoClientAgentServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C596740Naq c596740Naq = new C596740Naq(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c596740Naq.LLILLJJLI = obj;
        return c596740Naq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FeedConfigArg feedConfigArg;
        C596610Nad c596610Nad;
        Object obj2;
        InterfaceC596930Nb9 interfaceC596930Nb9;
        PlaySpeed playSpeed;
        Boolean bool;
        Boolean bool2;
        int i;
        C00C2 c00c2;
        String str;
        Object c098200Yq;
        C1C7U.LIZ("TakoClientAgentServiceImpl@3dc6.onCommandReceived$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String str2 = null;
            if (Intrinsics.LJFF(this.LLILLL.command, "feed.config") && (str = this.LLILLL.arguments) != null) {
                try {
                    c098200Yq = (FeedConfigArg) C597040NbK.LIZ().LJII(str, FeedConfigArg.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                feedConfigArg = (FeedConfigArg) c098200Yq;
            } else {
                feedConfigArg = null;
            }
            AbstractC596640Nag abstractC596640Nag = this.LLILZ;
            if (abstractC596640Nag instanceof C596610Nad) {
                c596610Nad = (C596610Nad) abstractC596640Nag;
            } else {
                c596610Nad = null;
            }
            if (c596610Nad != null && (c00c2 = c596610Nad.LIZIZ) != null) {
                obj2 = c00c2.LIZIZ;
            } else {
                obj2 = null;
            }
            if (obj2 instanceof InterfaceC596930Nb9) {
                interfaceC596930Nb9 = (InterfaceC596930Nb9) obj2;
            } else {
                interfaceC596930Nb9 = null;
            }
            if (interfaceC596930Nb9 == null) {
                if (abstractC596640Nag instanceof InterfaceC596930Nb9) {
                    interfaceC596930Nb9 = (InterfaceC596930Nb9) abstractC596640Nag;
                } else {
                    interfaceC596930Nb9 = null;
                }
            }
            String str3 = abstractC596640Nag.LIZ;
            String channel = this.LLILZIL.Kf().getChannel();
            AgentCommandRequest agentCommandRequest = this.LLILLL;
            long j = this.LLILZLL;
            if (feedConfigArg != null) {
                playSpeed = feedConfigArg.speed;
            } else {
                playSpeed = null;
            }
            if (playSpeed != null) {
                PlaySpeed playSpeed2 = feedConfigArg.speed;
                if (playSpeed2 == null) {
                    i = -1;
                } else {
                    i = C09GV.LIZ[playSpeed2.ordinal()];
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                str2 = "speed_2";
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            str2 = "speed_1.5";
                        }
                    } else {
                        str2 = "speed_1";
                    }
                } else {
                    str2 = "speed_0.5";
                }
            } else {
                if (feedConfigArg != null) {
                    bool = feedConfigArg.autoScroll;
                } else {
                    bool = null;
                }
                if (bool != null) {
                    Boolean bool3 = feedConfigArg.autoScroll;
                    if (Intrinsics.LJFF(bool3, Boolean.FALSE)) {
                        str2 = "auto_scroll_off";
                    } else if (Intrinsics.LJFF(bool3, Boolean.TRUE)) {
                        str2 = "auto_scroll_on";
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    if (feedConfigArg != null) {
                        bool2 = feedConfigArg.clearDisplay;
                    } else {
                        bool2 = null;
                    }
                    if (bool2 != null) {
                        Boolean bool4 = feedConfigArg.clearDisplay;
                        if (Intrinsics.LJFF(bool4, Boolean.FALSE)) {
                            str2 = "clear_display_off";
                        } else if (Intrinsics.LJFF(bool4, Boolean.TRUE)) {
                            str2 = "clear_display_on";
                        } else {
                            throw new C1954807lC();
                        }
                    }
                }
            }
            C596820Nay c596820Nay = new C596820Nay(agentCommandRequest, interfaceC596930Nb9, str3, j, channel, str2);
            C2252331DDr c2252331DDr = this.LLIZ.LIZLLL;
            this.LL = 1;
            if (c2252331DDr.emit(c596820Nay, this) == objLJFF) {
                C1C7U.LIZIZ("TakoClientAgentServiceImpl@3dc6.onCommandReceived$2$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoClientAgentServiceImpl@3dc6.onCommandReceived$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

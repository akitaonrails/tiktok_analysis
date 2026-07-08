package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetUserCardTemplate;
import com.ss.android.ugc.aweme.im.send.service.IMSendMessageService;
import com.ss.android.ugc.tools.chat.room.api.AiChatRoomFeatureApi;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.JobSupport;
import okio.ByteString;

/* JADX INFO: renamed from: X.18U0, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18U0 extends AbstractC2255721DQs<C18UC> implements C18UC, InterfaceC379610EuV {
    public static final C18U1 LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public final C18UC LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C18UJ.class, null);
    public final ConcurrentHashMap<C189Y, Boolean> LLILZ = new ConcurrentHashMap<>();
    public final C11NJ LLILZIL = new C11NJ();
    public final ConcurrentHashMap<C18U2, AnonymousClass0957<C189200o6<Unit>>> LLILZLL = new ConcurrentHashMap<>();
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), AiChatRoomFeatureApi.class, null);

    /* JADX WARN: Type inference failed for: r0v5, types: [X.18U1] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C18U0.class, "chatSession", "getChatSession()Lcom/ss/android/ugc/tools/chat/room/model/ChatSession;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C18U0.class, "chatRoomApi", "getChatRoomApi()Lcom/ss/android/ugc/tools/chat/room/api/AiChatRoomFeatureApi;", 0)};
        LLIZLLLIL = new Object() { // from class: X.18U1
        };
        LLJI = 8;
    }

    public final C18UJ G2() {
        return (C18UJ) this.LLILLL.getValue(this, LLJ[0]);
    }

    public final AiChatRoomFeatureApi w2() {
        return (AiChatRoomFeatureApi) this.LLIZ.getValue(this, LLJ[1]);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLILZIL.dispose();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C18UC o2() {
        return this.LLILLJJLI;
    }

    public C18U0(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final C09AE W1(final C11NJ c11nj) {
        return new C09AE() { // from class: X.09AN
            public final /* synthetic */ C23119094b LL = C2296908zH.LIZ();

            @Override // X.C09AE
            public final Sequence<C09AE> LIZ() {
                return this.LL.LIZ();
            }

            @Override // X.C09AE
            public final InterfaceC2238208po LJII(Function1<? super Throwable, Unit> function1) {
                return this.LL.LJII(function1);
            }

            @Override // X.C09AE
            public final InterfaceC2238208po LJJJJ(Function1 function1, boolean z, boolean z2) {
                return this.LL.LJJJJ(function1, z, z2);
            }

            @Override // X.C09AE
            public final CancellationException LJJJLL() {
                return this.LL.LJJJLL();
            }

            @Override // X.C09AE
            public final Object LJJZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return this.LL.LJJZ(interfaceC1364105Vn);
            }

            @Override // X.C09AE
            public final C1DFY LLFFF(JobSupport jobSupport) {
                return this.LL.LLFFF(jobSupport);
            }

            @Override // X.C09AE
            public final C09AE getParent() {
                return this.LL.getParent();
            }

            @Override // X.C09AE
            public final boolean isActive() {
                return this.LL.isActive();
            }

            @Override // X.C09AE
            public final boolean isCancelled() {
                return this.LL.isCancelled();
            }

            @Override // X.C09AE
            public final boolean isCompleted() {
                return this.LL.isCompleted();
            }

            @Override // X.C09AE
            public final boolean start() {
                return this.LL.start();
            }

            @Override // kotlin.coroutines.CoroutineContext.Element
            public final InterfaceC23272099y<?> getKey() {
                this.LL.getClass();
                return C09AE.LJJLJ;
            }

            @Override // X.C09AE, X.AnonymousClass0954
            public final void LIZIZ(CancellationException cancellationException) {
                c11nj.LJ();
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public final <E extends CoroutineContext.Element> E get(InterfaceC23272099y<E> interfaceC23272099y) {
                C23119094b c23119094b = this.LL;
                c23119094b.getClass();
                return (E) C09A1.LIZIZ(c23119094b, interfaceC23272099y);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public final CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y) {
                C23119094b c23119094b = this.LL;
                c23119094b.getClass();
                return C09A1.LIZJ(c23119094b, interfaceC23272099y);
            }

            @Override // kotlin.coroutines.CoroutineContext
            public final CoroutineContext plus(CoroutineContext coroutineContext) {
                C23119094b c23119094b = this.LL;
                c23119094b.getClass();
                return C09A1.LIZLLL(c23119094b, coroutineContext);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
                C23119094b c23119094b = this.LL;
                c23119094b.getClass();
                return (R) C09A1.LIZ(c23119094b, r, function2);
            }
        };
    }

    @Override // X.C18UC
    public void DI0(C189Y c189y) {
        this.LLILZ.remove(c189y);
    }

    public final boolean H2(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null || c869590Y9l.getMsgType() != 1819) {
            return false;
        }
        return C902820ZbM.LIZ((VisualPoetUserCardTemplate) C0Z2Z.LIZ(c869590Y9l, VisualPoetUserCardTemplate.class));
    }

    public final void X1(C869590Y9l c869590Y9l) {
        VisualPoetUserCardTemplate visualPoetUserCardTemplate = (VisualPoetUserCardTemplate) C0Z2Z.LIZ(c869590Y9l, VisualPoetUserCardTemplate.class);
        if (visualPoetUserCardTemplate != null && visualPoetUserCardTemplate.userContentInvisible) {
            C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZ(c869590Y9l, false, null);
            return;
        }
        if (c869590Y9l.getMsgStatus() == 2 && c869590Y9l.getMsgId() > 0) {
            C21163117rp.LIZIZ().LJIILLIIL(C06R4.DELETE_SYSTEM_CONTENT, c869590Y9l);
            return;
        }
        VisualPoetUserCardTemplate visualPoetUserCardTemplate2 = (VisualPoetUserCardTemplate) C0Z2Z.LIZ(c869590Y9l, VisualPoetUserCardTemplate.class);
        if (visualPoetUserCardTemplate2 == null) {
            return;
        }
        T2(c869590Y9l, VisualPoetUserCardTemplate.LIZ(visualPoetUserCardTemplate2, false, true, null, null, null, 4087).encode());
    }

    public final void Z1(C869590Y9l c869590Y9l) {
        VisualPoetUserCardTemplate visualPoetUserCardTemplate = (VisualPoetUserCardTemplate) C0Z2Z.LIZ(c869590Y9l, VisualPoetUserCardTemplate.class);
        if (visualPoetUserCardTemplate != null && visualPoetUserCardTemplate.systemContentInvisible) {
            C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZ(c869590Y9l, false, null);
            return;
        }
        if (c869590Y9l.getMsgStatus() == 2 && c869590Y9l.getMsgId() > 0) {
            C21163117rp.LIZIZ().LJIILLIIL(C06R4.DELETE_USER_CONTENT, c869590Y9l);
            return;
        }
        VisualPoetUserCardTemplate visualPoetUserCardTemplate2 = (VisualPoetUserCardTemplate) C0Z2Z.LIZ(c869590Y9l, VisualPoetUserCardTemplate.class);
        if (visualPoetUserCardTemplate2 == null) {
            return;
        }
        T2(c869590Y9l, VisualPoetUserCardTemplate.LIZ(visualPoetUserCardTemplate2, true, false, null, null, null, 4091).encode());
    }

    @Override // X.C18UC
    public void du(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C18U4(c869590Y9l, this, null), 2);
    }

    @Override // X.C18UC
    public void oX(C189Y c189y) {
        this.LLILZ.put(c189y, Boolean.TRUE);
    }

    private final void T2(C869590Y9l c869590Y9l, ByteString byteString) {
        c869590Y9l.setContentPB(byteString);
        c869590Y9l.putLocalCache(501, null);
        C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJIIZ(new C0Y3I("CreationChatSendMessageComponent"), c869590Y9l, new InterfaceC863600XuI<C869590Y9l>() { // from class: X.18Sx
            @Override // X.InterfaceC863600XuI
            public final void LIZIZ(C0YMW c0ymw) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFailure: updateMessage ");
                sbLIZ.append(c0ymw);
                C21290818Tq.LIZIZ("CreationChatSendMessageComponent", C2188811AlT.LIZIZ(sbLIZ), null);
            }

            @Override // X.InterfaceC863600XuI
            public final void onSuccess(C869590Y9l c869590Y9l2) {
                C21290818Tq.LIZJ("CreationChatSendMessageComponent", "onSuccess: updateMessage");
            }
        });
    }

    @Override // X.C18UC
    public InterfaceC346201Wa<C189200o6<Unit>> ZE0(C06R4 c06r4, C869590Y9l c869590Y9l) {
        c869590Y9l.getUuid();
        AnonymousClass0957<C189200o6<Unit>> anonymousClass0957 = this.LLILZLL.get(new Object() { // from class: X.18U2
        });
        if (anonymousClass0957 == null) {
            return null;
        }
        return new C095D(new C1368505Xf(anonymousClass0957, null));
    }

    @Override // X.C18UC
    public void zk2(C869590Y9l c869590Y9l, EnumC212372189a enumC212372189a) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C189X(this, c869590Y9l, enumC212372189a, null), 2);
    }

    @Override // X.C18UC
    public void PH0(C18UZ c18uz, C18UJ c18uj, boolean z) {
        String strLIZ;
        Map<String, String> map = c18uz.LIZLLL;
        if (map == null || (strLIZ = map.get("client_task_id")) == null) {
            strLIZ = C1017903yT.LIZ();
            strLIZ.toString();
        }
        C18UQ c18uq = new C18UQ(G2(), c18uz, z, strLIZ);
        IMSendMessageService iMSendMessageService = (IMSendMessageService) PluggableExtentionKt.pluggableSpi$default(IMSendMessageService.class, false, false, false, 14, null);
        if (iMSendMessageService != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), W1(this.LLILZIL), null, new C18UR(iMSendMessageService, c18uj, c18uq, c18uz, null), 2);
            return;
        }
        throw new IllegalArgumentException("null IMSendMessageService service");
    }
}

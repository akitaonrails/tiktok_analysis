package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.List;

/* JADX INFO: renamed from: X.0ZbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902710ZbB implements InterfaceC902750ZbF<InterfaceC461380I7k, InterfaceC461380I7k, MessageListProtocolEnum> {
    public final C902700ZbA LL;
    public final C902690Zb9 LLILLJJLI;
    public final InterfaceC902790ZbJ<InterfaceC461380I7k> LLILLL;
    public final InterfaceC902790ZbJ<InterfaceC461380I7k> LLILZ;
    public final /* synthetic */ SkeletonMessageListProtocol<InterfaceC461380I7k, InterfaceC461380I7k> LLILZIL;

    @Override // X.InterfaceC904610ZeF
    public final InterfaceC904620ZeG<MessageListProtocolEnum> convert() {
        return new InterfaceC904620ZeG<Enum<Object>>(this) { // from class: X.0ZbC
            public final Enum<Object> LIZ;
            public final InterfaceC903660Zci LIZIZ;
            public final List<Class<? extends PowerCell<?>>> LIZJ;
            public final List<InterfaceC607860Nsm<?>> LIZLLL;
            public final List<InterfaceC902790ZbJ<? extends InterfaceC1891350zJl>> LJ;
            public final /* synthetic */ InterfaceC902750ZbF<InterfaceC461380I7k, InterfaceC461380I7k, Enum<Object>> LJFF;

            @Override // X.InterfaceC904620ZeG
            public final List<InterfaceC902790ZbJ<? extends InterfaceC1891350zJl>> LIZ() {
                return this.LJ;
            }

            @Override // X.InterfaceC904620ZeG
            public final List<InterfaceC607860Nsm<?>> LIZIZ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC904620ZeG
            public final List<Class<? extends PowerCell<?>>> LIZJ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC904620ZeG
            public final Enum<Object> getInterceptOrdering() {
                return this.LIZ;
            }

            @Override // X.InterfaceC904620ZeG
            public final InterfaceC903660Zci getMsgHandlerCheck() {
                return this.LIZIZ;
            }

            {
                this.LJFF = this;
                this.LIZ = this.getInterceptOrdering();
                this.LIZIZ = this.getMsgHandlerCheck();
                this.LIZJ = C1697810uHb.LJIIJJI(this.da(), this.gr());
                this.LIZLLL = C1697810uHb.LJIIJJI(this.Cc(), this.Sb());
                C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                InterfaceC902790ZbJ<InterfaceC461380I7k> interfaceC902790ZbJWh = this.Wh();
                if (interfaceC902790ZbJWh != null) {
                    c13dvLIZIZ.add(interfaceC902790ZbJWh);
                }
                InterfaceC902790ZbJ<InterfaceC461380I7k> interfaceC902790ZbJAn = this.An();
                if (interfaceC902790ZbJAn != null) {
                    c13dvLIZIZ.add(interfaceC902790ZbJAn);
                }
                this.LJ = C1697820uHc.LIZ(c13dvLIZIZ);
            }

            @Override // X.InterfaceC904620ZeG
            public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
                return this.LJFF.intercept(list);
            }
        };
    }

    @Override // X.InterfaceC902750ZbF
    public final Class<? extends IMSkeletonLayoutPowerCell<?, InterfaceC461380I7k>> da() {
        return this.LLILZIL.da();
    }

    @Override // X.InterfaceC902750ZbF
    public final Enum getInterceptOrdering() {
        return this.LLILZIL.getInterceptOrdering();
    }

    @Override // X.InterfaceC902750ZbF
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILZIL.getMsgHandlerCheck();
    }

    @Override // X.InterfaceC902750ZbF
    public final Class<? extends IMSkeletonLayoutPowerCell<?, InterfaceC461380I7k>> gr() {
        return this.LLILZIL.gr();
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<InterfaceC461380I7k> An() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC902750ZbF
    public final C902700ZbA Cc() {
        return this.LL;
    }

    @Override // X.InterfaceC902750ZbF
    public final C902690Zb9 Sb() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<InterfaceC461380I7k> Wh() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC902750ZbF
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        return this.LLILZIL.intercept(list);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ZbA] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Zb9] */
    public C902710ZbB(final SkeletonMessageListProtocol<InterfaceC461380I7k, InterfaceC461380I7k> skeletonMessageListProtocol, final C01GW<? extends C0ZSN> c01gw) {
        this.LLILZIL = skeletonMessageListProtocol;
        this.LL = new AbstractC902680Zb8<InterfaceC461380I7k>(c01gw) { // from class: X.0ZbA
            @Override // X.AbstractC902680Zb8
            public final InterfaceC461380I7k LIZIZ(List list, C869590Y9l c869590Y9l, int i, C0IB0 c0ib0) {
                return skeletonMessageListProtocol.m72(c869590Y9l, c0ib0);
            }
        };
        this.LLILLJJLI = new AbstractC902670Zb7<InterfaceC461380I7k>(c01gw) { // from class: X.0Zb9
            @Override // X.AbstractC902670Zb7
            public final InterfaceC461380I7k LIZIZ(List list, C869590Y9l c869590Y9l, int i, C0IB0 c0ib0) {
                return skeletonMessageListProtocol.ts1(c869590Y9l, c0ib0);
            }
        };
        this.LLILLL = skeletonMessageListProtocol.An();
        this.LLILZ = skeletonMessageListProtocol.Wh();
    }
}

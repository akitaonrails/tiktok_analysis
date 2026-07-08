package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import java.util.List;

/* JADX INFO: renamed from: X.0ZbD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902730ZbD implements InterfaceC904590ZeD<MessageListProtocolEnum, InterfaceC1891350zJl> {
    public final InterfaceC903660Zci LL;
    public final MessageListProtocolEnum LLILLJJLI;
    public final C902660Zb6 LLILLL;
    public final Class<? extends PowerCell<InterfaceC1891350zJl>> LLILZ;
    public final Integer LLILZIL;
    public final /* synthetic */ IMMessageListProtocol<InterfaceC1891350zJl> LLILZLL;

    @Override // X.InterfaceC902790ZbJ
    public final Class<InterfaceC1891350zJl> getPowerItemClazz() {
        return null;
    }

    @Override // X.InterfaceC904610ZeF
    public final InterfaceC904620ZeG<MessageListProtocolEnum> convert() {
        return new C904580ZeC(this);
    }

    @Override // X.InterfaceC904590ZeD
    public final InterfaceC607860Nsm<InterfaceC1891350zJl> LLLLIILLL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC904590ZeD
    public final /* bridge */ /* synthetic */ Enum getInterceptOrdering() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC904590ZeD
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LL;
    }

    @Override // X.InterfaceC904590ZeD, X.InterfaceC902800ZbK
    public final Class<? extends PowerCell<InterfaceC1891350zJl>> getWithCell() {
        return this.LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Zb6] */
    public C902730ZbD(final IMMessageListProtocol<InterfaceC1891350zJl> iMMessageListProtocol) {
        this.LLILZLL = iMMessageListProtocol;
        this.LL = iMMessageListProtocol.getMsgHandlerCheck();
        this.LLILLJJLI = iMMessageListProtocol.getInterceptOrdering();
        this.LLILLL = new InterfaceC607860Nsm() { // from class: X.0Zb6
            @Override // X.InterfaceC607860Nsm
            public final T LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i, String str) {
                return (T) iMMessageListProtocol.mapToPowerItem(list, c869590Y9l, i);
            }
        };
        this.LLILZ = iMMessageListProtocol.getWithCell();
        this.LLILZIL = iMMessageListProtocol.getCustomViewPoolSize();
    }

    @Override // X.InterfaceC904590ZeD
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        return this.LLILZLL.intercept(list);
    }
}

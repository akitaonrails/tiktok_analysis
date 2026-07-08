package X;

import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetBotCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetBotTextComponent;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18Up, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21293318Up<T extends InterfaceC1891350zJl> implements InterfaceC607860Nsm {
    public static final C21293318Up<T> LIZ = new C21293318Up<>();

    @Override // X.InterfaceC607860Nsm
    public final InterfaceC1891350zJl LIZ(List list, C869590Y9l c869590Y9l, int i, String str) {
        String strLJ;
        VisualPoetBotTextComponent visualPoetBotTextComponent;
        VisualPoetBotCardTemplate visualPoetBotCardTemplate = (VisualPoetBotCardTemplate) C0Z2Z.LIZ(c869590Y9l, VisualPoetBotCardTemplate.class);
        if (visualPoetBotCardTemplate == null || (visualPoetBotTextComponent = visualPoetBotCardTemplate.botTextComponent) == null || (strLJ = visualPoetBotTextComponent.text) == null) {
            strLJ = C21291518Tx.LJ(EnumC21291418Tw.REGENERATE_TITLE_TEXT, new Object[0]);
        }
        C909940Zmq c909940Zmq = new C909940Zmq(new C1622006Ws(C452501pT.LIZIZ(new AwS576S0100000_32(c869590Y9l, 787))), C18VH.START, new C909930Zmp(c869590Y9l), c869590Y9l.getUuid());
        c909940Zmq.LIZ(new C0H93(c869590Y9l.getUuid(), C0ZDX.LJJJJIZL(c869590Y9l), strLJ));
        return c909940Zmq;
    }
}

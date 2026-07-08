package X;

import X.InterfaceC1891350zJl;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetBotCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetBotTextComponent;
import java.util.List;
import kotlin.jvm.internal.AwS181S1100000_32;
import kotlin.text.u;

/* JADX INFO: renamed from: X.18Uo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21293218Uo<T extends InterfaceC1891350zJl> implements InterfaceC607860Nsm {
    public static final C21293218Uo<T> LIZ = new C21293218Uo<>();

    @Override // X.InterfaceC607860Nsm
    public final InterfaceC1891350zJl LIZ(List list, C869590Y9l c869590Y9l, int i, String str) {
        boolean z;
        TextContent textContent;
        String text;
        VisualPoetBotCardTemplate visualPoetBotCardTemplate;
        VisualPoetBotTextComponent visualPoetBotTextComponent;
        C18VH c18vh;
        C18TL c18tlLIZIZ;
        String str2;
        Keva keva = C21289818Tg.LIZ;
        if (C21290118Tj.LIZIZ(c869590Y9l) != null) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "";
        if (!z ? !(c869590Y9l.getMsgType() != 1820 ? c869590Y9l.getMsgType() != 7 || (textContent = (TextContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, TextContent.class)) == null || (text = textContent.getText()) == null : (visualPoetBotCardTemplate = (VisualPoetBotCardTemplate) C0Z2Z.LIZ(c869590Y9l, VisualPoetBotCardTemplate.class)) == null || (visualPoetBotTextComponent = visualPoetBotCardTemplate.botTextComponent) == null || (text = visualPoetBotTextComponent.text) == null) : !((c18tlLIZIZ = C21290118Tj.LIZIZ(c869590Y9l)) == null || (str2 = c18tlLIZIZ.LIZIZ) == null || (text = u.LJJIFFI(str2, "{{1}}", "", false)) == null)) {
            str3 = text;
        }
        if (C0ZDX.LJJJJIZL(c869590Y9l)) {
            c18vh = C18VH.END;
        } else {
            c18vh = C18VH.START;
        }
        C909940Zmq c909940Zmq = new C909940Zmq(new C1622006Ws(C452501pT.LIZIZ(new AwS181S1100000_32(c869590Y9l, str3, 8))), c18vh, new C909930Zmp(c869590Y9l), c869590Y9l.getUuid());
        c909940Zmq.LIZ(new C0H93(c869590Y9l.getUuid(), C0ZDX.LJJJJIZL(c869590Y9l), str3));
        if (C0ZDX.LJJJJIZL(c869590Y9l)) {
            c909940Zmq.LIZ(new C18V2(c869590Y9l.getUuid(), c869590Y9l.getMsgStatus(), new C909930Zmp(c869590Y9l)));
        }
        return c909940Zmq;
    }
}

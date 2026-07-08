package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.protocol.FlexNimbleCardAnswerAssem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0QuH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685230QuH extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ FlexNimbleCardAnswerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C685230QuH(FlexNimbleCardAnswerAssem flexNimbleCardAnswerAssem) {
        super(1);
        this.LL = flexNimbleCardAnswerAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Map<C14NX, C13IQ<? extends ReusedUIContentAssem<?>>> map;
        Map<C14NX, C13IQ<? extends ReusedUISlotAssem<?>>> map2;
        Assembler assembler2 = assembler;
        FlexNimbleCardAnswerAssem flexNimbleCardAnswerAssem = this.LL;
        NimbleTemplateContext nimbleTemplateContext = flexNimbleCardAnswerAssem.LLLZIIL;
        if (nimbleTemplateContext != null && (map2 = nimbleTemplateContext.LLJILJIL) != null) {
            for (Map.Entry entry : ((LinkedHashMap) map2).entrySet()) {
                assembler2.MQ2(flexNimbleCardAnswerAssem, new AwS589S0100000_10(entry, (Map.Entry<? extends C14NX, ? extends C13IQ<? extends ReusedUISlotAssem<?>>>) 369));
                ((ArrayList) flexNimbleCardAnswerAssem.LLLZIL).add(entry.getValue());
            }
        }
        FlexNimbleCardAnswerAssem flexNimbleCardAnswerAssem2 = this.LL;
        NimbleTemplateContext nimbleTemplateContext2 = flexNimbleCardAnswerAssem2.LLLZIIL;
        if (nimbleTemplateContext2 != null && (map = nimbleTemplateContext2.LLJILJILJ) != null) {
            for (Map.Entry entry2 : ((LinkedHashMap) map).entrySet()) {
                assembler2.LQ2(flexNimbleCardAnswerAssem2, new AwS589S0100000_10(entry2, (Map.Entry<? extends C14NX, ? extends C13IQ<? extends ReusedUISlotAssem<?>>>) 370));
                ((ArrayList) flexNimbleCardAnswerAssem2.LLLZL).add(entry2.getValue());
            }
        }
        return Unit.LIZ;
    }
}

package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.search.pages.result.nimble.v2.Top1NimbleCardAssem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0QuC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685180QuC extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ Top1NimbleCardAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C685180QuC(Top1NimbleCardAssem top1NimbleCardAssem) {
        super(1);
        this.LL = top1NimbleCardAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Map<C14NX, C13IQ<? extends ReusedUIContentAssem<?>>> map;
        Map<C14NX, C13IQ<? extends ReusedUISlotAssem<?>>> map2;
        Assembler assembler2 = assembler;
        Top1NimbleCardAssem top1NimbleCardAssem = this.LL;
        NimbleTemplateContext nimbleTemplateContext = top1NimbleCardAssem.LLJLL;
        if (nimbleTemplateContext != null && (map2 = nimbleTemplateContext.LLJILJIL) != null) {
            for (Map.Entry entry : ((LinkedHashMap) map2).entrySet()) {
                if (!((ArrayList) top1NimbleCardAssem.LLJLLIL).contains(entry.getValue())) {
                    assembler2.MQ2(top1NimbleCardAssem, new AwS589S0100000_10(entry, (Map.Entry<? extends C14NX, ? extends C13IQ<? extends ReusedUISlotAssem<?>>>) 477));
                    ((ArrayList) top1NimbleCardAssem.LLJLLIL).add(entry.getValue());
                }
            }
        }
        Top1NimbleCardAssem top1NimbleCardAssem2 = this.LL;
        NimbleTemplateContext nimbleTemplateContext2 = top1NimbleCardAssem2.LLJLL;
        if (nimbleTemplateContext2 != null && (map = nimbleTemplateContext2.LLJILJILJ) != null) {
            for (Map.Entry entry2 : ((LinkedHashMap) map).entrySet()) {
                if (!((ArrayList) top1NimbleCardAssem2.LLJLLL).contains(entry2.getValue())) {
                    assembler2.LQ2(top1NimbleCardAssem2, new AwS589S0100000_10(entry2, (Map.Entry<? extends C14NX, ? extends C13IQ<? extends ReusedUISlotAssem<?>>>) 478));
                    ((ArrayList) top1NimbleCardAssem2.LLJLLL).add(entry2.getValue());
                }
            }
        }
        return Unit.LIZ;
    }
}

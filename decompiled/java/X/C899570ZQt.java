package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0ZQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C899570ZQt extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ AbsSkeletonLayoutReusedUISlotAssem<T> LL;
    public final /* synthetic */ C899580ZQu LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C899570ZQt(AbsSkeletonLayoutReusedUISlotAssem<T> absSkeletonLayoutReusedUISlotAssem, C899580ZQu c899580ZQu) {
        super(1);
        this.LL = absSkeletonLayoutReusedUISlotAssem;
        this.LLILLJJLI = c899580ZQu;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.EQ2(this.LL, new AwS593S0100000_14(this.LLILLJJLI, 85));
        for (Map.Entry entry : ((LinkedHashMap) this.LLILLJJLI.LIZ).entrySet()) {
            C14IR c14ir = (C14IR) entry.getKey();
            AbstractC899510ZQn<?, ?> abstractC899510ZQn = ((C899590ZQv) entry.getValue()).LIZ;
            if (abstractC899510ZQn != null) {
                Object obj = abstractC899510ZQn.LIZ;
                if (obj instanceof C899530ZQp) {
                    assembler2.LQ2(this.LL, new AwS396S0200000_30(c14ir, (C14IR) abstractC899510ZQn, (AbstractC899510ZQn<?, ?>) 11));
                } else if (obj instanceof C899520ZQo) {
                    assembler2.MQ2(this.LL, new AwS396S0200000_30(c14ir, (C14IR) abstractC899510ZQn, (AbstractC899510ZQn<?, ?>) 12));
                } else {
                    throw new C1954807lC();
                }
            }
        }
        C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> c13iq = this.LLILLJJLI.LIZJ;
        if (c13iq != null) {
            assembler2.MQ2(this.LL, new AwS589S0100000_10(c13iq, (C13IQ<? extends ReusedUIContentAssem<? extends C03H5>>) 108));
        }
        return Unit.LIZ;
    }
}

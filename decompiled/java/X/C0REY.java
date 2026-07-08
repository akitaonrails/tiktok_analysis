package X;

import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0REY, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0REY extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ FeedVideoAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0REY(FeedVideoAssem feedVideoAssem, View view) {
        super(1);
        this.LL = feedVideoAssem;
        this.LLILLJJLI = view;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [T, X.13IQ] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        IAdComponentService iAdComponentService;
        C19719912Dl c19719912DlLJIL;
        Assembler assembler2 = assembler;
        FeedVideoAssem feedVideoAssem = this.LL;
        feedVideoAssem.getClass();
        new C0RBB(assembler2, feedVideoAssem).invoke();
        if (Intrinsics.LJFF(this.LL.LLJJJJLIIL.eventType, "homepage_friends")) {
            assembler2.MQ2(this.LL, AFwS243S0000000_11.get$arr$(50));
        }
        C259800zU c259800zU = new C259800zU();
        if (C0R93.LJFF(this.LL.LLJJJJLIIL.eventType)) {
            c259800zU.element = C1587150rP7.LIZIZ.LJIILLIIL();
            assembler2.MQ2(this.LL, new C692420REa(c259800zU));
        }
        if (Intrinsics.LJFF(this.LL.LLJJJJLIIL.eventType, "homepage_explore")) {
            assembler2.KQ2(this.LL, AFwS243S0000000_11.get$arr$(53));
        }
        C0S0L c0s0l = C0S0L.LIZ;
        C690870R8b c690870R8bJm = this.LL.jm();
        c0s0l.getClass();
        if (C0S0L.LJFF(c690870R8bJm) && (iAdComponentService = (IAdComponentService) this.LL.LLJLIL.getValue()) != null && (c19719912DlLJIL = iAdComponentService.LJIL()) != null) {
            assembler2.LQ2(this.LL, new AwS589S0100000_10(c19719912DlLJIL, (C13IQ<? extends ReusedUIContentAssem<? extends C03H5>>) 106));
        }
        FeedVideoAssem feedVideoAssem2 = this.LL;
        C736680Sv4.LJIIIIZZ(feedVideoAssem2, (AssemViewModel) feedVideoAssem2.LLJL.getValue(), new C2217381BqS() { // from class: X.0RCF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LL;
            }
        }, null, new AwS625S0100000_11(c259800zU, (C259800zU<C13IQ<? extends ReusedUISlotAssem<? extends C03H5>>>) 12), 6);
        FeedVideoAssem feedVideoAssem3 = this.LL;
        Set<C0REZ> set = feedVideoAssem3.LLJJLIIIJLLLLLLLZ;
        if (set != null) {
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                ((C0REZ) it2.next()).LIZ(assembler2, feedVideoAssem3);
            }
        }
        return Unit.LIZ;
    }
}

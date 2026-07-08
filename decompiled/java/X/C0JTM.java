package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JTM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JTM extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubWaveEmotePageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JTM(SubWaveEmotePageFragment subWaveEmotePageFragment) {
        super(1);
        this.LL = subWaveEmotePageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        SubWaveEmotePageFragment subWaveEmotePageFragment = this.LL;
        assembler2.DQ2(subWaveEmotePageFragment, new C0JTL(subWaveEmotePageFragment));
        assembler2.QQ2(this.LL, new C1133504c1());
        assembler2.QQ2(this.LL, new C0JTN());
        assembler2.QQ2(this.LL, new C0JTO());
        return Unit.LIZ;
    }
}

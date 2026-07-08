package X;

import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05Jx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1333905Jx extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ AbstractC1333605Ju<? extends COMPONENT, PARAM> LL;
    public final /* synthetic */ C1333805Jw<COMPONENT, PARAM> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1333905Jx(AbstractC1333605Ju<? extends COMPONENT, PARAM> abstractC1333605Ju, C1333805Jw<COMPONENT, PARAM> c1333805Jw) {
        super(1);
        this.LL = abstractC1333605Ju;
        this.LLILLJJLI = c1333805Jw;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        AbstractC1333605Ju<? extends COMPONENT, PARAM> abstractC1333605Ju = this.LL;
        if (abstractC1333605Ju instanceof C05K0) {
            assembler2.vQ2(this.LLILLJJLI.LIZIZ, new C05K1(abstractC1333605Ju));
        } else if (abstractC1333605Ju instanceof AbstractC1334105Jz) {
            assembler2.QQ2(this.LLILLJJLI.LIZIZ, new C1334005Jy(abstractC1333605Ju));
        }
        return Unit.LIZ;
    }
}

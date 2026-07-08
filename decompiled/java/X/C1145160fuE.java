package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS51S0100100_17;

/* JADX INFO: renamed from: X.0fuE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145160fuE extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ DataChannel LLILLL;
    public final /* synthetic */ C13IQ<? extends UIContentAssem> LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145160fuE(Fragment fragment, long j, DataChannel dataChannel, C13IQ<? extends UIContentAssem> c13iq, View view) {
        super(1);
        this.LL = fragment;
        this.LLILLJJLI = j;
        this.LLILLL = dataChannel;
        this.LLILZ = c13iq;
        this.LLILZIL = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.DQ2(this.LL, new AwS51S0100100_17(this.LLILLJJLI, this.LLILLL, 1));
        assembler2.QQ2(this.LL, new AwS368S0200000_2(this.LLILZIL, this.LLILZ, 31));
        return Unit.LIZ;
    }
}

package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.assem.EmotePollDetailAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04gd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1162104gd extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ EmotePollDetailAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1162104gd(EmotePollDetailAssem emotePollDetailAssem, View view) {
        super(1);
        this.LL = emotePollDetailAssem;
        this.LLILLJJLI = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.QQ2(this.LL, new C1162004gc(this.LLILLJJLI));
        return Unit.LIZ;
    }
}

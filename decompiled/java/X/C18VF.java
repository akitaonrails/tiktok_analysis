package X;

import android.view.View;
import com.ss.android.ugc.tools.chat.message.api.AiChatMessageFeatureApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS433S0200000_32;

/* JADX INFO: renamed from: X.18VF, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18VF extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ AiChatMessageFeatureApi LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ EnumC212372189a LLILLL;
    public final /* synthetic */ C21300118Xf LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18VF(C869590Y9l c869590Y9l, AiChatMessageFeatureApi aiChatMessageFeatureApi, EnumC212372189a enumC212372189a, C21300118Xf c21300118Xf, AwS433S0200000_32 awS433S0200000_32) {
        super(1);
        this.LL = aiChatMessageFeatureApi;
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = enumC212372189a;
        this.LLILZ = c21300118Xf;
        this.LLILZIL = awS433S0200000_32;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        this.LL.zk2(this.LLILLJJLI, this.LLILLL);
        this.LLILZ.LIZIZ(C18VB.COPY_TEXT);
        this.LLILZIL.invoke();
        return Unit.LIZ;
    }
}

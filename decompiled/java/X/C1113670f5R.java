package X;

import android.os.Handler;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS22S0600000_17;

/* JADX INFO: renamed from: X.0f5R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113670f5R extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function2<String, EnumC1110950f13, Unit> LL;
    public final /* synthetic */ PublicAreaMessageCommon.OperationState LLILLJJLI;
    public final /* synthetic */ EnumC1110950f13 LLILLL;
    public final /* synthetic */ C1114050f63 LLILZ;
    public final /* synthetic */ C1114030f61 LLILZIL;
    public final /* synthetic */ AbstractC1110800f0o<? extends AbstractC1136060ffY> LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ C1113680f5S LLIZLLLIL;
    public final /* synthetic */ Function2<String, EnumC1110950f13, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1113670f5R(Function2<? super String, ? super EnumC1110950f13, Unit> function2, PublicAreaMessageCommon.OperationState operationState, EnumC1110950f13 enumC1110950f13, C1114050f63 c1114050f63, C1114030f61 c1114030f61, AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o, boolean z, C1113680f5S c1113680f5S, Function2<? super String, ? super EnumC1110950f13, Unit> function22) {
        super(0);
        this.LL = function2;
        this.LLILLJJLI = operationState;
        this.LLILLL = enumC1110950f13;
        this.LLILZ = c1114050f63;
        this.LLILZIL = c1114030f61;
        this.LLILZLL = abstractC1110800f0o;
        this.LLIZ = z;
        this.LLIZLLLIL = c1113680f5S;
        this.LLJ = function22;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        Function2<String, EnumC1110950f13, Unit> function2 = this.LL;
        if (function2 != null) {
            function2.invoke(this.LLILLJJLI.scene, this.LLILLL);
        }
        if (this.LLILZ.LLILLJJLI.LJIIIIZZ > 0) {
            Handler handler = (Handler) this.LLILZIL.LIZJ.getValue();
            final AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o = this.LLILZLL;
            final EnumC1110950f13 enumC1110950f13 = this.LLILLL;
            final C1114030f61 c1114030f61 = this.LLILZIL;
            final C1114050f63 c1114050f63 = this.LLILZ;
            final boolean z = this.LLIZ;
            final C1113680f5S c1113680f5S = this.LLIZLLLIL;
            final Function2<String, EnumC1110950f13, Unit> function22 = this.LLJ;
            final PublicAreaMessageCommon.OperationState operationState = this.LLILLJJLI;
            C786410Ut5.LJLIIL(c1114050f63.LLILLJJLI.LJIIIIZZ, handler, new Runnable() { // from class: X.0f5Q
                public final void LIZ() {
                    abstractC1110800f0o.LJIIIIZZ = new Pair<>(enumC1110950f13, null);
                    C1114030f61 c1114030f612 = c1114030f61;
                    C1114050f63 c1114050f632 = c1114050f63;
                    c1114030f612.LIZLLL(c1114050f632, 1L, z, new AwS22S0600000_17(c1114030f612, (C1114030f61) c1114050f632, (C1114050f63) c1113680f5S, (C1113680f5S) function22, (Function2<? super String, ? super EnumC1110950f13, Unit>) operationState, (PublicAreaMessageCommon.OperationState) enumC1110950f13, (EnumC1110950f13) 1));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TextOperationStateParser@e9ad.parseTextOperationParam$2$2$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TextOperationStateParser@e9ad.parseTextOperationParam$2$2$1$1");
                }
            });
        }
        return Unit.LIZ;
    }
}

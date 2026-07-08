package X;

import com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.10kj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19335510kj implements InterfaceC849390XTt {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final /* synthetic */ void LIZIZ$1(C19335510kj c19335510kj) {
    }

    public static final /* synthetic */ void LIZIZ$2(C19335510kj c19335510kj) {
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
            case 2:
                LIZ$2(this);
                break;
        }
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            case 2:
                LIZIZ$2(this);
                break;
        }
    }

    public static final void LIZ$0(C19335510kj c19335510kj) {
        ((Function0) ((C259800zU) c19335510kj.l0).element).invoke();
    }

    public static final void LIZ$1(C19335510kj c19335510kj) {
        ((AbstractC1908820zlw) c19335510kj.l0).LIZJ((Function2) c19335510kj.l1, true);
    }

    public static final void LIZ$2(C19335510kj c19335510kj) {
        ((AbstractC1908820zlw) c19335510kj.l0).LIZJ((Function2) c19335510kj.l1, true);
    }

    public static final void LIZIZ$0(C19335510kj c19335510kj) {
        ((ChatCheckLoginActivity) c19335510kj.l1).finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19335510kj(Object obj, AbstractC1908820zlw abstractC1908820zlw, Function2<? super Boolean, ? super C0XIR, Unit> function2) {
        this.$t = function2;
        this.l0 = obj;
        this.l1 = abstractC1908820zlw;
    }
}

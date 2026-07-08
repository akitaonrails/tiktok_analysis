package X;

import android.graphics.RectF;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18jz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21369318jz extends C09AY implements Function0<C21369418k0> {
    public final /* synthetic */ TuxTextView LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21369318jz(TuxTextView tuxTextView) {
        super(0);
        this.LL = tuxTextView;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.18k0] */
    @Override // kotlin.jvm.functions.Function0
    public final C21369418k0 invoke() {
        final TuxTextView tuxTextView = this.LL;
        return new Object(tuxTextView) { // from class: X.18k0
            {
                new RectF();
            }
        };
    }
}

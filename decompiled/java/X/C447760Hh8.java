package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Hh8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447760Hh8 {
    public View LIZ;
    public Function1<? super InterfaceC1364105Vn<? super List<StickerItem>>, ? extends Object> LIZIZ;
    public Function1<? super StickerItem, Unit> LIZJ;
    public Function1<? super StickerItem, Unit> LIZLLL;
    public Function0<Unit> LJ;
    public Function0<Unit> LJFF;

    public C447760Hh8(Function1 function1, int i) {
        function1 = (i & 2) != 0 ? null : function1;
        this.LIZ = null;
        this.LIZIZ = function1;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
    }
}

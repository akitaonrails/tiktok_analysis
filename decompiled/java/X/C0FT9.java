package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS234S0000000_5;

/* JADX INFO: renamed from: X.0FT9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FT9 {
    public final Function1<Boolean, Unit> LIZ;
    public final Function1<StickerModel, StickerModel> LIZIZ;
    public final Function1<StickerModel, Unit> LIZJ;
    public final Function1<EnumC1466150oFx, Object> LIZLLL;
    public final Function1<EnumC1466150oFx, List<C0FTJ<StickerModel>>> LJ;
    public final Function1<StickerModel, C0FFE<StickerModel>> LJFF;

    public C0FT9() {
        this(AFwS231S0000000_3.get$arr$(117), AFwS234S0000000_5.get$arr$(396), AFwS234S0000000_5.get$arr$(399), AFwS234S0000000_5.get$arr$(400), AFwS234S0000000_5.get$arr$(401), AFwS234S0000000_5.get$arr$(406));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0FT9(Function1<? super Boolean, Unit> function1, Function1<? super StickerModel, ? extends StickerModel> function12, Function1<? super StickerModel, Unit> function13, Function1<? super EnumC1466150oFx, ? extends Object> function14, Function1<? super EnumC1466150oFx, ? extends List<? extends C0FTJ<? extends StickerModel>>> function15, Function1<? super StickerModel, ? extends C0FFE<? extends StickerModel>> function16) {
        this.LIZ = function1;
        this.LIZIZ = function12;
        this.LIZJ = function13;
        this.LIZLLL = function14;
        this.LJ = function15;
        this.LJFF = function16;
    }
}

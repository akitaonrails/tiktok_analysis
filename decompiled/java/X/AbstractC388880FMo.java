package X;

import android.content.Context;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC388880FMo<T extends StickerModel> {
    public final Context LIZ;
    public final FrameLayout LIZIZ;
    public final FrameLayout LIZJ;
    public final LifecycleOwner LIZLLL;
    public final C0FUH LJ;
    public final C390420FSm LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1270));

    public abstract C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner);

    public C0FEF LIZIZ() {
        return null;
    }

    public abstract StickerModel LIZJ(StickerModel stickerModel, int i);

    public abstract EnumC1466150oFx LIZLLL();

    public void LJFF(EnumC1466150oFx enumC1466150oFx, List<? extends StickerModel> list, String str, Function0<Unit> function0, Function0<Unit> function02) {
    }

    public void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) {
    }

    public RectF LJ(StickerModel stickerModel) {
        return stickerModel.getBaseModel().getVisibleRectWithoutRotation();
    }

    public Integer LJII(int i, int i2) {
        return Integer.valueOf(i);
    }

    public AbstractC388880FMo(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C0FUH c0fuh, C390420FSm c390420FSm) {
        this.LIZ = context;
        this.LIZIZ = frameLayout;
        this.LIZJ = frameLayout2;
        this.LIZLLL = lifecycleOwner;
        this.LJ = c0fuh;
        this.LJFF = c390420FSm;
    }
}

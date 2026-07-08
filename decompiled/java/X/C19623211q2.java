package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11q2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19623211q2 extends AbstractC388880FMo<LocationStickerModel> {
    public final C0FTH LJII;
    public final InterfaceC388760FMc LJIIIIZZ;

    @Override // X.AbstractC388880FMo
    public final void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) {
    }

    @Override // X.AbstractC388880FMo
    public final EnumC1466150oFx LIZLLL() {
        return EnumC1466150oFx.LOCATION;
    }

    @Override // X.AbstractC388880FMo
    public final StickerModel LIZJ(StickerModel stickerModel, int i) {
        LocationStickerModel locationStickerModel = (LocationStickerModel) stickerModel;
        return locationStickerModel.copy(BaseStickerModel.copy$default(locationStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), locationStickerModel.theme, locationStickerModel.poiData, locationStickerModel.clickable, locationStickerModel.textSize, locationStickerModel.isCutOff, locationStickerModel.useCapsuleStyle);
    }

    @Override // X.AbstractC388880FMo
    public final C0FFE<LocationStickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner) {
        LocationStickerModel locationStickerModel = (LocationStickerModel) stickerModel;
        return new C19623311q3(this.LIZ, locationStickerModel.copy(locationStickerModel.baseStickerModel, locationStickerModel.theme, locationStickerModel.poiData, locationStickerModel.clickable, locationStickerModel.textSize, locationStickerModel.isCutOff, locationStickerModel.useCapsuleStyle), this.LIZIZ, this.LJIIIIZZ, c0ffo, lifecycleOwner, this.LJFF);
    }

    public C19623211q2(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C0FUH c0fuh, C390420FSm c390420FSm) {
        super(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
        C0FTH c0fth = (C0FTH) c390420FSm.LIZIZ(C13LE.LIZ(C0FTH.class));
        this.LJII = c0fth;
        this.LJIIIIZZ = (InterfaceC388760FMc) c390420FSm.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class));
        C390790FTx c390790FTxLIZIZ = c0fth.LIZIZ();
        ((ArrayList) c390790FTxLIZIZ.LLJJI).add(new C0FU7() { // from class: X.0FVh
            @Override // X.C0FU7
            public final boolean LIZ(int i, EnumC1466150oFx enumC1466150oFx, int i2) {
                return false;
            }

            @Override // X.C0FU7
            public final EnumC1466150oFx getStickerType() {
                return EnumC1466150oFx.LOCATION;
            }

            @Override // X.C0FU7
            public final List<C0FU6> LIZIZ(int i) {
                C19623211q2 c19623211q2 = this.LIZ;
                c19623211q2.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(c19623211q2.LJII.LIZIZ().LJJJ(3, null, null, null));
                linkedHashSet.add(new C0FU6(7, R.drawable.a_r, c19623211q2.LIZ.getString(2131844798), null, null, 24));
                linkedHashSet.add(new C0FU6(8, R.drawable.a_v, c19623211q2.LIZ.getString(2131844799), null, null, 24));
                return C13LP.LLIIII(linkedHashSet);
            }
        });
    }
}

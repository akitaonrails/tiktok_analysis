package X;

import com.bytedance.android.livesdk.livesetting.rank.TeamRankStickerSetting;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0y9g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846660y9g implements InterfaceC1846720y9m<C1119420fEi> {
    public final C1846630y9d LIZ;
    public final String LIZIZ;

    @Override // X.InterfaceC1846720y9m
    public final void onDestroy() {
    }

    @Override // X.InterfaceC1846720y9m
    public final Pair<Integer, Integer> LIZ() {
        this.LIZ.setText(this.LIZIZ);
        C1846800y9u.LJIIJJI(this.LIZ);
        this.LIZ.setText("");
        return new Pair<>(Integer.valueOf(this.LIZ.getMeasuredWidth()), Integer.valueOf(this.LIZ.getMeasuredHeight()));
    }

    public C1846660y9g(C1091250eVH c1091250eVH) {
        int i;
        this.LIZ = (C1846630y9d) c1091250eVH.findViewById(R.id.c8r);
        if (TeamRankStickerSetting.INSTANCE.getUseNewStyle()) {
            i = 2131855343;
        } else {
            i = 2131855330;
        }
        this.LIZIZ = C497740JfY.LJIJI(i);
    }

    @Override // X.InterfaceC1846720y9m
    public final void LIZIZ(C1119420fEi c1119420fEi) {
        this.LIZ.setText(this.LIZIZ);
    }
}

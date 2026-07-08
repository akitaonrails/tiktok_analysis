package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: renamed from: X.197C, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C197C implements AnonymousClass1963 {
    public final /* synthetic */ ShortVideoContext LIZ;

    public C197C(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
    }

    @Override // X.AnonymousClass1963
    public final void LIZ(boolean z, Effect effect, C196B c196b) {
        String str;
        String str2;
        int i = C196D.LIZ[c196b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else {
                str = "lottie";
            }
        } else {
            str = "gif";
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", this.LIZ.shootWay);
        c0lab.LJ("prop_id", effect.getEffectId());
        c0lab.LJ("enter_from", "EffectStickerViewHolder");
        c0lab.LJ("hint_type", str);
        if (z) {
            str2 = "succeed";
        } else {
            str2 = "failed";
        }
        c0lab.LJ("load_status", str2);
        C2341909Fp.LIZ("load_prop_hint_end", c0lab.LIZ);
    }
}

package X;

import android.graphics.drawable.Drawable;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362110EHp extends AbstractC362130EHr {
    public final Drawable LJFF;
    public final C361980EHc LJI;
    public final C01GW LJII;
    public final C361980EHc LJIIIIZZ;

    public final List<C361980EHc> LIZJ() {
        C361970EHb c361970EHb = new C361970EHb();
        c361970EHb.LIZ = this.LIZ.getString(2131833283);
        c361970EHb.LJI = 1000L;
        c361970EHb.LIZLLL = new AwS549S0100000_5(this, 1450);
        c361970EHb.LIZIZ(this.LJFF, "add_icon_res_id");
        c361970EHb.LJ = "bottom_item_effect_add_effects";
        ArrayList arrayListLJ = C1697810uHb.LJ(c361970EHb.LIZ());
        Keva keva = C350660Dou.LIZ;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_add_anim_sub_menu_in_effect", true, false)) {
            if (!arrayListLJ.isEmpty()) {
                Iterator it2 = arrayListLJ.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(((C361980EHc) it2.next()).LJI, "bottom_item_add_video_animation")) {
                    }
                }
            }
            arrayListLJ.add(this.LJIIIIZZ);
            return arrayListLJ;
        }
        return arrayListLJ;
    }

    public C362110EHp(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, C0E48 c0e48, Drawable drawable, C361980EHc c361980EHc) {
        super(c19eg, videoPublishEditModel, nLEModel, c0e48);
        this.LJFF = drawable;
        this.LJI = c361980EHc;
        this.LJII = C452501pT.LIZIZ(new AwS549S0100000_5(c19eg, 1449));
        C361970EHb c361970EHb = new C361970EHb();
        c361970EHb.LIZ = c19eg.getString(2131833494);
        c361970EHb.LJI = 1000L;
        c361970EHb.LIZLLL = new AwS549S0100000_5(c19eg, 1451);
        c361970EHb.LJ = "bottom_item_add_video_animation";
        this.LJIIIIZZ = c361970EHb.LIZ();
    }
}

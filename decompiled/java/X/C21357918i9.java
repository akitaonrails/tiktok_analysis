package X;

import Y.ARunnableS105S0100000_5;
import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.18i9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21357918i9 {
    public static ArrayList<C1621190sI1> LIZ = new ArrayList<>();
    public static final String LIZIZ = "video_shoot_page_picker";
    public static final String LIZJ = "upload_page";
    public static String LIZLLL = "video_shoot_page_picker";

    public static final void LIZIZ(View view) {
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        view.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(100L).withEndAction(new ARunnableS105S0100000_5(view, 139)).start();
    }

    public static final void LIZJ(ArrayList<C1621190sI1> arrayList) {
        LIZ.clear();
        LIZ = arrayList;
    }

    public static final void LIZ(ArrayList<C1621190sI1> arrayList, Effect effect, C0N6I c0n6i, InterfaceC21358118iB interfaceC21358118iB, InterfaceC21358218iC interfaceC21358218iC, String str) {
        String effect_id;
        String effect_id2;
        String effect_id3;
        String resource_id = null;
        if (c0n6i == C0N6I.VIDEO) {
            if (interfaceC21358118iB != null) {
                if (effect != null) {
                    effect_id3 = effect.getEffect_id();
                    resource_id = effect.getResource_id();
                } else {
                    effect_id3 = null;
                }
                interfaceC21358118iB.LJ(arrayList.size(), effect_id3, resource_id, str, LIZLLL, "video_cnt");
                return;
            }
            if (interfaceC21358218iC == null) {
                return;
            }
            if (effect != null) {
                effect_id2 = effect.getEffect_id();
                resource_id = effect.getResource_id();
            } else {
                effect_id2 = null;
            }
            interfaceC21358218iC.LIZJ(arrayList.size(), effect_id2, resource_id, str, LIZLLL);
            return;
        }
        if (interfaceC21358118iB == null) {
            return;
        }
        if (effect != null) {
            effect_id = effect.getEffect_id();
            resource_id = effect.getResource_id();
        } else {
            effect_id = null;
        }
        interfaceC21358118iB.LJ(arrayList.size(), effect_id, resource_id, str, LIZLLL, "photo_cnt");
    }
}

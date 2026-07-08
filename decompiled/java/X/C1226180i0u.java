package X;

import android.util.ArrayMap;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0i0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226180i0u {
    public final AbstractC1225780i0G LIZ;

    public C1226180i0u(AbstractC1225770i0F abstractC1225770i0F) {
        this.LIZ = abstractC1225770i0F.LJJJJLL();
    }

    public final void LIZ(C1224840hyk c1224840hyk, String str) {
        if (c1224840hyk.LLJILJILJ && c1224840hyk.LLJI.get("item_disable_reason") == EnumC1226150i0r.NO_GROUP_PERMISSION) {
            C0I0B.LJFF.LIZIZ();
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("enter_from", this.LIZ.LJIIIZ().LIZJ());
            arrayMap.put("enter_method", this.LIZ.LJIIIZ().LIZLLL());
            arrayMap.put(Scene.SCENE_SERVICE, str);
            C20684815ws.LJIILLIIL("choose_user_no_group_permission", arrayMap);
        }
    }
}

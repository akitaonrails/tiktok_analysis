package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0RMV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RMV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(BaseContainer baseContainer) {
        int size;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(baseContainer);
        String str = baseContainer.nJ2().eventType;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, str);
        jSONObject.put("type", baseContainer.hp().name());
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
        if (assemSupervisorLJ != null) {
            size = ((ArrayList) assemSupervisorLJ.LIZLLL()).size();
        } else {
            size = 0;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("count", size);
        C793770VBv.LJII("interact_component_load", jSONObject, jSONObject2, null);
    }

    public static void LIZIZ(BaseContainer baseContainer) {
        List<ReusedUIAssem<? extends C03H5>> list = C693480RIc.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (!(obj instanceof BaseCellPlaceHolderComponent)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        String str = baseContainer.nJ2().eventType;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, str);
        jSONObject.put("type", baseContainer.hp().name());
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("count", size);
        C793770VBv.LJII("interact_component_load", jSONObject, jSONObject2, null);
    }
}

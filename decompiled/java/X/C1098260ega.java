package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ega, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1098260ega extends C2217421BqW implements InterfaceC1631630sYr<C1098290egd, Integer, String, Boolean, Unit> {
    public C1098260ega(Object obj) {
        super(4, obj, AbstractC1098240egY.class, "onExpandFailed", "onExpandFailed(Lcom/bytedance/android/livesdk/chatroom/banner/listener/IBannerContainer$EffectNotifyInfo;Ljava/lang/Integer;Ljava/lang/String;Z)V", 0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(C1098290egd c1098290egd, Integer num, String str, Boolean bool) throws JSONException {
        Object string;
        C1098290egd c1098290egd2 = c1098290egd;
        Integer num2 = num;
        String str2 = str;
        boolean zBooleanValue = bool.booleanValue();
        AbstractC1098240egY abstractC1098240egY = (AbstractC1098240egY) this.receiver;
        abstractC1098240egY.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("expand failed: failed_reason = ");
        sbLIZ.append(str2);
        sbLIZ.append(", frequency_controlled_reason = ");
        sbLIZ.append(num2);
        sbLIZ.append(", banner: ");
        sbLIZ.append(c1098290egd2);
        AbstractC1098240egY.LJJ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1105930esx interfaceC1105930esx = abstractC1098240egY.LLJ;
        if (interfaceC1105930esx != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, c1098290egd2.LIZ);
            jSONObject.put("effect_notify_id", c1098290egd2.LIZ);
            jSONObject.put(Scene.SCENE_SERVICE, c1098290egd2.LIZLLL);
            jSONObject.put("biz", c1098290egd2.LIZJ);
            Room room = abstractC1098240egY.LLILZ;
            if (room != null) {
                string = Long.valueOf(room.getId()).toString();
            } else {
                string = null;
            }
            jSONObject.put("room_id", string);
            jSONObject.put("container_id", c1098290egd2.LJFF);
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
            jSONObject.put("is_timely", zBooleanValue ? 1 : 0);
            if (str2 != null) {
                jSONObject.put("faild_reason", str2);
            }
            if (num2 != null) {
                num2.intValue();
                jSONObject.put("frequency_controlled_reason", num2.intValue());
            }
            interfaceC1105930esx.LIZ("banner_lynx_client_expanded", jSONObject);
        }
        return Unit.LIZ;
    }
}

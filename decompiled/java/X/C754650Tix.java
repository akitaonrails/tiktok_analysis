package X;

import Y.AfS181S0100000_12;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.HashTagResp;
import com.bytedance.android.livesdk.dataChannel.GameTagIdListForceUpdate;
import com.bytedance.android.livesdk.hashtag.HashtagApi;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C754650Tix {
    public static final /* synthetic */ int LIZ = 0;

    public static GameTag LIZIZ(EnumC754690Tj1 enumC754690Tj1, List list) {
        Long l;
        Long l2;
        Long l3;
        GameTag gameTag = enumC754690Tj1.getGameTag();
        if (gameTag != null && (l3 = gameTag.id) != null && l3.longValue() == -1) {
            return enumC754690Tj1.getGameTag();
        }
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            GameTag gameTag2 = (GameTag) next;
            if (gameTag2 != null) {
                l = gameTag2.id;
            } else {
                l = null;
            }
            GameTag gameTag3 = enumC754690Tj1.getGameTag();
            if (gameTag3 != null) {
                l2 = gameTag3.id;
            } else {
                l2 = null;
            }
            if (Intrinsics.LJFF(l, l2)) {
                obj = next;
                break;
            }
        }
        return (GameTag) obj;
    }

    public static C11JF LIZ(DataChannel dataChannel, Fragment fragment, Function1 function1, Function0 function0) {
        boolean zLJFF;
        if (dataChannel != null) {
            zLJFF = Intrinsics.LJFF(dataChannel.gg0(GameTagIdListForceUpdate.class), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        String str = null;
        if (!zLJFF) {
            if (dataChannel != null) {
                Object objGg0 = dataChannel.gg0(HashTagResp.class);
                if (objGg0 != null) {
                    function1.invoke(objGg0);
                    return null;
                }
                str = (String) dataChannel.gg0(C754660Tiy.class);
            }
        } else if (dataChannel != null) {
            str = (String) dataChannel.gg0(C754660Tiy.class);
        }
        AwS378S0200000_12 awS378S0200000_12 = new AwS378S0200000_12(dataChannel, function1, 68);
        C480460Ism.LIZ().getClass();
        return (C11JF) ((HashtagApi) C480460Ism.LIZLLL(HashtagApi.class)).fetchHashtagList(str).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(fragment)).LJJLL(new AfS181S0100000_12(awS378S0200000_12, 172), new C516201zk(function0, 169));
    }
}

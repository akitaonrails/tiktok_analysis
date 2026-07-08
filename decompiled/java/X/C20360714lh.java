package X;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14lh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20360714lh extends AbstractC20358714lN {
    public final List<String> LJ;

    public C20360714lh(DataChannel dataChannel, WeakReference<Context> weakReference) {
        super(dataChannel, null, weakReference);
        this.LJ = Collections.singletonList("type");
    }

    public final void LJFF(String str, Uri uri, LifecycleOwner lifecycleOwner) {
        boolean zLJFF;
        String strJ3;
        String strLIZIZ = C1942307jB.LIZIZ(uri, "from");
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        String strLIZIZ2 = C1942307jB.LIZIZ(uri, "is_activity");
        if (strLIZIZ2 != null) {
            zLJFF = Intrinsics.LJFF(strLIZIZ2, "1");
        } else {
            zLJFF = true;
        }
        PlayRule playRuleLIZIZ = LIZIZ(-1L, str, "schema", strLIZIZ);
        if (playRuleLIZIZ == null) {
            return;
        }
        List<String> list = this.LJ;
        JSONObject jSONObject = new JSONObject();
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            if (!list.contains(str2)) {
                String strLIZIZ3 = C1942307jB.LIZIZ(uri, str2);
                if (strLIZIZ3 == null) {
                    strLIZIZ3 = "";
                }
                jSONObject.put(str2, strLIZIZ3);
            }
        }
        if (jSONObject.length() == 0) {
            strJ3 = "";
        } else {
            strJ3 = C786410Ut5.J3(jSONObject);
        }
        C20361214lm c20361214lm = new C20361214lm(str, strJ3, -1L, playRuleLIZIZ.LIZLLL(new C20424814w2(-1L, false, playRuleLIZIZ.getConfig().LIZ, "", new ArrayList(), playRuleLIZIZ.getConfig().LIZIZ, playRuleLIZIZ.getConfig().LIZJ, "", ""), ""), playRuleLIZIZ);
        C20441214yg.LIZIZ("PlaybookScheme", "openEntityFromScheme: " + playRuleLIZIZ + " playbookTask:" + c20361214lm.hashCode());
        if (!zLJFF) {
            strLIZIZ = "";
        }
        playRuleLIZIZ.LJJ(c20361214lm, null, lifecycleOwner, "entity_schema", null, strLIZIZ, "scheme");
    }

    @Override // X.AbstractC20358714lN
    public final PlayRule LIZIZ(long j, String str, String str2, String str3) {
        PlayRule playRuleLIZIZ = super.LIZIZ(j, str, str2, str3);
        if (playRuleLIZIZ != null) {
            playRuleLIZIZ.LJIILIIL(str3);
        }
        return playRuleLIZIZ;
    }
}

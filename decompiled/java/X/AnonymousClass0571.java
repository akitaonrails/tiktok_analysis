package X;

import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencySceneConfig;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.0571, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0571 {
    public static final Type LIZLLL = new TypeToken<List<? extends FrequencySceneConfig>>() { // from class: X.0575
    }.getType();
    public final String LIZ;
    public final Gson LIZIZ = new Gson();
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1129));

    public final Keva LIZ() {
        return (Keva) this.LIZJ.getValue();
    }

    public AnonymousClass0571(String str) {
        this.LIZ = str;
    }
}

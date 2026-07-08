package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS154S1100000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376970EqF implements C0EMH {
    public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(Function0 function0) {
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "EditorProUsedFuncChecker", (String) function0.invoke());
    }

    @Override // X.C0EMH
    public final String LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(videoPublishEditModel, 99);
        Object objInvoke = this.LIZ.get("getUsedFunctions");
        if (objInvoke == null) {
            objInvoke = awS549S0100000_5.invoke();
            if (objInvoke != null) {
                this.LIZ.put("getUsedFunctions", objInvoke);
            }
            LIZ(new AwS154S1100000_5(objInvoke, 1));
        } else {
            LIZ(new AwS154S1100000_5(objInvoke, 0));
        }
        return (String) objInvoke;
    }
}

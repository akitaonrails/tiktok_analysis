package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0XPc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C848180XPc implements InterfaceC21427918tR {
    public final Pattern LIZ;

    public C848180XPc() {
        Pattern pattern = C0XOY.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(https?:\\/\\/)?");
        sbLIZ.append('(');
        sbLIZ.append("[a-zA-Z@]+(\\.[-\\da-zA-Z@:]+)*\\.([a-zA-Z]{2,6})");
        sbLIZ.append('|');
        sbLIZ.append(pattern);
        sbLIZ.append(')');
        sbLIZ.append("(:\\d+)?");
        sbLIZ.append("(\\/[\\da-zA-Z-%\\$.~:_()+!]*)*");
        sbLIZ.append("(\\?[\\da-zA-Z-@%.&()=+!{}|;^_]*)?");
        sbLIZ.append("(#[\\da-zA-Z-@%.&()=+!{}|;^_]*)?");
        this.LIZ = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ));
    }
}

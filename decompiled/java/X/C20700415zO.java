package X;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15zO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20700415zO extends C09AY implements Function0<Set<String>> {
    public C20700415zO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<String> invoke() {
        String[] stringArray = C20700315zN.LIZ.getStringArray("key_has_shown_edit_dnt_lang_code", new String[0]);
        if (stringArray != null) {
            return C13LQ.LJLIIIL(stringArray);
        }
        return null;
    }
}

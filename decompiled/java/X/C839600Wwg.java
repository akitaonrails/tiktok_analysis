package X;

import com.orbu.core.TTKOrbu;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wwg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839600Wwg extends C09AY implements Function0<String> {
    public C839600Wwg() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return TTKOrbu.INSTANCE.getCurOrbuState();
    }
}

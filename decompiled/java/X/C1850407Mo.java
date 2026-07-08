package X;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07Mo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1850407Mo extends C09AY implements Function0<Boolean> {
    public C1850407Mo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((Set) C08OD.LIZ.getValue()).contains("config.armeabi_v7a"));
    }
}

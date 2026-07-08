package X;

import java.util.Random;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19gL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21601519gL extends C09AY implements Function0<Boolean> {
    public C21601519gL() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(new Random().nextFloat() < 0.05f);
    }
}

package X;

import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0SIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719140SIu extends C09AY implements Function0<Regex> {
    public C719140SIu() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Regex invoke() {
        return new Regex("(#\\S+)|[\\p{So}\\uFE00-\\uFE0F\\p{Cf}]+");
    }
}

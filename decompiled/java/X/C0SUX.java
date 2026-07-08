package X;

import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0SUX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SUX extends C09AY implements Function0<Regex> {
    public C0SUX() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Regex invoke() {
        return new Regex("(#\\S+)|(\\p{So}*)");
    }
}

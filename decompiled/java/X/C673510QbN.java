package X;

import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QbN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673510QbN {
    public final boolean LIZ;
    public final long LIZIZ;
    public final SuggestWordResponse LIZJ;
    public final TemplateData LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C673510QbN)) {
            return false;
        }
        C673510QbN c673510QbN = (C673510QbN) obj;
        return this.LIZ == c673510QbN.LIZ && this.LIZIZ == c673510QbN.LIZIZ && Intrinsics.LJFF(this.LIZJ, c673510QbN.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c673510QbN.LIZLLL);
    }

    public C673510QbN(boolean z, long j, SuggestWordResponse suggestWordResponse, TemplateData templateData) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = suggestWordResponse;
        this.LIZLLL = templateData;
    }
}

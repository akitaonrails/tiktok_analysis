package X;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;

/* JADX INFO: renamed from: X.0XJM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XJM implements MatchResult {
    public final Matcher LIZ;
    public final CharSequence LIZIZ;
    public final C13EA LIZJ = new C13EA(this);
    public C19974613Dk LIZLLL;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.13Dk] */
    @Override // kotlin.text.MatchResult
    public final List<String> LIZ() {
        if (this.LIZLLL == null) {
            this.LIZLLL = new AbstractC19974313Dh<String>() { // from class: X.13Dk
                @Override // X.AbstractC2253808sK
                public final int LIZJ() {
                    return this.LLILLJJLI.LIZ.groupCount() + 1;
                }

                @Override // X.AbstractC2253808sK, java.util.Collection
                public final /* bridge */ boolean contains(Object obj) {
                    if (!(obj instanceof String)) {
                        return false;
                    }
                    return super.contains(obj);
                }

                @Override // X.AbstractC19974313Dh, java.util.List
                public final Object get(int i) {
                    String strGroup = this.LLILLJJLI.LIZ.group(i);
                    if (strGroup == null) {
                        return "";
                    }
                    return strGroup;
                }

                @Override // X.AbstractC19974313Dh, java.util.List
                public final /* bridge */ int indexOf(Object obj) {
                    if (!(obj instanceof String)) {
                        return -1;
                    }
                    return super.indexOf(obj);
                }

                @Override // X.AbstractC19974313Dh, java.util.List
                public final /* bridge */ int lastIndexOf(Object obj) {
                    if (!(obj instanceof String)) {
                        return -1;
                    }
                    return super.lastIndexOf(obj);
                }
            };
        }
        return this.LIZLLL;
    }

    @Override // kotlin.text.MatchResult
    public final IntRange LIZIZ() {
        Matcher matcher = this.LIZ;
        return C13LZ.LJIILJJIL(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final C0XJK LIZJ() {
        return new C0XJK(this);
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        return this.LIZ.group();
    }

    @Override // kotlin.text.MatchResult
    public final C0XJM next() {
        int iEnd = this.LIZ.end() + (this.LIZ.end() == this.LIZ.start() ? 1 : 0);
        if (iEnd > this.LIZIZ.length()) {
            return null;
        }
        Matcher matcher = this.LIZ.pattern().matcher(this.LIZIZ);
        CharSequence charSequence = this.LIZIZ;
        if (matcher.find(iEnd)) {
            return new C0XJM(matcher, charSequence);
        }
        return null;
    }

    @Override // kotlin.text.MatchResult
    public final C13EA getGroups() {
        return this.LIZJ;
    }

    public C0XJM(Matcher matcher, CharSequence charSequence) {
        this.LIZ = matcher;
        this.LIZIZ = charSequence;
    }
}

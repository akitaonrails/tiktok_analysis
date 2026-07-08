package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.CharacterIterator;

/* JADX INFO: renamed from: X.0uDU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695260uDU implements CharacterIterator {
    public final CharSequence LL;
    public final int LLILLL;
    public final int LLILLJJLI = 0;
    public int LLILZ = 0;

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.LLILZ;
        if (i == this.LLILLL) {
            return (char) 65535;
        }
        return this.LL.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.LLILZ = this.LLILLJJLI;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.LLILLJJLI;
        int i2 = this.LLILLL;
        if (i == i2) {
            this.LLILZ = i2;
            return (char) 65535;
        }
        int i3 = i2 - 1;
        this.LLILZ = i3;
        return this.LL.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.LLILZ + 1;
        this.LLILZ = i;
        int i2 = this.LLILLL;
        if (i < i2) {
            return this.LL.charAt(i);
        }
        this.LLILZ = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.LLILZ;
        if (i <= this.LLILLJJLI) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.LLILZ = i2;
        return this.LL.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.LLILLJJLI;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.LLILLL;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.LLILZ;
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        int i2 = this.LLILLJJLI;
        if (i <= this.LLILLL && i2 <= i) {
            this.LLILZ = i;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }

    public C1695260uDU(int i, CharSequence charSequence) {
        this.LL = charSequence;
        this.LLILLL = i;
    }
}

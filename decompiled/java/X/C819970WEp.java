package X;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: X.0WEp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819970WEp implements C0WF7 {
    public final int LJJI;
    public final EnumC820020WEu LJJIFFI;

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.LJJI + "intEncoding=" + this.LJJIFFI + ')';
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.LJJI) + (this.LJJIFFI.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return C0WF7.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0WF7)) {
            return false;
        }
        C0WF7 c0wf7 = (C0WF7) obj;
        if (this.LJJI == ((C819970WEp) c0wf7).LJJI && this.LJJIFFI.equals(((C819970WEp) c0wf7).LJJIFFI)) {
            return true;
        }
        return false;
    }

    public C819970WEp(int i, EnumC820020WEu enumC820020WEu) {
        this.LJJI = i;
        this.LJJIFFI = enumC820020WEu;
    }
}

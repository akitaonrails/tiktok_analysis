package X;

/* JADX INFO: renamed from: X.03mo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C945603mo extends AbstractC946103mt {
    public final int LIZ = 32767;

    public final C138400fu LIZ(Object obj) {
        CharSequence string = (CharSequence) obj;
        int length = string.length();
        int i = this.LIZ;
        if (length > i) {
            string = string.subSequence(0, i).toString();
        }
        return new C138400fu(string);
    }
}

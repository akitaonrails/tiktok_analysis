package X;

/* JADX INFO: renamed from: X.0YEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870870YEj implements InterfaceC866880Xza {
    public final C0YEM LL;

    public C870870YEj(C0YEM c0yem) {
        this.LL = c0yem;
    }

    @Override // X.InterfaceC866880Xza
    public final boolean LLJZIJLIL(boolean z, String str, C869590Y9l c869590Y9l, long j) {
        long index;
        long jLIZIZ = C2124408Ty.LIZIZ(this.LL.getUid(), str);
        if (str == null) {
            this.LL.LIZLLL().LJIIIIZZ("ValidConversationChecker", "conversationId is null", null);
            return false;
        }
        if (c869590Y9l == null && this.LL.LJIIIZ().LJJJZ) {
            C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("convId = ");
            sbLIZ.append(str);
            sbLIZ.append(" lastShowMessage is null");
            c868780Y6iLIZLLL.LJIIIIZZ("ValidConversationChecker", C2188811AlT.LIZIZ(sbLIZ), null);
            return false;
        }
        if (c869590Y9l != null) {
            index = c869590Y9l.getIndex();
        } else {
            index = 0;
        }
        if (index <= j) {
            C868780Y6i c868780Y6iLIZLLL2 = this.LL.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("convId = ");
            sbLIZ2.append(str);
            sbLIZ2.append(" lastShowMessage index is less than minIndex");
            c868780Y6iLIZLLL2.LJIIIIZZ("ValidConversationChecker", C2188811AlT.LIZIZ(sbLIZ2), null);
            return false;
        }
        if (this.LL.LJIIIZ().LJJJIL != null && C04PS.LIZ.LIZ(str)) {
            return false;
        }
        if (!z && jLIZIZ <= 0) {
            C868780Y6i c868780Y6iLIZLLL3 = this.LL.LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("convId = ");
            sbLIZ3.append(str);
            sbLIZ3.append(" toUserId is invalid");
            c868780Y6iLIZLLL3.LJIIIIZZ("ValidConversationChecker", C2188811AlT.LIZIZ(sbLIZ3), null);
            return false;
        }
        return true;
    }
}

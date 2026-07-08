package X;

/* JADX INFO: renamed from: X.0hY9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208350hY9 {
    public final EnumC1216870hlt LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromptModel(uiType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enabled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        return this.LIZLLL || this.LIZ == EnumC1216870hlt.Dialog;
    }

    public C1208350hY9(EnumC1216870hlt enumC1216870hlt, String str, String str2, boolean z) {
        this.LIZ = enumC1216870hlt;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
    }
}

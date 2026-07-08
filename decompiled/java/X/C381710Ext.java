package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ext, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381710Ext {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;

    public C381710Ext() {
        this(0, "", "", "", CardStruct.IStatusCode.DEFAULT, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C381710Ext)) {
            return false;
        }
        C381710Ext c381710Ext = (C381710Ext) obj;
        return this.LIZ == c381710Ext.LIZ && Intrinsics.LJFF(this.LIZIZ, c381710Ext.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c381710Ext.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c381710Ext.LIZLLL) && Intrinsics.LJFF(this.LJ, c381710Ext.LJ) && this.LJFF == c381710Ext.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenAIStylizedAiStage(stageIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reqKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reqJson=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", promptText=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", effectId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", outputCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C381710Ext LIZ(C381710Ext c381710Ext, String str, int i) {
        int i2;
        String str2;
        String str3;
        String str4 = str;
        int i3 = 0;
        if ((i & 1) != 0) {
            i2 = c381710Ext.LIZ;
        } else {
            i2 = 0;
        }
        String str5 = null;
        if ((i & 2) != 0) {
            str2 = c381710Ext.LIZIZ;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = c381710Ext.LIZJ;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = c381710Ext.LIZLLL;
        }
        if ((i & 16) != 0) {
            str5 = c381710Ext.LJ;
        }
        if ((i & 32) != 0) {
            i3 = c381710Ext.LJFF;
        }
        c381710Ext.getClass();
        return new C381710Ext(i2, str2, str3, str4, str5, i3);
    }

    public C381710Ext(int i, String str, String str2, String str3, String str4, int i2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = i2;
    }
}

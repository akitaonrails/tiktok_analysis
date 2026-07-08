package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SVN, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SVN implements IEvent {
    public final Intent LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final ArrayList<CommentImageModel> LIZLLL;
    public final String LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SVN)) {
            return false;
        }
        C0SVN c0svn = (C0SVN) obj;
        return Intrinsics.LJFF(this.LIZ, c0svn.LIZ) && this.LIZIZ == c0svn.LIZIZ && this.LIZJ == c0svn.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0svn.LIZLLL) && Intrinsics.LJFF(this.LJ, c0svn.LJ) && this.LJFF == c0svn.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentInnerChoosePhotoEvent(intent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requestCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", resultCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", outPage=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", panelSessionCode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0SVN(Intent intent, int i, int i2, ArrayList<CommentImageModel> arrayList, String str, int i3) {
        this.LIZ = intent;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = arrayList;
        this.LJ = str;
        this.LJFF = i3;
    }
}

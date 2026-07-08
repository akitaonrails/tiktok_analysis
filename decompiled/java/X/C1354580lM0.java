package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lM0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354580lM0 {
    public final Aweme LIZ;
    public final Comment LIZIZ;
    public final Context LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Function1<? super C0ML2, Unit> LJFF;
    public Bitmap LJI;
    public final boolean LJII;

    public C1354580lM0(Aweme aweme, Comment comment, Context context, String str, String str2, int i) {
        boolean z;
        if ((i & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = aweme;
        this.LIZIZ = comment;
        this.LIZJ = context;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = z;
    }
}

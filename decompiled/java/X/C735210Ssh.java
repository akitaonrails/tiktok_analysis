package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0Ssh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735210Ssh {
    public final Aweme LIZ;
    public final Context LIZIZ;
    public final Activity LIZJ;
    public final Fragment LIZLLL;
    public final C2189821An6 LJ;
    public final boolean LJFF;
    public final EnumC1259080iry LJI;
    public final List<UrlModel> LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;

    public /* synthetic */ C735210Ssh(Aweme aweme, Context context, Activity activity, Fragment fragment, C2189821An6 c2189821An6, boolean z, EnumC1259080iry enumC1259080iry, boolean z2, int i) {
        this(aweme, context, activity, fragment, c2189821An6, z, enumC1259080iry, null, z2, null, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C735210Ssh(Aweme aweme, Context context, Activity activity, Fragment fragment, C2189821An6 c2189821An6, boolean z, EnumC1259080iry enumC1259080iry, List<? extends UrlModel> list, boolean z2, String str, int i) {
        this.LIZ = aweme;
        this.LIZIZ = context;
        this.LIZJ = activity;
        this.LIZLLL = fragment;
        this.LJ = c2189821An6;
        this.LJFF = z;
        this.LJI = enumC1259080iry;
        this.LJII = list;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = str;
        this.LJIIJ = i;
    }
}

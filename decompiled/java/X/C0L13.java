package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0L13, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L13 extends C0L17<Intent> {
    public final C19EG LIZ;
    public final ShortVideoContext LIZIZ;
    public final ArrayList<MediaModel> LIZJ;
    public final boolean LIZLLL;
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;
    public final C1DRG LJI;
    public final Long LJII;
    public final boolean LJIIIIZZ;

    public C0L13(C19EG c19eg, ShortVideoContext shortVideoContext, ArrayList arrayList, boolean z, Function0 function0, Function0 function02, C1DRG c1drg, Long l, boolean z2) {
        this.LIZ = c19eg;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = arrayList;
        this.LIZLLL = z;
        this.LJ = function0;
        this.LJFF = function02;
        this.LJI = c1drg;
        this.LJII = l;
        this.LJIIIIZZ = z2;
    }

    public /* synthetic */ C0L13(C19EG c19eg, ShortVideoContext shortVideoContext, ArrayList arrayList, boolean z, Function0 function0, Function0 function02, C1DRG c1drg, Long l, boolean z2, int i) {
        this(c19eg, shortVideoContext, arrayList, z, function0, function02, (i & 64) != 0 ? null : c1drg, (i & 128) == 0 ? l : null, (i & 256) != 0 ? false : z2);
    }
}

package X;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.08QE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08QE implements Sequence<File> {
    public final File LIZ;
    public final FileWalkDirection LIZIZ;
    public final Function1<File, Boolean> LIZJ;
    public final Function1<File, Unit> LIZLLL;
    public final Function2<File, IOException, Unit> LJ;
    public final int LJFF;

    public final C08QE LIZJ() {
        return new C08QE(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, 1);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<File> iterator() {
        return new C08QK(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C08QE(File file, FileWalkDirection fileWalkDirection, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function12, Function2<? super File, ? super IOException, Unit> function2, int i) {
        this.LIZ = file;
        this.LIZIZ = fileWalkDirection;
        this.LIZJ = function1;
        this.LIZLLL = function12;
        this.LJ = function2;
        this.LJFF = i;
    }

    public /* synthetic */ C08QE(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function12, function2, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }
}

package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0EPV, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EPV {
    public final InterfaceC1446740nke LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final LiveData<C364270EPx> LIZJ;
    public AbstractC364180EPo LIZLLL;
    public final InterfaceC1452170ntP LJ;
    public ProgressDialogC1397790mTh LJFF;
    public int LJI;
    public Function0<Unit> LJII;

    public C0EPV(InterfaceC1446740nke interfaceC1446740nke, VideoPublishEditModel videoPublishEditModel, MutableLiveData mutableLiveData) {
        this.LIZ = interfaceC1446740nke;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = mutableLiveData;
        this.LJ = interfaceC1446740nke.g().getValue();
    }
}

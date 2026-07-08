package X;

import android.graphics.Typeface;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11ks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19591211ks {
    public final EnumC19589411ka LIZ;
    public final FrameLayout LIZIZ;
    public final C19592311l3 LIZJ;
    public final C19EG LIZLLL;
    public final C1866270yfJ LJ;
    public final C705930RmZ LJFF;
    public final Function0<Long> LJI;
    public final Function0<Long> LJII;
    public final Function1<String, Typeface> LJIIIIZZ;
    public final Function1<String, Typeface> LJIIIZ;
    public final boolean LJIIJ;
    public final LifecycleOwner LJIIJJI;
    public final MutableLiveData<Integer> LJIIL;
    public final MutableLiveData<Boolean> LJIILIIL;

    public C19591211ks(EnumC19589411ka enumC19589411ka, FrameLayout frameLayout, C19592311l3 c19592311l3, C19EG c19eg, C1866270yfJ c1866270yfJ, C705930RmZ c705930RmZ, Function0 function0, Function0 function02, Function1 function1, Function1 function12, boolean z, LifecycleOwner lifecycleOwner, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, int i) {
        MutableLiveData mutableLiveData3 = mutableLiveData;
        c1866270yfJ = (i & 16) != 0 ? null : c1866270yfJ;
        c705930RmZ = (i & 32) != 0 ? null : c705930RmZ;
        function0 = (i & 64) != 0 ? null : function0;
        function02 = (i & 128) != 0 ? null : function02;
        function1 = (i & 256) != 0 ? null : function1;
        function12 = (i & 512) != 0 ? null : function12;
        z = (i & 1024) != 0 ? false : z;
        mutableLiveData3 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : mutableLiveData3;
        MutableLiveData mutableLiveData4 = (i & 8192) == 0 ? mutableLiveData2 : null;
        this.LIZ = enumC19589411ka;
        this.LIZIZ = frameLayout;
        this.LIZJ = c19592311l3;
        this.LIZLLL = c19eg;
        this.LJ = c1866270yfJ;
        this.LJFF = c705930RmZ;
        this.LJI = function0;
        this.LJII = function02;
        this.LJIIIIZZ = function1;
        this.LJIIIZ = function12;
        this.LJIIJ = z;
        this.LJIIJJI = lifecycleOwner;
        this.LJIIL = mutableLiveData3;
        this.LJIILIIL = mutableLiveData4;
    }
}

package X;

import android.graphics.Bitmap;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0nQG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434100nQG {
    public final HashMap<String, Integer> LIZ = new HashMap<>();
    public final MutableLiveData<Integer> LIZIZ = new MutableLiveData<>();
    public final MutableLiveData<C443120HZe<Integer, Integer, Float>> LIZJ;
    public final MutableLiveData LIZLLL;
    public final MutableLiveData<Integer> LJ;
    public final MutableLiveData<Bitmap> LJFF;
    public final MutableLiveData<Bitmap> LJI;
    public final MutableLiveData<Bitmap> LJII;
    public final MutableLiveData<String> LJIIIIZZ;
    public final MutableLiveData<BaseShortVideoContext> LJIIIZ;

    public C1434100nQG() {
        MutableLiveData<C443120HZe<Integer, Integer, Float>> mutableLiveData = new MutableLiveData<>();
        this.LIZJ = mutableLiveData;
        this.LIZLLL = mutableLiveData;
        this.LJ = new MutableLiveData<>();
        this.LJFF = new MutableLiveData<>();
        this.LJI = new MutableLiveData<>();
        this.LJII = new MutableLiveData<>();
        this.LJIIIIZZ = new MutableLiveData<>();
        this.LJIIIZ = new MutableLiveData<>();
    }

    public final void LIZ(Bitmap bitmap) {
        this.LJFF.setValue(bitmap);
    }

    public final void LIZIZ(int i) {
        this.LIZIZ.setValue(Integer.valueOf(i));
    }

    public final void LIZJ(Bitmap bitmap) {
        this.LJI.setValue(bitmap);
    }

    public final void LIZLLL(Bitmap bitmap) {
        this.LJII.setValue(bitmap);
    }
}

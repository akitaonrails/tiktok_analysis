package X;

import android.graphics.Bitmap;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.av.video.ReplayLiveData;
import dmt.av.video.StoredLiveData;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.11fb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public interface InterfaceC19558511fb {
    LiveData<C1452720nuI> G9();

    MutableLiveData<C1453160nv0> LIZ();

    LiveData<InterfaceC1452170ntP> LIZIZ();

    void LIZJ();

    ReplayLiveData<C0EYM> LIZLLL();

    void LJ(VEVolumeChangeOp vEVolumeChangeOp);

    MutableLiveData<C1452730nuJ> LJFF();

    AbstractC214814194y LJI();

    StoredLiveData<C1452720nuI> LJII();

    LiveData<Boolean> LJIIIIZZ();

    MutableLiveData<Boolean> LJIIIZ();

    VideoPublishEditModel LJJJLIIL();

    MutableLiveData<Boolean> Ps();

    ArrayList<EffectPointModel> dt();

    MutableLiveData<Bitmap> lk();
}

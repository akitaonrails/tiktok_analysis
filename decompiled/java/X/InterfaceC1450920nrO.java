package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0nrO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1450920nrO extends C05YF {
    void BN1();

    void Bi();

    void EX();

    void G41(boolean z);

    void G60();

    void GN0();

    void Gk2(Function0<Unit> function0);

    String Gq();

    void Iq1();

    void Mj();

    C1462070o9N N51();

    void NH0(boolean z);

    SingleImageData OR1();

    void Pk0(Function0<Unit> function0);

    void Rw0(boolean z);

    void S51(Rect rect, Function0<Unit> function0);

    void SD1(boolean z);

    void SX1(C1450990nrV c1450990nrV);

    void T22(boolean z, Function0<Unit> function0);

    void Tp1(float f, float f2);

    <T> T V51(Class<T> cls);

    void aL1(boolean z);

    LivePhotoPreviewMode cm();

    void d72(boolean z, Bitmap bitmap);

    void di();

    /* JADX INFO: renamed from: do, reason: not valid java name */
    LivePhotoPreviewMode mo50do();

    void f92(FilterBean filterBean, boolean z);

    AbstractC19484711Kz<Unit> fb(int i);

    void fz2();

    void gx();

    <T extends Scene> T hz2(String str);

    Rect iK0(boolean z, float f);

    void jr2();

    void lG1();

    void pH1();

    void qB0();

    void qz(String str, NLEModel nLEModel);

    void v8();

    View wd1();

    C1836880xtu wf2();

    View x72();

    void yU();

    LiveData<Unit> yX();

    void ya1(boolean z);

    void zO0();
}
